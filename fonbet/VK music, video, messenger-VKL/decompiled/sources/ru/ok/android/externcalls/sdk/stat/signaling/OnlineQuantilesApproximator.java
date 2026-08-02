package ru.ok.android.externcalls.sdk.stat.signaling;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import xsna.an10;
import xsna.e43;
import xsna.g5g;
import xsna.zcl;

/* compiled from: OnlineQuantilesApproximator.kt */
/* loaded from: classes9.dex */
public final class OnlineQuantilesApproximator {
    public static final Companion Companion = new Companion(null);
    private Naive naive;
    private final PSquare pSquare;
    private final float quantile;
    private final int sizeLimitForNaive;

    /* compiled from: OnlineQuantilesApproximator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final float linearInterpolation(float f, float f2, int i, int i2, int i3) {
            return (((f2 - f) * (i3 - i)) / (i2 - i)) + f;
        }

        public final float parabolicInterpolation(float f, float f2, float f3, int i, int i2, int i3, int i4) {
            return (((((f2 - f) * (i3 - i4)) / (i2 - i)) + (((f3 - f2) * (i4 - i)) / (i3 - i2))) * ((i4 - i2) / (i3 - i))) + f2;
        }

        private Companion() {
        }
    }

    /* compiled from: OnlineQuantilesApproximator.kt */
    public final class Naive {
        private final List<Float> array;
        private boolean isSorted;

        public Naive(float f) {
            this.array = e43.o(Float.valueOf(f));
        }

        public final float get() {
            if (!this.isSorted) {
                g5g.K(this.array);
                this.isSorted = true;
            }
            return this.array.get(an10.b(OnlineQuantilesApproximator.this.quantile * (this.array.size() - 1))).floatValue();
        }

        public final void submit(float f) {
            this.isSorted = false;
            this.array.add(Float.valueOf(f));
        }
    }

    /* compiled from: OnlineQuantilesApproximator.kt */
    public final class PSquare {
        private final float[] dns;
        private final int[] ns = {1, 2, 3, 4, 1};
        private final float[] qs;

        public PSquare(float f) {
            this.qs = new float[]{f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            this.dns = new float[]{OnlineQuantilesApproximator.this.quantile * 0.5f, OnlineQuantilesApproximator.this.quantile, (OnlineQuantilesApproximator.this.quantile + 1) * 0.5f};
        }

        private final boolean isDenormalized() {
            return size() < 5;
        }

        public final float get() {
            return isDenormalized() ? this.qs[an10.b(OnlineQuantilesApproximator.this.quantile * (size() - 1))] : this.qs[2];
        }

        public final float getMax() {
            return isDenormalized() ? this.qs[size() - 1] : this.qs[4];
        }

        public final float getMin() {
            return this.qs[0];
        }

        public final int size() {
            return this.ns[4];
        }

        public final void submit(float f) {
            if (isDenormalized()) {
                this.qs[size()] = f;
                int[] iArr = this.ns;
                iArr[4] = iArr[4] + 1;
                Arrays.sort(this.qs, 0, size());
                return;
            }
            for (int i = 1; i < 4; i++) {
                if (f < this.qs[i]) {
                    int[] iArr2 = this.ns;
                    iArr2[i] = iArr2[i] + 1;
                }
            }
            float[] fArr = this.qs;
            fArr[0] = Math.min(fArr[0], f);
            float[] fArr2 = this.qs;
            fArr2[4] = Math.max(fArr2[4], f);
            int[] iArr3 = this.ns;
            iArr3[4] = iArr3[4] + 1;
            for (int i2 = 1; i2 < 4; i2++) {
                int i3 = i2 - 1;
                float size = (size() * this.dns[i3]) - this.ns[i2];
                int signum = (int) Math.signum(size);
                if (Math.abs(size) >= 1.0f) {
                    int[] iArr4 = this.ns;
                    int i4 = i2 + signum;
                    if (Math.abs(iArr4[i2] - iArr4[i4]) > 1) {
                        Companion companion = OnlineQuantilesApproximator.Companion;
                        float[] fArr3 = this.qs;
                        float f2 = fArr3[i3];
                        float f3 = fArr3[i2];
                        int i5 = i2 + 1;
                        float f4 = fArr3[i5];
                        int[] iArr5 = this.ns;
                        int i6 = iArr5[i3];
                        int i7 = iArr5[i2];
                        float parabolicInterpolation = companion.parabolicInterpolation(f2, f3, f4, i6, i7, iArr5[i5], i7 + signum);
                        float[] fArr4 = this.qs;
                        if (fArr4[i3] >= parabolicInterpolation || parabolicInterpolation >= fArr4[i5]) {
                            float f5 = fArr4[i2];
                            float f6 = fArr4[i4];
                            int[] iArr6 = this.ns;
                            int i8 = iArr6[i2];
                            fArr4[i2] = companion.linearInterpolation(f5, f6, i8, iArr6[i4], i8 + signum);
                        } else {
                            fArr4[i2] = parabolicInterpolation;
                        }
                        int[] iArr7 = this.ns;
                        iArr7[i2] = iArr7[i2] + signum;
                    }
                }
            }
        }
    }

    public OnlineQuantilesApproximator(float f, float f2, int i) {
        this.quantile = f2;
        this.sizeLimitForNaive = i;
        this.pSquare = new PSquare(f);
        this.naive = i > 1 ? new Naive(f) : null;
    }

    public final float get() {
        Naive naive = this.naive;
        return naive != null ? naive.get() : this.pSquare.get();
    }

    public final float getMax() {
        return this.pSquare.getMax();
    }

    public final float getMin() {
        return this.pSquare.getMin();
    }

    public final void submit(float f) {
        this.pSquare.submit(f);
        if (this.naive != null) {
            if (this.pSquare.size() > this.sizeLimitForNaive) {
                this.naive = null;
            }
            Naive naive = this.naive;
            if (naive != null) {
                naive.submit(f);
            }
        }
    }

    public /* synthetic */ OnlineQuantilesApproximator(float f, float f2, int i, int i2, zcl zclVar) {
        this(f, f2, (i2 & 4) != 0 ? 20 : i);
    }
}
