package defpackage;

/* loaded from: classes5.dex */
public final class f1g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1g b;

    public /* synthetic */ f1g(g1g g1gVar, int i) {
        this.a = i;
        this.b = g1gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g1g g1gVar = this.b;
        switch (i) {
            case 0:
                return new zgf(6, g1gVar.a, g1gVar.b);
            case 1:
                return new h1g(g1gVar.a, g1gVar.b);
            default:
                return new i1g(g1gVar.a, g1gVar.b);
        }
    }
}
