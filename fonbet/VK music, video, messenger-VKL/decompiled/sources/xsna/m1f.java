package xsna;

import com.vk.clips.reports.impl.data.ClipsReportCategory;
import com.vk.clips.reports.impl.data.ClipsReportReason;
import java.util.List;
import java.util.Map;

/* compiled from: ClipsReportState.kt */
/* loaded from: classes16.dex */
public final class m1f {
    public final Map<ClipsReportCategory, List<ClipsReportReason>> a;
    public final ClipsReportReason b;

    /* JADX WARN: Multi-variable type inference failed */
    public m1f(Map<ClipsReportCategory, ? extends List<? extends ClipsReportReason>> map, ClipsReportReason clipsReportReason) {
        this.a = map;
        this.b = clipsReportReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1f)) {
            return false;
        }
        m1f m1fVar = (m1f) obj;
        return epx.f(this.a, m1fVar.a) && this.b == m1fVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ClipsReportReason clipsReportReason = this.b;
        return hashCode + (clipsReportReason == null ? 0 : clipsReportReason.hashCode());
    }

    public final String toString() {
        return "ClipsReportState(data=" + this.a + ", selectedReason=" + this.b + ')';
    }
}
