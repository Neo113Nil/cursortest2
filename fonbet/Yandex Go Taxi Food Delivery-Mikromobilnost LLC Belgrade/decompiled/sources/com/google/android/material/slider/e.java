package com.google.android.material.slider;

/* loaded from: classes11.dex */
public final class e implements Runnable {
    public int a = -1;
    public final /* synthetic */ BaseSlider b;

    public e(BaseSlider baseSlider) {
        this.b = baseSlider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        fVar = this.b.accessibilityHelper;
        fVar.p(this.a, 4);
    }
}
