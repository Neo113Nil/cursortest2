package com.yandex.android.webview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.hn50;
import defpackage.ifh;
import defpackage.in50;
import defpackage.jfh;
import defpackage.sn50;

/* loaded from: classes11.dex */
class NestedScrollWebView extends YandexLiteWebView {
    private final hn50 mNestedScrollDelegate;

    public NestedScrollWebView(Context context, AttributeSet attributeSet, in50 in50Var) {
        super(context, attributeSet);
        if (in50Var != null) {
            this.mNestedScrollDelegate = new ifh(this, new a(this, 2), new a(this, 1));
            return;
        }
        jfh jfhVar = jfh.a;
        a aVar = new a(this, 0);
        a aVar2 = new a(this, 1);
        jfhVar.getClass();
        this.mNestedScrollDelegate = new ifh(this, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$1(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return i > 0 || getScrollY() != 0;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        ifh ifhVar = (ifh) this.mNestedScrollDelegate;
        if (!ifhVar.l) {
            super.computeScroll();
        } else {
            ifhVar.a.scrollTo(0, 0);
            ifhVar.l = true;
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return ((ifh) this.mNestedScrollDelegate).k.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return ((ifh) this.mNestedScrollDelegate).k.b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return ((ifh) this.mNestedScrollDelegate).k.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return ((ifh) this.mNestedScrollDelegate).k.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return ((ifh) this.mNestedScrollDelegate).k.f(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return ((ifh) this.mNestedScrollDelegate).k.d;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ifh ifhVar = (ifh) this.mNestedScrollDelegate;
        int[] iArr = ifhVar.i;
        int[] iArr2 = ifhVar.h;
        a aVar = ifhVar.b;
        sn50 sn50Var = ifhVar.k;
        if (sn50Var.d && motionEvent.getPointerCount() <= 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                ifhVar.j = 0;
            }
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            motionEvent.offsetLocation(0.0f, ifhVar.j);
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        int i = ifhVar.e - x;
                        int i2 = ifhVar.f - y;
                        if (!ifhVar.g) {
                            int abs = Math.abs(i);
                            int abs2 = Math.abs(i2);
                            int i3 = ifhVar.d;
                            if (abs2 > i3) {
                                ifhVar.g = sn50Var.h(2, 0);
                            } else if (abs > i3) {
                                ifhVar.g = sn50Var.h(1, 0);
                            }
                        }
                        if (ifhVar.g) {
                            if (sn50Var.c(0, i2, ifhVar.i, iArr2, 0)) {
                                i2 -= iArr[1];
                                ifhVar.j += iArr2[1];
                            }
                            ifhVar.f = y - iArr2[1];
                            if (sn50Var.d(0, iArr[1], 0, i2 < 0 ? Math.min(0, ifhVar.c.b.getScrollY() + i2) : 0, iArr2, 0, null)) {
                                int i4 = ifhVar.f;
                                int i5 = iArr2[1];
                                ifhVar.f = i4 - i5;
                                ifhVar.j += i5;
                            }
                        }
                        return aVar.a(obtain);
                    }
                    if (action != 3) {
                        if (action != 5) {
                            if (action != 6) {
                                return aVar.a(motionEvent);
                            }
                        }
                    }
                }
                if (ifhVar.g) {
                    sn50Var.i(0);
                }
                ifhVar.g = false;
                return aVar.a(motionEvent);
            }
            ifhVar.l = false;
            ifhVar.e = x;
            ifhVar.f = y;
            return aVar.a(motionEvent);
        }
        return aVar.a(motionEvent);
    }

    public void scrollToTopAndFix() {
        ifh ifhVar = (ifh) this.mNestedScrollDelegate;
        ifhVar.a.scrollTo(0, 0);
        ifhVar.l = true;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        ifh ifhVar = (ifh) this.mNestedScrollDelegate;
        ifhVar.k.g(z);
        if (z) {
            return;
        }
        ifhVar.g = false;
        ifhVar.l = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return ((ifh) this.mNestedScrollDelegate).k.h(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        ((ifh) this.mNestedScrollDelegate).k.i(0);
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jfh.a);
    }

    public NestedScrollWebView(Context context) {
        this(context, null);
    }
}
