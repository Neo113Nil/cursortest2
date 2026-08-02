package xsna;

import com.vk.music.player.core.audioeffect.fade.FadeDirection;
import com.vk.music.player.error.VkPlayerException;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FadeAudioEffectMusicPlayerListener.kt */
/* loaded from: classes3.dex */
public final class hiq extends vtl {
    public final fiq c;
    public final Object d;
    public long e;

    public hiq(fiq fiqVar, px40 px40Var, hx40 hx40Var) {
        super(px40Var);
        this.c = fiqVar;
        this.d = msy.a(LazyThreadSafetyMode.NONE, new lb6(10, this, hx40Var));
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vtl, xsna.px40
    public final void i(ly40 ly40Var) {
        super.i(ly40Var);
        long j = ly40Var.b;
        long j2 = this.e;
        fiq fiqVar = this.c;
        if (j2 < fiqVar.a() || j < this.e - fiqVar.b()) {
            return;
        }
        ((kiq) this.d.getValue()).b(FadeDirection.OUT);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vtl, xsna.px40
    public final void l(cz40 cz40Var) {
        super.l(cz40Var);
        ((kiq) this.d.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vtl, xsna.px40
    public final void onStop() {
        super.onStop();
        ((kiq) this.d.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vtl, xsna.px40
    public final void q(ky40 ky40Var) {
        super.q(ky40Var);
        long j = ky40Var.e;
        this.e = j;
        if (j >= this.c.a()) {
            ((kiq) this.d.getValue()).b(FadeDirection.IN);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vtl, xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        super.v(cz40Var, vkPlayerException);
        ((kiq) this.d.getValue()).a();
    }
}
