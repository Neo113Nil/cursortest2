package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.placeholder.UiBlockOnboardingBannerVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.narratives.Narrative;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.metrics.eventtracking.Event;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.HashSet;
import java.util.LinkedHashMap;
import one.video.controls.views.ControlsIcon;
import xsna.pwh;
import xsna.w1g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wy0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        if (r0 != 3) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                jwh jwhVar = (jwh) obj3;
                vwh vwhVar = (vwh) obj2;
                int i2 = ((y1g0) ((w1g0.n) obj)).b;
                k4g0 k4g0Var = vwhVar.i.get(Integer.valueOf(i2));
                if (k4g0Var != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(vwhVar.i);
                    linkedHashMap.put(Integer.valueOf(i2), k4g0.a(k4g0Var, true, false, 3967));
                    jwhVar.T(new pwh.l(linkedHashMap));
                }
                break;
            case 2:
                Bundle bundle = (Bundle) obj;
                wba N = ((GlobalSearchAllCatalogRootVh) obj3).m.b.s.N();
                HashSet hashSet = iah0.a;
                break;
            case 3:
                UiBlockOnboardingBannerVh uiBlockOnboardingBannerVh = (UiBlockOnboardingBannerVh) obj3;
                SchemeStat$EventItem schemeStat$EventItem = UiBlockOnboardingBannerVh.f;
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) ((UIBlock) obj2);
                uiBlockOnboardingBannerVh.b(uIBlockPlaceholder, (UIBlockActionSwitchSection) obj);
                int i3 = UiBlockOnboardingBannerVh.a.$EnumSwitchMapping$0[uiBlockOnboardingBannerVh.c.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        break;
                    } else {
                        UiBlockOnboardingBannerVh.a(MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.EventType.HIDE_BANNER).q();
                    }
                    break;
                }
                SchemeStat$EventItem schemeStat$EventItem2 = UiBlockOnboardingBannerVh.f;
                CommonOnboardingStat$TypeOnboardingEvent.EventType eventType = CommonOnboardingStat$TypeOnboardingEvent.EventType.CLOSE;
                String str = uIBlockPlaceholder.q;
                if (str == null) {
                    str = "";
                }
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, new CommonOnboardingStat$TypeOnboardingEvent(UiBlockOnboardingBannerVh.g, eventType, str, -1, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
            case 4:
                smq.f(((xsq0) obj3).a.l, (Context) obj2, (Narrative) obj, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                break;
            default:
                VideoView videoView = (VideoView) obj3;
                Activity activity = (Activity) obj2;
                Context context = (Context) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                try {
                    boolean I0 = videoView.I0();
                    thu0 thu0Var = new thu0(activity);
                    thu0Var.setVisibility(8);
                    thu0Var.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(48.0f), iah0.a(48.0f)));
                    videoView.addView(thu0Var);
                    try {
                        wvv.b(wvv.a, new aw5(1, context, thu0Var), 0L, 0L, 14);
                    } catch (IllegalArgumentException unused) {
                    }
                    videoView.getViewBinding().u.Q4(ControlsIcon.CHROME_CAST, !I0);
                    videoView.o = true;
                    videoView.n = thu0Var;
                } catch (IllegalArgumentException e) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a aVar = new Event.a();
                    aVar.g("cast_button_transparent_color");
                    aVar.i("FirebaseTracker");
                    bVar.k(aVar.e());
                    bVar.a(e);
                }
                break;
        }
        return s3q0.a;
    }
}
