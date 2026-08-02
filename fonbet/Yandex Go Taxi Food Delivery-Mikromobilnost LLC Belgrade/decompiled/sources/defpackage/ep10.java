package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.root.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class ep10 extends ViewPager2.a {
    public final /* synthetic */ MerchantOffersFragment a;

    public ep10(MerchantOffersFragment merchantOffersFragment) {
        this.a = merchantOffersFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        wo10 bannersAdapter;
        tif0 tif0Var;
        List list;
        int i2;
        c9v c9vVar;
        MerchantOffersFragment merchantOffersFragment = this.a;
        bannersAdapter = merchantOffersFragment.getBannersAdapter();
        uo10 g = bannersAdapter.g(i);
        if (g != null) {
            b access$getViewModel = MerchantOffersFragment.access$getViewModel(merchantOffersFragment);
            tif0Var = merchantOffersFragment.timer;
            rp10 rp10Var = ((nq10) access$getViewModel.X()).b;
            if (rp10Var != null && (list = rp10Var.a) != null) {
                c9v c9vVar2 = access$getViewModel.I;
                String str = g.b;
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) c9vVar2.b;
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    i2 = -1;
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (jl40.l(((ro10) it.next()).b, str)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                String X = a.X(list, null, null, null, new ws00(23), 31);
                em3 em3Var = appAnalyticsReporter.N;
                LinkedHashMap t = x4e.t(3, "banner_id", str, "banner_ids", X);
                t.put("banner_index", Integer.valueOf(i3));
                em3Var.a.a("merchant_offers.stories_banner.shown", t);
                String str2 = (String) c9vVar2.c;
                if (str2 == null || str2.equals(str) || tif0Var == null) {
                    c9vVar = c9vVar2;
                } else {
                    Iterator it2 = list.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (jl40.l(((ro10) it2.next()).b, str2)) {
                            i2 = i4;
                            break;
                        }
                        i4++;
                    }
                    c9vVar = c9vVar2;
                    long j = ((ro10) list.get(i2)).i - tif0Var.e;
                    em3 em3Var2 = appAnalyticsReporter.N;
                    String valueOf = String.valueOf(j);
                    boolean z = tif0Var.f;
                    LinkedHashMap t2 = x4e.t(5, "banner_id", str2, "banner_ids", X);
                    t2.put("banner_index", Integer.valueOf(i2));
                    t2.put("duration", valueOf);
                    t2.put("is_hidden_by_time", Boolean.valueOf(z));
                    em3Var2.a.a("merchant_offers.stories_banner.hidden", t2);
                }
                c9vVar.c = str;
            }
        }
        merchantOffersFragment.updateStoryProgressBar(0);
        merchantOffersFragment.startPagerTimer();
    }
}
