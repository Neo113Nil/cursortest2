package xsna;

/* compiled from: NecessaryOnboarding.kt */
/* loaded from: classes17.dex */
public final class vz50 {
    public final jwe a;
    public final boolean b;

    public vz50(jwe jweVar, boolean z) {
        this.a = jweVar;
        this.b = z;
    }

    public final boolean a() {
        jwe jweVar = this.a;
        if (jweVar.f().j() && jweVar.f().f()) {
            return this.b || jweVar.f().f();
        }
        return false;
    }
}
