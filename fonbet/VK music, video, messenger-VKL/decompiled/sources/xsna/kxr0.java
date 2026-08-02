package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import xsna.gzp0;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kxr0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kxr0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        VideoAutoPlay videoAutoPlay;
        Good good;
        Good good2;
        String str2;
        int i = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                lxr0 lxr0Var = (lxr0) obj5;
                Activity activity = (Activity) obj4;
                View view = (View) obj;
                ((Integer) obj3).getClass();
                VideoFile videoFile = lxr0Var.f;
                int i2 = ((e520) obj2).a;
                if (i2 == R.id.video_action_link_open) {
                    ActionLink m1 = videoFile.m1();
                    if (m1 != null) {
                        ActionLinkSnippet actionLinkSnippet = m1.f;
                        String str3 = m1.e;
                        boolean f = epx.f(m1.c, "product");
                        if (fxc0.B().J().z0() && f && actionLinkSnippet != null && (good2 = actionLinkSnippet.j) != null && (str2 = good2.K) != null) {
                            if (drm0.N(str2)) {
                                str2 = str3;
                            }
                            if (str2 != null) {
                                str = str2;
                                if (f && (fxc0.B().J().q() || fxc0.B().J().z0())) {
                                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                                    yg5 e = b.C1208b.a().e(videoFile, null);
                                    videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                                    if (videoAutoPlay != null) {
                                        d20 d20Var = (d20) lxr0Var.g.getValue();
                                        long j = (actionLinkSnippet == null || (good = actionLinkSnippet.j) == null) ? 0L : good.b;
                                        String str4 = videoAutoPlay.K;
                                        String type = videoFile.getType();
                                        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick.EventSubtype eventSubtype = fxc0.B().J().z0() ? MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick.EventSubtype.PRODUCT_CARD : MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick.EventSubtype.OLD_ACTION;
                                        long o0 = videoFile.o0();
                                        long j2 = videoFile.I0().b;
                                        d20Var.getClass();
                                        gzp0.a.c(new MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick.EventType.OVERLAY_LIVE_PRODUCT_CARD_CLICK, eventSubtype, new CommonVideoStat$TypeVsidItem(str4), j, type, 0, Long.valueOf(o0), Long.valueOf(j2)));
                                    }
                                }
                                new ilt0(videoFile.I0(), Integer.valueOf(videoFile.o0())).p();
                                maz.c(xwk.d().e(), activity, str, new LaunchContext(false, false, false, null, null, null, null, videoFile.r(), str, "video", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67107967), null, null, 24);
                            }
                        }
                        str = str3;
                        if (f) {
                            bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                            yg5 e2 = b.C1208b.a().e(videoFile, null);
                            if (e2 instanceof VideoAutoPlay) {
                            }
                            if (videoAutoPlay != null) {
                            }
                        }
                        new ilt0(videoFile.I0(), Integer.valueOf(videoFile.o0())).p();
                        maz.c(xwk.d().e(), activity, str, new LaunchContext(false, false, false, null, null, null, null, videoFile.r(), str, "video", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67107967), null, null, 24);
                    }
                } else if (i2 == R.id.video_action_link_remove) {
                    h7u0.a aVar = new h7u0.a(activity);
                    aVar.c0(android.R.string.yes, new dkc0(1, activity, videoFile));
                    aVar.W(android.R.string.no, null);
                    aVar.g0(R.string.video_action_link_remove_title);
                    aVar.U(R.string.video_action_link_remove_message);
                    aVar.m();
                } else if (i2 == R.id.video_action_link_stat) {
                    dw20 dw20Var = lxr0Var.b;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    kz20 kz20Var = lxr0Var.e;
                    VideoFile videoFile2 = kz20Var.g;
                    if (videoFile2 != null) {
                        jss0 jss0Var = new jss0(activity, videoFile2, kz20Var.e);
                        kz20Var.a = new WeakReference<>(jss0Var);
                        jss0Var.c();
                    }
                }
                lxr0Var.b(view);
                return s3q0.a;
            default:
                rbt0 rbt0Var = (rbt0) obj;
                int i3 = ((VideoSeason) obj5).b;
                int i4 = rbt0Var.a;
                return new c.s0.k(new mct0(i3, new k9x(i4, rbt0Var.b + i4, 1), ((com.vk.video.ui.discovery.minimizable.related_videos.e) obj4).c, rbt0Var.c, Collections.singletonList(rbt0Var), (VideoFile) obj2, (VideoFile) obj3));
        }
    }
}
