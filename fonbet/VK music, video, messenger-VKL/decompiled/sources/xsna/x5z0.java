package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.czy0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class x5z0 extends ohz0 implements czy0.a {
    @Override // xsna.czy0.a
    public final njz0 a(JSONObject jSONObject, jkz0 jkz0Var, u6z0 u6z0Var, xla xlaVar) {
        rjz0 rjz0Var = new rjz0();
        ryy0 ryy0Var = new ryy0(u6z0Var, jkz0Var);
        g9y0 b = ryy0.b(jSONObject, "impressionId", new uez0(u6z0Var.j).b("<mediationBanner>"), "<no-banner-id>");
        udz0 udz0Var = u6z0Var.j;
        udz0Var.getClass();
        x1z0 x1z0Var = new x1z0(new giy0(udz0Var, b), null, null, u6z0Var.k);
        ryy0Var.c(jSONObject, x1z0Var, ooy0.e);
        rjz0Var.b.add(x1z0Var);
        return rjz0Var;
    }

    @Override // xsna.ohz0
    public final njz0 d(String str, jkz0 jkz0Var, njz0 njz0Var, u6z0 u6z0Var, s3z0.a aVar, s3z0 s3z0Var, ArrayList arrayList, xla xlaVar) {
        JSONObject optJSONObject;
        wcy0 a;
        rjz0 rjz0Var = (rjz0) njz0Var;
        uez0 uez0Var = new uez0(u6z0Var.j);
        uez0Var.f();
        JSONObject b = ohz0.b(str, aVar, s3z0Var, arrayList, xlaVar, uez0Var);
        int i = 0;
        rjz0 rjz0Var2 = null;
        if (b == null) {
            xlaVar.b(iaz0.j);
        } else {
            if (rjz0Var == null) {
                rjz0Var = new rjz0();
            }
            JSONObject optJSONObject2 = b.optJSONObject(u6z0Var.h);
            if (optJSONObject2 != null) {
                JSONArray optJSONArray = optJSONObject2.optJSONArray("banners");
                uez0 b2 = uez0Var.b("banners");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    xlaVar.b(iaz0.r);
                    if (optJSONArray == null) {
                        b2.c(3006);
                    }
                } else {
                    ryy0 ryy0Var = new ryy0(u6z0Var, jkz0Var);
                    uez0 g = b2.g(0);
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(0);
                    if (optJSONObject3 != null) {
                        g9y0 b3 = ryy0.b(optJSONObject3, "impressionId", g, "<no-banner-id0>");
                        udz0 udz0Var = u6z0Var.j;
                        udz0Var.getClass();
                        giy0 giy0Var = new giy0(udz0Var, b3);
                        ooy0 a2 = g.a(giy0Var);
                        JSONObject optJSONObject4 = b.optJSONObject("featureFlags");
                        x1z0 x1z0Var = new x1z0(giy0Var, null, optJSONObject4 != null ? ohz0.c(optJSONObject4, a2) : null, u6z0Var.k);
                        ryy0Var.c(optJSONObject3, x1z0Var, a2);
                        rjz0Var.b.add(x1z0Var);
                    } else {
                        g.a.a(0, 1, 3007, g.e(""), null);
                    }
                    if (rjz0Var.b.size() <= 0) {
                        xlaVar.b(iaz0.i);
                        uez0Var.d(3008, "getBannersCount()==" + rjz0Var.b.size());
                    }
                    rjz0Var2 = rjz0Var;
                }
            } else if (!u6z0Var.c || (optJSONObject = b.optJSONObject("mediation")) == null || (a = new czy0(this, jkz0Var, u6z0Var).a(optJSONObject, xlaVar)) == null) {
                xlaVar.b(iaz0.m);
                uez0Var.b(u6z0Var.h).d(3006, "Section-format is not found");
            } else {
                rjz0Var.a = a;
                rjz0Var2 = rjz0Var;
            }
        }
        if (rjz0Var2 != null) {
            Iterator it = ((ArrayList) rjz0Var2.b()).iterator();
            while (it.hasNext()) {
                x1z0 x1z0Var2 = (x1z0) it.next();
                x1z0Var2.a.h(uez0Var.b("<banner>").g(i).a(x1z0Var2.T).a("<stats>"));
                i++;
            }
        }
        return rjz0Var2;
    }
}
