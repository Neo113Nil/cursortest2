package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.PollPickerFragment;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.dto.common.Good;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import com.vk.googleump.impl.di.GoogleUMPComponentImpl;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.health.js.bridge.api.di.JsHealthDelegateComponent;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.pn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xyh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xyh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        d3b0 f;
        io.reactivex.rxjava3.internal.operators.single.o oVar;
        x110 x110Var;
        ExposedFunction invoke$lambda$2;
        int i = 6;
        int i2 = 12;
        int i3 = 4;
        int i4 = 18;
        int i5 = 13;
        OneVideoPlayer oneVideoPlayer = null;
        oneVideoPlayer = null;
        switch (this.b) {
            case 0:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.c;
                return dVar.O(new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a(dVar.h, dVar.p, dVar.o, dVar.n, dVar.l, dVar.g, dVar.m));
            case 1:
                ((r4i) this.c).c.c();
                return s3q0.a;
            case 2:
                CreateAlbumFragment createAlbumFragment = (CreateAlbumFragment) this.c;
                int i6 = CreateAlbumFragment.Z;
                return ((PhotosComponent) createAlbumFragment.U.getValue()).r4();
            case 3:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) this.c;
                int i7 = DeprecatedAttachActivity.K0;
                PollPickerFragment.a aVar = new PollPickerFragment.a();
                Bundle bundle = aVar.j;
                bundle.putString("ref", com.vk.stat.scheme.t0.a(deprecatedAttachActivity.q0 != 0 ? MobileOfficialAppsCoreNavStat$EventScreen.IM : MobileOfficialAppsCoreNavStat$EventScreen.POLL));
                bundle.putInt("source", deprecatedAttachActivity.c0 ? 1 : 0);
                bundle.putParcelable("uid", deprecatedAttachActivity.u0);
                return aVar.f();
            case 4:
                return new dum0(((pdm) this.c).b);
            case 5:
                egm egmVar = (egm) this.c;
                Context context = egmVar.d;
                VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
                vkImageSimple.setImageResource(R.drawable.vk_icon_donut_color_12);
                vkImageSimple.setContentDescription(context.getString(R.string.accessibility_donut_chat));
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(12), cn70.b(12), cn70.b(4), cn70.b(1), 0, 0, 48));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 6:
                return ((DiscoverMediaTabFragment2) this.c).d0;
            case 7:
                DraftsListFragment draftsListFragment = (DraftsListFragment) this.c;
                qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
                final DraftsListFragment.b bVar = (DraftsListFragment.b) draftsListFragment.N.getValue();
                return new cn50(up2.d(new jcg(bVar, i5), new wb0() { // from class: xsna.keo
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new ydo(bVar, sj50Var);
                    }
                }, svj.b));
            case 8:
                ((nfu) this.c).getClass();
                throw null;
            case 9:
                return ((DonutPriceComponent) ((k7m) m7m.f((EntriesListPresenter) this.c)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 10:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) this.c).element;
                if (dw20Var != null) {
                    dw20Var.On(3);
                }
                return s3q0.a;
            case 11:
                cqq cqqVar = (cqq) this.c;
                zqq zqqVar = cqqVar.j;
                FaveType faveType = zqqVar.a;
                FaveTag faveTag = zqqVar.b;
                FaveSource faveSource = zqqVar.c;
                xah0 xah0Var = cqqVar.a.q;
                return new kpq(faveType, faveTag, faveSource, xah0Var != null ? xah0Var.c : false, cqqVar.b, null, ur60.h);
            case 12:
                return z9r.a(((u7r) this.c).a, "Try to restore file ");
            case 13:
                t1s t1sVar = (t1s) this.c;
                if (BuildInfo.t()) {
                    return null;
                }
                Fragment fragment = t1sVar.j;
                VkTabs vkTabs = t1sVar.r;
                VkTabs vkTabs2 = vkTabs == null ? null : vkTabs;
                j1s j1sVar = t1sVar.z;
                j1s j1sVar2 = j1sVar == null ? null : j1sVar;
                ViewPager2 viewPager2 = t1sVar.q;
                return new i1s(fragment, vkTabs2, viewPager2 == null ? null : viewPager2, j1sVar2, new ufk(t1sVar, i), new bih(t1sVar, i4));
            case 14:
                return new qhk(((ads) this.c).c);
            case 15:
                evs evsVar = (evs) this.c;
                c4u0 c4u0Var = evsVar.E;
                TransformController transformController = new TransformController(new l1u0(c4u0Var.E));
                transformController.j(c4u0Var.E);
                transformController.f(TransformController.ScaleType.FIT, false);
                lcx lcxVar = evsVar.q;
                if (lcxVar != null && (f = lcxVar.f()) != null) {
                    oneVideoPlayer = f.a();
                }
                transformController.e(oneVideoPlayer);
                return transformController;
            case 16:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) this.c;
                qcy<Object>[] qcyVarArr2 = GeoPostsFragment.q0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) geoPostsFragment.eo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0());
                geoPostsFragment.P = qn60Var;
                pn60 pn60Var = new pn60(new pn60.a((s1c0) geoPostsFragment.R.getValue(), geoPostsFragment.go().get(), geoPostsFragment.go().get()), geoPostsFragment.eo().b);
                geoPostsFragment.Q = pn60Var;
                rn60.a(qn60Var);
                GeoPostsFragment.e eVar = new GeoPostsFragment.e(geoPostsFragment.go());
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) eVar);
                String string = geoPostsFragment.getString(R.string.place);
                s1v s1vVar = new s1v();
                Context context2 = e43.a;
                utb utbVar = new utb(context2 != null ? context2 : null, geoPostsFragment.eo().b);
                nl nlVar = new nl();
                nlVar.b = utbVar;
                return new kmt(new vmt(string, qn60Var, pn60Var, eh60Var, s1vVar, geoPostsFragment.eo().a, new AtomicReference(new wn60((byte) 0)), nlVar, (elt) geoPostsFragment.N.getValue(), cVar, new zlt(new umt(), new emt(), new ylt()), fs60.a(qn60Var, pn60Var, cVar, geoPostsFragment.eo().a)));
            case 17:
                GoodFragment goodFragment = (GoodFragment) this.c;
                qcy<Object>[] qcyVarArr3 = GoodFragment.U0;
                Good good = goodFragment.Po().r;
                if (good == null || (x110Var = goodFragment.Po().e) == null) {
                    oVar = null;
                } else {
                    yo9 yo9Var = x110Var.a;
                    oVar = new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(((b510) yo9Var.c).a.c((int) good.b, good.c))), new m20(new aq1(7, yo9Var, good), i4));
                }
                goodFragment.i0 = oVar != null ? hg1.n(oVar, goodFragment.kn(), false, null, 62).subscribe(new fsq(new udo(goodFragment, i5), i3), new lf1(new vfk(goodFragment, i2), 25)) : null;
                return s3q0.a;
            case 18:
                ExecutorService executorService = (ExecutorService) this.c;
                qcy<Object>[] qcyVarArr4 = GoogleUMPComponentImpl.b;
                return new nau(executorService, new mag(new taj0(), 26));
            case 19:
                invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2((HandleInvocationsFromAdViewer) this.c);
                return invoke$lambda$2;
            case 20:
                ams.a().f((Activity) this.c, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_SEARCH));
                return s3q0.a;
            case 21:
                n3w n3wVar = (n3w) this.c;
                ay5 ay5Var = n3wVar.t;
                if (ay5Var == null) {
                    return null;
                }
                cau0 cau0Var = n3wVar.a.h;
                ImFeatures imFeatures = ImFeatures.BACKPRESSURE_DETECTOR;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures)) {
                    return ay5Var;
                }
                return null;
            case 22:
                ImItemListFragment imItemListFragment = (ImItemListFragment) this.c;
                qcy<Object>[] qcyVarArr5 = ImItemListFragment.S;
                b25 s = ((AuthBridgeComponent) m7m.d(imItemListFragment).a(fpf0.a(AuthBridgeComponent.class))).s();
                a1w a1wVar = q1w.a;
                a1w a1wVar2 = a1wVar != null ? a1wVar : null;
                mxv c = g2v.c();
                zdw zdwVar = i7o0.b;
                zdw zdwVar2 = zdwVar != null ? zdwVar : null;
                Object obj = fx5.a;
                return new ksm(a1wVar2, c, zdwVar2, fx5.a(imItemListFragment.kn()), s);
            case 23:
                return Integer.valueOf(Arrays.hashCode(((x7w) this.c).c()));
            case 24:
                return (ProfileFragmentProviderComponent) m7m.d(((qnx) this.c).c).a(fpf0.a(ProfileFragmentProviderComponent.class));
            case 25:
                r6y r6yVar = (r6y) this.c;
                return ((JsHealthDelegateComponent) x6y.H().a(fpf0.a(JsHealthDelegateComponent.class))).L4().a(r6yVar, r6yVar.M(), new bfm(r6yVar, i5));
            case 26:
                ((vgg) this.c).c();
                return s3q0.a;
            case 27:
                return new kc00(((gc00) this.c).a);
            case 28:
                ((z37) this.c).b(a.h.b);
                return s3q0.a;
            default:
                return new gi8((sp30) this.c, 8);
        }
    }
}
