package xsna;

/* compiled from: DefaultDynamicLibUseCaseDelegate.kt */
/* loaded from: classes18.dex */
public final class tdl implements iqo<hqo> {
    public boolean a;

    @Override // xsna.iqo
    public final void a(hqo hqoVar) {
        this.a = true;
    }

    @Override // xsna.iqo
    public final boolean b(hqo hqoVar) {
        return !this.a;
    }
}
