package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;

/* compiled from: MusicHidingToolbarVh.kt */
/* loaded from: classes16.dex */
public final class jl40 implements b780 {
    public final /* synthetic */ MusicHidingToolbarVh b;

    public jl40(MusicHidingToolbarVh musicHidingToolbarVh) {
        this.b = musicHidingToolbarVh;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        MusicHidingToolbarVh musicHidingToolbarVh = this.b;
        musicHidingToolbarVh.t.removeCallbacks((Runnable) musicHidingToolbarVh.D.getValue());
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
