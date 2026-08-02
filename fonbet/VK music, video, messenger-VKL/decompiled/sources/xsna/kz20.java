package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import xsna.ebs0;
import xsna.n4;
import xsna.osp;
import xsna.r5;

/* compiled from: ModalDialogsController.kt */
/* loaded from: classes2.dex */
public final class kz20 {
    public WeakReference<e88> a = new WeakReference<>(null);
    public WeakReference<w6s0> b = new WeakReference<>(null);
    public WeakReference<jgt0> c = new WeakReference<>(null);
    public WeakReference<androidx.appcompat.app.d> d = new WeakReference<>(null);
    public final b e = new b();
    public final Object f;
    public VideoFile g;
    public String h;
    public final ebs0 i;
    public final Object j;
    public final Object k;
    public final Object l;
    public static final a m = new a();
    private static final kz20 STUB = new kz20(new VideoFileOld(), ebs0.a.a.getSTUB());

    /* compiled from: ModalDialogsController.kt */
    public static final class a {
        public final kz20 getSTUB() {
            return kz20.STUB;
        }
    }

    /* compiled from: ModalDialogsController.kt */
    public final class b implements dz20 {
        public int b;

        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.dz20] */
        @Override // xsna.dz20
        public final void Ff(String str) {
            ?? r0 = kz20.this.f;
            if (r0 != 0) {
                r0.Ff(str);
            }
            this.b++;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.dz20] */
        @Override // xsna.dz20
        public final void Qc(String str) {
            ?? r0 = kz20.this.f;
            if (r0 != 0) {
                r0.Qc(str);
            }
            this.b--;
        }
    }

    public kz20(ebs0 ebs0Var) {
        com.vk.movika.sdk.base.logic.interactor.l lVar = new com.vk.movika.sdk.base.logic.interactor.l(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, lVar);
        int i = 21;
        this.k = msy.a(lazyThreadSafetyMode, new f20(i));
        this.l = msy.a(lazyThreadSafetyMode, new wb1(i));
        this.i = ebs0Var;
    }

    public static void c(kz20 kz20Var, FragmentActivity fragmentActivity, VideoFile videoFile, String str, NotificationsPermission notificationsPermission, vit0 vit0Var, u9t0 u9t0Var, gzs gzsVar, hfs0 hfs0Var, com.vk.video.ui.share.api.a aVar, com.vk.video.ui.share.api.b bVar, wzs wzsVar, wou wouVar, rcg0 rcg0Var, ows0 ows0Var, int i) {
        wzs wzsVar2 = (i & 1024) != 0 ? null : wzsVar;
        nto0 vo5Var = (i & 2048) != 0 ? new vo5(videoFile) : wouVar;
        rcg0 rcg0Var2 = (i & 4096) != 0 ? null : rcg0Var;
        ows0 ows0Var2 = (i & 8192) != 0 ? null : ows0Var;
        VideoFile videoFile2 = kz20Var.g;
        if (videoFile2 == null) {
            return;
        }
        yks0 yks0Var = new yks0(videoFile, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_ABOUT), str);
        obh obhVar = new obh(fragmentActivity, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        androidx.lifecycle.f I0 = new r5.a(fragmentActivity, videoFile2, new n4(fragmentActivity, new mz20(gzsVar), new n4.b(msy.a(lazyThreadSafetyMode, new wnh(fragmentActivity, 25)), msy.a(lazyThreadSafetyMode, obhVar), notificationsPermission, vit0Var, u9t0Var, null, vo5Var, hfs0Var, rcg0Var2, aVar, bVar, ows0Var2, null, null, msy.a(lazyThreadSafetyMode, new nef(fragmentActivity, 20))), yks0Var, kz20Var, wzsVar2, null, null, null), notificationsPermission, vit0Var, yks0Var, new sim(kz20Var, 21), new hvz(kz20Var, 9), rcg0Var2).I0("about_video_bottom_sheet");
        kz20Var.a = new WeakReference<>(I0 instanceof e88 ? (e88) I0 : null);
    }

    public final boolean b() {
        return this.e.b > 0;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(Activity activity) {
        String str;
        Good good;
        String str2;
        ActionLinkSnippet actionLinkSnippet;
        Good good2;
        VideoFile videoFile = this.g;
        if (videoFile != null) {
            ActionLink m1 = videoFile.m1();
            if (fxc0.B().J().z0()) {
                if (epx.f(m1 != null ? m1.c : null, "product") && !videoFile.t0()) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    yg5 e = b.C1208b.a().e(videoFile, null);
                    VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                    if (videoAutoPlay != null) {
                        d20 d20Var = (d20) this.l.getValue();
                        ActionLink m12 = videoFile.m1();
                        long j = (m12 == null || (actionLinkSnippet = m12.f) == null || (good2 = actionLinkSnippet.j) == null) ? 0L : good2.b;
                        String str3 = videoAutoPlay.K;
                        String type = videoFile.getType();
                        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventSubtype eventSubtype = fxc0.B().J().z0() ? MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventSubtype.PRODUCT_CARD : MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventSubtype.OLD_ACTION;
                        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null);
                        long o0 = videoFile.o0();
                        long j2 = videoFile.I0().b;
                        d20Var.getClass();
                        d20.b(j, str3, type, schemeStat$EventItem, eventSubtype, o0, j2);
                    }
                    ActionLinkSnippet actionLinkSnippet2 = m1.f;
                    String str4 = m1.e;
                    if (actionLinkSnippet2 != null && (good = actionLinkSnippet2.j) != null && (str2 = good.K) != null) {
                        if (drm0.N(str2)) {
                            str2 = str4;
                        }
                        if (str2 != null) {
                            str = str2;
                            String str5 = str;
                            maz.c(xwk.d().e(), activity, str5, new LaunchContext(false, false, false, null, null, null, null, videoFile.r(), str5, "live", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67107967), null, null, 24);
                            return;
                        }
                    }
                    str = str4;
                    String str52 = str;
                    maz.c(xwk.d().e(), activity, str52, new LaunchContext(false, false, false, null, null, null, null, videoFile.r(), str52, "live", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67107967), null, null, 24);
                    return;
                }
            }
            lxr0 lxr0Var = new lxr0(activity, this.e, this, videoFile);
            this.a = new WeakReference<>(lxr0Var);
            lxr0Var.c();
        }
    }

    public final void e(Activity activity, gzs<s3q0> gzsVar, boolean z, rcg0 rcg0Var) {
        VideoFile videoFile = this.g;
        if (videoFile == null || videoFile.Y3().isEmpty()) {
            return;
        }
        androidx.lifecycle.f I0 = new osp.a(activity, videoFile, z, new foi(this, 26), new n1i(this, 24), gzsVar, rcg0Var, false, null, null).I0("episode_bottom_sheet");
        this.a = new WeakReference<>(I0 instanceof e88 ? (e88) I0 : null);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(FragmentActivity fragmentActivity, String str, sks0 sks0Var, y6s0 y6s0Var, boolean z, boolean z2, boolean z3, UserId userId, rcg0 rcg0Var, boolean z4, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, VideoScreenMode videoScreenMode, hfs0 hfs0Var, com.vk.video.ui.share.api.b bVar, VideoAlbum videoAlbum) {
        UserId userId2;
        VideoFile videoFile = this.g;
        if (videoFile == null) {
            return;
        }
        Owner s = videoFile.s();
        if (s == null || (userId2 = s.b) == null) {
            userId2 = UserId.d;
        }
        s6s0 s6s0Var = new s6s0(videoFile, str, userId2, new nz20(this), false, this.h, false, z, false, videoAlbum != null ? Integer.valueOf(videoAlbum.b) : null, videoAlbum != null ? videoAlbum.c : null, sks0Var, mobileOfficialAppsCoreNavStat$EventScreen.name(), z2, rcg0Var, z4, videoScreenMode, false, hfs0Var, bVar, userId, z3, 17378752);
        if (((Boolean) this.j.getValue()).booleanValue()) {
            w6s0 w6s0Var = new w6s0(s6s0Var, y6s0Var);
            w6s0Var.e(fragmentActivity);
            this.b = new WeakReference<>(w6s0Var);
        } else {
            e6s0 e6s0Var = new e6s0(fragmentActivity, s6s0Var, y6s0Var);
            e6s0Var.c();
            this.a = new WeakReference<>(e6s0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Activity activity, yks0 yks0Var, VideoEmbedFragment videoEmbedFragment, Integer num, Boolean bool) {
        ww50<?> Y;
        FragmentImpl h = yks0.h(yks0Var, activity, videoEmbedFragment, num != null ? new ReplyInfo(num.intValue(), null) : null, activity.getResources().getString(R.string.video_comments_title), Boolean.valueOf(!BuildInfo.q()), bool, false, 8194);
        if (h != 0) {
            ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
            if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                Y.j(new lz20(Y, h, this));
            }
            this.a = new WeakReference<>(h instanceof e88 ? (e88) h : null);
        }
    }

    public final void i(FragmentActivity fragmentActivity, gzs<s3q0> gzsVar) {
        if (this.g != null) {
            this.d = new WeakReference<>(bfs0.d(fragmentActivity, 0, this.e, new jz20(0, gzsVar), 6));
        }
    }

    public kz20(VideoFile videoFile, ebs0 ebs0Var) {
        com.vk.movika.sdk.base.logic.interactor.l lVar = new com.vk.movika.sdk.base.logic.interactor.l(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, lVar);
        int i = 21;
        this.k = msy.a(lazyThreadSafetyMode, new f20(i));
        this.l = msy.a(lazyThreadSafetyMode, new wb1(i));
        this.g = videoFile;
        this.i = ebs0Var;
    }

    public kz20(VideoFile videoFile, ebs0 ebs0Var, dz20 dz20Var) {
        com.vk.movika.sdk.base.logic.interactor.l lVar = new com.vk.movika.sdk.base.logic.interactor.l(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, lVar);
        int i = 21;
        this.k = msy.a(lazyThreadSafetyMode, new f20(i));
        this.l = msy.a(lazyThreadSafetyMode, new wb1(i));
        this.g = videoFile;
        this.i = ebs0Var;
        this.f = dz20Var;
    }
}
