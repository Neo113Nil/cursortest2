package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dwo {
    public final awo a;
    public final List b;

    public dwo(awo awoVar, ArrayList arrayList) {
        this.a = awoVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwo)) {
            return false;
        }
        dwo dwoVar = (dwo) obj;
        return jl40.l(this.a, dwoVar.a) && jl40.l(this.b, dwoVar.b);
    }

    public final int hashCode() {
        awo awoVar = this.a;
        int hashCode = (awoVar == null ? 0 : awoVar.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ExtendExpirationDateModel(action=" + this.a + ", options=" + this.b + Extension.C_BRAKE;
    }
}
