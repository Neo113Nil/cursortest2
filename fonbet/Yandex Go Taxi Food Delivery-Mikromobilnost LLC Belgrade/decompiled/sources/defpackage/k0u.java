package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k0u {
    public final j0u a;
    public final ldc b;
    public final Float c;
    public final ldc d;

    public k0u(j0u j0uVar, ldc ldcVar, Float f, ldc ldcVar2) {
        this.a = j0uVar;
        this.b = ldcVar;
        this.c = f;
        this.d = ldcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0u)) {
            return false;
        }
        k0u k0uVar = (k0u) obj;
        return this.a.equals(k0uVar.a) && jl40.l(this.b, k0uVar.b) && jl40.l(this.c, k0uVar.c) && jl40.l(this.d, k0uVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        Float f = this.c;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        ldc ldcVar2 = this.d;
        return hashCode3 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0);
    }

    public final String toString() {
        return "GraphicShapeState(geometry=" + this.a + ", color=" + this.b + ", borderWidth=" + this.c + ", borderColor=" + this.d + Extension.C_BRAKE;
    }
}
