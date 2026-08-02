package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import xsna.wjh;

/* compiled from: CommunityProfileContentPlaceholderViewDelegate.kt */
/* loaded from: classes5.dex */
public final class lkh {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final gzs<s3q0> f;
    public final CommunityProfileContentItem.a g;
    public final Integer h;
    public final String i;
    public final String j;
    public final gzs<s3q0> k;

    public lkh() {
        this(null, null, null, null, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkh)) {
            return false;
        }
        lkh lkhVar = (lkh) obj;
        return epx.f(this.a, lkhVar.a) && epx.f(this.b, lkhVar.b) && epx.f(this.c, lkhVar.c) && epx.f(this.d, lkhVar.d) && epx.f(this.e, lkhVar.e) && epx.f(this.f, lkhVar.f) && epx.f(this.g, lkhVar.g) && epx.f(this.h, lkhVar.h) && epx.f(this.i, lkhVar.i) && epx.f(this.j, lkhVar.j) && epx.f(this.k, lkhVar.k);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        gzs<s3q0> gzsVar = this.f;
        int hashCode6 = (hashCode5 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        CommunityProfileContentItem.a aVar = this.g;
        int hashCode7 = (hashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num5 = this.h;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.i;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        gzs<s3q0> gzsVar2 = this.k;
        return hashCode10 + (gzsVar2 != null ? gzsVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfileContentPlaceholderConfig(topIconResId=");
        sb.append(this.a);
        sb.append(", textResId=");
        sb.append(this.b);
        sb.append(", buttonTextResId=");
        sb.append(this.c);
        sb.append(", buttonIconResId=");
        sb.append(this.d);
        sb.append(", buttonTestTag=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", buttonStyle=");
        sb.append(this.g);
        sb.append(", secondButtonTextResId=");
        sb.append(this.h);
        sb.append(", secondButtonText=");
        sb.append(this.i);
        sb.append(", secondButtonTestTag=");
        sb.append(this.j);
        sb.append(", secondButtonAction=");
        return uf3.d(sb, this.k, ')');
    }

    public lkh(Integer num, Integer num2, Integer num3, gzs gzsVar, CommunityProfileContentItem.a aVar, Integer num4, String str, wjh.e eVar, int i) {
        Integer valueOf = (i & 1) != 0 ? null : Integer.valueOf(R.drawable.vk_icon_illustration_antenna_light_56);
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        num3 = (i & 8) != 0 ? null : num3;
        String str2 = (i & 16) != 0 ? null : "EmptyContentAddButton";
        gzsVar = (i & 32) != 0 ? null : gzsVar;
        aVar = (i & 64) != 0 ? null : aVar;
        num4 = (i & 128) != 0 ? null : num4;
        str = (i & 256) != 0 ? null : str;
        String str3 = (i & 512) != 0 ? null : "EmptyContentSecondButton";
        eVar = (i & 1024) != 0 ? null : eVar;
        this.a = valueOf;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = str2;
        this.f = gzsVar;
        this.g = aVar;
        this.h = num4;
        this.i = str;
        this.j = str3;
        this.k = eVar;
    }
}
