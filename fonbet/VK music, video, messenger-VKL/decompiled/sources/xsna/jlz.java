package xsna;

import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;

/* compiled from: LiveSeekView.kt */
/* loaded from: classes2.dex */
public final class jlz implements ui6 {
    public final /* synthetic */ klz a;

    public jlz(klz klzVar) {
        this.a = klzVar;
    }

    @Override // xsna.ui6
    public final void a(BaseSlider baseSlider) {
        this.a.i = true;
    }

    @Override // xsna.ui6
    public final void b(BaseSlider baseSlider) {
        Slider slider = (Slider) baseSlider;
        klz klzVar = this.a;
        klzVar.i = false;
        elz elzVar = klzVar.d;
        if (elzVar != null) {
            elzVar.b2((long) slider.getValue());
        }
    }
}
