package xsna;

/* compiled from: VkTextStyle.kt */
/* loaded from: classes17.dex */
public final class frv0 {
    public static final frv0 d = new frv0((nmo0) null, 3);
    public final nmo0 a;
    public final boolean b;
    public boolean c;

    public frv0() {
        this((nmo0) null, 3);
    }

    public final frv0 a(frv0 frv0Var) {
        if (frv0Var == null) {
            return this;
        }
        return new frv0(this.a.d(frv0Var.a), frv0Var.b | this.b);
    }

    public final frv0 b(androidx.compose.runtime.a aVar) {
        frv0 a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1188232019, 0, -1, "com.vk.core.compose.theme.text.VkTextStyle.unscaled (VkTextStyle.kt:35)");
        }
        if (this.c) {
            aVar.K(-570327721);
            aVar.j();
            a = this;
        } else {
            aVar.K(-570320932);
            nmo0 nmo0Var = this.a;
            a = a(new frv0(new nmo0(0L, fz5.B(nmo0Var.a.b, aVar), null, null, 0L, null, null, 0, fz5.B(nmo0Var.b.c, aVar), null, null, 0, 16646141), 2));
            a.c = true;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frv0)) {
            return false;
        }
        frv0 frv0Var = (frv0) obj;
        return epx.f(this.a, frv0Var.a) && this.b == frv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkTextStyle(textStyle=");
        sb.append(this.a);
        sb.append(", isAllCaps=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public frv0(nmo0 nmo0Var, boolean z) {
        this.a = nmo0Var;
        this.b = z;
    }

    public frv0(nmo0 nmo0Var, int i) {
        this((i & 1) != 0 ? nmo0.d : nmo0Var, false);
    }
}
