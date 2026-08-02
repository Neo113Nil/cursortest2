package com.yandex.plus.home.common.ui;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/yandex/plus/home/common/ui/DisabledEmptyLineClickLinkMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "<init>", "()V", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/MotionEvent;", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DisabledEmptyLineClickLinkMovementMethod extends LinkMovementMethod {
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        if (event.getAction() == 1) {
            float x = event.getX() + widget.getScrollX();
            int scrollY = widget.getScrollY() + ((int) event.getY());
            Layout layout = widget.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            float lineLeft = layout.getLineLeft(lineForVertical);
            float lineRight = layout.getLineRight(lineForVertical);
            if (lineLeft > x || x > lineRight) {
                return true;
            }
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
