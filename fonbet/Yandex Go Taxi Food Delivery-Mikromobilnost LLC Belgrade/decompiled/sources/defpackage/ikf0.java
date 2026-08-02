package defpackage;

/* loaded from: classes10.dex */
public final class ikf0 extends skl0 {
    public final /* synthetic */ jkf0 a;

    public ikf0(jkf0 jkf0Var) {
        this.a = jkf0Var;
    }

    @Override // defpackage.skl0
    public final void cancelWork() {
        this.a.d.f = true;
    }

    @Override // defpackage.skl0
    public final Object doWork() {
        this.a.d.b();
        return null;
    }
}
