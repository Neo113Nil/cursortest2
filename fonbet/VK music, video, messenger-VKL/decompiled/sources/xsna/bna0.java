package xsna;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.vk.common.links.LinksParserData;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionStatus;
import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.UserType;
import com.vkontakte.android.R;
import xsna.gna0;
import xsna.tlo0;

/* compiled from: PinReviewManageServiceStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class bna0 implements izs<ana0, gna0> {
    public final sdz b;

    public bna0(sdz sdzVar) {
        this.b = sdzVar;
    }

    @Override // xsna.izs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gna0 invoke(ana0 ana0Var) {
        tlo0 h;
        n80 n80Var;
        rkn0 rkn0Var;
        rxm0 rxm0Var;
        mxm0 mxm0Var;
        SubscriptionStatus subscriptionStatus = ana0Var.l;
        js90 js90Var = ana0Var.o;
        if (ana0Var.g) {
            return gna0.c.b;
        }
        if (ana0Var.h) {
            return gna0.b.b;
        }
        String str = ana0Var.c;
        String str2 = ana0Var.d;
        String str3 = ana0Var.e;
        String str4 = js90Var != null ? js90Var.b.b : null;
        int i = cna0.$EnumSwitchMapping$0[subscriptionStatus.ordinal()];
        if (i == 1) {
            h = tq.h(tlo0.Companion, R.string.pin_review_subscription_active);
        } else if (i != 2) {
            tlo0.Companion.getClass();
            h = tlo0.c.a;
        } else {
            tlo0.a aVar = tlo0.Companion;
            if (str4 == null) {
                str4 = "";
            }
            aVar.getClass();
            h = tlo0.a.c(R.string.pin_review_subscription_active_until, str4);
        }
        g770 g770Var = null;
        String str5 = ana0Var.i;
        if (subscriptionStatus == SubscriptionStatus.Active) {
            String str6 = js90Var != null ? js90Var.a.b : null;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = js90Var != null ? js90Var.b.b : null;
            if (str7 == null) {
                str7 = "";
            }
            n80Var = new n80(str6, str7);
        } else {
            n80Var = null;
        }
        if (subscriptionStatus == SubscriptionStatus.Suspended) {
            String str8 = js90Var != null ? js90Var.a.b : null;
            if (str8 == null) {
                str8 = "";
            }
            rkn0Var = new rkn0(str8);
        } else {
            rkn0Var = null;
        }
        UserType userType = ana0Var.k;
        if (userType == UserType.Buyer) {
            String str9 = js90Var != null ? js90Var.c.a : null;
            rxm0Var = new rxm0(str9 != null ? str9 : "", js90Var != null ? js90Var.c.b : null, ana0Var.m);
        } else {
            rxm0Var = null;
        }
        if ((userType == UserType.NotBuyer || userType == UserType.BuyerWithoutRole) && (mxm0Var = ana0Var.n) != null) {
            g770Var = new g770(mxm0Var.a, (SpannableStringBuilder) this.b.d(mxm0Var.b, new LinksParserData(2, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)));
        }
        return new gna0.a(h, str5, str, str2, str3, rxm0Var, g770Var, n80Var, rkn0Var);
    }
}
