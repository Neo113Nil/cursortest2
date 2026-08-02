package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.entername.EnterProfileContract$BirthdayErrorType;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.dto.common.Peer;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.geo.impl.presentation.a;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bd20;
import xsna.btl;
import xsna.c8p;
import xsna.cos;
import xsna.ebm;
import xsna.ev00;
import xsna.ij20;
import xsna.l3s;
import xsna.qs80;
import xsna.szr;
import xsna.tj50;
import xsna.xn50;
import xsna.yzx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lwh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lwh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Dialog dialog;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                e2g0 e2g0Var = ((CommunityRepliesFragment) obj2).Z;
                if (e2g0Var != null) {
                    e2g0Var.i(intValue);
                }
                return s3q0.a;
            case 1:
                ((lak) obj2).r.invoke((v1j) obj);
                return s3q0.a;
            case 2:
                btl.a aVar = (btl.a) obj2;
                aVar.b.onNext(obj);
                aVar.onComplete();
                return s3q0.a;
            case 3:
                ebm.a aVar2 = ((ibm) obj2).e;
                if (aVar2 != null) {
                    ebm ebmVar = ebm.this;
                    ypp yppVar = ebmVar.m.b;
                    Peer Zb = (yppVar == null || (dialog = (Dialog) yppVar.d) == null) ? null : dialog.Zb();
                    if (Zb != null) {
                        ebmVar.j.D(ebmVar, new gbm(Zb));
                    }
                }
                return s3q0.a;
            case 4:
                ((hpm) obj2).Z((com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 5:
                ((p5h) obj2).invoke();
                return s3q0.a;
            case 6:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b bVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b) obj2;
                f4z f4zVar = bVar.l;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    f4zVar.b(new g.h((com.vk.superapp.multiaccount.api.f) j5g.Y(list)));
                } else if (bVar.g.e().isEmpty()) {
                    f4zVar.b(new g.e(false));
                }
                return s3q0.a;
            case 7:
                c8p.b bVar2 = c8p.n1;
                ((c8p) obj2).getFeature().C(a.d.b);
                return s3q0.a;
            case 8:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                enterProfilePresenter.D = false;
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    EnterProfileContract$BirthdayErrorType enterProfileContract$BirthdayErrorType = ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).C() == 1105) ? EnterProfileContract$BirthdayErrorType.TOO_OLD : f35.e(th) ? EnterProfileContract$BirthdayErrorType.TOO_YOUNG : EnterProfileContract$BirthdayErrorType.INCORRECT_DATE;
                    jpp jppVar = (jpp) enterProfilePresenter.a;
                    if (jppVar != null) {
                        jppVar.E4(enterProfileContract$BirthdayErrorType);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 9:
                ((tzr) obj2).a.onNext(new szr.c(((pno0) obj).d().toString()));
                return s3q0.a;
            case 10:
                ((h3s) obj2).T(new l3s.f.a((Throwable) obj));
                return s3q0.a;
            case 11:
                ((n3g) obj2).k(((Integer) obj).intValue(), false);
                return s3q0.a;
            case 12:
                return new cos.a(((tj50.a) obj).a(new ons(1, ((pns) obj2).d, zms.class, "toViewState", "toViewState(Lcom/vk/friends/impl/cleanup/domain/FriendsCleanupState$Content;)Lcom/vk/friends/impl/cleanup/presentation/FriendsCleanupViewState$FriendsCleanupList;", 0), ao8.d));
            case 13:
                tys tysVar = (tys) obj2;
                Throwable th2 = (Throwable) obj;
                boolean z = th2 instanceof VKApiExecutionException;
                if (z && f35.c((VKApiExecutionException) th2)) {
                    com.vk.registration.funnels.b.a.getClass();
                    com.vk.registration.funnels.b.p();
                } else if (z && f35.d((VKApiExecutionException) th2)) {
                    sp.v(tysVar.a, tysVar.b, new fbh(tysVar, 18));
                }
                return s3q0.a;
            case 14:
                GeoFragment geoFragment = (GeoFragment) obj2;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                gl00 value = geoFragment.a0.getValue(geoFragment, GeoFragment.c0[0]);
                if (value != null) {
                    value.a();
                }
                xn50.a.c(geoFragment, a.h.b.b);
                return s3q0.a;
            case 15:
                ((u6u) obj2).l.invoke((m5u) obj);
                return s3q0.a;
            case 16:
                UIBlock uIBlock = (UIBlock) obj;
                return Boolean.valueOf((uIBlock instanceof UIBlockGroupFilter) && epx.f(((UIBlockGroupFilter) uIBlock).z.b, ((UIBlockGroupFilter) obj2).z.b));
            case 17:
                GroupVh groupVh = (GroupVh) obj2;
                if (((qs80) obj) instanceof qs80.c) {
                    groupVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE);
                } else {
                    groupVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                }
                return s3q0.a;
            case 18:
                ((HidingToolbarVh) obj2).d(false, true);
                return s3q0.a;
            case 19:
                ((c7v) obj2).l.A();
                return s3q0.a;
            case 20:
                return quv.n((quv) obj2, (iuv) obj);
            case 21:
                int i2 = JoinCallFragment.U;
                ((wzx) obj2).a((yzx.b) obj);
                return s3q0.a;
            case 22:
                ((cq00) obj2).b.a(MarketAdsItemViewEvent.a.b);
                return s3q0.a;
            case 23:
                iv00 iv00Var = (iv00) obj2;
                int i3 = iv00.p1;
                ev00.a aVar3 = ev00.a.b;
                iv00Var.getClass();
                xn50.a.c(iv00Var, aVar3);
                return s3q0.a;
            case 24:
                int intValue2 = ((Integer) obj).intValue();
                e2g0 e2g0Var2 = ((MarketItemReviewRepliesFragment) obj2).Y;
                if (e2g0Var2 != null) {
                    e2g0Var2.i(intValue2);
                }
                return s3q0.a;
            case 25:
                gzs<s3q0> gzsVar = ((MarketProductTileView) obj2).J;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 26:
                h820 h820Var = ((i820) obj2).l;
                if (h820Var != null) {
                    h820Var.onSearchRequested();
                }
                return s3q0.a;
            case 27:
                ((cd20) obj2).O(bd20.a.b);
                return s3q0.a;
            case 28:
                int i4 = ModalReactionsFragment.G0;
                ((ModalReactionsFragment) obj2).a0();
                return s3q0.a;
            default:
                dw30 dw30Var = (dw30) obj2;
                ij20.a aVar4 = (ij20.a) obj;
                int i5 = dw30Var.e;
                Peer peer = dw30Var.h;
                aVar4.h(Integer.valueOf(i5), SignalingProtocol.KEY_OFFSET);
                Long l = dw30Var.f;
                if (l != null) {
                    aVar4.h(l, "date");
                }
                Peer peer2 = dw30Var.g;
                if (peer2 != null) {
                    aVar4.h(Long.valueOf(peer2.b), "peer_id");
                }
                peer.getClass();
                if (peer.Ab(Peer.Type.GROUP)) {
                    aVar4.h(Long.valueOf(peer.d), "group_id");
                }
                return aVar4;
        }
    }
}
