package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class fwn {
    public final Text a;
    public final Text b;
    public final rbv c;

    public fwn(Text text, Text text2, rbv rbvVar) {
        this.a = text;
        this.b = text2;
        this.c = rbvVar;
    }

    public final Text a() {
        return this.b;
    }

    public final rbv b() {
        return this.c;
    }

    public final Text c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwn)) {
            return false;
        }
        fwn fwnVar = (fwn) obj;
        return this.a.equals(fwnVar.a) && this.b.equals(fwnVar.b) && jl40.l(this.c, fwnVar.c);
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        rbv rbvVar = this.c;
        return c + (rbvVar == null ? 0 : rbvVar.hashCode());
    }

    public final String toString() {
        StringBuilder p = n.p("EmptyListInfoEntity(title=", this.a, ", description=", this.b, ", image=");
        p.append(this.c);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
