package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.ecomm.market.good.good2.presentation.IslandPart;

/* compiled from: ProductCardCommunityInfoViewState.kt */
/* loaded from: classes18.dex */
public final class ikd0 implements gld0 {
    public final String a;
    public final String b;
    public final VerifyInfo c;
    public final boolean d;
    public final String e;
    public final pse0 f;
    public final Float g;
    public final Integer h;
    public final IslandPart i;

    public ikd0(String str, String str2, VerifyInfo verifyInfo, boolean z, String str3, pse0 pse0Var, Float f, Integer num, IslandPart islandPart) {
        this.a = str;
        this.b = str2;
        this.c = verifyInfo;
        this.d = z;
        this.e = str3;
        this.f = pse0Var;
        this.g = f;
        this.h = num;
        this.i = islandPart;
    }

    @Override // xsna.gld0
    public final IslandPart U0() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikd0)) {
            return false;
        }
        ikd0 ikd0Var = (ikd0) obj;
        return epx.f(this.a, ikd0Var.a) && epx.f(this.b, ikd0Var.b) && epx.f(this.c, ikd0Var.c) && this.d == ikd0Var.d && epx.f(this.e, ikd0Var.e) && epx.f(this.f, ikd0Var.f) && epx.f(this.g, ikd0Var.g) && epx.f(this.h, ikd0Var.h) && this.i == ikd0Var.i;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = qoy.b((this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode2 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        pse0 pse0Var = this.f;
        int hashCode3 = (hashCode2 + (pse0Var == null ? 0 : pse0Var.hashCode())) * 31;
        Float f = this.g;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.h;
        return this.i.hashCode() + ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProductCardCommunityInfoViewState(groupName=" + this.a + ", groupPhoto=" + this.b + ", verifyInfo=" + this.c + ", isMember=" + this.d + ", groupDescription=" + this.e + ", quickMessagesInfo=" + this.f + ", rating=" + this.g + ", ratingCount=" + this.h + ", islandPart=" + this.i + ')';
    }
}
