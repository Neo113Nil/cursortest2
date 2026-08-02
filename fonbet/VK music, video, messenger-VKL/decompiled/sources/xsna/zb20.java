package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zb20 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zb20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.disposables.c) this.c).dispose();
                break;
            default:
                enj0 enj0Var = (enj0) this.c;
                enj0Var.b.a(cjq0.b);
                break;
        }
    }
}
