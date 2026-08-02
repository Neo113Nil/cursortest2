package one.video.player.live.media.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes8.dex */
public class AudioPlayerNative {
    private static final String TAG = "AudioPlayerNative";
    private final int bufferMs;
    private final int channelCount;
    private long nativeHandle;
    private final int sampleRate;
    private final int systemBufferSize;
    private final int systemSampleRate;
    private boolean voice;
    private float volume = 1.0f;

    static {
        System.loadLibrary("laplayer");
    }

    public AudioPlayerNative(@NonNull Context context, @Nullable String str, int i, int i2, int i3) {
        this.sampleRate = i;
        this.channelCount = i2;
        this.bufferMs = i3;
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
        int i4 = 44100;
        int parseInt = property != null ? Integer.parseInt(property) : 44100;
        int parseInt2 = property2 != null ? Integer.parseInt(property2) : 256;
        if (!z && (parseInt == 44100 || parseInt == 48000)) {
            i4 = parseInt;
        }
        this.systemSampleRate = i4;
        this.systemBufferSize = parseInt2;
    }

    private static boolean modelMatches(@NonNull JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(Build.BRAND.toLowerCase(Locale.ROOT))) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (Pattern.matches(optJSONArray.getString(i), Build.MODEL)) {
                return true;
            }
        }
        return false;
    }

    private native int nativeGetBufferSize(long j);

    private native void nativeSetVoice(long j, boolean z);

    private native void nativeSetVolume(long j, float f);

    private native long nativeStart(int i, int i2, int i3, int i4, int i5, String str);

    private native void nativeStop(long j);

    private native void nativeWriteAudioSamples(long j, ByteBuffer byteBuffer, int i);

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.nativeHandle;
        if (j != 0) {
            nativeStop(j);
            this.nativeHandle = 0L;
        }
    }

    public synchronized int getBufferedMS() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetBufferSize(j);
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public float getVolume() {
        return this.volume;
    }

    public synchronized void play() {
        try {
            try {
                if (this.nativeHandle != 0) {
                    return;
                }
                long nativeStart = nativeStart(this.systemSampleRate, this.systemBufferSize, this.sampleRate, this.channelCount, this.bufferMs, Environment.getExternalStorageDirectory().getAbsolutePath());
                this.nativeHandle = nativeStart;
                nativeSetVoice(nativeStart, this.voice);
                nativeSetVolume(this.nativeHandle, this.volume);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized void setVoice(boolean z) {
        this.voice = z;
        long j = this.nativeHandle;
        if (j != 0) {
            nativeSetVoice(j, z);
        }
    }

    public synchronized void setVolume(float f) {
        if (f != this.volume) {
            this.volume = f;
            long j = this.nativeHandle;
            if (j != 0) {
                nativeSetVolume(j, f);
            }
        }
    }

    public synchronized void stop() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeStop(j);
            this.nativeHandle = 0L;
        }
    }

    public synchronized void writeAudioSamples(ByteBuffer byteBuffer, int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return;
        }
        nativeWriteAudioSamples(j, byteBuffer, i / 2);
    }
}
