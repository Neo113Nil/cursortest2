package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b800 {
    public final Text.Resource a;
    public final Text.Resource b;
    public final a800 c;
    public final a800 d;

    public b800(Text.Resource resource, Text.Resource resource2, a800 a800Var, a800 a800Var2) {
        this.a = resource;
        this.b = resource2;
        this.c = a800Var;
        this.d = a800Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b800)) {
            return false;
        }
        b800 b800Var = (b800) obj;
        return this.a.equals(b800Var.a) && this.b.equals(b800Var.b) && this.c.equals(b800Var.c) && this.d.equals(b800Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + uw51.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "State(title=" + this.a + ", description=" + this.b + ", leftPhoto=" + this.c + ", rightPhoto=" + this.d + Extension.C_BRAKE;
    }
}
