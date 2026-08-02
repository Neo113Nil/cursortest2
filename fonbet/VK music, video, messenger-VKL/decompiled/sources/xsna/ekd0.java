package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import java.util.List;

/* compiled from: ProductCardCommunityInfoState.kt */
/* loaded from: classes18.dex */
public final class ekd0 {
    public final String a;
    public final String b;
    public final VerifyInfo c;
    public final boolean d;
    public final String e;
    public final Float f;
    public final Integer g;
    public final List<QuickMessageItem> h;
    public final OwnerResponseTime i;

    public ekd0(String str, String str2, VerifyInfo verifyInfo, boolean z, String str3, Float f, Integer num, List<QuickMessageItem> list, OwnerResponseTime ownerResponseTime) {
        this.a = str;
        this.b = str2;
        this.c = verifyInfo;
        this.d = z;
        this.e = str3;
        this.f = f;
        this.g = num;
        this.h = list;
        this.i = ownerResponseTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekd0)) {
            return false;
        }
        ekd0 ekd0Var = (ekd0) obj;
        return epx.f(this.a, ekd0Var.a) && epx.f(this.b, ekd0Var.b) && epx.f(this.c, ekd0Var.c) && this.d == ekd0Var.d && epx.f(this.e, ekd0Var.e) && epx.f(this.f, ekd0Var.f) && epx.f(this.g, ekd0Var.g) && epx.f(this.h, ekd0Var.h) && epx.f(this.i, ekd0Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = qoy.b((this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode2 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<QuickMessageItem> list = this.h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        OwnerResponseTime ownerResponseTime = this.i;
        return hashCode5 + (ownerResponseTime != null ? ownerResponseTime.hashCode() : 0);
    }

    public final String toString() {
        return "ProductCardCommunityInfoState(groupName=" + this.a + ", groupPhoto=" + this.b + ", verifyInfo=" + this.c + ", isMember=" + this.d + ", groupDescription=" + this.e + ", rating=" + this.f + ", ratingCount=" + this.g + ", quickMessageItems=" + this.h + ", ownerResponseTime=" + this.i + ')';
    }
}
