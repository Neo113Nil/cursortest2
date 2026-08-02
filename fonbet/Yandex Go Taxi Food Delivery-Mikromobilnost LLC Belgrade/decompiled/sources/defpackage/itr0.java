package defpackage;

import android.content.res.TypedArray;

/* loaded from: classes.dex */
public abstract class itr0 {
    public final ktr0 a = new ktr0();

    public final ktr0 a() {
        ktr0 ktr0Var = this.a;
        int i = ktr0Var.f;
        int[] iArr = ktr0Var.b;
        if (i != 1) {
            int i2 = ktr0Var.e;
            iArr[0] = i2;
            int i3 = ktr0Var.d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = ktr0Var.d;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = ktr0Var.e;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = ktr0Var.a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - ktr0Var.k) - ktr0Var.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - ktr0Var.k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((ktr0Var.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((ktr0Var.k + 1.0f) + ktr0Var.l) / 2.0f, 1.0f);
            return ktr0Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(ktr0Var.k, 1.0f);
        fArr[2] = Math.min(ktr0Var.k + ktr0Var.l, 1.0f);
        fArr[3] = 1.0f;
        return ktr0Var;
    }

    public itr0 b(TypedArray typedArray) {
        boolean hasValue = typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_clip_to_children);
        ktr0 ktr0Var = this.a;
        if (hasValue) {
            ktr0Var.n = typedArray.getBoolean(u2i0.ShimmerFrameLayout_shimmer_clip_to_children, ktr0Var.n);
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_auto_start)) {
            ktr0Var.o = typedArray.getBoolean(u2i0.ShimmerFrameLayout_shimmer_auto_start, ktr0Var.o);
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_base_alpha)) {
            d(typedArray.getFloat(u2i0.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_highlight_alpha)) {
            ktr0Var.d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(u2i0.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f))) * 255.0f)) << 24) | (ktr0Var.d & 16777215);
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_duration)) {
            f(typedArray.getInt(u2i0.ShimmerFrameLayout_shimmer_duration, (int) ktr0Var.s));
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_repeat_count)) {
            ktr0Var.q = typedArray.getInt(u2i0.ShimmerFrameLayout_shimmer_repeat_count, ktr0Var.q);
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_repeat_delay)) {
            long j = typedArray.getInt(u2i0.ShimmerFrameLayout_shimmer_repeat_delay, (int) ktr0Var.t);
            if (j < 0) {
                ny61.g(qv10.j(j, "Given a negative repeat delay: "));
                return null;
            }
            ktr0Var.t = j;
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_repeat_mode)) {
            ktr0Var.r = typedArray.getInt(u2i0.ShimmerFrameLayout_shimmer_repeat_mode, ktr0Var.r);
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_direction)) {
            int i = typedArray.getInt(u2i0.ShimmerFrameLayout_shimmer_direction, ktr0Var.c);
            if (i == 1) {
                ktr0Var.c = 1;
            } else if (i == 2) {
                ktr0Var.c = 2;
            } else if (i != 3) {
                ktr0Var.c = 0;
            } else {
                ktr0Var.c = 3;
            }
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_shape)) {
            if (typedArray.getInt(u2i0.ShimmerFrameLayout_shimmer_shape, ktr0Var.f) != 1) {
                ktr0Var.f = 0;
            } else {
                ktr0Var.f = 1;
            }
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_dropoff)) {
            e(typedArray.getFloat(u2i0.ShimmerFrameLayout_shimmer_dropoff, ktr0Var.l));
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_fixed_width)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(u2i0.ShimmerFrameLayout_shimmer_fixed_width, ktr0Var.g);
            if (dimensionPixelSize < 0) {
                ny61.g(oyr.i(dimensionPixelSize, "Given invalid width: "));
                return null;
            }
            ktr0Var.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_fixed_height)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(u2i0.ShimmerFrameLayout_shimmer_fixed_height, ktr0Var.h);
            if (dimensionPixelSize2 < 0) {
                ny61.g(oyr.i(dimensionPixelSize2, "Given invalid height: "));
                return null;
            }
            ktr0Var.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_intensity)) {
            float f = typedArray.getFloat(u2i0.ShimmerFrameLayout_shimmer_intensity, ktr0Var.k);
            if (f < 0.0f) {
                yci0.g(f, "Given invalid intensity value: ");
                return null;
            }
            ktr0Var.k = f;
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_width_ratio)) {
            float f2 = typedArray.getFloat(u2i0.ShimmerFrameLayout_shimmer_width_ratio, ktr0Var.i);
            if (f2 < 0.0f) {
                yci0.g(f2, "Given invalid width ratio: ");
                return null;
            }
            ktr0Var.i = f2;
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_height_ratio)) {
            float f3 = typedArray.getFloat(u2i0.ShimmerFrameLayout_shimmer_height_ratio, ktr0Var.j);
            if (f3 < 0.0f) {
                yci0.g(f3, "Given invalid height ratio: ");
                return null;
            }
            ktr0Var.j = f3;
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_tilt)) {
            ktr0Var.m = typedArray.getFloat(u2i0.ShimmerFrameLayout_shimmer_tilt, ktr0Var.m);
        }
        return c();
    }

    public abstract itr0 c();

    public final itr0 d(float f) {
        int min = ((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24;
        ktr0 ktr0Var = this.a;
        ktr0Var.e = min | (ktr0Var.e & 16777215);
        return c();
    }

    public final itr0 e(float f) {
        if (f >= 0.0f) {
            this.a.l = f;
            return c();
        }
        yci0.g(f, "Given invalid dropoff value: ");
        return null;
    }

    public final itr0 f(long j) {
        if (j >= 0) {
            this.a.s = j;
            return c();
        }
        ny61.g(qv10.j(j, "Given a negative duration: "));
        return null;
    }
}
