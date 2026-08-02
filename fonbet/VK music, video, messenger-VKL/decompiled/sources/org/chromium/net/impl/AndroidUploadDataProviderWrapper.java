package org.chromium.net.impl;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes8.dex */
class AndroidUploadDataProviderWrapper extends UploadDataProvider {
    private final org.chromium.net.UploadDataProvider mBackend;

    public AndroidUploadDataProviderWrapper(org.chromium.net.UploadDataProvider uploadDataProvider) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.mBackend = uploadDataProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mBackend.close();
    }

    public long getLength() throws IOException {
        return this.mBackend.getLength();
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        this.mBackend.read(new AndroidUploadDataSinkWrapper(uploadDataSink), byteBuffer);
    }

    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.mBackend.rewind(new AndroidUploadDataSinkWrapper(uploadDataSink));
    }
}
