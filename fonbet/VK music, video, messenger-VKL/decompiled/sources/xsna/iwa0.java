package xsna;

import com.vk.dto.music.AudioStream;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.LoopMode;
import xsna.kw40;
import xsna.xua0;

/* compiled from: PlaybackMusicAnalyticsSnapshot.kt */
/* loaded from: classes3.dex */
public final class iwa0 implements t940 {
    public final kw40 a;
    public final p4b0 b;
    public final ak40 c;
    public final String d;
    public final float e;
    public final boolean f;
    public final float g;
    public final boolean h;
    public final LoopMode i;
    public final boolean j;
    public final boolean k;
    public final AudioStream l;
    public final boolean m;

    public iwa0(kw40 kw40Var, p4b0 p4b0Var, ak40 ak40Var, String str, float f, boolean z, a3b0 a3b0Var, boolean z2, boolean z3, AudioStream audioStream) {
        this.a = kw40Var;
        this.b = p4b0Var;
        this.c = ak40Var;
        this.d = str;
        this.e = f;
        this.f = z;
        this.g = (a().Mb() || a().Vb()) ? a3b0Var.a : 1.0f;
        this.h = a().Tb() ? a3b0Var.b : false;
        this.i = a().Tb() ? a3b0Var.c : LoopMode.NONE;
        this.j = a().Tb() ? z2 : false;
        this.k = a().Tb() ? z3 : false;
        this.l = a().Tb() ? audioStream : null;
        kw40.b bVar = kw40Var instanceof kw40.b ? (kw40.b) kw40Var : null;
        this.m = epx.f(bVar != null ? bVar.b : null, xua0.d.a);
    }

    public final MusicTrack a() {
        return this.b.b.a;
    }
}
