package org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes8.dex */
abstract class CronetOutputStream extends OutputStream {
    private boolean mClosed;
    private IOException mException;
    private boolean mRequestCompleted;

    public void checkNoException() throws IOException {
        IOException iOException = this.mException;
        if (iOException != null) {
            throw iOException;
        }
    }

    public void checkNotClosed() throws IOException {
        if (this.mRequestCompleted) {
            checkNoException();
            throw new IOException("Writing after request completed.");
        }
        if (this.mClosed) {
            throw new IOException("Stream has been closed.");
        }
    }

    public abstract void checkReceivedEnoughContent() throws IOException;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mClosed = true;
    }

    public abstract boolean connectRequested() throws IOException;

    public abstract UploadDataProvider getUploadDataProvider();

    public boolean isClosed() {
        return this.mClosed;
    }

    public void setRequestCompleted(IOException iOException) {
        this.mException = iOException;
        this.mRequestCompleted = true;
    }
}
