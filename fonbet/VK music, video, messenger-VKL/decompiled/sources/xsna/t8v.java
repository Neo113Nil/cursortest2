package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: ImItemsUtils.kt */
/* loaded from: classes2.dex */
public final class t8v {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final el3<b5w> d;
    public final Set<Long> e;
    public final Set<Long> f;

    public t8v(ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, el3 el3Var, Set set, Set set2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = el3Var;
        this.e = set;
        this.f = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8v)) {
            return false;
        }
        t8v t8vVar = (t8v) obj;
        return this.a.equals(t8vVar.a) && this.b.equals(t8vVar.b) && this.c.equals(t8vVar.c) && this.d.equals(t8vVar.d) && epx.f(this.e, t8vVar.e) && epx.f(this.f, t8vVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fw3.b((this.d.hashCode() + uf3.b(this.c, uf3.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryStructureData(items=");
        sb.append(this.a);
        sb.append(", lastDialogsMessagesRaw=");
        sb.append(this.b);
        sb.append(", lastChannelsMessages=");
        sb.append(this.c);
        sb.append(", expired=");
        sb.append(this.d);
        sb.append(", dialogsIds=");
        sb.append(this.e);
        sb.append(", channelsIds=");
        return ur.c(sb, this.f, ')');
    }
}
