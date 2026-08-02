package xsna;

import java.util.Date;

/* compiled from: CommunityScheduledClipsDatePickerOverlayData.kt */
/* loaded from: classes5.dex */
public final class k0i {
    public final Date a;
    public final Date b;
    public final Date c;
    public final x4c d;

    public k0i(Date date, Date date2, Date date3, x4c x4cVar) {
        this.a = date;
        this.b = date2;
        this.c = date3;
        this.d = x4cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0i)) {
            return false;
        }
        k0i k0iVar = (k0i) obj;
        return this.a.equals(k0iVar.a) && this.b.equals(k0iVar.b) && this.c.equals(k0iVar.c) && this.d.equals(k0iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommunityScheduledClipsDatePickerOverlayData(selectedDateInitial=" + this.a + ", minValidDate=" + this.b + ", maxValidDate=" + this.c + ", onPositiveButtonClick=" + this.d + ')';
    }
}
