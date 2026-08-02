package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoDataByRefFieldsDto;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a7f0;
import xsna.hmh0;
import xsna.kmh0;
import xsna.zlh0;

/* compiled from: SearchAddressFeature.kt */
/* loaded from: classes18.dex */
public final class dmh0 extends wk50<rmh0, omh0, zlh0, kmh0> {
    public final io.reactivex.rxjava3.subjects.f<jpe0> f;
    public final rov0 g;
    public io.reactivex.rxjava3.disposables.c h;
    public final f4z i;
    public final f4z j;

    public dmh0(lmh0 lmh0Var) {
        super(null, lmh0Var);
        io.reactivex.rxjava3.subjects.f<jpe0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.f = fVar;
        this.g = new rov0(new x1o0());
        this.i = new f4z();
        this.j = new f4z();
        a7f0.a.e(this, fVar.y(300L, TimeUnit.MILLISECONDS).h0(Long.MAX_VALUE), null, new m360(this, 15), null, null, 13);
    }

    public static String V(kt0 kt0Var) {
        return rli0.r(rli0.h(rli0.m(rl3.D(new String[]{kt0Var.c, kt0Var.b}))), ", ", null, 58);
    }

    @Override // xsna.wk50
    public final void N(omh0 omh0Var, zlh0 zlh0Var) {
        Object obj;
        ArrayList arrayList;
        omh0 omh0Var2 = omh0Var;
        zlh0 zlh0Var2 = zlh0Var;
        Coordinates coordinates = omh0Var2.c;
        String str = omh0Var2.b;
        boolean z = zlh0Var2 instanceof zlh0.f;
        io.reactivex.rxjava3.subjects.f<jpe0> fVar = this.f;
        if (z) {
            T(kmh0.a.b);
            fVar.onNext(new jpe0(str, coordinates));
            return;
        }
        if (zlh0Var2 instanceof zlh0.g.a) {
            U(((zlh0.g.a) zlh0Var2).b, omh0Var2);
            return;
        }
        boolean z2 = zlh0Var2 instanceof zlh0.g.b;
        f4z f4zVar = this.i;
        if (z2) {
            f4zVar.b(hmh0.c.a);
            return;
        }
        if (zlh0Var2 instanceof zlh0.g.c) {
            String str2 = ((zlh0.g.c) zlh0Var2).b;
            if (str2 == null || drm0.N(str2)) {
                return;
            }
            U(str2, omh0Var2);
            return;
        }
        if (zlh0Var2 instanceof zlh0.b) {
            f4zVar.b(new hmh0.b(str));
            return;
        }
        if (zlh0Var2 instanceof zlh0.c) {
            fVar.onNext(new jpe0(str, coordinates));
            return;
        }
        if (!(zlh0Var2 instanceof zlh0.d)) {
            if (zlh0Var2 instanceof zlh0.a) {
                f4zVar.b(hmh0.a.a);
                return;
            } else {
                if (!(zlh0Var2 instanceof zlh0.e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.j.b(new SearchAddressResult.Custom(((zlh0.e.a) zlh0Var2).b));
                return;
            }
        }
        zlh0.d dVar = (zlh0.d) zlh0Var2;
        Iterator<T> it = omh0Var2.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((kt0) obj).a, dVar.b)) {
                    break;
                }
            }
        }
        kt0 kt0Var = (kt0) obj;
        if (kt0Var != null) {
            if (!kt0Var.d) {
                U(V(kt0Var), omh0Var2);
                return;
            }
            String str3 = kt0Var.a;
            x1o0 x1o0Var = this.g.a;
            List singletonList = Collections.singletonList(VkMapsGeoDataByRefFieldsDto.PIN);
            x1o0Var.getClass();
            tfx tfxVar = new tfx("vkMaps.geoDataByRef", new vul0(6), new nft0(2));
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str3, 0, 0, 12);
            if (singletonList != null) {
                List list = singletonList;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((VkMapsGeoDataByRefFieldsDto) it2.next()).i());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                tfxVar.i("fields", arrayList);
            }
            tfxVar.f(1, 1, 100, SignalingProtocol.KEY_LIMIT);
            a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar)).l(new x310(new hxm0(14), 23)), new com.vk.video.ui.discovery.minimizable.related_videos.j(this, kt0Var, omh0Var2, 9), new apg(this, kt0Var, omh0Var2, 3), 1);
        }
    }

    public final void U(String str, omh0 omh0Var) {
        if (epx.f(str, omh0Var.b)) {
            return;
        }
        T(new kmh0.d(str));
        this.f.onNext(new jpe0(str, omh0Var.c));
    }
}
