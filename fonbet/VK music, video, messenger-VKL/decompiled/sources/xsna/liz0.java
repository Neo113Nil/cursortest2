package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.czy0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class liz0 extends ohz0 implements czy0.a {
    public String a;

    @Override // xsna.czy0.a
    public final njz0 a(JSONObject jSONObject, jkz0 jkz0Var, u6z0 u6z0Var, xla xlaVar) {
        hkz0 d = new p9e(u6z0Var, jkz0Var).d(jSONObject, this.a, xlaVar, new uez0(u6z0Var.j));
        if (d == null) {
            xlaVar.b(iaz0.r);
            return null;
        }
        ikz0 ikz0Var = new ikz0();
        ikz0Var.b.add(d);
        return ikz0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [xsna.p0z0, xsna.xey0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [xsna.hkz0] */
    /* JADX WARN: Type inference failed for: r3v19, types: [xsna.hkz0, xsna.nxy0, xsna.xey0] */
    @Override // xsna.ohz0
    public final njz0 d(String str, jkz0 jkz0Var, njz0 njz0Var, u6z0 u6z0Var, s3z0.a aVar, s3z0 s3z0Var, ArrayList arrayList, xla xlaVar) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        wcy0 a;
        ?? r3;
        ikz0 ikz0Var = (ikz0) njz0Var;
        int i = 0;
        if (!ohz0.h(str)) {
            uez0 uez0Var = new uez0(u6z0Var.j);
            JSONObject b = ohz0.b(str, aVar, s3z0Var, arrayList, xlaVar, uez0Var);
            if (b == null) {
                xlaVar.b(iaz0.j);
                return ikz0Var;
            }
            if (ikz0Var == null) {
                ikz0Var = new ikz0();
            }
            this.a = b.optString("mraid.js");
            String str2 = u6z0Var.h;
            if ("fullscreen".equals(str2) || "rewarded".equals(str2)) {
                optJSONObject = b.optJSONObject("fullscreen");
                if (optJSONObject == null) {
                    optJSONObject = b.optJSONObject("rewarded");
                }
            } else {
                optJSONObject = b.optJSONObject(str2);
            }
            JSONObject optJSONObject3 = b.optJSONObject("settings");
            if (optJSONObject3 == null && optJSONObject != null) {
                optJSONObject3 = optJSONObject.optJSONObject("settings");
            }
            if (optJSONObject3 != null && optJSONObject3.has(TtmlNode.TAG_STYLE)) {
                int optInt = optJSONObject3.optInt(TtmlNode.TAG_STYLE, 0);
                if (optInt == 1 || optInt == 2 || optInt == 3) {
                    jkz0Var.q = optInt;
                } else {
                    jkz0Var.q = 0;
                }
            }
            if (optJSONObject == null) {
                if (u6z0Var.c && (optJSONObject2 = b.optJSONObject("mediation")) != null && (a = new czy0(this, jkz0Var, u6z0Var).a(optJSONObject2, xlaVar)) != null) {
                    ikz0Var.a = a;
                }
                xlaVar.b(iaz0.m);
                return ikz0Var;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("banners");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                xlaVar.b(iaz0.r);
                return ikz0Var;
            }
            while (i < optJSONArray.length()) {
                JSONObject optJSONObject4 = optJSONArray.optJSONObject(i);
                if (optJSONObject4 != null) {
                    if ("additionalData".equals(optJSONObject4.optString("type", ""))) {
                        jkz0 a2 = new zn40(u6z0Var, jkz0Var).a(optJSONObject4, xlaVar, ooy0.e);
                        if (a2 != null) {
                            jkz0Var.b.add(a2);
                        }
                    } else {
                        hkz0 d = new p9e(u6z0Var, jkz0Var).d(optJSONObject4, this.a, xlaVar, uez0Var);
                        if (d != null) {
                            ikz0Var.b.add(d);
                        }
                    }
                }
                i++;
            }
            return ikz0Var;
        }
        g7z0 g7z0Var = new g7z0(u6z0Var, jkz0Var);
        g7z0Var.g(str);
        ArrayList arrayList2 = g7z0Var.g;
        if (arrayList2.isEmpty()) {
            xlaVar.b(iaz0.l);
            return ikz0Var;
        }
        if (ikz0Var == null) {
            ikz0Var = new ikz0();
        }
        lgz0 lgz0Var = (lgz0) arrayList2.get(0);
        tez0 tez0Var = new tez0(giy0.d);
        e5z0 e5z0Var = tez0Var.a;
        String n = lgz0Var.n();
        e5z0 e5z0Var2 = lgz0Var.a;
        tez0Var.d = n;
        tez0Var.c0 = lgz0Var;
        tez0Var.i0 = jkz0Var.q;
        tez0Var.J = lgz0Var.J;
        tez0Var.K = lgz0Var.l();
        tez0Var.L = jkz0Var.K;
        int i2 = jkz0Var.r;
        if (i2 >= 0) {
            tez0Var.v = new k6z0(i2);
        }
        Boolean bool = jkz0Var.x;
        if (bool != null) {
            lgz0Var.l0 = bool.booleanValue();
        }
        Boolean bool2 = jkz0Var.y;
        if (bool2 != null) {
            lgz0Var.p0 = bool2.booleanValue();
        }
        Boolean bool3 = jkz0Var.E;
        if (bool3 != null) {
            lgz0Var.j0 = bool3.booleanValue();
        }
        Boolean bool4 = jkz0Var.G;
        if (bool4 != null) {
            lgz0Var.g0 = bool4.booleanValue();
        }
        Boolean bool5 = jkz0Var.C;
        if (bool5 != null) {
            tez0Var.x = bool5.booleanValue();
        }
        Boolean bool6 = jkz0Var.D;
        if (bool6 != null) {
            tez0Var.w = bool6.booleanValue();
        }
        float f = jkz0Var.w;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            lgz0Var.q0 = f;
        }
        e5z0Var.e(e5z0Var2.j("click").c);
        e5z0Var.e(e5z0Var2.j("ctaClick").c);
        e5z0Var.e(e5z0Var2.j("urlResolved").c);
        e5z0Var.e(e5z0Var2.j("webviewShown").c);
        e5z0Var.e(e5z0Var2.j("webviewClosed").c);
        e5z0Var.e(e5z0Var2.j("pageLoaded").c);
        e5z0Var.e(e5z0Var2.j("pageLoadFailed").c);
        ikz0Var.b.add(tez0Var);
        if (tez0Var.M == null) {
            tez0Var.M = lgz0Var.M;
        }
        ArrayList arrayList3 = new ArrayList(lgz0Var.U);
        int size = arrayList3.size();
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList3.get(i);
            i++;
            n4z0 n4z0Var = (n4z0) obj;
            String str3 = n4z0Var.a0;
            e5z0 e5z0Var3 = n4z0Var.a;
            giy0 giy0Var = n4z0Var.T;
            if (str3 != null) {
                r3 = new nxy0(giy0Var);
                r3.F = n4z0Var.F;
                r3.a0 = n4z0Var.a0;
                r3.a.g(e5z0Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                r3.J = n4z0Var.J;
            } else if (n4z0Var.Y != null) {
                r3 = new p0z0(giy0Var);
                r3.F = n4z0Var.F;
                String str4 = n4z0Var.Y;
                if (str4 != null) {
                    r3.a0.add(kiw.b(n4z0Var.B, n4z0Var.C, str4));
                    r3.a.g(e5z0Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    r3.J = n4z0Var.J;
                }
            } else {
                r3 = 0;
            }
            if (r3 != 0) {
                tez0Var.d0 = r3;
                break;
            }
        }
        return ikz0Var;
    }
}
