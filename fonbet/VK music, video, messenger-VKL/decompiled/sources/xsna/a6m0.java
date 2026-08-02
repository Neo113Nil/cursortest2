package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoryMarketItemInfo.kt */
/* loaded from: classes5.dex */
public final class a6m0 {
    public final String a;
    public final Long b;
    public final UserId c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final vfv g;

    public a6m0(String str, Long l, UserId userId, String str2, String str3, String str4, vfv vfvVar) {
        this.a = str;
        this.b = l;
        this.c = userId;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = vfvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6m0)) {
            return false;
        }
        a6m0 a6m0Var = (a6m0) obj;
        return epx.f(this.a, a6m0Var.a) && epx.f(this.b, a6m0Var.b) && epx.f(this.c, a6m0Var.c) && epx.f(this.d, a6m0Var.d) && epx.f(this.e, a6m0Var.e) && epx.f(this.f, a6m0Var.f) && epx.f(this.g, a6m0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserId userId = this.c;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode5 = (hashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 961;
        String str2 = this.f;
        int b = qoy.b((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false);
        vfv vfvVar = this.g;
        return b + (vfvVar != null ? vfvVar.hashCode() : 0);
    }

    public final String toString() {
        return "StoryMarketItemInfo(title=" + this.a + ", productId=" + this.b + ", ownerId=" + this.c + ", link=" + this.d + ", subtitle=" + ((Object) this.e) + ", saleRate=null, imgUrl=" + this.f + ", isPriceListService=false, horizontalSticker=" + this.g + ')';
    }
}
