package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3r0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ androidx.compose.ui.graphics.c e;
    public final /* synthetic */ va2 f;

    public /* synthetic */ r3r0(boolean z, long j, float f, androidx.compose.ui.graphics.c cVar, va2 va2Var) {
        this.b = z;
        this.c = j;
        this.d = f;
        this.e = cVar;
        this.f = va2Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        long j = this.c;
        androidx.compose.ui.graphics.c cVar = this.e;
        va2 va2Var = this.f;
        oio oioVar = (oio) obj;
        yq9 a = oioVar.a0().a();
        try {
            a.e();
            if (!this.b) {
                a.p(oioVar.I0(rco.a(j)), oioVar.I0(rco.b(j)));
            }
            float f = this.d;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float b = io.reactivex.rxjava3.internal.operators.observable.n0.b(oioVar.I0(f), Float.intBitsToFloat((int) (oioVar.d() >> 32)), 2.0f, 1.0f);
                float b2 = io.reactivex.rxjava3.internal.operators.observable.n0.b(oioVar.I0(f), Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)), 2.0f, 1.0f);
                float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                if (b != 1.0f || b2 != 1.0f) {
                    a.p(intBitsToFloat, intBitsToFloat2);
                    a.g(b, b2);
                    a.p(-intBitsToFloat, -intBitsToFloat2);
                }
            }
            androidx.compose.ui.graphics.d.b(a, cVar, va2Var);
            a.a();
            return s3q0.a;
        } catch (Throwable th) {
            a.a();
            throw th;
        }
    }
}
