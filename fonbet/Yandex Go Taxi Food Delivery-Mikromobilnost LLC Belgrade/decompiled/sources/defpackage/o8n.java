package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class o8n {
    public final String a;
    public final LinkedHashMap b;

    public o8n(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8n)) {
            return false;
        }
        o8n o8nVar = (o8n) obj;
        return this.a.equals(o8nVar.a) && this.b.equals(o8nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ParsedDynamicLink(path=" + this.a + ", queryParams=" + this.b + Extension.C_BRAKE;
    }
}
