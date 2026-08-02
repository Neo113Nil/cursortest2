package ru.ok.gl.util;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public final class MathUtil {

    public interface Average {
        float add(float f);

        float getAverageMeasure();

        int getMeasureCount();

        float getStandardDeviation();

        void reset();
    }

    public static final class Ema implements Average {
        private double averageMeasure;
        private int measureCount;
        private final float[] measures;
        private final float[] weights;

        public Ema(int i) {
            this.weights = new float[i];
            this.measures = new float[i];
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i2 = 0;
            float f2 = 0.0f;
            for (int i3 = 0; i3 < i; i3++) {
                float exp = (float) Math.exp(i3);
                this.weights[i3] = exp;
                f2 += exp;
            }
            while (true) {
                int i4 = i - 1;
                if (i2 >= i4) {
                    this.weights[i4] = 1.0f - f;
                    return;
                }
                float[] fArr = this.weights;
                float f3 = fArr[i2] / f2;
                fArr[i2] = f3;
                f += f3;
                i2++;
            }
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public float add(float f) {
            int length = this.measures.length - 1;
            double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            int i = 0;
            while (i < length) {
                float[] fArr = this.measures;
                int i2 = i + 1;
                fArr[i] = fArr[i2];
                d += this.weights[i] * r6;
                i = i2;
            }
            float[] fArr2 = this.measures;
            fArr2[length] = f;
            this.averageMeasure = d + (this.weights[length] * f);
            this.measureCount = Math.min(this.measureCount + 1, fArr2.length);
            return (float) this.averageMeasure;
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public float getAverageMeasure() {
            return (float) this.averageMeasure;
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public int getMeasureCount() {
            return this.measureCount;
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public float getStandardDeviation() {
            if (this.measureCount < 2) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            int i = 0;
            while (true) {
                if (i >= this.measureCount) {
                    return (float) Math.sqrt(d / (r3 - 1));
                }
                float[] fArr = this.measures;
                double d2 = fArr[(fArr.length - i) - 1] - this.averageMeasure;
                d += d2 * d2;
                i++;
            }
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public void reset() {
            Arrays.fill(this.measures, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.averageMeasure = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.measureCount = 0;
        }
    }

    public static final class Sma implements Average {
        private double m;
        private int n;
        private double prevSum;
        private double sigma;

        @Override // ru.ok.gl.util.MathUtil.Average
        public float add(float f) {
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            double d = this.m;
            double d2 = i2 != 1 ? ((f - d) / i2) + d : f;
            this.m = d2;
            double d3 = f - d2;
            double d4 = d2 - d;
            double d5 = (d3 * d3) + (d4 * d4 * i) + this.prevSum;
            this.prevSum = d5;
            this.sigma = Math.sqrt(d5 / i2);
            return (float) this.m;
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public float getAverageMeasure() {
            return (float) this.m;
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public int getMeasureCount() {
            return this.n;
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public float getStandardDeviation() {
            return (float) this.sigma;
        }

        @Override // ru.ok.gl.util.MathUtil.Average
        public void reset() {
            this.n = 0;
            this.prevSum = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.sigma = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.m = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
    }

    private MathUtil() {
    }
}
