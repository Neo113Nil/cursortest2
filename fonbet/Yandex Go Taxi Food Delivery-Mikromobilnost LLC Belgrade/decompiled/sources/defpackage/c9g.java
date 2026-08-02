package defpackage;

/* loaded from: classes15.dex */
public final class c9g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9g b;

    public /* synthetic */ c9g(d9g d9gVar, int i) {
        this.a = i;
        this.b = d9gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        d9g d9gVar = this.b;
        switch (i) {
            case 0:
                return new l8g(d9gVar.b, d9gVar.c, d9gVar.d);
            default:
                return new wwf(d9gVar.b, d9gVar.c, d9gVar.d);
        }
    }
}
