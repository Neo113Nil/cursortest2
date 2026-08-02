package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.media.MediaUtils;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.storycamera.upload.VideoStoryUploadTask;
import com.vk.video.profile.presentation.a;
import com.vk.video.stability.api.di.VideoAppStabilityComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import xsna.dpt0;
import xsna.h7u0;
import xsna.kbl0;
import xsna.u440;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class orj0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ orj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BiometricsLockComponent) ((k7m) m7m.f((com.vk.pushes.notifications.base.a) this.c)).a(fpf0.a(BiometricsLockComponent.class))).b();
            case 1:
                com.vk.stickers.keyboard.page.a aVar = (com.vk.stickers.keyboard.page.a) this.c;
                aVar.l.invoke();
                List<? extends hfz> list = aVar.h;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(((hfz) obj) instanceof hhy)) {
                        arrayList.add(obj);
                    }
                }
                aVar.setItems(arrayList);
                return s3q0.a;
            case 2:
                adl0 adl0Var = (adl0) this.c;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                adl0Var.getClass();
                HashMap<UserId, kbl0> hashMap = kbl0.b;
                Preference.F(currentTimeMillis, kbl0.a.b().a, "stickers_recent_last_timestamp");
                Preference.I(kbl0.a.b().a, "stickers_recent_synced", true);
                return s3q0.a;
            case 3:
                qql0 qql0Var = (qql0) this.c;
                return new ftl0(new lpd(qql0Var, 10), qql0Var.a);
            case 4:
                StoryCameraActivity storyCameraActivity = (StoryCameraActivity) this.c;
                int i = StoryCameraActivity.G;
                return ((StoriesComponent) m7m.a(storyCameraActivity).a(fpf0.a(StoriesComponent.class))).L2();
            case 5:
                u440.b bVar = ((e2m0) this.c).a;
                return new MediaUtils.d(bVar.b(), bVar.a());
            case 6:
                x8m0 x8m0Var = (x8m0) this.c;
                x8m0Var.e.clear();
                j1d0 j1d0Var = (j1d0) x8m0Var.h.getValue();
                j1d0Var.c();
                ((Handler) j1d0Var.l.getValue()).removeCallbacksAndMessages(null);
                e1d0 e1d0Var = j1d0Var.g;
                synchronized (e1d0Var) {
                    try {
                        e1d0Var.b();
                        for (d1d0 d1d0Var : e1d0Var.a.values()) {
                            q1d0 q1d0Var = d1d0Var.c;
                            if (q1d0Var != null) {
                                q1d0Var.s.post(new o63(q1d0Var, 12));
                            }
                            d1d0Var.c = null;
                        }
                        e1d0Var.a.clear();
                        e1d0Var.b.clear();
                        e1d0Var.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                j1d0Var.j = null;
                return s3q0.a;
            case 7:
                Context context = ((vfm0) this.c).b.getContext();
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i2 = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i2) {
                    context = new l7s(context, dhr0.u().c);
                }
                int i3 = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.g0(R.string.cant_open_profile);
                c.U(R.string.try_again);
                c.c0(R.string.close, new rfm0());
                c.m();
                return s3q0.a;
            case 8:
                ((pwm0) this.c).b.invoke(new c.d(5, null, Boolean.FALSE, null));
                return s3q0.a;
            case 9:
                return ((e3n0) this.c).g;
            case 10:
                String str = (String) this.c;
                if (str == null || str.length() == 0) {
                    str = "unknown";
                }
                return new k5p0(str);
            case 11:
                wlp0 wlp0Var = (wlp0) this.c;
                if (epx.f(((zak0) wlp0Var.d).getValue(), wlp0Var.a.B()) && ((xak0) wlp0Var.g).i() == Long.MIN_VALUE && !((Boolean) ((zak0) wlp0Var.h).getValue()).booleanValue()) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 12:
                gzs gzsVar = (gzs) ((zak0) ((xpp0) this.c).j1).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 13:
                return UIBlockCatalog.Pb((UIBlockCatalog) this.c);
            case 14:
                return new peq0(Uri.parse(new Regex("c\\[([a-z]+)\\]=").g(URLDecoder.decode(((peq0) this.c).a.toString()), "c_$1=")));
            case 15:
                fpq0 fpq0Var = ((ynq0) this.c).h;
                return new lnq0(fpq0Var != null ? fpq0Var : null);
            case 16:
                ((jpr0) this.c).b();
                return s3q0.a;
            case 17:
                return (SeekPreviewImageView) ((VideoAutoPlaySeekBarLayout2) this.c).findViewById(R.id.seek_bar_preview);
            case 18:
                final VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) this.c;
                int i4 = VideoCatalogRootVh.M0;
                return new BroadcastReceiver() { // from class: com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh$notificationReceiver$2$1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        String action = intent.getAction();
                        if (action != null) {
                            int hashCode = action.hashCode();
                            if (hashCode != -1414915502) {
                                if (hashCode != 611799995 || !action.equals("com.vkontakte.android.FRIEND_REQUESTS_CHANGED")) {
                                    return;
                                }
                            } else if (!action.equals("com.vkontakte.android.COUNTERS_UPDATED")) {
                                return;
                            }
                            if (intent.getBooleanExtra("out", false)) {
                                return;
                            }
                            int i5 = VideoCatalogRootVh.M0;
                            VideoCatalogRootVh.this.u0();
                        }
                    }
                };
            case 19:
                VideoFragment videoFragment = (VideoFragment) this.c;
                int i5 = VideoFragment.c0;
                return (VideoShareComponent) m7m.d(videoFragment).a(fpf0.a(VideoShareComponent.class));
            case 20:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                int i6 = VideoMinimizableDiscoveryFragment.p1;
                return ((VideoAppStabilityComponent) videoMinimizableDiscoveryFragment.ko().r.getValue()).G7();
            case 21:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) this.c;
                return Boolean.valueOf((mVar.r || mVar.x || mVar.v) ? false : true);
            case 22:
                ((cys0) this.c).b0.invoke(new a.j0(false));
                return s3q0.a;
            case 23:
                ((hat0) this.c).g.Ff("video_quality_new");
                return s3q0.a;
            case 24:
                return ((StoryViewerComponent) ((k7m) m7m.f((VideoStoryUploadTask) this.c)).a(fpf0.a(StoryViewerComponent.class))).Me();
            case 25:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) this.c).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 26:
                ((dpt0.a) this.c).j.dispose();
                return s3q0.a;
            case 27:
                return Integer.valueOf(VideoView.G((VideoView) this.c));
            case 28:
                ((etv0) this.c).b(false);
                return s3q0.a;
            default:
                return (zia) ((xhu0) this.c).b.getValue();
        }
    }
}
