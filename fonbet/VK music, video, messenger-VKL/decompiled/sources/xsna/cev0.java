package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;

/* compiled from: VkProtectHintEventBuilder.kt */
/* loaded from: classes5.dex */
public final class cev0 extends zzg0 {
    public cev0(SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType) {
        super(true);
        SchemeStatSak$TypeVkConnectNavigationItem schemeStatSak$TypeVkConnectNavigationItem = new SchemeStatSak$TypeVkConnectNavigationItem(eventType, null, null, "unblock_protect_account_modal", null, null, null, null, 246, null);
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.UNBLOCK_PROTECT_ACCOUNT;
        SchemeStatSak$TypeAction a = SchemeStatSak$TypeAction.a.a(schemeStatSak$TypeVkConnectNavigationItem);
        this.f = schemeStatSak$EventScreen;
        this.g = a;
    }
}
