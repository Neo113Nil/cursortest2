package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class gjw extends hjw {
    public final String a;
    public final List b;

    public gjw(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjw)) {
            return false;
        }
        gjw gjwVar = (gjw) obj;
        return this.a.equals(gjwVar.a) && jl40.l(this.b, gjwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
