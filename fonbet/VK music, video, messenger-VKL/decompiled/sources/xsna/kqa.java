package xsna;

import xsna.uyg0;

/* compiled from: CertificateStore.kt */
/* loaded from: classes.dex */
public final class kqa implements uyg0.b {
    public final /* synthetic */ mqa a;

    public kqa(mqa mqaVar) {
        this.a = mqaVar;
    }

    @Override // xsna.uyg0.b
    public final void a() {
        mqa mqaVar = this.a;
        mqaVar.d.subscribe(new jqa(new iqa(mqaVar, 0), 0));
    }

    @Override // xsna.uyg0.b
    public final void b(Throwable th) {
    }
}
