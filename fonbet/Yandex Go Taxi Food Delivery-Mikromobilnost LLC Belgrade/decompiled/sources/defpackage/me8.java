package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class me8 extends pe8 {
    public final Text a;
    public final Text b;
    public final rtz0 c;
    public final cp8 d;
    public final gf91 e;
    public final boolean f;

    public me8(Text.Constant constant, Text.Constant constant2, rtz0 rtz0Var, cp8 cp8Var, gf91 gf91Var, boolean z) {
        this.a = constant;
        this.b = constant2;
        this.c = rtz0Var;
        this.d = cp8Var;
        this.e = gf91Var;
        this.f = z;
    }

    public final gf91 a() {
        return this.e;
    }

    public final cp8 b() {
        return this.d;
    }

    public final boolean c() {
        return this.f;
    }

    public final Text d() {
        return this.b;
    }

    public final Text e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me8)) {
            return false;
        }
        me8 me8Var = (me8) obj;
        return jl40.l(this.a, me8Var.a) && jl40.l(this.b, me8Var.b) && jl40.l(this.c, me8Var.c) && this.d.equals(me8Var.d) && this.e.equals(me8Var.e) && this.f == me8Var.f;
    }

    public final rtz0 f() {
        return this.c;
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (text2 != null ? text2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("Content(title=", this.a, ", subtitle=", this.b, ", toolbarIcon=");
        p.append(this.c);
        p.append(", cardSkin=");
        p.append(this.d);
        p.append(", cardDetails=");
        p.append(this.e);
        p.append(", screenshotEnabled=");
        p.append(this.f);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
