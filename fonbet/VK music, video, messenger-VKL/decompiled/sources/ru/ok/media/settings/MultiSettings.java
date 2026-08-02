package ru.ok.media.settings;

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
import xsna.t33;

/* loaded from: classes9.dex */
public class MultiSettings {
    private static final String TAG = "ru.ok.media.settings.MultiSettings";
    private final JSONObject confObj;
    private static final Pattern rulesSplitter = Pattern.compile(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, 16);
    private static final Pattern ruleComponentsSplitter = Pattern.compile(" ", 16);

    public MultiSettings(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse config " + str, e);
            jSONObject = null;
        }
        this.confObj = jSONObject;
    }

    public Double applyRules(double d, String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : rulesSplitter.split(str)) {
            String[] split = ruleComponentsSplitter.split(str2);
            try {
                if (split[0].equals("reset")) {
                    return null;
                }
                if (split.length != 2) {
                    throw new IllegalArgumentException("bad rule " + str2);
                }
                String str3 = split[0];
                switch (str3.hashCode()) {
                    case 107876:
                        if (str3.equals(InneractiveMediationNameConsts.MAX)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108114:
                        if (str3.equals(UcumUtils.UCUM_MINUTES)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108484:
                        if (str3.equals("mul")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 113762:
                        if (str3.equals("set")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3444122:
                        if (str3.equals("plus")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    d = Double.parseDouble(split[1]);
                } else if (c == 1) {
                    d *= Double.parseDouble(split[1]);
                } else if (c == 2) {
                    d += Double.parseDouble(split[1]);
                } else if (c == 3) {
                    d = Math.min(d, Double.parseDouble(split[1]));
                } else if (c == 4) {
                    d = Math.max(d, Double.parseDouble(split[1]));
                }
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return Double.valueOf(d);
    }

    @Nullable
    public JSONObject findMatch(String str, String str2) throws JSONException {
        String findName;
        JSONObject configObj = getConfigObj(str);
        if (configObj == null || (findName = findName(configObj.names(), str2)) == null) {
            return null;
        }
        return configObj.getJSONObject(findName);
    }

    @Nullable
    public String findName(JSONArray jSONArray, String str) throws JSONException {
        String str2 = null;
        if (str == null) {
            return null;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            str2 = jSONArray.getString(i);
            if (Pattern.matches(str2, str)) {
                return str2;
            }
        }
        return str2;
    }

    @Nullable
    public JSONObject getConfigObj(String str) {
        try {
            JSONObject jSONObject = this.confObj;
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.getJSONObject(str);
        } catch (JSONException e) {
            String str2 = TAG;
            StringBuilder a = t33.a("Failed to get config '", str, "' from ");
            a.append(this.confObj);
            Log.e(str2, a.toString(), e);
            return null;
        }
    }
}
