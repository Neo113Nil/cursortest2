package xsna;

import android.text.TextUtils;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.kqz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class l2z0 extends oc {
    /* JADX WARN: Removed duplicated region for block: B:139:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(JSONObject jSONObject, lgz0 lgz0Var, ooy0 ooy0Var) {
        boolean z;
        boolean z2;
        sgz0 sgz0Var;
        y5z0 y5z0Var;
        JSONObject optJSONObject;
        int i;
        int i2;
        int i3;
        mhy0 mhy0Var;
        mnh0 mnh0Var;
        JSONObject optJSONObject2;
        ejb0 ejb0Var;
        oez0 oez0Var;
        JSONObject optJSONObject3;
        u6z0 u6z0Var = (u6z0) this.b;
        jkz0 jkz0Var = (jkz0) this.a;
        if (m(jSONObject, lgz0Var, ooy0Var)) {
            return true;
        }
        float f = lgz0Var.D;
        int i4 = 3007;
        boolean z3 = false;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ooy0Var.c(3007, "wrong parsed getDuration()=" + f);
            return false;
        }
        lgz0Var.a0 = jSONObject.optString("closeActionText", "Close");
        lgz0Var.b0 = jSONObject.optString("replayActionText", lgz0Var.b0);
        lgz0Var.c0 = jSONObject.optString("closeDelayActionText", lgz0Var.c0);
        Boolean bool = jkz0Var.G;
        lgz0Var.g0 = bool != null ? bool.booleanValue() : jSONObject.optBoolean("automute", lgz0Var.g0);
        lgz0Var.k0 = jSONObject.optBoolean("showPlayerControls", lgz0Var.k0);
        Boolean bool2 = jkz0Var.H;
        lgz0Var.h0 = bool2 != null ? bool2.booleanValue() : jSONObject.optBoolean("autoplay", lgz0Var.h0);
        lgz0Var.i0 = jSONObject.optBoolean("hasCtaButton", lgz0Var.i0);
        lgz0Var.r0 = (float) jSONObject.optDouble("allowSkipDelay", lgz0Var.r0);
        lgz0Var.n0 = jSONObject.optBoolean("allowSkip", lgz0Var.n0);
        l(jSONObject, lgz0Var);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("shoppable");
        if (optJSONObject4 != null) {
            lgz0Var.W = r(optJSONObject4, lgz0Var);
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("shoppableAdsData");
        if (optJSONObject5 != null) {
            lgz0Var.X = new mcc0(u6z0Var, jkz0Var).h(optJSONObject5);
        }
        o(jSONObject, lgz0Var);
        String optString = jSONObject.optString("previewLink");
        if (!TextUtils.isEmpty(optString)) {
            lgz0Var.Z = kiw.b(jSONObject.optInt("previewWidth"), jSONObject.optInt("previewHeight"), optString);
        }
        String optString2 = jSONObject.optString("aboutCompany");
        if (!TextUtils.isEmpty(optString2)) {
            lgz0Var.w0 = optString2;
        }
        String optString3 = jSONObject.optString("marker");
        if (!TextUtils.isEmpty(optString3)) {
            lgz0Var.x0 = optString3;
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject(X3.i.G0);
        if (optJSONObject6 != null) {
            String optString4 = optJSONObject6.optString("url");
            if (TextUtils.isEmpty(optString4)) {
                gu8.c(null, "CommonVideoParser: CTA button hasn't button link");
            } else {
                String optString5 = optJSONObject6.optString("buttonText");
                if (TextUtils.isEmpty(optString5)) {
                    gu8.c(null, "CommonVideoParser: CTA button hasn't button link text");
                } else {
                    String optString6 = optJSONObject6.optString("additionalText");
                    if (TextUtils.isEmpty(optString6)) {
                        gu8.c(null, "CommonVideoParser: CTA button hasn't text");
                    }
                    int a = wn4.a(optJSONObject6, Integer.MAX_VALUE, "buttonColor");
                    if (a == Integer.MAX_VALUE) {
                        gu8.c(null, "CommonVideoParser: CTA button hasn't button color");
                    }
                    int a2 = wn4.a(optJSONObject6, Integer.MAX_VALUE, "buttonTextColor");
                    z = true;
                    if (a2 == Integer.MAX_VALUE) {
                        gu8.c(null, "CommonVideoParser: CTA button hasn't button text color");
                    }
                    oez0Var = new oez0(optString6, optString4, optString5, a == Integer.MAX_VALUE ? null : Integer.valueOf(a), a2 == Integer.MAX_VALUE ? null : Integer.valueOf(a2), (!optJSONObject6.has("icon") || (optJSONObject3 = optJSONObject6.optJSONObject("icon")) == null) ? null : oc.q(optJSONObject3));
                    lgz0Var.d0 = oez0Var;
                }
            }
            z = true;
            oez0Var = null;
            lgz0Var.d0 = oez0Var;
        } else {
            z = true;
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("qrCta");
        if (optJSONObject7 != null) {
            JSONObject optJSONObject8 = optJSONObject7.optJSONObject("timers");
            if (optJSONObject8 != null) {
                try {
                    i = optJSONObject8.getInt("startValue");
                } catch (JSONException e) {
                    gu8.c(null, "TimersParser: invalid startValue field:" + e.getLocalizedMessage());
                    i = -1;
                }
                try {
                    i2 = optJSONObject8.getInt("startPvalue");
                } catch (JSONException e2) {
                    gu8.c(null, "TimersParser: invalid startPvalue field:" + e2.getLocalizedMessage());
                    i2 = -1;
                }
                try {
                    i3 = optJSONObject8.getInt("extraDuration");
                } catch (JSONException e3) {
                    gu8.c(null, "TimersParser: invalid extraDuration field:" + e3.getLocalizedMessage());
                    i3 = 0;
                }
                mhy0Var = new mhy0(i, i2, i3);
            } else {
                mhy0Var = null;
            }
            if (mhy0Var != null) {
                JSONObject optJSONObject9 = optJSONObject7.optJSONObject("qrImage");
                if ((optJSONObject9 != null ? czi.f(optJSONObject9) : null) != null) {
                    JSONObject optJSONObject10 = optJSONObject7.optJSONObject("qrIconImage");
                    if (optJSONObject10 != null && czi.f(optJSONObject10) != null && (optJSONObject2 = optJSONObject10.optJSONObject(X3.i.L)) != null) {
                        de.x(optJSONObject2);
                    }
                    JSONObject optJSONObject11 = optJSONObject7.optJSONObject("additionalImage");
                    if (optJSONObject11 != null) {
                        czi.f(optJSONObject11);
                    }
                    String optString7 = optJSONObject7.optString("title");
                    if (TextUtils.isEmpty(optString7)) {
                        optString7 = null;
                    }
                    if (optString7 != null) {
                        String optString8 = optJSONObject7.optString("additionalText");
                        if (TextUtils.isEmpty(optString8)) {
                            optString8 = null;
                        }
                        if (optString8 != null) {
                            JSONObject optJSONObject12 = optJSONObject7.optJSONObject(X3.i.L);
                            if (optJSONObject12 != null) {
                                de.x(optJSONObject12);
                            }
                            optJSONObject7.optString("colorScheme").getClass();
                            mnh0Var = new mnh0();
                            if (mnh0Var != null) {
                                ejb0Var = new ejb0(mnh0Var, mhy0Var);
                                lgz0Var.e0 = ejb0Var;
                            }
                        }
                    }
                }
                mnh0Var = null;
                if (mnh0Var != null) {
                }
            }
            ejb0Var = null;
            lgz0Var.e0 = ejb0Var;
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("postView");
        if (optJSONObject13 != null) {
            String optString9 = optJSONObject13.optString("text");
            if (TextUtils.isEmpty(optString9)) {
                gu8.c(null, "CommonVideoParser: PostView hasn't text");
            }
            kiw q = (!optJSONObject13.has("backgroundImage") || (optJSONObject = optJSONObject13.optJSONObject("backgroundImage")) == null) ? null : oc.q(optJSONObject);
            if (q == null) {
                gu8.c(null, "CommonVideoParser: PostView hasn't backgroundImage");
            }
            if (TextUtils.isEmpty(optString9) && q == null) {
                gu8.c(null, "CommonVideoParser: PostView Text or Background Image should exist but both are empty");
                y5z0Var = null;
            } else {
                boolean optBoolean = optJSONObject13.optBoolean("pauseOnHide", false);
                int a3 = wn4.a(optJSONObject13, Integer.MAX_VALUE, "overlay");
                if (a3 == Integer.MAX_VALUE) {
                    gu8.c(null, "CommonVideoParser: PostView hasn't overlay");
                }
                double optDouble = optJSONObject13.optDouble("duration", 3.0d);
                y5z0Var = new y5z0(optString9, optDouble >= 0.001d ? optDouble : 3.0d, optBoolean, a3 == Integer.MAX_VALUE ? null : Integer.valueOf(a3), q);
            }
            lgz0Var.f0 = y5z0Var;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        ooy0 a4 = ooy0Var.a("mediafiles");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            gu8.c(null, "CommonVideoParser: Mediafiles array is empty");
            a4.c(3006, "unable to find mediaFiles in MediaBanner");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        int i5 = 0;
        while (i5 < length) {
            JSONObject optJSONObject14 = optJSONArray.optJSONObject(i5);
            ooy0 f2 = a4.f(i5);
            if (optJSONObject14 != null) {
                String optString10 = optJSONObject14.optString("src");
                int optInt = optJSONObject14.optInt("width");
                z2 = z3;
                int optInt2 = optJSONObject14.optInt("height");
                if (TextUtils.isEmpty(optString10) || optInt <= 0 || optInt2 <= 0) {
                    StringBuilder b = xy6.b(optInt, "bad mediafile object, src = ", optString10, ", width = ", ", height = ");
                    b.append(optInt2);
                    f2.c(3007, b.toString());
                } else {
                    sgz0Var = new sgz0(optString10, optInt, optInt2, oc.k(optJSONObject14));
                    optJSONObject14.optInt(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
                    if (optString10.endsWith(".m3u8") && !kqz0.a.b) {
                        gu8.c(null, "CommonVideoParser: HLS Video does not supported, add 'androidx.media3:media3-exoplayer-hls' dependency to play HLS video ");
                        f2.c(3009, "HLS Video does not supported, add...");
                    } else if (sgz0Var == null) {
                        arrayList.add(sgz0Var);
                    }
                }
                sgz0Var = null;
                if (sgz0Var == null) {
                }
            } else {
                z2 = z3;
                f2.g(i4);
            }
            i5++;
            z3 = z2;
            i4 = 3007;
        }
        boolean z4 = z3;
        if (arrayList.size() > 0) {
            sgz0 a5 = sgz0.a(u6z0Var.d, arrayList);
            if (a5 != null) {
                lgz0Var.v0 = a5;
                return z;
            }
            ooy0Var.h(3007, "Unable to find best video data for q=" + u6z0Var.d);
        }
        ooy0Var.h(3008, "no video data parsed");
        return z4;
    }
}
