package xsna;

import com.vk.profile.community.impl.ui.tag.CommunityActionTags;

/* compiled from: CommunityActionButtonModel.kt */
/* loaded from: classes5.dex */
public final class epg {
    public final String a;
    public final CommunityActionTags b;
    public final dpg c;
    public final dpg d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public epg(String str, CommunityActionTags communityActionTags, dpg dpgVar, dpg dpgVar2, int i, boolean z, boolean z2, int i2) {
        dpgVar = (i2 & 4) != 0 ? null : dpgVar;
        i = (i2 & 16) != 0 ? 0 : i;
        z = (i2 & 32) != 0 ? true : z;
        z2 = (i2 & 64) != 0 ? false : z2;
        this.a = str;
        this.b = communityActionTags;
        this.c = dpgVar;
        this.d = dpgVar2;
        this.e = i;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epg)) {
            return false;
        }
        epg epgVar = (epg) obj;
        return epx.f(this.a, epgVar.a) && this.b == epgVar.b && epx.f(this.c, epgVar.c) && epx.f(this.d, epgVar.d) && this.e == epgVar.e && this.f == epgVar.f && this.g == epgVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        dpg dpgVar = this.c;
        int hashCode2 = (hashCode + (dpgVar == null ? 0 : dpgVar.hashCode())) * 31;
        dpg dpgVar2 = this.d;
        return Boolean.hashCode(this.g) + qoy.b(shy.a(this.e, (hashCode2 + (dpgVar2 != null ? dpgVar2.hashCode() : 0)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityActionButtonModel(title=");
        sb.append(this.a);
        sb.append(", actionTag=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", smallButtonIcon=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", canBePrimary=");
        sb.append(this.f);
        sb.append(", isBookingEnabled=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
