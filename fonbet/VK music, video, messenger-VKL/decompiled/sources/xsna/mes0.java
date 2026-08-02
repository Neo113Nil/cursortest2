package xsna;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: VideoDecoderSettings.java */
/* loaded from: classes8.dex */
public final class mes0 {
    public static final Pattern b = Pattern.compile(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, 16);
    public static final Pattern c = Pattern.compile(" ", 16);
    public final JSONObject a;

    public mes0() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject("{\n\"max.isz\":{\".*\":{r:\"mul 0.3\"}}\n}");
        } catch (JSONException e) {
            Log.e("xsna.mes0", "Failed to parse config {\n\"max.isz\":{\".*\":{r:\"mul 0.3\"}}\n}", e);
            jSONObject = null;
        }
        this.a = jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a(String str) throws JSONException {
        JSONObject jSONObject;
        String str2;
        JSONObject jSONObject2 = this.a;
        if (jSONObject2 != null) {
            try {
                jSONObject = jSONObject2.getJSONObject("max.isz");
            } catch (JSONException e) {
                Log.e("xsna.mes0", "Failed to get config 'max.isz' from " + jSONObject2, e);
            }
            if (jSONObject != null) {
                JSONArray names = jSONObject.names();
                if (str == null) {
                    str2 = null;
                } else {
                    str2 = null;
                    for (int i = 0; i < names.length(); i++) {
                        str2 = names.getString(i);
                        if (Pattern.matches(str2, str)) {
                            break;
                        }
                    }
                }
                if (str2 != null) {
                    return jSONObject.getJSONObject(str2);
                }
            }
            return null;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer b(String str, int i) {
        String str2;
        Double valueOf;
        char c2;
        JSONObject a;
        try {
            a = a(str);
        } catch (JSONException unused) {
        }
        if (a != null) {
            str2 = a.getString("r");
            double d = i;
            if (!TextUtils.isEmpty(str2)) {
                for (String str3 : b.split(str2)) {
                    String[] split = c.split(str3);
                    try {
                        if (!split[0].equals("reset")) {
                            if (split.length != 2) {
                                throw new IllegalArgumentException("bad rule " + str3);
                            }
                            String str4 = split[0];
                            switch (str4.hashCode()) {
                                case 107876:
                                    if (str4.equals(InneractiveMediationNameConsts.MAX)) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 108114:
                                    if (str4.equals(UcumUtils.UCUM_MINUTES)) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 108484:
                                    if (str4.equals("mul")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 113762:
                                    if (str4.equals("set")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3444122:
                                    if (str4.equals("plus")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                d = Double.parseDouble(split[1]);
                            } else if (c2 == 1) {
                                d *= Double.parseDouble(split[1]);
                            } else if (c2 == 2) {
                                d += Double.parseDouble(split[1]);
                            } else if (c2 == 3) {
                                d = Math.min(d, Double.parseDouble(split[1]));
                            } else if (c2 == 4) {
                                d = Math.max(d, Double.parseDouble(split[1]));
                            }
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                valueOf = Double.valueOf(d);
                if (valueOf != null) {
                    return Integer.valueOf(valueOf.intValue());
                }
                return null;
            }
            valueOf = null;
            if (valueOf != null) {
            }
        }
        str2 = null;
        double d2 = i;
        if (!TextUtils.isEmpty(str2)) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
    }
}
