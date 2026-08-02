package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class od80 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ od80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r7 <= r3) goto L29;
     */
    @Override // xsna.zzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        char c;
        float f;
        int i2 = this.b;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                int i3 = 32;
                v5v v5vVar = (v5v) obj5;
                izs izsVar = (izs) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.y(izsVar) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    if (!aVar.l(booleanValue)) {
                        i3 = 16;
                    }
                    i |= i3;
                }
                int i4 = i;
                if (aVar.t(i4 & 1, (i4 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1267272497, i4, -1, "com.vk.design.demo.presentation.screens.OnboardingHighlighterScreenContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingHighlighterScreenContent.kt:170)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean z = !ylu0Var.s();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var2.getText().o;
                    bpn0 bpn0Var = v5v.c;
                    djo0.c(d8v0.c(v5vVar, booleanValue, z, j, aVar, i4 & 112), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, izsVar, null, aVar, 0, (i4 << 18) & 3670016, 196606);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                bei0 bei0Var = (bei0) obj5;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                tny tnyVar = (tny) obj2;
                zbi0 zbi0Var = (zbi0) obj4;
                long a = tnyVar.a();
                float f2 = (int) (a >> 32);
                float f3 = (int) (a & 4294967295L);
                long j2 = ((ov70) obj3).a;
                int i5 = (int) (j2 >> 32);
                float intBitsToFloat = Float.intBitsToFloat(i5);
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= intBitsToFloat && intBitsToFloat <= f2) {
                    c = ' ';
                    f = f3;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= intBitsToFloat2) {
                        break;
                    }
                } else {
                    c = ' ';
                    f = f3;
                }
                if (Float.intBitsToFloat(i5) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = 0.0f;
                } else if (Float.intBitsToFloat(i5) <= f2) {
                    f2 = Float.intBitsToFloat(i5);
                }
                int i6 = (int) (j2 & 4294967295L);
                j2 = (Float.floatToRawIntBits(f2) << c) | (Float.floatToRawIntBits(Float.intBitsToFloat(i6) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : Float.intBitsToFloat(i6) > f ? f : Float.intBitsToFloat(i6)) & 4294967295L);
                long a2 = bei0Var.a(tnyVar, j2);
                if ((9223372034707292159L & a2) != 9205357640488583168L) {
                    bei0Var.k(booleanValue2);
                    bei0Var.u = null;
                    bei0Var.n(a2, 9205357640488583168L, false, zbi0Var);
                    rwr.b(bei0Var.i);
                    bei0Var.y = false;
                    bei0Var.o();
                    bei0Var.v = true;
                }
                break;
        }
        return s3q0.a;
    }
}
