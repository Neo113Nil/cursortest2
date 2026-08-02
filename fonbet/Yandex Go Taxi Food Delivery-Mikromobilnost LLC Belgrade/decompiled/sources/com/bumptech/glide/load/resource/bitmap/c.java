package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes10.dex */
public final class c extends DownsampleStrategy {
    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final DownsampleStrategy.SampleSizeRounding a(int i, int i2, int i3, int i4) {
        return b(i, i2, i3, i4) == 1.0f ? DownsampleStrategy.SampleSizeRounding.QUALITY : DownsampleStrategy.a.a(i, i2, i3, i4);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float b(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, DownsampleStrategy.a.b(i, i2, i3, i4));
    }
}
