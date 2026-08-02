package xsna;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Trace;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryHeaderVh;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.utils.newtork.d;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.im.ui.components.theme_chooser.c;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.f;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.profile.presentation.h;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.reflect.KVariance;
import xsna.aex0;
import xsna.atq0;
import xsna.bbv0;
import xsna.bex0;
import xsna.dis0;
import xsna.e6w0;
import xsna.gku0;
import xsna.hh8;
import xsna.ikv0;
import xsna.kdk0;
import xsna.mhr;
import xsna.nt80;
import xsna.q5x0;
import xsna.rg8;
import xsna.rnq0;
import xsna.tlw0;
import xsna.utp0;
import xsna.vim0;
import xsna.vxs0;
import xsna.xn50;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mdk0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mdk0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r6v16 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        String a;
        yw90 yw90Var;
        Context context;
        int i = 8;
        switch (this.b) {
            case 0:
                odk0 odk0Var = (odk0) this.c;
                kdk0.c cVar = kdk0.c.b;
                odk0Var.getClass();
                xn50.a.c(odk0Var, cVar);
                return s3q0.a;
            case 1:
                ((wjm0) this.c).c.fo(vim0.b.b);
                return s3q0.a;
            case 2:
                jvq jvqVar = (jvq) this.c;
                hh8 hh8Var = (hh8) obj;
                int i2 = StreamInfoFragment.S;
                if (hh8Var instanceof hh8.b) {
                    mhr mhrVar = ((hh8.b) hh8Var).a;
                    if (mhrVar instanceof mhr.a) {
                        obj2 = new rg8.a();
                    } else {
                        if (!(mhrVar instanceof mhr.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = jvqVar.a(((mhr.b) mhrVar).a, false);
                    }
                } else if (hh8Var instanceof hh8.a) {
                    hh8.a aVar = (hh8.a) hh8Var;
                    nt80<dfw0> nt80Var = aVar.f;
                    if (nt80Var instanceof nt80.b) {
                        obj2 = rg8.c.a;
                    } else if (nt80Var instanceof nt80.d) {
                        obj2 = rg8.e.a;
                    } else if (nt80Var instanceof nt80.a) {
                        obj2 = new rg8.b(((nt80.a) nt80Var).a);
                    } else {
                        if (!(nt80Var instanceof nt80.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dfw0 dfw0Var = (dfw0) ((nt80.c) nt80Var).a;
                        obj2 = dfw0Var != null ? jvqVar.a(dfw0Var, aVar.j) : rg8.e.a;
                    }
                } else {
                    obj2 = rg8.c.a;
                }
                return new it80(obj2);
            case 3:
                ctn0 ctn0Var = (ctn0) this.c;
                Object d = ((Result) obj).d();
                if (!(d instanceof Result.Failure)) {
                    rnq0.a aVar2 = (rnq0.a) d;
                    u5p0 u5p0Var = ctn0Var.f;
                    if (u5p0Var == null) {
                        u5p0Var = null;
                    }
                    u5p0Var.invoke(new UserProfileAction.c0.b(aVar2.a, aVar2.c, aVar2.d, aVar2.b));
                }
                Throwable a2 = Result.a(d);
                if (a2 != null) {
                    fpq0 fpq0Var = ctn0Var.h;
                    if (fpq0Var == null) {
                        fpq0Var = null;
                    }
                    fpq0Var.B(new f.h(new atq0.f(null, null, a2, 11)));
                }
                return s3q0.a;
            case 4:
                c.AbstractC1159c abstractC1159c = (c.AbstractC1159c) obj;
                com.vk.im.ui.components.theme_chooser.c cVar2 = ((com.vk.im.ui.components.theme_chooser.b) this.c).p;
                if (cVar2 != null) {
                    cVar2.a(abstractC1159c);
                }
                return s3q0.a;
            case 5:
                wcy wcyVar = (wcy) obj;
                ((utp0) this.c).getClass();
                KVariance kVariance = wcyVar.a;
                vcy vcyVar = wcyVar.b;
                if (kVariance == null) {
                    return "*";
                }
                r6 = vcyVar instanceof utp0 ? (utp0) vcyVar : 0;
                String valueOf = (r6 == 0 || (a = r6.a(true)) == null) ? String.valueOf(vcyVar) : a;
                int i3 = utp0.a.$EnumSwitchMapping$0[kVariance.ordinal()];
                if (i3 == 1) {
                    return valueOf;
                }
                if (i3 == 2) {
                    return "in ".concat(valueOf);
                }
                if (i3 == 3) {
                    return "out ".concat(valueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.vk.profile.user.impl.ui.i iVar = userProfileFragment.Q;
                bwt0.p0((iVar != null ? iVar : null).k, booleanValue);
                return s3q0.a;
            case 7:
                return new Pair((bwq0) obj, Boolean.valueOf(!((WallWithCounters) this.c).isEmpty()));
            case 8:
                ((ntq0) this.c).n.a(UserProfileAction.v.a.b);
                return s3q0.a;
            case 9:
                ((nrr0) this.c).l.l();
                return s3q0.a;
            case 10:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.c;
                videoAutoPlay.y.p0(videoAutoPlay);
                return s3q0.a;
            case 11:
                VideoCategoryHeaderVh videoCategoryHeaderVh = (VideoCategoryHeaderVh) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                videoCategoryHeaderVh.h = booleanValue2;
                if (booleanValue2) {
                    CollapsingToolbarLayout collapsingToolbarLayout = videoCategoryHeaderVh.c;
                    if (collapsingToolbarLayout == null) {
                        collapsingToolbarLayout = null;
                    }
                    collapsingToolbarLayout.setVisibility(8);
                    CollapsingToolbarLayout collapsingToolbarLayout2 = videoCategoryHeaderVh.c;
                    if (collapsingToolbarLayout2 == null) {
                        collapsingToolbarLayout2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout2.getLayoutParams();
                    NonBouncedAppBarLayout.c cVar3 = layoutParams instanceof NonBouncedAppBarLayout.c ? (NonBouncedAppBarLayout.c) layoutParams : null;
                    if (cVar3 != null) {
                        cVar3.a = 0;
                    }
                    CollapsingToolbarLayout collapsingToolbarLayout3 = videoCategoryHeaderVh.c;
                    if (collapsingToolbarLayout3 == null) {
                        collapsingToolbarLayout3 = null;
                    }
                    ((ImageView) collapsingToolbarLayout3.findViewById(R.id.video_playlist_cover)).setImageDrawable(null);
                }
                return s3q0.a;
            case 12:
                dis0 dis0Var = (dis0) this.c;
                Activity h = e3m.h(dis0Var.getContext());
                if (h == null) {
                    c63 c63Var = c63.a;
                    h = c63.b();
                    if (h == null) {
                        return s3q0.a;
                    }
                }
                Activity activity = h;
                Object obj3 = dis0.t;
                VideoFile videoFile = dis0Var.h;
                dis0Var.i = dis0.a.a(videoFile == null ? null : videoFile, activity, true, dis0Var.j, true, true);
                return s3q0.a;
            case 13:
                Cursor d2 = ((kts0) this.c).b.b().d(air.b(')', "SELECT * FROM video_message_stencil WHERE id IN (", j5g.g0(j5g.O0((Collection) obj), StringUtils.COMMA, null, null, 0, null, 62)), null);
                HashMap hashMap = new HashMap(d2.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d2.moveToFirst()) {
                            while (!d2.isAfterLast()) {
                                hashMap.put(Integer.valueOf(d2.getInt(0)), new j0l0(d2.getLong(2), d2.getLong(3), d2.getInt(0), d2.getString(1)));
                                d2.moveToNext();
                            }
                        }
                        Trace.endSection();
                        return hashMap;
                    } finally {
                        d2.close();
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 14:
                ((com.vk.video.ui.discovery.minimizable.g) this.c).T(new n.b((List) obj));
                return s3q0.a;
            case 15:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                vxs0 vxs0Var = (vxs0) obj;
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                if (vxs0Var instanceof vxs0.d) {
                    ((vxs0.d) vxs0Var).getClass();
                    xn50.a.c(videoMinimizableDiscoveryFragment, new c.q());
                } else if (vxs0Var instanceof vxs0.a) {
                    videoMinimizableDiscoveryFragment.a0();
                } else if (vxs0Var instanceof vxs0.c) {
                    MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                    if (miniPlayerControllersWrapper != null) {
                        miniPlayerControllersWrapper.h(null);
                    }
                } else if (vxs0Var instanceof vxs0.e) {
                    VideoMinimizableScreenArgs videoMinimizableScreenArgs = ((vxs0.e) vxs0Var).a;
                    ian ianVar = videoMinimizableDiscoveryFragment.Z0;
                    VideoMinimizableScreenArgs.ControllerArgs controllerArgs = videoMinimizableScreenArgs.b;
                    String a1 = controllerArgs.b.a1();
                    if (epx.f(ianVar.e, a1)) {
                        yw90 yw90Var2 = ianVar.a;
                        if (yw90Var2 != null) {
                            yw90Var2.stop();
                        }
                        ianVar.a = null;
                        mzp0 mzp0Var = ianVar.b;
                        if (mzp0Var != null) {
                            mzp0Var.j();
                        }
                        ianVar.b = null;
                        ianVar.f = true;
                    } else {
                        yw90 yw90Var3 = ianVar.a;
                        if (yw90Var3 != null) {
                            yw90Var3.stop();
                        }
                        zrd0 zrd0Var = zrd0.a;
                        yw90 yw90Var4 = (yw90) zrd0.a(PerformanceScoreProduct.VIDEO_DISCOVERY).j();
                        ianVar.a = yw90Var4;
                        if (yw90Var4 != null) {
                            yw90Var4.init();
                        }
                        LruCache<UUID, mzp0> lruCache = rzp0.a;
                        mzp0 mzp0Var2 = (mzp0) rzp0.c(UiMeasuringScreen.VIDEO_DISCOVERY, null, false, 62).j();
                        mzp0Var2.init();
                        ianVar.b = mzp0Var2;
                        ianVar.f = false;
                        ianVar.e = a1;
                        View view = ianVar.c;
                        if (view != null && (yw90Var = ianVar.a) != null) {
                            yw90Var.d3(view);
                        }
                    }
                    videoMinimizableDiscoveryFragment.n0 = new lzh0(((SearchUiComponent) videoMinimizableDiscoveryFragment.ko().x.getValue()).Ga(), controllerArgs.e);
                    xn50.a.c(videoMinimizableDiscoveryFragment, new c.u(videoMinimizableScreenArgs));
                    videoMinimizableDiscoveryFragment.ko().Hf().getClass();
                } else {
                    if (!(vxs0Var instanceof vxs0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((vxs0.b) vxs0Var).getClass();
                }
                return s3q0.a;
            case 16:
                t8t0 t8t0Var = (t8t0) this.c;
                com.vk.core.utils.newtork.d dVar = (com.vk.core.utils.newtork.d) obj;
                if (epx.f(t8t0Var.c, d.b.a) && epx.f(dVar, d.a.a)) {
                    t8t0Var.a.b(h.x.a);
                }
                t8t0Var.c = dVar;
                return s3q0.a;
            case 17:
                ((yau0) this.c).k = (w73) obj;
                return s3q0.a;
            case 18:
                dyz0 dyz0Var = (dyz0) this.c;
                UserId userId = ((hp) obj).a;
                return new h2q(userId, ((k2q) dyz0Var.b).a(userId));
            case 19:
                a3v0 a3v0Var = (a3v0) this.c;
                vgg vggVar = (vgg) obj;
                Throwable th2 = vggVar.a;
                if (!(th2 instanceof VKApiExecutionException) || ((VKApiExecutionException) th2).s() != 104) {
                    v2v0 v2v0Var = (v2v0) a3v0Var.a;
                    if (v2v0Var != null) {
                        v2v0Var.na();
                    }
                    vggVar.c();
                } else if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    v2v0 v2v0Var2 = (v2v0) a3v0Var.a;
                    if (v2v0Var2 != null) {
                        v2v0Var2.oa(VkLoginConfirmationStatusType.UNKNOWN_CONFIRMATION);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 20:
                Pair pair = (Pair) this.c;
                i6j i6jVar = (i6j) obj;
                ((pco) pair.d()).getClass();
                float f = ((pco) pair.g()).b;
                s5j s5jVar = new s5j("anchor");
                s5j s5jVar2 = new s5j("balloon");
                y5j.a g = i6jVar.g(f - e06.ForVerticalBalloons.h());
                i6jVar.c(s5jVar, new ubj0(i));
                i6jVar.c(s5jVar2, new fvq0(g, 14));
                return s3q0.a;
            case 21:
                gbv0 gbv0Var = (gbv0) this.c;
                bbv0.g.getClass();
                bbv0.a.c((Throwable) obj);
                gbv0Var.m(gku0.c.b);
                return s3q0.a;
            case 22:
                VkPlaceholder.a.C0857a c0857a = (VkPlaceholder.a.C0857a) this.c;
                int i5 = VkPlaceholder.A;
                c0857a.b.invoke();
                return s3q0.a;
            case 23:
                qnf0 qnf0Var = (qnf0) this.c;
                Reef reef = (Reef) obj;
                if (reef != null) {
                    reef.a(new ReefEvent.j(qnf0Var));
                }
                return s3q0.a;
            case 24:
                pwv0 pwv0Var = (pwv0) this.c;
                WebGroupShortInfo webGroupShortInfo = (WebGroupShortInfo) obj;
                if (webGroupShortInfo.f == 1) {
                    r6y r6yVar = pwv0Var.b;
                    if (r6yVar != null && (context = r6yVar.l) != null) {
                        aex0.a aVar3 = new aex0.a();
                        WebImageSize e = webGroupShortInfo.i.e(200);
                        String str = e != null ? e.b : null;
                        Boolean bool = Boolean.TRUE;
                        aVar3.c = str;
                        aVar3.d = bool;
                        aVar3.e = webGroupShortInfo.b.c;
                        aVar3.f = context.getString(R.string.vk_apps_leave_group_subtitle);
                        aVar3.b(context.getString(R.string.vk_apps_leave_group), new mwv0(pwv0Var, webGroupShortInfo));
                        aVar3.h = new aex0.e(context.getString(R.string.vk_apps_cancel_request), new nwv0(pwv0Var));
                        aVar3.j = new owv0(pwv0Var);
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        (superappUiRouterBridge != null ? superappUiRouterBridge : null).e0(aVar3.a());
                    }
                } else {
                    r6y r6yVar2 = pwv0Var.b;
                    if (r6yVar2 != null) {
                        bex0.a.b(r6yVar2, JsApiMethodType.LEAVE_GROUP, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                    }
                }
                return s3q0.a;
            case 25:
                ((b8w0) this.c).a.invoke(e6w0.f.b);
                return s3q0.a;
            case 26:
                ylw0 ylw0Var = (ylw0) this.c;
                int i6 = ylw0.x1;
                tlw0.a.C3757a c3757a = tlw0.a.C3757a.b;
                ylw0Var.getClass();
                xn50.a.c(ylw0Var, c3757a);
                return s3q0.a;
            case 27:
                return new r990((ViewGroup) obj, ((muw0) this.c).i);
            default:
                f6x0 f6x0Var = (f6x0) this.c;
                q5x0 q5x0Var = (q5x0) obj;
                if (!(q5x0Var instanceof q5x0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = ((q5x0.a) q5x0Var).a;
                View view2 = f6x0Var.a;
                ikv0.a aVar4 = new ikv0.a(view2.getContext());
                aVar4.u = new ikv0.d(view2.getContext().getString(i7), (String) r6, (ikv0.d.a) r6, 6);
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup != null) {
                    aVar4.o(viewGroup);
                } else {
                    aVar4.n();
                }
                return s3q0.a;
        }
    }
}
