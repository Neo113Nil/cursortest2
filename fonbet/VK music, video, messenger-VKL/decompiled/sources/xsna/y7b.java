package xsna;

import android.content.Context;

/* compiled from: ChannelPayoutNavigationManager.kt */
/* loaded from: classes16.dex */
public final class y7b {
    public static final String d;
    public static final String e;
    public final Context a;
    public final qdz b;
    public final t5 c;

    static {
        String str = "https://" + naz.e() + "/community_manage/?action=open_page&page_id=";
        d = i5s.a(new StringBuilder("https://"), a0a.d, "/miniapps_vkpay#action=identify");
        e = fo8.a(str, "donut_select_payout_type&group_id=");
    }

    public y7b(Context context, qdz qdzVar, t5 t5Var) {
        this.a = context;
        this.b = qdzVar;
        this.c = t5Var;
    }
}
