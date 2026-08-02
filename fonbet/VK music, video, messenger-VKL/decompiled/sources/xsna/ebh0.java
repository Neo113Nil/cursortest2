package xsna;

import com.vk.clips.design.view.seek.ClipsSeekBar;

/* compiled from: ScreenContent.kt */
/* loaded from: classes17.dex */
public final class ebh0 implements ClipsSeekBar.b {
    public final /* synthetic */ wh50<Boolean> a;

    public ebh0(wh50<Boolean> wh50Var) {
        this.a = wh50Var;
    }

    @Override // com.vk.clips.design.view.seek.ClipsSeekBar.b
    public final void a() {
        this.a.setValue(Boolean.TRUE);
    }

    @Override // com.vk.clips.design.view.seek.ClipsSeekBar.b
    public final void b() {
        this.a.setValue(Boolean.FALSE);
    }
}
