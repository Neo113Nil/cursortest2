package xsna;

import com.vk.auth.smartflow.api.data.VerificationMethodTypes;

/* compiled from: CollageView.kt */
/* loaded from: classes4.dex */
public final class l3g implements rj20 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l3g(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.rj20
    public void D() {
        ((oj20) this.b).Mn();
        ((rj20) this.c).D();
    }

    @Override // xsna.rj20
    public void E(VerificationMethodTypes verificationMethodTypes) {
        ((oj20) this.b).Mn();
        ((rj20) this.c).E(verificationMethodTypes);
    }

    @Override // xsna.rj20
    public void a() {
        ((oj20) this.b).Mn();
        ((rj20) this.c).a();
    }

    public void b(e2t e2tVar) {
        y1t y1tVar = (y1t) this.b;
        synchronized (y1tVar.h) {
            y1tVar.h.add(e2tVar);
        }
        ((k3g) this.c).p.b();
    }
}
