package xsna;

import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.view.components.search.ExpandableActionVkSearchView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.movika.api.MovikaComponent;
import com.vk.music.player.api.di.EqualizerControllerComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$ReloadLocalAlbums;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vkontakte.android.R;
import xsna.e8v0;
import xsna.pbh;
import xsna.u4a;
import xsna.utj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class obh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ obh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        View view;
        ExposedFunction opportunityTTL;
        switch (this.b) {
            case 0:
                pbh.a aVar = (pbh.a) this.c;
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = aVar.p;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.c.b);
                }
                aVar.n.invoke();
                return s3q0.a;
            case 1:
                return ((gsh) this.c).a;
            case 2:
                return Boolean.valueOf(!((bwi) this.c).d);
            case 3:
                return ((NewsFeedComponent) ((k7m) m7m.f((d3j) this.c)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 4:
                utj utjVar = (utj) this.c;
                gzs<s3q0> gzsVar = utjVar.o;
                utj.k kVar = utjVar.b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                if (kVar.c) {
                    View view2 = utjVar.k;
                    if (view2 != null) {
                        view2.setContentDescription(kVar.a);
                    }
                    boolean D = drm0.D(Build.MANUFACTURER, "samsung", true);
                    int i = D ? 4 : 8;
                    if (D && (view = utjVar.k) != null) {
                        view.performAccessibilityAction(64, null);
                    }
                    View view3 = utjVar.k;
                    if (view3 != null) {
                        view3.sendAccessibilityEvent(i);
                    }
                }
                Object obj = flv0.a;
                flv0.e(utjVar.r);
                return s3q0.a;
            case 5:
                DialogsFragment dialogsFragment = (DialogsFragment) this.c;
                boolean z = DialogsFragment.u0;
                return new jyv(dialogsFragment.kn(), dialogsFragment.T.j(), ((VoipCallComponent) m7m.d(dialogsFragment).a(fpf0.a(VoipCallComponent.class))).a());
            case 6:
                return new q1n((y2n) ((k5n) this.c).k0.getValue());
            case 7:
                h2q h2qVar = (h2q) this.c;
                StringBuilder sb = new StringBuilder("ExchangeToken(userId=");
                sb.append(h2qVar.a);
                sb.append(",token=");
                String str = h2qVar.b;
                return ho8.a(sb, str != null ? erm0.D0(10, str) : null, ')');
            case 8:
                n8q n8qVar = (n8q) this.c;
                n8qVar.f.setBackground(null);
                ExpandableActionVkSearchView expandableActionVkSearchView = n8qVar.e;
                expandableActionVkSearchView.setExpandFractionListener(null);
                expandableActionVkSearchView.e5();
                expandableActionVkSearchView.a5();
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((CallEffectsDependency) this.c).c());
            case 10:
                GamesCatalogDetailFragment gamesCatalogDetailFragment = (GamesCatalogDetailFragment) this.c;
                int i2 = GamesCatalogDetailFragment.d0;
                GamesHeaderSectionInfo gamesHeaderSectionInfo = (GamesHeaderSectionInfo) gamesCatalogDetailFragment.requireArguments().getParcelable("games_catalog_detail_section_info");
                return gamesHeaderSectionInfo == null ? new GamesHeaderSectionInfo.Section(SectionIdType.New.c, null) : gamesHeaderSectionInfo;
            case 11:
                return ((y4u) this.c).b.I3();
            case 12:
                x7u x7uVar = (x7u) this.c;
                u7u u7uVar = x7uVar.o;
                if (u7uVar != null) {
                    x7uVar.l.d(u7uVar.d, u7uVar.c, u7uVar.b);
                }
                return s3q0.a;
            case 13:
                opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL((AdObject) this.c);
                return opportunityTTL;
            case 14:
                return fnw.e((fnw) this.c);
            case 15:
                return ((MovikaComponent) m7m.a(((ibx) this.c).s).mo408a(fpf0.a(MovikaComponent.class))).U4();
            case 16:
                return new xvp(((r4y) this.c).a);
            case 17:
                ((LocalMediaPickerFragmentOld) this.c).Y.invoke(PostingAction$MediaPicker$Album$ReloadLocalAlbums.b);
                return s3q0.a;
            case 18:
                fv20 fv20Var = (fv20) this.c;
                int i3 = fv20.C1;
                return ((MultiAccountComponent) ((k7m) m7m.f(fv20Var)).a(fpf0.a(MultiAccountComponent.class))).c();
            case 19:
                return ((MarketComponent) m7m.a((FragmentActivity) this.c).a(fpf0.a(MarketComponent.class))).l7();
            case 20:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                zc40 zc40Var = (zc40) musicArtistCatalogRootVh.u.getValue();
                if (zc40Var == null) {
                    return null;
                }
                u4a.a aVar2 = musicArtistCatalogRootVh.m.b;
                return new ArtistInfoVh(aVar2.p, aVar2.i, aVar2.f, aVar2.m, aVar2.v, aVar2.r, musicArtistCatalogRootVh.r, zc40Var);
            case 21:
                return ((MusicCatalogRootVh) this.c).t;
            case 22:
                ((km40) this.c).dismiss();
                return s3q0.a;
            case 23:
                MusicSubscriptionControlFragment musicSubscriptionControlFragment = (MusicSubscriptionControlFragment) this.c;
                int i4 = MusicSubscriptionControlFragment.a0;
                FragmentActivity activity = musicSubscriptionControlFragment.getActivity();
                if (activity != null) {
                    xwk.d().e().a(activity, ((oge0) musicSubscriptionControlFragment.T.getValue()).m());
                }
                return s3q0.a;
            case 24:
                yc50 yc50Var = (yc50) this.c;
                int i5 = yc50.x1;
                return ((EqualizerControllerComponent) m7m.d(yc50Var).a(fpf0.a(EqualizerControllerComponent.class))).F9();
            case 25:
                return new PaintDrawable(dhr0.Y(R.attr.vk_ui_background_secondary, ((p060) this.c).itemView.getContext()));
            case 26:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return m7m.d(newsfeedFragment);
            case 27:
                xw60 xw60Var = ((qy60) this.c).h;
                return new xx60(xw60Var.a, xw60Var.b, xw60Var.c, xw60Var.d, xw60Var.e, xw60Var.f, xw60Var.g, null, null, null, ur60.a(ur60.h, null, null, null, null, true, false, 47));
            case 28:
                ((li70) this.c).b(false);
                return s3q0.a;
            default:
                OnboardingPromoFragment onboardingPromoFragment = (OnboardingPromoFragment) this.c;
                qcy<Object>[] qcyVarArr2 = OnboardingPromoFragment.Q;
                return new OnboardingPromoFragment.c(onboardingPromoFragment);
        }
    }
}
