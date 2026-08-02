package xsna;

import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import xsna.ngd;

/* compiled from: RangeWaveFormController.kt */
/* loaded from: classes16.dex */
public final class qwe0 implements m9i0 {
    public static final int c = iah0.f().widthPixels - iah0.a(60);
    public final ClipsAudioFragment.d b;

    public qwe0(ClipsAudioFragment.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.m9i0
    public final void g() {
        this.b.invoke(ngd.a.b);
    }

    @Override // xsna.m9i0
    public final void h1() {
        this.b.invoke(ngd.i.b);
    }

    @Override // xsna.m9i0
    public final void i1(int i, int i2, int i3, boolean z) {
        this.b.invoke(new ngd.m(i2, i3));
    }

    @Override // xsna.m9i0
    public final void r1(int i, int i2, int i3, boolean z) {
        this.b.invoke(new ngd.l((i3 - i2) / 1000.0f));
    }
}
