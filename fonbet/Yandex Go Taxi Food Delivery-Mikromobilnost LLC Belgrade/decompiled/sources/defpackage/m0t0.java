package defpackage;

import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m0t0 {
    public final Integer a;
    public final mgv b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final i3y f;

    public m0t0(Integer num, mgv mgvVar, boolean z, boolean z2, boolean z3) {
        this.a = num;
        this.b = mgvVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = a.a(new gas0(9, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0t0)) {
            return false;
        }
        m0t0 m0t0Var = (m0t0) obj;
        return jl40.l(this.a, m0t0Var.a) && jl40.l(this.b, m0t0Var.b) && this.c == m0t0Var.c && this.d == m0t0Var.d && this.e == m0t0Var.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        mgv mgvVar = this.b;
        return Boolean.hashCode(this.e) + unr0.e(unr0.e((hashCode + (mgvVar != null ? mgvVar.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarConnectionStatusState(textId=");
        sb.append(this.a);
        sb.append(", imageVector=");
        sb.append(this.b);
        sb.append(", isProgress=");
        nnm.v(", isFailed=", ", notNeedSnackBar=", sb, this.c, this.d);
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ m0t0(int i) {
        this(null, null, false, false, false);
    }

    public m0t0() {
        this(0);
    }
}
