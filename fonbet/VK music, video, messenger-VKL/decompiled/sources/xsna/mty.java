package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class mty implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mty(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                cuy cuyVar = (cuy) this.b;
                vzc0 vzc0Var = cuyVar.d;
                if (vzc0Var != null) {
                    vzc0Var.d = false;
                }
                cuyVar.d = null;
                break;
            default:
                ((bvi) this.b).dispose();
                break;
        }
    }
}
