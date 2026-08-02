package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class pwo {
    public final kc7 a;
    public final j820 b;
    public final s610 c;
    public final LinkedHashMap d;

    public pwo(kc7 kc7Var, j820 j820Var, s610 s610Var, LinkedHashMap linkedHashMap) {
        this.a = kc7Var;
        this.b = j820Var;
        this.c = s610Var;
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwo)) {
            return false;
        }
        pwo pwoVar = (pwo) obj;
        return this.a.equals(pwoVar.a) && this.b.equals(pwoVar.b) && this.c.equals(pwoVar.c) && this.d.equals(pwoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExtendedCacheResult(cacheResult=" + this.a + ", metaData=" + this.b + ", matchFields=" + this.c + ", partMetaData=" + this.d + Extension.C_BRAKE;
    }
}
