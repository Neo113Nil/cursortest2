package com.yandex.bubbles;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import defpackage.ksg0;
import defpackage.sls;
import defpackage.tls;
import defpackage.v6e0;

/* loaded from: classes11.dex */
public final class b {
    public final BubbleStyle a;
    public final Point b;
    public final sls c;
    public final tls d;
    public BubblePopupWindow e;
    public v6e0 f;
    public View g;
    public ViewPropertyAnimator h;
    public final int i;

    public b(Context context, Integer num, BubbleStyle bubbleStyle, Integer num2, Point point, sls slsVar, tls tlsVar) {
        this.a = bubbleStyle;
        this.b = point;
        this.c = slsVar;
        this.d = tlsVar;
        this.i = context.getResources().getDimensionPixelSize(ksg0.bubble_arrow_height);
    }

    public final void a() {
        final PopupBubble$forceDismiss$1 popupBubble$forceDismiss$1 = new PopupBubble$forceDismiss$1(this);
        BubblePopupWindow bubblePopupWindow = this.e;
        if (bubblePopupWindow == null || this.h != null) {
            return;
        }
        ViewPropertyAnimator withEndAction = bubblePopupWindow.getContentView().animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setInterpolator(new AccelerateInterpolator()).setDuration(220L).withEndAction(new Runnable() { // from class: com.yandex.bubbles.a
            @Override // java.lang.Runnable
            public final void run() {
                ((PopupBubble$forceDismiss$1) sls.this).invoke();
                this.h = null;
            }
        });
        this.h = withEndAction;
        if (withEndAction != null) {
            withEndAction.start();
        }
    }
}
