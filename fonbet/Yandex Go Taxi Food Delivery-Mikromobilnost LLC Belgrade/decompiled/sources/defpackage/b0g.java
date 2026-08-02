package defpackage;

/* loaded from: classes9.dex */
public final class b0g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0g b;

    public /* synthetic */ b0g(c0g c0gVar, int i) {
        this.a = i;
        this.b = c0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        c0g c0gVar = this.b;
        switch (i) {
            case 0:
                return new gp50(11, c0gVar.z, c0gVar.A);
            default:
                return new j0g(c0gVar.z, c0gVar.A);
        }
    }
}
