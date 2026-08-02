package xsna;

import com.vk.channels.api.Channel;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import java.util.Collections;

/* compiled from: ChannelMessagesLinkTracker.kt */
/* loaded from: classes16.dex */
public final class l3b {
    public final ixa a;

    public l3b(lxa lxaVar) {
        this.a = lxaVar;
    }

    public final void a(int i, String str, boolean z) {
        Channel b = this.a.b();
        if (b == null) {
            return;
        }
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL, SchemeStat$TypeAction.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CHANNEL_CLICK_ON_LINK_FROM_POST, null, Integer.valueOf((int) b.b), null, null, null, Long.valueOf(i), null, null, null, Boolean.valueOf(z), Collections.singletonList(new MobileOfficialAppsImStat$TypeImMessagingActionItemAttachment("link", str)), 954, null), 2)).q();
    }
}
