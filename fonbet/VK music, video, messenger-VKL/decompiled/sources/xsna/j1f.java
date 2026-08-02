package xsna;

import com.vk.clips.reports.impl.data.ClipsReportCategory;
import com.vk.clips.reports.impl.data.ClipsReportReason;

/* compiled from: ClipsReportReasonItem.kt */
/* loaded from: classes16.dex */
public final class j1f implements hfz {
    public final ClipsReportCategory b;
    public final ClipsReportReason c;
    public final boolean d;

    public j1f(ClipsReportCategory clipsReportCategory, ClipsReportReason clipsReportReason, boolean z) {
        this.b = clipsReportCategory;
        this.c = clipsReportReason;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1f)) {
            return false;
        }
        j1f j1fVar = (j1f) obj;
        return this.b == j1fVar.b && this.c == j1fVar.c && this.d == j1fVar.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c.h());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsReportReasonItem(category=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
