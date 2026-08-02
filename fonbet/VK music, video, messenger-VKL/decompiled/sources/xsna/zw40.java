package xsna;

import com.vk.music.player.MusicCountDownTimer;
import xsna.by40;
import xsna.k840;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class zw40 implements MusicCountDownTimer.a {
    public boolean b;
    public final /* synthetic */ rw40 c;

    public zw40(rw40 rw40Var) {
        this.c = rw40Var;
        com.vk.music.player.d dVar = k840.a.f;
        this.b = (dVar == null ? null : dVar).b();
    }

    public final void a() {
        com.vk.music.player.d dVar = k840.a.f;
        if (dVar == null) {
            dVar = null;
        }
        boolean b = dVar.b();
        if (b == this.b) {
            return;
        }
        this.c.T(new by40.a0(b));
        this.b = b;
    }

    @Override // com.vk.music.player.MusicCountDownTimer.a
    public final void n0() {
        a();
    }

    @Override // com.vk.music.player.MusicCountDownTimer.a
    public final void s0(long j) {
        a();
    }

    @Override // com.vk.music.player.MusicCountDownTimer.a
    public final void u0() {
        a();
    }
}
