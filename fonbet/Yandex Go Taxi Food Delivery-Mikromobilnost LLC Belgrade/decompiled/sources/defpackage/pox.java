package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pox {
    public final Text.Resource a;
    public final nbv b;
    public final ColorModel.Attr c;

    public pox(Text.Resource resource, nbv nbvVar, ColorModel.Attr attr) {
        this.a = resource;
        this.b = nbvVar;
        this.c = attr;
    }

    public final ColorModel a() {
        return this.c;
    }

    public final rbv b() {
        return this.b;
    }

    public final Text c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pox)) {
            return false;
        }
        pox poxVar = (pox) obj;
        return this.a.equals(poxVar.a) && this.b.equals(poxVar.b) && this.c.equals(poxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Tip(text=" + this.a + ", icon=" + this.b + ", backgroundColor=" + this.c + Extension.C_BRAKE;
    }
}
