package xsna;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class pgg implements pzo {
    public final us2 a;
    public final int b;

    public pgg(us2 us2Var, int i) {
        this.a = us2Var;
        this.b = i;
    }

    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        boolean e = c2pVar.e();
        us2 us2Var = this.a;
        if (e) {
            c2pVar.f(c2pVar.d, c2pVar.e, us2Var.c);
        } else {
            c2pVar.f(c2pVar.b, c2pVar.c, us2Var.c);
        }
        int d = c2pVar.d();
        int i = this.b;
        int g = swe0.g(i > 0 ? (d + i) - 1 : (d + i) - us2Var.c.length(), 0, c2pVar.a.a());
        c2pVar.h(g, g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgg)) {
            return false;
        }
        pgg pggVar = (pgg) obj;
        return epx.f(this.a.c, pggVar.a.c) && this.b == pggVar.b;
    }

    public final int hashCode() {
        return (this.a.c.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.c);
        sb.append("', newCursorPosition=");
        return vu5.b(sb, this.b, ')');
    }

    public pgg(String str, int i) {
        this(new us2(str), i);
    }
}
