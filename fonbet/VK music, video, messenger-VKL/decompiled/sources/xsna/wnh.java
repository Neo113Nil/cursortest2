package xsna;

import android.util.LruCache;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.geo.impl.presentation.GeoDataSet;
import com.vk.gif.data.local.GifDatabase_Impl;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import xsna.bsm;
import xsna.cro;
import xsna.jsm;
import xsna.o0r0;
import xsna.tcx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wnh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 fullyDrawnReporter_delegate$lambda$0$0;
        ExposedFunction invoke$lambda$4;
        b.d i;
        switch (this.b) {
            case 0:
                ynh ynhVar = (ynh) this.c;
                CommunityProfileFragment communityProfileFragment = ynhVar.a;
                return new rmh(communityProfileFragment.requireContext(), (CommunityDetailsComponent) ynhVar.S0.getValue(), new zqu(), communityProfileFragment.getFeature().e, new cu4(communityProfileFragment, 2));
            case 1:
                fullyDrawnReporter_delegate$lambda$0$0 = ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0((ComponentActivity) this.c);
                return fullyDrawnReporter_delegate$lambda$0$0;
            case 2:
                nwy nwyVar = ((CoverChooseFragmentInternalComponent) this.c).b;
                qcy<Object> qcyVar = CoverChooseFragmentInternalComponent.f[0];
                return new d1k((n0k) nwyVar.c());
            case 3:
                xck xckVar = (xck) ((mm50) this.c).getCurrentState();
                return new zck(xckVar.b, xckVar.c, xckVar.d, xckVar.e, xckVar.i);
            case 4:
                efm efmVar = ((cfm) this.c).e;
                if (efmVar != null) {
                    efmVar.l();
                }
                return s3q0.a;
            case 5:
                hkp hkpVar = ((tim) this.c).p;
                if (hkpVar != null) {
                    hkpVar.g();
                }
                return s3q0.a;
            case 6:
                DialogsFragment dialogsFragment = (DialogsFragment) this.c;
                boolean z = DialogsFragment.u0;
                return ((VkClientMultiAccountComponent) m7m.d(dialogsFragment).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 7:
                return new bsm.e((bsm) this.c);
            case 8:
                return "invalidateRange: " + ((tpx) this.c) + ' ';
            case 9:
                fum fumVar = (fum) this.c;
                jsm.a aVar = fumVar.h;
                RecyclerView recyclerView = fumVar.i;
                aVar.d((recyclerView != null ? recyclerView : null).getContext());
                return s3q0.a;
            case 10:
                UUID uuid = ((k5n) this.c).b0;
                if (uuid == null) {
                    return null;
                }
                LruCache<UUID, mzp0> lruCache = rzp0.a;
                return rzp0.e(uuid);
            case 11:
                DzenArticleFragment dzenArticleFragment = (DzenArticleFragment) this.c;
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                dzenArticleFragment.fo().b(new cro.s(null, null, null));
                return s3q0.a;
            case 12:
                Boolean bool = (Boolean) ((mtk0) this.c).getValue();
                bool.getClass();
                return bool;
            case 13:
                y5u0 y5u0Var = (y5u0) ((GeoDataSet) this.c).a.invoke();
                return new y5u0(y5u0Var.a, Integer.MAX_VALUE, y5u0Var.c, y5u0Var.d, y5u0Var.e, y5u0Var.f, y5u0Var.g, y5u0Var.h, y5u0Var.i, true);
            case 14:
                return new l9f0((GifDatabase_Impl) this.c);
            case 15:
                return ((y4u) this.c).b.jd();
            case 16:
                amu amuVar = (amu) this.c;
                amuVar.g.d().m(amuVar.b, com.vk.dto.common.a.b(amuVar.c.f), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 17:
                ((iru) this.c).e.invoke();
                return s3q0.a;
            case 18:
                invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4((HandleInvocationsFromAdViewer) this.c);
                return invoke$lambda$4;
            case 19:
                return ((NewsFeedComponent) ((k7m) m7m.f((nbv) this.c)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 20:
                ((ayv) this.c).b = null;
                return s3q0.a;
            case 21:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.d dVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.d) this.c;
                View view = dVar.m;
                if (view != null) {
                    bxt0.a(view, 250L);
                }
                dVar.b(dVar.k);
                return s3q0.a;
            case 22:
                ibx ibxVar = (ibx) this.c;
                return ((ecx) ibxVar.q.getValue()).a(ibxVar.b, tcx.c.a);
            case 23:
                return new b2n0(((r4y) this.c).a);
            case 24:
                xc00 xc00Var = (xc00) this.c;
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                String i2 = VkOAuthService.MAILRU.i();
                if (i2 == null) {
                    i2 = "";
                }
                bVar.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MAIL_LINKED_ANOTHER_ACCOUNT_LOGIN, new ArrayList(Collections.singletonList(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.OAUTH_NAME, i2))), null, null, null, null, null, 252);
                SignUpRouter.a.a(xc00Var.b.a, null, null, null, null, 15);
                return s3q0.a;
            case 25:
                return ((MarketComponent) m7m.a((FragmentActivity) this.c).a(fpf0.a(MarketComponent.class))).Ob();
            case 26:
                MotionLayoutWithFixedTouches.b bVar2 = (MotionLayoutWithFixedTouches.b) this.c;
                if (!BuildInfo.q()) {
                    bVar2 = null;
                }
                if (bVar2 == null || (i = com.vk.toggle.b.A.i(VideoFeatures.SKIP_MEASURE_CHILDREN)) == null) {
                    return null;
                }
                return i.b();
            case 27:
                return new bj30(((x040) this.c).a);
            case 28:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) this.c;
                jyh0 jyh0Var = (jyh0) musicCatalogRootVh.A.getValue();
                b5a b5aVar = musicCatalogRootVh.m.b.f;
                w950 w950Var = (w950) musicCatalogRootVh.q.getValue();
                s1v s1vVar = new s1v();
                m130 m130Var = new m130(musicCatalogRootVh, 6);
                p5y p5yVar = new p5y(musicCatalogRootVh, 12);
                a34 a34Var = new a34(musicCatalogRootVh, 4);
                i440 i440Var = new i440(musicCatalogRootVh, 1);
                jyh0Var.getClass();
                return new kyh0(b5aVar, w950Var, s1vVar, m130Var, jyh0Var, a34Var, p5yVar, i440Var);
            default:
                ((MusicOfflineCatalogRootVh) this.c).z.d();
                return s3q0.a;
        }
    }
}
