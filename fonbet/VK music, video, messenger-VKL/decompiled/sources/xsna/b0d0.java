package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.toggle.Features;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PrefetchLoadingControllerImpl.kt */
/* loaded from: classes11.dex */
public final class b0d0 {
    public static final long b = TimeUnit.MINUTES.toMillis(5);
    public final long a;

    /* compiled from: PrefetchLoadingControllerImpl.kt */
    public static final class a implements m1q0 {
        @Override // xsna.m1q0
        public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
            if (uiTrackingScreen2.a == MobileOfficialAppsCoreNavStat$EventScreen.CLIPS) {
                Features.Type type = Features.Type.AB_PREFETCH_DEFAULT_OFF;
                type.getClass();
                if (com.vk.toggle.b.A.a(type)) {
                    List O0 = j5g.O0(uiTrackingScreen2.e);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : O0) {
                        if (obj instanceof SchemeStat$TypeClipViewerItem) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((SchemeStat$TypeClipViewerItem) it.next()).a() == SchemeStat$TypeClipViewerItem.ScreenType.TOP) {
                            }
                        }
                    }
                }
                Preference.F(qni0.a(), "prefetch_loading", "prefetch_loading_clips");
                return;
            }
            if (uiTrackingScreen2.a == MobileOfficialAppsCoreNavStat$EventScreen.STORY) {
                Preference.F(qni0.a(), "prefetch_loading", "prefetch_loading_stories");
            }
        }
    }

    public b0d0() {
        o2l.a.getClass();
        this.a = o2l.b("__dbg_use_cache_preload_test_ttl", false) ? b : TimeUnit.DAYS.toMillis(7L);
        UiTracker uiTracker = UiTracker.a;
        UiTracker.a(new a());
    }
}
