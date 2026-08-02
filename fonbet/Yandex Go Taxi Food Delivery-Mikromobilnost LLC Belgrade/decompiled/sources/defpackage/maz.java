package defpackage;

/* loaded from: classes13.dex */
public final class maz implements v7p {
    public final /* synthetic */ int a;
    public final x4g b;
    public final xvf0 c;
    public final n3w d;

    public maz(n3w n3wVar, n3w n3wVar2, x4g x4gVar) {
        this.a = 4;
        this.c = n3wVar;
        this.d = n3wVar2;
        this.b = x4gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        x4g x4gVar = this.b;
        n3w n3wVar = this.d;
        xvf0 xvf0Var = this.c;
        switch (i) {
            case 0:
                return new laz((w030) x4gVar.get(), (kaz) xvf0Var.get(), (haz) n3wVar.a);
            case 1:
                return new da0(14, (w030) x4gVar.get(), (om80) xvf0Var.get(), (sm80) n3wVar.a);
            case 2:
                return new da0(15, (w030) x4gVar.get(), (vp80) xvf0Var.get(), (zp80) n3wVar.a);
            case 3:
                return new da0(16, (w030) x4gVar.get(), (cna0) xvf0Var.get(), (gna0) n3wVar.a);
            default:
                return new vna0((tna0) xvf0Var.get(), (yna0) n3wVar.a, (w030) x4gVar.get());
        }
    }

    public /* synthetic */ maz(x4g x4gVar, n3w n3wVar, n3w n3wVar2, int i) {
        this.a = i;
        this.b = x4gVar;
        this.c = n3wVar;
        this.d = n3wVar2;
    }
}
