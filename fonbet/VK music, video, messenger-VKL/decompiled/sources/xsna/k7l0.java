package xsna;

import android.content.Context;
import android.os.Build;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.clips.design.view.timeline.TimelineEditingActionsView;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.common.helpers.SelectTextActionModeCallback;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostTextAction;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.bio0;
import xsna.ikv0;
import xsna.pxw0;
import xsna.zhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k7l0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k7l0(com.vk.movika.sdk.base.ui.l lVar, abs0 abs0Var, Context context) {
        this.b = 17;
        this.c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ViewGroup viewGroup;
        MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype subtype;
        io.reactivex.rxjava3.core.q w;
        Context context;
        int i = this.b;
        int i2 = -1;
        int i3 = 28;
        int i4 = 6;
        int i5 = 9;
        int i6 = 2;
        int i7 = 12;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                o7l0 o7l0Var = ((l7l0) obj2).b;
                f4m.j(o7l0Var.c);
                o7l0Var.h.setVisibility(0);
                return s3q0.a;
            case 1:
                StickersView stickersView = (StickersView) obj2;
                List list = (List) obj;
                ContextUser e = stickersView.D.e();
                stickersView.I = e;
                if (e != null) {
                    e.e = list;
                }
                ral0 ral0Var = stickersView.z;
                sal0 sal0Var = ral0Var.c;
                if (sal0Var != null) {
                    sal0Var.setContextUser(e);
                }
                ral0Var.j = e;
                return s3q0.a;
            case 2:
                return Boolean.valueOf(epx.f(((StoriesContainer) obj).Jb(), ((StoriesContainer) obj2).Jb()));
            case 3:
                ((v76) obj2).getBottomControlPanel().setLoading(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 4:
                bmm0 bmm0Var = (bmm0) obj2;
                Pair pair = (Pair) obj;
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) pair.d();
                Throwable th = (Throwable) pair.g();
                if (th != null || getStoriesResponse == null) {
                    bmm0Var.a(th);
                } else {
                    List<StoriesContainer> storiesContainer = bmm0Var.a.getStoriesContainer();
                    if (storiesContainer != null) {
                        Iterator<StoriesContainer> it = storiesContainer.iterator();
                        int i8 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next() instanceof DiscoverStubStoriesContainer) {
                                    i2 = i8;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                    if (i2 >= 0) {
                        bmm0Var.b(getStoriesResponse);
                    } else {
                        bmm0Var.c(getStoriesResponse);
                    }
                }
                return s3q0.a;
            case 5:
                SuperAppFragment superAppFragment = ((com.vk.superapp.ui.a) obj2).b;
                View view = superAppFragment.getView();
                if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.error_container)) != null) {
                    ikv0.a aVar = new ikv0.a(superAppFragment.kn());
                    aVar.c();
                    aVar.h(new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12));
                    aVar.i(new ikv0.d(superAppFragment.getString(R.string.vk_mini_widget_cannot_save_changes), (String) null, new ikv0.d.a(superAppFragment.getString(R.string.vk_retry), null, new fv90(superAppFragment, 28), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2));
                    aVar.e(iah0.a(8.0f));
                    aVar.o(viewGroup);
                }
                return s3q0.a;
            case 6:
                awt0.r((am) obj, ((wdn0) obj2).itemView.getContext());
                return s3q0.a;
            case 7:
                ((Float) obj).floatValue();
                return Float.valueOf(((azl) obj2).I0(kmn0.a) / 2);
            case 8:
                bio0 bio0Var = (bio0) obj2;
                SelectTextActionModeCallback.Action action = (SelectTextActionModeCallback.Action) obj;
                if (action == SelectTextActionModeCallback.Action.Copy && Build.VERSION.SDK_INT <= 32) {
                    cvk.u(R.string.actions_popup_text_copied, false);
                }
                int i9 = bio0.a.$EnumSwitchMapping$0[action.ordinal()];
                if (i9 == 1) {
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype.SELECT;
                } else if (i9 == 2) {
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype.SELECT_ALL;
                } else {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype.COPY;
                }
                ?? q6 = bio0Var.q6();
                if (q6 != 0) {
                    p4r p4rVar = (p4r) bio0Var.G.getValue();
                    UserId o = k9q0.o(q6);
                    int n = di60.n(q6);
                    String str = bio0Var.v;
                    Integer valueOf = Integer.valueOf(n);
                    p4rVar.getClass();
                    p4r.i(str, o, valueOf, subtype);
                }
                return s3q0.a;
            case 9:
                int i10 = ThemedFeedToolbarFragment.a0;
                ((ThemedFeedToolbarFragment) obj2).finish();
                return s3q0.a;
            case 10:
                gzs<s3q0> gzsVar = ((TimelineEditingActionsView) obj2).t;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 11:
                ((m3p0) obj2).d.invoke(drm0.p0(((tho0) obj).a.c).toString());
                return s3q0.a;
            case 12:
                g7q0 g7q0Var = (g7q0) obj2;
                a7q0 a7q0Var = g7q0Var.b;
                ?? r1 = g7q0Var.p;
                a7q0Var.o1(((Calendar) r1.getValue()).get(13), ((Calendar) r1.getValue()).get(12), ((Calendar) r1.getValue()).get(11), ((Calendar) r1.getValue()).get(6) - 1);
                return s3q0.a;
            case 13:
                ((emq0) obj2).n.invoke(new UserProfileAction.b.C1673b((String) obj));
                return s3q0.a;
            case 14:
                fpq0 fpq0Var = (fpq0) obj2;
                kkq0 kkq0Var = (kkq0) obj;
                if (!kkq0Var.a.isEmpty()) {
                    fpq0Var.C(new UserProfileAction.s.g.C1698g(kkq0Var));
                }
                return s3q0.a;
            case 15:
                ((s0s0) obj2).k.onNext((a21) obj);
                return s3q0.a;
            case 16:
                VideoCatalogHeaderBrandedVh videoCatalogHeaderBrandedVh = (VideoCatalogHeaderBrandedVh) obj2;
                r8s0 r8s0Var = (r8s0) videoCatalogHeaderBrandedVh.l.getValue();
                int i11 = n0a.a;
                r8s0Var.getClass();
                xz9 xz9Var = (xz9) videoCatalogHeaderBrandedVh.k.getValue();
                ImageView imageView = videoCatalogHeaderBrandedVh.q;
                (imageView != null ? imageView : null).getContext();
                xz9Var.getClass();
                return s3q0.a;
            case 17:
                ((com.vk.movika.sdk.base.ui.l) obj2).invoke();
                return s3q0.a;
            case 18:
                ((com.vk.video.ui.discovery.minimizable.related_videos.e) obj2).e.invoke((c.s0.k) obj);
                return s3q0.a;
            case 19:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                VideoFile videoFile = (VideoFile) obj;
                ListBuilder e2 = e43.e();
                fgs0 fgs0Var = gVar.b0;
                fgs0Var.i.getClass();
                e2.add(io.reactivex.rxjava3.core.q.T(Collections.singletonList(new AboutVideoItem.b(videoFile))));
                io.reactivex.rxjava3.subjects.d<Boolean> dVar = gVar.o0;
                dVar.getClass();
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
                int i12 = 23;
                io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.y(dVar, qVar, aVar2).s0(new xb20(new whg0(gVar, 21), i12));
                u0o0 u0o0Var = new u0o0(new gda0(gVar, 29), i4);
                s0.getClass();
                e2.add(new io.reactivex.rxjava3.internal.operators.observable.z(s0, u0o0Var));
                io.reactivex.rxjava3.subjects.d<Boolean> dVar2 = gVar.s0;
                dVar2.getClass();
                io.reactivex.rxjava3.core.q<R> s02 = new io.reactivex.rxjava3.internal.operators.observable.y(dVar2, qVar, aVar2).s0(new gs00(new b8j0(gVar, 15), 18));
                j990 j990Var = new j990(new exi0(gVar, i12), 16);
                s02.getClass();
                e2.add(new io.reactivex.rxjava3.internal.operators.observable.z(s02, j990Var));
                wes0 wes0Var = fgs0Var.h;
                wes0Var.getClass();
                wgs0 wgs0Var = wes0Var.a;
                ucp ucpVar = ucp.a;
                CharSequence i13 = ucp.i(videoFile.getTitle());
                gpt0 gpt0Var = gpt0.a;
                e2.add(io.reactivex.rxjava3.core.q.T(Collections.singletonList(new AboutVideoItem.i(i13, videoFile.b0() * 1000, wes0Var.b ? videoFile.k1() * 1000 : 0L, videoFile.L8(), videoFile.getDuration(), ucp.i(wes0Var.c.m(cqm0.f(videoFile.j1()))), fxc0.B().c(videoFile), videoFile.Ha(), videoFile.p1(), wes0Var.d.a(nkt0.a(videoFile), DonutVideoCardSource.PLAYER), videoFile.z0()))));
                jsf0 jsf0Var = wgs0Var.g;
                e2.add(jsf0Var.b(videoFile.o0(), videoFile.a6()) ? io.reactivex.rxjava3.core.q.q(jsf0Var.e(videoFile.o0(), new UserId(videoFile.I0().b)) ? io.reactivex.rxjava3.internal.operators.observable.g0.b : io.reactivex.rxjava3.core.q.T(AboutVideoItem.t.b), jsf0Var.i(videoFile.o0(), new UserId(videoFile.I0().b)).l(new khc0(new cd10(24), i7)).w()).U(new bz60(new z6u(i3), i7)).d0(EmptyList.b) : io.reactivex.rxjava3.core.q.T(EmptyList.b));
                VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
                videoFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                int i14 = 8;
                int i15 = 5;
                int i16 = 17;
                if (!bVar.a(videoFeatures)) {
                    e2.add((videoFile.Y3().isEmpty() || wgs0Var.g.b(videoFile.o0(), videoFile.a6())) ? io.reactivex.rxjava3.core.q.T(EmptyList.b) : new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(gVar.a0.U(new ga40(new lir0(i6), 17)).U(new n5j0(new y160(18), 9)), qVar, aVar2).U(new x6h0(new dnh0(10, wes0Var, videoFile), i15)), qVar, aVar2).U(new mvc0(new bjm0(videoFile, i14), 9)));
                }
                io.reactivex.rxjava3.core.q<AboutVideoItem.d> a = wes0Var.f.a(videoFile);
                final pwm0 pwm0Var = wes0Var.e;
                e2.add(new io.reactivex.rxjava3.internal.operators.observable.y(a.p(new io.reactivex.rxjava3.core.u() { // from class: xsna.owm0
                    @Override // io.reactivex.rxjava3.core.u
                    public final io.reactivex.rxjava3.core.t a(io.reactivex.rxjava3.core.q qVar2) {
                        pwm0 pwm0Var2 = pwm0.this;
                        return qVar2.G0(pwm0Var2.g, new tuz(new lq2(9), 15)).U(new he40(new bl30(pwm0Var2, 25), 12));
                    }
                }), qVar, aVar2).U(new zq(28, new jz30(i16))));
                gVar.j.getClass();
                io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
                q9f0 q9f0Var = new q9f0(new rzl0(videoFile, i16), 6);
                fVar.getClass();
                e2.add(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, q9f0Var).U(new hub0(new rgl0(12), 7)).n0(io.reactivex.rxjava3.core.q.T(s3q0.a)).s0(new gwn0(new tbs0(1, wes0Var, videoFile), i15)));
                if (bVar.a(videoFeatures)) {
                    hht0 hht0Var = fgs0Var.j;
                    hht0Var.d.onNext(Optional.of(videoFile));
                    e2.add(hht0Var.e);
                }
                vvs0 vvs0Var = gVar.h;
                if (gsi0.b().c) {
                    io.reactivex.rxjava3.subjects.d<yfs0> dVar3 = gVar.e0;
                    aad0 aad0Var = new aad0(new wfl0(4), 13);
                    dVar3.getClass();
                    w = new io.reactivex.rxjava3.internal.operators.observable.i0(dVar3, aad0Var).K().w();
                } else {
                    io.reactivex.rxjava3.subjects.d<lgs0> dVar4 = gVar.d0;
                    t9c0 t9c0Var = new t9c0(i14, new t3v(23));
                    dVar4.getClass();
                    w = new io.reactivex.rxjava3.internal.operators.observable.i0(dVar4, t9c0Var).K().w();
                }
                x9t0 x9t0Var = fgs0Var.g;
                x9t0Var.getClass();
                io.reactivex.rxjava3.core.q p0 = w.L(new tj60(new v9t0(x9t0Var, vvs0Var), 19), false).p0(EmptyList.b);
                p0.getClass();
                e2.add(new io.reactivex.rxjava3.internal.operators.observable.y(p0, qVar, aVar2));
                e2.add(fgs0Var.e.a());
                return e2.g();
            case 20:
                tgi0 tgi0Var = (tgi0) obj;
                View view2 = ((VideoPlaylistPlaceHolder) obj2).y;
                String string = (view2 == null || (context = view2.getContext()) == null) ? null : context.getString(R.string.vk_accessibility_back);
                if (string == null) {
                    string = "";
                }
                qgi0.h(tgi0Var, string);
                return s3q0.a;
            case 21:
                return (io.reactivex.rxjava3.core.q) obj2;
            case 22:
                Context context2 = (Context) obj;
                LinearLayout a2 = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context2);
                a2.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
                for (ejt0 ejt0Var : (List) obj2) {
                    cjt0 cjt0Var = new cjt0(context2);
                    ejt0Var.getClass();
                    cjt0Var.setId(R.id.video_swipe_remove_button);
                    cjt0Var.setHapticFeedbackEnabled(true);
                    cjt0Var.setAnimateClicks(true);
                    cjt0Var.setOnClickListener(new zh0(ejt0Var, i5));
                    cjt0Var.setBackgroundColor(e3m.f(ejt0Var.d, context2));
                    cjt0Var.setIconTintRes(R.attr.vk_ui_icon_contrast);
                    cjt0Var.setImageSize(ejt0Var.b);
                    cjt0Var.setImageRes(ejt0Var.a);
                    cjt0Var.setLabel(ejt0Var.e);
                    a2.addView(cjt0Var, new LinearLayout.LayoutParams(ejt0Var.c, -1));
                }
                return a2;
            case 23:
                uxt0 uxt0Var = (uxt0) obj2;
                boolean a3 = uxt0Var.B.a();
                Context context3 = ((ViewGroup) obj).getContext();
                r0d r0dVar = (r0d) uxt0Var.W.getValue();
                pih0 pih0Var = uxt0Var.h;
                ClipsViewerComponentImpl clipsViewerComponentImpl = uxt0Var.p;
                nwy nwyVar = clipsViewerComponentImpl.i0;
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                qcy<Object> qcyVar = qcyVarArr[47];
                z0q z0qVar = (z0q) nwyVar.c();
                ClipsScreenPerformanceReporter clipsScreenPerformanceReporter = uxt0Var.A;
                h3d h3dVar = uxt0Var.d;
                lyc lycVar = uxt0Var.f;
                int i17 = uxt0Var.c;
                ClipsViewersSdkComponentImpl clipsViewersSdkComponentImpl = uxt0Var.q;
                kxc kxcVar = uxt0Var.j;
                gxp0 gxp0Var = uxt0Var.k;
                yux yuxVar = uxt0Var.l;
                njd njdVar = uxt0Var.v;
                e5 e5Var = uxt0Var.x;
                BridgeComponent bridgeComponent = uxt0Var.g;
                zof zofVar = uxt0Var.t;
                ibr0 pe = clipsViewerComponentImpl.pe();
                RecyclerView.u uVar = uxt0Var.w;
                sz00 sz00Var = uxt0Var.y;
                ntd0 ntd0Var = uxt0Var.z;
                pb pbVar = uxt0Var.b;
                enf enfVar = uxt0Var.D;
                yjc yjcVar = uxt0Var.n;
                lxc lxcVar = uxt0Var.E;
                com.vk.movika.sdk.base.observable.p pVar = uxt0Var.I;
                h5 h5Var = uxt0Var.H;
                nxc nxcVar = uxt0Var.G;
                s16 s16Var = uxt0Var.J;
                p16 p16Var = uxt0Var.K;
                p8e p8eVar = uxt0Var.L;
                vxt0 vxt0Var = (vxt0) uxt0Var.d0.getValue();
                nwy nwyVar2 = clipsViewerComponentImpl.j0;
                qcy<Object> qcyVar2 = qcyVarArr[48];
                m900 m900Var = (m900) nwyVar2.c();
                wie wieVar = uxt0Var.O;
                nwy nwyVar3 = clipsViewerComponentImpl.h0;
                qcy<Object> qcyVar3 = qcyVarArr[46];
                s1d s1dVar = new s1d(context3, r0dVar, h3dVar, lycVar, pih0Var, z0qVar, clipsScreenPerformanceReporter, i17, clipsViewersSdkComponentImpl, njdVar, kxcVar, gxp0Var, yuxVar, e5Var, bridgeComponent, zofVar, pe, uVar, sz00Var, ntd0Var, pbVar, a3, yjcVar, enfVar, lxcVar, nxcVar, pVar, h5Var, s16Var, p16Var, p8eVar, vxt0Var, new q0s0(3), new xlq0(7), m900Var, wieVar, (rnd) nwyVar3.c(), uxt0Var.P, uxt0Var.e0);
                o1d o1dVar = s1dVar.o;
                o1dVar.getContentView();
                if (a3) {
                    p0d p0dVar = uxt0Var.R;
                    View view3 = p0dVar != null ? p0dVar.itemView : null;
                    if (view3 != null) {
                        o1dVar.setControlsView(view3);
                        uxt0Var.R = null;
                    } else {
                        uxt0Var.Q = new WeakReference<>(s1dVar);
                    }
                }
                return s1dVar;
            case 24:
                l7k0 l7k0Var = (l7k0) obj2;
                l7k0Var.f.invoke();
                return new wkv0(l7k0Var);
            case 25:
                ((mjw0) obj2).l();
                return s3q0.a;
            case 26:
                ((VoipCreateScheduleCallFragment) obj2).Q.a(new pxw0.j((ScheduledCallRecurrence) obj));
                return s3q0.a;
            case 27:
                otw0 otw0Var = (otw0) obj2;
                int i18 = otw0.i1;
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                return Boolean.valueOf(otw0Var.Yn(dhw0Var != null ? dhw0Var.t : null));
            case 28:
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj2;
                zhg zhgVar = (zhg) obj;
                int i19 = VoipPastCallsFragment.a0;
                if (!(zhgVar instanceof zhg.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cvk.w(j03.g(voipPastCallsFragment.requireContext(), ((zhg.a) zhgVar).a, R.string.error), false);
                return s3q0.a;
            default:
                return new yxw0((ViewGroup) obj, (rxw0) obj2);
        }
    }

    public /* synthetic */ k7l0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
