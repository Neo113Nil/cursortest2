package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: ClipsPublicationAgreementInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class cze implements zye {
    public final wye a;

    public cze(wye wyeVar) {
        this.a = wyeVar;
    }

    @Override // xsna.zye
    public final Object a(hcf hcfVar) {
        gzg0 gzg0Var = new gzg0(s7s0.c(hcfVar));
        this.a.f(new aze(this, gzg0Var), new bze(gzg0Var));
        Object a = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    @Override // xsna.zye
    public final void dispose() {
        this.a.dispose();
    }
}
