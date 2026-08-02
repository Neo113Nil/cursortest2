package xsna;

/* compiled from: MenuCounterEventConsumer.kt */
/* loaded from: classes7.dex */
public final class a620 implements io.reactivex.rxjava3.functions.f<sxp> {

    /* compiled from: MenuCounterEventConsumer.kt */
    public static final class a {
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        if (sxpVar instanceof s480) {
            f620.d(this, true);
        } else {
            f620.d(this, false);
        }
    }
}
