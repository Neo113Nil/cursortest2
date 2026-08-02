package com.yandex.messaging.views;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import defpackage.b2c;
import defpackage.ulz;
import defpackage.y2t;

/* loaded from: classes15.dex */
public class ClickableSpanHandler implements View.OnTouchListener {
    private b2c mDelegate;
    private final y2t mGestureDetectorCompat;
    private Object mHighlightSpan;
    private final TextView mTextView;

    public ClickableSpanHandler(final TextView textView) {
        this.mTextView = textView;
        this.mGestureDetectorCompat = new y2t(textView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.messaging.views.ClickableSpanHandler.1
            private boolean mGestureStartedOnLink;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                boolean z = ClickableSpanHandler.this.handleTouchAtPosition(motionEvent.getX(), motionEvent.getY()) != null;
                this.mGestureStartedOnLink = z;
                return z;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                UpdateAppearance handleTouchAtPosition = ClickableSpanHandler.this.handleTouchAtPosition(motionEvent.getX(), motionEvent.getY());
                if (handleTouchAtPosition instanceof ulz) {
                    ((ulz) handleTouchAtPosition).onLongClick(textView);
                } else {
                    if (!this.mGestureStartedOnLink || ClickableSpanHandler.this.mDelegate == null) {
                        return;
                    }
                    ClickableSpanHandler.this.mDelegate.e();
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                ClickableSpan handleTouchAtPosition = ClickableSpanHandler.this.handleTouchAtPosition(motionEvent.getX(), motionEvent.getY());
                if (handleTouchAtPosition == null) {
                    return false;
                }
                handleTouchAtPosition.onClick(ClickableSpanHandler.this.mTextView);
                return true;
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ClickableSpan handleTouchAtPosition(float f, float f2) {
        Layout layout = this.mTextView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f2 - this.mTextView.getTotalPaddingTop()) + this.mTextView.getScrollY())), (f - this.mTextView.getTotalPaddingLeft()) + this.mTextView.getScrollX());
        if (this.mTextView.getText() instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) this.mTextView.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.mTextView.getText() instanceof Spannable) {
            Spannable spannable = (Spannable) this.mTextView.getText();
            if (motionEvent.getAction() == 0) {
                Object handleTouchAtPosition = handleTouchAtPosition(motionEvent.getX(), motionEvent.getY());
                boolean z = handleTouchAtPosition instanceof ulz;
                Object obj = this.mHighlightSpan;
                if (z) {
                    if (obj == null) {
                        this.mHighlightSpan = new BackgroundColorSpan(((ulz) handleTouchAtPosition).getHighlightColor());
                    }
                    spannable.setSpan(this.mHighlightSpan, spannable.getSpanStart(handleTouchAtPosition), spannable.getSpanEnd(handleTouchAtPosition), 0);
                } else if (obj != null) {
                    spannable.removeSpan(obj);
                    this.mHighlightSpan = null;
                }
            } else {
                Object obj2 = this.mHighlightSpan;
                if (obj2 != null) {
                    spannable.removeSpan(obj2);
                    this.mHighlightSpan = null;
                }
            }
        }
        return this.mGestureDetectorCompat.a.onTouchEvent(motionEvent);
    }

    public void setClickDelegate(b2c b2cVar) {
        this.mDelegate = b2cVar;
    }
}
