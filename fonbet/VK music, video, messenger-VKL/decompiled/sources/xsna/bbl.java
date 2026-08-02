package xsna;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.a;

/* compiled from: DefaultAudioOffloadSupportProvider.java */
/* loaded from: classes12.dex */
public final class bbl {

    @Nullable
    public final Context a;
    public Boolean b;

    public bbl(@Nullable Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final androidx.media3.exoplayer.audio.a a(androidx.media3.common.a aVar, nc4 nc4Var) {
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        aVar.getClass();
        int i = aVar.G;
        nc4Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return androidx.media3.exoplayer.audio.a.d;
        }
        Boolean bool = this.b;
        boolean z = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = hq4.a(context).getParameters("offloadVariableRateSupported");
                this.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.b = Boolean.FALSE;
            }
            booleanValue = this.b.booleanValue();
        }
        String str = aVar.n;
        str.getClass();
        int d = io20.d(str, aVar.k);
        if (d == 0 || i2 < y2r0.s(d)) {
            return androidx.media3.exoplayer.audio.a.d;
        }
        int t = y2r0.t(aVar.F);
        if (t == 0) {
            return androidx.media3.exoplayer.audio.a.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(t).setEncoding(d).build();
            if (i2 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, nc4Var.a());
                if (!isOffloadedPlaybackSupported) {
                    return androidx.media3.exoplayer.audio.a.d;
                }
                a.C0048a c0048a = new a.C0048a();
                c0048a.a = true;
                c0048a.c = booleanValue;
                return c0048a.a();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, nc4Var.a());
            if (playbackOffloadSupport == 0) {
                return androidx.media3.exoplayer.audio.a.d;
            }
            a.C0048a c0048a2 = new a.C0048a();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            c0048a2.a = true;
            c0048a2.b = z;
            c0048a2.c = booleanValue;
            return c0048a2.a();
        } catch (IllegalArgumentException unused) {
            return androidx.media3.exoplayer.audio.a.d;
        }
    }
}
