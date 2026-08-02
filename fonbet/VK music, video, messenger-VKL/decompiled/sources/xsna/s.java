package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.a;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.topbar.k;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.b4;
import xsna.fbw;
import xsna.h7u0;
import xsna.loh0;
import xsna.nir0;
import xsna.o9t;
import xsna.u;
import xsna.whg;
import xsna.xx30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class s implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        a.InterfaceC0377a callback;
        int i = this.b;
        int i2 = 8;
        int i3 = 1;
        Object obj = this.d;
        ?? r6 = this.c;
        switch (i) {
            case 0:
                Context context = (Context) r6;
                String str = (String) obj;
                int i4 = u.h1;
                String str2 = !drm0.N(str) ? str : null;
                if (str2 != null) {
                    maz.c(((BridgeComponent) ((k7m) m7m.f(u.b.b)).a(fpf0.a(BridgeComponent.class))).p().e(), context, str2, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 1:
                n4 n4Var = (n4) r6;
                b4 b4Var = (b4) obj;
                bpn0 bpn0Var = xwk.a;
                ((qdz) (bpn0Var != null ? bpn0Var : null).getValue()).e().a(n4Var.b, xeq0.b(((b4.c.e) b4Var).a.a, "video"));
                return s3q0.a;
            case 2:
                bq3 bq3Var = (bq3) r6;
                Article s = bq3Var.s((JSONObject) obj);
                if (s != null && (callback = bq3Var.f.getCallback()) != null) {
                    callback.re(s);
                }
                return s3q0.a;
            case 3:
                Exception exc = (Exception) obj;
                return "UPLOAD_TRACE upload: fallback upload failed for attach " + ((qr6) r6).o + ", error=" + exc.getClass().getSimpleName() + ": " + exc.getMessage();
            case 4:
                myc0.h((yvj) r6, null, null, new mu6((h6p0) obj, null), 3);
                return Boolean.TRUE;
            case 5:
                whr0 whr0Var = (whr0) obj;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<ah8> copyOnWriteArraySet = ((ch8) r6).b;
                L.e("BroadcastListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<ah8> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().g(whr0Var);
                }
                return s3q0.a;
            case 6:
                dz20 dz20Var = (dz20) r6;
                nad nadVar = (nad) obj;
                if (dz20Var != null) {
                    dz20Var.Qc(nad.u);
                }
                boolean z = nadVar.r;
                boolean z2 = nadVar.q;
                boolean z3 = nadVar.s;
                if (z2 != z3 || z != nadVar.t) {
                    Boolean valueOf = z2 != z3 ? Boolean.valueOf(z3) : null;
                    boolean z4 = nadVar.t;
                    Boolean valueOf2 = z != z4 ? Boolean.valueOf(z4) : null;
                    if (valueOf2 != null) {
                        sub subVar = new sub(nadVar, valueOf2, valueOf, i3);
                        if (fkq0.b(nadVar.f.I0())) {
                            io.reactivex.rxjava3.core.q<Group> N0 = xg5.a().D().N0(new UserId(Math.abs(nadVar.f.I0().b)));
                            asu0.a.getClass();
                            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.p1(N0.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new kb(new i8(14), 14)), new pa(new j60(i2), 9)).subscribe(new ji3(new g20(subVar, 25), 13));
                            View view = nadVar.h;
                            hg1.b(view != null ? view : null, subscribe);
                        } else {
                            subVar.invoke(Boolean.valueOf(o25.a().d()));
                        }
                    } else {
                        nadVar.W0(nadVar.n, null, valueOf);
                    }
                }
                return s3q0.a;
            case 7:
                r1f r1fVar = ((bzd) r6).r;
                io.reactivex.rxjava3.internal.operators.single.x g = r1fVar.g((List) obj);
                e2e e2eVar = r1fVar.e;
                ((io.reactivex.rxjava3.disposables.b) r1fVar.a).b(hg1.i(g.q(e2eVar.i.e().c()).m(e2eVar.i.e().d()), new hb(r1fVar, 29)));
                return s3q0.a;
            case 8:
                yhg yhgVar = (yhg) r6;
                kyv j = yhgVar.c.j();
                Context context2 = yhgVar.a;
                ((whg.l) obj).getClass();
                j.e(context2, null, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), false, true, null);
                return s3q0.a;
            case 9:
                VkImage vkImage = ((vuh) r6).u;
                ImageSize Cb = ((VideoFile) obj).getImage().Cb(vkImage.getWidth(), true, false);
                vkImage.o0(Cb != null ? Cb.d.d : null, null);
                return s3q0.a;
            case 10:
                ((izs) r6).invoke(new o9t.a((h8t) obj));
                return s3q0.a;
            case 11:
                ((izs) r6).invoke(new o9t.q.c((zbt) obj));
                return s3q0.a;
            case 12:
                ((izs) r6).invoke(((loh0.a) obj).b);
                return s3q0.a;
            case 13:
                ((z520) r6).e((Photo) obj);
                return s3q0.a;
            case 14:
                sw30 sw30Var = (sw30) obj;
                return new sqw(Source.CACHE, (a1w) r6, new zw30(1, sw30Var, xx30.a.class, "isDialogAllowed", "isDialogAllowed(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0), new ax30(1, sw30Var, xx30.a.class, "isDialogActive", "isDialogActive(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0));
            case 15:
                e140 e140Var = (e140) r6;
                Rect C = bwt0.C((View) obj);
                ViewGroup viewGroup = e140Var.k;
                int i5 = C.bottom;
                if (i5 <= e140Var.q) {
                    viewGroup.setTranslationY(i5);
                } else {
                    viewGroup.setTranslationY(C.top - viewGroup.getHeight());
                }
                return s3q0.a;
            case 16:
                return (nw80) ((izs) r6).invoke(((ew80) obj).getCurrentState());
            case 17:
                ikc0 ikc0Var = (ikc0) r6;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Uri) it2.next()).toString());
                }
                ikc0Var.s.i(arrayList2);
                return s3q0.a;
            case 18:
                ((etv0) r6).b(false);
                m8d0.d((wh50) obj, true);
                return s3q0.a;
            case 19:
                w0f0 w0f0Var = (w0f0) r6;
                hbw hbwVar = w0f0Var.b;
                k0f0 k0f0Var = (k0f0) obj;
                int i6 = k0f0Var.a;
                if (i6 == -2) {
                    hbwVar.e(new fbw.a(k0f0Var.g, k0f0Var.h, k0f0Var.i, k0f0Var.j, i6, ""));
                } else if (k0f0Var.d) {
                    w0f0Var.b.d(k0f0Var.h, k0f0Var.i, k0f0Var.g, k0f0Var.j);
                } else if (w0f0Var.c.d(i6)) {
                    hbwVar.e(new fbw.a(k0f0Var.g, k0f0Var.h, k0f0Var.i, k0f0Var.j, k0f0Var.a, ""));
                    w0f0Var.d.a(k0f0Var.i, k0f0Var.a, k0f0Var.g);
                    vvr0.d();
                } else {
                    h7u0.a aVar = new h7u0.a(bwt0.w(w0f0Var));
                    aVar.g0(R.string.im_msg_reaction_unknown_title);
                    aVar.U(R.string.im_msg_reaction_unknown_message);
                    aVar.c0(R.string.im_msg_reaction_unknown_button, null);
                    aVar.m();
                }
                return s3q0.a;
            case 20:
                mai0 mai0Var = (mai0) r6;
                ?? r5 = (FunctionReferenceImpl) obj;
                if (mai0Var.b) {
                    r5.invoke(mai0Var.a);
                }
                return s3q0.a;
            case 21:
                Throwable th = (Throwable) r6;
                nir0.a aVar2 = ((nir0) obj).a;
                boolean z5 = th instanceof VKApiExecutionException;
                if (z5 && ((VKApiExecutionException) th).s() == 104) {
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.w();
                    aVar2.a.invoke(th);
                } else if (z5 && f35.c((VKApiExecutionException) th)) {
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.p();
                    aVar2.b.invoke(th);
                } else if (z5 && f35.d((VKApiExecutionException) th)) {
                    aVar2.c.invoke(th);
                } else if (z5) {
                    aVar2.d.invoke(th);
                } else {
                    aVar2.e.invoke(th);
                }
                return s3q0.a;
            case 22:
                return new lns0((pax0) r6.getValue(), (vbs0) ((ics0) obj).a.getValue());
            case 23:
                sqt0 sqt0Var = (sqt0) obj;
                Context context3 = (Context) r6;
                if ((sqt0Var.J.d() ? sqt0Var : null) == null) {
                    return null;
                }
                VideoFullscreenBottomBarView videoFullscreenBottomBarView = new VideoFullscreenBottomBarView(context3, null, 6);
                videoFullscreenBottomBarView.setVisibility(8);
                int a = iah0.a(4);
                f4m.l(a, a, videoFullscreenBottomBarView);
                videoFullscreenBottomBarView.setOnClickActionListener$core_release(sqt0Var.K);
                return videoFullscreenBottomBarView;
            default:
                mtk0 mtk0Var = (mtk0) r6;
                com.vk.core.compose.component.topbar.k kVar = (com.vk.core.compose.component.topbar.k) obj;
                boolean isNaN = Float.isNaN(((Number) mtk0Var.getValue()).floatValue());
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!isNaN) {
                    f = swe0.f(((Number) mtk0Var.getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                }
                if (!epx.f(kVar, k.b.a)) {
                    if (!(kVar instanceof k.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f - f;
                }
                return Float.valueOf(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s(mai0 mai0Var, izs izsVar) {
        this.b = 20;
        this.c = mai0Var;
        this.d = (FunctionReferenceImpl) izsVar;
    }

    public /* synthetic */ s(sqt0 sqt0Var, Context context) {
        this.b = 23;
        this.d = sqt0Var;
        this.c = context;
    }
}
