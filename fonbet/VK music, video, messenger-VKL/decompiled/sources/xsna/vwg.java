package xsna;

import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import xsna.tlo0;

/* compiled from: CommunityCheckListTipItem.kt */
/* loaded from: classes18.dex */
public final class vwg implements hfz {
    public final CommunityCheckListTip.Type b;
    public final tlo0.h c;
    public final boolean d;
    public final String e;
    public final String f;

    public vwg(CommunityCheckListTip.Type type, tlo0.h hVar, boolean z, String str, String str2) {
        this.b = type;
        this.c = hVar;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwg)) {
            return false;
        }
        vwg vwgVar = (vwg) obj;
        return this.b == vwgVar.b && this.c.equals(vwgVar.c) && this.d == vwgVar.d && epx.f(this.e, vwgVar.e) && epx.f(this.f, vwgVar.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(qoy.b(u11.c(this.b.hashCode() * 31, 31, this.c.a), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCheckListTipItem(type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", isCompleted=");
        sb.append(this.d);
        sb.append(", miniAppLink=");
        sb.append(this.e);
        sb.append(", internalLink=");
        return ho8.a(sb, this.f, ')');
    }
}
