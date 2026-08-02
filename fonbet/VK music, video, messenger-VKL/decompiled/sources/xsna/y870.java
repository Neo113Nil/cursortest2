package xsna;

/* compiled from: NotificationChannelsController.kt */
/* loaded from: classes5.dex */
public final class y870 implements io.reactivex.rxjava3.disposables.c {
    public final /* synthetic */ gzs<s3q0> b;

    public y870(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        x870.b.remove(this.b);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return x870.b.contains(this.b);
    }
}
