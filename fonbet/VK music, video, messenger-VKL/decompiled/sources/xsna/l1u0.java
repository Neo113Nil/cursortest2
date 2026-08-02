package xsna;

import android.view.View;

/* compiled from: ViewTransformConsumer.kt */
/* loaded from: classes8.dex */
public final class l1u0 implements xjp0 {
    public final View a;

    public l1u0(View view) {
        this.a = view;
    }

    @Override // xsna.xjp0
    public final void a(float f, float f2, float f3, float f4) {
        View view = this.a;
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setTranslationX(f3);
        view.setTranslationY(f4);
    }
}
