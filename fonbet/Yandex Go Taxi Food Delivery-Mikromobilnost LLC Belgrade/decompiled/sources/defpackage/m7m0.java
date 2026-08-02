package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m7m0 implements n7m0 {
    public final Text a;
    public final Text b;
    public final YbButtonView.a c;
    public final g d;

    public m7m0(Text text, Text text2, YbButtonView.a aVar, g gVar) {
        this.a = text;
        this.b = text2;
        this.c = aVar;
        this.d = gVar;
    }

    public final YbButtonView.a a() {
        return this.c;
    }

    public final g b() {
        return this.d;
    }

    public final Text c() {
        return this.b;
    }

    public final Text d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7m0)) {
            return false;
        }
        m7m0 m7m0Var = (m7m0) obj;
        return this.a.equals(m7m0Var.a) && this.b.equals(m7m0Var.b) && this.c.equals(m7m0Var.c) && this.d.equals(m7m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("Content(title=", this.a, ", subtitle=", this.b, ", buttonState=");
        p.append(this.c);
        p.append(", nameInputState=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
