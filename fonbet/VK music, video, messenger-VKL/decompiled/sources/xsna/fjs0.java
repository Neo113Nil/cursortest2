package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.Iterator;
import java.util.ListIterator;
import xsna.fgg0;

/* compiled from: VideoEntryServiceTracker.kt */
/* loaded from: classes17.dex */
public final class fjs0 {
    public FullSourceJoinApi.EntryServiceType a;
    public boolean b;

    public final void a() {
        FullSourceJoinApi.EntryServiceType entryServiceType;
        if (this.b) {
            return;
        }
        ComFeatures comFeatures = ComFeatures.COM_JOIN_FULL_SOURCE;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            this.b = true;
            Iterator it = new fgg0(j5g.O0(UiTracker.j.d)).iterator();
            do {
                ListIterator<T> listIterator = ((fgg0.a) it).b;
                entryServiceType = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                String a = com.vk.stat.scheme.t0.a(((UiTrackingScreen) listIterator.previous()).a);
                if (zm00.i(a, "feed")) {
                    entryServiceType = FullSourceJoinApi.EntryServiceType.FEED;
                } else if (zm00.i(a, "search")) {
                    entryServiceType = FullSourceJoinApi.EntryServiceType.SEARCH;
                } else if (zm00.i(a, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                    entryServiceType = FullSourceJoinApi.EntryServiceType.PROFILE;
                } else if (zm00.i(a, "im")) {
                    entryServiceType = FullSourceJoinApi.EntryServiceType.MESSAGES;
                } else if (zm00.i(a, "group")) {
                    entryServiceType = FullSourceJoinApi.EntryServiceType.COMMUNITY;
                } else if (zm00.i(a, "super_app")) {
                    entryServiceType = FullSourceJoinApi.EntryServiceType.VIDEO;
                }
            } while (entryServiceType == null);
            this.a = entryServiceType;
        }
    }
}
