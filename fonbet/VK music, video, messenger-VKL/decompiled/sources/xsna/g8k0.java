package xsna;

/* compiled from: BotSnackBarAdapter.kt */
/* loaded from: classes2.dex */
public final class g8k0 implements hfz {
    public final int b;
    public final String c;
    public final boolean d;
    public final qtd0 e;

    public g8k0(int i, String str, boolean z, qtd0 qtd0Var) {
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = qtd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8k0)) {
            return false;
        }
        g8k0 g8k0Var = (g8k0) obj;
        return this.b == g8k0Var.b && epx.f(this.c, g8k0Var.c) && this.d == g8k0Var.d && epx.f(this.e, g8k0Var.e);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        qtd0 qtd0Var = this.e;
        return b + (qtd0Var == null ? 0 : qtd0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarItem(id=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", showAvatar=");
        sb.append(this.d);
        sb.append(", profile=");
        return qq.f(sb, this.e, ')');
    }
}
