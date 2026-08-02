package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class iuj implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iuj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((gho0) this.b).q();
                break;
            default:
                ((io.reactivex.rxjava3.disposables.b) this.b).e();
                break;
        }
    }
}
