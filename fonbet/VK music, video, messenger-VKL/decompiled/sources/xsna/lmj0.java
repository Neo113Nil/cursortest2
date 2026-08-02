package xsna;

/* compiled from: SignatureManager.kt */
/* loaded from: classes4.dex */
public final class lmj0 {
    public final p600 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final boolean c;
    public final nxp d;

    public lmj0(p600 p600Var, io.reactivex.rxjava3.disposables.b bVar, boolean z, nxp nxpVar) {
        this.a = p600Var;
        this.b = bVar;
        this.c = z;
        this.d = nxpVar;
        p600Var.b(new t50(1, this, lmj0.class, "onAuthStatusUpdated", "onAuthStatusUpdated(Lcom/vk/oauth/esia/internal/AuthStatus;)V", 0, 12));
    }
}
