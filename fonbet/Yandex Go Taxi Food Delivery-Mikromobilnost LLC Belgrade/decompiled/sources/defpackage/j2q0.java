package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class j2q0 {
    public static final i2q0 Companion = new i2q0();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(3)), null};
    public final String a;
    public final kr b;
    public final boolean c;

    public /* synthetic */ j2q0(int i, String str, kr krVar, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, h2q0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = krVar;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final kr a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j2q0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j2q0 j2q0Var = (j2q0) obj;
        return jl40.l(this.a, j2q0Var.a) && jl40.l(this.b, j2q0Var.b) && this.c == j2q0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kr krVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (krVar != null ? krVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionOnLoadMore(id='");
        sb.append(this.a);
        sb.append("', action=");
        sb.append(this.b);
        sb.append(", isDisabled=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
