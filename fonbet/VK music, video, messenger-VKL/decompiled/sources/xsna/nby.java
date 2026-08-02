package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class nby {
    public static final Pattern a;

    static {
        Pattern.compile("\\\\.");
        a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        int i;
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null && obj2 != null) {
            try {
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    if (jSONObject.length() == jSONObject2.length()) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (jSONObject2.has(next)) {
                                exc0.i(next);
                                if (a(jSONObject.get(next), jSONObject2.get(next))) {
                                }
                            }
                        }
                        return true;
                    }
                } else {
                    if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                        return obj.equals(obj2);
                    }
                    JSONArray jSONArray = (JSONArray) obj;
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    if (jSONArray.length() == jSONArray2.length()) {
                        for (0; i < jSONArray.length(); i + 1) {
                            i = a(jSONArray.get(i), jSONArray2.get(i)) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    @Nullable
    public static String b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = a.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (charAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
