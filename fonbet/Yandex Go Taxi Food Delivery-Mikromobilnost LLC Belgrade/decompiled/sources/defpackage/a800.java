package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a800 {
    public final rbv a;
    public final Text.Resource b;
    public final nbv c;

    public a800(rbv rbvVar, Text.Resource resource, nbv nbvVar) {
        this.a = rbvVar;
        this.b = resource;
        this.c = nbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a800)) {
            return false;
        }
        a800 a800Var = (a800) obj;
        return this.a.equals(a800Var.a) && this.b.equals(a800Var.b) && this.c.equals(a800Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Photo(image=" + this.a + ", description=" + this.b + ", descriptionIcon=" + this.c + Extension.C_BRAKE;
    }
}
