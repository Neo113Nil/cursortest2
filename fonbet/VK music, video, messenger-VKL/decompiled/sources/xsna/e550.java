package xsna;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.music.bottomsheets.onboarding.di.RecommendationOnboardingComponentImpl;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.narratives.impl.di.NarrativeComponentImpl;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.domain.model.NewsfeedInitialPost;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import com.vk.notifications.dnd.api.di.DndComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import one.video.controls.view.PositionDurationView;
import xsna.bij;
import xsna.mbc0;
import xsna.nyd0.j;
import xsna.pn60;
import xsna.qn60;
import xsna.qz60;
import xsna.r070;
import xsna.tmd0;
import xsna.yo60;
import xsna.zdh0.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e550 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e550(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0569  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Bundle arguments;
        NewsfeedInitialPost newsfeedInitialPost;
        bpn0 bpn0Var;
        int i;
        String str;
        FeedFeatures feedFeatures;
        bpn0 bpn0Var2;
        Pair a;
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = this.b;
        int i3 = 1;
        Object obj = this.c;
        switch (i2) {
            case 0:
                return ((BridgeComponent) ((k7m) m7m.f((MusicSearchCatalogConfiguration) obj)).a(fpf0.a(BridgeComponent.class))).cb();
            case 1:
                return new wu50(((NarrativeComponentImpl) obj).c6());
            case 2:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) obj;
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                newsfeedFragment.eo();
                FeedFeatures feedFeatures2 = FeedFeatures.FEED_OPEN_POST_LINK;
                feedFeatures2.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(feedFeatures2) && (arguments = newsfeedFragment.getArguments()) != null) {
                    long j = arguments.getLong("initial_post_owner_id", 0L);
                    int i4 = arguments.getInt("initial_post_id", 0);
                    if (j != 0 && i4 != 0) {
                        newsfeedInitialPost = new NewsfeedInitialPost(j, i4);
                        m6r0 a2 = ((NewsFeedBridgeComponent) newsfeedFragment.fo().d.getValue()).Ad().a();
                        bpn0Var = new bpn0(new xis(a2, 28));
                        pn60 pn60Var = new pn60(new pn60.a((s1c0) newsfeedFragment.O.getValue(), newsfeedFragment.e0.get(), newsfeedFragment.ho().get()), newsfeedFragment.fo().d);
                        newsfeedFragment.S = pn60Var;
                        int i5 = y1z.a;
                        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                        qn60 qn60Var = new qn60(new zyp0(new pl60(false)));
                        s1v s1vVar = new s1v();
                        ct60 fo = newsfeedFragment.fo();
                        AtomicInteger atomicInteger = newsfeedFragment.d0;
                        AtomicReference<String> ho = newsfeedFragment.ho();
                        i = atomicInteger.get();
                        str = ho.get();
                        if (newsfeedInitialPost == null && bVar.a(feedFeatures2)) {
                            a = kt60.a(i, str, newsfeedInitialPost);
                            bpn0Var2 = bpn0Var;
                        } else {
                            feedFeatures = FeedFeatures.START_UP_DIRECT_CACHE;
                            feedFeatures.getClass();
                            if (bVar.a(feedFeatures) || !yk60.m.get()) {
                                bpn0Var2 = bpn0Var;
                                a = kt60.a(i, str, newsfeedInitialPost);
                            } else {
                                int i6 = atomicInteger.get();
                                String str2 = ho.get();
                                ce60.b.getClass();
                                boolean m = ce60.m();
                                boolean z4 = ce60.i.get();
                                mzp0 a3 = fo.g().a();
                                if (a3 != null) {
                                    a3.a();
                                }
                                bpn0Var2 = bpn0Var;
                                Result result = (Result) new io.reactivex.rxjava3.internal.operators.single.d0(((NewsFeedComponent) fo.e.getValue()).Aa().k(i6, m, false).l(new pb(new t3v(7), 28)).r(50L, TimeUnit.MILLISECONDS), new vq(24), null).c();
                                Object d = result.d();
                                if (d instanceof Result.Failure) {
                                    d = null;
                                }
                                lu60 lu60Var = (lu60) d;
                                if (!(result.d() instanceof Result.Failure) && lu60Var != null && lu60Var.a().isEmpty()) {
                                    mzp0 a4 = fo.g().a();
                                    if (a4 != null) {
                                        a4.c(true);
                                    }
                                    pn60.b(pn60Var, str2);
                                    a = kt60.b(i6, str2);
                                } else if ((result.d() instanceof Result.Failure) || lu60Var == null) {
                                    mzp0 a5 = fo.g().a();
                                    if (a5 != null) {
                                        a5.f();
                                    }
                                    a = kt60.a(i6, str2, newsfeedInitialPost);
                                } else {
                                    mzp0 a6 = fo.g().a();
                                    if (a6 != null) {
                                        a6.c(true);
                                    }
                                    pn60.b(pn60Var, str2);
                                    NewsfeedDeduplicator newsfeedDeduplicator = (NewsfeedDeduplicator) bpn0Var2.getValue();
                                    aic aicVar = new aic();
                                    qz60 qz60Var = qz60.j;
                                    Object f = qn60Var.f(aicVar, new rn0(i6, qz60Var.f, pn60Var), new qn0(qz60Var.g.a, pn60Var), new xc3(lu60Var.a(), null, pn60Var, newsfeedDeduplicator, null, true, sua.m(lu60Var)), new bjj0(i6, lu60Var, pn60Var));
                                    boolean z5 = f instanceof Result.Failure;
                                    if (z5) {
                                        a = kt60.a(i6, str2, newsfeedInitialPost);
                                    } else {
                                        int i7 = atomicInteger.get();
                                        String str3 = ho.get();
                                        if (z5) {
                                            f = null;
                                        }
                                        qn60.c cVar = (qn60.c) f;
                                        ArrayList arrayList = cVar != null ? cVar.a : null;
                                        if (arrayList == null || arrayList.isEmpty()) {
                                            a = kt60.b(i7, str3);
                                        } else {
                                            s1v.l(arrayList);
                                            boolean z6 = lu60Var instanceof al60;
                                            if (z6) {
                                                z2 = ((al60) lu60Var).h;
                                            } else if (lu60Var instanceof os60) {
                                                z2 = ((os60) lu60Var).g;
                                            } else {
                                                z = true;
                                                sq60 sq60Var = new sq60(arrayList, EmptyList.b, cVar.b, z, false, z6 ? !((lu60Var instanceof os60) && ((os60) lu60Var).g) : !((al60) lu60Var).h, null, null);
                                                fo.g().b();
                                                ((or60) fo.c.t.getValue()).l(new yo60.j.b(lu60Var.b()));
                                                d070 f2 = fo.f();
                                                f2.getClass();
                                                if (i7 == 0) {
                                                    ts60 ts60Var = f2.c;
                                                    NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                                                    ts60Var.T();
                                                    f2.a().f(false);
                                                }
                                                a = new Pair(qz60.a(qz60Var, ur60.a(ur60.h, sq60Var, null, lu60Var.b(), ListLoadingState.IDLE, false, false, 2), i7, str3, null, null, null, new qz60.a((m || z4) ? false : true, 7), null, 184), kt60.c(new r070.j.c(i7), new r070.e.d(true), new r070.e.g(i7, false), r070.g.a.b));
                                            }
                                            z = z2;
                                            sq60 sq60Var2 = new sq60(arrayList, EmptyList.b, cVar.b, z, false, z6 ? !((lu60Var instanceof os60) && ((os60) lu60Var).g) : !((al60) lu60Var).h, null, null);
                                            fo.g().b();
                                            ((or60) fo.c.t.getValue()).l(new yo60.j.b(lu60Var.b()));
                                            d070 f22 = fo.f();
                                            f22.getClass();
                                            if (i7 == 0) {
                                            }
                                            a = new Pair(qz60.a(qz60Var, ur60.a(ur60.h, sq60Var2, null, lu60Var.b(), ListLoadingState.IDLE, false, false, 2), i7, str3, null, null, null, new qz60.a((m || z4) ? false : true, 7), null, 184), kt60.c(new r070.j.c(i7), new r070.e.d(true), new r070.e.g(i7, false), r070.g.a.b));
                                        }
                                    }
                                }
                            }
                        }
                        qz60 qz60Var2 = (qz60) a.d();
                        List list = (List) a.g();
                        newsfeedFragment.T = qn60Var;
                        sq60 sq60Var3 = qz60Var2.b.b;
                        newsfeedFragment.z0 = sq60Var3.a;
                        newsfeedFragment.A0 = sq60Var3.c;
                        io.reactivex.rxjava3.disposables.b bVar2 = newsfeedFragment.Q;
                        ?? r5 = newsfeedFragment.U;
                        ct60 fo2 = newsfeedFragment.fo();
                        mo60 mo60Var = fo2.c;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        long millis = timeUnit.toMillis(a2.c(m6r0.b1, -1));
                        float floatValue = ((Number) a2.b(m6r0.c1, Float.valueOf(1.0f))).floatValue();
                        long millis2 = timeUnit.toMillis(a2.c(m6r0.d1, -1));
                        pv8 pv8Var = (pv8) ((bxx) a2.a(m6r0.Z0));
                        xhs xhsVar = new xhs(millis, floatValue, millis2, pv8Var == null ? pv8Var.h : null);
                        jt60 jt60Var = new jt60(xhsVar, (ts60) mo60Var.W.getValue(), fo2.e);
                        xj60 xj60Var = new xj60((ts60) mo60Var.W.getValue());
                        yz60 yz60Var = new yz60((AtomicReference) mo60Var.a.b);
                        UiTracker uiTracker = UiTracker.a;
                        com.vk.channels.impl.channel_screen.send_msg.c cVar2 = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) yz60Var);
                        AtomicReference atomicReference = new AtomicReference(new wn60((byte) 0));
                        ts60 ts60Var2 = (ts60) mo60Var.W.getValue();
                        ?? r13 = fo2.s;
                        ?? r14 = fo2.v;
                        ?? r15 = fo2.t;
                        lsw lswVar = new lsw();
                        vh8 vh8Var = fo2.y;
                        uw60 uw60Var = new uw60();
                        uw60Var.a = 0L;
                        zz60 zz60Var = new zz60(jt60Var, xhsVar, xj60Var, lswVar, vh8Var, uw60Var, qn60Var, pn60Var, cVar2, atomicReference, ts60Var2, r13, r14, r15, mo60Var.j, mo60Var.m, fo2.p, fo2.g(), s1vVar, r5, new ot60(new qt60(), new pt60(), new nt60()), new st60(fs60.a(qn60Var, pn60Var, cVar2, mo60Var), jt60Var, new bpn0(new gu0(28)), new bpn0(new x84(25)), fo2.l, fo2.o, bpn0Var2));
                        rn60.a(qn60Var);
                        return new wz60(new xz60(new Cnew(qz60Var2, 19), new m15(list, 8), bVar2), zz60Var, fo2.A);
                    }
                }
                newsfeedInitialPost = null;
                m6r0 a22 = ((NewsFeedBridgeComponent) newsfeedFragment.fo().d.getValue()).Ad().a();
                bpn0Var = new bpn0(new xis(a22, 28));
                pn60 pn60Var2 = new pn60(new pn60.a((s1c0) newsfeedFragment.O.getValue(), newsfeedFragment.e0.get(), newsfeedFragment.ho().get()), newsfeedFragment.fo().d);
                newsfeedFragment.S = pn60Var2;
                int i52 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen2 = LegoCustomRedesignedScreen.EXAMPLE;
                qn60 qn60Var2 = new qn60(new zyp0(new pl60(false)));
                s1v s1vVar2 = new s1v();
                ct60 fo3 = newsfeedFragment.fo();
                AtomicInteger atomicInteger2 = newsfeedFragment.d0;
                AtomicReference<String> ho2 = newsfeedFragment.ho();
                i = atomicInteger2.get();
                str = ho2.get();
                if (newsfeedInitialPost == null) {
                }
                feedFeatures = FeedFeatures.START_UP_DIRECT_CACHE;
                feedFeatures.getClass();
                if (bVar.a(feedFeatures)) {
                }
                bpn0Var2 = bpn0Var;
                a = kt60.a(i, str, newsfeedInitialPost);
                qz60 qz60Var22 = (qz60) a.d();
                List list2 = (List) a.g();
                newsfeedFragment.T = qn60Var2;
                sq60 sq60Var32 = qz60Var22.b.b;
                newsfeedFragment.z0 = sq60Var32.a;
                newsfeedFragment.A0 = sq60Var32.c;
                io.reactivex.rxjava3.disposables.b bVar22 = newsfeedFragment.Q;
                ?? r52 = newsfeedFragment.U;
                ct60 fo22 = newsfeedFragment.fo();
                mo60 mo60Var2 = fo22.c;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long millis3 = timeUnit2.toMillis(a22.c(m6r0.b1, -1));
                float floatValue2 = ((Number) a22.b(m6r0.c1, Float.valueOf(1.0f))).floatValue();
                long millis22 = timeUnit2.toMillis(a22.c(m6r0.d1, -1));
                pv8 pv8Var2 = (pv8) ((bxx) a22.a(m6r0.Z0));
                xhs xhsVar2 = new xhs(millis3, floatValue2, millis22, pv8Var2 == null ? pv8Var2.h : null);
                jt60 jt60Var2 = new jt60(xhsVar2, (ts60) mo60Var2.W.getValue(), fo22.e);
                xj60 xj60Var2 = new xj60((ts60) mo60Var2.W.getValue());
                yz60 yz60Var2 = new yz60((AtomicReference) mo60Var2.a.b);
                UiTracker uiTracker2 = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar22 = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) yz60Var2);
                AtomicReference atomicReference2 = new AtomicReference(new wn60((byte) 0));
                ts60 ts60Var22 = (ts60) mo60Var2.W.getValue();
                ?? r132 = fo22.s;
                ?? r142 = fo22.v;
                ?? r152 = fo22.t;
                lsw lswVar2 = new lsw();
                vh8 vh8Var2 = fo22.y;
                uw60 uw60Var2 = new uw60();
                uw60Var2.a = 0L;
                zz60 zz60Var2 = new zz60(jt60Var2, xhsVar2, xj60Var2, lswVar2, vh8Var2, uw60Var2, qn60Var2, pn60Var2, cVar22, atomicReference2, ts60Var22, r132, r142, r152, mo60Var2.j, mo60Var2.m, fo22.p, fo22.g(), s1vVar2, r52, new ot60(new qt60(), new pt60(), new nt60()), new st60(fs60.a(qn60Var2, pn60Var2, cVar22, mo60Var2), jt60Var2, new bpn0(new gu0(28)), new bpn0(new x84(25)), fo22.l, fo22.o, bpn0Var2));
                rn60.a(qn60Var2);
                return new wz60(new xz60(new Cnew(qz60Var22, 19), new m15(list2, 8), bVar22), zz60Var2, fo22.A);
            case 3:
                return (LinksGeneratorComponent) ((mo60) obj).c().mo408a(fpf0.a(LinksGeneratorComponent.class));
            case 4:
                return new cu60((at60) obj);
            case 5:
                a880 a880Var = (a880) obj;
                a880Var.d = false;
                a880Var.v = false;
                a880Var.u = false;
                a880Var.x = 0;
                a880Var.w = 0;
                return s3q0.a;
            case 6:
                lba0 lba0Var = (lba0) obj;
                lba0Var.t.set(true);
                CopyOnWriteArrayList<bij.a> copyOnWriteArrayList = lba0Var.u;
                Iterator<bij.a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().invoke();
                }
                copyOnWriteArrayList.clear();
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                PickVKPhotoFragmentNew pickVKPhotoFragmentNew = new PickVKPhotoFragmentNew();
                Bundle bundle = new Bundle();
                bundle.putParcelable("uid", (UserId) obj);
                pickVKPhotoFragmentNew.setArguments(bundle);
                return pickVKPhotoFragmentNew;
            case 8:
                sra0 sra0Var = (sra0) obj;
                if (!jjc.b()) {
                    sra0Var.c.yi(a.b.C1408a.b);
                }
                return s3q0.a;
            case 9:
                return ((PlayerAnalyticsComponent) ((k7m) m7m.f((vva0) obj)).a(fpf0.a(PlayerAnalyticsComponent.class))).Ia();
            case 10:
                ViewParent parent = ((hib0) obj).g.getParent();
                while (parent != null && !(parent instanceof NonBouncedAppBarLayout)) {
                    parent = parent.getParent();
                }
                if (parent instanceof NonBouncedAppBarLayout) {
                    return (NonBouncedAppBarLayout) parent;
                }
                return null;
            case 11:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 12:
                return new mbc0.a((mbc0) obj);
            case 13:
                ftc0 ftc0Var = ((isc0) obj).f;
                return new Result(ftc0Var.a.f(new txf0(), new kjj0(ftc0Var.b)));
            case 14:
                ((ml1) obj).invoke(tmd0.b.a);
                return s3q0.a;
            case 15:
                return ((nyd0) obj).new j();
            case 16:
                return (TextView) ((View) ((i0e0) obj).d.getValue()).findViewById(R.id.select_tab);
            case 17:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.setStartDelay(0L);
                ofFloat.setDuration(b3f0.l);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new icd((b3f0) obj, i3));
                return ofFloat;
            case 18:
                return new ph80(((RecommendationOnboardingComponentImpl) obj).a.Q0());
            case 19:
                RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
                return ((DndComponent) ((k7m) m7m.f((RedesignNotificationSettingsFragment) obj)).a(fpf0.a(DndComponent.class))).Ta();
            case 20:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 21:
                int i8 = a5g0.k1;
                ((a5g0) obj).dismiss();
                return s3q0.a;
            case 22:
                zdh0 zdh0Var = (zdh0) obj;
                return e43.l(zdh0Var.new a(MediaStore.Images.Media.INTERNAL_CONTENT_URI), zdh0Var.new a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
            case 23:
                ((zph0) obj).k.a();
                return s3q0.a;
            case 24:
                ProgressBar progressBar = ((e0i0) obj).a;
                progressBar.setVisibility(8);
                progressBar.setAlpha(1.0f);
                return s3q0.a;
            case 25:
                return (PositionDurationView) ((b4i0) obj).findViewById(R.id.video_time_view);
            case 26:
                int i9 = gbi0.o1;
                ((gbi0) obj).dismiss();
                return s3q0.a;
            case 27:
                ((ikv0) obj).a();
                return s3q0.a;
            case 28:
                Boolean bool = ((com.vk.sharing.core.view.f) obj).C;
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    b4w b = com.vk.toggle.d.o0.b();
                    if (b == null) {
                        b4w.c.getClass();
                        b = b4w.d;
                    }
                    z3 = b.b;
                }
                return Boolean.valueOf(z3);
            default:
                return new it80(((clj0) obj).c());
        }
    }
}
