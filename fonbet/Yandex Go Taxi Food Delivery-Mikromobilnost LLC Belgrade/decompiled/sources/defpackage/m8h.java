package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes4.dex */
public final class m8h implements or8 {
    public final jwh a;

    public /* synthetic */ m8h(jwh jwhVar) {
        this.a = jwhVar;
    }

    @Override // defpackage.or8
    public void k(ye0 ye0Var) {
        Object obj;
        if (ye0Var.equals(cq8.b) || ye0Var.equals(dq8.b) || ye0Var.equals(gq8.b) || ye0Var.equals(hq8.b) || ye0Var.equals(jq8.b) || ye0Var.equals(mq8.b) || ye0Var.equals(vq8.b) || ye0Var.equals(wq8.b) || ye0Var.equals(xq8.b) || ye0Var.equals(br8.b) || ye0Var.equals(cr8.b) || ye0Var.equals(hr8.b) || ye0Var.equals(jr8.b) || (ye0Var instanceof rq8) || (ye0Var instanceof uq8)) {
            obj = null;
        } else if (ye0Var instanceof eq8) {
            eq8 eq8Var = (eq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(eq8Var.b)), new Pair("type", eq8Var.c), new Pair("camera_type", eq8Var.w));
        } else if (ye0Var instanceof fq8) {
            fq8 fq8Var = (fq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(fq8Var.b)), new Pair("type", fq8Var.c), new Pair("camera_type", fq8Var.w));
        } else if (ye0Var instanceof pq8) {
            pq8 pq8Var = (pq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(pq8Var.b)), new Pair("type", pq8Var.c), new Pair("camera_type", pq8Var.w));
        } else if (ye0Var instanceof iq8) {
            iq8 iq8Var = (iq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(iq8Var.b)), new Pair("type", iq8Var.c), new Pair("camera_type", iq8Var.w));
        } else if (ye0Var instanceof kq8) {
            kq8 kq8Var = (kq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(kq8Var.b)), new Pair("type", kq8Var.c), new Pair("camera_type", kq8Var.w));
        } else if (ye0Var instanceof lq8) {
            MapBuilder mapBuilder = new MapBuilder();
            lq8 lq8Var = (lq8) ye0Var;
            mapBuilder.put("step", Integer.valueOf(lq8Var.b));
            mapBuilder.put("type", lq8Var.c);
            mapBuilder.put("camera_type", lq8Var.w);
            mapBuilder.put("capture_method", lq8Var.x);
            Integer num = lq8Var.y;
            if (num != null) {
                mapBuilder.put("timer_duration", Integer.valueOf(num.intValue()));
            }
            obj = mapBuilder.j();
        } else if (ye0Var instanceof nq8) {
            nq8 nq8Var = (nq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(nq8Var.b)), new Pair("type", nq8Var.c), new Pair("camera_type", nq8Var.w));
        } else if (ye0Var instanceof oq8) {
            oq8 oq8Var = (oq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(oq8Var.b)), new Pair("type", oq8Var.c), new Pair("camera_type", oq8Var.w));
        } else if (ye0Var instanceof qq8) {
            qq8 qq8Var = (qq8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(qq8Var.b)), new Pair("type", qq8Var.c), new Pair("camera_type", qq8Var.w));
        } else if (ye0Var instanceof yq8) {
            obj = gw00.e(new Pair("durationMS", Long.valueOf(((yq8) ye0Var).b)));
        } else if (ye0Var instanceof zq8) {
            zq8 zq8Var = (zq8) ye0Var;
            obj = b.i(new Pair("type", zq8Var.b), new Pair("additionalData", zq8Var.c));
        } else if (ye0Var instanceof ar8) {
            obj = g8e.z("type", ((ar8) ye0Var).b);
        } else if (ye0Var instanceof dr8) {
            MapBuilder mapBuilder2 = new MapBuilder();
            dr8 dr8Var = (dr8) ye0Var;
            mapBuilder2.put("loadingTime", Long.valueOf(dr8Var.x));
            Long l = dr8Var.c;
            if (l != null) {
            }
            Long l2 = dr8Var.w;
            if (l2 != null) {
            }
            Long l3 = dr8Var.b;
            if (l3 != null) {
                mapBuilder2.put("authTime", Long.valueOf(l3.longValue()));
            }
            obj = mapBuilder2.j();
        } else if (ye0Var instanceof sq8) {
            obj = gw00.e(new Pair("authTime", Long.valueOf(((sq8) ye0Var).b)));
        } else if (ye0Var instanceof tq8) {
            obj = gw00.e(new Pair("redirectToCarePageTime", Long.valueOf(((tq8) ye0Var).b)));
        } else if (ye0Var instanceof kr8) {
            obj = gw00.e(new Pair("webAppLoadedTime", Long.valueOf(((kr8) ye0Var).b)));
        } else if (ye0Var instanceof lr8) {
            obj = gw00.e(new Pair("loadingTime", Long.valueOf(((lr8) ye0Var).b)));
        } else if (ye0Var instanceof fr8) {
            obj = g8e.z("type", ((fr8) ye0Var).b);
        } else if (ye0Var instanceof er8) {
            obj = g8e.z("url", ((er8) ye0Var).b);
        } else if (ye0Var instanceof gr8) {
            gr8 gr8Var = (gr8) ye0Var;
            Pair pair = new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, gr8Var.b);
            String str = gr8Var.c;
            if (str == null) {
                str = "";
            }
            obj = b.i(pair, new Pair("error", str));
        } else if (ye0Var instanceof ir8) {
            ir8 ir8Var = (ir8) ye0Var;
            obj = b.i(new Pair("step", Integer.valueOf(ir8Var.b)), new Pair("type", ir8Var.c), new Pair("camera_type", ir8Var.w));
        } else {
            if (!(ye0Var instanceof mr8)) {
                w511.b();
                return;
            }
            obj = gw00.e(new Pair("webViewEventParams", ((mr8) ye0Var).c));
        }
        String str2 = ye0Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (obj != null) {
            linkedHashMap.putAll(obj);
        }
        this.a.a.o(str2, null, linkedHashMap);
    }
}
