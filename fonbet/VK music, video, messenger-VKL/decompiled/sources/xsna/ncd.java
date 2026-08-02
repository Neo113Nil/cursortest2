package xsna;

import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;

/* compiled from: ClipSeekBarView.kt */
/* loaded from: classes16.dex */
public final class ncd implements ui6 {
    public final /* synthetic */ ClipSeekBarView a;

    public ncd(ClipSeekBarView clipSeekBarView) {
        this.a = clipSeekBarView;
    }

    @Override // xsna.ui6
    public final void a(BaseSlider baseSlider) {
        ClipSeekBarView.b(this.a, (Slider) baseSlider, true);
    }

    @Override // xsna.ui6
    public final void b(BaseSlider baseSlider) {
        ClipSeekBarView.b(this.a, (Slider) baseSlider, false);
    }
}
