package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.spannable.ParticlesTicker;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.internal.widget.TextViewWithAccessibleSpans;
import com.yandex.div2.a;
import com.yandex.div2.u1;
import java.util.List;
import xsna.zcl;

/* compiled from: DivLineHeightTextView.kt */
/* loaded from: classes7.dex */
public class DivLineHeightTextView extends TextViewWithAccessibleSpans implements DivHolderView<a.p> {
    private final /* synthetic */ DivHolderViewMixin<a.p> $$delegate_0;
    private AdaptiveMaxLines adaptiveMaxLines;
    private long animationStartDelay;
    private ParticlesTicker particlesTicker;
    private DivTextRangesBackgroundHelper textRoundedBgHelper;

    public /* synthetic */ DivLineHeightTextView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.divTextStyle : i);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public AdaptiveMaxLines getAdaptiveMaxLines$div_release() {
        return this.adaptiveMaxLines;
    }

    public long getAnimationStartDelay$div_release() {
        return this.animationStartDelay;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public a.p getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    public ParticlesTicker getParticlesTicker$div_release() {
        ParticlesTicker particlesTicker = this.particlesTicker;
        if (particlesTicker != null) {
            return particlesTicker;
        }
        ParticlesTicker particlesTicker2 = new ParticlesTicker(this);
        this.particlesTicker = particlesTicker2;
        return particlesTicker2;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    public DivTextRangesBackgroundHelper getTextRoundedBgHelper$div_release() {
        return this.textRoundedBgHelper;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i, int i2) {
        this.$$delegate_0.onBoundsChanged(i, i2);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        ParticlesTicker particlesTicker = this.particlesTicker;
        if (particlesTicker != null) {
            particlesTicker.stop();
        }
        this.particlesTicker = null;
        super.onDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.TextViewWithAccessibleSpans, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        DivTextRangesBackgroundHelper textRoundedBgHelper$div_release;
        if ((getText() instanceof Spanned) && getLayout() != null && (textRoundedBgHelper$div_release = getTextRoundedBgHelper$div_release()) != null && textRoundedBgHelper$div_release.hasBackgroundSpan$div_release()) {
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int save = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                DivTextRangesBackgroundHelper textRoundedBgHelper$div_release2 = getTextRoundedBgHelper$div_release();
                if (textRoundedBgHelper$div_release2 != null) {
                    textRoundedBgHelper$div_release2.draw(canvas, (Spanned) getText(), getLayout());
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onBoundsChanged(i, i2);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            ParticlesTicker particlesTicker = this.particlesTicker;
            if (particlesTicker != null) {
                particlesTicker.resumeIfNeeded();
                return;
            }
            return;
        }
        ParticlesTicker particlesTicker2 = this.particlesTicker;
        if (particlesTicker2 != null) {
            particlesTicker2.stop();
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void setAdaptiveMaxLines$div_release(AdaptiveMaxLines adaptiveMaxLines) {
        this.adaptiveMaxLines = adaptiveMaxLines;
    }

    public void setAnimationStartDelay$div_release(long j) {
        this.animationStartDelay = j;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        this.$$delegate_0.setBorder(bindingContext, u1Var, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(a.p pVar) {
        this.$$delegate_0.setDiv(pVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public void setTextRoundedBgHelper$div_release(DivTextRangesBackgroundHelper divTextRangesBackgroundHelper) {
        this.textRoundedBgHelper = divTextRangesBackgroundHelper;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivLineHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }
}
