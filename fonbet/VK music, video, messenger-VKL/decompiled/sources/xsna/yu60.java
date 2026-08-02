package xsna;

import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.ecomm.orders.impl.MarketOrdersInternalComponent;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.SelectGroupVerificationFragment;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.user.api.domain.onboarding.analytics.OnBoardingType;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import one.video.player.error.OneVideoSourceException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yu60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yu60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        GetOpenGLRendererInfo initialize$lambda$220$lambda$115;
        int i = this.b;
        r4 = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (qz60) ((dv60) obj).b.getCurrentState();
            case 1:
                RecyclerView recyclerView = ((d070) obj).x;
                Object adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                ho60 ho60Var = adapter instanceof ho60 ? (ho60) adapter : null;
                if (ho60Var != null) {
                    int itemCount = ho60Var.getItemCount();
                    while (true) {
                        if (r3 < itemCount) {
                            if (ho60Var.y0(r3) instanceof o070) {
                                ho60Var.notifyItemChanged(r3);
                            } else {
                                r3++;
                            }
                        }
                    }
                }
                return s3q0.a;
            case 2:
                return new y8x(((k270) obj).b(VisibleStyle.M(268435464), null));
            case 3:
                qcy<Object>[] qcyVarArr = b080.q1;
                OnBoardingType onBoardingType = (OnBoardingType) ((b080) obj).requireArguments().getParcelable(CredentialProviderBaseController.TYPE_TAG);
                return onBoardingType == null ? OnBoardingType.PROFILE : onBoardingType;
            case 4:
                String str = ((PollAnswer) obj).c;
                return Boolean.valueOf(((str == null || str.length() == 0) ? 1 : 0) ^ 1);
            case 5:
                OrderListFragment orderListFragment = (OrderListFragment) obj;
                qcy<Object>[] qcyVarArr2 = OrderListFragment.Q;
                return new hv80(new cww(orderListFragment, 24), ((MarketOrdersInternalComponent) m7m.d(orderListFragment).mo408a(fpf0.a(MarketOrdersInternalComponent.class))).Df(), ((MarketOrdersComponent) m7m.d(orderListFragment).a(fpf0.a(MarketOrdersComponent.class))).S4(), ((CartComponent) m7m.d(orderListFragment).a(fpf0.a(CartComponent.class))).f8(), ((ReviewsComponent) m7m.d(orderListFragment).a(fpf0.a(ReviewsComponent.class))).Md(), ((MarketComponent) m7m.d(orderListFragment).a(fpf0.a(MarketComponent.class))).Ob(), ((BridgeComponent) m7m.d(orderListFragment).a(fpf0.a(BridgeComponent.class))).p().e());
            case 6:
                ((lv90) obj).lo(2);
                return s3q0.a;
            case 7:
                return Integer.valueOf(((x7b0) obj).getBindingAdapterPosition());
            case 8:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) obj;
                return new aeb0(playlistScreenFragmentInternalComponent.Ef().c(), new b1y(playlistScreenFragmentInternalComponent.b.a.getResources().getDisplayMetrics(), 8), playlistScreenFragmentInternalComponent.Ff());
            case 9:
                return ((NewsFeedComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 10:
                PostFragment postFragment = (PostFragment) obj;
                postFragment.eo(m3c0.a(postFragment.o0));
                return s3q0.a;
            case 11:
                return ((PostingFragment) obj).R;
            case 12:
                return Integer.valueOf(e3m.a(R.dimen.media_picker_selected_item_preview_size, ((vpc0) obj).a));
            case 13:
                ((NewsFeedComponent) ((k7m) m7m.f((brc0) obj)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 14:
                return (ond0) obj;
            case 15:
                List<VideoFile> list = ((PublishState) obj).v;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoFile) it.next()).a1());
                }
                return arrayList;
            case 16:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_INFO_ABOUT_YOURSELF, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 17:
                RecyclerView recyclerView2 = ((u6h0) obj).j;
                if (recyclerView2 != null) {
                    return Integer.valueOf(recyclerView2.getHeight());
                }
                return null;
            case 18:
                return s200.v(((o0i0) obj).f);
            case 19:
                qcy<Object>[] qcyVarArr3 = SelectGroupVerificationFragment.U;
                return ((BridgeComponent) ((k7m) m7m.f((SelectGroupVerificationFragment) obj)).a(fpf0.a(BridgeComponent.class))).p().e();
            case 20:
                bei0 bei0Var = (bei0) obj;
                oei0 oei0Var = bei0Var.a;
                ArrayList j = oei0Var.j(bei0Var.j());
                if (!j.isEmpty()) {
                    xg50 xg50Var = t300.a;
                    xg50 xg50Var2 = new xg50();
                    int size = j.size();
                    obi0 obi0Var = null;
                    obi0 obi0Var2 = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        cai0 cai0Var = (cai0) j.get(i2);
                        obi0 m = cai0Var.m();
                        if (m != null) {
                            if (obi0Var == null) {
                                obi0Var = m;
                            }
                            long e = cai0Var.e();
                            int e2 = xg50Var2.e(e);
                            Object[] objArr = xg50Var2.c;
                            Object obj2 = objArr[e2];
                            xg50Var2.b[e2] = e;
                            objArr[e2] = m;
                            obi0Var2 = m;
                        }
                    }
                    if (xg50Var2.e != 0) {
                        if (obi0Var != obi0Var2) {
                            obi0Var = new obi0(obi0Var.a, obi0Var2.b, false);
                        }
                        ((zak0) oei0Var.k).setValue(xg50Var2);
                        bei0Var.d.invoke(obi0Var);
                        bei0Var.u = null;
                    }
                }
                return s3q0.a;
            case 21:
                initialize$lambda$220$lambda$115 = ServiceProvider.initialize$lambda$220$lambda$115((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$115;
            case 22:
                return (Toolbar) ((ixi0) obj).a.findViewById(R.id.toolbar);
            case 23:
                int i3 = SettingsListFragment.X0;
                h3p0.b((SettingsListFragment) obj);
                return s3q0.a;
            case 24:
                return ((NewsFeedComponent) ((k7m) m7m.f((cvj0) obj)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 25:
                return "Response code is " + ((OneVideoSourceException.a) obj).a + ". Must not be in " + dgk0.c;
            case 26:
                b.d dVar = new b.d("media_event_show_popup");
                dVar.b((String) obj, "event_id");
                dVar.e();
                return s3q0.a;
            case 27:
                StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId = (StickerPackPreviewWithStickerId) obj;
                List<StickerItem> list2 = stickerPackPreviewWithStickerId.b.q;
                if (list2 != null) {
                    for (StickerItem stickerItem : list2) {
                        if (stickerItem.b == stickerPackPreviewWithStickerId.c) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return stickerItem;
            case 28:
                s7l0 s7l0Var = (s7l0) obj;
                s7l0Var.H();
                s7l0Var.d.c(false);
                return s3q0.a;
            default:
                return kpl0.a(((vkl0) obj).getCurrentState());
        }
    }

    public /* synthetic */ yu60(kpl0 kpl0Var, vkl0 vkl0Var) {
        this.b = 29;
        this.c = vkl0Var;
    }
}
