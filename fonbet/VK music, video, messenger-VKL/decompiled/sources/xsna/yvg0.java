package xsna;

/* compiled from: RxTaskExecution.kt */
/* loaded from: classes3.dex */
public abstract class yvg0 extends jn50 {
    @Override // xsna.jn50
    public void a() {
        e().dispose();
    }

    @Override // xsna.jn50
    public boolean d() {
        return !e().h();
    }

    public abstract io.reactivex.rxjava3.disposables.c e();
}
