package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class anq0 {
    public final rbv a;
    public final List b;
    public final Text.Resource c;
    public final Text.Resource d;

    public anq0(rbv rbvVar, List list, Text.Resource resource, Text.Resource resource2) {
        this.a = rbvVar;
        this.b = list;
        this.c = resource;
        this.d = resource2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anq0)) {
            return false;
        }
        anq0 anq0Var = (anq0) obj;
        return this.a.equals(anq0Var.a) && this.b.equals(anq0Var.b) && this.c.equals(anq0Var.c) && this.d.equals(anq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uw51.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "State(image=" + this.a + ", items=" + this.b + ", title=" + this.c + ", description=" + this.d + Extension.C_BRAKE;
    }
}
