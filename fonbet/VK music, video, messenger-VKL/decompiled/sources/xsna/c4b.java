package xsna;

import android.content.Context;

/* compiled from: ChannelMonetizationNavigationManager.kt */
/* loaded from: classes16.dex */
public final class c4b {
    public static final String e;
    public static final String f;
    public final Context a;
    public final qdz b;
    public final com.vk.movika.sdk.base.logic.processor.actions.g c;
    public dw20 d;

    static {
        String str = "https://" + naz.e() + "/community_manage/?action=open_page&page_id=";
        e = fo8.a(str, "donut_levels&group_id=");
        f = fo8.a(str, "donut_select_payout_type&group_id=");
    }

    public c4b(Context context, qdz qdzVar, com.vk.movika.sdk.base.logic.processor.actions.g gVar) {
        this.a = context;
        this.b = qdzVar;
        this.c = gVar;
    }
}
