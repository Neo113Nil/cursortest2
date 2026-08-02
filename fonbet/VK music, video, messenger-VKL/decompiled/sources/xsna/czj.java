package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.vkMaps.dto.VkMapsGeocodingReverseFieldsDto;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a7f0;
import xsna.ezj;
import xsna.jt0;
import xsna.kzj;
import xsna.mzj;
import xsna.pk00;
import xsna.xyj;

/* compiled from: CourierMapFeature.kt */
/* loaded from: classes18.dex */
public final class czj extends wk50<vzj, tzj, xyj, mzj> {
    public final q5w f;
    public final io.reactivex.rxjava3.subjects.f<Coordinates> g;
    public io.reactivex.rxjava3.disposables.c h;
    public final f4z i;
    public final f4z j;
    public final f4z k;
    public final bpn0 l;

    public czj(nzj nzjVar) {
        super(null, nzjVar);
        this.f = new q5w(new x1o0());
        io.reactivex.rxjava3.subjects.f<Coordinates> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.g = fVar;
        this.i = new f4z();
        this.j = new f4z();
        this.k = new f4z();
        this.l = new bpn0(new bzj(this, 0));
        a7f0.a.e(this, fVar.y(300L, TimeUnit.MILLISECONDS).h0(Long.MAX_VALUE), null, new wje(this, 10), null, null, 13);
    }

    @Override // xsna.wk50
    public final void N(tzj tzjVar, xyj xyjVar) {
        String str;
        ArrayList arrayList;
        tzj tzjVar2 = tzjVar;
        xyj xyjVar2 = xyjVar;
        jt0 jt0Var = tzjVar2.c;
        tj00 tj00Var = tzjVar2.b;
        if (xyjVar2 instanceof xyj.c) {
            ((mj50) this.l.getValue()).a(tzjVar2, xyjVar2);
            return;
        }
        boolean z = xyjVar2 instanceof xyj.f;
        f4z f4zVar = this.i;
        if (z) {
            f4zVar.b(new kzj.a());
            return;
        }
        str = "";
        String str2 = null;
        if (xyjVar2 instanceof xyj.i) {
            if (((xyj.i) xyjVar2).b) {
                if (jt0Var != null && (jt0Var instanceof jt0.c)) {
                    str2 = ho8.a(new StringBuilder(), ((jt0.c) jt0Var).a, ' ');
                }
                if (str2 != null) {
                    str = str2;
                }
            }
            f4zVar.b(new kzj.c(str, tj00Var.a.a));
            return;
        }
        if (xyjVar2 instanceof xyj.e) {
            gk9 gk9Var = ((xyj.e) xyjVar2).b;
            if (tzjVar2.h) {
                return;
            }
            T(new mzj.d(new pk00.a(gk9Var)));
            this.g.onNext(gk9Var.a);
            return;
        }
        if (xyjVar2 instanceof xyj.d) {
            T(new mzj.d(pk00.c.a));
            return;
        }
        boolean z2 = xyjVar2 instanceof xyj.g;
        vm00 vm00Var = vm00.d;
        f4z f4zVar2 = this.k;
        if (z2) {
            SearchAddressResult searchAddressResult = ((xyj.g) xyjVar2).b;
            if (searchAddressResult instanceof SearchAddressResult.Custom) {
                f4zVar2.b(new CourierAddress(((SearchAddressResult.Custom) searchAddressResult).b, true, null, 4, null));
                return;
            } else {
                if (!(searchAddressResult instanceof SearchAddressResult.Found)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new mzj.d(new pk00.b(new gk9(((SearchAddressResult.Found) searchAddressResult).c, vm00Var), false)));
                return;
            }
        }
        if (xyjVar2 instanceof xyj.h) {
            xyj.h hVar = (xyj.h) xyjVar2;
            if (tj00Var.c) {
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar = this.h;
            if (cVar != null) {
                cVar.dispose();
            }
            Coordinates coordinates = hVar.b;
            double d = coordinates.b;
            double d2 = coordinates.c;
            q5w q5wVar = this.f;
            x1o0 x1o0Var = (x1o0) q5wVar.b;
            List l = e43.l(String.valueOf(d), String.valueOf(d2));
            List l2 = e43.l(VkMapsGeocodingReverseFieldsDto.ADDRESS, VkMapsGeocodingReverseFieldsDto.ADDRESS_DETAILS, VkMapsGeocodingReverseFieldsDto.PIN);
            Integer num = 1;
            x1o0Var.getClass();
            tfx tfxVar = new tfx("vkMaps.geocodingReverse", new ohl0(6), new wul0(5));
            tfxVar.i(CampaignEx.JSON_KEY_AD_Q, l);
            if (l2 != null) {
                List list = l2;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VkMapsGeocodingReverseFieldsDto) it.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                tfxVar.i("fields", arrayList);
            }
            tfx.l(tfxVar, "radius", 300, 0, 0, 12);
            tfx.o(tfxVar, "lang", "ru", 0, 0, 12);
            tfxVar.f(num.intValue(), 1, 100, SignalingProtocol.KEY_LIMIT);
            tfxVar.j("show_country", true);
            this.h = a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar)).l(new qca0(new q1(1, (vwu0) ((bpn0) q5wVar.c).getValue(), vwu0.class, "mapReverse", "mapReverse(Lcom/vk/api/generated/vkMaps/dto/VkMapsGeocodingResponseDto;)Lcom/vk/ecomm/cart/impl/geocoding/GeocoderResult;", 0, 8), 15)), new k7f(this, 6), new mre(this, 12), 1);
            return;
        }
        if (xyjVar2 instanceof xyj.j) {
            xyj.j jVar = (xyj.j) xyjVar2;
            if (jVar instanceof xyj.j.e) {
                if (tj00Var.b) {
                    return;
                }
                this.j.b(ezj.a.a);
                return;
            } else {
                if (jVar instanceof xyj.j.c) {
                    T(mzj.e.b.b);
                    return;
                }
                if (jVar instanceof xyj.j.b) {
                    T(mzj.e.a.b);
                    return;
                }
                if (jVar instanceof xyj.j.d) {
                    T(new mzj.d(new pk00.b(new gk9(((xyj.j.d) jVar).b, vm00Var), true)));
                    return;
                } else {
                    if (!(jVar instanceof xyj.j.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4zVar.b(new kzj.d(tq.h(tlo0.Companion, R.string.ecomm_cart_error_abstract)));
                    T(mzj.e.a.b);
                    return;
                }
            }
        }
        if (xyjVar2 instanceof xyj.a.b) {
            if (jt0Var != null && (jt0Var instanceof jt0.c)) {
                str2 = ((jt0.c) jt0Var).a;
            }
            str = str2 != null ? str2 : "";
            T(mzj.a.b.b);
            f4zVar.b(new kzj.b(str));
            return;
        }
        if (xyjVar2 instanceof xyj.a.C4053a) {
            if (jt0Var == null || !(jt0Var instanceof jt0.c)) {
                return;
            }
            jt0.c cVar2 = (jt0.c) jt0Var;
            if (!cVar2.b) {
                f4zVar.b(new kzj.d(tq.h(tlo0.Companion, R.string.ecomm_cart_error_abstract)));
            }
            f4zVar2.b(new CourierAddress(cVar2.a, false, tj00Var.a.a));
            return;
        }
        if (!(xyjVar2 instanceof xyj.b)) {
            throw new NoWhenBranchMatchedException();
        }
        xyj.b bVar = (xyj.b) xyjVar2;
        if (bVar instanceof xyj.b.a) {
            T(mzj.a.C3378a.b);
        } else {
            if (!(bVar instanceof xyj.b.C4054b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar2.b(new CourierAddress(((xyj.b.C4054b) bVar).b, true, null, 4, null));
        }
    }
}
