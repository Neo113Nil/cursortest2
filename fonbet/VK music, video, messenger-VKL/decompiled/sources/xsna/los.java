package xsna;

/* compiled from: FriendsExternalEventHandlerDelegate.kt */
/* loaded from: classes.dex */
public final class los extends l5a {
    public final io.reactivex.rxjava3.disposables.b c;

    public los(q3a q3aVar) {
        super(q3aVar);
        this.c = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.l5a
    public final void a() {
        this.c.b(xwk.e().T().m().d.subscribe(new kos(new jos(this, 0), 0)));
    }
}
