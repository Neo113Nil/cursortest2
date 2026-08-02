package xsna;

/* compiled from: SettingsScreenViewState.kt */
/* loaded from: classes7.dex */
public final class o3j0 implements lm50 {
    public final boolean b;
    public final b64 c;
    public final boolean d;
    public final zzi0 e;
    public final zzi0 f;
    public final zzi0 g;
    public final uzi0 h;
    public final g9k0 i;

    public o3j0(boolean z, b64 b64Var, boolean z2, zzi0 zzi0Var, zzi0 zzi0Var2, zzi0 zzi0Var3, uzi0 uzi0Var, g9k0 g9k0Var) {
        this.b = z;
        this.c = b64Var;
        this.d = z2;
        this.e = zzi0Var;
        this.f = zzi0Var2;
        this.g = zzi0Var3;
        this.h = uzi0Var;
        this.i = g9k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3j0)) {
            return false;
        }
        o3j0 o3j0Var = (o3j0) obj;
        return this.b == o3j0Var.b && epx.f(this.c, o3j0Var.c) && this.d == o3j0Var.d && epx.f(this.e, o3j0Var.e) && epx.f(this.f, o3j0Var.f) && epx.f(this.g, o3j0Var.g) && epx.f(this.h, o3j0Var.h) && epx.f(this.i, o3j0Var.i);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        b64 b64Var = this.c;
        int b = qoy.b((hashCode + (b64Var == null ? 0 : b64Var.a.hashCode())) * 31, 31, this.d);
        zzi0 zzi0Var = this.e;
        int hashCode2 = (b + (zzi0Var == null ? 0 : zzi0Var.hashCode())) * 31;
        zzi0 zzi0Var2 = this.f;
        int hashCode3 = (hashCode2 + (zzi0Var2 == null ? 0 : zzi0Var2.hashCode())) * 31;
        zzi0 zzi0Var3 = this.g;
        int hashCode4 = (this.h.hashCode() + ((hashCode3 + (zzi0Var3 == null ? 0 : zzi0Var3.hashCode())) * 31)) * 31;
        g9k0 g9k0Var = this.i;
        return hashCode4 + (g9k0Var != null ? g9k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SettingsScreenViewState(isSmartCropVisible=" + this.b + ", attachedClips=" + this.c + ", isAttachedClipsOnboardingVisible=" + this.d + ", compress=" + this.e + ", communityPost=" + this.f + ", userPost=" + this.g + ", ord=" + this.h + ", snackbar=" + this.i + ')';
    }
}
