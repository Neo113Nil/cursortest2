package defpackage;

/* loaded from: classes3.dex */
public final class g4m0 implements v7p {
    public final /* synthetic */ int a;
    public final g7g b;

    public /* synthetic */ g4m0(g7g g7gVar, int i) {
        this.a = i;
        this.b = g7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g7g g7gVar = this.b;
        switch (i) {
            case 0:
                return new f4m0((mdm0) g7gVar.get());
            case 1:
                return new g7m0((mdm0) g7gVar.get());
            default:
                return new adp0((mdm0) g7gVar.get());
        }
    }
}
