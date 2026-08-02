package xsna;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class kyi0 implements pzo {
    public final us2 a;
    public final int b;

    public kyi0(String str, int i) {
        this.a = new us2(str);
        this.b = i;
    }

    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        boolean e = c2pVar.e();
        us2 us2Var = this.a;
        if (e) {
            int i = c2pVar.d;
            c2pVar.f(i, c2pVar.e, us2Var.c);
            if (us2Var.c.length() > 0) {
                c2pVar.g(i, us2Var.c.length() + i);
            }
        } else {
            int i2 = c2pVar.b;
            c2pVar.f(i2, c2pVar.c, us2Var.c);
            if (us2Var.c.length() > 0) {
                c2pVar.g(i2, us2Var.c.length() + i2);
            }
        }
        int d = c2pVar.d();
        int i3 = this.b;
        int g = swe0.g(i3 > 0 ? (d + i3) - 1 : (d + i3) - us2Var.c.length(), 0, c2pVar.a.a());
        c2pVar.h(g, g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyi0)) {
            return false;
        }
        kyi0 kyi0Var = (kyi0) obj;
        return epx.f(this.a.c, kyi0Var.a.c) && this.b == kyi0Var.b;
    }

    public final int hashCode() {
        return (this.a.c.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.c);
        sb.append("', newCursorPosition=");
        return vu5.b(sb, this.b, ')');
    }
}
