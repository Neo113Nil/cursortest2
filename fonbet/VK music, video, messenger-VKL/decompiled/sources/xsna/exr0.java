package xsna;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.media.player.action.VideoSeekAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import com.vk.video.ui.share.api.ScreenMode;
import com.vk.video.ui.share.api.ShareItemType;
import com.vk.video.ui.share.api.ShareSource;
import com.vk.video.ui.share.api.StatsArguments;
import com.vk.video.ui.share.api.VideoShareArguments;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;
import one.video.smartcast.api.ConnectionState;
import xsna.fgt0;
import xsna.h7u0;
import xsna.i8z;
import xsna.kz20;
import xsna.mut0;
import xsna.o1b0;
import xsna.q1g0;
import xsna.q1g0.b;

/* compiled from: VideoActionHandler.kt */
/* loaded from: classes17.dex */
public final class exr0 {
    public final a a;
    public final cyr0 b;
    public final bpn0 c = new bpn0(new wmd0(this, 16));
    public final bpn0 d = new bpn0(new a8j0(10));

    /* compiled from: VideoActionHandler.kt */
    public interface a {
        u9t0 L();

        com.vk.video.ui.share.api.b S();

        NotificationsPermission V();

        yks0 W();

        SearchStatsLoggingInfo a();

        default ows0 b() {
            return null;
        }

        void c();

        default wzs<Boolean, String, s3q0> d() {
            return null;
        }

        default gzs<s3q0> e() {
            return null;
        }

        default gzs<VideoAlbum> f() {
            return null;
        }

        ljt0 g();

        vit0 g0();

        FragmentActivity getActivity();

        View getView();

        default zet0 h() {
            return null;
        }

        y6s0 i();

        kz20 j();

        default wzs<Boolean, String, s3q0> k() {
            return null;
        }

        default MobileOfficialAppsCoreNavStat$EventScreen l() {
            return MobileOfficialAppsCoreNavStat$EventScreen.OTHER;
        }

        com.vk.video.kidsprofile.restricteduseractions.a m();

        v3t0 m0();

        hfs0 n();

        AdsDataProvider o();

        default gzs<s3q0> p() {
            return null;
        }

        com.vk.video.ui.share.api.a p0();
    }

    /* compiled from: VideoActionHandler.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoSeekAction.Source.values().length];
            try {
                iArr[VideoSeekAction.Source.Slider.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoSeekAction.Source.PreciseSlider.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoSeekAction.Source.DoubleTap.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public exr0(a aVar) {
        this.a = aVar;
        this.b = new cyr0(aVar);
    }

    public final void a() {
        gzs<s3q0> p;
        a aVar = this.a;
        if (e5o.a(aVar.W().e) && ((Boolean) this.c.getValue()).booleanValue() && (p = aVar.p()) != null) {
            ((b1z) p).invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /* JADX WARN: Type inference failed for: r1v229, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(dbs0 dbs0Var) {
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3;
        VideoSeekEventSource videoSeekEventSource;
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b32;
        String str;
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b33;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b34;
        List<one.video.player.tracks.a> F;
        one.video.player.tracks.a aVar;
        one.video.player.tracks.a M;
        Integer a2;
        OneVideoPlayer a3;
        Integer a4;
        cms0 cms0Var;
        FrameSize b2;
        Integer a5;
        ArrayList arrayList;
        Integer a6;
        List<one.video.player.tracks.c> k0;
        boolean z;
        OneVideoPlayer a7;
        LinkedHashMap a8;
        String str2;
        Boolean valueOf;
        Boolean bool;
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b35;
        one.video.player.tracks.a M2;
        OneVideoPlayer a9;
        List<one.video.player.tracks.a> F2;
        cms0 cms0Var2;
        FrameSize b4;
        a aVar2 = this.b.a;
        a aVar3 = this.a;
        aVar3.j().g = aVar3.W().e;
        SearchStatsLoggingInfo a10 = aVar3.a();
        VideoMinimizableState videoMinimizableState = null;
        FrameSize frameSize = null;
        String str3 = null;
        videoMinimizableState = null;
        if (a10 != null) {
            String str4 = a10.f;
            VideoFile videoFile = aVar3.W().e;
            if (epx.f(videoFile.r(), str4)) {
                MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = dbs0Var.equals(mhs0.a) ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT : dbs0Var.equals(dss0.a) ? videoFile.O9() ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNLIKE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LIKE_OUT : dbs0Var.equals(kgt0.a) ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT : dbs0Var.equals(yzr0.a) ? videoFile.j0() ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME_OUT : dbs0Var.equals(t6t0.a) ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT : dbs0Var.equals(kst0.a) ? videoFile.X() ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT : dbs0Var.equals(uit0.a) ? videoFile.U() ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT : null;
                if (action != null) {
                    SchemeStat$TypeClick Ab = a10.Ab(action, str4);
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, Ab, uzp0Var.a).q();
                }
            }
        }
        final boolean z2 = false;
        if (!(dbs0Var instanceof b1t0)) {
            if (dbs0Var instanceof y0t0) {
                d3b0 d3b0Var = ((y0t0) dbs0Var).a;
                VideoFile videoFile2 = aVar2.W().e;
                OneVideoPlayer a11 = d3b0Var.a();
                if (a11 == null || (k0 = a11.k0()) == null) {
                    arrayList = null;
                } else {
                    List<one.video.player.tracks.c> list = k0;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cms0) ((one.video.player.tracks.c) it.next()).c).b());
                    }
                }
                OneVideoPlayer a12 = d3b0Var.a();
                List a13 = bat0.a(videoFile2, arrayList, a12 != null ? a12.j() : null);
                OneVideoPlayer a14 = d3b0Var.a();
                if (a14 != null && (a6 = vm80.a(a14)) != null) {
                    r11 = a6.intValue();
                }
                kz20 j = aVar2.j();
                dat0 dat0Var = new dat0(aVar2.getActivity(), d3b0Var, j.i, j.e, r11, a13, aVar2.W().e.w4().a());
                j.a = new WeakReference<>(dat0Var);
                dat0Var.c();
                return;
            }
            if (dbs0Var instanceof x0t0) {
                d3b0 d3b0Var2 = ((x0t0) dbs0Var).a;
                OneVideoPlayer a15 = d3b0Var2.a();
                one.video.player.tracks.c E = a15 != null ? a15.E() : null;
                OneVideoPlayer a16 = d3b0Var2.a();
                if (a16 != null && (a5 = vm80.a(a16)) != null) {
                    r11 = a5.intValue();
                }
                kz20 j2 = aVar2.j();
                FragmentActivity activity = aVar2.getActivity();
                if (E != null && (cms0Var = (cms0) E.c) != null && (b2 = cms0Var.b()) != null) {
                    r11 = b2.getHeight();
                }
                hat0 hat0Var = new hat0(activity, d3b0Var2, r11, j2.i, j2.e);
                j2.a = new WeakReference<>(hat0Var);
                hat0Var.c();
                return;
            }
            if (dbs0Var instanceof z0t0) {
                d3b0 d3b0Var3 = ((z0t0) dbs0Var).a;
                kz20 j3 = aVar2.j();
                jat0 jat0Var = new jat0(aVar2.getActivity(), d3b0Var3, j3.i, j3.e);
                j3.a = new WeakReference<>(jat0Var);
                jat0Var.c();
                return;
            }
            if (dbs0Var instanceof cat0) {
                cat0 cat0Var = (cat0) dbs0Var;
                d3b0 d3b0Var4 = cat0Var.a;
                int i = cat0Var.b;
                if (fxc0.B().J().l0()) {
                    if ((i != 144 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? i != 4320 ? null : FrameSize._4320p : FrameSize._2160p : FrameSize._1440p : FrameSize._1080p : FrameSize._720p : FrameSize._480p : FrameSize._360p : FrameSize._240p : FrameSize._144p) != null) {
                        fxc0.B().w(i);
                    } else {
                        fxc0.B().h0(QualitySettingsType.AUTO);
                        cyr0.a(new fat0(d3b0Var4, null));
                    }
                }
                OneVideoPlayer a17 = d3b0Var4.a();
                if (i == ((a17 == null || (a4 = vm80.a(a17)) == null) ? -1 : a4.intValue()) || i == -1 || (a3 = d3b0Var4.a()) == null) {
                    return;
                }
                vm80.c(a3, i);
                return;
            }
            if (dbs0Var instanceof fat0) {
                cyr0.a((fat0) dbs0Var);
                return;
            }
            if (dbs0Var instanceof d1t0) {
                d3b0 d3b0Var5 = ((d1t0) dbs0Var).a;
                OneVideoPlayer a18 = d3b0Var5.a();
                if (a18 == null) {
                    return;
                }
                kz20 j4 = aVar2.j();
                yit0 yit0Var = new yit0(aVar2.getActivity(), d3b0Var5, j4.i, j4.e, a18.Q(), a18.Y());
                j4.a = new WeakReference<>(yit0Var);
                yit0Var.c();
                return;
            }
            if (dbs0Var instanceof xit0) {
                xit0 xit0Var = (xit0) dbs0Var;
                OneVideoPlayer a19 = xit0Var.a.a();
                if (a19 == null) {
                    return;
                }
                if (!xit0Var.c) {
                    a19.t();
                    return;
                }
                one.video.player.tracks.b bVar = (one.video.player.tracks.b) j5g.b0(xit0Var.b, a19.Y());
                if (bVar != null) {
                    a19.z(bVar);
                    return;
                }
                return;
            }
            if (dbs0Var instanceof c1t0) {
                d3b0 d3b0Var6 = ((c1t0) dbs0Var).a;
                boolean W9 = aVar2.W().e.W9();
                kz20 j5 = aVar2.j();
                FragmentActivity activity2 = aVar2.getActivity();
                OneVideoPlayer a20 = d3b0Var6.a();
                xht0 xht0Var = new xht0(activity2, d3b0Var6, j5.i, j5.e, a20 != null ? a20.b() : 1.0f, !W9);
                j5.a = new WeakReference<>(xht0Var);
                xht0Var.c();
                return;
            }
            if (dbs0Var instanceof wht0) {
                wht0 wht0Var = (wht0) dbs0Var;
                float f = wht0Var.b;
                OneVideoPlayer a21 = wht0Var.a.a();
                if (a21 != null) {
                    a21.setPlaybackSpeed(f);
                }
                aVar2.m0().a(Float.valueOf(f));
                return;
            }
            if (dbs0Var instanceof e1t0) {
                e1t0 e1t0Var = (e1t0) dbs0Var;
                sr10 sr10Var = dy2.a;
                Boolean g = sr10Var != null ? sr10Var.g() : null;
                if (g != null) {
                    boolean booleanValue = g.booleanValue();
                    kz20 j6 = aVar2.j();
                    vlt0 vlt0Var = new vlt0(aVar2.getActivity(), e1t0Var.a, j6.i, j6.e, booleanValue);
                    j6.a = new WeakReference<>(vlt0Var);
                    vlt0Var.c();
                    return;
                }
                return;
            }
            if (dbs0Var instanceof cet0) {
                cet0 cet0Var = (cet0) dbs0Var;
                d3b0 d3b0Var7 = cet0Var.a;
                boolean z3 = cet0Var.b;
                sr10 sr10Var2 = dy2.a;
                if (sr10Var2 != null) {
                    sr10Var2.k(z3);
                    s3q0 s3q0Var = s3q0.a;
                }
                OneVideoPlayer a22 = d3b0Var7.a();
                if (a22 != null && (a2 = vm80.a(a22)) != null) {
                    r11 = a2.intValue();
                }
                OneVideoPlayer a23 = d3b0Var7.a();
                if (a23 != null) {
                    if (z3) {
                        o1b0.a.getClass();
                        frameSize = o1b0.a.b;
                    }
                    rm80.c(a23, frameSize);
                }
                OneVideoPlayer a24 = d3b0Var7.a();
                if (a24 != null) {
                    vm80.c(a24, r11);
                    return;
                }
                return;
            }
            if (dbs0Var instanceof q0t0) {
                d3b0 d3b0Var8 = ((q0t0) dbs0Var).a;
                OneVideoPlayer a25 = d3b0Var8.a();
                if (a25 == null || (M = a25.M()) == null) {
                    return;
                }
                kz20 j7 = aVar2.j();
                r2s0 r2s0Var = new r2s0(aVar2.getActivity(), d3b0Var8, j7.i, j7.e, M, a25.F());
                j7.a = new WeakReference<>(r2s0Var);
                r2s0Var.c();
                return;
            }
            if (dbs0Var instanceof r3t0) {
                r3t0 r3t0Var = (r3t0) dbs0Var;
                d3b0 d3b0Var9 = r3t0Var.a;
                OneVideoPlayer a26 = d3b0Var9.a();
                if (a26 == null || (F = a26.F()) == null || (aVar = (one.video.player.tracks.a) j5g.b0(r3t0Var.b, F)) == null) {
                    return;
                }
                d3b0Var9.q(aVar);
                return;
            }
            if (dbs0Var instanceof v0t0) {
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                d3b0 v0 = b.C1208b.a().e(((v0t0) dbs0Var).a, null).v0();
                if (v0 == null) {
                    return;
                }
                kz20 j8 = aVar2.j();
                jat0 jat0Var2 = new jat0(aVar2.getActivity(), v0, j8.i, j8.e);
                j8.a = new WeakReference<>(jat0Var2);
                jat0Var2.c();
                return;
            }
            if (dbs0Var.equals(u0t0.a)) {
                kz20 j9 = aVar3.j();
                FragmentActivity activity3 = aVar3.getActivity();
                VideoFile videoFile3 = aVar3.W().e;
                String str5 = aVar3.W().b;
                NotificationsPermission V = aVar3.V();
                vit0 g0 = aVar3.g0();
                u9t0 L = aVar3.L();
                aVar3.m().getClass();
                kz20.c(j9, activity3, videoFile3, str5, V, g0, L, new avj0(this, 15), aVar3.n(), aVar3.p0(), aVar3.S(), null, null, null, aVar3.b(), 3072);
                return;
            }
            if (dbs0Var.equals(r0t0.a)) {
                c(DiscoveryAction.c.a, aVar3.W().e);
                if (fxc0.B().b0().e(aVar3.W().e)) {
                    cvk.u(R.string.video_deleted_by_owner, false);
                    return;
                } else {
                    aVar3.j().g(aVar3.getActivity(), aVar3.W(), null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : Boolean.TRUE);
                    return;
                }
            }
            if (dbs0Var.equals(t0t0.a)) {
                kz20 j10 = aVar3.j();
                FragmentActivity activity4 = aVar3.getActivity();
                cqr0 cqr0Var = new cqr0(this, 1);
                aVar3.m().getClass();
                j10.e(activity4, cqr0Var, false, null);
                return;
            }
            if (dbs0Var.equals(w0t0.a) || dbs0Var.equals(pws0.a)) {
                return;
            }
            int i2 = 4;
            if (dbs0Var.equals(dss0.a)) {
                yks0 W = aVar3.W();
                c(DiscoveryAction.f.a, aVar3.W().e);
                yks0.g(W, aVar3.getActivity(), new prq0(this, 4), 4);
                return;
            }
            if (dbs0Var.equals(kgt0.a)) {
                VideoFile videoFile4 = aVar3.W().e;
                if (fxc0.B().b0().e(videoFile4)) {
                    cvk.u(R.string.video_deleted_by_owner, false);
                    return;
                }
                if (!o25.a().b() || !fxc0.B().J().m(videoFile4.C2())) {
                    FragmentActivity activity5 = aVar3.getActivity();
                    MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource = MobileOfficialAppsSharingStat$TypeEventSource.BUTTON;
                    w1s0 w1s0Var = w1s0.b;
                    kbj0.u(nr4.b(), activity5, videoFile4, true, false, null, mobileOfficialAppsSharingStat$TypeEventSource, 24);
                    aVar3.c();
                    return;
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                long seconds = timeUnit.toSeconds(b.C1208b.a().e(videoFile4, null).getPosition());
                ShareItemType shareItemType = videoFile4.C2() ? ShareItemType.CLIP : ShareItemType.VIDEO;
                com.vk.video.ui.share.api.a p0 = aVar3.p0();
                FragmentActivity activity6 = aVar3.getActivity();
                String a27 = fss0.a(videoFile4);
                int i3 = (int) seconds;
                long j11 = videoFile4.I0().b;
                long o0 = videoFile4.o0();
                String r = videoFile4.r();
                ows0 b5 = aVar3.b();
                p0.a(activity6, new VideoShareArguments(a27, i3, true, new StatsArguments(shareItemType, j11, o0, r, (ScreenMode) new ScreenModeVideoStatMapper(b5 != null ? b5.b3() : null).b(videoFile4, new igj0(6)), ShareSource.BUTTON)), videoFile4);
                return;
            }
            if (dbs0Var.equals(uit0.a)) {
                b25 a28 = o25.a();
                aVar3.getActivity();
                a28.getClass();
                ows0 b6 = aVar3.b();
                VideoMinimizableState P0 = (b6 == null || (b34 = b6.b3()) == null) ? null : b34.P0();
                if (P0 instanceof VideoMinimizableState.Expanded) {
                    str3 = "video_discovery";
                } else if (P0 instanceof VideoMinimizableState.FullscreenHorizontal) {
                    str3 = "video_fullscreen_landscape";
                } else if (P0 instanceof VideoMinimizableState.FullscreenVertical) {
                    str3 = "video_fullscreen_portrait";
                }
                String str6 = str3;
                yks0 W2 = aVar3.W();
                if (W2.e.U()) {
                    yks0.l(W2, aVar3.getActivity(), str6, "button", null, null, new vf1(18, this, W2), 50);
                    return;
                } else {
                    yks0.k(W2, aVar3.getActivity(), false, str6, "button", null, null, null, null, new prd0(7, this, W2), PsExtractor.VIDEO_STREAM_MASK);
                    return;
                }
            }
            int i4 = 12;
            if (dbs0Var.equals(yzr0.a)) {
                c(new DiscoveryAction.a(DiscoveryAction.EventSource.BUTTON), aVar3.W().e);
                b25 a29 = o25.a();
                aVar3.getActivity();
                a29.getClass();
                VideoFile videoFile5 = aVar3.W().e;
                if (!videoFile5.j0() && !o25.a().a(videoFile5.I0())) {
                    hg1.b(aVar3.getView(), w1s0.b(aVar3.getActivity(), videoFile5, aVar3.W().a, aVar3.W().b, new phg(this, i4)));
                    return;
                }
                kz20 j12 = aVar3.j();
                FragmentActivity activity7 = aVar3.getActivity();
                j12.i(activity7, new pk(i4, j12, activity7));
                return;
            }
            if (dbs0Var.equals(mhs0.a)) {
                return;
            }
            if (dbs0Var.equals(kst0.a)) {
                c(new DiscoveryAction.m(DiscoveryAction.EventSource.BUTTON), aVar3.W().e);
                FragmentActivity activity8 = aVar3.getActivity();
                dhr0.a.getClass();
                int i5 = dhr0.u().c;
                l7s l7sVar = new l7s(activity8, dhr0.u().c);
                if (((Boolean) this.d.getValue()).booleanValue()) {
                    b25 a30 = o25.a();
                    aVar3.getActivity();
                    a30.getClass();
                } else {
                    b25 a31 = o25.a();
                    aVar3.getActivity();
                    a31.getClass();
                }
                g7s0.X(fxc0.B(), l7sVar, aVar3.W().e, aVar3.W().a, aVar3.W().e.r(), null, null, 48);
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
            if (dbs0Var.equals(t6t0.a)) {
                AdsDataProvider o = aVar3.o();
                if (o != null) {
                    yks0 W3 = aVar3.W();
                    FragmentActivity activity9 = aVar3.getActivity();
                    W3.getClass();
                    o.Da(activity9);
                    return;
                }
                String r2 = aVar3.W().e.r();
                if (r2 != null) {
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
                    UiTracker uiTracker = UiTracker.a;
                    searchStatsLoggingInfo = new SearchStatsLoggingInfo(null, 0, type, 0L, r2, UiTracker.c(), null, false, false, 459, null);
                } else {
                    searchStatsLoggingInfo = null;
                }
                ydt0.f(fxc0.B().Y(), aVar3.getActivity(), aVar3.W().e, aVar3.W().a, searchStatsLoggingInfo, null, 16);
                return;
            }
            if (dbs0Var.equals(b2s0.a)) {
                kz20 j13 = aVar3.j();
                c2s0 c2s0Var = new c2s0(aVar3.getActivity(), j13.e, aVar3.W().e.z7());
                j13.a = new WeakReference<>(c2s0Var);
                c2s0Var.c();
                return;
            }
            if (dbs0Var.equals(sms0.a) || dbs0Var.equals(tms0.a)) {
                return;
            }
            if (dbs0Var.equals(jxr0.a)) {
                aVar3.j().d(aVar3.getActivity());
                return;
            }
            if (dbs0Var.equals(ghs0.a)) {
                gzs<s3q0> p = aVar3.p();
                if (p != null) {
                    ((b1z) p).invoke();
                    return;
                }
                return;
            }
            if (dbs0Var.equals(yct0.a)) {
                return;
            }
            if (dbs0Var.equals(a1t0.a)) {
                if (aVar3.W().e.W9()) {
                    kz20 j14 = aVar3.j();
                    FragmentActivity activity10 = aVar3.getActivity();
                    j14.getClass();
                    final q1g0 q1g0Var = new q1g0(activity10, j14.i, j14.e);
                    int i6 = h7u0.p;
                    h7u0.a c2 = h7u0.b.c(bwt0.u(activity10));
                    c2.b0(new DialogInterface.OnShowListener() { // from class: xsna.o1g0
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            q1g0.this.b.Ff("interactive_video_replay_dialog");
                        }
                    });
                    c2.a0(new DialogInterface.OnDismissListener() { // from class: xsna.p1g0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            q1g0.this.b.Qc("interactive_video_replay_dialog");
                        }
                    });
                    c2.U(R.string.interactive_video_alert_replay_alert);
                    c2.g0(R.string.interactive_video_alert_replay_title);
                    c2.c0(R.string.interactive_video_alert_replay_confirm, q1g0Var.new b());
                    c2.W(R.string.interactive_video_alert_replay_cancel, new q1g0.a());
                    j14.d = new WeakReference<>(c2.m());
                    return;
                }
                return;
            }
            if (dbs0Var.equals(hkt0.a)) {
                fxc0.B().A(aVar3.getActivity(), aVar3.W().e);
                return;
            }
            if (dbs0Var.equals(sdt0.a)) {
                return;
            }
            if (dbs0Var.equals(nqs0.a)) {
                fxc0.B().Y().d(aVar3.getActivity(), aVar3.W().e, aVar3.W().a, (r35 & 8) != 0 ? null : aVar3.o(), (r35 & 16) != 0 ? null : null, (r35 & 32) != 0 ? null : null, (r35 & 64) != 0 ? false : false, (r35 & 128) != 0 ? null : aVar3.W().e.r(), (r35 & 256) != 0 ? false : false, (r35 & 2048) != 0 ? -1L : 0L, (r35 & 4096) != 0 ? null : null, null, (r35 & 16384) != 0 ? null : null);
                return;
            }
            if (dbs0Var instanceof qws0) {
                qws0 qws0Var = (qws0) dbs0Var;
                SearchStatsLoggingInfo a32 = aVar3.a();
                sks0 sks0Var = a32 != null ? new sks0(a32) : null;
                kz20 j15 = aVar3.j();
                FragmentActivity activity11 = aVar3.getActivity();
                String str7 = aVar3.W().a;
                y6s0 i7 = aVar3.i();
                boolean z4 = qws0Var.a;
                boolean z5 = qws0Var.b;
                boolean z6 = qws0Var.c;
                UserId userId = qws0Var.d;
                aVar3.m().getClass();
                MobileOfficialAppsCoreNavStat$EventScreen l = aVar3.l();
                hfs0 n = aVar3.n();
                com.vk.video.ui.share.api.b S = aVar3.S();
                ows0 b7 = aVar3.b();
                VideoMinimizableState P02 = (b7 == null || (b33 = b7.b3()) == null) ? null : b33.P0();
                VideoScreenMode videoScreenMode = P02 instanceof VideoMinimizableState.FullscreenHorizontal ? VideoScreenMode.FULLSCREEN_LANDSCAPE : P02 instanceof VideoMinimizableState.FullscreenVertical ? VideoScreenMode.FULLSCREEN_PORTRAIT : VideoScreenMode.DISCOVERY;
                gzs<VideoAlbum> f2 = aVar3.f();
                j15.f(activity11, str7, sks0Var, i7, z4, z5, z6, userId, null, true, l, videoScreenMode, n, S, f2 != null ? f2.invoke() : null);
                return;
            }
            if (dbs0Var.equals(d8s0.a) || dbs0Var.equals(l4s0.a) || (dbs0Var instanceof d4s0) || (dbs0Var instanceof c4s0) || dbs0Var.equals(hsw.a)) {
                return;
            }
            if (dbs0Var.equals(fdt0.a)) {
                VideoRestriction O = aVar3.W().e.O();
                if (O == null || (str = O.j) == null) {
                    return;
                }
                com.vk.music.notifications.inapp.b.f(new qst0(str), null, null, 14);
                return;
            }
            if ((dbs0Var instanceof eet0) || dbs0Var.equals(ygt0.a) || dbs0Var.equals(zgt0.a) || epx.f(dbs0Var, ngt0.a) || epx.f(dbs0Var, ass0.a) || epx.f(dbs0Var, cps0.a)) {
                return;
            }
            if (dbs0Var instanceof qjj0) {
                kz20 j16 = aVar3.j();
                FragmentActivity activity12 = aVar3.getActivity();
                VideoTechBugreportData videoTechBugreportData = ((qjj0) dbs0Var).a;
                j16.getClass();
                u7o0 u7o0Var = new u7o0(activity12, new az2(20, j16, videoTechBugreportData), new w7u(j16, i4), new w110(j16, i2));
                j16.a = new WeakReference<>(u7o0Var);
                u7o0Var.c();
                return;
            }
            if (dbs0Var instanceof rji0) {
                rji0 rji0Var = (rji0) dbs0Var;
                aVar3.g().a(aVar3.getActivity(), rji0Var.a, rji0Var.b, null);
                return;
            }
            if (dbs0Var instanceof VideoSeekAction) {
                VideoSeekAction videoSeekAction = (VideoSeekAction) dbs0Var;
                zet0 h = aVar3.h();
                if (h != null) {
                    VideoFile videoFile6 = aVar3.W().e;
                    yet0 yet0Var = new yet0(Long.valueOf(videoFile6.o0()), videoFile6.I0(), videoFile6.r());
                    int i8 = b.$EnumSwitchMapping$0[videoSeekAction.b.ordinal()];
                    if (i8 == 1) {
                        videoSeekEventSource = VideoSeekEventSource.Slider;
                    } else if (i8 == 2) {
                        videoSeekEventSource = VideoSeekEventSource.PreciseSlider;
                    } else {
                        if (i8 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        videoSeekEventSource = VideoSeekEventSource.DoubleTap;
                    }
                    VideoSeekEventSource videoSeekEventSource2 = videoSeekEventSource;
                    boolean z7 = videoSeekAction.c;
                    ows0 b8 = aVar3.b();
                    if (b8 != null && (b32 = b8.b3()) != null) {
                        videoMinimizableState = b32.P0();
                    }
                    h.a(yet0Var, videoSeekEventSource2, videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal ? VideoSeekEventScreenMode.FullscreenLandscape : videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical ? VideoSeekEventScreenMode.FullscreenPortrait : z7 ? VideoSeekEventScreenMode.Fullscreen : VideoSeekEventScreenMode.Discovery, TimeUnit.MILLISECONDS.toSeconds(videoSeekAction.a));
                    return;
                }
                return;
            }
            if (epx.f(dbs0Var, q8s0.a) || (dbs0Var instanceof det0) || epx.f(dbs0Var, ijj0.a)) {
                return;
            }
            if (!epx.f(dbs0Var, jjj0.a)) {
                if (dbs0Var instanceof zms0) {
                    gzs<s3q0> e = aVar3.e();
                    if (e != null) {
                        ((i8z.b.a) e).invoke();
                        return;
                    }
                    return;
                }
                if (!(dbs0Var instanceof ea80)) {
                    throw new NoWhenBranchMatchedException();
                }
                a();
                return;
            }
            ows0 b9 = aVar3.b();
            if (b9 == null || (b3 = b9.b3()) == null) {
                return;
            }
            VideoMinimizableState P03 = b3.P0();
            VideoFile videoFile7 = aVar3.W().e;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile7.o0()), Long.valueOf(videoFile7.I0().b), null, videoFile7.r(), null, 40, null);
            MobileOfficialAppsVideoStat$TypeScreenMode y = sp.y(P03);
            if (y == null) {
                return;
            }
            UiTracker uiTracker2 = UiTracker.a;
            new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(schemeStat$EventItem, null, new MobileOfficialAppsVideoStat$TypeVideoShowSimilarsButtonAction(y), 2)).q();
            return;
        }
        d3b0 d3b0Var10 = ((b1t0) dbs0Var).a;
        OneVideoPlayer a33 = d3b0Var10.a();
        if (a33 == null) {
            return;
        }
        VideoFile videoFile8 = aVar2.W().e;
        List<one.video.player.tracks.c> k02 = a33.k0();
        ArrayList arrayList2 = new ArrayList(c5g.u(k02, 10));
        Iterator<T> it2 = k02.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((cms0) ((one.video.player.tracks.c) it2.next()).c).b());
        }
        List a34 = bat0.a(videoFile8, arrayList2, a33.j());
        one.video.player.tracks.c E2 = a33.E();
        Integer a35 = vm80.a(a33);
        r11 = a35 != null ? a35.intValue() : -1;
        kz20 j17 = aVar2.j();
        FragmentActivity activity13 = aVar2.getActivity();
        if (fxc0.B().J().l0() && E2 != null && (cms0Var2 = (cms0) E2.c) != null && (b4 = cms0Var2.b()) != null) {
            r11 = b4.getHeight();
        }
        int i9 = r11;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        boolean z8 = !bVar2.a(videoFeatures) ? a34.size() <= 1 : a34.size() <= 1 || (a9 = d3b0Var10.a()) == null || (F2 = a9.F()) == null || !(F2.isEmpty() ^ true);
        if (bVar2.a(videoFeatures)) {
            qu5.c().getClass();
            if (ConnectionState.CONNECTED == null) {
                z = false;
                FragmentActivity activity14 = aVar2.getActivity();
                a7 = d3b0Var10.a();
                if (a7 != null || (r11 = a7.F()) == null) {
                    List<one.video.player.tracks.a> list2 = EmptyList.b;
                }
                a8 = s3t0.a(activity14, list2);
                if (a8.size() <= 1) {
                    a8 = null;
                }
                if (a8 != null) {
                    OneVideoPlayer a36 = d3b0Var10.a();
                    String str8 = (String) a8.get((a36 == null || (M2 = a36.M()) == null) ? null : M2.b);
                    if (str8 != null) {
                        str2 = str8;
                        one.video.player.tracks.b Q = a33.Q();
                        boolean z9 = !a33.Y().isEmpty();
                        OneVideoPlayer a37 = d3b0Var10.a();
                        float b10 = a37 != null ? a37.b() : 1.0f;
                        int i10 = b10 == 0.25f ? R.string.video_playback_speed_025 : b10 == 0.5f ? R.string.video_playback_speed_050 : b10 == 0.75f ? R.string.video_playback_speed_075 : b10 == 1.25f ? R.string.video_playback_speed_125 : b10 == 1.5f ? R.string.video_playback_speed_150 : b10 == 1.75f ? R.string.video_playback_speed_175 : b10 == 2.0f ? R.string.video_playback_speed_200 : R.string.video_playback_speed_normal;
                        LinkedHashMap a38 = aVar2.W().e.w4().a();
                        sr10 sr10Var3 = dy2.a;
                        Boolean g2 = sr10Var3 != null ? sr10Var3.g() : null;
                        boolean isEmpty = a34.isEmpty();
                        Boolean valueOf2 = Boolean.valueOf(aVar2.W().e.W9() && aVar2.e() != null && aVar2.l() == MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY);
                        if (!aVar2.W().e.W9()) {
                            ows0 b11 = aVar2.b();
                            VideoMinimizableState P04 = (b11 == null || (b35 = b11.b3()) == null) ? null : b35.P0();
                            if (P04 instanceof VideoMinimizableState.FullscreenHorizontal) {
                                if (com.vk.toggle.d.v().b) {
                                    com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                                    valueOf = Boolean.valueOf(com.vk.libvideo.autoplay.e.a());
                                    bool = valueOf;
                                }
                            } else if (P04 instanceof VideoMinimizableState.FullscreenVertical) {
                                if (com.vk.toggle.d.w().b) {
                                    com.vk.libvideo.autoplay.e eVar2 = com.vk.libvideo.autoplay.e.a;
                                    valueOf = Boolean.valueOf(com.vk.libvideo.autoplay.e.a());
                                    bool = valueOf;
                                }
                            } else if ((P04 instanceof VideoMinimizableState.Expanded) && com.vk.toggle.d.u().b) {
                                com.vk.libvideo.autoplay.e eVar3 = com.vk.libvideo.autoplay.e.a;
                                valueOf = Boolean.valueOf(com.vk.libvideo.autoplay.e.a());
                                bool = valueOf;
                            }
                            j17.getClass();
                            fgt0.c cVar = new fgt0.c(i9, z8, str2, Q, z9, i10, a38, g2, isEmpty, valueOf2, bool, z);
                            if (((Boolean) j17.k.getValue()).booleanValue()) {
                                fgt0 fgt0Var = new fgt0(activity13, d3b0Var10, j17.i, j17.e, cVar);
                                j17.a = new WeakReference<>(fgt0Var);
                                fgt0Var.c();
                                return;
                            }
                            ebs0 ebs0Var = j17.i;
                            kz20.b bVar3 = j17.e;
                            final jgt0 jgt0Var = new jgt0(activity13, d3b0Var10, ebs0Var, bVar3, cVar);
                            bpn0 bpn0Var3 = jgt0Var.g;
                            if (str2 != null && ((k640) bpn0Var3.getValue()).a(d3b0Var10)) {
                                z2 = true;
                            }
                            final ViewGroup viewGroup = (ViewGroup) activity13.getWindow().getDecorView();
                            final ComposeView composeView = new ComposeView(activity13, null, 6);
                            composeView.setViewCompositionStrategy(mut0.a.a);
                            composeView.setContent(new jai(1906722089, new wzs() { // from class: xsna.hgt0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1906722089, intValue, -1, "com.vk.libvideo.bottomsheet.VideoSettingsBottomSheetRedesign.show.<anonymous>.<anonymous> (VideoSettingsBottomSheetRedesign.kt:75)");
                                        }
                                        Object x = aVar4.x();
                                        Object obj3 = a.C0011a.a;
                                        if (x == obj3) {
                                            x = androidx.compose.runtime.k.b(Boolean.TRUE);
                                            aVar4.R(x);
                                        }
                                        wh50 wh50Var = (wh50) x;
                                        ViewGroup viewGroup2 = viewGroup;
                                        boolean y2 = aVar4.y(viewGroup2);
                                        ComposeView composeView2 = composeView;
                                        boolean y3 = y2 | aVar4.y(composeView2);
                                        jgt0 jgt0Var2 = jgt0Var;
                                        boolean y4 = y3 | aVar4.y(jgt0Var2);
                                        Object x2 = aVar4.x();
                                        if (y4 || x2 == obj3) {
                                            x2 = new ufz(wh50Var, viewGroup2, composeView2, jgt0Var2, 2);
                                            aVar4.R(x2);
                                        }
                                        gzs<s3q0> gzsVar = (gzs) x2;
                                        jgt0Var2.f = gzsVar;
                                        if (((Boolean) wh50Var.getValue()).booleanValue()) {
                                            aVar4.K(-2079302913);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(831581936, 0, -1, "com.vk.libvideo.bottomsheet.VideoSettingsBottomSheetRedesign.VideoSettingsScreen (VideoSettingsBottomSheetRedesign.kt:112)");
                                            }
                                            jgt0Var2.c(54, aVar4, kai.c(-1324543369, new zg4(gzsVar, jgt0Var2, z2), aVar4));
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar4.K(-2083048519);
                                        }
                                        aVar4.j();
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, true));
                            viewGroup.addView(composeView);
                            bVar3.Ff("video_playback_settings_redesign");
                            if (z2) {
                                ((k640) bpn0Var3.getValue()).c();
                            }
                            j17.c = new WeakReference<>(jgt0Var);
                            return;
                        }
                        bool = null;
                        j17.getClass();
                        fgt0.c cVar2 = new fgt0.c(i9, z8, str2, Q, z9, i10, a38, g2, isEmpty, valueOf2, bool, z);
                        if (((Boolean) j17.k.getValue()).booleanValue()) {
                        }
                    }
                }
                str2 = null;
                one.video.player.tracks.b Q2 = a33.Q();
                boolean z92 = !a33.Y().isEmpty();
                OneVideoPlayer a372 = d3b0Var10.a();
                if (a372 != null) {
                }
                int i102 = b10 == 0.25f ? R.string.video_playback_speed_025 : b10 == 0.5f ? R.string.video_playback_speed_050 : b10 == 0.75f ? R.string.video_playback_speed_075 : b10 == 1.25f ? R.string.video_playback_speed_125 : b10 == 1.5f ? R.string.video_playback_speed_150 : b10 == 1.75f ? R.string.video_playback_speed_175 : b10 == 2.0f ? R.string.video_playback_speed_200 : R.string.video_playback_speed_normal;
                LinkedHashMap a382 = aVar2.W().e.w4().a();
                sr10 sr10Var32 = dy2.a;
                if (sr10Var32 != null) {
                }
                boolean isEmpty2 = a34.isEmpty();
                Boolean valueOf22 = Boolean.valueOf(aVar2.W().e.W9() && aVar2.e() != null && aVar2.l() == MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY);
                if (!aVar2.W().e.W9()) {
                }
                bool = null;
                j17.getClass();
                fgt0.c cVar22 = new fgt0.c(i9, z8, str2, Q2, z92, i102, a382, g2, isEmpty2, valueOf22, bool, z);
                if (((Boolean) j17.k.getValue()).booleanValue()) {
                }
            }
        }
        z = true;
        FragmentActivity activity142 = aVar2.getActivity();
        a7 = d3b0Var10.a();
        if (a7 != null) {
        }
        List<one.video.player.tracks.a> list22 = EmptyList.b;
        a8 = s3t0.a(activity142, list22);
        if (a8.size() <= 1) {
        }
        if (a8 != null) {
        }
        str2 = null;
        one.video.player.tracks.b Q22 = a33.Q();
        boolean z922 = !a33.Y().isEmpty();
        OneVideoPlayer a3722 = d3b0Var10.a();
        if (a3722 != null) {
        }
        int i1022 = b10 == 0.25f ? R.string.video_playback_speed_025 : b10 == 0.5f ? R.string.video_playback_speed_050 : b10 == 0.75f ? R.string.video_playback_speed_075 : b10 == 1.25f ? R.string.video_playback_speed_125 : b10 == 1.5f ? R.string.video_playback_speed_150 : b10 == 1.75f ? R.string.video_playback_speed_175 : b10 == 2.0f ? R.string.video_playback_speed_200 : R.string.video_playback_speed_normal;
        LinkedHashMap a3822 = aVar2.W().e.w4().a();
        sr10 sr10Var322 = dy2.a;
        if (sr10Var322 != null) {
        }
        boolean isEmpty22 = a34.isEmpty();
        Boolean valueOf222 = Boolean.valueOf(aVar2.W().e.W9() && aVar2.e() != null && aVar2.l() == MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY);
        if (!aVar2.W().e.W9()) {
        }
        bool = null;
        j17.getClass();
        fgt0.c cVar222 = new fgt0.c(i9, z8, str2, Q22, z922, i1022, a3822, g2, isEmpty22, valueOf222, bool, z);
        if (((Boolean) j17.k.getValue()).booleanValue()) {
        }
    }

    public final void c(DiscoveryAction discoveryAction, VideoFile videoFile) {
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3;
        VideoMinimizableState P0;
        a aVar = this.a;
        ows0 b2 = aVar.b();
        if (b2 == null || (b3 = b2.b3()) == null || (P0 = b3.P0()) == null) {
            return;
        }
        aVar.n().a(discoveryAction, new ai90(videoFile, fvr.A(P0)));
    }
}
