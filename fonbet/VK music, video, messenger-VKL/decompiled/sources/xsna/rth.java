package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.SchemeStat$TypeShareItem;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CommunityProfileShareResultFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class rth {
    public final UserId a;
    public final String b;

    public rth(zah zahVar, UserId userId, String str) {
        this.a = userId;
        this.b = str;
    }

    public final void a(CommunityProfileAction.r rVar) {
        Set<String> keySet;
        String str;
        Object obj;
        String name;
        Bundle extras = rVar.b.getExtras();
        if (extras == null || (keySet = extras.keySet()) == null) {
            return;
        }
        for (String str2 : keySet) {
            Iterator<E> it = SchemeStat$TypeShareItem.ShareType.h().iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (cqm0.m(((SchemeStat$TypeShareItem.ShareType) obj).name()).equals(str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SchemeStat$TypeShareItem.ShareType shareType = (SchemeStat$TypeShareItem.ShareType) obj;
            CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType = CommonCommunitiesStat$ClickEvent.ClickEventType.SHARE_TO_MESSAGE;
            CommonCommunitiesStat$ClickEvent.Source source = CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR;
            if (shareType != null && (name = shareType.name()) != null) {
                str = cqm0.m(name);
            }
            zah.a(this.a, clickEventType, source, this.b, str);
        }
    }
}
