package xsna;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.ocz0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class rdz0 implements bjx {
    public static rdz0 c() {
        return new rdz0();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03fc A[SYNTHETIC] */
    @Override // xsna.bjx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p5z0 a(String str, String str2, Map map) {
        JSONArray optJSONArray;
        ArrayList arrayList;
        int i;
        kiw b;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject;
        ryy0 ryy0Var;
        ooy0 ooy0Var;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        ArrayList arrayList2;
        njw njwVar;
        blk blkVar;
        njw njwVar2;
        JSONArray jSONArray;
        String str6;
        ArrayList arrayList3;
        JSONArray optJSONArray2;
        ooy0 ooy0Var2;
        String str7;
        JSONObject optJSONObject3;
        String str8;
        ooy0 ooy0Var3;
        ocz0.d dVar;
        JSONObject optJSONObject4;
        ocz0.b bVar;
        kiw kiwVar = null;
        jkz0 jkz0Var = new jkz0("", null);
        int i2 = 0;
        u6z0 u6z0Var = new u6z0(0, "nativeads");
        if (str2 != null) {
            u6z0Var.i = str2;
            u6z0Var.j.h = str2;
        }
        if (map != null) {
            for (String str9 : map.keySet()) {
                u6z0Var.a.g(str9, (String) map.get(str9));
            }
        }
        u6z0Var.b(new udz0(UUID.randomUUID().toString(), UUID.randomUUID().toString(), -1, 4, 1, v5z0.a));
        uez0 uez0Var = new uez0(u6z0Var.j);
        xla xlaVar = new xla();
        s3z0.a aVar = new s3z0.a(u6z0Var.g);
        s3z0 a = aVar.a();
        uez0Var.f();
        JSONObject b2 = ohz0.b(str, aVar, a, null, xlaVar, uez0Var);
        if (b2 == null) {
            xlaVar.b(iaz0.j);
            throw new JSONException("Banner json is empty");
        }
        JSONObject optJSONObject5 = b2.optJSONObject("featureFlags");
        JSONObject optJSONObject6 = b2.optJSONObject(u6z0Var.h);
        if (optJSONObject6 == null) {
            xlaVar.b(iaz0.j);
            throw new JSONException("Json doesn't have a section");
        }
        JSONArray optJSONArray3 = optJSONObject6.optJSONArray("banners");
        if (optJSONArray3 == null) {
            xlaVar.b(iaz0.j);
            throw new JSONException("Json doesn't have banners");
        }
        if (optJSONArray3.length() == 0) {
            xlaVar.b(iaz0.j);
            throw new JSONException("Json contains empty banner list");
        }
        JSONObject jSONObject2 = optJSONArray3.getJSONObject(0);
        ryy0 ryy0Var2 = new ryy0(u6z0Var, jkz0Var);
        g9y0 b3 = ryy0.b(jSONObject2, "impressionId", uez0Var, "<no-banner-id>");
        udz0 udz0Var = u6z0Var.j;
        udz0Var.getClass();
        giy0 giy0Var = new giy0(udz0Var, b3);
        ooy0 a2 = uez0Var.a(giy0Var);
        ocz0 ocz0Var = new ocz0(u6z0Var, giy0Var, optJSONObject5 == null ? null : ohz0.c(optJSONObject5, a2));
        ryy0Var2.c(jSONObject2, ocz0Var, a2);
        JSONObject optJSONObject7 = jSONObject2.optJSONObject("image");
        String str10 = "height";
        String str11 = "width";
        if (optJSONObject7 == null || (optJSONArray = optJSONObject7.optJSONArray("files")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            while (i2 < optJSONArray.length()) {
                JSONObject optJSONObject8 = optJSONArray.optJSONObject(i2);
                if (optJSONObject8 == null) {
                    b = kiwVar;
                    i = i2;
                } else {
                    String optString = optJSONObject8.optString("url");
                    i = i2;
                    int optInt = optJSONObject8.optInt("width");
                    int optInt2 = optJSONObject8.optInt("height");
                    b = (TextUtils.isEmpty(optString) || optInt <= 0 || optInt2 <= 0) ? null : kiw.b(optInt, optInt2, optString);
                }
                if (b != null) {
                    arrayList.add(b);
                }
                i2 = i + 1;
                kiwVar = null;
            }
        }
        ocz0Var.Y = arrayList;
        long optLong = jSONObject2.optLong("impressionID", -1L);
        if (optLong != -1) {
            ocz0Var.m = optLong;
        } else {
            a2.a("impressionID").g(3006);
        }
        if (jSONObject2.optString(X3.i.m).isEmpty()) {
            a2.a(X3.i.m).g(3006);
        }
        if (!jSONObject2.has(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) || (optJSONObject4 = jSONObject2.optJSONObject(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) == null) {
            str3 = "url";
            str4 = "";
        } else {
            ooy0 i3 = a2.a(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).i();
            str4 = "";
            String optString2 = optJSONObject4.optString("type");
            if ("html".equals(optString2)) {
                str3 = "url";
                if (TextUtils.isEmpty(ryy0.a(optJSONObject4, xlaVar, i3))) {
                    i3.c(3007, "unable to decode src/source property");
                } else {
                    bVar = new ocz0.b();
                    bVar.F = ocz0Var.F;
                    bVar.J = ocz0Var.J;
                    bVar.I = ocz0Var.I;
                    bVar.G = ocz0Var.G;
                    bVar.H = ocz0Var.H;
                    bVar.p = ocz0Var.p;
                    bVar.x = ocz0Var.x;
                    bVar.w = ocz0Var.w;
                    ryy0Var2.c(optJSONObject4, bVar, i3);
                    ocz0Var.V = bVar;
                }
            } else {
                str3 = "url";
                gu8.c(null, "InternalNativeAdBannerParser: InternalNativeAdContent banner has type " + optString2);
                i3.a("type").h(3007, optString2);
            }
            bVar = null;
            ocz0Var.V = bVar;
        }
        if (jSONObject2.has("video")) {
            JSONObject optJSONObject9 = jSONObject2.optJSONObject("video");
            ooy0 a3 = a2.a("video");
            if (optJSONObject9 == null) {
                str5 = "type";
                dVar = null;
            } else {
                String optString3 = optJSONObject9.optString("evMovieId");
                String optString4 = optJSONObject9.optString("previewLink");
                int optInt3 = optJSONObject9.optInt("previewWidth");
                int optInt4 = optJSONObject9.optInt("previewHeight");
                JSONArray optJSONArray4 = optJSONObject9.optJSONArray("mediafiles");
                ArrayList arrayList4 = new ArrayList();
                if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                    ooy0Var3 = a3;
                    str5 = "type";
                } else {
                    ooy0Var3 = a3;
                    str5 = "type";
                    int i4 = 0;
                    while (i4 < optJSONArray4.length()) {
                        JSONObject optJSONObject10 = optJSONArray4.optJSONObject(i4);
                        int i5 = i4;
                        String optString5 = optJSONObject10.optString("src");
                        JSONArray jSONArray2 = optJSONArray4;
                        int optInt5 = optJSONObject10.optInt(str11);
                        String str12 = str11;
                        int optInt6 = optJSONObject10.optInt(str10);
                        String str13 = str10;
                        optJSONObject10.optInt(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
                        String optString6 = optJSONObject10.optString("format");
                        if (!optString5.isEmpty()) {
                            arrayList4.add(new ocz0.e(optString5, optInt5, optInt6, optString6));
                        }
                        i4 = i5 + 1;
                        optJSONArray4 = jSONArray2;
                        str11 = str12;
                        str10 = str13;
                    }
                }
                dVar = new ocz0.d(optString3, optString4, optInt3, optInt4, arrayList4);
                ryy0 ryy0Var3 = new ryy0(u6z0Var, jkz0Var);
                ryy0Var3.a.b = 2;
                ryy0Var3.c(optJSONObject9, dVar, ooy0Var3.i());
                e5z0 e5z0Var = dVar.a;
                if (!e5z0Var.p()) {
                    e5z0Var.k(ocz0Var.a, dVar.D);
                }
            }
            ocz0Var.X = dVar;
        } else {
            str5 = "type";
        }
        if (jSONObject2.has("html") && (optJSONObject3 = jSONObject2.optJSONObject("html")) != null) {
            ooy0 i6 = a2.a("html").i();
            String a4 = ryy0.a(optJSONObject3, xlaVar, i6);
            if (TextUtils.isEmpty(a4)) {
                i6.h(3007, "unable to decode src/source property");
                a4 = str4;
            }
            String str14 = str3;
            if (optJSONObject3.has(str14)) {
                str8 = optJSONObject3.optString(str14, str4);
                if (TextUtils.isEmpty(str8)) {
                    i6.a(str14).g(3007);
                }
                ocz0.c cVar = new ocz0.c(a4, str8);
                ryy0Var2.c(optJSONObject3, cVar, i6);
                ocz0Var.W = cVar;
            } else {
                i6.a(str14).g(3006);
            }
            str8 = null;
            ocz0.c cVar2 = new ocz0.c(a4, str8);
            ryy0Var2.c(optJSONObject3, cVar2, i6);
            ocz0Var.W = cVar2;
        }
        if (jSONObject2.has("cards") && (optJSONArray2 = jSONObject2.optJSONArray("cards")) != null) {
            ooy0 i7 = a2.a("cards").i();
            ArrayList arrayList5 = new ArrayList();
            int length = optJSONArray2.length();
            int i8 = 0;
            while (i8 < length) {
                JSONObject optJSONObject11 = optJSONArray2.optJSONObject(i8);
                ooy0 f = i7.f(i8);
                if (optJSONObject11 != null) {
                    ocz0.a aVar2 = new ocz0.a();
                    aVar2.d = ocz0Var.d;
                    aVar2.p = ocz0Var.p;
                    aVar2.G = ocz0Var.G;
                    aVar2.H = ocz0Var.H;
                    aVar2.x = ocz0Var.x;
                    aVar2.w = ocz0Var.w;
                    aVar2.I = ocz0Var.I;
                    aVar2.v = ocz0Var.v;
                    aVar2.j = ocz0Var.j;
                    aVar2.k = ocz0Var.k;
                    aVar2.o = ocz0Var.o;
                    aVar2.l = ocz0Var.l;
                    aVar2.n = ocz0Var.n;
                    ryy0Var2.c(optJSONObject11, aVar2, f);
                    if (TextUtils.isEmpty(aVar2.J)) {
                        f.c(3008, "required trackingLink is empty");
                    } else if (aVar2.t == null) {
                        f.c(3008, "required image is empty");
                    } else {
                        String str15 = ocz0Var.F + BundleUtil.UNDERLINE_TAG + i8;
                        String optString7 = optJSONObject11.optString("discount");
                        String optString8 = optJSONObject11.optString("price");
                        String optString9 = optJSONObject11.optString("oldPrice");
                        String optString10 = optJSONObject11.optString(InAppPurchaseMetaData.KEY_CURRENCY);
                        ooy0Var2 = i7;
                        String optString11 = optJSONObject11.optString("newPrice");
                        aVar2.U = str15;
                        aVar2.V = optString7;
                        aVar2.W = optString8;
                        aVar2.X = optString9;
                        aVar2.Y = optString10;
                        aVar2.Q = optString11;
                        if (TextUtils.isEmpty(optString7)) {
                            str7 = null;
                            gu8.c(null, "InternalNativeAdBannerParser: no discount value or the value is empty.");
                        } else {
                            str7 = null;
                        }
                        if (TextUtils.isEmpty(optString8)) {
                            gu8.c(str7, "InternalNativeAdBannerParser: no price value or the value is empty.");
                        }
                        if (TextUtils.isEmpty(optString9)) {
                            gu8.c(str7, "InternalNativeAdBannerParser: no oldPrice value or the value is empty.");
                        }
                        if (TextUtils.isEmpty(optString10)) {
                            gu8.c(str7, "InternalNativeAdBannerParser: no currency value or the value is empty.");
                        }
                        aVar2.F = optJSONObject11.optString("cardID", aVar2.F);
                        if (aVar2 == null) {
                            arrayList5.add(aVar2);
                        }
                    }
                    ooy0Var2 = i7;
                    aVar2 = null;
                    if (aVar2 == null) {
                    }
                } else {
                    ooy0Var2 = i7;
                    f.g(3007);
                }
                i8++;
                i7 = ooy0Var2;
            }
            ocz0Var.a0 = arrayList5;
        }
        if (!jSONObject2.has("survey") || (optJSONObject2 = jSONObject2.optJSONObject("survey")) == null) {
            jSONObject = jSONObject2;
            ryy0Var = ryy0Var2;
            ooy0Var = a2;
        } else {
            ooy0 i9 = a2.a("survey").i();
            String optString12 = optJSONObject2.optString("formId");
            if (TextUtils.isEmpty(optString12)) {
                ao8.e(i9, "formId");
            } else {
                String optString13 = optJSONObject2.optString("postUrl");
                if (TextUtils.isEmpty(optString13)) {
                    ao8.e(i9, "postUrl");
                } else if (TextUtils.isEmpty(optJSONObject2.optString("legalDocUrl"))) {
                    ao8.e(i9, "legalDocUrl");
                } else if (optJSONObject2.optInt("gradient", -1) == -1) {
                    ao8.e(i9, "gradient");
                } else {
                    optJSONObject2.optString("mainColor", null);
                    ooy0 i10 = i9.a("questions").i();
                    JSONArray optJSONArray5 = optJSONObject2.optJSONArray("questions");
                    if (optJSONArray5 == null || optJSONArray5.length() == 0) {
                        jSONObject = jSONObject2;
                        ryy0Var = ryy0Var2;
                        ooy0Var = a2;
                        ao8.e(i10, "questions");
                    } else {
                        arrayList2 = new ArrayList();
                        int i11 = 0;
                        while (i11 < optJSONArray5.length()) {
                            ooy0 f2 = i10.f(i11);
                            JSONObject optJSONObject12 = optJSONArray5.optJSONObject(i11);
                            String optString14 = optJSONObject12.optString("blockId");
                            if (TextUtils.isEmpty(optString14)) {
                                ao8.e(f2, "blockId");
                            } else {
                                String optString15 = optJSONObject12.optString("questionType");
                                if (TextUtils.isEmpty(optString15)) {
                                    ao8.e(i10, "questionType");
                                } else {
                                    String optString16 = optJSONObject12.optString("text");
                                    if (TextUtils.isEmpty(optString16)) {
                                        ao8.e(i10, "text");
                                    } else {
                                        optJSONObject12.optBoolean("isRequired");
                                        int i12 = i11;
                                        ArrayList d = ao8.d(optJSONObject12.optJSONArray("images"), f2.a("images").i());
                                        ooy0 i13 = f2.a("answers").i();
                                        JSONArray optJSONArray6 = optJSONObject12.optJSONArray("answers");
                                        if (optJSONArray6 == null || optJSONArray6.length() == 0) {
                                            jSONObject = jSONObject2;
                                            jSONArray = optJSONArray5;
                                            ryy0Var = ryy0Var2;
                                            ooy0Var = a2;
                                            str6 = str5;
                                            ao8.e(i13, "answers");
                                        } else {
                                            ArrayList arrayList6 = new ArrayList();
                                            jSONArray = optJSONArray5;
                                            int i14 = 0;
                                            while (i14 < optJSONArray6.length()) {
                                                ooy0 f3 = i13.f(i14);
                                                ryy0Var = ryy0Var2;
                                                JSONObject optJSONObject13 = optJSONArray6.optJSONObject(i14);
                                                if (optJSONObject13 == null) {
                                                    f3.c(3007, "There is no answer object for index.");
                                                } else {
                                                    JSONArray jSONArray3 = optJSONArray6;
                                                    int i15 = i14;
                                                    String optString17 = optJSONObject13.optString("id");
                                                    if (TextUtils.isEmpty(optString17)) {
                                                        ao8.e(f3, "id");
                                                    } else {
                                                        jSONObject = jSONObject2;
                                                        ooy0Var = a2;
                                                        String str16 = str5;
                                                        int optInt7 = optJSONObject13.optInt(str16, -1);
                                                        if (optInt7 == -1) {
                                                            ao8.e(f3, str16);
                                                        } else {
                                                            String optString18 = optJSONObject13.optString("text");
                                                            if (TextUtils.isEmpty(optString18)) {
                                                                ao8.e(f3, "text");
                                                            } else {
                                                                arrayList6.add(new lbz0(optInt7, optString17, optString18, ao8.d(optJSONObject13.optJSONArray("logo"), f3.a("logo").i())));
                                                                i14 = i15 + 1;
                                                                a2 = ooy0Var;
                                                                optJSONArray6 = jSONArray3;
                                                                ryy0Var2 = ryy0Var;
                                                                jSONObject2 = jSONObject;
                                                                str5 = str16;
                                                            }
                                                        }
                                                        str6 = str16;
                                                    }
                                                }
                                                jSONObject = jSONObject2;
                                                ooy0Var = a2;
                                                str6 = str5;
                                            }
                                            jSONObject = jSONObject2;
                                            ryy0Var = ryy0Var2;
                                            ooy0Var = a2;
                                            str6 = str5;
                                            arrayList3 = arrayList6;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                arrayList2.add(new sdz0(optString14, optString15, optString16, arrayList3, d));
                                                i11 = i12 + 1;
                                                optJSONArray5 = jSONArray;
                                                a2 = ooy0Var;
                                                ryy0Var2 = ryy0Var;
                                                jSONObject2 = jSONObject;
                                                str5 = str6;
                                            }
                                        }
                                        arrayList3 = null;
                                        if (arrayList3 != null) {
                                            arrayList2.add(new sdz0(optString14, optString15, optString16, arrayList3, d));
                                            i11 = i12 + 1;
                                            optJSONArray5 = jSONArray;
                                            a2 = ooy0Var;
                                            ryy0Var2 = ryy0Var;
                                            jSONObject2 = jSONObject;
                                            str5 = str6;
                                        }
                                    }
                                }
                            }
                            jSONObject = jSONObject2;
                            ryy0Var = ryy0Var2;
                            ooy0Var = a2;
                        }
                        jSONObject = jSONObject2;
                        ryy0Var = ryy0Var2;
                        ooy0Var = a2;
                        if (arrayList2 != null) {
                            ooy0 i16 = i9.a("resultInfo").i();
                            JSONObject optJSONObject14 = optJSONObject2.optJSONObject("resultInfo");
                            if (optJSONObject14 != null) {
                                if (TextUtils.isEmpty(optJSONObject14.optString("title"))) {
                                    ao8.e(i16, "title");
                                } else {
                                    njwVar = null;
                                    optJSONObject14.optString("description", null);
                                    blkVar = new blk();
                                    if (blkVar != null) {
                                        i9.c(3007, "Unable to parse resultInfo");
                                        njwVar2 = njwVar;
                                    } else {
                                        njwVar2 = new njw(optString12, optString13, arrayList2);
                                    }
                                    if (njwVar2 != null) {
                                        ocz0Var.b0 = njwVar2;
                                    }
                                }
                            }
                            njwVar = null;
                            blkVar = null;
                            if (blkVar != null) {
                            }
                            if (njwVar2 != null) {
                            }
                        }
                        njwVar2 = null;
                        if (njwVar2 != null) {
                        }
                    }
                    arrayList2 = null;
                    if (arrayList2 != null) {
                    }
                    njwVar2 = null;
                    if (njwVar2 != null) {
                    }
                }
            }
            jSONObject = jSONObject2;
            ryy0Var = ryy0Var2;
            ooy0Var = a2;
            njwVar2 = null;
            if (njwVar2 != null) {
            }
        }
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3.has("postView") && (optJSONObject = jSONObject3.optJSONObject("postView")) != null) {
            ooy0 i17 = ooy0Var.a("postView").i();
            ipy0 ipy0Var = new ipy0();
            ryy0Var.c(optJSONObject, ipy0Var, i17);
            ocz0Var.Z = ipy0Var;
        }
        return new p5z0(ocz0Var);
    }

    @Override // xsna.bjx
    public final p5z0 b(String str, String str2) {
        return a(str, str2, null);
    }
}
