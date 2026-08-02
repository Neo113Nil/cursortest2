package org.chromium.net.urlconnection;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import xsna.tgw;

/* loaded from: classes8.dex */
final class CronetBufferedOutputStream extends CronetOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_BUFFER_SIZE = 16384;
    private ByteBuffer mBuffer;
    private boolean mConnectRequested;
    private boolean mConnected;
    private final CronetHttpURLConnection mConnection;
    private final int mInitialContentLength;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl(this, 0);

    public class UploadDataProviderImpl extends UploadDataProvider {
        public /* synthetic */ UploadDataProviderImpl(CronetBufferedOutputStream cronetBufferedOutputStream, int i) {
            this();
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return CronetBufferedOutputStream.this.mInitialContentLength == -1 ? CronetBufferedOutputStream.this.mConnected ? CronetBufferedOutputStream.this.mBuffer.limit() : CronetBufferedOutputStream.this.mBuffer.position() : CronetBufferedOutputStream.this.mInitialContentLength;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBufferedOutputStream.UploadDataProviderImpl#read");
            try {
                int remaining = byteBuffer.remaining();
                if (remaining < CronetBufferedOutputStream.this.mBuffer.remaining()) {
                    byteBuffer.put(CronetBufferedOutputStream.this.mBuffer.array(), CronetBufferedOutputStream.this.mBuffer.position(), remaining);
                } else {
                    byteBuffer.put(CronetBufferedOutputStream.this.mBuffer);
                }
                uploadDataSink.onReadSucceeded(false);
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
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBufferedOutputStream.UploadDataProviderImpl#rewind");
            try {
                uploadDataSink.onRewindSucceeded();
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

        private UploadDataProviderImpl() {
        }
    }

    public CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        Objects.requireNonNull(cronetHttpURLConnection, "Argument connection cannot be null.");
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Content length < 0.");
        }
        this.mConnection = cronetHttpURLConnection;
        int i = (int) j;
        this.mInitialContentLength = i;
        this.mBuffer = ByteBuffer.allocate(i);
    }

    private void ensureCanWrite(int i) throws IOException {
        if (this.mInitialContentLength != -1 && this.mBuffer.position() + i > this.mInitialContentLength) {
            throw new ProtocolException(tgw.b(this.mInitialContentLength, "exceeded content-length limit of ", " bytes"));
        }
        if (this.mInitialContentLength == -1 && this.mBuffer.limit() - this.mBuffer.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.mBuffer.capacity() * 2, this.mBuffer.capacity() + i));
            allocate.put(this.mBuffer);
            this.mBuffer = allocate;
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.mConnectRequested) {
            this.mConnection.connect();
            this.mConnectRequested = false;
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public boolean connectRequested() throws IOException {
        if (!isClosed()) {
            this.mConnectRequested = true;
            return false;
        }
        this.mConnected = true;
        if (this.mBuffer.position() < this.mInitialContentLength) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        return true;
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkNotClosed();
        ensureCanWrite(1);
        this.mBuffer.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkNotClosed();
        ensureCanWrite(i2);
        this.mBuffer.put(bArr, i, i2);
    }

    public CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        Objects.requireNonNull(cronetHttpURLConnection);
        this.mConnection = cronetHttpURLConnection;
        this.mInitialContentLength = -1;
        this.mBuffer = ByteBuffer.allocate(INITIAL_BUFFER_SIZE);
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() throws IOException {
    }
}
