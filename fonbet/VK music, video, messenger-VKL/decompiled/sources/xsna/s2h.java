package xsna;

import java.util.ArrayList;

/* compiled from: CommunityEventsRepository.kt */
/* loaded from: classes5.dex */
public final class s2h {
    public final ArrayList a;
    public final int b;

    public s2h(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2h)) {
            return false;
        }
        s2h s2hVar = (s2h) obj;
        return this.a.equals(s2hVar.a) && this.b == s2hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityEventsResponse(items=");
        sb.append(this.a);
        sb.append(", count=");
        return vu5.b(sb, this.b, ')');
    }
}
