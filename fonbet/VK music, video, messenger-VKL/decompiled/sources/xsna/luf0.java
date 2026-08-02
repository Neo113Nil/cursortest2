package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class luf0 implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

    public /* synthetic */ luf0(io.reactivex.rxjava3.disposables.c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            default:
                io.reactivex.rxjava3.disposables.c cVar = this.b;
                if (cVar != null) {
                    cVar.dispose();
                    break;
                }
                break;
        }
    }
}
