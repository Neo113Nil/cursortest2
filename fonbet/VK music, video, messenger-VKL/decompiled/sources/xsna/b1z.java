package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.ui.d;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cqc0;
import xsna.h0k0;
import xsna.m5u;
import xsna.uny;
import xsna.xn50;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b1z implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b1z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        et4 et4Var;
        GetLatestWebViewConfiguration initialize$lambda$220$lambda$122;
        int i = 0;
        switch (this.b) {
            case 0:
                ((d1z) this.c).e.bk(ygt0.a);
                return s3q0.a;
            case 1:
                xn50.a.c(((i8z) this.c).e.a, c.f0.b);
                return s3q0.a;
            case 2:
                ListGroupCallView listGroupCallView = (ListGroupCallView) this.c;
                return listGroupCallView.D.animate().setDuration(300L).setUpdateListener(new tez(listGroupCallView, i));
            case 3:
                zrz.a aVar = (zrz.a) this.c;
                return "state: " + aVar + " state : " + aVar + " checkExpirationAndLaunchNetworkLoadIfExpired return state";
            case 4:
                ((df00) this.c).b(h0k0.h.a);
                return s3q0.a;
            case 5:
                return ((xvy) this.c).j().f();
            case 6:
                uny.a aVar2 = ((za30) this.c).f.d;
                if (aVar2 instanceof uny.a.C3814a) {
                    uny.a.C3814a c3814a = (uny.a.C3814a) aVar2;
                    c3814a.b.j().c();
                    c3814a.c.j().c();
                } else {
                    if (!(aVar2 instanceof uny.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((uny.a.b) aVar2).a.c();
                }
                return s3q0.a;
            case 7:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) this.c)).a(fpf0.a(MarketComponent.class))).Ob();
            case 8:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) this.c;
                return new HidingToolbarVh(musicMyAudiosCatalogRootVh.m.b.e, e43.l(musicMyAudiosCatalogRootVh.l0(), musicMyAudiosCatalogRootVh.j0()), musicMyAudiosCatalogRootVh.k0(), null);
            case 9:
                aw40 aw40Var = ((hx40) this.c).e;
                et4 et4Var2 = et4.d;
                if (et4Var2 != null) {
                    return et4Var2;
                }
                synchronized (fpf0.a(xs4.class)) {
                    try {
                        if (et4.d == null) {
                            et4.d = new et4(aw40Var);
                        }
                        et4Var = et4.d;
                        if (et4Var == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return et4Var;
            case 10:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return m7m.d(newsfeedCustomFragment2);
            case 11:
                return ((BridgeComponent) ((k7m) m7m.f((kh60) this.c)).a(fpf0.a(BridgeComponent.class))).s();
            case 12:
                return ((NewsfeedCoownersComponent) ((k7m) m7m.c(((d1c0) this.c).itemView)).a(fpf0.a(NewsfeedCoownersComponent.class))).a();
            case 13:
                return (AudienceResearchComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.presenters.b) this.c)).a(fpf0.a(AudienceResearchComponent.class));
            case 14:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i2 = PostingFragment.L0;
                return ((PostingSettingsComponent) ((k7m) m7m.f(postingFragment)).mo408a(fpf0.a(PostingSettingsComponent.class))).X();
            case 15:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) this.c).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.newsfeed_newpost_for_friends);
                return modalSettingsPrivacyOption;
            case 16:
                d.a aVar3 = ((com.vk.ecomm.market.good.ui.e) this.c).m;
                if (aVar3 != null) {
                    aVar3.j();
                }
                return s3q0.a;
            case 17:
                ((lbe) this.c).invoke(m5u.i.b);
                return s3q0.a;
            case 18:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) this.c;
                int i3 = ProductsSelectionBottomSheet.u1;
                return ((CartComponent) ((k7m) m7m.f(productsSelectionBottomSheet)).a(fpf0.a(CartComponent.class))).f8();
            case 19:
                return new mca0(false, ((ProfileMainPhotosFragment) this.c).y0);
            case 20:
                return ((PublishFragmentInternalComponent) this.c).d.id().g();
            case 21:
                l9r a = ((a0f0) this.c).a();
                asu0.a.getClass();
                return new wel(a, asu0.q(), null);
            case 22:
                p6f0 p6f0Var = (p6f0) this.c;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether((ValueAnimator) p6f0Var.l.getValue(), (ValueAnimator) p6f0Var.m.getValue(), (ValueAnimator) p6f0Var.o.getValue(), (ValueAnimator) p6f0Var.n.getValue());
                return animatorSet;
            case 23:
                ygh0 ygh0Var = (ygh0) this.c;
                f490 f490Var = (f490) ovi.a(ygh0Var, g490.a);
                ygh0Var.B = f490Var;
                ygh0Var.C = f490Var != null ? f490Var.a() : null;
                return s3q0.a;
            case 24:
                return ((SearchUiComponent) ((k7m) m7m.f((vth0) this.c)).a(fpf0.a(SearchUiComponent.class))).W(new irh0(false, false, 495));
            case 25:
                return idi0.a((idi0) this.c);
            case 26:
                initialize$lambda$220$lambda$122 = ServiceProvider.initialize$lambda$220$lambda$122((ServicesRegistry) this.c);
                return initialize$lambda$220$lambda$122;
            case 27:
                return (AppCompatImageView) ((com.vk.sharing.core.view.f) this.c).findViewById(R.id.sharing_comment_input_common_icon);
            case 28:
                ShowAllListVh showAllListVh = (ShowAllListVh) this.c;
                if (!showAllListVh.n) {
                    return null;
                }
                CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = showAllListVh.o;
                if (catalogSearchQueryViewHolder == null) {
                    return new SearchQueryVh(R.string.search, null, new e20(25), null, new dml(new ohj0(2, showAllListVh, ShowAllListVh.class, "onSearchQueryChange", "onSearchQueryChange(Ljava/lang/String;Lcom/vk/search/ui/api/SearchInputMethod;)V", 0), null, null, null, new wxt(showAllListVh, 4), 0L, 46), 96);
                }
                return catalogSearchQueryViewHolder;
            default:
                com.vk.newsfeed.impl.items.posting.item.modals.d dVar = (com.vk.newsfeed.impl.items.posting.item.modals.d) this.c;
                kgc0.Z1(dVar.b, dVar.a.h, true, 12);
                s3q0 s3q0Var = s3q0.a;
                dw20 dw20Var = dVar.e;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
        }
    }
}
