package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextFieldDelegate.kt */
/* loaded from: classes11.dex */
public final class rfo0 {
    public static void a(tho0 tho0Var, sdo0 sdo0Var, ljo0 ljo0Var, tny tnyVar, sio0 sio0Var, boolean z, uv70 uv70Var) {
        long a;
        zhf0 zhf0Var;
        if (z) {
            int b = uv70Var.b(qko0.e(tho0Var.b));
            String str = sfo0.a;
            if (b < ljo0Var.a.a.c.length()) {
                zhf0Var = ljo0Var.b(b);
            } else if (b != 0) {
                zhf0Var = ljo0Var.b(b - 1);
            } else {
                a = sfo0.a(sdo0Var.b, sdo0Var.g, sdo0Var.h, sfo0.a, 1);
                zhf0Var = new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, (int) (a & 4294967295L));
            }
            float f = zhf0Var.b;
            float f2 = zhf0Var.a;
            long D = tnyVar.D((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (D >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (D & 4294967295L));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = zhf0Var.c - f2;
            float f4 = zhf0Var.d - f;
            zhf0 e = p490.e(floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            if (epx.f(sio0Var.a.b.get(), sio0Var)) {
                sio0Var.b.g(e);
            }
        }
    }
}
