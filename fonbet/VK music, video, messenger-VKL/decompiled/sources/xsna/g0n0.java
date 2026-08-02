package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vkontakte.android.R;

/* compiled from: SubscriptionsLink.kt */
/* loaded from: classes14.dex */
public final class g0n0 implements kss0 {
    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        return jh.h("(/video)?/subscriptions/all_authors", peq0Var, null, null, 14);
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        ydt0Var.v(context, context.getString(R.string.authors_catalog_screen_title), context.getString(R.string.authors_catalog_screen_search_hint), peq0Var.a.toString());
        return null;
    }
}
