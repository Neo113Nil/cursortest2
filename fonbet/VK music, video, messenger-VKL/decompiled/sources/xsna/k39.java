package xsna;

/* compiled from: CallFinishHandler.kt */
/* loaded from: classes8.dex */
public final class k39<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ h39 b;
    public final /* synthetic */ far c;

    public k39(h39 h39Var, far farVar) {
        this.b = h39Var;
        this.c = farVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.b.b.reportException("CallFinishHandler", "BitrateDumpFileSendTrigger handling failed. reason " + th, th);
    }
}
