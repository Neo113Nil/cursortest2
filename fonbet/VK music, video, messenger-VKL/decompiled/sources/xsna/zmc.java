package xsna;

import android.app.Activity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.autoplay.b;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipClickDelegate.kt */
/* loaded from: classes16.dex */
public final class zmc {
    public final x0a a;
    public final gzs<List<VideoFile>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public zmc(x0a x0aVar, gzs<? extends List<? extends VideoFile>> gzsVar) {
        this.a = x0aVar;
        this.b = gzsVar;
    }

    public final void a(Activity activity, UIBlock uIBlock, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        int i;
        kwc kwcVar;
        List singletonList;
        if (uIBlock instanceof UIBlockVideo) {
            List<VideoFile> invoke = this.b.invoke();
            UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
            VideoFile videoFile = uIBlockVideo.B;
            String r1 = videoFile.r1();
            Iterator<VideoFile> it = invoke.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (epx.f(r1, it.next().r1())) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 == -1) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            String r = videoFile.r();
            if (r != null) {
                i = 2;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
            } else {
                i = 2;
            }
            String str = uIBlockVideo.b;
            String str2 = uIBlockVideo.z;
            ClipFeedTab.Search search = new ClipFeedTab.Search(str);
            if (invoke.isEmpty()) {
                kwcVar = new kwc(Collections.singletonList(g620.f().e0().c(videoFile)), (str2 == null || str2.length() == 0 || str2.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str2), 0);
            } else {
                List<VideoFile> list = invoke;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(g620.f().e0().c((VideoFile) it2.next()));
                }
                kwcVar = new kwc(arrayList, (str2 == null || str2.length() == 0 || str2.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(str2), intValue);
            }
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            y0a y0aVar = new y0a(b.C1208b.a().e(videoFile, null), this.a, videoFile, uIBlockVideo);
            if (fxc0.B().J().o1()) {
                ClipFeedTab[] clipFeedTabArr = new ClipFeedTab[i];
                clipFeedTabArr[0] = search;
                clipFeedTabArr[1] = ClipFeedTab.UserSubscriptions.b;
                singletonList = e43.l(clipFeedTabArr);
            } else {
                singletonList = Collections.singletonList(search);
            }
            ClipsRouter.c(g620.f().a(), activity, singletonList, y0aVar, kwcVar, fpf0.a(ClipFeedTab.Search.class), searchStatsLoggingInfo, null, false, null, 1984);
        }
    }
}
