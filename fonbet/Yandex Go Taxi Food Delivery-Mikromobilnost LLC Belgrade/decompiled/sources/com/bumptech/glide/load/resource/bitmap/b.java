package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes10.dex */
public final class b extends DownsampleStrategy {
    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final DownsampleStrategy.SampleSizeRounding a(int i, int i2, int i3, int i4) {
        return DownsampleStrategy.SampleSizeRounding.MEMORY;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float b(int i, int i2, int i3, int i4) {
        int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
        return 1.0f / (r1 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
    }
}
