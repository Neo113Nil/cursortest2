package org.chromium.net.urlconnection;

import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes8.dex */
final class CronetFixedModeOutputStream extends CronetOutputStream {
    private static int sDefaultBufferLength = 16384;
    private final ByteBuffer mBuffer;
    private long mBytesWritten;
    private final long mContentLength;
    private final MessageLoop mMessageLoop;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl(this, 0);

    public class UploadDataProviderImpl extends UploadDataProvider {
        public /* synthetic */ UploadDataProviderImpl(CronetFixedModeOutputStream cronetFixedModeOutputStream, int i) {
            this();
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return CronetFixedModeOutputStream.this.mContentLength;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetFixedModeOutputStream.UploadDataProviderImpl#read");
            try {
                if (byteBuffer.remaining() >= CronetFixedModeOutputStream.this.mBuffer.remaining()) {
                    byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                    uploadDataSink.onReadSucceeded(false);
                    CronetFixedModeOutputStream.this.mMessageLoop.quit();
                } else {
                    int limit = CronetFixedModeOutputStream.this.mBuffer.limit();
                    byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                    uploadDataSink.onReadSucceeded(false);
                }
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        private UploadDataProviderImpl() {
        }
    }

    public CronetFixedModeOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j, MessageLoop messageLoop) {
        Objects.requireNonNull(cronetHttpURLConnection);
        if (j < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.mContentLength = j;
        this.mBuffer = ByteBuffer.allocate((int) Math.min(j, sDefaultBufferLength));
        this.mMessageLoop = messageLoop;
        this.mBytesWritten = 0L;
    }

    private void checkNotExceedContentLength(int i) throws ProtocolException {
        if (this.mBytesWritten + i <= this.mContentLength) {
            return;
        }
        throw new ProtocolException("expected " + (this.mContentLength - this.mBytesWritten) + " bytes but received " + i);
    }

    private void ensureBufferHasRemaining() throws IOException {
        if (this.mBuffer.hasRemaining()) {
            return;
        }
        uploadBufferInternal();
    }

    public static void setDefaultBufferLengthForTesting(int i) {
        sDefaultBufferLength = i;
    }

    private void uploadBufferInternal() throws IOException {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetFixedModeOutputStream#uploadBufferInternal");
        try {
            checkNotClosed();
            this.mMessageLoop.loop();
            checkNoException();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void uploadIfComplete() throws IOException {
        if (this.mBytesWritten == this.mContentLength) {
            uploadBufferInternal();
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() throws IOException {
        if (this.mBytesWritten < this.mContentLength) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public boolean connectRequested() throws IOException {
        return true;
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkNotClosed();
        checkNotExceedContentLength(1);
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i);
        this.mBytesWritten++;
        uploadIfComplete();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkNotClosed();
        if (bArr.length - i >= i2 && i >= 0 && i2 >= 0) {
            checkNotExceedContentLength(i2);
            int i3 = i2;
            while (i3 > 0) {
                ensureBufferHasRemaining();
                int min = Math.min(i3, this.mBuffer.remaining());
                this.mBuffer.put(bArr, (i + i2) - i3, min);
                i3 -= min;
            }
            this.mBytesWritten += i2;
            uploadIfComplete();
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
