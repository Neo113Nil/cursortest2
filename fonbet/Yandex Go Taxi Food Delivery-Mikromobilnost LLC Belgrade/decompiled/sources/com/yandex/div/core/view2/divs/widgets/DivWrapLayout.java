package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.yandex.div.core.widget.wraplayout.WrapContainerLayout;
import com.yandex.div2.DivBorder;
import defpackage.ajk;
import defpackage.aw5;
import defpackage.bjk;
import defpackage.cxk;
import defpackage.f1k;
import defpackage.i2k;
import defpackage.msk;
import defpackage.nsk;
import defpackage.zdk;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0010J \u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0010J*\u0010\"\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b&\u0010%J/\u0010+\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0015H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J)\u00105\u001a\u0002042\u0006\u0010.\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u00010 2\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b5\u00106R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010?\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010@\u001a\u0002048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001c\u0010E\u001a\u0002048\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bB\u0010A\"\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR$\u0010O\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bL\u0010H\"\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;", "Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout;", "Lmsk;", "Li2k;", "Lajk;", "Lzdk;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Li2k;", "setDiv", "(Li2k;)V", "div", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "", "Lcxk;", "getItems", "setItems", "(Ljava/util/List;)V", "items", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivWrapLayout extends WrapContainerLayout implements msk, ajk, zdk {
    private final /* synthetic */ nsk $$delegate_0;
    private final /* synthetic */ bjk $$delegate_1;

    public DivWrapLayout(Context context) {
        super(context);
        this.$$delegate_0 = new nsk();
        this.$$delegate_1 = new bjk();
    }

    @Override // defpackage.uvo
    public void addSubscription(f1k subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // defpackage.uvo
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.b(canvas);
            super.draw(canvas);
            divBorderDrawer.c(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            com.yandex.div.core.view2.divs.a.r(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    @Override // defpackage.msk
    public i2k getDiv() {
        return (i2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    @Override // defpackage.ajk
    public List<cxk> getItems() {
        return this.$$delegate_1.a;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
    }

    @Override // defpackage.uvo
    public List<f1k> getSubscriptions() {
        return this.$$delegate_0.x;
    }

    @Override // defpackage.ugk
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // defpackage.ax01
    public boolean isTransient() {
        return this.$$delegate_0.b.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.a(width, height);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // defpackage.msk, defpackage.uvo, defpackage.ssi0
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // defpackage.ajk
    public void setItems(List<cxk> list) {
        this.$$delegate_1.a = list;
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // defpackage.zdk
    public /* bridge */ /* synthetic */ void startDivAnimation() {
        super.startDivAnimation();
    }

    @Override // defpackage.zdk
    public /* bridge */ /* synthetic */ void stopDivAnimation() {
        super.stopDivAnimation();
    }

    @Override // defpackage.ax01
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // defpackage.ax01
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    @Override // defpackage.msk
    public void setDiv(i2k i2kVar) {
        this.$$delegate_0.c = i2kVar;
    }
}
