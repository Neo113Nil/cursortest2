package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: VkOnboardingHighlighter.kt */
/* loaded from: classes17.dex */
public final class v7v0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;

    public v7v0(View view, gzs<s3q0> gzsVar) {
        this.b = view;
        this.c = gzsVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.c.invoke();
    }
}
