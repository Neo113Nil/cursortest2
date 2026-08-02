package defpackage;

import com.yandex.go.payments.paymentlist.details.BannerIdInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class n9a0 {
    public final wnt a;
    public final cne0 b;

    public n9a0(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = dne0Var.a("payment_details_preferences");
    }

    public final BannerIdInfo a(String str) {
        try {
            return (BannerIdInfo) ((xnt) this.a).c(str, BannerIdInfo.Companion.serializer());
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(String str, boolean z, boolean z2) {
        Object obj;
        Boolean c;
        Integer b;
        cne0 cne0Var = this.b;
        Set n = cne0Var.n("FIELD_PAYMENT_BANNERS_INFO_SET");
        ArrayList arrayList = new ArrayList();
        Iterator it = n.iterator();
        while (it.hasNext()) {
            BannerIdInfo a = a((String) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        Set M0 = a.M0(arrayList);
        Iterator it2 = M0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (jl40.l(((BannerIdInfo) obj).getA(), str)) {
                    break;
                }
            }
        }
        BannerIdInfo bannerIdInfo = (BannerIdInfo) obj;
        int intValue = (bannerIdInfo == null || (b = bannerIdInfo.getB()) == null) ? 0 : b.intValue();
        if (z) {
            intValue++;
        }
        boolean booleanValue = (bannerIdInfo == null || (c = bannerIdInfo.getC()) == null) ? false : c.booleanValue();
        if (bannerIdInfo != null) {
            M0.remove(bannerIdInfo);
        }
        M0.add(new BannerIdInfo(str, Boolean.valueOf(z2 || booleanValue), Integer.valueOf(intValue)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = M0.iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(((xnt) this.a).e((BannerIdInfo) it3.next(), BannerIdInfo.Companion.serializer()));
        }
        cne0Var.t("FIELD_PAYMENT_BANNERS_INFO_SET", linkedHashSet);
    }
}
