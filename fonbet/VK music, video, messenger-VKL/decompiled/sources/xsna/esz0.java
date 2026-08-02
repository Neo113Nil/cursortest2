package xsna;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class esz0 {
    public static final o100 a = new o100("MetadataUtils", null);
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static void a(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new WebImage(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    @Nullable
    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WebImage webImage = (WebImage) it.next();
            webImage.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", webImage.c.toString());
                jSONObject.put("width", webImage.d);
                jSONObject.put("height", webImage.e);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Calendar c(String str) {
        String substring;
        String substring2;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        o100 o100Var = a;
        if (isEmpty) {
            o100Var.a("Input string is empty or null", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            o100Var.a("Input string is empty or null", new Object[0]);
        } else {
            try {
                substring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException e) {
                Log.e(o100Var.a, o100Var.c("Error extracting the date", new Object[0]), e);
            }
            if (!TextUtils.isEmpty(substring)) {
                o100Var.a("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    o100Var.a("string is empty or null", new Object[0]);
                } else {
                    int indexOf = str.indexOf(84);
                    int i = indexOf + 1;
                    if (indexOf == 8) {
                        try {
                            substring2 = str.substring(i);
                            if (substring2.length() != 6) {
                                char charAt = substring2.charAt(6);
                                String[] strArr = b;
                                if (charAt == '+' || charAt == '-') {
                                    int length = substring2.length();
                                    if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        substring2 = substring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                } else if (charAt == 'Z' && substring2.length() == strArr[0].length() + 6) {
                                    substring2 = String.valueOf(substring2.substring(0, substring2.length() - 1)).concat("+0000");
                                }
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            Log.e(o100Var.a, o100Var.c("Error extracting the time substring: %s", new Object[0]), e2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            substring = tdj.a(new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(substring2).length()), substring, "T", substring2);
                            str2 = substring2.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
                        } else {
                            str2 = "yyyyMMdd";
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                        return calendar;
                    }
                    o100Var.a("T delimeter is not found", new Object[0]);
                }
                calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                return calendar;
            } catch (ParseException e3) {
                Log.e(o100Var.a, o100Var.c("Error parsing string", new Object[0]), e3);
                return null;
            }
            substring2 = null;
            if (TextUtils.isEmpty(substring2)) {
            }
            Calendar calendar2 = Calendar.getInstance();
        }
        substring = null;
        if (!TextUtils.isEmpty(substring)) {
        }
    }
}
