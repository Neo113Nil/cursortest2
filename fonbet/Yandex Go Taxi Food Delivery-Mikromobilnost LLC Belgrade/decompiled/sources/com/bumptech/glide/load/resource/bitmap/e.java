package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes10.dex */
public final class e extends DownsampleStrategy {
    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final DownsampleStrategy.SampleSizeRounding a(int i, int i2, int i3, int i4) {
        return DownsampleStrategy.g ? DownsampleStrategy.SampleSizeRounding.QUALITY : DownsampleStrategy.SampleSizeRounding.MEMORY;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float b(int i, int i2, int i3, int i4) {
        if (DownsampleStrategy.g) {
            return Math.min(i3 / i, i4 / i2);
        }
        if (Math.max(i2 / i4, i / i3) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r0);
    }
}
