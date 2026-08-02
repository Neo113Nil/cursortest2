package xsna;

/* compiled from: VcCallbackImpl.kt */
/* loaded from: classes2.dex */
public final class qkr0 {
    public final xam a;

    public qkr0(xam xamVar) {
        this.a = xamVar;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.a.o;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
