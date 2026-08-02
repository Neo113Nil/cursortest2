package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class znr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ io.reactivex.rxjava3.core.y c;

    public /* synthetic */ znr(io.reactivex.rxjava3.core.y yVar, int i) {
        this.b = i;
        this.c = yVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.onSuccess(Boolean.FALSE);
                break;
            default:
                this.c.onError((Throwable) obj);
                break;
        }
        return s3q0.a;
    }
}
