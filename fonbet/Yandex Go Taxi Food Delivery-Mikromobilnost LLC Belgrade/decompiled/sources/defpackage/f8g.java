package defpackage;

/* loaded from: classes15.dex */
public final class f8g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8g b;

    public /* synthetic */ f8g(h8g h8gVar, int i) {
        this.a = i;
        this.b = h8gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h8g h8gVar = this.b;
        switch (i) {
            case 0:
                return new k8g(h8gVar.b, h8gVar.c, h8gVar.d, h8gVar.e);
            case 1:
                return new b8g(h8gVar.b, h8gVar.c, h8gVar.d, h8gVar.e);
            case 2:
                return new k8g(h8gVar.b, h8gVar.c, h8gVar.d, h8gVar.e);
            default:
                return new r8g(h8gVar.b, h8gVar.c, h8gVar.d, h8gVar.e);
        }
    }
}
