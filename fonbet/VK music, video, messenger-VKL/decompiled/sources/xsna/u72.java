package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class u72 implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                smm smmVar = (smm) this.b;
                smmVar.dismiss();
                smmVar.i.s();
                break;
            default:
                ((qgn) this.b).c.invoke();
                break;
        }
    }
}
