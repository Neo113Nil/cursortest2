package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.core.view2.spannable.ParticlesTicker;
import com.yandex.div.internal.widget.TextViewWithAccessibleSpans;
import com.yandex.div2.DivBorder;
import defpackage.aw5;
import defpackage.b7;
import defpackage.f1k;
import defpackage.fng0;
import defpackage.fu11;
import defpackage.msk;
import defpackage.ngd0;
import defpackage.nsk;
import defpackage.x2k;
import defpackage.zdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J*\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J\u000f\u0010,\u001a\u00020)H\u0010¢\u0006\u0004\b*\u0010+J/\u00101\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010\u0013J\u000f\u00108\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u0010\u0013J\u0017\u00109\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b9\u00106J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\tH\u0014¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0014¢\u0006\u0004\b=\u0010\u0013R$\u0010?\u001a\u0004\u0018\u00010>8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010)8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001e\u0010`\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001c\u0010f\u001a\u00020S8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bc\u0010b\"\u0004\bd\u0010eR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\r0g8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "Lcom/yandex/div/internal/widget/TextViewWithAccessibleSpans;", "Lmsk;", "Lx2k;", "Lzdk;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "getParticlesTicker$div_release", "()Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "getParticlesTicker", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "startDivAnimation", "stopDivAnimation", "onDraw", "visibility", "onWindowVisibilityChanged", "(I)V", "onDetachedFromWindow", "Lcom/yandex/div/core/widget/a;", "adaptiveMaxLines", "Lcom/yandex/div/core/widget/a;", "getAdaptiveMaxLines$div_release", "()Lcom/yandex/div/core/widget/a;", "setAdaptiveMaxLines$div_release", "(Lcom/yandex/div/core/widget/a;)V", "Lcom/yandex/div/core/util/text/a;", "textRoundedBgHelper", "Lcom/yandex/div/core/util/text/a;", "getTextRoundedBgHelper$div_release", "()Lcom/yandex/div/core/util/text/a;", "setTextRoundedBgHelper$div_release", "(Lcom/yandex/div/core/util/text/a;)V", "", "animationStartDelay", "J", "getAnimationStartDelay$div_release", "()J", "setAnimationStartDelay$div_release", "(J)V", "", "animationStarted", "Z", "particlesTicker", "Lcom/yandex/div/core/view2/spannable/ParticlesTicker;", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Lx2k;", "setDiv", "(Lx2k;)V", "div", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DivLineHeightTextView extends TextViewWithAccessibleSpans implements msk, zdk {
    private final /* synthetic */ nsk $$delegate_0;
    private com.yandex.div.core.widget.a adaptiveMaxLines;
    private long animationStartDelay;
    private boolean animationStarted;
    private ParticlesTicker particlesTicker;
    private com.yandex.div.core.util.text.a textRoundedBgHelper;

    public /* synthetic */ DivLineHeightTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? fng0.divTextStyle : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDivAnimation$lambda$2(DivLineHeightTextView divLineHeightTextView) {
        if (divLineHeightTextView.animationStarted) {
            divLineHeightTextView.setSelected(true);
        }
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

    /* renamed from: getAdaptiveMaxLines$div_release, reason: from getter */
    public com.yandex.div.core.widget.a getAdaptiveMaxLines() {
        return this.adaptiveMaxLines;
    }

    /* renamed from: getAnimationStartDelay$div_release, reason: from getter */
    public long getAnimationStartDelay() {
        return this.animationStartDelay;
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    @Override // defpackage.msk
    public x2k getDiv() {
        return (x2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
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

    @Override // defpackage.uvo
    public List<f1k> getSubscriptions() {
        return this.$$delegate_0.x;
    }

    /* renamed from: getTextRoundedBgHelper$div_release, reason: from getter */
    public com.yandex.div.core.util.text.a getTextRoundedBgHelper() {
        return this.textRoundedBgHelper;
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
        com.yandex.div.core.util.text.a textRoundedBgHelper;
        if ((getText() instanceof Spanned) && getLayout() != null && (textRoundedBgHelper = getTextRoundedBgHelper()) != null && textRoundedBgHelper.d()) {
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int save = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                com.yandex.div.core.util.text.a textRoundedBgHelper2 = getTextRoundedBgHelper();
                if (textRoundedBgHelper2 != null) {
                    textRoundedBgHelper2.c(canvas, (Spanned) getText(), getLayout());
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        ParticlesTicker particlesTicker = this.particlesTicker;
        if (visibility == 0) {
            if (particlesTicker != null) {
                particlesTicker.resumeIfNeeded();
            }
        } else if (particlesTicker != null) {
            particlesTicker.stop();
        }
    }

    @Override // defpackage.msk, defpackage.uvo, defpackage.ssi0
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void setAdaptiveMaxLines$div_release(com.yandex.div.core.widget.a aVar) {
        this.adaptiveMaxLines = aVar;
    }

    public void setAnimationStartDelay$div_release(long j) {
        this.animationStartDelay = j;
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public void setTextRoundedBgHelper$div_release(com.yandex.div.core.util.text.a aVar) {
        this.textRoundedBgHelper = aVar;
    }

    @Override // defpackage.zdk
    public void startDivAnimation() {
        super.startDivAnimation();
        this.animationStarted = true;
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        fu11.b.postDelayed(new b7(21, this), getAnimationStartDelay());
    }

    @Override // defpackage.zdk
    public void stopDivAnimation() {
        super.stopDivAnimation();
        this.animationStarted = false;
        setSelected(false);
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
    public void setDiv(x2k x2kVar) {
        this.$$delegate_0.c = x2kVar;
    }

    public DivLineHeightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivLineHeightTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DivLineHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new nsk();
    }
}
