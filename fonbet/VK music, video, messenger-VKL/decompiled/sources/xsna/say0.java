package xsna;

import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class say0 extends ohz0 {
    public static void i(JSONObject jSONObject, zn40 zn40Var, pjz0 pjz0Var, v9z0 v9z0Var, jkz0 jkz0Var, xla xlaVar, uez0 uez0Var) {
        String str;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        dbz0 dbz0Var;
        JSONArray jSONArray3;
        int i;
        v9z0 v9z0Var2 = v9z0Var;
        String str2 = pjz0Var.c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str2);
        if (optJSONArray == null) {
            return;
        }
        uez0 b = uez0Var.b(str2);
        int i2 = jkz0Var.o;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < optJSONArray.length()) {
            uez0 g = b.g(i3);
            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
            if (optJSONObject == null) {
                g.a.a(0, 1, 3007, g.e(""), null);
            } else {
                String b2 = tgw.b(i3, "<no-banner-id", ">");
                ((ryy0) v9z0Var2.c).getClass();
                g9y0 b3 = ryy0.b(optJSONObject, "impression_id", g, b2);
                udz0 udz0Var = ((u6z0) v9z0Var2.b).j;
                udz0Var.getClass();
                giy0 giy0Var = new giy0(udz0Var, b3);
                ooy0 a = g.a(giy0Var);
                if ("additionalData".equals(optJSONObject.optString("type"))) {
                    jkz0 a2 = zn40Var.a(optJSONObject, xlaVar, a);
                    if (a2 != null) {
                        a2.h = str2;
                        if (a2.p != -1) {
                            arrayList.add(a2);
                        } else {
                            arrayList2.add(a2);
                            if (!a2.v && !a2.u) {
                                jkz0Var.b.add(a2);
                                int i4 = jkz0Var.o;
                                if (i4 >= 0) {
                                    a2.e(i4);
                                } else {
                                    a2.e(pjz0Var.d.size());
                                }
                            }
                            pjz0Var.f(a2);
                        }
                    }
                } else {
                    str = str2;
                    lgz0 lgz0Var = new lgz0(giy0Var, null);
                    if (v9z0Var2.m(optJSONObject, lgz0Var, a)) {
                        jSONArray = optJSONArray;
                    } else {
                        jSONArray = optJSONArray;
                        if (((float) optJSONObject.optDouble("duration", ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            lgz0Var.h0 = optJSONObject.optBoolean("autoplay", lgz0Var.h0);
                            lgz0Var.i0 = optJSONObject.optBoolean("hasCtaButton", lgz0Var.i0);
                            lgz0Var.Y = optJSONObject.optString("adText", lgz0Var.Y);
                            v9z0Var2.l(optJSONObject, lgz0Var);
                            jkz0 jkz0Var2 = (jkz0) v9z0Var2.a;
                            Boolean bool = jkz0Var2.z;
                            lgz0Var.m0 = bool != null ? bool.booleanValue() : optJSONObject.optBoolean("allowSeek", lgz0Var.m0);
                            Boolean bool2 = jkz0Var2.A;
                            lgz0Var.n0 = bool2 != null ? bool2.booleanValue() : optJSONObject.optBoolean("allowSkip", lgz0Var.n0);
                            Boolean bool3 = jkz0Var2.B;
                            lgz0Var.o0 = bool3 != null ? bool3.booleanValue() : optJSONObject.optBoolean("allowTrackChange", lgz0Var.o0);
                            v9z0Var2.o(optJSONObject, lgz0Var);
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("shareButtons");
                            if (optJSONArray2 != null) {
                                int length = optJSONArray2.length();
                                int i5 = 0;
                                while (i5 < length) {
                                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i5);
                                    if (optJSONObject2 == null) {
                                        jSONArray3 = optJSONArray2;
                                        i = length;
                                    } else {
                                        jSONArray3 = optJSONArray2;
                                        fvr fvrVar = new fvr();
                                        i = length;
                                        optJSONObject2.optString("name");
                                        optJSONObject2.optString("url");
                                        optJSONObject2.optString("imageUrl");
                                        lgz0Var.V.add(fvrVar);
                                    }
                                    i5++;
                                    optJSONArray2 = jSONArray3;
                                    length = i;
                                }
                            }
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("mediafiles");
                            if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                                gu8.c(null, "AudioBannerParser: Mediafiles array is empty");
                            } else {
                                int i6 = 0;
                                while (i6 < optJSONArray3.length()) {
                                    JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i6);
                                    if (optJSONObject3 != null) {
                                        String optString = optJSONObject3.optString("src");
                                        if (TextUtils.isEmpty(optString)) {
                                            jSONArray2 = optJSONArray3;
                                            dbz0Var = null;
                                        } else {
                                            jSONArray2 = optJSONArray3;
                                            dbz0Var = new dbz0(optString, oc.k(optJSONObject3));
                                            optJSONObject3.optInt(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
                                        }
                                        if (dbz0Var != null) {
                                            lgz0Var.v0 = dbz0Var;
                                        }
                                    } else {
                                        jSONArray2 = optJSONArray3;
                                    }
                                    i6++;
                                    optJSONArray3 = jSONArray2;
                                }
                            }
                        }
                        i3++;
                        v9z0Var2 = v9z0Var;
                        optJSONArray = jSONArray;
                        str2 = str;
                    }
                    if (jkz0Var.v) {
                        lgz0Var.s0 = jkz0Var.s;
                        lgz0Var.t0 = jkz0Var.t;
                    }
                    if (i2 >= 0) {
                        pjz0Var.d(lgz0Var, i2);
                        i2++;
                    } else {
                        pjz0Var.c(lgz0Var);
                    }
                    i3++;
                    v9z0Var2 = v9z0Var;
                    optJSONArray = jSONArray;
                    str2 = str;
                }
            }
            str = str2;
            jSONArray = optJSONArray;
            i3++;
            v9z0Var2 = v9z0Var;
            optJSONArray = jSONArray;
            str2 = str;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            jkz0 jkz0Var3 = (jkz0) obj;
            int size2 = arrayList2.size();
            int i8 = 0;
            while (true) {
                if (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
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
                    i(optJSONObject4, zn40Var, b4, new v9z0(jkz0Var2, u6z0Var, 1), jkz0Var2, xlaVar, b3);
                    return rez0Var2;
                }
            } else {
                ArrayList c2 = rez0Var2.c();
                int size2 = c2.size();
                while (i < size2) {
                    i(optJSONObject4, zn40Var, (pjz0) c2.get(i), new v9z0(jkz0Var2, u6z0Var, 1), jkz0Var2, xlaVar, b3);
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
                    float f = jkz0Var2.w;
                    if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        lgz0Var.q0 = f;
                    }
                    wty0 wty0Var = jkz0Var2.K;
                    if (wty0Var != null) {
                        lgz0Var.L = wty0Var;
                    }
                    String str4 = jkz0Var2.l;
                    if (str4 != null) {
                        lgz0Var.r = str4;
                    }
                    Boolean bool = jkz0Var2.x;
                    if (bool != null) {
                        lgz0Var.l0 = bool.booleanValue();
                    }
                    Boolean bool2 = jkz0Var2.y;
                    if (bool2 != null) {
                        lgz0Var.p0 = bool2.booleanValue();
                    }
                    Boolean bool3 = jkz0Var2.z;
                    if (bool3 != null) {
                        lgz0Var.m0 = bool3.booleanValue();
                    }
                    Boolean bool4 = jkz0Var2.A;
                    if (bool4 != null) {
                        lgz0Var.n0 = bool4.booleanValue();
                    }
                    Boolean bool5 = jkz0Var2.B;
                    if (bool5 != null) {
                        lgz0Var.o0 = bool5.booleanValue();
                    }
                    Boolean bool6 = jkz0Var2.C;
                    if (bool6 != null) {
                        lgz0Var.x = bool6.booleanValue();
                    }
                    Boolean bool7 = jkz0Var2.D;
                    if (bool7 != null) {
                        lgz0Var.w = bool7.booleanValue();
                    }
                    Boolean bool8 = jkz0Var2.E;
                    if (bool8 != null) {
                        lgz0Var.j0 = bool8.booleanValue();
                    }
                    lgz0Var.a0 = "Close";
                    float f2 = jkz0Var2.s;
                    if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        lgz0Var.s0 = f2;
                    }
                    float f3 = jkz0Var2.t;
                    if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        lgz0Var.t0 = f3;
                    }
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
