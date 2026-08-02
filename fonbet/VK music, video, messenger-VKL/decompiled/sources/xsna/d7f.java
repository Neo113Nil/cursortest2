package xsna;

import android.animation.ValueAnimator;

/* compiled from: ClipsTemplateEditorCropperView.kt */
/* loaded from: classes16.dex */
public final class d7f implements dcn {
    public final /* synthetic */ ValueAnimator b;

    public d7f(ValueAnimator valueAnimator) {
        this.b = valueAnimator;
    }

    @Override // xsna.dcn
    public final void dismiss() {
        this.b.cancel();
    }
}
