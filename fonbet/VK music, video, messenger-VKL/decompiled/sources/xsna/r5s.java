package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: FontScaleConverterFactory.android.kt */
/* loaded from: classes11.dex */
public final class r5s {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile wik0<q5s> b = new wik0<>(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.h((int) 115.0f, new s5s(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.h((int) 130.0f, new s5s(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.h((int) 150.0f, new s5s(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.h((int) 180.0f, new s5s(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.h((int) 200.0f, new s5s(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            s3q0 s3q0Var = s3q0.a;
        }
        if ((b.b[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        wzw.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static q5s a(float f) {
        float f2;
        q5s i;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i2 = (int) (f * 100.0f);
        q5s g = b.g(i2);
        if (g != null) {
            return g;
        }
        wik0<q5s> wik0Var = b;
        int b2 = ey2.b(wik0Var.d, i2, wik0Var.b);
        if (b2 >= 0) {
            return b.i(b2);
        }
        int i3 = -(b2 + 1);
        int i4 = i3 - 1;
        if (i3 >= b.d) {
            s5s s5sVar = new s5s(new float[]{1.0f}, new float[]{f});
            b(f, s5sVar);
            return s5sVar;
        }
        if (i4 < 0) {
            i = new s5s(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.b[i4] / 100.0f;
            i = b.i(i4);
        }
        float f3 = b.b[i3] / 100.0f;
        float max = (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        q5s i5 = b.i(i3);
        float[] fArr2 = new float[9];
        for (int i6 = 0; i6 < 9; i6++) {
            float f4 = fArr[i6];
            float a2 = i.a(f4);
            fArr2[i6] = ((i5.a(f4) - a2) * max) + a2;
        }
        s5s s5sVar2 = new s5s(fArr, fArr2);
        b(f, s5sVar2);
        return s5sVar2;
    }

    public static void b(float f, s5s s5sVar) {
        synchronized (c) {
            wik0<q5s> clone = b.clone();
            clone.h((int) (f * 100.0f), s5sVar);
            b = clone;
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
