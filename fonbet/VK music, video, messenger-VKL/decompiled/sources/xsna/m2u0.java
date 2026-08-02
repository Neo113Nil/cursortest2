package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ViewVisibilityChecker.kt */
/* loaded from: classes16.dex */
public final class m2u0 {
    public final View a;
    public boolean d;
    public iis0 g;
    public long b = -1;
    public final Rect c = new Rect();
    public final a e = new a();
    public final Handler f = new Handler(Looper.getMainLooper());
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new cqr0(this, 11));

    /* compiled from: ViewVisibilityChecker.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m2u0.this.c();
        }
    }

    /* compiled from: ViewVisibilityChecker.kt */
    public static final class b {
    }

    /* compiled from: ViewVisibilityChecker.kt */
    public final class c implements View.OnAttachStateChangeListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnWindowFocusChangeListener {
        public final View b;
        public boolean c;

        public c(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            m2u0.this.c();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            m2u0.this.c();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.b;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            viewTreeObserver.removeOnWindowFocusChangeListener(this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            viewTreeObserver2.addOnScrollChangedListener(this);
            viewTreeObserver2.addOnGlobalLayoutListener(this);
            viewTreeObserver2.addOnWindowFocusChangeListener(this);
            m2u0.this.c();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            viewTreeObserver.removeOnWindowFocusChangeListener(this);
            m2u0.this.c();
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            m2u0.this.c();
        }
    }

    public m2u0(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        c cVar = (c) this.h.getValue();
        View view = cVar.b;
        if (!cVar.c) {
            view.addOnAttachStateChangeListener(cVar);
            if (view.isAttachedToWindow()) {
                View view2 = cVar.b;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                viewTreeObserver.removeOnScrollChangedListener(cVar);
                viewTreeObserver.removeOnGlobalLayoutListener(cVar);
                viewTreeObserver.removeOnWindowFocusChangeListener(cVar);
                ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                viewTreeObserver2.addOnScrollChangedListener(cVar);
                viewTreeObserver2.addOnGlobalLayoutListener(cVar);
                viewTreeObserver2.addOnWindowFocusChangeListener(cVar);
            }
            cVar.c = true;
        }
        c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        c cVar = (c) this.h.getValue();
        boolean z = cVar.c;
        View view = cVar.b;
        if (z) {
            view.removeOnAttachStateChangeListener(cVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.removeOnScrollChangedListener(cVar);
            viewTreeObserver.removeOnGlobalLayoutListener(cVar);
            viewTreeObserver.removeOnWindowFocusChangeListener(cVar);
            cVar.c = false;
        }
        this.d = false;
        this.b = -1L;
        this.f.removeCallbacks(this.e);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        View view = this.a;
        boolean isAttachedToWindow = view.isAttachedToWindow();
        a aVar = this.e;
        Handler handler = this.f;
        if (isAttachedToWindow && view.getVisibility() == 0 && view.getWindowVisibility() == 0 && view.hasWindowFocus() && view.getMeasuredWidth() != 0 && view.getMeasuredHeight() != 0) {
            view.getGlobalVisibleRect(this.c);
            if (r1.width() / view.getMeasuredWidth() >= 0.85f && r1.height() / view.getMeasuredHeight() >= 0.85f) {
                if (this.d) {
                    handler.removeCallbacks(aVar);
                    return;
                }
                if (this.b == -1) {
                    this.b = System.currentTimeMillis();
                    handler.postDelayed(aVar, 1000L);
                    return;
                }
                if (System.currentTimeMillis() - this.b < 2000) {
                    handler.postDelayed(aVar, 1000L);
                    return;
                }
                handler.removeCallbacks(aVar);
                this.d = true;
                iis0 iis0Var = this.g;
                if (iis0Var != null) {
                    kis0 kis0Var = iis0Var.b;
                    kis0Var.a.b();
                    ((mis0) kis0Var.f.getValue()).a(kis0Var.d, new jis0(2, kis0Var, kis0.class, "onGetPoll", "onGetPoll(Lcom/vk/api/generated/uxpolls/dto/UxpollsGetResponseDto;Ljava/lang/Throwable;)V", 0));
                    return;
                }
                return;
            }
        }
        this.b = -1L;
        this.d = false;
        handler.removeCallbacks(aVar);
    }
}
