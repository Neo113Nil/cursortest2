package xsna;

import android.content.Context;
import com.ironsource.C4504q2;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.NotificationUtils;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.cf70;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ne70 implements izs {
    public final /* synthetic */ qe70 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ne70(qe70 qe70Var, UserId userId, boolean z) {
        this.b = qe70Var;
        this.c = userId;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qe70 qe70Var = this.b;
        qe70Var.o.b(vzi0.c.a);
        UserId userId = this.c;
        long j = userId.b;
        boolean z = this.d;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick(z ? MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Event.PUSH_ENABLED : MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Event.PUSH_DISABLED, MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Label.SELECTED_COMMUNITY_PUSHES, Long.valueOf(j), MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.LabelType.SELECTED), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        boolean z2 = NotificationUtils.a;
        if (BuildInfo.t()) {
            aaw.b.getClass();
            qaj0.c(aaw.c(), "are_notifications_enabled_for_" + NotificationUtils.Type.CommunityMessages + userId, Boolean.valueOf(z));
        } else {
            Preference.g(context).edit().putBoolean(C4504q2.x + NotificationUtils.Type.CommunityMessages.key + userId.b, z).apply();
        }
        qe70Var.T(new cf70.m(userId, z));
        return s3q0.a;
    }
}
