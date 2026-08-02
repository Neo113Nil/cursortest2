package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dxr {
    public final String a;
    public final long b;
    public final String c;
    public final int d;
    public final boolean e;

    public dxr(int i, long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = i;
        this.e = z;
    }

    public final boolean a() {
        return jl40.l(this.a, "MAIN_FOLDER");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxr)) {
            return false;
        }
        dxr dxrVar = (dxr) obj;
        return jl40.l(this.a, dxrVar.a) && this.b == dxrVar.b && jl40.l(this.c, dxrVar.c) && this.d == dxrVar.d && this.e == dxrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + oyr.b(this.d, unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("FoldersItemEditorUiState(id=", this.a, ", organizationId=", this.b);
        l.append(", title=");
        l.append(this.c);
        l.append(", sortOrder=");
        l.append(this.d);
        return xra1.a(l, ", isFixed=", this.e, Extension.C_BRAKE);
    }
}
