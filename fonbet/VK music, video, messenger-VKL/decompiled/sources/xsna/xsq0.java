package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import ru.ok.android.utils.Logger;
import xsna.moq0;
import xsna.xn50;

/* compiled from: UserProfileNavigator.kt */
/* loaded from: classes5.dex */
public final class xsq0 {
    public final a a;
    public final a13 b;
    public final b c;
    public final r0e0 d;
    public final lzh0 e;
    public final dvq0 f;
    public final kpq0 g;
    public final ClipsEntryPointsComponent h;
    public final zof i;
    public final MaxUtilityComponent j;
    public final c k;
    public final su50 m;
    public final StoryViewerRouter n;
    public final oga0 o;
    public final q3s p;
    public final NewsfeedRouter q;
    public final Handler l = new Handler(Looper.getMainLooper());
    public final bpn0 r = new bpn0(new rjg0(5));
    public final Object s = msy.a(LazyThreadSafetyMode.NONE, new zqf0(6));

    /* compiled from: UserProfileNavigator.kt */
    public static final class a {
        public final mxv a;
        public final fl4 b;
        public final spl0 c;
        public final kbj0 d;
        public final zd3 e;
        public final qdz f;
        public final sw50 g;
        public final gd60 h;
        public final x8l0 i;
        public final q10 j;
        public final b25 k;
        public final smq l;
        public final krl0 m;

        public a(mxv mxvVar, fl4 fl4Var, spl0 spl0Var, kbj0 kbj0Var, zd3 zd3Var, qdz qdzVar, sw50 sw50Var, gd60 gd60Var, x8l0 x8l0Var, q10 q10Var, b25 b25Var, smq smqVar, krl0 krl0Var) {
            this.a = mxvVar;
            this.b = fl4Var;
            this.c = spl0Var;
            this.d = kbj0Var;
            this.e = zd3Var;
            this.f = qdzVar;
            this.g = sw50Var;
            this.h = gd60Var;
            this.i = x8l0Var;
            this.j = q10Var;
            this.k = b25Var;
            this.l = smqVar;
            this.m = krl0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Bridges(imBridge=" + this.a + ", audioBridge=" + this.b + ", appOpenBridge=" + this.c + ", sharingBridge=" + this.d + ", appsBridge=" + this.e + ", linksBridge=" + this.f + ", navigationBridge=" + this.g + ", newsBridge=" + this.h + ", stickersBridge=" + this.i + ", actionInvokeBridge=" + this.j + ", authBridge=" + this.k + ", faveBridge=" + this.l + ", storiesBridge=" + this.m + ')';
        }
    }

    /* compiled from: UserProfileNavigator.kt */
    public static final class b {
        public final lyd0 a;
        public final qfa0 b;

        public b(lyd0 lyd0Var, qfa0 qfa0Var) {
            this.a = lyd0Var;
            this.b = qfa0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "MetricsCollectors(userProfileMetricsCollector=" + this.a + ", photosMetricsCollector=" + this.b + ')';
        }
    }

    /* compiled from: UserProfileNavigator.kt */
    public static final class c {
        public final su50 a;
        public final StoryViewerRouter b;
        public final oga0 c;
        public final q3s d;
        public final NewsfeedRouter e;
        public final syk0 f;
        public final ClipsRouter g;
        public final ydt0 h;

        public c(su50 su50Var, StoryViewerRouter storyViewerRouter, oga0 oga0Var, q3s q3sVar, NewsfeedRouter newsfeedRouter, syk0 syk0Var, ClipsRouter clipsRouter, ydt0 ydt0Var) {
            this.a = su50Var;
            this.b = storyViewerRouter;
            this.c = oga0Var;
            this.d = q3sVar;
            this.e = newsfeedRouter;
            this.f = syk0Var;
            this.g = clipsRouter;
            this.h = ydt0Var;
        }
    }

    public xsq0(a aVar, a13 a13Var, b bVar, r0e0 r0e0Var, lzh0 lzh0Var, dvq0 dvq0Var, kpq0 kpq0Var, ClipsEntryPointsComponent clipsEntryPointsComponent, zof zofVar, MaxUtilityComponent maxUtilityComponent, c cVar) {
        this.a = aVar;
        this.b = a13Var;
        this.c = bVar;
        this.d = r0e0Var;
        this.e = lzh0Var;
        this.f = dvq0Var;
        this.g = kpq0Var;
        this.h = clipsEntryPointsComponent;
        this.i = zofVar;
        this.j = maxUtilityComponent;
        this.k = cVar;
        this.m = cVar.a;
        this.n = cVar.b;
        this.o = cVar.c;
        this.p = cVar.d;
        this.q = cVar.e;
    }

    public final void a(FragmentActivity fragmentActivity, f.e.AbstractC1725f abstractC1725f) {
        boolean z = abstractC1725f instanceof f.e.AbstractC1725f.a;
        c cVar = this.k;
        if (z) {
            ClipFeedTab.Profile profile = new ClipFeedTab.Profile(null, ((f.e.AbstractC1725f.a) abstractC1725f).a);
            ClipsRouter clipsRouter = cVar.g;
            zof zofVar = this.i;
            ClipsRouter.b(clipsRouter, fragmentActivity, profile, null, null, null, null, zofVar.H().isEnabled() && zofVar.H().b(), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            return;
        }
        if (!(abstractC1725f instanceof f.e.AbstractC1725f.b)) {
            if (!(abstractC1725f instanceof f.e.AbstractC1725f.c)) {
                throw new NoWhenBranchMatchedException();
            }
            StoryViewerRouter.d(cVar.b, fragmentActivity, null, ((f.e.AbstractC1725f.c) abstractC1725f).a, MobileOfficialAppsConStoriesStat$ViewEntryPoint.PROFILE_SNACKBAR, LoadContext.Owner.b, "story_view", null, null, null, 3906);
        } else {
            VideoFile videoFile = ((f.e.AbstractC1725f.b) abstractC1725f).a;
            if (videoFile != null) {
                cVar.h.k(fragmentActivity, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (xsna.drm0.D(r3, xsna.f870.w(com.vk.superapp.miniapps.api.utils.InternalVkMiniApps.VKPAY_INSTALLMENT.h()), false) == false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Activity activity, String str) {
        ww50<?> Y;
        mrq0 mrq0Var = (mrq0) this.r.getValue();
        Regex regex = mrq0.a;
        mrq0Var.getClass();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        FragmentImpl u = (ey50Var == null || (Y = ey50Var.Y()) == null) ? null : Y.u();
        UserProfileFragment userProfileFragment = u instanceof UserProfileFragment ? (UserProfileFragment) u : null;
        if (userProfileFragment != null) {
            Uri parse = Uri.parse(naz.a(str));
            String path = parse.getPath();
            if (path != null) {
                if (!drm0.D(path, "/vkpay", false)) {
                    InternalMiniApps.Companion.getClass();
                    if (!drm0.D(path, f870.w(InternalMiniApps.VK_PAY_OLD.h()), false)) {
                        if (!drm0.D(path, "/vkpay_installment", false)) {
                        }
                    }
                }
                Activity h = e3m.h(activity);
                Uri referrer = h != null ? h.getReferrer() : null;
                String a2 = (referrer == null || !URLUtil.isNetworkUrl(referrer.toString())) ? null : i6n0.a(referrer, "http_referrer=");
                String queryParameter = parse.getQueryParameter("utm_source");
                if (queryParameter != null) {
                    a2 = pzl.b(a2 == null ? "" : a2.concat("&"), "utm_source=", queryParameter);
                }
                if (a2 != null) {
                    parse = parse.buildUpon().encodedFragment(a2).build();
                }
            }
            peq0 peq0Var = new peq0(parse);
            String queryParameter2 = parse.getQueryParameter("z");
            if (queryParameter2 == null || queryParameter2.length() == 0) {
                queryParameter2 = parse.getQueryParameter(Logger.METHOD_W);
            }
            if (queryParameter2 == null || queryParameter2.length() <= 0) {
                String queryParameter3 = parse.getQueryParameter("u");
                if (queryParameter3 != null) {
                    String path2 = jeq0.g(queryParameter3).getPath();
                    peq0Var.b = new String[]{path2 != null ? path2 : ""};
                    peq0Var.f = true;
                }
            } else {
                List a3 = n6j.a(0, DomExceptionUtils.SEPARATOR, queryParameter2);
                ArrayList arrayList = new ArrayList(c5g.u(a3, 10));
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    arrayList.add(DomExceptionUtils.SEPARATOR + ((String) it.next()));
                }
                peq0Var.b = (String[]) arrayList.toArray(new String[0]);
                peq0Var.f = true;
            }
            if (peq0.p(peq0Var, mrq0.a, null, null, 14) && epx.f(peq0Var.a.getQueryParameter("act"), "owner_photo_box")) {
                xn50.a.c(userProfileFragment, new UserProfileAction.s.b.c(new moq0.a.c(null)));
                return;
            }
        }
        maz.c(this.a.f.e(), activity, str, LaunchContext.A, null, null, 24);
    }

    public final void c(FragmentActivity fragmentActivity, final cwl0 cwl0Var) {
        if (cwl0Var.c.isEmpty()) {
            return;
        }
        this.e.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHOW_STORIES_OUT);
        List<StoriesContainer> list = cwl0Var.c;
        String str = cwl0Var.b;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = cwl0Var.g;
        String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE);
        StoryViewerRouter.a aVar = cwl0Var.h;
        if (aVar == null) {
            aVar = new zsq0(cwl0Var);
        }
        this.n.h(fragmentActivity, list, str, null, (r42 & 16) != 0, mobileOfficialAppsConStoriesStat$ViewEntryPoint, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, a2, null, (r42 & 512) != 0 ? null : null, aVar, (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : new wsq0(cwl0Var, 0), (65536 & r42) != 0 ? null : new DialogInterface.OnShowListener() { // from class: xsna.usq0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                cwl0.this.e.invoke();
            }
        }, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
    }
}
