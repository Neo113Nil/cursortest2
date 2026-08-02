package xsna;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MusicMixColorPalette.kt */
/* loaded from: classes3.dex */
public final class zn40 {
    public final Object a;
    public final Object b;
    public final Object c;

    public zn40(u6z0 u6z0Var, jkz0 jkz0Var) {
        this.a = jkz0Var;
        this.b = u6z0Var;
        this.c = new xhz0(jkz0Var);
    }

    public jkz0 a(JSONObject jSONObject, xla xlaVar, ooy0 ooy0Var) {
        JSONObject optJSONObject;
        z1z0 a;
        xhz0 xhz0Var = (xhz0) this.c;
        jkz0 jkz0Var = (jkz0) this.a;
        int i = jkz0Var.m;
        if (i >= 5) {
            xlaVar.b(iaz0.i);
            ooy0Var.h(3007, "rc limit");
            gu8.c(null, "AdditionalDataParser: Got additional data, but max redirects limit exceeded");
            return null;
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            xlaVar.b(iaz0.n);
            ooy0Var.a("url").g(3007);
            return null;
        }
        ooy0Var.a.e(0, 3010, ooy0Var.e(go9.b("url = ", optString)));
        jkz0 jkz0Var2 = new jkz0(optString, null);
        int optInt = jSONObject.optInt("id", jkz0Var.n);
        jkz0Var2.m = i + 1;
        jkz0Var2.n = optInt;
        jkz0Var2.u = jSONObject.optBoolean("doAfter", jkz0Var2.u);
        jkz0Var2.p = jSONObject.optInt("doOnEmptyResponseFromId", jkz0Var2.p);
        jkz0Var2.v = jSONObject.optBoolean("isMidrollPoint", jkz0Var2.v);
        float f = jkz0Var.w;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = (float) jSONObject.optDouble("allowCloseDelay", jkz0Var2.w);
        }
        jkz0Var2.w = f;
        Boolean bool = jkz0Var.x;
        if (bool == null) {
            bool = jSONObject.has("allowClose") ? Boolean.valueOf(jSONObject.optBoolean("allowClose")) : null;
        }
        jkz0Var2.x = bool;
        Boolean bool2 = jkz0Var.y;
        if (bool2 == null) {
            bool2 = jSONObject.has("hasPause") ? Boolean.valueOf(jSONObject.optBoolean("hasPause")) : null;
        }
        jkz0Var2.y = bool2;
        Boolean bool3 = jkz0Var.z;
        if (bool3 == null) {
            bool3 = jSONObject.has("allowSeek") ? Boolean.valueOf(jSONObject.optBoolean("allowSeek")) : null;
        }
        jkz0Var2.z = bool3;
        Boolean bool4 = jkz0Var.A;
        if (bool4 == null) {
            bool4 = jSONObject.has("allowSkip") ? Boolean.valueOf(jSONObject.optBoolean("allowSkip")) : null;
        }
        jkz0Var2.A = bool4;
        Boolean bool5 = jkz0Var.B;
        if (bool5 == null) {
            bool5 = jSONObject.has("allowTrackChange") ? Boolean.valueOf(jSONObject.optBoolean("allowTrackChange")) : null;
        }
        jkz0Var2.B = bool5;
        Boolean bool6 = jkz0Var.D;
        if (bool6 == null) {
            bool6 = jSONObject.has("openInBrowser") ? Boolean.valueOf(jSONObject.optBoolean("openInBrowser")) : null;
        }
        jkz0Var2.D = bool6;
        Boolean bool7 = jkz0Var.C;
        if (bool7 == null) {
            bool7 = jSONObject.has("directLink") ? Boolean.valueOf(jSONObject.optBoolean("directLink")) : null;
        }
        jkz0Var2.C = bool7;
        Boolean bool8 = jkz0Var.E;
        if (bool8 == null) {
            bool8 = jSONObject.has("allowReplay") ? Boolean.valueOf(jSONObject.optBoolean("allowReplay")) : null;
        }
        jkz0Var2.E = bool8;
        Boolean bool9 = jkz0Var.F;
        if (bool9 == null) {
            bool9 = jSONObject.has("allowBackButton") ? Boolean.valueOf(jSONObject.optBoolean("allowBackButton")) : null;
        }
        jkz0Var2.F = bool9;
        Boolean bool10 = jkz0Var.G;
        if (bool10 == null) {
            bool10 = jSONObject.has("automute") ? Boolean.valueOf(jSONObject.optBoolean("automute")) : null;
        }
        jkz0Var2.G = bool10;
        Boolean bool11 = jkz0Var.H;
        if (bool11 == null) {
            bool11 = jSONObject.has("autoplay") ? Boolean.valueOf(jSONObject.optBoolean("autoplay")) : null;
        }
        jkz0Var2.H = bool11;
        int i2 = jkz0Var.q;
        if (i2 < 0) {
            i2 = jSONObject.optInt(TtmlNode.TAG_STYLE, jkz0Var2.q);
        }
        jkz0Var2.q = i2;
        int i3 = jkz0Var.r;
        if (i3 < 0) {
            i3 = jSONObject.optInt("clickArea", jkz0Var2.r);
        }
        jkz0Var2.r = i3;
        Boolean bool12 = jkz0Var.I;
        if (bool12 == null) {
            bool12 = jSONObject.has("logErrors") ? Boolean.valueOf(jSONObject.optBoolean("logErrors")) : null;
        }
        jkz0Var2.I = bool12;
        float f2 = jkz0Var.s;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jSONObject.has("point")) {
            f2 = (float) jSONObject.optDouble("point");
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ooy0Var.h(3007, "point=-1.0");
                f2 = -1.0f;
            }
        }
        jkz0Var2.s = f2;
        float f3 = jkz0Var.t;
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jSONObject.has("pointP")) {
            f3 = (float) jSONObject.optDouble("pointP");
            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 > 100.0f) {
                ooy0Var.h(3007, "pointP=" + f3);
                f3 = -1.0f;
            }
        }
        jkz0Var2.t = f3;
        ArrayList arrayList = jkz0Var.e != null ? new ArrayList(jkz0Var.e) : null;
        ArrayList arrayList2 = jkz0Var2.e;
        if (arrayList2 == null) {
            jkz0Var2.e = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        fwy fwyVar = jkz0Var.J;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("omdata");
        if (optJSONObject2 != null) {
            fwyVar = hpt0.e(fwyVar, optJSONObject2);
        }
        jkz0Var2.J = fwyVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("serviceStatistics");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i4);
                if (optJSONObject3 != null && (a = xhz0Var.a(optJSONObject3, -1.0f, ooy0.e)) != null) {
                    jkz0Var2.c.add(a);
                }
            }
        }
        String.valueOf(jkz0Var2.n);
        xhz0Var.b(jkz0Var2.d, jSONObject, -1.0f);
        wty0 wty0Var = jkz0Var.K;
        if (wty0Var == null && (optJSONObject = jSONObject.optJSONObject("adChoices")) != null) {
            int i5 = ((u6z0) this.b).g;
            wty0Var = t4z0.b(optJSONObject, ooy0Var);
        }
        jkz0Var2.K = wty0Var;
        String str = jkz0Var.l;
        if (str == null && jSONObject.has("advertisingLabel")) {
            str = jSONObject.optString("advertisingLabel");
        }
        jkz0Var2.l = str;
        return jkz0Var2;
    }

    public zn40(float[] fArr, float[] fArr2, float[] fArr3) {
        this.a = fArr;
        this.b = fArr2;
        this.c = fArr3;
    }

    public zn40(String str, String str2, String str3) {
        this(ao8.f(str), ao8.f(str2), ao8.f(str3));
    }
}
