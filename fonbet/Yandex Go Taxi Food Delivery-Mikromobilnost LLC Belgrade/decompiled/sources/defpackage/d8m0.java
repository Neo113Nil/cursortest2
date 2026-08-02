package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d8m0 implements qas0 {
    public final Text.Resource a;
    public final Text.Resource b;
    public final Text.Resource c;
    public final List d;

    public d8m0(Text.Resource resource, Text.Resource resource2, Text.Resource resource3, List list) {
        this.a = resource;
        this.b = resource2;
        this.c = resource3;
        this.d = list;
    }

    public final Text a() {
        return this.c;
    }

    public final Text b() {
        return this.b;
    }

    public final List c() {
        return this.d;
    }

    public final Text d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8m0)) {
            return false;
        }
        d8m0 d8m0Var = (d8m0) obj;
        return this.a.equals(d8m0Var.a) && this.b.equals(d8m0Var.b) && this.c.equals(d8m0Var.c) && this.d.equals(d8m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uw51.b(this.c, uw51.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ShowThemeSelector(title=" + this.a + ", subtitle=" + this.b + ", buttonText=" + this.c + ", themes=" + this.d + Extension.C_BRAKE;
    }
}
