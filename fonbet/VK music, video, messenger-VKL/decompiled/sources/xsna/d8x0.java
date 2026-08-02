package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes7.dex */
public final class d8x0 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public d8x0(View view, float f) {
        this.b = view;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.c;
        View view = this.b;
        if (f == 270.0f) {
            view.setTranslationX((-view.getWidth()) / 1.5f);
        } else if (f == 90.0f) {
            view.setTranslationX(view.getWidth() / 1.5f);
        }
    }
}
