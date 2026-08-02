package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionCatalogRootVh;
import com.vk.clips.design.view.camera.settings.ModalPrivacySettingsErrorView;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.dto.common.Peer;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.product_list.di.ProductListComponent;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.home.HomeFragment2;
import com.vk.im.ui.fragments.ImMsgSearchFragment;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.bottomsheets.di.RecommendationOnboardingComponent;
import com.vkontakte.android.R;
import xsna.mqw;
import xsna.xal;
import xsna.xn50;
import xsna.xxu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class flu implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ flu(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        String c;
        gvv0 view;
        switch (this.b) {
            case 0:
                UIBlockGroup uIBlockGroup = ((GroupInviteVh) this.c).k;
                if (uIBlockGroup != null && uIBlockGroup != null) {
                    if (!uIBlockGroup.B) {
                        o1e0.a.a(new a9l(2));
                    }
                    uIBlockGroup.B = true;
                }
                return s3q0.a;
            case 1:
                ((GroupsCollectionCatalogRootVh) this.c).p.d();
                return s3q0.a;
            case 2:
                return new xxu.a((xxu) this.c);
            case 3:
                HomeFragment2 homeFragment2 = (HomeFragment2) this.c;
                int i = HomeFragment2.x0;
                return ((VkClientMultiAccountComponent) m7m.d(homeFragment2).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 4:
                ((xal.d) this.c).a();
                return s3q0.a;
            case 5:
                return ms9.b("#doClearCache error ", (Throwable) this.c);
            case 6:
                ImMsgSearchFragment imMsgSearchFragment = (ImMsgSearchFragment) this.c;
                qcy<Object>[] qcyVarArr = ImMsgSearchFragment.U;
                Bundle arguments = imMsgSearchFragment.getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable("owner_id", Peer.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        ?? parcelable3 = arguments.getParcelable("owner_id");
                        parcelable = (Peer) (parcelable3 instanceof Peer ? parcelable3 : null);
                    }
                    Peer peer = (Peer) parcelable;
                    if (peer != null) {
                        return peer;
                    }
                }
                return Peer.Unknown.e;
            case 7:
                owv owvVar = ((lqw) this.c).h1;
                if (owvVar != null) {
                    owvVar.invoke(mqw.a.a);
                }
                return s3q0.a;
            case 8:
                xwv0 xwv0Var = (xwv0) ((a2y) this.c).c.invoke();
                return Boolean.valueOf((xwv0Var == null || (c = xwv0Var.c()) == null || !drm0.D(c, "blocked", false)) ? false : true);
            case 9:
                fvv0 M = ((r6y) this.c).M();
                if (M != null && (view = M.getView()) != null) {
                    view.Af();
                }
                return s3q0.a;
            case 10:
                return new w3y((g7y) this.c);
            case 11:
                xuy i2 = kci.i((xvy) this.c);
                return Integer.valueOf(i2 != null ? i2.getIndex() : -1);
            case 12:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                int i3 = MarketAllReviewsFragment.d0;
                a.m mVar = a.m.b;
                marketAllReviewsFragment.getClass();
                xn50.a.c(marketAllReviewsFragment, mVar);
                return s3q0.a;
            case 13:
                View view2 = (View) this.c;
                int i4 = MarketItemCommentsFragment.j0;
                return view2;
            case 14:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) this.c;
                qcy<Object>[] qcyVarArr2 = MarketItemReviewRepliesFragment.b0;
                marketItemReviewRepliesFragment.a0();
                return s3q0.a;
            case 15:
                rg50 rg50Var = (rg50) this.c;
                rg50Var.C(rg50Var.getIntValue() - 1);
                return s3q0.a;
            case 16:
                ((zak0) ((su10) this.c).i).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 17:
                ((ModalPrivacySettingsErrorView) this.c).b.invoke();
                return s3q0.a;
            case 18:
                Context context = ((ps30) this.c).d;
                return Integer.valueOf(e3m.a(R.dimen.msg_content_max_height, context != null ? context : null));
            case 19:
                MsgViewFragment msgViewFragment = (MsgViewFragment) this.c;
                int i5 = MsgViewFragment.i0;
                return new ya20(((ProductListComponent) m7m.d(msgViewFragment).mo408a(fpf0.a(ProductListComponent.class))).a(), ((MarketComponent) m7m.d(msgViewFragment).a(fpf0.a(MarketComponent.class))).Ob());
            case 20:
                return ((RecommendationOnboardingComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) this.c)).mo408a(fpf0.a(RecommendationOnboardingComponent.class))).R8();
            case 21:
                ((rw40) this.c).y.o();
                return s3q0.a;
            case 22:
                return (TextView) ((g850) this.c).a.findViewById(R.id.nativeads_age_restrictions);
            case 23:
                aq50 aq50Var = (aq50) this.c;
                return new yp50(aq50Var.a, (cjx) aq50Var.f.getValue());
            case 24:
                NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
                int i6 = NewsfeedFilterListFragment2.X;
                return new zer(new v34(newsfeedFilterListFragment2, 18), new e40(newsfeedFilterListFragment2, 22));
            case 25:
                return (AdPixelStatsComponent) ((e7m) this.c).a(fpf0.a(AdPixelStatsComponent.class));
            case 26:
                return "getAudioFormat() - using cached value " + ((wl80) this.c).W;
            case 27:
                m8a0 m8a0Var = (m8a0) this.c;
                int i7 = m8a0.v1;
                return m8a0Var.bo().r1();
            case 28:
                cbb0 cbb0Var = (cbb0) this.c;
                int i8 = cbb0.q1;
                return (BridgeComponent) m7m.d(cbb0Var).a(fpf0.a(BridgeComponent.class));
            default:
                return (NewsfeedCoownersComponent) ((k7m) m7m.f((y1c0) this.c)).a(fpf0.a(NewsfeedCoownersComponent.class));
        }
    }
}
