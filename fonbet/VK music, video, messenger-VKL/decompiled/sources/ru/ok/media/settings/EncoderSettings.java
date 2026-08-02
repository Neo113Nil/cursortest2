package ru.ok.media.settings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class EncoderSettings extends MultiSettings {
    private static final String MAX_INPUT_SIZE_KEY = "max.isz";
    private static final String TAG = "ru.ok.media.settings.EncoderSettings";
    private static final String YUV_CODEC_SETTINGS_KEY = "yuv.wl";

    public EncoderSettings(String str) {
        super(str);
    }

    private String getMaxInputRule(String str) {
        try {
            JSONObject findMatch = findMatch(MAX_INPUT_SIZE_KEY, str);
            if (findMatch == null) {
                return null;
            }
            return findMatch.getString("r");
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean codecYuvSupported(String str) throws JSONException {
        return findMatch(YUV_CODEC_SETTINGS_KEY, str) != null;
    }

    public Set<Integer> getBlacklistedResolutions(String str) {
        JSONArray jSONArray;
        try {
            JSONObject findMatch = findMatch(YUV_CODEC_SETTINGS_KEY, str);
            if (findMatch != null && (jSONArray = findMatch.getJSONArray("blacklist")) != null) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(Integer.valueOf(jSONArray.getInt(i)));
                }
                return hashSet;
            }
        } catch (JSONException unused) {
        }
        return Collections.EMPTY_SET;
    }

    public Integer getMaxInput(String str, int i) {
        Double applyRules = applyRules(i, getMaxInputRule(str));
        if (applyRules != null) {
            return Integer.valueOf(applyRules.intValue());
        }
        return null;
    }
}
