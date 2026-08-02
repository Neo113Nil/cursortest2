package xsna;

/* compiled from: NonceManager.kt */
/* loaded from: classes4.dex */
public final class m670 {
    public final p600 a;
    public final io.reactivex.rxjava3.disposables.b b;

    public m670(p600 p600Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = p600Var;
        this.b = bVar;
        p600Var.b(new hy0(1, this, m670.class, "onAuthStatusUpdated", "onAuthStatusUpdated(Lcom/vk/oauth/alfa/base/internal/AuthStatus;)V", 0, 8));
    }
}
