package ru.ok.media.settings;

import org.json.JSONException;
import org.json.JSONObject;
import xsna.ne7;
import xsna.xy6;

/* loaded from: classes9.dex */
public class VideoDecoderSettings extends MultiSettings {
    private static final String MAX_INPUT_SIZE_KEY = "max.isz";
    private static final String TAG = "ru.ok.media.settings.VideoDecoderSettings";

    public VideoDecoderSettings(String str) {
        super(str);
    }

    private String getMaxInputRule(String str) {
        try {
            JSONObject findMatch = findMatch(MAX_INPUT_SIZE_KEY, str);
            if (findMatch == null) {
                return null;
            }
            return findMatch.getString("r");
        } catch (JSONException e) {
            ne7.K(TAG, "getMaxInputRule: ", e);
            return null;
        }
    }

    public Integer getMaxInput(String str, int i) {
        String maxInputRule = getMaxInputRule(str);
        Double applyRules = applyRules(i, maxInputRule);
        if (applyRules == null) {
            return null;
        }
        String str2 = TAG;
        StringBuilder b = xy6.b(i, "applied max input rule '", maxInputRule, "' to ", "; result:");
        b.append(applyRules);
        ne7.t(str2, b.toString());
        return Integer.valueOf(applyRules.intValue());
    }
}
