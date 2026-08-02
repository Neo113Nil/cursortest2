package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class gza0 {
    public final d0b0 a;
    public final z8i0 b;
    public final wrt c;
    public final boolean d;

    public /* synthetic */ gza0(d0b0 d0b0Var, z8i0 z8i0Var, wrt wrtVar, int i) {
        this(d0b0Var, z8i0Var, (i & 4) != 0 ? null : wrtVar, (i & 8) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza0)) {
            return false;
        }
        gza0 gza0Var = (gza0) obj;
        return jl40.l(this.a, gza0Var.a) && jl40.l(this.b, gza0Var.b) && jl40.l(this.c, gza0Var.c) && this.d == gza0Var.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wrt wrtVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (wrtVar == null ? 0 : wrtVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PermissionRequest(permissionType=" + this.a + ", rationaleDialog=" + this.b + ", goToSettingsDialog=" + this.c + ", requestOnce=" + this.d + Extension.C_BRAKE;
    }

    public gza0(d0b0 d0b0Var, z8i0 z8i0Var, wrt wrtVar, boolean z) {
        this.a = d0b0Var;
        this.b = z8i0Var;
        this.c = wrtVar;
        this.d = z;
    }
}
