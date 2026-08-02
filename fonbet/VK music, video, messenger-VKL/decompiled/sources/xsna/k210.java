package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: MarketItemReviewItem.kt */
/* loaded from: classes18.dex */
public final class k210 {
    public static final h210 a(n210 n210Var, int i, boolean z, boolean z2) {
        big0 big0Var = n210Var.d;
        String str = n210Var.f;
        String str2 = n210Var.g;
        String str3 = n210Var.h;
        Context context = e43.a;
        String str4 = null;
        if (context == null) {
            context = null;
        }
        SpannableStringBuilder c = nig0.c(context, str, str2, str3);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        odo0 odo0Var = new odo0(c, nig0.b(context2, str, str2, str3), n210Var.i);
        if (z2) {
            String str5 = big0Var.d;
            String str6 = big0Var.e;
            if (str5 != null && str6 != null) {
                str4 = drm0.p0(str5 + ' ' + str6).toString();
            }
            if (str4 == null) {
                str4 = "";
            }
        } else {
            str4 = big0Var.g;
        }
        String str7 = str4;
        int i2 = n210Var.a;
        long j = n210Var.b;
        String str8 = big0Var.b;
        vhg0 vhg0Var = new vhg0(str7, n210Var.e, tq.h(tlo0.Companion, R.string.market_item_review_description), false, null, false, false, 244);
        List<y2u0> list = n210Var.j;
        dce0 dce0Var = new dce0(a020.r(n210Var.c));
        boolean z3 = n210Var.o;
        return new h210(i2, j, big0Var.a, str8, vhg0Var, new ugg0(list, dce0Var, odo0Var, z3), n210Var.k, n210Var.l, z3, i, z, z2);
    }
}
