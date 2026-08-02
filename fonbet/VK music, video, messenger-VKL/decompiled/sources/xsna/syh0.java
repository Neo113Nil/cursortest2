package xsna;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: SearchSpellcheckVh.kt */
/* loaded from: classes16.dex */
public final class syh0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TextView b;

    public syh0(TextView textView) {
        this.b = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView = this.b;
        textView.requestLayout();
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
