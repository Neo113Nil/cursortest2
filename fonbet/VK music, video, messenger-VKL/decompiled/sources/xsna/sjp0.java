package xsna;

import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.model.effect.VideoTransformEffect;
import java.util.Arrays;
import kotlin.Pair;

/* compiled from: Transform.kt */
/* loaded from: classes3.dex */
public final class sjp0 {
    public int c;
    public int d;
    public VideoTransformEffect f;
    public final float[] g;
    public int a = -1;
    public int b = -1;
    public int e = -1;
    public volatile float[] h = new float[16];

    public sjp0(int i, int i2) {
        this.c = i;
        this.d = i2;
        float[] fArr = new float[16];
        this.g = fArr;
        if (i > 0 && i2 > 0) {
            Matrix.setIdentityM(this.h, 0);
            Matrix.setLookAtM(fArr, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            throw new IllegalArgumentException(("Wrong target size=" + i + 'x' + i2).toString());
        }
    }

    public final void a() {
        int i;
        int i2;
        int i3 = this.a;
        if (i3 <= 0 || (i = this.b) <= 0 || (i2 = this.e) < 0) {
            return;
        }
        Pair pair = i2 % 180 == 90 ? new Pair(Integer.valueOf(i), Integer.valueOf(this.a)) : new Pair(Integer.valueOf(i3), Integer.valueOf(this.b));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        VideoTransformEffect videoTransformEffect = this.f;
        if (videoTransformEffect != null) {
            float[] fArr = videoTransformEffect.b;
            float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) * 57.29577951308232d);
            float f = fArr[0];
            float f2 = fArr[3];
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            float f3 = fArr[2];
            float f4 = -fArr[5];
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            int i4 = videoTransformEffect.c;
            float f5 = videoTransformEffect.d;
            Matrix.scaleM(fArr2, 0, 2.0f / i4, 2.0f / f5, 1.0f);
            Matrix.translateM(fArr2, 0, (-i4) / 2.0f, f5 / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Matrix.translateM(fArr2, 0, f3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Matrix.scaleM(fArr2, 0, sqrt, sqrt, 1.0f);
            Matrix.rotateM(fArr2, 0, atan2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            float f6 = intValue / 2.0f;
            Matrix.translateM(fArr2, 0, f6, (-intValue2) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Matrix.scaleM(fArr2, 0, f6, intValue2 / 2.0f, 1.0f);
            this.h = fArr2;
            return;
        }
        int i5 = this.c;
        int i6 = this.d;
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float f7 = i5 / i6;
        float f8 = intValue / intValue2;
        if (i5 >= i6 && f8 > f7) {
            float f9 = f8 / f7;
            Matrix.orthoM(fArr3, 0, -1.0f, 1.0f, -f9, f9, -1.0f, 5.0f);
        } else if (i5 >= i6) {
            float f10 = f7 / f8;
            Matrix.orthoM(fArr3, 0, -f10, f10, -1.0f, 1.0f, -1.0f, 5.0f);
        } else if (f8 >= f7) {
            float f11 = f8 / f7;
            Matrix.orthoM(fArr3, 0, -1.0f, 1.0f, -f11, f11, -1.0f, 5.0f);
        } else {
            float f12 = f7 / f8;
            Matrix.orthoM(fArr3, 0, -f12, f12, -1.0f, 1.0f, -1.0f, 5.0f);
        }
        float[] fArr4 = new float[16];
        Matrix.multiplyMM(fArr4, 0, fArr3, 0, this.g, 0);
        this.h = fArr4;
    }

    public final void b(VideoTransformEffect videoTransformEffect) {
        if (videoTransformEffect == null || (videoTransformEffect.b.length == 9 && videoTransformEffect.c > 0 && videoTransformEffect.d > 0)) {
            if (videoTransformEffect == null || !videoTransformEffect.equals(this.f)) {
                this.f = videoTransformEffect;
                a();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong video transform : matrix=");
        sb.append(Arrays.toString(videoTransformEffect != null ? videoTransformEffect.b : null));
        sb.append(", width=");
        sb.append(videoTransformEffect != null ? Integer.valueOf(videoTransformEffect.c) : null);
        sb.append(", height=");
        sb.append(videoTransformEffect != null ? Integer.valueOf(videoTransformEffect.d) : null);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Wrong video rotation degrees=").toString());
        }
        if (i == this.e) {
            return;
        }
        this.e = i;
        a();
    }

    public final void d(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(("Wrong source size=" + i + 'x' + i2).toString());
        }
        if (i == this.a && i2 == this.b) {
            return;
        }
        this.b = i2;
        this.a = i;
        a();
    }
}
