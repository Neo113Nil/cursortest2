package xsna;

import com.vk.dto.common.Source;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.LinkedHashSet;

/* compiled from: DonutContactListCmdArgs.kt */
/* loaded from: classes2.dex */
public final class fzn {
    public final Source a;
    public final SortOrder b;
    public final boolean c;
    public final LinkedHashSet d;
    public final long e;

    public fzn(Source source, SortOrder sortOrder, boolean z, LinkedHashSet linkedHashSet, long j) {
        this.a = source;
        this.b = sortOrder;
        this.c = z;
        this.d = linkedHashSet;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzn)) {
            return false;
        }
        fzn fznVar = (fzn) obj;
        return this.a == fznVar.a && this.b == fznVar.b && this.c == fznVar.c && this.d.equals(fznVar.d) && this.e == fznVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutContactListCmdArgs(source=");
        sb.append(this.a);
        sb.append(", order=");
        sb.append(this.b);
        sb.append(", updateHints=");
        sb.append(this.c);
        sb.append(", extraMembers=");
        sb.append(this.d);
        sb.append(", donutOwnerId=");
        return vu5.a(')', this.e, sb);
    }
}
