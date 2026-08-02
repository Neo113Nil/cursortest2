package xsna;

import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonMessageParser.kt */
/* loaded from: classes5.dex */
public final class r9y {
    public static final Regex a = new Regex("[+-]?([0-9]*[.])?[0-9]+");

    public static String a(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString(str);
            if (drm0.N(string)) {
                return null;
            }
            return string;
        } catch (JSONException unused) {
            return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static xsna.pje0 b(org.json.JSONObject r31) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.r9y.b(org.json.JSONObject):xsna.pje0");
    }

    public static Integer c(String str) {
        if (str != null && !drm0.N(str)) {
            try {
                hl10 b = a.b(str);
                String group = b != null ? b.a.group() : null;
                if (group != null) {
                    return Integer.valueOf((int) Float.parseFloat(group));
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
