package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ncz0 extends ohz0 {
    public static void i(JSONObject jSONObject, zn40 zn40Var, pjz0 pjz0Var, l2z0 l2z0Var, o1z0 o1z0Var, jkz0 jkz0Var, xla xlaVar, uez0 uez0Var) {
        String str;
        JSONArray jSONArray;
        uez0 uez0Var2;
        int i;
        boolean v;
        String str2 = pjz0Var.c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str2);
        if (optJSONArray == null) {
            return;
        }
        uez0 b = uez0Var.b(str2);
        int i2 = jkz0Var.o;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = i2;
        int i4 = 0;
        while (i4 < optJSONArray.length()) {
            uez0 g = b.g(i4);
            JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
            if (optJSONObject == null) {
                g.a.a(0, 1, 3007, g.e(""), null);
                str = str2;
                jSONArray = optJSONArray;
            } else {
                String b2 = tgw.b(i4, "<no-banner-id", ">");
                ((ryy0) l2z0Var.c).getClass();
                g9y0 b3 = ryy0.b(optJSONObject, "impression_id", g, b2);
                udz0 udz0Var = ((u6z0) l2z0Var.b).j;
                udz0Var.getClass();
                giy0 giy0Var = new giy0(udz0Var, b3);
                ooy0 a = g.a(giy0Var);
                String optString = optJSONObject.optString("type");
                if ("additionalData".equals(optString)) {
                    jSONArray = optJSONArray;
                    jkz0 a2 = zn40Var.a(optJSONObject, xlaVar, a);
                    if (a2 != null) {
                        a2.h = str2;
                        a2.K = jkz0Var.K;
                        if (a2.p != -1) {
                            arrayList.add(a2);
                        } else {
                            arrayList2.add(a2);
                            if (!a2.v && !a2.u) {
                                jkz0Var.b.add(a2);
                                int i5 = jkz0Var.o;
                                if (i5 >= 0) {
                                    a2.e(i5);
                                } else {
                                    a2.e(pjz0Var.d.size());
                                }
                            }
                            pjz0Var.f(a2);
                        }
                    }
                    str = str2;
                } else {
                    str = str2;
                    jSONArray = optJSONArray;
                    if ("video-motion".equals(optString)) {
                        bsz0 bsz0Var = new bsz0(a.a, null);
                        jkz0 jkz0Var2 = (jkz0) o1z0Var.a;
                        if (o1z0Var.m(optJSONObject, bsz0Var, a)) {
                            v = true;
                            uez0Var2 = b;
                            i = i4;
                        } else {
                            float f = bsz0Var.D;
                            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                a.h(3007, "dur=" + f);
                                uez0Var2 = b;
                                i = i4;
                            } else {
                                uez0Var2 = b;
                                bsz0Var.a0 = optJSONObject.optString("closeActionText", "Close");
                                bsz0Var.b0 = optJSONObject.optString("replayActionText", bsz0Var.b0);
                                bsz0Var.c0 = optJSONObject.optString("closeDelayActionText", bsz0Var.c0);
                                Boolean bool = jkz0Var2.G;
                                bsz0Var.g0 = bool != null ? bool.booleanValue() : optJSONObject.optBoolean("automute", bsz0Var.g0);
                                bsz0Var.k0 = optJSONObject.optBoolean("showPlayerControls", bsz0Var.k0);
                                Boolean bool2 = jkz0Var2.H;
                                bsz0Var.h0 = bool2 != null ? bool2.booleanValue() : optJSONObject.optBoolean("autoplay", bsz0Var.h0);
                                bsz0Var.i0 = optJSONObject.optBoolean("hasCtaButton", bsz0Var.i0);
                                o1z0Var.l(optJSONObject, bsz0Var);
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject("shoppable");
                                if (optJSONObject2 != null) {
                                    bsz0Var.W = o1z0Var.r(optJSONObject2, bsz0Var);
                                }
                                JSONObject optJSONObject3 = optJSONObject.optJSONObject("shoppableAdsData");
                                if (optJSONObject3 != null) {
                                    i = i4;
                                    bsz0Var.X = new mcc0((u6z0) o1z0Var.b, jkz0Var2).h(optJSONObject3);
                                } else {
                                    i = i4;
                                }
                                o1z0Var.o(optJSONObject, bsz0Var);
                                try {
                                    v = o1z0Var.v(optJSONObject.getJSONObject("videoMotionData"), bsz0Var, a.a("videoMotionData"));
                                } catch (JSONException e) {
                                    a.h(3001, "cVMPpB: exception=" + gu8.b(e));
                                    e.printStackTrace();
                                }
                            }
                            v = false;
                        }
                        if (v) {
                            float f2 = jkz0Var.s;
                            if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                bsz0Var.s0 = f2;
                            }
                            float f3 = jkz0Var.t;
                            if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                bsz0Var.t0 = f3;
                            }
                            if (i3 >= 0) {
                                pjz0Var.d(bsz0Var, i3);
                                i3++;
                            } else {
                                pjz0Var.c(bsz0Var);
                            }
                        }
                    } else {
                        uez0Var2 = b;
                        i = i4;
                        lgz0 lgz0Var = new lgz0(giy0Var, null);
                        if (l2z0Var.t(optJSONObject, lgz0Var, a)) {
                            float f4 = jkz0Var.s;
                            if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                lgz0Var.s0 = f4;
                            }
                            float f5 = jkz0Var.t;
                            if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                lgz0Var.t0 = f5;
                            }
                            if (i3 >= 0) {
                                pjz0Var.d(lgz0Var, i3);
                                i3++;
                            } else {
                                pjz0Var.c(lgz0Var);
                            }
                        }
                    }
                    i4 = i + 1;
                    b = uez0Var2;
                    optJSONArray = jSONArray;
                    str2 = str;
                }
            }
            uez0Var2 = b;
            i = i4;
            i4 = i + 1;
            b = uez0Var2;
            optJSONArray = jSONArray;
            str2 = str;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            jkz0 jkz0Var3 = (jkz0) obj;
            int size2 = arrayList2.size();
            int i7 = 0;
            while (true) {
                if (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    jkz0 jkz0Var4 = (jkz0) obj2;
                    if (jkz0Var3.p == jkz0Var4.n) {
                        jkz0Var4.g = jkz0Var3;
                        jkz0Var3.e(jkz0Var4.o);
                        break;
                    }
                }
            }
        }
    }

    @Override // xsna.ohz0
    public final njz0 d(String str, jkz0 jkz0Var, njz0 njz0Var, u6z0 u6z0Var, s3z0.a aVar, s3z0 s3z0Var, ArrayList arrayList, xla xlaVar) {
        jkz0 jkz0Var2 = jkz0Var;
        rez0 rez0Var = (rez0) njz0Var;
        uez0 uez0Var = new uez0(u6z0Var.j);
        uez0Var.f();
        int i = 0;
        if (!ohz0.h(str)) {
            JSONObject b = ohz0.b(str, aVar, s3z0Var, arrayList, xlaVar, uez0Var);
            if (b == null) {
                xlaVar.b(iaz0.j);
                return rez0Var;
            }
            uez0 b2 = uez0Var.b(u6z0Var.h);
            JSONObject optJSONObject = b.optJSONObject(u6z0Var.h);
            if (optJSONObject == null) {
                xlaVar.b(iaz0.m);
                b2.d(3006, "Section-format is not found");
                return rez0Var;
            }
            if (rez0Var == null) {
                rez0Var = new rez0();
            }
            rez0 rez0Var2 = rez0Var;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("settings");
            if (optJSONObject2 != null) {
                ArrayList c = rez0Var2.c();
                int size = c.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = c.get(i2);
                    i2++;
                    pjz0 pjz0Var = (pjz0) obj;
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(pjz0Var.c);
                    if (optJSONObject3 != null) {
                        pjz0Var.h = optJSONObject3.optInt("connectionTimeout", pjz0Var.h);
                        int optInt = optJSONObject3.optInt("maxBannersShow", pjz0Var.i);
                        if (optInt == 0) {
                            optInt = -1;
                        }
                        pjz0Var.i = optInt;
                    }
                }
            }
            zn40 zn40Var = new zn40(u6z0Var, jkz0Var2);
            uez0 b3 = b2.b("sections");
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("sections");
            if (optJSONObject4 == null) {
                xlaVar.b(iaz0.i);
                b3.c(3006);
                return rez0Var2;
            }
            String str2 = jkz0Var2.h;
            if (str2 != null) {
                pjz0 b4 = rez0Var2.b(str2);
                if (b4 != null) {
                    i(optJSONObject4, zn40Var, b4, new l2z0(jkz0Var2, u6z0Var, 2), new o1z0(jkz0Var2, u6z0Var, 1), jkz0Var2, xlaVar, b3);
                    return rez0Var2;
                }
            } else {
                ArrayList c2 = rez0Var2.c();
                int size2 = c2.size();
                while (i < size2) {
                    i(optJSONObject4, zn40Var, (pjz0) c2.get(i), new l2z0(jkz0Var2, u6z0Var, 2), new o1z0(jkz0Var2, u6z0Var, 1), jkz0Var2, xlaVar, b3);
                    jkz0Var2 = jkz0Var;
                    i++;
                }
            }
            return rez0Var2;
        }
        g7z0 g7z0Var = new g7z0(u6z0Var, jkz0Var2);
        ArrayList arrayList2 = g7z0Var.g;
        g7z0Var.g(str);
        String str3 = jkz0Var2.h;
        if (str3 == null) {
            str3 = "preroll";
        }
        if (rez0Var == null) {
            rez0Var = new rez0();
        }
        pjz0 b5 = rez0Var.b(str3);
        if (b5 != null) {
            if (arrayList2.isEmpty()) {
                xlaVar.b(iaz0.l);
                jkz0 jkz0Var3 = g7z0Var.l;
                if (jkz0Var3 != null) {
                    jkz0Var3.h = b5.c;
                    int i3 = jkz0Var2.o;
                    if (i3 >= 0) {
                        jkz0Var3.e(i3);
                    } else {
                        jkz0Var3.e(b5.d.size());
                    }
                    b5.f(jkz0Var3);
                }
            } else {
                int i4 = jkz0Var2.o;
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    lgz0 lgz0Var = (lgz0) obj2;
                    Boolean bool = jkz0Var2.x;
                    if (bool != null) {
                        lgz0Var.l0 = bool.booleanValue();
                    }
                    Boolean bool2 = jkz0Var2.y;
                    if (bool2 != null) {
                        lgz0Var.p0 = bool2.booleanValue();
                    }
                    Boolean bool3 = jkz0Var2.C;
                    if (bool3 != null) {
                        lgz0Var.x = bool3.booleanValue();
                    }
                    Boolean bool4 = jkz0Var2.D;
                    if (bool4 != null) {
                        lgz0Var.w = bool4.booleanValue();
                    }
                    Boolean bool5 = jkz0Var2.E;
                    if (bool5 != null) {
                        lgz0Var.j0 = bool5.booleanValue();
                    }
                    float f = jkz0Var2.w;
                    if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        lgz0Var.q0 = f;
                    }
                    lgz0Var.a0 = "Close";
                    lgz0Var.s0 = jkz0Var2.s;
                    lgz0Var.t0 = jkz0Var2.t;
                    if (i4 >= 0) {
                        b5.d(lgz0Var, i4);
                        i4++;
                    } else {
                        b5.c(lgz0Var);
                    }
                }
            }
        }
        return rez0Var;
    }
}
