package com.ybsdk.feature.merchant.offers.internal.screens.root;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.c9v;
import defpackage.em3;
import defpackage.jl40;
import defpackage.nq10;
import defpackage.ro10;
import defpackage.rp10;
import defpackage.tls;
import defpackage.uc5;
import defpackage.uo10;
import defpackage.ws00;
import defpackage.x4e;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MerchantOffersFragment$bannersAdapter$2$2 extends FunctionReferenceImpl implements tls {
    public MerchantOffersFragment$bannersAdapter$2$2(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onHeroBannerClick", "onHeroBannerClick(Lcom/ybsdk/feature/merchant/offers/internal/view/MerchantOffersBannerView$State;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List list;
        uo10 uo10Var = (uo10) obj;
        b bVar = (b) this.receiver;
        rp10 rp10Var = ((nq10) bVar.X()).b;
        if (rp10Var != null && (list = rp10Var.a) != null) {
            c9v c9vVar = bVar.I;
            String str = uo10Var.b;
            c9vVar.getClass();
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (jl40.l(((ro10) it.next()).b, str)) {
                    break;
                }
                i++;
            }
            String X = kotlin.collections.a.X(list, null, null, null, new ws00(22), 31);
            em3 em3Var = ((AppAnalyticsReporter) c9vVar.b).N;
            LinkedHashMap t = x4e.t(3, "banner_id", str, "banner_ids", X);
            t.put("banner_index", Integer.valueOf(i));
            em3Var.a.a("merchant_offers.stories_banner.click", t);
            bVar.h0(Uri.parse(uo10Var.e));
        }
        return zy11.a;
    }
}
