package ru.ok.audio.util;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.vu5;

/* loaded from: classes9.dex */
public class SystemAudioConfiguration {
    public static final String AUDIO_SYSTEM_CONFIG_KEY = "publisher.audio.system.config";
    private static final String TAG = "ru.ok.audio.util.SystemAudioConfiguration";
    private final int bufferSize;
    private final int samplerate;

    private SystemAudioConfiguration(int i, int i2) {
        this.samplerate = i;
        this.bufferSize = i2;
    }

    public static SystemAudioConfiguration getSystemConfig(Context context, String str) {
        boolean z = false;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    if (modelMatches(new JSONObject(str).optJSONObject("force44K"))) {
                        z = true;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        int i = 44100;
        int parseInt = property != null ? Integer.parseInt(property) : 44100;
        int parseInt2 = property2 != null ? Integer.parseInt(property2) : 256;
        if (!z && (parseInt == 44100 || parseInt == 48000)) {
            i = parseInt;
        }
        return new SystemAudioConfiguration(i, parseInt2);
    }

    private static boolean modelMatches(JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(Build.BRAND.toLowerCase())) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (Pattern.matches(optJSONArray.getString(i), Build.MODEL)) {
                return true;
            }
        }
        return false;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public int getSamplerate() {
        return this.samplerate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SystemAudioConfiguration{samplerate=");
        sb.append(this.samplerate);
        sb.append(", bufferSize=");
        return vu5.b(sb, this.bufferSize, '}');
    }
}
