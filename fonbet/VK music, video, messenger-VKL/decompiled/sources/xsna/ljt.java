package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationBannerView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;

/* compiled from: GenericBannerTracker.kt */
/* loaded from: classes2.dex */
public final class ljt {
    public static void a(String str) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), valueOf, valueOf, null, new MobileOfficialAppsImStat$TypeImConversationBannerView(str, null), 8)).q();
    }
}
