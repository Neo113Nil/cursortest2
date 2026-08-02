package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tra implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tra(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                break;
            case 1:
                xam xamVar = (xam) this.c;
                xamVar.q = null;
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    zamVar.b();
                    break;
                }
                break;
            case 2:
                ((asm) this.c).c();
                break;
            case 3:
                psm psmVar = (psm) this.c;
                psmVar.u = null;
                psmVar.t.onNext(Boolean.TRUE);
                break;
            case 4:
                ((kr70) this.c).j = false;
                break;
            default:
                ((e5d0) this.c).Y0(false);
                break;
        }
    }
}
