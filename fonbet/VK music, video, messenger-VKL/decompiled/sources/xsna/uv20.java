package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.feature.music.dto.ui.UIBlockExtendedPodcastItem;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.common.links.LinksParserData;
import com.vk.contacts.ContactSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.orders.impl.common.model.OrderGroupPreview;
import com.vk.ecomm.orders.impl.common.model.OrderSource;
import com.vk.ecomm.orders.impl.common.model.OrderStatus;
import com.vk.ecomm.orders.impl.common.ui.model.SpanType;
import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.b;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyPageView;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.superapp.browser.internal.ui.menu.action.OtherAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import xsna.cca0;
import xsna.hic0;
import xsna.tlo0;
import xsna.wjg0;
import xsna.wqu;
import xsna.xn50;
import xsna.zn30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class uv20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uv20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hpj hpjVar;
        com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a dVar;
        boolean z;
        com.vk.ecomm.orders.impl.common.ui.model.a aVar;
        List<OrderPreview.Product> list;
        com.vk.ecomm.orders.impl.common.ui.model.a aVar2;
        tlo0 tlo0Var;
        boolean z2;
        Map<Integer, OrderPreview> map;
        Iterator<Map.Entry<Integer, OrderPreview>> it;
        OrdersListItem.Order.Action action;
        OrdersListItem.Order.Action action2;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wv20) obj2).c();
                return s3q0.a;
            case 1:
                ((com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj2).e(b.h.a);
                return s3q0.a;
            case 2:
                MusicTrack musicTrack = (MusicTrack) obj;
                zn30.a aVar3 = ((zn30) obj2).k;
                if (aVar3 != null) {
                    aVar3.b(musicTrack);
                }
                return s3q0.a;
            case 3:
                sv30 sv30Var = (sv30) obj2;
                hpm e = ((xgl0) obj).b().e();
                Peer peer = sv30Var.c;
                e.s(peer.b, sv30Var.d);
                e.t(peer.b);
                return s3q0.a;
            case 4:
                rx30 rx30Var = (rx30) obj2;
                int i2 = uqr0.m;
                return new uqr0(rx30Var.i.inflate(R.layout.vkim_search_create_contact_vh, (ViewGroup) obj, false), rx30Var.h);
            case 5:
                u440 u440Var = (u440) obj2;
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"MultiStory", "doShare error"});
                }
                L.g("MultiStory", th);
                th.printStackTrace();
                h03.b(th);
                ((g440) u440Var.s).ik();
                u440Var.A = false;
                return s3q0.a;
            case 6:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj2;
                if (((Integer) obj).intValue() > 0 && (hpjVar = musicCatalogRootVh.E) != null) {
                    myc0.h(hpjVar, null, null, new hd40(musicCatalogRootVh, null), 3);
                }
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((vh40) obj2).b.B(o25.a().c(), (Playlist) obj) == 0);
            case 8:
                jp40 jp40Var = (jp40) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    jp40Var.a("audio_playback_channel");
                    jp40Var.a("remaining_background_time");
                    jp40Var.a("subscription_push_channel");
                    jp40Var.c.dispose();
                }
                return s3q0.a;
            case 9:
                ((hr40) obj2).d.invoke();
                return s3q0.a;
            case 10:
                View view = (View) obj;
                izs<? super View, s3q0> izsVar = ((MyTargetAdSurveyPageView) obj2).j;
                if (izsVar != null) {
                    izsVar.invoke(view);
                }
                return s3q0.a;
            case 11:
                return new UIBlockExtendedPodcastItem(((bi20) obj2).b(), (ExtendedPodcast) obj);
            case 12:
                ((ni60) obj2).a((r070) obj);
                return s3q0.a;
            case 13:
                return ((yn80) obj2).d[((Integer) obj).intValue()];
            case 14:
                dw80 dw80Var = (dw80) obj;
                com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.c cVar = (com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.c) ((OrderListFragment) obj2).P.getValue();
                cVar.getClass();
                int i3 = dw80Var.b;
                c3p0 c3p0Var = new c3p0(dw80Var.f);
                Throwable th2 = dw80Var.l;
                if (th2 != null) {
                    dVar = new a.b(((th2 instanceof VKApiExecutionException) && h03.a(th2)) ? new imy(true, tq.h(tlo0.Companion, R.string.ecomm_orders_loading_error_title), new tlo0.f(R.string.ecomm_orders_loading_error_description), new tlo0.f(R.string.ecomm_orders_loading_error_retry)) : new imy(true, tq.h(tlo0.Companion, R.string.ecomm_orders_api_error_title), new tlo0.f(R.string.ecomm_orders_api_error_description), new tlo0.f(R.string.ecomm_orders_loading_error_retry)));
                } else if (dw80Var.g) {
                    dVar = a.c.b;
                } else if (i3 == 0) {
                    dVar = a.C1000a.b;
                } else {
                    com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.b bVar = cVar.a;
                    boolean z3 = dw80Var.h;
                    ListBuilder e2 = e43.e();
                    Map<Integer, OrderPreview> map2 = dw80Var.c;
                    Iterator<Map.Entry<Integer, OrderPreview>> it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        OrderPreview value = it2.next().getValue();
                        int i4 = value.c;
                        Long l2 = value.g;
                        OrderSource orderSource = value.n;
                        List<OrderPreview.Product> list2 = value.l;
                        OrderStatus.a aVar4 = OrderStatus.Companion;
                        OrderStatus orderStatus = value.e;
                        aVar4.getClass();
                        tlo0 a = OrderStatus.a.a(orderStatus);
                        ?? r26 = r2;
                        boolean z4 = value.f;
                        String str = value.d;
                        if (str == null) {
                            z = z4;
                            aVar = null;
                        } else {
                            z = z4;
                            if (orderSource instanceof OrderSource.Market) {
                                aVar = new com.vk.ecomm.orders.impl.common.ui.model.a(oq.d(tlo0.Companion, str), null, null, null, null, 30);
                            } else {
                                if (!(orderSource instanceof OrderSource.Ozon)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tlo0.Companion.getClass();
                                aVar = new com.vk.ecomm.orders.impl.common.ui.model.a(tlo0.a.c(R.string.ecomm_orders_ozon, str), "OPEN_INTEGRATION_ORDER", Integer.valueOf(value.c), SpanType.a.a, null, 16);
                            }
                        }
                        if (l2 != null) {
                            Context context = e43.a;
                            if (context == null) {
                                context = null;
                            }
                            zx80 zx80Var = new zx80(context);
                            tlo0.a aVar5 = tlo0.Companion;
                            long longValue = l2.longValue();
                            list = list2;
                            String a2 = zx80Var.a(longValue * 1000);
                            aVar5.getClass();
                            aVar2 = new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(a2), null, null, null, null, 30);
                        } else {
                            list = list2;
                            aVar2 = null;
                        }
                        MapBuilder mapBuilder = new MapBuilder();
                        if (orderSource instanceof OrderSource.Ozon) {
                            List<OrderGroupPreview> list3 = ((OrderSource.Ozon) orderSource).b;
                            List<OrderGroupPreview> list4 = list3;
                            tlo0Var = a;
                            ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                            Iterator it3 = list4.iterator();
                            int i5 = 0;
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                OrderGroupPreview orderGroupPreview = (OrderGroupPreview) next;
                                Iterator it4 = it3;
                                boolean z5 = z3;
                                Map<Integer, OrderPreview> map3 = map2;
                                Iterator<Map.Entry<Integer, OrderPreview>> it5 = it2;
                                Pair pair = new Pair(String.valueOf(orderGroupPreview.b.b), new com.vk.ecomm.orders.impl.common.ui.model.a(oq.d(tlo0.Companion, orderGroupPreview.c), "OPEN_GROUP", orderGroupPreview.b, SpanType.a.a, i5 == list3.size() + (-1) ? null : ", "));
                                mapBuilder.put(pair.i(), pair.j());
                                arrayList.add(s3q0.a);
                                it3 = it4;
                                i5 = i6;
                                z3 = z5;
                                map2 = map3;
                                it2 = it5;
                            }
                            z2 = z3;
                            map = map2;
                            it = it2;
                        } else {
                            tlo0Var = a;
                            z2 = z3;
                            map = map2;
                            it = it2;
                            OrderPreview.OrderSeller orderSeller = value.i;
                            if (orderSeller != null) {
                                Pair pair2 = new Pair(String.valueOf(orderSeller.c), new com.vk.ecomm.orders.impl.common.ui.model.a(oq.d(tlo0.Companion, orderSeller.b), "OPEN_GROUP", orderSeller.c, SpanType.a.a, null, 16));
                                mapBuilder.put(pair2.i(), pair2.j());
                            }
                        }
                        MapBuilder h = mapBuilder.h();
                        String str2 = value.h;
                        com.vk.ecomm.orders.impl.common.ui.model.a aVar6 = str2 != null ? new com.vk.ecomm.orders.impl.common.ui.model.a(oq.d(tlo0.Companion, str2), null, null, null, null, 30) : null;
                        List<OrderPreview.Product> list5 = list;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                        for (OrderPreview.Product product : list5) {
                            arrayList2.add(new OrdersListItem.Order.a(product.b, product.c, product.d, product.e));
                        }
                        boolean z6 = (list.size() >= value.m || list.isEmpty()) ? false : r26 == true ? 1 : 0;
                        String str3 = value.j;
                        qow qowVar = str3 != null ? new qow(bVar.a.d(str3, new LinksParserData(1803, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))) : null;
                        OrderPreview.ActionType actionType = value.k;
                        int i7 = actionType == null ? -1 : b.a.$EnumSwitchMapping$0[actionType.ordinal()];
                        if (i7 == r26) {
                            action = new OrdersListItem.Order.Action(tq.h(tlo0.Companion, R.string.ecomm_orders_pay_order), OrdersListItem.Order.Action.Style.Primary, OrderPreview.ActionType.Payment);
                        } else if (i7 != 2) {
                            action2 = null;
                            e2.add(new OrdersListItem.Order(i4, tlo0Var, z, aVar, aVar2, h, aVar6, arrayList2, z6, qowVar, action2));
                            r2 = r26 == true ? 1 : 0;
                            z3 = z2;
                            map2 = map;
                            it2 = it;
                        } else {
                            action = new OrdersListItem.Order.Action(tq.h(tlo0.Companion, list.size() > r26 ? R.string.ecomm_orders_review_order_with_multiple_products : R.string.ecomm_orders_review_order_with_one_product), OrdersListItem.Order.Action.Style.Secondary, OrderPreview.ActionType.Review);
                        }
                        action2 = action;
                        e2.add(new OrdersListItem.Order(i4, tlo0Var, z, aVar, aVar2, h, aVar6, arrayList2, z6, qowVar, action2));
                        r2 = r26 == true ? 1 : 0;
                        z3 = z2;
                        map2 = map;
                        it2 = it;
                    }
                    boolean z7 = r2;
                    boolean z8 = z3;
                    Map<Integer, OrderPreview> map4 = map2;
                    if (dw80Var.i != null) {
                        e2.add(OrdersListItem.a.b);
                    } else if (z8) {
                        e2.add(OrdersListItem.b.b);
                    }
                    dVar = new a.d(e2.g(), (z8 || i3 <= map4.size()) ? false : z7, dw80Var.j, dw80Var.k);
                }
                return new nw80(c3p0Var, dVar);
            case 15:
                com.vk.superapp.browser.internal.ui.menu.action.e eVar = (com.vk.superapp.browser.internal.ui.menu.action.e) obj2;
                OtherAction otherAction = eVar.n;
                if (otherAction != null) {
                    eVar.l.d(otherAction);
                }
                return s3q0.a;
            case 16:
                y3a0 y3a0Var = (y3a0) ((x3a0) obj2).a;
                if (y3a0Var != null) {
                    y3a0Var.S(true);
                }
                return s3q0.a;
            case 17:
                Uri uri = ((ImageCropArea) obj).c;
                MediaStoreEntry b = com.vk.newsfeed.posting.impl.domain.model.b.b(((hic0.b) obj2).b);
                return Boolean.valueOf(epx.f(uri, b != null ? b.f() : null));
            case 18:
                Throwable th3 = (Throwable) obj;
                ((wba0) obj2).g.invoke(new cca0.f(th3));
                kwg0.b().accept(th3);
                return s3q0.a;
            case 19:
                bwt0.p0(((com.vk.photos.root.presentation.h) obj2).m.getMenuButton(), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 20:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "playlist_menu_title");
                rgi0.a(tgi0Var);
                qgi0.h(tgi0Var, ((i9b0) obj2).b);
                return s3q0.a;
            case 21:
                ykb0 ykb0Var = (ykb0) obj2;
                PodcastsGetGroupInfoResponseDto podcastsGetGroupInfoResponseDto = (PodcastsGetGroupInfoResponseDto) obj;
                UserId userId = ykb0Var.s;
                return fkq0.b(userId) ? rsg0.a0(yfb.x(wqu.a.a(ykb0Var.v, Collections.singletonList(fkq0.a(userId)), e43.l(GroupsFieldsDto.CAN_SUBSCRIBE_PODCASTS, GroupsFieldsDto.IS_SUBSCRIBED_PODCASTS)))).U(new pu50(new d410(podcastsGetGroupInfoResponseDto, 21), 6)) : io.reactivex.rxjava3.core.q.T(podcastsGetGroupInfoResponseDto);
            case 22:
                return Boolean.valueOf(((Poll) obj2).b == ((onb0) obj).a.b);
            case 23:
                PostFragment postFragment = (PostFragment) obj2;
                RecyclerView.Adapter L0 = postFragment.y0.L0(((Integer) obj).intValue());
                ho60 ho60Var = postFragment.v0;
                if (ho60Var == null) {
                    ho60Var = null;
                }
                if (epx.f(L0, ho60Var)) {
                    return PostViewFragmentTimeSpentTracker.SectionType.Post;
                }
                vdg vdgVar = postFragment.x0;
                if (vdgVar == null) {
                    vdgVar = null;
                }
                if (epx.f(L0, vdgVar)) {
                    return PostViewFragmentTimeSpentTracker.SectionType.Comments;
                }
                return null;
            case 24:
                com.vk.newsfeed.impl.presenters.b bVar2 = (com.vk.newsfeed.impl.presenters.b) obj2;
                mzp0 mzp0Var = bVar2.c;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                bVar2.i0().V4();
                return s3q0.a;
            case 25:
                PostingFragment postingFragment = (PostingFragment) obj2;
                int i8 = PostingFragment.L0;
                postingFragment.getClass();
                xn50.a.c(postingFragment, (PostingAction) obj);
                return s3q0.a;
            case 26:
                L.j((Throwable) obj, "Failed to handle rich content insertion");
                ((wjg0.a) ((wjg0) obj2)).a();
                return s3q0.a;
            case 27:
                ((qkc0) obj2).d.getClass();
                return Boolean.valueOf(tuk0.c((PostingState.Editing) obj));
            case 28:
                h8g0 h8g0Var = (h8g0) obj2;
                f8g0 f8g0Var = h8g0Var.m;
                if ((f8g0Var == null ? null : f8g0Var).b != ContactSyncState.SYNCING) {
                    h8g0Var.l.b();
                }
                return s3q0.a;
            default:
                ((io.reactivex.rxjava3.subjects.f) obj2).onNext(Integer.valueOf((int) (((Float) obj).floatValue() * 100)));
                return s3q0.a;
        }
    }
}
