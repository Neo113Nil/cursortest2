package xsna;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsSubscriptionItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.lwv;
import xsna.mwv;

/* compiled from: ImClipSubscriptionClickAnalytics.kt */
/* loaded from: classes5.dex */
public final class czv extends bxv<ldd> implements lwv.b {
    public static final a c = new a();

    /* compiled from: ImClipSubscriptionClickAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof ldd;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof ldd)) {
            return false;
        }
        a((ldd) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ldd lddVar) {
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype eventSubtype;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(lddVar.a), Long.valueOf(lddVar.b), null, null, null, 56, null);
        SchemeStat$TypeClipViewerItem.ScreenType screenType = SchemeStat$TypeClipViewerItem.ScreenType.SUBSCRIPTIONS;
        SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_SUBSCRIPTION_BUTTON;
        boolean z = lddVar.c;
        if (z) {
            eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.SUBSCRIBE;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.UNSUBSCRIBE;
        }
        bxv.c(this, schemeStat$EventItem, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsSubscriptionItem(MobileOfficialAppsClipsStat$ClipsSubscriptionItem.SubscriptionPlace.IM_CHAT, eventSubtype), null, null, null, null, null, null, 1065353212, null), 2);
    }
}
