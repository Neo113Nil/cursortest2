package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n4u {
    public final jbv a;
    public final Text b;
    public final String c;
    public final String d;

    public n4u(jbv jbvVar, Text text, String str, String str2) {
        this.a = jbvVar;
        this.b = text;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4u)) {
            return false;
        }
        n4u n4uVar = (n4u) obj;
        return this.a.equals(n4uVar.a) && jl40.l(this.b, n4uVar.b) && jl40.l(this.c, n4uVar.c) && jl40.l(this.d, n4uVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(n.c(this.b, this.a.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(image=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", action=");
        return g8e.r(sb, this.c, ", guidelineType=", this.d, Extension.C_BRAKE);
    }
}
