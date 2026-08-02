package xsna;

import java.util.List;
import java.util.Set;
import xsna.jge;

/* compiled from: ClipsInterestsPatch.kt */
/* loaded from: classes16.dex */
public final class mhe implements com.vk.clips.interests.impl.feature.b {
    public final List<jge.a> b;
    public final List<jge.b> c;
    public final Set<fld> d;

    public mhe(List list, Set set, List list2) {
        this.b = list;
        this.c = list2;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhe)) {
            return false;
        }
        mhe mheVar = (mhe) obj;
        return epx.f(this.b, mheVar.b) && epx.f(this.c, mheVar.c) && epx.f(this.d, mheVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InterestsSuccess(items=");
        sb.append(this.b);
        sb.append(", suggestedSubcategories=");
        sb.append(this.c);
        sb.append(", selectedIds=");
        return ur.c(sb, this.d, ')');
    }
}
