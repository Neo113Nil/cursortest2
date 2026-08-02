package xsna;

import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vk.im.ui.views.span.SpanPressableTextView;

/* compiled from: SpanTouchEventListener.kt */
/* loaded from: classes2.dex */
public final class jik0 implements View.OnTouchListener {
    public final SpanPressableTextView b;
    public ClickableSpan e;
    public boolean f;
    public Spanned g;
    public SpanPressableTextView.a i;
    public SpanPressableTextView.b j;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final a d = new a();
    public final long h = ViewConfiguration.getLongPressTimeout() - 50;

    /* compiled from: SpanTouchEventListener.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            jik0 jik0Var = jik0.this;
            SpanPressableTextView spanPressableTextView = jik0Var.b;
            ClickableSpan clickableSpan = jik0Var.e;
            if (clickableSpan instanceof w2d0) {
                ((w2d0) clickableSpan).b = false;
                spanPressableTextView.invalidate();
            }
            SpanPressableTextView.b bVar = jik0Var.j;
            if (bVar != null) {
                spanPressableTextView.performHapticFeedback(0);
                bVar.k(jik0Var.e, spanPressableTextView);
            }
            jik0Var.c.removeCallbacksAndMessages(null);
            jik0Var.e = null;
            jik0Var.f = true;
        }
    }

    public jik0(SpanPressableTextView spanPressableTextView) {
        this.b = spanPressableTextView;
    }

    public static ClickableSpan a(SpanPressableTextView spanPressableTextView, Spanned spanned, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - spanPressableTextView.getTotalPaddingLeft();
        int totalPaddingTop = y - spanPressableTextView.getTotalPaddingTop();
        int scrollX = spanPressableTextView.getScrollX() + totalPaddingLeft;
        int scrollY = spanPressableTextView.getScrollY() + totalPaddingTop;
        Layout layout = spanPressableTextView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            return null;
        }
        return clickableSpanArr[0];
    }

    public final void b() {
        ClickableSpan clickableSpan = this.e;
        if (clickableSpan instanceof w2d0) {
            ((w2d0) clickableSpan).b = false;
            this.b.invalidate();
        }
        this.c.removeCallbacksAndMessages(null);
        this.e = null;
        this.f = false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Spanned spanned = this.g;
        if (spanned == null) {
            return false;
        }
        Handler handler = this.c;
        SpanPressableTextView spanPressableTextView = this.b;
        if (action == 0) {
            ClickableSpan a2 = a(spanPressableTextView, spanned, motionEvent);
            if (a2 == null) {
                b();
                return false;
            }
            if (this.e != null) {
                b();
            }
            if (a2 instanceof w2d0) {
                ((w2d0) a2).b = true;
                spanPressableTextView.invalidate();
            }
            handler.postDelayed(this.d, this.h);
            this.e = a2;
            this.f = false;
            return true;
        }
        if (action == 1) {
            ClickableSpan a3 = a(spanPressableTextView, spanned, motionEvent);
            if (a3 == null) {
                b();
                return false;
            }
            a3.onClick(spanPressableTextView);
            ClickableSpan clickableSpan = this.e;
            if (clickableSpan != null) {
                if (clickableSpan != a3) {
                    b();
                    return true;
                }
                if (!this.f) {
                    if (clickableSpan instanceof w2d0) {
                        ((w2d0) clickableSpan).b = false;
                        spanPressableTextView.invalidate();
                    }
                    SpanPressableTextView.a aVar = this.i;
                    if (aVar != null) {
                        spanPressableTextView.playSoundEffect(0);
                        aVar.c(this.e, spanPressableTextView);
                    }
                    handler.removeCallbacksAndMessages(null);
                    this.e = null;
                    this.f = false;
                    return true;
                }
            }
        } else if (action == 3) {
            b();
            return false;
        }
        return true;
    }
}
