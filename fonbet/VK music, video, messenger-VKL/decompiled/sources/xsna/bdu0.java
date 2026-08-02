package xsna;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: VkAutoFitTextView.kt */
/* loaded from: classes6.dex */
public final class bdu0 extends AppCompatTextView {
    public int b;
    public int c;

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b == 0 || this.c == 0 || getMeasuredWidth() == 0) {
            return;
        }
        setTextSize(0, Math.max(this.c * Math.min(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / getLayout().getLineWidth(0), 1.0f), this.b));
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        setTextSize(0, this.c);
        forceLayout();
    }
}
