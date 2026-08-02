package xsna;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import com.vk.core.view.components.text.VkText;

/* compiled from: ClickableSpanTextView.kt */
/* loaded from: classes17.dex */
public final class wjc extends VkText {
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence text = getText();
        Layout layout = getLayout();
        int action = motionEvent.getAction();
        if (layout != null && ((action == 0 || action == 1) && (text instanceof Spanned))) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = getScrollX() + totalPaddingLeft;
            int scrollY = getScrollY() + totalPaddingTop;
            ClickableSpan[] clickableSpanArr = null;
            if (scrollY >= 0 && scrollY <= layout.getHeight()) {
                int lineForVertical = layout.getLineForVertical(scrollY);
                float f = scrollX;
                if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                }
            }
            if (clickableSpanArr != null) {
                if (!(clickableSpanArr.length == 0)) {
                    ClickableSpan clickableSpan = (ClickableSpan) rl3.L(clickableSpanArr);
                    if (action == 1) {
                        clickableSpan.onClick(this);
                    }
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
