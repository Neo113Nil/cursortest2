package yads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import xsna.az4;

/* loaded from: classes10.dex */
public final class df0 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public cf0 d;

    public df0(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.b = immersiveAudioLevel != 0;
    }

    public final boolean a(nx0 nx0Var, pk pkVar) {
        boolean canBeSpatialized;
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(mc3.a((MimeTypes.AUDIO_E_AC3_JOC.equals(nx0Var.m) && nx0Var.z == 16) ? 12 : nx0Var.z));
        int i = nx0Var.A;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        Spatializer spatializer = this.a;
        if (pkVar.g == null) {
            pkVar.g = new ok(pkVar);
        }
        canBeSpatialized = spatializer.canBeSpatialized(pkVar.g.a, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean b() {
        boolean isEnabled;
        isEnabled = this.a.isEnabled();
        return isEnabled;
    }

    public final void c() {
        cf0 cf0Var = this.d;
        if (cf0Var == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(cf0Var);
        Handler handler = this.c;
        int i = mc3.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final void a(if0 if0Var, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new cf0(if0Var);
            Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new az4(handler), this.d);
        }
    }

    public final boolean a() {
        boolean isAvailable;
        isAvailable = this.a.isAvailable();
        return isAvailable;
    }

    public static df0 a(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        spatializer = audioManager.getSpatializer();
        return new df0(spatializer);
    }
}
