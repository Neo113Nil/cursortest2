package xsna;

import android.text.TextUtils;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.wty0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class t4z0 {
    public static String a(JSONObject jSONObject, String str, boolean z, ooy0 ooy0Var) {
        String optString = jSONObject.optString("url");
        if (s770.k(optString)) {
            return optString;
        }
        if (!optString.isEmpty()) {
            ooy0Var.a("url").c(3007, optString);
        }
        if (str == null || !z) {
            return null;
        }
        String concat = str.concat("&reason=");
        boolean isNull = jSONObject.isNull("id");
        int optInt = jSONObject.optInt("id");
        if (!isNull) {
            if (optInt >= 1) {
                return concat + optInt;
            }
            ooy0Var.a("id").b(3007);
        }
        return concat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0198, code lost:
    
        if (r25 == null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wty0 b(JSONObject jSONObject, ooy0 ooy0Var) {
        int length;
        wty0 wty0Var;
        ArrayList arrayList;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        ooy0 ooy0Var2;
        String str4;
        String str5;
        String str6;
        wty0.a aVar;
        String str7;
        q4z0 q4z0Var;
        l5z0 l5z0Var;
        String str8 = "iconLink";
        String optString = jSONObject.optString("iconLink");
        if (TextUtils.isEmpty(optString) || !s770.k(optString)) {
            ooy0 a = ooy0Var.a("iconLink");
            if (TextUtils.isEmpty(optString)) {
                a.b(3006);
                return null;
            }
            a.c(3007, optString);
            return null;
        }
        String optString2 = jSONObject.optString("clickLink");
        if (TextUtils.isEmpty(optString2)) {
            ooy0Var.a("clickLink").b(3006);
        } else if (!s770.k(optString2)) {
            ooy0Var.a("clickLink").c(3007, optString2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_OPTIONS);
        String str9 = "complain";
        if (optJSONArray == null || (length = optJSONArray.length()) == 0) {
            str = "iconLink";
            str2 = optString2;
            str3 = "complain";
            arrayList = null;
            wty0Var = 0;
        } else {
            String optString3 = jSONObject.optString("closeUrl");
            if (!optString3.isEmpty()) {
                if (!s770.k(optString3)) {
                    ooy0Var.a("closeUrl").c(3007, optString3);
                }
                ooy0 a2 = ooy0Var.a(SignalingProtocol.KEY_OPTIONS);
                wty0Var = 0;
                wty0Var = 0;
                arrayList = new ArrayList();
                i = 0;
                while (i < length) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    JSONArray jSONArray = optJSONArray;
                    ooy0 f = a2.f(i);
                    if (optJSONObject == null) {
                        i2 = i;
                        f.g(3007);
                        str4 = str8;
                        str5 = optString2;
                        str6 = str9;
                        i3 = length;
                        ooy0Var2 = a2;
                    } else {
                        i2 = i;
                        i3 = length;
                        ooy0 a3 = f.a("type");
                        if (optJSONObject.has("type")) {
                            ooy0Var2 = a2;
                            String optString4 = optJSONObject.optString("type");
                            str4 = str8;
                            str5 = optString2;
                            if (optString4.equals(BuildConfig.FLAVOR) || optString4.equals("hide") || optString4.equals(str9)) {
                                str6 = str9;
                                String optString5 = optJSONObject.optString("name");
                                if (TextUtils.isEmpty(optString5)) {
                                    f.a("name").b(3006);
                                } else {
                                    boolean optBoolean = optJSONObject.optBoolean("shouldCloseAd", true);
                                    String optString6 = optJSONObject.optString("clickLink");
                                    String a4 = a(optJSONObject, optString3, optBoolean, f);
                                    if (!optString6.isEmpty() && !s770.k(optString6)) {
                                        f.a("clickLink").c(3007, optString6);
                                    }
                                    aVar = new wty0.a(optString5, optString4, a4, optString6, null, !optJSONObject.has("alias") ? null : optJSONObject.optString("alias"), optBoolean);
                                    if (aVar != null) {
                                        arrayList.add(aVar);
                                    }
                                    i = i2 + 1;
                                    optJSONArray = jSONArray;
                                    length = i3;
                                    a2 = ooy0Var2;
                                    str8 = str4;
                                    optString2 = str5;
                                    str9 = str6;
                                }
                            } else {
                                str6 = str9;
                                if (optString4.equals("copy")) {
                                    String optString7 = optJSONObject.optString("name");
                                    if (TextUtils.isEmpty(optString7)) {
                                        f.a("name").b(3006);
                                    } else {
                                        boolean optBoolean2 = optJSONObject.optBoolean("shouldCloseAd", true);
                                        String a5 = a(optJSONObject, optString3, optBoolean2, f);
                                        String optString8 = !optJSONObject.has("copyText") ? null : optJSONObject.optString("copyText");
                                        if (TextUtils.isEmpty(optString8)) {
                                            f.a("copyText").b(3006);
                                        } else {
                                            aVar = new wty0.a(optString7, "copy", a5, null, optString8, !optJSONObject.has("alias") ? null : optJSONObject.optString("alias"), optBoolean2);
                                            if (aVar != null) {
                                            }
                                            i = i2 + 1;
                                            optJSONArray = jSONArray;
                                            length = i3;
                                            a2 = ooy0Var2;
                                            str8 = str4;
                                            optString2 = str5;
                                            str9 = str6;
                                        }
                                    }
                                } else {
                                    a3.c(3007, optString4);
                                }
                            }
                        } else {
                            ooy0Var2 = a2;
                            a3.b(3006);
                            str4 = str8;
                            str5 = optString2;
                            str6 = str9;
                        }
                    }
                    aVar = null;
                    if (aVar != null) {
                    }
                    i = i2 + 1;
                    optJSONArray = jSONArray;
                    length = i3;
                    a2 = ooy0Var2;
                    str8 = str4;
                    optString2 = str5;
                    str9 = str6;
                }
                str = str8;
                str2 = optString2;
                str3 = str9;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            }
            optString3 = null;
            ooy0 a22 = ooy0Var.a(SignalingProtocol.KEY_OPTIONS);
            wty0Var = 0;
            wty0Var = 0;
            arrayList = new ArrayList();
            i = 0;
            while (i < length) {
            }
            str = str8;
            str2 = optString2;
            str3 = str9;
            if (arrayList.isEmpty()) {
            }
        }
        if (arrayList == null && (TextUtils.isEmpty(str2) || !s770.k(str2))) {
            if (!jSONObject.has(SignalingProtocol.KEY_OPTIONS)) {
                ooy0Var.a(SignalingProtocol.KEY_OPTIONS).b(3007);
            }
            return wty0Var;
        }
        try {
            str7 = jSONObject.getString("aboutCompany");
        } catch (JSONException unused) {
            str7 = wty0Var;
        }
        wty0 wty0Var2 = new wty0(new kiw(optString), str2);
        wty0Var2.c = arrayList;
        if (wty0Var2.d != null) {
            wty0Var2.d = wty0.a(arrayList);
        }
        wty0Var2.e = str7;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("hide");
        if (optJSONObject2 == null || optJSONObject2.length() == 0) {
            q4z0Var = wty0Var;
        } else {
            q4z0Var = new q4z0();
            q4z0Var.b = "";
            q4z0Var.c = "";
            q4z0Var.d = "";
            q4z0Var.a = "";
            optJSONObject2.optString(str);
            optJSONObject2.optString("fromIconLink");
            q4z0Var.a = optJSONObject2.optString("fromTitle");
            q4z0Var.b = optJSONObject2.optString("fromDescription");
            q4z0Var.c = optJSONObject2.optString("fromOptionsTitle");
            q4z0Var.d = optJSONObject2.optString("fromActionText");
        }
        wty0Var2.f = q4z0Var;
        JSONObject optJSONObject3 = jSONObject.optJSONObject(str3);
        if (optJSONObject3 == null || optJSONObject3.length() == 0) {
            l5z0Var = wty0Var;
        } else {
            l5z0Var = new l5z0();
            l5z0Var.a = "";
            l5z0Var.b = "";
            l5z0Var.c = "";
            l5z0Var.d = "";
            l5z0Var.e = "";
            l5z0Var.f = "";
            l5z0Var.a = optJSONObject3.optString("fromTitle");
            l5z0Var.b = optJSONObject3.optString("fromOptionsTitle");
            l5z0Var.c = optJSONObject3.optString("fromActionText");
            optJSONObject3.optString("resultIconLink");
            l5z0Var.d = optJSONObject3.optString("resultTitle");
            l5z0Var.e = optJSONObject3.optString("resultDescription");
            l5z0Var.f = optJSONObject3.optString("resultActionText");
        }
        wty0Var2.g = l5z0Var;
        return wty0Var2;
    }
}
