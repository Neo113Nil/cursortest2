package xsna;

import android.content.Context;
import com.vk.music.player.api.helper.AudioPlayer;
import java.util.concurrent.atomic.AtomicReference;
import xsna.k840;
import xsna.miq;

/* compiled from: AudioPlayerProviderImpl.kt */
/* loaded from: classes3.dex */
public final class ct4 {
    public final ix40 a;
    public final k5q b;
    public final ks4 c;
    public final hx40 d;
    public final aw40 e;
    public final otp f;
    public final xs4 g;
    public final boolean h;
    public final bpn0 i;
    public float j;
    public float k;

    public ct4(ix40 ix40Var, k5q k5qVar, cy1 cy1Var, hx40 hx40Var, aw40 aw40Var, otp otpVar, xs4 xs4Var) {
        this.a = ix40Var;
        this.b = k5qVar;
        this.c = cy1Var;
        this.d = hx40Var;
        this.e = aw40Var;
        this.f = otpVar;
        this.g = xs4Var;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        this.h = com.vk.toggle.d.T(k840.a.i.b());
        this.i = new bpn0(new wm1(this, 2));
        this.j = 1.0f;
        this.k = 1.0f;
    }

    public final AudioPlayer a() {
        gt4 gt4Var;
        qs4 b = b();
        AudioPlayer audioPlayer = (b == null || (gt4Var = b.a) == null) ? null : gt4Var.a;
        if (audioPlayer != null) {
            return audioPlayer;
        }
        throw new IllegalArgumentException("[ExoPlayerProvider#getPlayer] - Player not initialized");
    }

    public final qs4 b() {
        return (qs4) ((AtomicReference) this.i.getValue()).get();
    }

    public final boolean c() {
        return b() != null;
    }

    public final gt4 d(boolean z) {
        en4 en4Var = new en4(this.f, this.e.f0());
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        AudioPlayer b = this.g.b(context, z);
        b.setVolume(this.j);
        b.setPlaybackSpeed(this.k);
        b.g(this.c);
        return new gt4(b, new kiq(4000L, miq.a.a, new com.vk.movika.sdk.base.ui.s0(2, this, b)), en4Var);
    }

    public final void e(gt4 gt4Var, boolean z) {
        AudioPlayer audioPlayer = gt4Var.a;
        en4 en4Var = gt4Var.c;
        audioPlayer.f(en4Var);
        audioPlayer.j(this.c);
        k5q k5qVar = this.b;
        audioPlayer.j(k5qVar);
        audioPlayer.f(k5qVar);
        audioPlayer.f(this.a);
        if (!z) {
            audioPlayer.stop();
            audioPlayer.release();
        }
        en4Var.d();
        AudioPlayer audioPlayer2 = gt4Var.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        this.g.c(context, audioPlayer2);
    }
}
