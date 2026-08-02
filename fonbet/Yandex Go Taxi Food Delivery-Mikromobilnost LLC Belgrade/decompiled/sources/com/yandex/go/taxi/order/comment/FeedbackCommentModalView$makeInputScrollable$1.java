package com.yandex.go.taxi.order.comment;

import android.view.MotionEvent;
import android.view.View;
import defpackage.t8;
import kotlin.Metadata;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/yandex/go/taxi/order/comment/FeedbackCommentModalView$makeInputScrollable$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FeedbackCommentModalView$makeInputScrollable$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ KeyboardAwareRobotoEditText $editText;

    public FeedbackCommentModalView$makeInputScrollable$1(KeyboardAwareRobotoEditText keyboardAwareRobotoEditText) {
        this.$editText = keyboardAwareRobotoEditText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewAttachedToWindow$lambda$0(KeyboardAwareRobotoEditText keyboardAwareRobotoEditText, View view, MotionEvent motionEvent) {
        if (keyboardAwareRobotoEditText.hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 8) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.$editText;
        keyboardAwareRobotoEditText.setOnTouchListener(new t8(8, keyboardAwareRobotoEditText));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
    }
}
