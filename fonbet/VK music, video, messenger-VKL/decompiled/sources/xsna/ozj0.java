package xsna;

/* compiled from: SkipOnboardingFeedOpenTracker.kt */
/* loaded from: classes17.dex */
public final class ozj0 implements ld80 {
    public final jwe a;
    public final vz50 b;
    public boolean c;

    public ozj0(jwe jweVar, vz50 vz50Var) {
        this.a = jweVar;
        this.b = vz50Var;
    }

    @Override // xsna.ld80
    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        jwe jweVar = this.a;
        jweVar.s(jweVar.k() + 1);
        if (jweVar.k() >= 3) {
            vz50 vz50Var = this.b;
            jwe jweVar2 = vz50Var.a;
            if (vz50Var.a()) {
                return;
            }
            jweVar2.f().i();
            jweVar2.f().g();
            jweVar2.f().e();
        }
    }
}
