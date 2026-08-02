package xsna;

import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.List;
import java.util.Map;

/* compiled from: ProductsSelectionState.kt */
/* loaded from: classes18.dex */
public final class otd0 implements km50 {
    public final CommonMarketStat$TypeRefSource b;
    public final CommonMarketStat$TypeMarketContextContent.Type c;
    public final Integer d;
    public final Long e;
    public final List<SelectionProductId> f;
    public final List<kei0> g;
    public final int h;
    public final Map<Long, String> i;
    public final Throwable j;
    public final boolean k;

    public otd0(CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, CommonMarketStat$TypeMarketContextContent.Type type, Integer num, Long l, List<SelectionProductId> list, List<kei0> list2, int i, Map<Long, String> map, Throwable th, boolean z) {
        this.b = commonMarketStat$TypeRefSource;
        this.c = type;
        this.d = num;
        this.e = l;
        this.f = list;
        this.g = list2;
        this.h = i;
        this.i = map;
        this.j = th;
        this.k = z;
    }

    public static otd0 a(otd0 otd0Var, List list, int i, Throwable th, boolean z, int i2) {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = otd0Var.b;
        CommonMarketStat$TypeMarketContextContent.Type type = otd0Var.c;
        Integer num = otd0Var.d;
        Long l = otd0Var.e;
        List<SelectionProductId> list2 = otd0Var.f;
        if ((i2 & 32) != 0) {
            list = otd0Var.g;
        }
        List list3 = list;
        if ((i2 & 64) != 0) {
            i = otd0Var.h;
        }
        int i3 = i;
        Map<Long, String> map = otd0Var.i;
        if ((i2 & 256) != 0) {
            th = otd0Var.j;
        }
        Throwable th2 = th;
        boolean z2 = (i2 & 512) != 0 ? otd0Var.k : z;
        otd0Var.getClass();
        return new otd0(commonMarketStat$TypeRefSource, type, num, l, list2, list3, i3, map, th2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otd0)) {
            return false;
        }
        otd0 otd0Var = (otd0) obj;
        return this.b == otd0Var.b && this.c == otd0Var.c && epx.f(this.d, otd0Var.d) && epx.f(this.e, otd0Var.e) && epx.f(this.f, otd0Var.f) && epx.f(this.g, otd0Var.g) && this.h == otd0Var.h && epx.f(this.i, otd0Var.i) && epx.f(this.j, otd0Var.j) && this.k == otd0Var.k;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CommonMarketStat$TypeMarketContextContent.Type type = this.c;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.e;
        int a = shy.a(this.h, fw3.a(fw3.a((hashCode3 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f), 31, this.g), 31);
        Map<Long, String> map = this.i;
        int hashCode4 = (a + (map == null ? 0 : map.hashCode())) * 31;
        Throwable th = this.j;
        return Boolean.hashCode(this.k) + ((hashCode4 + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductsSelectionState(refSource=");
        sb.append(this.b);
        sb.append(", contextContentType=");
        sb.append(this.c);
        sb.append(", contextContentId=");
        sb.append(this.d);
        sb.append(", contextContentOwnerId=");
        sb.append(this.e);
        sb.append(", initialItemIds=");
        sb.append(this.f);
        sb.append(", items=");
        sb.append(this.g);
        sb.append(", cartCountValue=");
        sb.append(this.h);
        sb.append(", adsLabels=");
        sb.append(this.i);
        sb.append(", error=");
        sb.append(this.j);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
