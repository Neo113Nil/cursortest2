package yads;

/* loaded from: classes10.dex */
public final class zm3 implements ug3 {
    public final lg3 a;
    public final kl3 b;

    public /* synthetic */ zm3(s62 s62Var, k82 k82Var) {
        this(s62Var, vx1.a(k82Var));
    }

    @Override // yads.ug3
    public final void a(long j, long j2) {
        if (this.b.a()) {
            if (this.a.isPlayingAd()) {
                return;
            }
            this.a.resumeAd();
        } else if (this.a.isPlayingAd()) {
            this.a.pauseAd();
        }
    }

    public zm3(s62 s62Var, kl3 kl3Var) {
        this.a = s62Var;
        this.b = kl3Var;
    }
}
