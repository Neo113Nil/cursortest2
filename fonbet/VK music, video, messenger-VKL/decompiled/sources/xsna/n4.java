package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.MainActivity;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b4;
import xsna.oz50;

/* compiled from: AboutVideoActionHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class n4 implements c4 {
    public final FragmentActivity b;
    public final a c;
    public final b d;
    public final yks0 e;
    public final kz20 f;
    public final wzs<VideoFile, Boolean, s3q0> g;
    public final gzs<s3q0> h;
    public final gzs<s3q0> i;
    public final q75 k;
    public final Object j = msy.a(LazyThreadSafetyMode.NONE, new d4(0));
    public final bpn0 l = new bpn0(new f4(0));

    /* compiled from: AboutVideoActionHandlerImpl.kt */
    public static final class b {
        public final Object a;
        public final Object b;
        public final NotificationsPermission c;
        public final vit0 d;
        public final u9t0 e;
        public final lzh0 f;
        public final nto0 g;
        public final hfs0 h;
        public final rcg0 i;
        public final com.vk.video.ui.share.api.a j;
        public final com.vk.video.ui.share.api.b k;
        public final ows0 l;
        public final w6 m;
        public final x4o n;
        public final Object o;

        public b(Lazy<? extends sz00> lazy, Lazy<? extends lt00> lazy2, NotificationsPermission notificationsPermission, vit0 vit0Var, u9t0 u9t0Var, lzh0 lzh0Var, nto0 nto0Var, hfs0 hfs0Var, rcg0 rcg0Var, com.vk.video.ui.share.api.a aVar, com.vk.video.ui.share.api.b bVar, ows0 ows0Var, w6 w6Var, x4o x4oVar, Lazy<? extends y1s0> lazy3) {
            this.a = lazy;
            this.b = lazy2;
            this.c = notificationsPermission;
            this.d = vit0Var;
            this.e = u9t0Var;
            this.f = lzh0Var;
            this.g = nto0Var;
            this.h = hfs0Var;
            this.i = rcg0Var;
            this.j = aVar;
            this.k = bVar;
            this.l = ows0Var;
            this.m = w6Var;
            this.n = x4oVar;
            this.o = lazy3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n) && this.o.equals(bVar.o);
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + vul0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
            lzh0 lzh0Var = this.f;
            int hashCode2 = (this.h.hashCode() + ((this.g.hashCode() + ((hashCode + (lzh0Var == null ? 0 : lzh0Var.hashCode())) * 31)) * 31)) * 31;
            rcg0 rcg0Var = this.i;
            int hashCode3 = (this.k.hashCode() + ((this.j.hashCode() + ((hashCode2 + (rcg0Var == null ? 0 : rcg0Var.hashCode())) * 31)) * 31)) * 31;
            ows0 ows0Var = this.l;
            int hashCode4 = (hashCode3 + (ows0Var == null ? 0 : ows0Var.hashCode())) * 31;
            w6 w6Var = this.m;
            int hashCode5 = (hashCode4 + (w6Var == null ? 0 : w6Var.hashCode())) * 31;
            x4o x4oVar = this.n;
            return this.o.hashCode() + ((hashCode5 + (x4oVar != null ? x4oVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dependencies(marketGoodRouter=");
            sb.append(this.a);
            sb.append(", marketAnalytics=");
            sb.append(this.b);
            sb.append(", notificationsPermission=");
            sb.append(this.c);
            sb.append(", videoSubscriptionRepository=");
            sb.append(this.d);
            sb.append(", videoPromoRepository=");
            sb.append(this.e);
            sb.append(", searchTrackerComposite=");
            sb.append(this.f);
            sb.append(", timeCodeSeekStrategy=");
            sb.append(this.g);
            sb.append(", discoveryActionsTracker=");
            sb.append(this.h);
            sb.append(", restrictedUserActions=");
            sb.append(this.i);
            sb.append(", videoShareLauncher=");
            sb.append(this.j);
            sb.append(", videoShareLinkModifier=");
            sb.append(this.k);
            sb.append(", videoMinimizableStateProvider=");
            sb.append(this.l);
            sb.append(", aboutVideoDonutActionHandler=");
            sb.append(this.m);
            sb.append(", donutActionHandler=");
            sb.append(this.n);
            sb.append(", videoAppStabilityRepository=");
            return k73.c(sb, this.o, ')');
        }
    }

    /* compiled from: AboutVideoActionHandlerImpl.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsSharingStat$TypeEventSource.values().length];
            try {
                iArr[MobileOfficialAppsSharingStat$TypeEventSource.ACTION_MENU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsSharingStat$TypeEventSource.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AboutVideoActionHandlerImpl.kt */
    public static final class d implements bkm {
        public final /* synthetic */ ww50<?> b;

        public d(ww50<?> ww50Var) {
            this.b = ww50Var;
        }

        @Override // xsna.bkm
        public final void bb(int i) {
            ww50<?> ww50Var = this.b;
            ww50Var.c0(this);
            Object z = ww50Var.z();
            FragmentImpl fragmentImpl = z instanceof FragmentImpl ? (FragmentImpl) z : null;
            if (epx.f(fragmentImpl != null ? fragmentImpl.getTag() : null, "about_video_feed_tag")) {
                i0q0.a().post(new o4(fragmentImpl, 0));
            }
        }
    }

    /* compiled from: AboutVideoActionHandlerImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).c();
            return s3q0.a;
        }
    }

    /* compiled from: AboutVideoActionHandlerImpl.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).c();
            return s3q0.a;
        }
    }

    /* compiled from: AboutVideoActionHandlerImpl.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            n4 n4Var = (n4) this.receiver;
            yks0 yks0Var = n4Var.e;
            if (!n4Var.c(yks0Var.e)) {
                n4Var.f(new DiscoveryAction.m(DiscoveryAction.EventSource.BUTTON), yks0Var.e);
                VideoFile videoFile = yks0Var.e;
                String str = yks0Var.a;
                String r = videoFile.r();
                FragmentActivity fragmentActivity = n4Var.b;
                dhr0.a.getClass();
                int i = dhr0.u().c;
                l7s l7sVar = new l7s(fragmentActivity, dhr0.u().c);
                if (((Boolean) n4Var.l.getValue()).booleanValue()) {
                    o25.a().getClass();
                } else {
                    o25.a().getClass();
                }
                g7s0.X(fxc0.B(), l7sVar, videoFile, str, r, null, null, 48);
                s3q0 s3q0Var = s3q0.a;
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    public n4(FragmentActivity fragmentActivity, a aVar, b bVar, yks0 yks0Var, kz20 kz20Var, wzs wzsVar, ivs0 ivs0Var, pus0 pus0Var, fjs0 fjs0Var) {
        this.b = fragmentActivity;
        this.c = aVar;
        this.d = bVar;
        this.e = yks0Var;
        this.f = kz20Var;
        this.g = wzsVar;
        this.h = ivs0Var;
        this.i = pus0Var;
        this.k = new q75(fragmentActivity, yks0Var, bVar.d, bVar.f, bVar.l, (y1s0) bVar.o.getValue(), fjs0Var);
    }

    public final s6s0 a(VideoFile videoFile, VideoScreenMode videoScreenMode) {
        String str = this.e.a;
        b bVar = this.d;
        return new s6s0(videoFile, str, null, null, false, null, false, false, false, null, null, null, "VIDEO_DISCOVERY", false, bVar.i, false, videoScreenMode, false, bVar.h, bVar.k, null, false, 425459672);
    }

    public final void b(b4.z zVar) {
        ww50 v = s200.v(this.b);
        if (v != null) {
            v.j(new d(v));
        }
        yg5 yg5Var = zVar.b.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        yks0 yks0Var = this.e;
        yg5Var.q0(yks0Var.a);
        yg5Var.s0(yks0Var.b);
        uc ucVar = zVar.b;
        ucVar.w(yks0Var.a);
        ucVar.s(yks0Var.b);
        ucVar.l = null;
        uc.o(ucVar, this.b, v != null, null, null, null, 44);
    }

    public final boolean c(VideoFile videoFile) {
        DonutVideoModel a2 = nkt0.a(videoFile);
        w6 w6Var = this.d.m;
        if (w6Var == null || !w6Var.b(a2)) {
            return false;
        }
        w6Var.a(this.b, a2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c4
    public final void d(b4 b4Var) {
        Pair pair;
        UserId userId;
        lzh0 lzh0Var;
        b bVar = this.d;
        u9t0 u9t0Var = bVar.e;
        rcg0 rcg0Var = bVar.i;
        ?? r5 = bVar.o;
        boolean z = b4Var instanceof b4.z;
        Long l = null;
        l = null;
        if (z) {
            b4.z zVar = (b4.z) b4Var;
            pair = new Pair(zVar.a.r(), zVar.c);
        } else if (b4Var instanceof b4.b0) {
            b4.b0 b0Var = (b4.b0) b4Var;
            pair = new Pair(b0Var.a.r(), b0Var.d);
        } else {
            pair = null;
        }
        int i = 2;
        if (pair != null) {
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, (String) pair.d(), null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, (CommonVideoStat$TypeScreenMode) pair.g()), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b2, uzp0Var.a).q();
        }
        boolean f2 = epx.f(b4Var, b4.e.a);
        yks0 yks0Var = this.e;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = f2 ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT : epx.f(b4Var, b4.m0.a) ? yks0Var.e.X() ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT : ((b4Var instanceof b4.b0) || z) ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP : b4Var instanceof b4.h ? ((b4.h) b4Var).a ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNLIKE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LIKE_OUT : epx.f(b4Var, b4.d.a) ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_COMMENTS_OUT : b4Var instanceof b4.f0 ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT : null;
        if (action != null && (lzh0Var = bVar.f) != null) {
            lzh0Var.b(action, yks0Var.e.r());
        }
        int i2 = 0;
        if (b4Var instanceof b4.h) {
            e(new g4(i2, this, b4Var));
            return;
        }
        boolean z2 = b4Var instanceof b4.i;
        int i3 = 1;
        FragmentActivity fragmentActivity = this.b;
        a aVar = this.c;
        if (z2) {
            if (((y1s0) r5.getValue()).G()) {
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY_OFFLINE;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    d6q0.a.getClass();
                    d6q0.l(true, false);
                    return;
                }
            }
            aVar.c();
            fxc0.B().Y().t(fragmentActivity, yks0Var.e);
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (b4Var instanceof b4.d) {
            e(new h4(i2, this, b4Var));
            return;
        }
        boolean z3 = b4Var instanceof b4.w;
        kz20 kz20Var = this.f;
        if (z3) {
            kz20Var.e(fragmentActivity, new e(0, aVar, a.class, "playOnResume", "playOnResume()V", 0), true, rcg0Var);
            return;
        }
        if (b4Var instanceof b4.f0) {
            e(new i4(i2, this, b4Var));
            return;
        }
        if (z) {
            b((b4.z) b4Var);
            return;
        }
        if (b4Var instanceof b4.k) {
            e(new j4(i2, this, b4Var));
            return;
        }
        if (b4Var instanceof b4.b) {
            c2s0 c2s0Var = new c2s0(fragmentActivity, kz20Var.e, ((b4.b) b4Var).a);
            kz20Var.a = new WeakReference<>(c2s0Var);
            c2s0Var.c();
            return;
        }
        if (b4Var instanceof b4.k0) {
            if (((y1s0) r5.getValue()).G()) {
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_APP_STABILITY_OFFLINE;
                videoFeatures2.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures2)) {
                    d6q0.a.getClass();
                    d6q0.l(true, false);
                    return;
                }
            }
            g7s0.C(fxc0.B(), this.b, ((b4.k0) b4Var).a, null, null, 28);
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (b4Var instanceof b4.g0) {
            aVar.e();
            return;
        }
        if (b4Var instanceof b4.j0) {
            aVar.l();
            return;
        }
        if (b4Var instanceof b4.a) {
            f(new DiscoveryAction.a(DiscoveryAction.EventSource.BUTTON), yks0Var.e);
            o25.a().getClass();
            VideoFile videoFile = yks0Var.e;
            if (!videoFile.j0() && !o25.a().a(videoFile.I0())) {
                w1s0.b(fragmentActivity, yks0Var.e, yks0Var.a, yks0Var.b, new com.vk.movika.tools.controls.seekbar.i(this, i3));
                return;
            } else {
                kz20Var.g = videoFile;
                kz20Var.i(fragmentActivity, new m4(this, 0));
                return;
            }
        }
        if (b4Var instanceof b4.c) {
            b4.c cVar = (b4.c) b4Var;
            q75 q75Var = this.k;
            q75Var.getClass();
            if (cVar instanceof b4.c.f) {
                q75Var.a(new m75(0, q75Var, q75.class, "openProfile", "openProfile()V", 0));
                return;
            }
            if (cVar instanceof b4.c.C2586c) {
                q75Var.a(new n75(0, q75Var, q75.class, "openActualLive", "openActualLive()V", 0));
                return;
            }
            if (cVar instanceof b4.c.h) {
                q75Var.a(new ew3(i3, q75Var, cVar));
                return;
            }
            if (cVar instanceof b4.c.b) {
                q75Var.a(new v43(3, q75Var, cVar));
                return;
            }
            if (cVar instanceof b4.c.g) {
                q75Var.a(new o75(0, q75Var, q75.class, "openSettings", "openSettings()V", 0));
                return;
            } else if (cVar instanceof b4.c.d) {
                q75Var.a(new ag1(i, q75Var, cVar));
                return;
            } else {
                if (!(cVar instanceof b4.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                q75Var.a(new p75(0, q75Var, q75.class, "hideAuthor", "hideAuthor()V", 0));
                return;
            }
        }
        if (b4Var instanceof b4.x) {
            kz20Var.e(fragmentActivity, new f(0, aVar, a.class, "playOnResume", "playOnResume()V", 0), false, rcg0Var);
            return;
        }
        if (b4Var instanceof b4.t) {
            kz20.c(this.f, this.b, yks0Var.e, yks0Var.b, bVar.c, bVar.d, bVar.e, new p4(0, aVar, a.class, "playOnResume", "playOnResume()V", 0), bVar.h, bVar.j, bVar.k, this.g, null, bVar.i, bVar.l, 2048);
            return;
        }
        boolean z4 = b4Var instanceof b4.b0;
        wzs<VideoFile, Boolean, s3q0> wzsVar = this.g;
        if (z4) {
            b4.b0 b0Var2 = (b4.b0) b4Var;
            VideoFile videoFile2 = b0Var2.a;
            if (wzsVar != null) {
                wzsVar.invoke(videoFile2, Boolean.valueOf(b0Var2.c));
                return;
            } else {
                b(new b4.z(videoFile2, b0Var2.b, b0Var2.d));
                return;
            }
        }
        if (b4Var instanceof b4.a0) {
            b4.a0 a0Var = (b4.a0) b4Var;
            if (wzsVar != null) {
                wzsVar.invoke(a0Var.a, Boolean.FALSE);
                return;
            }
            return;
        }
        if (b4Var instanceof b4.m0) {
            e(new g(0, this, n4.class, "watchVideoLater", "watchVideoLater()V", 0));
            return;
        }
        if (b4Var instanceof b4.e0) {
            w1s0.h(((b4.e0) b4Var).a);
            return;
        }
        if (b4Var instanceof b4.h0) {
            bVar.g.seekTo(((b4.h0) b4Var).a);
            return;
        }
        if (b4Var.equals(b4.y.a)) {
            ww50 v = s200.v(fragmentActivity);
            e7s e7sVar = v instanceof e7s ? (e7s) v : null;
            if (e7sVar != null) {
                e7sVar.a();
                return;
            }
            rsr rsrVar = oz50.k;
            oz50.b.d();
            Intent intent = new Intent(fragmentActivity, (Class<?>) MainActivity.class);
            intent.addFlags(603979776);
            fragmentActivity.startActivity(intent);
            return;
        }
        if (b4Var.equals(b4.g.a)) {
            u9t0Var.getClass();
            return;
        }
        if (b4Var.equals(b4.j.a)) {
            u9t0Var.getClass();
            return;
        }
        if (b4Var instanceof b4.e) {
            return;
        }
        if (b4Var instanceof b4.f) {
            b4.f fVar = (b4.f) b4Var;
            if (fVar instanceof b4.f.a) {
                sz00 sz00Var = (sz00) bVar.a.getValue();
                rz00 rz00Var = ((b4.f.a) fVar).a;
                sz00Var.e(fragmentActivity, new rz00(rz00Var.a, rz00Var.b, rz00Var.c, rz00Var.d, rz00Var.e, rz00Var.f, rz00Var.g, rz00Var.h, rz00Var.i, rz00Var.j, rz00Var.k, rz00Var.l, CommonMarketStat$TypeMarketContextContent.Type.VIDEO, Integer.valueOf(yks0Var.e.o0()), Long.valueOf(yks0Var.e.I0().b), rz00Var.p));
                return;
            } else {
                if (!(fVar instanceof b4.f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                lt00 lt00Var = (lt00) bVar.b.getValue();
                b4.f.b bVar2 = (b4.f.b) fVar;
                rz00 rz00Var2 = bVar2.a;
                Long valueOf = Long.valueOf(rz00Var2.a.b);
                Long valueOf2 = Long.valueOf(rz00Var2.a.c.b);
                int i4 = bVar2.b;
                lt00Var.i(valueOf, valueOf2, i4 > 0 ? Integer.valueOf(i4) : null, rz00Var2.b, rz00Var2.c, Integer.valueOf(yks0Var.e.o0()), Long.valueOf(yks0Var.e.I0().b), CommonMarketStat$TypeMarketContextContent.Type.VIDEO);
                return;
            }
        }
        if (b4Var instanceof b4.v) {
            ydt0 Y = fxc0.B().Y();
            String str = yks0Var.a;
            yks0Var.e.getClass();
            Y.getClass();
            return;
        }
        if (b4Var instanceof b4.c.e) {
            e(new s(i3, this, b4Var));
            return;
        }
        if (b4Var.equals(b4.d0.a)) {
            gzs<s3q0> gzsVar = this.h;
            if (gzsVar != null) {
                gzsVar.invoke();
                return;
            }
            return;
        }
        if (b4Var.equals(b4.c0.a)) {
            gzs<s3q0> gzsVar2 = this.i;
            if (gzsVar2 != null) {
                gzsVar2.invoke();
                return;
            }
            return;
        }
        if (b4Var instanceof b4.i0) {
            b4.i0 i0Var = (b4.i0) b4Var;
            int i5 = i0Var.a;
            int i6 = i0Var.b;
            dhr0.a.getClass();
            VKTheme u = dhr0.u();
            kz20Var.getClass();
            s0n s0nVar = new s0n(fragmentActivity, i5, i6, u);
            kz20Var.a = new WeakReference<>(s0nVar);
            s0nVar.c();
            return;
        }
        if (b4Var instanceof b4.m) {
            aVar.g();
            return;
        }
        if (b4Var instanceof b4.n) {
            aVar.f();
            return;
        }
        if (b4Var instanceof b4.r) {
            aVar.j(((b4.r) b4Var).a);
            return;
        }
        if (b4Var instanceof b4.s) {
            aVar.h();
            return;
        }
        if (b4Var instanceof b4.o) {
            aVar.i();
            return;
        }
        if (b4Var instanceof b4.l) {
            aVar.d();
            return;
        }
        if (b4Var instanceof b4.p) {
            e(new k4(i2, this, b4Var));
            return;
        }
        if (b4Var instanceof b4.u) {
            ydt0.f(fxc0.B().Y(), this.b, ((b4.u) b4Var).a, null, null, null, 28);
            return;
        }
        if (!(b4Var instanceof b4.l0)) {
            if (!(b4Var instanceof b4.q)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.k();
        } else {
            boolean z5 = ((b4.l0) b4Var).a;
            Owner s = yks0Var.e.s();
            if (s != null && (userId = s.b) != null) {
                l = Long.valueOf(userId.b);
            }
            aVar.b(String.valueOf(l), z5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(gzs<s3q0> gzsVar) {
        if (((y1s0) this.d.o.getValue()).G()) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY_OFFLINE;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                d6q0.a.getClass();
                d6q0.l(true, false);
                return;
            }
        }
        gzsVar.invoke();
    }

    public final void f(DiscoveryAction discoveryAction, VideoFile videoFile) {
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3;
        VideoMinimizableState P0;
        b bVar = this.d;
        ows0 ows0Var = bVar.l;
        if (ows0Var == null || (b3 = ows0Var.b3()) == null || (P0 = b3.P0()) == null) {
            return;
        }
        bVar.h.a(discoveryAction, new ai90(videoFile, fvr.A(P0)));
    }

    /* compiled from: AboutVideoActionHandlerImpl.kt */
    public interface a {
        default void c() {
        }

        default void d() {
        }

        default void e() {
        }

        default void f() {
        }

        default void g() {
        }

        default void h() {
        }

        default void i() {
        }

        default void k() {
        }

        default void l() {
        }

        default void j(String str) {
        }

        default void a(String str, boolean z) {
        }

        default void b(String str, boolean z) {
        }
    }
}
