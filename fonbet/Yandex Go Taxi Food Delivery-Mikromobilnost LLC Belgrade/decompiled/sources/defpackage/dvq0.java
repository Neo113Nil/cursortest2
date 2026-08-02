package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dvq0 {
    public final String a;
    public final LinkedHashMap b;

    public dvq0(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvq0)) {
            return false;
        }
        dvq0 dvq0Var = (dvq0) obj;
        return jl40.l(this.a, dvq0Var.a) && this.b.equals(dvq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServiceConfigModel(service=" + this.a + ", ratioByStatus=" + this.b + Extension.C_BRAKE;
    }
}
