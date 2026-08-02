package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import defpackage.ml31;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class i implements ml31 {
    @Override // defpackage.ml31
    public final void g(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new VideoDecoder$ByteBufferInitializer$1(this, (ByteBuffer) obj));
    }

    @Override // defpackage.ml31
    public final void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new VideoDecoder$ByteBufferInitializer$1(this, (ByteBuffer) obj));
    }
}
