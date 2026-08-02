package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.ClipVideoFile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowProductPin;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.xuu0;

/* compiled from: ClipVideoHolder.kt */
/* loaded from: classes4.dex */
public final class bfd implements xuu0.a {
    public final /* synthetic */ cfd a;

    public bfd(cfd cfdVar) {
        this.a = cfdVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xuu0.a
    public final void a(boolean z, boolean z2) {
        cfd cfdVar = this.a;
        ?? r2 = cfdVar.y0;
        if (!z) {
            zzq zzqVar = (zzq) r2.getValue();
            ClipVideoFile N7 = cfdVar.N7();
            String str = N7 != null ? N7.W : null;
            zzqVar.getClass();
            zzqVar.a(SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, null, null, str);
            return;
        }
        zzq zzqVar2 = (zzq) r2.getValue();
        ClipVideoFile N72 = cfdVar.N7();
        String str2 = N72 != null ? N72.W : null;
        zzqVar2.getClass();
        MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin = new MobileOfficialAppsFeedStat$TypeFeedShowProductPin(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, null, null, null, null, null, 62, null), z2 ? SchemeStat$FeedPinEntryPoint.TIMER : SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, null, str2, 4, null);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        UiTrackingScreen b = UiTracker.j.b();
        new iid0(c, SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, mobileOfficialAppsFeedStat$TypeFeedShowProductPin, 1)).q();
    }
}
