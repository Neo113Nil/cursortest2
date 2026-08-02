package com.bumptech.glide.load.resource.bitmap;

import defpackage.ce70;

/* loaded from: classes10.dex */
public abstract class DownsampleStrategy {
    public static final e a;
    public static final c b;
    public static final d c;
    public static final f d;
    public static final d e;
    public static final ce70 f;
    public static final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SampleSizeRounding {
        private static final /* synthetic */ SampleSizeRounding[] $VALUES;
        public static final SampleSizeRounding MEMORY;
        public static final SampleSizeRounding QUALITY;

        static {
            SampleSizeRounding sampleSizeRounding = new SampleSizeRounding("MEMORY", 0);
            MEMORY = sampleSizeRounding;
            SampleSizeRounding sampleSizeRounding2 = new SampleSizeRounding("QUALITY", 1);
            QUALITY = sampleSizeRounding2;
            $VALUES = new SampleSizeRounding[]{sampleSizeRounding, sampleSizeRounding2};
        }

        public static SampleSizeRounding valueOf(String str) {
            return (SampleSizeRounding) Enum.valueOf(SampleSizeRounding.class, str);
        }

        public static SampleSizeRounding[] values() {
            return (SampleSizeRounding[]) $VALUES.clone();
        }
    }

    static {
        new a();
        new b();
        a = new e();
        b = new c();
        d dVar = new d();
        c = dVar;
        d = new f();
        e = dVar;
        f = ce70.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        g = true;
    }

    public abstract SampleSizeRounding a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
