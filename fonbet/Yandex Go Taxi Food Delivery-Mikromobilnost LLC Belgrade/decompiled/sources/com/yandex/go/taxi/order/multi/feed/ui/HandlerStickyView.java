package com.yandex.go.taxi.order.multi.feed.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.cma1;
import defpackage.keu0;
import defpackage.l6u;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.zkh0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/ui/HandlerStickyView;", "Landroid/widget/FrameLayout;", "Lkeu0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "", "slide", "Lzy11;", "onSlide", "(F)V", "", "getHeight", "(F)I", "Ll6u;", "binding", "Ll6u;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HandlerStickyView extends FrameLayout implements keu0 {
    public static final int $stable = 8;
    private final l6u binding;

    public HandlerStickyView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(zkh0.handler_sticky_view, this);
        int i = p8h0.handler_view;
        View O = cma1.O(i, this);
        if (O != null) {
            this.binding = new l6u(this, O);
        } else {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
            throw null;
        }
    }

    public View asView() {
        return this;
    }

    @Override // defpackage.keu0
    public int getHeight(float slide) {
        return getHeight();
    }

    public void onSlide(float slide) {
        boolean z = getVisibility() == 4;
        if (slide < 1.0f && !z) {
            cma1.M(this.binding.b);
        } else if (slide == 1.0f && z) {
            cma1.J(this.binding.b);
        }
    }
}
