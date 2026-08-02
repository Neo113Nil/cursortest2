package xsna;

import java.util.Collection;

/* compiled from: UserPlacesEntityRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class spp<T> {
    public final Collection<T> a;
    public final Collection<Integer> b;

    /* JADX WARN: Multi-variable type inference failed */
    public spp(Collection<? extends T> collection, Collection<Integer> collection2) {
        this.a = collection;
        this.b = collection2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spp)) {
            return false;
        }
        spp sppVar = (spp) obj;
        return epx.f(this.a, sppVar.a) && epx.f(this.b, sppVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntitiesAndAbsentIds(entities=");
        sb.append(this.a);
        sb.append(", absentIds=");
        return l4.h(sb, this.b, ')');
    }
}
