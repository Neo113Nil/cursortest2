package xsna;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;

/* compiled from: VkNestedVerticalWebView.kt */
/* loaded from: classes6.dex */
public class l6v0 extends WebView implements r160 {
    public final s160 b;
    public lfh0 c;

    public l6v0(FragmentActivity fragmentActivity) {
        this((Context) fragmentActivity);
    }

    public static boolean a(l6v0 l6v0Var, MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.b.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.b.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.b.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.b.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.b.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.d;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        startNestedScroll(2);
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(motionEvent, new js00(14, this, motionEvent));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.b.g(z);
    }

    public final void setScrollHandler(lfh0 lfh0Var) {
        this.c = lfh0Var;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.b.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.b.i(0);
    }

    public l6v0(Context context) {
        super(context, null, R.attr.webViewStyle);
        this.b = new s160(this);
        this.c = new qrl(this, this);
        setNestedScrollingEnabled(true);
        setOverScrollMode(2);
    }
}
