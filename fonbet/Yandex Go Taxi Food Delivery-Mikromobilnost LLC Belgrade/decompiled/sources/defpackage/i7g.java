package defpackage;

/* loaded from: classes13.dex */
public final class i7g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7g b;

    public /* synthetic */ i7g(p7g p7gVar, int i) {
        this.a = i;
        this.b = p7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        p7g p7gVar = this.b;
        switch (i) {
            case 0:
                return new zgf(9, p7gVar.b);
            case 1:
                return new q7g(p7gVar.b);
            case 2:
                return new r7g(p7gVar.b);
            default:
                return new h7g(p7gVar.b);
        }
    }
}
