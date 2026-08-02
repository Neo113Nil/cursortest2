package xsna;

import com.vk.clips.reports.impl.data.ClipsReportCategory;

/* compiled from: ClipsReportCategoryHeaderItem.kt */
/* loaded from: classes16.dex */
public final class e1f implements hfz {
    public final ClipsReportCategory b;

    public e1f(ClipsReportCategory clipsReportCategory) {
        this.b = clipsReportCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1f) && this.b == ((e1f) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.h().hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ClipsReportCategoryHeaderItem(category=" + this.b + ')';
    }
}
