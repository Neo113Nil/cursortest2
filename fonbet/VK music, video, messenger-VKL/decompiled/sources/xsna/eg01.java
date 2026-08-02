package xsna;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class eg01 implements Runnable {
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ dg01 c;
    public final /* synthetic */ dg01 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ kg01 f;

    public eg01(kg01 kg01Var, Bundle bundle, dg01 dg01Var, dg01 dg01Var2, long j) {
        this.f = kg01Var;
        this.b = bundle;
        this.c = dg01Var;
        this.d = dg01Var2;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.b;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        kg01 kg01Var = this.f;
        sk01 sk01Var = ((mb01) kg01Var.b).m;
        mb01.i(sk01Var);
        kg01Var.o(this.c, this.d, this.e, true, sk01Var.m0("screen_view", bundle, null, false));
    }
}
