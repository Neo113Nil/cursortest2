package xsna;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zaaa;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class flz0 extends ylz0 {
    public final /* synthetic */ jlz0 b;
    public final /* synthetic */ com.google.android.gms.signin.internal.zak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flz0(glz0 glz0Var, jlz0 jlz0Var, jlz0 jlz0Var2, com.google.android.gms.signin.internal.zak zakVar) {
        super(jlz0Var);
        this.b = jlz0Var2;
        this.c = zakVar;
    }

    @Override // xsna.ylz0
    public final void a() {
        jlz0 jlz0Var = this.b;
        if (jlz0Var.g(0)) {
            com.google.android.gms.signin.internal.zak zakVar = this.c;
            ConnectionResult connectionResult = zakVar.c;
            if (!connectionResult.j()) {
                if (!jlz0Var.l || connectionResult.i()) {
                    jlz0Var.e(connectionResult);
                    return;
                } else {
                    jlz0Var.d();
                    jlz0Var.a();
                    return;
                }
            }
            zaaa zaaaVar = zakVar.d;
            exc0.i(zaaaVar);
            ConnectionResult connectionResult2 = zaaaVar.d;
            if (!connectionResult2.j()) {
                String valueOf = String.valueOf(connectionResult2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                jlz0Var.e(connectionResult2);
                return;
            }
            jlz0Var.n = true;
            com.google.android.gms.common.internal.b i = zaaaVar.i();
            exc0.i(i);
            jlz0Var.o = i;
            jlz0Var.p = zaaaVar.e;
            jlz0Var.q = zaaaVar.f;
            jlz0Var.a();
        }
    }
}
