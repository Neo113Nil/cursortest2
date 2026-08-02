package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hq00 implements iq00 {
    public final List a;
    public final Set b;

    public hq00(List list, Set set) {
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq00)) {
            return false;
        }
        hq00 hq00Var = (hq00) obj;
        return jl40.l(this.a, hq00Var.a) && jl40.l(this.b, hq00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateMapObjects(addedObjects=" + this.a + ", removedObjects=" + this.b + Extension.C_BRAKE;
    }

    public hq00() {
        this(EmptyList.a, EmptySet.a);
    }
}
