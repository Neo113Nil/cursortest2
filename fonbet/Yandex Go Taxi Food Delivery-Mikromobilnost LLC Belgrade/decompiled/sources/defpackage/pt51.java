package defpackage;

/* loaded from: classes8.dex */
public final /* synthetic */ class pt51 implements vhw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pt51(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vhw0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((qt51) obj).a;
            case 1:
                return ((qt51) obj).b.a();
            default:
                return ((kb20) obj).b();
        }
    }
}
