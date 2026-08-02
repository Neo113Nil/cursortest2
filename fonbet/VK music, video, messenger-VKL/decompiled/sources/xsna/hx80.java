package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.common.model.OrderGroupPreview;
import com.vk.ecomm.orders.impl.common.model.OrderSource;
import com.vk.ecomm.orders.impl.common.model.OrderStatus;
import com.vk.ecomm.orders.impl.common.ui.model.SpanType;
import com.vk.ecomm.orders.impl.order.presentation.mvi.state.OrderError;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.hxu;
import xsna.sx80;
import xsna.tlo0;
import xsna.y8l;

/* compiled from: OrderStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class hx80 {
    public final px80 a;

    /* compiled from: OrderStateToViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderError.values().length];
            try {
                iArr[OrderError.AccessDenied.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderError.Internet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderError.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hx80(sdz sdzVar) {
        this.a = new px80(sdzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.lang.Throwable] */
    public final sx80 a(gx80 gx80Var) {
        sx80.a aVar;
        imy imyVar;
        List<ww80> list;
        hxu.a aVar2;
        boolean z;
        String str;
        gww gwwVar;
        gww gwwVar2;
        gww gwwVar3;
        gww gwwVar4;
        hxu.a aVar3;
        String str2;
        Iterator it;
        UserId userId;
        String str3;
        String str4;
        String str5;
        SpanType text;
        String str6;
        String str7;
        sx80.b bVar = new sx80.b(gx80Var.d);
        iu80 iu80Var = gx80Var.e;
        if (iu80Var != null) {
            ms90 ms90Var = iu80Var.d;
            String str8 = iu80Var.c;
            List<ww80> list2 = iu80Var.r;
            ListBuilder e = e43.e();
            e.add(new hxu(new y8l.b(), "order_common_header_info", tq.h(tlo0.Companion, R.string.ecomm_order_information_title), null));
            OrderSource orderSource = iu80Var.e;
            gww gwwVar5 = str8 != null ? new gww(new y8l.b(), "order_number", new tlo0.f(R.string.ecomm_orders_number), on00.f(new Pair(str8, new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(str8), null, null, null, null, 30)))) : null;
            if (gwwVar5 != null) {
                e.add(gwwVar5);
            }
            y8l.b bVar2 = new y8l.b();
            tlo0.f fVar = new tlo0.f(R.string.ecomm_orders_status);
            OrderStatus.a aVar4 = OrderStatus.Companion;
            OrderStatus orderStatus = iu80Var.g;
            aVar4.getClass();
            e.add(new gww(bVar2, "order_status", fVar, on00.f(new Pair("status", new com.vk.ecomm.orders.impl.common.ui.model.a(OrderStatus.a.a(orderStatus), null, null, null, null, 30)))));
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            hxu.a aVar5 = null;
            e.add(new gww(new y8l.b(), "order_date", new tlo0.f(R.string.ecomm_orders_date), on00.f(new Pair("date", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(new zx80(context).a(iu80Var.h * 1000)), null, null, null, null, 30)))));
            MapBuilder mapBuilder = new MapBuilder();
            if (orderSource instanceof OrderSource.Ozon) {
                OrderSource.Ozon ozon = (OrderSource.Ozon) orderSource;
                List<OrderGroupPreview> list3 = ozon.b;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    ?? r19 = aVar5;
                    if (i < 0) {
                        e43.t();
                        throw r19;
                    }
                    OrderGroupPreview orderGroupPreview = (OrderGroupPreview) next;
                    Iterator it3 = it2;
                    List<ww80> list4 = list2;
                    Pair pair = new Pair(String.valueOf(orderGroupPreview.b.b), new com.vk.ecomm.orders.impl.common.ui.model.a(oq.d(tlo0.Companion, orderGroupPreview.c), "OPEN_GROUP", orderGroupPreview.b, SpanType.a.a, i == ozon.b.size() + (-1) ? r19 : ", "));
                    mapBuilder.put(pair.i(), pair.j());
                    arrayList.add(s3q0.a);
                    i = i2;
                    aVar5 = r19;
                    it2 = it3;
                    list2 = list4;
                }
                list = list2;
                aVar2 = aVar5;
                z = true;
            } else {
                list = list2;
                aVar2 = null;
                z = true;
                dx80 dx80Var = iu80Var.f;
                if (dx80Var != null) {
                    Long l = dx80Var.d;
                    String valueOf = String.valueOf(dx80Var.c);
                    UserId userId2 = dx80Var.c;
                    tlo0.h hVar = new tlo0.h(dx80Var.b);
                    SpanType.a aVar6 = SpanType.a.a;
                    Pair pair2 = new Pair(valueOf, new com.vk.ecomm.orders.impl.common.ui.model.a(hVar, "OPEN_GROUP", userId2, aVar6, l != null ? " · " : null));
                    mapBuilder.put(pair2.i(), pair2.j());
                    if (l != null && l.longValue() != 0) {
                        Pair pair3 = new Pair("contact_seller", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.f(R.string.ecomm_write_to_the_good_owner), "OPEN_CHAT_WITH_SELLER", dx80Var.d, aVar6, null, 16));
                        mapBuilder.put(pair3.i(), pair3.j());
                    }
                }
            }
            e.add(new gww(new y8l.b(), "order_seller", tq.h(tlo0.Companion, R.string.ecomm_orders_seller), mapBuilder.h()));
            String str9 = iu80Var.p;
            if (str9 != null) {
                e.add(new ofi0(new y8l.b(), "order_seller_comment", this.a.a.d(str9, new LinksParserData(1803, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))));
            }
            if (iu80Var.q) {
                e.add(new ns90(new y8l.b(), "order_payment_action"));
            }
            e.set(e43.h(e), px80.a((jv80) j5g.i0(e), new y8l.a()));
            e.add(new hxu(new y8l.c(), "order_delivery_header", new tlo0.f(R.string.ecomm_order_delivery_and_payment_title), aVar2));
            rx80 rx80Var = iu80Var.n;
            ou80 ou80Var = iu80Var.l;
            gww gwwVar6 = (ms90Var == null || (str7 = ms90Var.a) == null) ? null : new gww(new y8l.b(), "order_payment_status", new tlo0.f(R.string.ecomm_orders_payment_status), on00.f(new Pair("paymentInfoStatus", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(str7), null, null, null, null, 30))));
            if (gwwVar6 != null) {
                e.add(gwwVar6);
            }
            e.add(new gww(new y8l.b(), "order_price", new tlo0.f(R.string.ecomm_orders_price), on00.f(new Pair("total_price", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(iu80Var.i.e), null, null, null, null, 30)))));
            Price price = iu80Var.j;
            if (price != null) {
                y8l.b bVar3 = new y8l.b();
                tlo0.f fVar2 = new tlo0.f(R.string.ecomm_orders_discount);
                Pair pair4 = new Pair("discount", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(price.e), null, null, null, " ", 14));
                String str10 = iu80Var.k;
                if (str10 == null) {
                    str10 = "";
                }
                str = ", ";
                gwwVar = new gww(bVar3, "order_discount", fVar2, pn00.k(pair4, new Pair("promo_code", new com.vk.ecomm.orders.impl.common.ui.model.a(tlo0.a.c(R.string.ecomm_orders_discount_promocode_postfix, str10), null, null, new SpanType.Text(SpanType.Text.Color.Secondary), null, 22))));
            } else {
                str = ", ";
                gwwVar = null;
            }
            if (gwwVar != null) {
                e.add(gwwVar);
            }
            gww gwwVar7 = (ou80Var == null || (str6 = ou80Var.b) == null) ? null : new gww(new y8l.b(), "order_delivery_type", new tlo0.f(R.string.ecomm_orders_delivery_method), on00.f(new Pair("delivery_type", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(str6), null, null, null, null, 30))));
            if (gwwVar7 != null) {
                e.add(gwwVar7);
            }
            String str11 = ou80Var != null ? ou80Var.a : null;
            if (str11 == null || str11.length() == 0) {
                gwwVar2 = null;
            } else {
                y8l.b bVar4 = new y8l.b();
                tlo0.f fVar3 = new tlo0.f(R.string.ecomm_orders_address);
                MapBuilder mapBuilder2 = new MapBuilder();
                Pair pair5 = new Pair(RTCStatsConstants.KEY_ADDRESS, new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(str11), null, null, null, (ou80Var == null || ou80Var.c == null) ? null : " · ", 14));
                mapBuilder2.put(pair5.i(), pair5.j());
                if (ou80Var != null && ou80Var.c != null) {
                    Pair pair6 = new Pair("show_map", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.f(R.string.ecomm_orders_show_on_map), "OPEN_MAP", null, SpanType.a.a, null, 20));
                    mapBuilder2.put(pair6.i(), pair6.j());
                }
                s3q0 s3q0Var = s3q0.a;
                gwwVar2 = new gww(bVar4, "order_delivery_address", fVar3, mapBuilder2.h());
            }
            if (gwwVar2 != null) {
                e.add(gwwVar2);
            }
            ax80 ax80Var = iu80Var.m;
            if (ax80Var != null) {
                String str12 = ax80Var.b;
                y8l.b bVar5 = new y8l.b();
                tlo0.f fVar4 = new tlo0.f(R.string.ecomm_orders_recipient);
                MapBuilder mapBuilder3 = new MapBuilder();
                String str13 = ax80Var.a;
                if (str13 != null) {
                    Pair pair7 = new Pair("recipient", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(str13), null, null, null, str12 != null ? str : null, 14));
                    mapBuilder3.put(pair7.i(), pair7.j());
                }
                if (str12 != null) {
                    Pair pair8 = new Pair("contact", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(str12), "CLICK_RECIPIENT_PHONE", null, SpanType.a.a, null, 20));
                    mapBuilder3.put(pair8.i(), pair8.j());
                }
                s3q0 s3q0Var2 = s3q0.a;
                gwwVar3 = new gww(bVar5, "order_recipient", fVar4, mapBuilder3.h());
            } else {
                gwwVar3 = null;
            }
            if (gwwVar3 != null) {
                e.add(gwwVar3);
            }
            if (rx80Var == null || (str5 = rx80Var.a) == null) {
                gwwVar4 = null;
            } else {
                y8l.b bVar6 = new y8l.b();
                tlo0.f fVar5 = new tlo0.f(R.string.ecomm_orders_track_number);
                tlo0.h hVar2 = new tlo0.h(str5);
                String str14 = rx80Var.b;
                String str15 = str14 != null ? "OPEN_LINK" : null;
                if (str14 == null || (text = SpanType.a.a) == null) {
                    text = new SpanType.Text(SpanType.Text.Color.Primary);
                }
                gwwVar4 = new gww(bVar6, "order_track_number", fVar5, on00.f(new Pair("track_number", new com.vk.ecomm.orders.impl.common.ui.model.a(hVar2, str15, str14, text, null, 16))));
            }
            if (gwwVar4 != null) {
                e.add(gwwVar4);
            }
            e.set(e43.h(e), px80.a((jv80) j5g.i0(e), new y8l.a()));
            char c = '_';
            if (list.isEmpty()) {
                aVar3 = null;
            } else {
                e.add(new hxu(new y8l.c(), "order_products_header", new tlo0.f(R.string.ecomm_order_products_title), null));
                Iterator it4 = list.iterator();
                int i3 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    ww80 ww80Var = (ww80) next2;
                    y8l.b bVar7 = new y8l.b();
                    boolean z2 = i3 == e43.h(list) ? z : false;
                    UserId userId3 = ww80Var.b;
                    String str16 = "order_product_" + fkq0.a(userId3) + c + ww80Var.a;
                    long j = ww80Var.a;
                    UserId userId4 = ww80Var.b;
                    Image image = ww80Var.c;
                    String str17 = ww80Var.d;
                    List<String> list5 = ww80Var.e;
                    if (list5.isEmpty()) {
                        it = it4;
                        userId = userId4;
                        str3 = str17;
                        str4 = null;
                    } else {
                        it = it4;
                        StringBuilder sb = new StringBuilder();
                        int i5 = 0;
                        for (Object obj : list5) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            UserId userId5 = userId4;
                            sb.append((String) obj);
                            if (i5 != e43.h(list5)) {
                                sb.append(" · ");
                            }
                            i5 = i6;
                            userId4 = userId5;
                        }
                        userId = userId4;
                        str3 = str17;
                        s3q0 s3q0Var3 = s3q0.a;
                        str4 = sb.toString();
                    }
                    e.add(new gpd0(bVar7, str16, j, userId, image, str3, str4, ww80Var.f, ww80Var.g, ww80Var.h, z2));
                    i3 = i4;
                    it4 = it;
                    c = '_';
                }
                aVar3 = null;
                e.set(e43.h(e), px80.a((jv80) j5g.i0(e), new y8l.a()));
            }
            e.add(new hxu(new y8l.c(), "order_summary_header", tq.h(tlo0.Companion, R.string.ecomm_order_price_title), (ms90Var == null || (str2 = ms90Var.b) == null) ? aVar3 : new hxu.a(str2, new tlo0.f(R.string.ecomm_order_receipt_label))));
            for (vw80 vw80Var : iu80Var.o) {
                y8l.b bVar8 = new y8l.b();
                StringBuilder sb2 = new StringBuilder("order_price_row_");
                sb2.append(vw80Var.a);
                sb2.append('_');
                String str18 = vw80Var.b.e;
                sb2.append(str18);
                sb2.append('_');
                sb2.append(vw80Var.d);
                e.add(new gww(bVar8, sb2.toString(), oq.d(tlo0.Companion, vw80Var.a), on00.f(new Pair("price", new com.vk.ecomm.orders.impl.common.ui.model.a(new tlo0.h(str18), null, null, null, null, 30)))));
            }
            e.set(e43.h(e), px80.a((jv80) j5g.i0(e), new y8l.a()));
            aVar = new sx80.a.d(e.g(), gx80Var.g, gx80Var.h);
        } else {
            OrderError orderError = gx80Var.i;
            if (orderError != null) {
                int i7 = a.$EnumSwitchMapping$0[orderError.ordinal()];
                if (i7 == 1) {
                    imyVar = new imy(false, tq.h(tlo0.Companion, R.string.ecomm_orders_access_error_title), new tlo0.f(R.string.ecomm_orders_access_error_description), new tlo0.f(R.string.ecomm_orders_loading_error_retry));
                } else if (i7 == 2) {
                    imyVar = new imy(true, tq.h(tlo0.Companion, R.string.ecomm_orders_loading_error_title), new tlo0.f(R.string.ecomm_orders_loading_error_description), new tlo0.f(R.string.ecomm_orders_loading_error_retry));
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imyVar = new imy(true, tq.h(tlo0.Companion, R.string.ecomm_orders_api_error_title), new tlo0.f(R.string.ecomm_orders_api_error_description), new tlo0.f(R.string.ecomm_orders_loading_error_retry));
                }
                aVar = new sx80.a.C3700a(imyVar);
            } else {
                aVar = gx80Var.f ? sx80.a.b.a : sx80.a.c.a;
            }
        }
        return new sx80(bVar, aVar);
    }
}
