package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
class VideoDecoder$ByteBufferInitializer$1 extends MediaDataSource {
    final /* synthetic */ i this$0;
    final /* synthetic */ ByteBuffer val$data;

    public VideoDecoder$ByteBufferInitializer$1(i iVar, ByteBuffer byteBuffer) {
        this.this$0 = iVar;
        this.val$data = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.val$data.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.val$data.limit()) {
            return -1;
        }
        this.val$data.position((int) j);
        int min = Math.min(i2, this.val$data.remaining());
        this.val$data.get(bArr, i, min);
        return min;
    }
}
