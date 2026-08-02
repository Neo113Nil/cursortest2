package defpackage;

/* loaded from: classes12.dex */
public final class fsq implements upc {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ h55 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ fsq(h55 h55Var, Object obj, String str, int i) {
        this.a = i;
        this.c = h55Var;
        this.w = obj;
        this.b = str;
    }

    private final void n1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                ((k1a) this.c).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.upc
    public final void b1() {
        int i = this.a;
        String str = this.b;
        Object obj = this.w;
        h55 h55Var = this.c;
        switch (i) {
            case 0:
                ((k870) ((h3y) ((k1a) h55Var).K).get()).a(((csq) obj).a, str);
                break;
            default:
                ((k870) ((s911) h55Var).L.get()).a((o2y0) obj, str);
                break;
        }
    }
}
