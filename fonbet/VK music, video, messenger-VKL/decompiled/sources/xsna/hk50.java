package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes3.dex */
public final class hk50 implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((kvi) this.b).b.a();
                break;
            default:
                bei0 bei0Var = (bei0) this.b;
                bei0Var.i();
                ((zak0) bei0Var.j).setValue(Boolean.FALSE);
                break;
        }
    }
}
