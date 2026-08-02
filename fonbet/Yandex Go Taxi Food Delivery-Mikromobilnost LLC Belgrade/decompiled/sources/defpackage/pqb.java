package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pqb {
    public final int a;
    public final Boolean b;
    public final Text.Resource c;

    public pqb(int i, Boolean bool, Text.Resource resource) {
        this.a = i;
        this.b = bool;
        this.c = resource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqb)) {
            return false;
        }
        pqb pqbVar = (pqb) obj;
        return this.a == pqbVar.a && this.b.equals(pqbVar.b) && this.c.equals(pqbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "State(id=" + this.a + ", selected=" + this.b + ", label=" + this.c + Extension.C_BRAKE;
    }
}
