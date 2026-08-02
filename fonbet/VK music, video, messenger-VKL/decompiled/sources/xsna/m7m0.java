package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.a05;

/* compiled from: StoryMusicPresenter.kt */
/* loaded from: classes16.dex */
public final class m7m0 implements a05.a {
    public final /* synthetic */ n7m0 a;

    public m7m0(n7m0 n7m0Var) {
        this.a = n7m0Var;
    }

    @Override // xsna.a05.a
    public final void a(Exception exc) {
        this.a.l = null;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.e, new Object[]{"Failed to extract waveform. Error: " + exc});
    }

    @Override // xsna.a05.a
    public final void b(float[] fArr) {
        i0q0.j(new k7m0(fArr.length, this.a, fArr));
    }

    @Override // xsna.a05.a
    public final void c(int i, float[] fArr) {
        i0q0.j(new k7m0(i, this.a, fArr));
    }
}
