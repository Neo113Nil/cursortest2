package xsna;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.Objects;
import one.video.player.live.DebugInfo;
import one.video.player.live.media.audio.AudioPlayerNative;

/* compiled from: LivePlayerImpl.java */
/* loaded from: classes8.dex */
public class qkz {
    public static final /* synthetic */ int u = 0;
    public final Context a;
    public volatile pkz b;
    public HandlerThread c;
    public okz d;
    public k e;
    public AudioPlayerNative f;
    public boolean i;
    public int j;
    public int k;
    public long l;
    public long m;
    public double n;
    public Handler o;
    public MediaFormat q;

    @Nullable
    public final String r;
    public final DebugInfo t;
    public int g = -1;
    public boolean h = false;
    public boolean p = false;
    public float s = 1.0f;

    public qkz(Context context, @Nullable DebugInfo debugInfo) {
        this.t = debugInfo;
        okz okzVar = new okz(this, debugInfo);
        this.d = okzVar;
        okzVar.j = new h3g0(this);
        this.a = context;
        this.r = "{\"force44K\":{\n\"samsung\":[\"SM-.*\"],\n\"huawei\":[\"SLA-.*\"],\n\"xiaomi\":[\"Redmi.*\"],\n\"google\":[\"Pixel 5\"]\n}}";
    }

    public static void a(qkz qkzVar, MediaFormat mediaFormat) {
        qkzVar.getClass();
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        AudioPlayerNative audioPlayerNative = qkzVar.f;
        if (audioPlayerNative != null && audioPlayerNative.getChannelCount() == integer && qkzVar.f.getSampleRate() == integer2) {
            return;
        }
        AudioPlayerNative audioPlayerNative2 = qkzVar.f;
        if (audioPlayerNative2 != null) {
            audioPlayerNative2.stop();
            qkzVar.f = null;
        }
        AudioPlayerNative audioPlayerNative3 = new AudioPlayerNative(qkzVar.a, qkzVar.r, integer2, integer, 1000);
        qkzVar.f = audioPlayerNative3;
        audioPlayerNative3.setVoice(false);
        qkzVar.f.setVolume(qkzVar.s);
        qkzVar.f.play();
    }

    public void b(boolean z) {
        throw null;
    }

    public void c(int i) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public void e(int i, int i2, String str) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public void g(int i, int i2, double d) {
        throw null;
    }

    public void h(int i) {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k() {
        throw null;
    }

    public void l() {
        throw null;
    }

    public final void m(Surface surface) {
        okz okzVar = this.d;
        if (okzVar != null) {
            if (okzVar.l == surface) {
                Objects.toString(surface);
                return;
            }
            Objects.toString(surface);
            okzVar.l = surface;
            okzVar.h.set(true);
        }
    }
}
