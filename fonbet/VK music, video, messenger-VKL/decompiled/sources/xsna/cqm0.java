package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StringExt.kt */
/* loaded from: classes.dex */
public final class cqm0 {
    public static final bpn0 a = new bpn0(new l03(10));

    public static final String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final String b(String str) {
        return myc0.f(str) ? str.substring(0, 1).toUpperCase(Locale.getDefault()).concat(str.substring(1)) : str;
    }

    public static final SpannableStringBuilder c(int i, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static final String d(String str) {
        Regex regex = new Regex("\\s+\n");
        return drm0.p0(new Regex("\n+").g(new Regex("\n\\s+").g(regex.g(str, "\n"), "\n"), "\n")).toString();
    }

    public static final String e(String str) {
        return brm0.y(str, "\n", "");
    }

    public static final String f(String str) {
        if (str == null) {
            return "";
        }
        String y = brm0.y(str, "<br>", System.lineSeparator());
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = ((Pattern) a.getValue()).matcher(y);
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group == null) {
                throw new IllegalStateException("Should not be null!");
            }
            String str2 = "\\\\\"";
            if (brm0.B(group, "#", false)) {
                char parseInt = (char) Integer.parseInt(group.substring(1));
                if (parseInt == '\\') {
                    str2 = "\\\\\\\\";
                } else if (parseInt != '\"') {
                    str2 = Character.isISOControl(parseInt) ? "" : String.valueOf(parseInt);
                }
            } else if ("gt".equalsIgnoreCase(group)) {
                str2 = ">";
            } else if ("lt".equalsIgnoreCase(group)) {
                str2 = "<";
            } else if ("amp".equalsIgnoreCase(group)) {
                str2 = "&";
            } else if (!"quot".equalsIgnoreCase(group)) {
                str2 = "ndash".equalsIgnoreCase(group) ? "-" : "?";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static final Integer g(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final int h(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final JSONArray i(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    public static final JSONObject j(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static final Long k(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final long l(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static final String m(String str) {
        return str.toLowerCase(Locale.getDefault());
    }

    public static final String n(String str) {
        return str.toUpperCase(Locale.getDefault());
    }

    public static final String o(String str, boolean z) {
        return z ? str.toUpperCase(Locale.getDefault()) : str;
    }

    public static final String p(String str) {
        try {
            return URLDecoder.decode(str, emb.b.displayName());
        } catch (IllegalArgumentException unused) {
            return URLDecoder.decode(brm0.y(str, "%", "%25"), emb.b.displayName());
        }
    }
}
