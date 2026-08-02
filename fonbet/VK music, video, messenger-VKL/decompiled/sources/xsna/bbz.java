package xsna;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: LinkTouchMovementMethod.kt */
/* loaded from: classes15.dex */
public final class bbz extends LinkMovementMethod {
    public kdp0 a;

    public static kdp0 a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
        int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        return (kdp0) rl3.O((kdp0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, kdp0.class));
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            kdp0 a = a(textView, spannable, motionEvent);
            this.a = a;
            if (a != null) {
                a.e = true;
                Selection.setSelection(spannable, spannable.getSpanStart(a), spannable.getSpanEnd(a));
            }
        } else {
            if (action != 2) {
                kdp0 kdp0Var = this.a;
                if (kdp0Var != null) {
                    kdp0Var.e = false;
                }
                super.onTouchEvent(textView, spannable, motionEvent);
                this.a = null;
                Selection.removeSelection(spannable);
                return true;
            }
            kdp0 a2 = a(textView, spannable, motionEvent);
            kdp0 kdp0Var2 = this.a;
            if (kdp0Var2 != null && !epx.f(a2, kdp0Var2)) {
                kdp0 kdp0Var3 = this.a;
                if (kdp0Var3 != null) {
                    kdp0Var3.e = false;
                }
                this.a = null;
                Selection.removeSelection(spannable);
                return true;
            }
        }
        return true;
    }
}
