package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class i5t0 implements j5t0 {
    public final List a;
    public final Set b;

    public i5t0(List list, Set set) {
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5t0)) {
            return false;
        }
        i5t0 i5t0Var = (i5t0) obj;
        return jl40.l(this.a, i5t0Var.a) && jl40.l(this.b, i5t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateMapObjects(addedObjects=" + this.a + ", removedObjects=" + this.b + Extension.C_BRAKE;
    }

    public i5t0() {
        this(EmptyList.a, EmptySet.a);
    }
}
