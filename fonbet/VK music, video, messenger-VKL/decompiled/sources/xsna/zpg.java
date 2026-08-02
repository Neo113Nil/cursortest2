package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityAddContactsItemModel.kt */
/* loaded from: classes5.dex */
public final class zpg extends s4h {
    public final UserId b;
    public final ExtendedCommunityProfile.c c;
    public final String d;
    public final String e;
    public final String f;

    public zpg(UserId userId, ExtendedCommunityProfile.c cVar, String str, String str2, String str3) {
        this.b = userId;
        this.c = cVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpg)) {
            return false;
        }
        zpg zpgVar = (zpg) obj;
        return epx.f(this.b, zpgVar.b) && epx.f(this.c, zpgVar.c) && epx.f(this.d, zpgVar.d) && epx.f(this.e, zpgVar.e) && epx.f(this.f, zpgVar.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        ExtendedCommunityProfile.c cVar = this.c;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(false) + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityAddContactsItemModel(uid=");
        sb.append(this.b);
        sb.append(", selectedCity=");
        sb.append(this.c);
        sb.append(", phone=");
        sb.append(this.d);
        sb.append(", website=");
        sb.append(this.e);
        sb.append(", address=");
        return i5s.a(sb, this.f, ", shouldAddTopPadding=false)");
    }
}
