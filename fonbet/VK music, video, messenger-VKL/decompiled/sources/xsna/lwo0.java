package xsna;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.TimelineException;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.o5z0;

/* compiled from: TimelineBuilder.kt */
/* loaded from: classes3.dex */
public final class lwo0 {
    public final Object a;
    public final Object b;
    public final Object c;

    public lwo0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(JSONObject jSONObject, x1z0 x1z0Var, xla xlaVar, ooy0 ooy0Var, nl nlVar) {
        String str;
        pll pllVar;
        JSONArray jSONArray;
        String str2;
        String str3;
        JSONArray jSONArray2;
        String str4;
        xhz0 xhz0Var;
        ArrayList arrayList;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject2;
        String optString;
        e5z0 a;
        JSONObject jSONObject3;
        ooy0 a2;
        String str12;
        JSONObject optJSONObject;
        tbz0 tbz0Var;
        z6z0 z6z0Var;
        nl nlVar2 = nlVar;
        u6z0 u6z0Var = (u6z0) this.b;
        jkz0 jkz0Var = (jkz0) this.a;
        ryy0 ryy0Var = (ryy0) this.c;
        ryy0Var.c(jSONObject, x1z0Var, ooy0Var);
        JSONArray optJSONArray = jSONObject.optJSONArray("cards");
        ooy0 i = ooy0Var.a("cards").i();
        if (optJSONArray != null) {
            try {
                Class.forName(RecyclerView.class.getName());
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    ooy0 f = i.f(i2);
                    if (optJSONObject2 != null) {
                        a5z0 a5z0Var = new a5z0(x1z0Var.T, nlVar2, null);
                        a5z0Var.d = x1z0Var.d;
                        a5z0Var.p = x1z0Var.p;
                        a5z0Var.G = x1z0Var.G;
                        a5z0Var.H = x1z0Var.H;
                        a5z0Var.x = x1z0Var.x;
                        a5z0Var.w = x1z0Var.w;
                        a5z0Var.I = x1z0Var.I;
                        a5z0Var.v = x1z0Var.v;
                        a5z0Var.j = x1z0Var.j;
                        a5z0Var.k = x1z0Var.k;
                        a5z0Var.o = x1z0Var.o;
                        a5z0Var.l = x1z0Var.l;
                        a5z0Var.n = x1z0Var.n;
                        ryy0Var.c(optJSONObject2, a5z0Var, f);
                        String optString2 = optJSONObject2.optString("discount");
                        if (TextUtils.isEmpty(optString2)) {
                            f.a("discount").g(3007);
                        } else {
                            a5z0Var.U = optString2;
                        }
                        String optString3 = optJSONObject2.optString("price");
                        if (TextUtils.isEmpty(optString3)) {
                            f.a("price").g(3007);
                        } else {
                            a5z0Var.V = optString3;
                        }
                        String optString4 = optJSONObject2.optString("oldPrice");
                        if (TextUtils.isEmpty(optString4)) {
                            f.a("oldPrice").g(3007);
                        } else {
                            a5z0Var.W = optString4;
                        }
                        String optString5 = optJSONObject2.optString(InAppPurchaseMetaData.KEY_CURRENCY);
                        if (TextUtils.isEmpty(optString5)) {
                            f.a(InAppPurchaseMetaData.KEY_CURRENCY).g(3007);
                        } else {
                            a5z0Var.X = optString5;
                        }
                        if (TextUtils.isEmpty(a5z0Var.J)) {
                            f.a("trackingLink").g(3006);
                        } else if (a5z0Var.t == null) {
                            f.a("imageLink").g(3006);
                        } else {
                            a5z0Var.F = optJSONObject2.optString("cardID", a5z0Var.F);
                            if (a5z0Var == null) {
                                x1z0Var.U.add(a5z0Var);
                            }
                        }
                        a5z0Var = null;
                        if (a5z0Var == null) {
                        }
                    } else {
                        f.g(3007);
                    }
                }
                return;
            } catch (Throwable unused) {
                gu8.c(null, "UiUtils: RecyclerView doesn't exist, add RecyclerView dependency to show cards");
            }
        }
        String str13 = "type";
        if (jSONObject.has(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
            x1z0Var.Z = jSONObject.optString("ctcText", x1z0Var.Z);
            String optString6 = jSONObject.optString("ctcIconLink");
            if (!TextUtils.isEmpty(optString6)) {
                x1z0Var.a0 = new kiw(optString6);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
            if (optJSONObject3 != null) {
                ooy0 i3 = ooy0Var.a(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).i();
                String optString7 = optJSONObject3.optString("type");
                if ("html".equals(optString7)) {
                    String a3 = ryy0.a(optJSONObject3, xlaVar, i3);
                    if (!TextUtils.isEmpty(a3)) {
                        z6z0Var = new z6z0(a3);
                        z6z0Var.F = x1z0Var.F;
                        z6z0Var.J = x1z0Var.J;
                        z6z0Var.I = x1z0Var.I;
                        z6z0Var.G = x1z0Var.G;
                        z6z0Var.H = x1z0Var.H;
                        z6z0Var.p = x1z0Var.p;
                        z6z0Var.x = x1z0Var.x;
                        z6z0Var.w = x1z0Var.w;
                        ryy0Var.c(optJSONObject3, z6z0Var, i3);
                        x1z0Var.X = z6z0Var;
                    }
                } else {
                    gu8.c(null, "NativeAdBannerParser: NativeAdContent banner has type " + optString7);
                    i3.a("type").h(3007, optString7);
                }
                z6z0Var = null;
                x1z0Var.X = z6z0Var;
            }
        }
        if (jSONObject.has("html") && (optJSONObject = jSONObject.optJSONObject("html")) != null) {
            ooy0 i4 = ooy0Var.a("html").i();
            String a4 = ryy0.a(optJSONObject, xlaVar, i4);
            if (TextUtils.isEmpty(a4)) {
                tbz0Var = null;
            } else {
                tbz0Var = new tbz0(a4);
                ryy0Var.c(optJSONObject, tbz0Var, i4);
            }
            x1z0Var.Y = tbz0Var;
        }
        String str14 = "video";
        JSONObject optJSONObject4 = jSONObject.optJSONObject("video");
        if (optJSONObject4 != null) {
            lgz0 lgz0Var = new lgz0(ooy0Var.a, nlVar2);
            lgz0Var.F = x1z0Var.F;
            if (new l2z0(jkz0Var, u6z0Var, 2).t(optJSONObject4, lgz0Var, ooy0Var.a("video"))) {
                e5z0 e5z0Var = lgz0Var.a;
                if (!e5z0Var.p()) {
                    e5z0Var.k(x1z0Var.a, lgz0Var.D);
                }
                x1z0Var.W = lgz0Var;
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("collage");
        if (optJSONObject5 == null) {
            return;
        }
        ooy0 a5 = ooy0Var.a("collage");
        xhz0 xhz0Var2 = new xhz0(jkz0Var);
        String str15 = "src";
        String str16 = "format";
        String str17 = "mediafiles";
        String str18 = "duration";
        String str19 = "preview";
        String str20 = "id";
        String str21 = "image";
        try {
            jSONArray = optJSONObject5.getJSONArray("items");
            str2 = "message=";
            try {
            } catch (Throwable th) {
                th = th;
                str = str2;
            }
        } catch (Throwable th2) {
            th = th2;
            str = "message=";
        }
        if (jSONArray.length() < 2) {
            a5.a("items").g(3006);
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (i5 < jSONArray.length()) {
                try {
                    jSONObject2 = jSONArray.getJSONObject(i5);
                    optString = jSONObject2.optString(str20);
                } catch (Throwable th3) {
                    th = th3;
                    str3 = str21;
                    jSONArray2 = jSONArray;
                }
                if (TextUtils.isEmpty(optString)) {
                    try {
                        jSONArray2 = jSONArray;
                    } catch (Throwable th4) {
                        th = th4;
                        jSONArray2 = jSONArray;
                    }
                    try {
                        a5.f(i5).a(str20).g(3006);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = str21;
                        str4 = str14;
                        xhz0Var = xhz0Var2;
                        arrayList = arrayList2;
                        str5 = str15;
                        str6 = str16;
                        str7 = str17;
                        str8 = str18;
                        str9 = str19;
                        str10 = str20;
                        str11 = str13;
                        ooy0 f2 = a5.f(i5);
                        StringBuilder sb = new StringBuilder();
                        str = str2;
                        try {
                            sb.append(str);
                            sb.append(th.getMessage());
                            f2.d(sb.toString(), th);
                            i5++;
                            jSONArray = jSONArray2;
                            nlVar2 = nlVar;
                            arrayList2 = arrayList;
                            str13 = str11;
                            str2 = str;
                            str20 = str10;
                            xhz0Var2 = xhz0Var;
                            str21 = str3;
                            str18 = str8;
                            str19 = str9;
                            str14 = str4;
                            str16 = str6;
                            str15 = str5;
                            str17 = str7;
                        } catch (Throwable th6) {
                            th = th6;
                            a5.d(str + th.getMessage(), th);
                            pllVar = null;
                            if (pllVar != null) {
                            }
                        }
                    }
                } else {
                    jSONArray2 = jSONArray;
                    String optString8 = jSONObject2.optString(str13);
                    if (TextUtils.isEmpty(optString8)) {
                        a5.f(i5).a(str13).g(3006);
                    } else {
                        str10 = str20;
                        try {
                            a = e5z0.a(a5.a, nlVar2);
                            xhz0Var2.c(a, jSONObject2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a5);
                            xhz0Var = xhz0Var2;
                        } catch (Throwable th7) {
                            th = th7;
                            str3 = str21;
                            str4 = str14;
                            xhz0Var = xhz0Var2;
                        }
                        if (str21.equals(optString8)) {
                            try {
                                jSONObject3 = jSONObject2.getJSONObject(str21);
                                a2 = a5.f(i5).a(str21);
                                str3 = str21;
                            } catch (Throwable th8) {
                                th = th8;
                                str3 = str21;
                            }
                            try {
                                String optString9 = jSONObject3.optString("url");
                                if (TextUtils.isEmpty(optString9)) {
                                    a2.a("url").g(3006);
                                } else {
                                    int optInt = jSONObject3.optInt("width");
                                    if (optInt == 0) {
                                        a2.a("width").g(3006);
                                    } else {
                                        int optInt2 = jSONObject3.optInt("height");
                                        if (optInt2 == 0) {
                                            a2.a("height").g(3006);
                                        } else {
                                            arrayList2.add(new o5z0(optString, optString8, kiw.b(optInt, optInt2, optString9), null, a));
                                            str4 = str14;
                                            arrayList = arrayList2;
                                            str5 = str15;
                                            str6 = str16;
                                            str7 = str17;
                                            str8 = str18;
                                            str9 = str19;
                                            str12 = str13;
                                            str = str2;
                                            str11 = str12;
                                        }
                                    }
                                }
                                str = str2;
                                str4 = str14;
                                arrayList = arrayList2;
                                str5 = str15;
                                str6 = str16;
                                str7 = str17;
                                str8 = str18;
                                str9 = str19;
                                str11 = str13;
                            } catch (Throwable th9) {
                                th = th9;
                                str4 = str14;
                                arrayList = arrayList2;
                                str5 = str15;
                                str6 = str16;
                                str7 = str17;
                                str8 = str18;
                                str9 = str19;
                                str11 = str13;
                                ooy0 f22 = a5.f(i5);
                                StringBuilder sb2 = new StringBuilder();
                                str = str2;
                                sb2.append(str);
                                sb2.append(th.getMessage());
                                f22.d(sb2.toString(), th);
                                i5++;
                                jSONArray = jSONArray2;
                                nlVar2 = nlVar;
                                arrayList2 = arrayList;
                                str13 = str11;
                                str2 = str;
                                str20 = str10;
                                xhz0Var2 = xhz0Var;
                                str21 = str3;
                                str18 = str8;
                                str19 = str9;
                                str14 = str4;
                                str16 = str6;
                                str15 = str5;
                                str17 = str7;
                            }
                        } else {
                            str3 = str21;
                            if (str14.equals(optString8)) {
                                try {
                                    JSONObject jSONObject4 = jSONObject2.getJSONObject(str14);
                                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str19);
                                    String optString10 = jSONObject5.optString("url");
                                    str12 = str13;
                                    try {
                                        ooy0 a6 = a5.f(i5).a(str14).a(str19);
                                        if (TextUtils.isEmpty(optString10)) {
                                            try {
                                                a6.a("url").g(3006);
                                            } catch (Throwable th10) {
                                                th = th10;
                                                str4 = str14;
                                                arrayList = arrayList2;
                                                str5 = str15;
                                                str6 = str16;
                                                str7 = str17;
                                                str8 = str18;
                                                str9 = str19;
                                                str11 = str12;
                                                ooy0 f222 = a5.f(i5);
                                                StringBuilder sb22 = new StringBuilder();
                                                str = str2;
                                                sb22.append(str);
                                                sb22.append(th.getMessage());
                                                f222.d(sb22.toString(), th);
                                                i5++;
                                                jSONArray = jSONArray2;
                                                nlVar2 = nlVar;
                                                arrayList2 = arrayList;
                                                str13 = str11;
                                                str2 = str;
                                                str20 = str10;
                                                xhz0Var2 = xhz0Var;
                                                str21 = str3;
                                                str18 = str8;
                                                str19 = str9;
                                                str14 = str4;
                                                str16 = str6;
                                                str15 = str5;
                                                str17 = str7;
                                            }
                                        } else {
                                            int optInt3 = jSONObject5.optInt("width");
                                            if (optInt3 == 0) {
                                                a6.a("width").g(3006);
                                            } else {
                                                int optInt4 = jSONObject5.optInt("height");
                                                if (optInt4 == 0) {
                                                    a6.a("height").g(3006);
                                                } else {
                                                    int optInt5 = jSONObject4.optInt(str18);
                                                    if (optInt5 == 0) {
                                                        a5.f(i5).a(str14).a(str18).g(3006);
                                                    } else {
                                                        JSONArray jSONArray3 = jSONObject4.getJSONArray(str17);
                                                        str8 = str18;
                                                        try {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            ArrayList arrayList4 = arrayList2;
                                                            str9 = str19;
                                                            int i6 = 0;
                                                            while (i6 < jSONArray3.length()) {
                                                                try {
                                                                    try {
                                                                        ooy0 f3 = a5.f(i5).a(str14).a(str17).f(i6);
                                                                        str4 = str14;
                                                                        try {
                                                                            JSONObject optJSONObject6 = jSONArray3.optJSONObject(i6);
                                                                            JSONArray jSONArray4 = jSONArray3;
                                                                            String optString11 = optJSONObject6.optString(str16);
                                                                            if (TextUtils.isEmpty(optString11)) {
                                                                                try {
                                                                                    f3.a(str16).g(3006);
                                                                                    str5 = str15;
                                                                                    str6 = str16;
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                    str5 = str15;
                                                                                    str6 = str16;
                                                                                    str7 = str17;
                                                                                    str11 = str12;
                                                                                    arrayList = arrayList4;
                                                                                    ooy0 f2222 = a5.f(i5);
                                                                                    StringBuilder sb222 = new StringBuilder();
                                                                                    str = str2;
                                                                                    sb222.append(str);
                                                                                    sb222.append(th.getMessage());
                                                                                    f2222.d(sb222.toString(), th);
                                                                                    i5++;
                                                                                    jSONArray = jSONArray2;
                                                                                    nlVar2 = nlVar;
                                                                                    arrayList2 = arrayList;
                                                                                    str13 = str11;
                                                                                    str2 = str;
                                                                                    str20 = str10;
                                                                                    xhz0Var2 = xhz0Var;
                                                                                    str21 = str3;
                                                                                    str18 = str8;
                                                                                    str19 = str9;
                                                                                    str14 = str4;
                                                                                    str16 = str6;
                                                                                    str15 = str5;
                                                                                    str17 = str7;
                                                                                }
                                                                            } else {
                                                                                str6 = str16;
                                                                                try {
                                                                                    String optString12 = optJSONObject6.optString(str15);
                                                                                    if (TextUtils.isEmpty(optString12)) {
                                                                                        try {
                                                                                            f3.a(str15).g(3006);
                                                                                            str5 = str15;
                                                                                        } catch (Throwable th12) {
                                                                                            th = th12;
                                                                                            str5 = str15;
                                                                                            str7 = str17;
                                                                                            str11 = str12;
                                                                                            arrayList = arrayList4;
                                                                                            ooy0 f22222 = a5.f(i5);
                                                                                            StringBuilder sb2222 = new StringBuilder();
                                                                                            str = str2;
                                                                                            sb2222.append(str);
                                                                                            sb2222.append(th.getMessage());
                                                                                            f22222.d(sb2222.toString(), th);
                                                                                            i5++;
                                                                                            jSONArray = jSONArray2;
                                                                                            nlVar2 = nlVar;
                                                                                            arrayList2 = arrayList;
                                                                                            str13 = str11;
                                                                                            str2 = str;
                                                                                            str20 = str10;
                                                                                            xhz0Var2 = xhz0Var;
                                                                                            str21 = str3;
                                                                                            str18 = str8;
                                                                                            str19 = str9;
                                                                                            str14 = str4;
                                                                                            str16 = str6;
                                                                                            str15 = str5;
                                                                                            str17 = str7;
                                                                                        }
                                                                                    } else {
                                                                                        str5 = str15;
                                                                                        str7 = str17;
                                                                                        try {
                                                                                            int optInt6 = optJSONObject6.optInt("width", 0);
                                                                                            if (optInt6 == 0) {
                                                                                                try {
                                                                                                    f3.a("width").g(3006);
                                                                                                    i6++;
                                                                                                    jSONArray3 = jSONArray4;
                                                                                                    str14 = str4;
                                                                                                    str16 = str6;
                                                                                                    str15 = str5;
                                                                                                    str17 = str7;
                                                                                                } catch (Throwable th13) {
                                                                                                    th = th13;
                                                                                                    str11 = str12;
                                                                                                    arrayList = arrayList4;
                                                                                                    ooy0 f222222 = a5.f(i5);
                                                                                                    StringBuilder sb22222 = new StringBuilder();
                                                                                                    str = str2;
                                                                                                    sb22222.append(str);
                                                                                                    sb22222.append(th.getMessage());
                                                                                                    f222222.d(sb22222.toString(), th);
                                                                                                    i5++;
                                                                                                    jSONArray = jSONArray2;
                                                                                                    nlVar2 = nlVar;
                                                                                                    arrayList2 = arrayList;
                                                                                                    str13 = str11;
                                                                                                    str2 = str;
                                                                                                    str20 = str10;
                                                                                                    xhz0Var2 = xhz0Var;
                                                                                                    str21 = str3;
                                                                                                    str18 = str8;
                                                                                                    str19 = str9;
                                                                                                    str14 = str4;
                                                                                                    str16 = str6;
                                                                                                    str15 = str5;
                                                                                                    str17 = str7;
                                                                                                }
                                                                                            } else {
                                                                                                int optInt7 = optJSONObject6.optInt("height", 0);
                                                                                                if (optInt7 == 0) {
                                                                                                    try {
                                                                                                        f3.a("height").g(3006);
                                                                                                    } catch (Throwable th14) {
                                                                                                        th = th14;
                                                                                                        str11 = str12;
                                                                                                        arrayList = arrayList4;
                                                                                                        ooy0 f2222222 = a5.f(i5);
                                                                                                        StringBuilder sb222222 = new StringBuilder();
                                                                                                        str = str2;
                                                                                                        sb222222.append(str);
                                                                                                        sb222222.append(th.getMessage());
                                                                                                        f2222222.d(sb222222.toString(), th);
                                                                                                        i5++;
                                                                                                        jSONArray = jSONArray2;
                                                                                                        nlVar2 = nlVar;
                                                                                                        arrayList2 = arrayList;
                                                                                                        str13 = str11;
                                                                                                        str2 = str;
                                                                                                        str20 = str10;
                                                                                                        xhz0Var2 = xhz0Var;
                                                                                                        str21 = str3;
                                                                                                        str18 = str8;
                                                                                                        str19 = str9;
                                                                                                        str14 = str4;
                                                                                                        str16 = str6;
                                                                                                        str15 = str5;
                                                                                                        str17 = str7;
                                                                                                    }
                                                                                                } else {
                                                                                                    arrayList3.add(new o5z0.a(optString11, optString12, optInt6, optInt7));
                                                                                                }
                                                                                                i6++;
                                                                                                jSONArray3 = jSONArray4;
                                                                                                str14 = str4;
                                                                                                str16 = str6;
                                                                                                str15 = str5;
                                                                                                str17 = str7;
                                                                                            }
                                                                                        } catch (Throwable th15) {
                                                                                            th = th15;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th16) {
                                                                                    th = th16;
                                                                                    str5 = str15;
                                                                                    str7 = str17;
                                                                                    str11 = str12;
                                                                                    arrayList = arrayList4;
                                                                                    ooy0 f22222222 = a5.f(i5);
                                                                                    StringBuilder sb2222222 = new StringBuilder();
                                                                                    str = str2;
                                                                                    sb2222222.append(str);
                                                                                    sb2222222.append(th.getMessage());
                                                                                    f22222222.d(sb2222222.toString(), th);
                                                                                    i5++;
                                                                                    jSONArray = jSONArray2;
                                                                                    nlVar2 = nlVar;
                                                                                    arrayList2 = arrayList;
                                                                                    str13 = str11;
                                                                                    str2 = str;
                                                                                    str20 = str10;
                                                                                    xhz0Var2 = xhz0Var;
                                                                                    str21 = str3;
                                                                                    str18 = str8;
                                                                                    str19 = str9;
                                                                                    str14 = str4;
                                                                                    str16 = str6;
                                                                                    str15 = str5;
                                                                                    str17 = str7;
                                                                                }
                                                                            }
                                                                            str7 = str17;
                                                                            i6++;
                                                                            jSONArray3 = jSONArray4;
                                                                            str14 = str4;
                                                                            str16 = str6;
                                                                            str15 = str5;
                                                                            str17 = str7;
                                                                        } catch (Throwable th17) {
                                                                            th = th17;
                                                                            str5 = str15;
                                                                            str6 = str16;
                                                                            str7 = str17;
                                                                            str11 = str12;
                                                                            arrayList = arrayList4;
                                                                            ooy0 f222222222 = a5.f(i5);
                                                                            StringBuilder sb22222222 = new StringBuilder();
                                                                            str = str2;
                                                                            sb22222222.append(str);
                                                                            sb22222222.append(th.getMessage());
                                                                            f222222222.d(sb22222222.toString(), th);
                                                                            i5++;
                                                                            jSONArray = jSONArray2;
                                                                            nlVar2 = nlVar;
                                                                            arrayList2 = arrayList;
                                                                            str13 = str11;
                                                                            str2 = str;
                                                                            str20 = str10;
                                                                            xhz0Var2 = xhz0Var;
                                                                            str21 = str3;
                                                                            str18 = str8;
                                                                            str19 = str9;
                                                                            str14 = str4;
                                                                            str16 = str6;
                                                                            str15 = str5;
                                                                            str17 = str7;
                                                                        }
                                                                    } catch (Throwable th18) {
                                                                        th = th18;
                                                                        str4 = str14;
                                                                    }
                                                                } catch (Throwable th19) {
                                                                    th = th19;
                                                                    str4 = str14;
                                                                    str5 = str15;
                                                                    str6 = str16;
                                                                    str7 = str17;
                                                                    arrayList = arrayList4;
                                                                    str11 = str12;
                                                                    ooy0 f2222222222 = a5.f(i5);
                                                                    StringBuilder sb222222222 = new StringBuilder();
                                                                    str = str2;
                                                                    sb222222222.append(str);
                                                                    sb222222222.append(th.getMessage());
                                                                    f2222222222.d(sb222222222.toString(), th);
                                                                    i5++;
                                                                    jSONArray = jSONArray2;
                                                                    nlVar2 = nlVar;
                                                                    arrayList2 = arrayList;
                                                                    str13 = str11;
                                                                    str2 = str;
                                                                    str20 = str10;
                                                                    xhz0Var2 = xhz0Var;
                                                                    str21 = str3;
                                                                    str18 = str8;
                                                                    str19 = str9;
                                                                    str14 = str4;
                                                                    str16 = str6;
                                                                    str15 = str5;
                                                                    str17 = str7;
                                                                }
                                                            }
                                                            str4 = str14;
                                                            str5 = str15;
                                                            str6 = str16;
                                                            str7 = str17;
                                                            try {
                                                                o5z0 o5z0Var = new o5z0(optString, optString8, null, new o5z0.b(kiw.b(optInt3, optInt4, optString10), arrayList3, optInt5), a);
                                                                arrayList = arrayList4;
                                                                try {
                                                                    arrayList.add(o5z0Var);
                                                                    str = str2;
                                                                    str11 = str12;
                                                                } catch (Throwable th20) {
                                                                    th = th20;
                                                                    str11 = str12;
                                                                    ooy0 f22222222222 = a5.f(i5);
                                                                    StringBuilder sb2222222222 = new StringBuilder();
                                                                    str = str2;
                                                                    sb2222222222.append(str);
                                                                    sb2222222222.append(th.getMessage());
                                                                    f22222222222.d(sb2222222222.toString(), th);
                                                                    i5++;
                                                                    jSONArray = jSONArray2;
                                                                    nlVar2 = nlVar;
                                                                    arrayList2 = arrayList;
                                                                    str13 = str11;
                                                                    str2 = str;
                                                                    str20 = str10;
                                                                    xhz0Var2 = xhz0Var;
                                                                    str21 = str3;
                                                                    str18 = str8;
                                                                    str19 = str9;
                                                                    str14 = str4;
                                                                    str16 = str6;
                                                                    str15 = str5;
                                                                    str17 = str7;
                                                                }
                                                            } catch (Throwable th21) {
                                                                th = th21;
                                                                arrayList = arrayList4;
                                                            }
                                                        } catch (Throwable th22) {
                                                            th = th22;
                                                            str4 = str14;
                                                            arrayList = arrayList2;
                                                            str5 = str15;
                                                            str6 = str16;
                                                            str7 = str17;
                                                            str9 = str19;
                                                            str11 = str12;
                                                            ooy0 f222222222222 = a5.f(i5);
                                                            StringBuilder sb22222222222 = new StringBuilder();
                                                            str = str2;
                                                            sb22222222222.append(str);
                                                            sb22222222222.append(th.getMessage());
                                                            f222222222222.d(sb22222222222.toString(), th);
                                                            i5++;
                                                            jSONArray = jSONArray2;
                                                            nlVar2 = nlVar;
                                                            arrayList2 = arrayList;
                                                            str13 = str11;
                                                            str2 = str;
                                                            str20 = str10;
                                                            xhz0Var2 = xhz0Var;
                                                            str21 = str3;
                                                            str18 = str8;
                                                            str19 = str9;
                                                            str14 = str4;
                                                            str16 = str6;
                                                            str15 = str5;
                                                            str17 = str7;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        str = str2;
                                        str4 = str14;
                                        arrayList = arrayList2;
                                        str5 = str15;
                                        str6 = str16;
                                        str7 = str17;
                                        str8 = str18;
                                        str9 = str19;
                                        str11 = str12;
                                    } catch (Throwable th23) {
                                        th = th23;
                                        str4 = str14;
                                        arrayList = arrayList2;
                                        str5 = str15;
                                        str6 = str16;
                                        str7 = str17;
                                        str8 = str18;
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                    str4 = str14;
                                    arrayList = arrayList2;
                                    str5 = str15;
                                    str6 = str16;
                                    str7 = str17;
                                    str8 = str18;
                                    str9 = str19;
                                    str12 = str13;
                                }
                            } else {
                                str4 = str14;
                                arrayList = arrayList2;
                                str5 = str15;
                                str6 = str16;
                                str7 = str17;
                                str8 = str18;
                                str9 = str19;
                                str11 = str13;
                                try {
                                    a5.f(i5).a(str11).h(3009, "type=" + optString8);
                                    str = str2;
                                } catch (Throwable th25) {
                                    th = th25;
                                }
                            }
                            ooy0 f2222222222222 = a5.f(i5);
                            StringBuilder sb222222222222 = new StringBuilder();
                            str = str2;
                            sb222222222222.append(str);
                            sb222222222222.append(th.getMessage());
                            f2222222222222.d(sb222222222222.toString(), th);
                        }
                        i5++;
                        jSONArray = jSONArray2;
                        nlVar2 = nlVar;
                        arrayList2 = arrayList;
                        str13 = str11;
                        str2 = str;
                        str20 = str10;
                        xhz0Var2 = xhz0Var;
                        str21 = str3;
                        str18 = str8;
                        str19 = str9;
                        str14 = str4;
                        str16 = str6;
                        str15 = str5;
                        str17 = str7;
                    }
                }
                str3 = str21;
                str4 = str14;
                xhz0Var = xhz0Var2;
                arrayList = arrayList2;
                str5 = str15;
                str6 = str16;
                str7 = str17;
                str8 = str18;
                str9 = str19;
                str10 = str20;
                str11 = str13;
                str = str2;
                i5++;
                jSONArray = jSONArray2;
                nlVar2 = nlVar;
                arrayList2 = arrayList;
                str13 = str11;
                str2 = str;
                str20 = str10;
                xhz0Var2 = xhz0Var;
                str21 = str3;
                str18 = str8;
                str19 = str9;
                str14 = str4;
                str16 = str6;
                str15 = str5;
                str17 = str7;
            }
            ArrayList arrayList5 = arrayList2;
            if (arrayList5.size() >= 2) {
                pllVar = new pll(arrayList5);
                if (pllVar != null) {
                    x1z0Var.V = pllVar;
                    return;
                }
                return;
            }
            a5.h(3008, "parsed collage items less than 2");
        }
        pllVar = null;
        if (pllVar != null) {
        }
    }

    public Timeline b() {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        if (arrayList2.isEmpty()) {
            throw new TimelineException("Timeline is empty");
        }
        VideoFragment videoFragment = (VideoFragment) j5g.k0(arrayList2);
        final long j = videoFragment != null ? videoFragment.d : 0L;
        final wg3 wg3Var = new wg3(j, this, 2);
        arrayList.removeIf(new Predicate() { // from class: xsna.kwo0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) wg3.this.invoke(obj)).booleanValue();
            }
        });
        arrayList.replaceAll(new UnaryOperator() { // from class: xsna.jwo0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                f100 f100Var = (f100) lwo0.this.a;
                AudioFragmentItem audioFragmentItem = (AudioFragmentItem) obj;
                AudioItem audioItem = audioFragmentItem.b;
                long j2 = audioFragmentItem.c;
                if (j2 < 0) {
                    if (f100Var != null) {
                        f100Var.e("TimelineBuilder", "audio item's offset within timeline is below zero, replaced with 0, item=" + audioFragmentItem);
                    }
                    j2 = 0;
                }
                long j3 = (audioItem.d - audioItem.c) + j2;
                long j4 = j;
                if (j3 > j4 && f100Var != null) {
                    f100Var.e("TimelineBuilder", "audio item's end within timeline is higher than total duration, total timeline duration=" + j4 + ", item=" + audioFragmentItem);
                }
                return new AudioFragmentItem(audioItem, j2);
            }
        });
        return new Timeline(Collections.unmodifiableList(arrayList2), new AudioFragment(Collections.unmodifiableList(arrayList), 0L, j));
    }

    public lwo0(u6z0 u6z0Var, jkz0 jkz0Var) {
        this.a = jkz0Var;
        this.b = u6z0Var;
        this.c = new ryy0(u6z0Var, jkz0Var);
    }

    public lwo0(f100 f100Var) {
        this.a = f100Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
}
