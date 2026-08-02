package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.Collections;
import xsna.x2b0;

/* compiled from: PlayerNavigationAnalyticsTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class y2b0 implements x2b0 {
    public final z2b0 a = new z2b0();

    @Override // xsna.x2b0
    public final void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType, boolean z) {
        z2b0 z2b0Var = this.a;
        z2b0Var.a = mobileOfficialAppsCoreNavStat$EventScreen;
        z2b0Var.b = eventType;
        z2b0Var.c = z;
    }

    @Override // xsna.x2b0
    public final void d(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z) {
        CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2;
        SchemeStat$TypeNavgo a;
        z2b0 z2b0Var = this.a;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = z2b0Var.a;
        x2b0.b bVar = (mobileOfficialAppsCoreNavStat$EventScreen3 == null || (eventType = z2b0Var.b) == null) ? null : new x2b0.b(new CommonAudioStat$TypeAudioUiNavigationItem(eventType), mobileOfficialAppsCoreNavStat$EventScreen3, z2b0Var.c);
        if (bVar == null || (bVar.c ^ z)) {
            return;
        }
        z2b0Var.a = null;
        z2b0Var.b = null;
        z2b0Var.c = false;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen4 = bVar.b;
        SchemeStat$TypeNavgo.Subtype subtype = SchemeStat$TypeNavgo.Subtype.GO;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            UiTracker uiTracker = UiTracker.a;
            mobileOfficialAppsCoreNavStat$EventScreen2 = UiTracker.c();
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
        }
        a = SchemeStat$TypeNavgo.a.a(subtype, mobileOfficialAppsCoreNavStat$EventScreen2, new String(), null, null, (r18 & 32) != 0 ? null : Collections.singletonList(SchemeStat$NavigationScreenInfoItem.a.a(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, null, 510, null))), (r18 & 64) != 0 ? null : str == null ? null : new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, str, null, 38, null), null, bVar.a);
        new ne50(mobileOfficialAppsCoreNavStat$EventScreen4, a).q();
    }
}
