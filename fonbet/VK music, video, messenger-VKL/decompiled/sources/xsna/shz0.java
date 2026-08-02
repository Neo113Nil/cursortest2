package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.czy0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class shz0 extends ohz0 implements czy0.a {
    @Override // xsna.czy0.a
    public final njz0 a(JSONObject jSONObject, jkz0 jkz0Var, u6z0 u6z0Var, xla xlaVar) {
        rjz0 rjz0Var = new rjz0();
        lwo0 lwo0Var = new lwo0(u6z0Var, jkz0Var);
        uez0 b = new uez0(u6z0Var.j).b("<mediationBanner>");
        ((ryy0) lwo0Var.c).getClass();
        g9y0 b2 = ryy0.b(jSONObject, "impressionId", b, "<no-banner-id>");
        udz0 udz0Var = u6z0Var.j;
        udz0Var.getClass();
        giy0 giy0Var = new giy0(udz0Var, b2);
        x1z0 x1z0Var = new x1z0(giy0Var, null, null, u6z0Var.k);
        lwo0Var.a(jSONObject, x1z0Var, xlaVar, b.a(giy0Var), null);
        rjz0Var.b.add(x1z0Var);
        return rjz0Var;
    }

    @Override // xsna.ohz0
    public final njz0 d(String str, jkz0 jkz0Var, njz0 njz0Var, u6z0 u6z0Var, s3z0.a aVar, s3z0 s3z0Var, ArrayList arrayList, xla xlaVar) {
        b2z0 b2z0Var;
        nl nlVar;
        JSONObject optJSONObject;
        rjz0 rjz0Var;
        JSONObject optJSONObject2;
        rjz0 rjz0Var2 = (rjz0) njz0Var;
        uez0 uez0Var = new uez0(u6z0Var.j);
        uez0Var.f();
        JSONObject b = ohz0.b(str, aVar, s3z0Var, arrayList, xlaVar, uez0Var);
        if (b == null) {
            xlaVar.b(iaz0.j);
            rjz0Var = null;
        } else {
            if (rjz0Var2 == null) {
                rjz0Var2 = new rjz0();
            }
            rjz0Var2.c = b.optLong("timestamp", 0L);
            JSONObject optJSONObject3 = b.optJSONObject(u6z0Var.h);
            if (optJSONObject3 == null) {
                if (u6z0Var.c && (optJSONObject2 = b.optJSONObject("mediation")) != null) {
                    wcy0 a = new czy0(this, jkz0Var, u6z0Var).a(optJSONObject2, xlaVar);
                    if (a != null) {
                        rjz0Var2.a = a;
                        rjz0Var = rjz0Var2;
                    }
                }
                xlaVar.b(iaz0.m);
                uez0Var.b(u6z0Var.h).d(3006, "Section-format is not found");
                rjz0Var = null;
            } else {
                JSONArray optJSONArray = optJSONObject3.optJSONArray("banners");
                uez0 b2 = uez0Var.b("banners");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    xlaVar.b(iaz0.r);
                    if (optJSONArray == null) {
                        b2.c(3006);
                    }
                } else {
                    lwo0 lwo0Var = new lwo0(u6z0Var, jkz0Var);
                    uez0 g = b2.g(0);
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(0);
                    if (optJSONObject4 != null) {
                        ((ryy0) lwo0Var.c).getClass();
                        g9y0 b3 = ryy0.b(optJSONObject4, "impressionId", g, "<no-banner-id0>");
                        udz0 udz0Var = u6z0Var.j;
                        udz0Var.getClass();
                        giy0 giy0Var = new giy0(udz0Var, b3);
                        ooy0 a2 = g.a(giy0Var);
                        JSONObject optJSONObject5 = b.optJSONObject("featureFlags");
                        if (optJSONObject5 != null) {
                            JSONObject optJSONObject6 = optJSONObject5.optJSONObject("statistics");
                            if (optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject(SignalingTransport.URL_TYPE_RETRY)) != null) {
                                long optLong = optJSONObject.optLong("delay");
                                int optInt = optJSONObject.optInt("count", 1);
                                if (optLong > 0) {
                                    nlVar = new nl(new g9z0(optLong, optInt), false);
                                    b2z0Var = ohz0.c(optJSONObject5, a2);
                                }
                            }
                            nlVar = null;
                            b2z0Var = ohz0.c(optJSONObject5, a2);
                        } else {
                            b2z0Var = null;
                            nlVar = null;
                        }
                        x1z0 x1z0Var = new x1z0(giy0Var, nlVar, b2z0Var, u6z0Var.k);
                        lwo0Var.a(optJSONObject4, x1z0Var, xlaVar, a2, nlVar);
                        rjz0Var2.b.add(x1z0Var);
                    } else {
                        g.a.a(0, 1, 3007, g.e(""), null);
                    }
                    if (rjz0Var2.b.size() <= 0) {
                        xlaVar.b(iaz0.i);
                        uez0Var.d(3008, "getBannersCount()==" + rjz0Var2.b.size());
                    }
                    rjz0Var = rjz0Var2;
                }
                rjz0Var = null;
            }
        }
        if (rjz0Var != null) {
            Iterator it = ((ArrayList) rjz0Var.b()).iterator();
            int i = 0;
            while (it.hasNext()) {
                x1z0 x1z0Var2 = (x1z0) it.next();
                int i2 = i + 1;
                ooy0 a3 = uez0Var.b("<banner>").g(i).a(x1z0Var2.T);
                x1z0Var2.a.h(a3.a("<stats>"));
                Iterator it2 = x1z0Var2.s().iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    ((a5z0) it2.next()).a.h(a3.a("<card>").f(i3).a("<stats>"));
                    i3++;
                }
                lgz0 lgz0Var = x1z0Var2.W;
                if (lgz0Var != null) {
                    lgz0Var.a.h(a3.a("<videoBanner>").a("<stats>"));
                }
                i = i2;
            }
        }
        return rjz0Var;
    }
}
