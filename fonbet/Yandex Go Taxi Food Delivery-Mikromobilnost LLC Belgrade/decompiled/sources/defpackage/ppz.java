package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ppz implements opz {
    public final String a;
    public final String b;
    public final List c;
    public final fpz d;

    public ppz(String str, String str2, List list, fpz fpzVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = fpzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppz)) {
            return false;
        }
        ppz ppzVar = (ppz) obj;
        return jl40.l(this.a, ppzVar.a) && jl40.l(this.b, ppzVar.b) && jl40.l(this.c, ppzVar.c) && jl40.l(this.d, ppzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("LootBoxContentLootBoxEntity(title=", this.a, ", separator=", this.b, ", gifts=");
        v.append(this.c);
        v.append(", takeAllButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
