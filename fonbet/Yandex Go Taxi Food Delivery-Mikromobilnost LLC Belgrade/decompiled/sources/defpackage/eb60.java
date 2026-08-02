package defpackage;

import com.ybsdk.widgets.common.NoAutoScrollForFocusedView;

/* loaded from: classes4.dex */
public final class eb60 implements Runnable {
    public final /* synthetic */ NoAutoScrollForFocusedView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;

    public eb60(NoAutoScrollForFocusedView noAutoScrollForFocusedView, int i, int i2, int i3) {
        this.a = noAutoScrollForFocusedView;
        this.b = i;
        this.c = i2;
        this.w = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        NoAutoScrollForFocusedView noAutoScrollForFocusedView = this.a;
        int measuredHeight = noAutoScrollForFocusedView.getMeasuredHeight();
        int i3 = this.b;
        int i4 = measuredHeight + i3;
        int i5 = this.w;
        int i6 = this.c;
        if (i6 < i3 || i5 > i4) {
            if (i5 >= i4) {
                i2 = NoAutoScrollForFocusedView.DEFAULT_Y_SCROLL_MARGIN_PX;
                noAutoScrollForFocusedView.smoothScrollBy(0, i2 + (i5 - i4));
            } else if (i6 <= i3) {
                i = NoAutoScrollForFocusedView.DEFAULT_Y_SCROLL_MARGIN_PX;
                noAutoScrollForFocusedView.smoothScrollBy(0, (i6 - i3) - i);
            }
        }
    }
}
