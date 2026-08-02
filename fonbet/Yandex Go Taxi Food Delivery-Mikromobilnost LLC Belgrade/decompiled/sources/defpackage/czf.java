package defpackage;

/* loaded from: classes3.dex */
public final class czf implements xvf0 {
    public final /* synthetic */ int a;
    public final mpk b;

    public /* synthetic */ czf(mpk mpkVar, int i) {
        this.a = i;
        this.b = mpkVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        mpk mpkVar = this.b;
        switch (i) {
            case 0:
                return new npk((gff) ((h9g) mpkVar).v.X.get());
            case 1:
                return ((h9g) mpkVar).i();
            case 2:
                return ((h9g) mpkVar).o();
            default:
                t0k0 s = ((h9g) mpkVar).s();
                q5z.h(s);
                return s;
        }
    }
}
