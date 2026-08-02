package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ExecuteGetCommunityNotificationSettings.kt */
/* loaded from: classes4.dex */
public final class xqt {
    public final List<p3j0> a;
    public final int b;
    public final int c;

    public xqt() {
        this(null, 0, 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqt)) {
            return false;
        }
        xqt xqtVar = (xqt) obj;
        return epx.f(this.a, xqtVar.a) && this.b == xqtVar.b && this.c == xqtVar.c;
    }

    public final int hashCode() {
        List<p3j0> list = this.a;
        return Integer.hashCode(this.c) + shy.a(this.b, (list == null ? 0 : list.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetCommunityNotificationSettingsResult(settings=");
        sb.append(this.a);
        sb.append(", limit=");
        sb.append(this.b);
        sb.append(", connectedGroupsCount=");
        return vu5.b(sb, this.c, ')');
    }

    public xqt(ArrayList arrayList, int i, int i2, int i3) {
        arrayList = (i3 & 1) != 0 ? null : arrayList;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        this.a = arrayList;
        this.b = i;
        this.c = i2;
    }
}
