package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.g;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pns extends rns {
    public final Text a;
    public final Text b;
    public final ahq0 c;
    public final g d;
    public final YbButtonViewGroup.b e;
    public final rr51 f;

    public pns(Text text, Text text2, ahq0 ahq0Var, g gVar, YbButtonViewGroup.b bVar, rr51 rr51Var) {
        this.a = text;
        this.b = text2;
        this.c = ahq0Var;
        this.d = gVar;
        this.e = bVar;
        this.f = rr51Var;
    }

    public final YbButtonViewGroup.b a() {
        return this.e;
    }

    public final rr51 b() {
        return this.f;
    }

    public final g c() {
        return this.d;
    }

    public final ahq0 d() {
        return this.c;
    }

    public final Text e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pns)) {
            return false;
        }
        pns pnsVar = (pns) obj;
        return this.a.equals(pnsVar.a) && this.b.equals(pnsVar.b) && jl40.l(this.c, pnsVar.c) && this.d.equals(pnsVar.d) && this.e.equals(pnsVar.e) && this.f.equals(pnsVar.f);
    }

    public final Text f() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("OpenAndBuyScreen(title=", this.a, ", subtitle=", this.b, ", selectedPaymentMethod=");
        p.append(this.c);
        p.append(", loadableInputState=");
        p.append(this.d);
        p.append(", buttonViewGroup=");
        p.append(this.e);
        p.append(", divBlock=");
        p.append(this.f);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
