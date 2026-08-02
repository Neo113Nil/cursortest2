package com.yandex.div.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.core.view2.divs.widgets.a;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div2.DivBorder;
import defpackage.aw5;
import defpackage.f1k;
import defpackage.fng0;
import defpackage.msk;
import defpackage.n2k;
import defpackage.nsk;
import defpackage.tls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J*\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020(2\u0006\u0010.\u001a\u00020\tH\u0014¢\u0006\u0004\b/\u00100J/\u00105\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;H\u0017¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010\u0013J\u000f\u0010A\u001a\u00020\u000fH\u0016¢\u0006\u0004\bA\u0010\u0013R$\u0010C\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010J\u001a\u0004\u0018\u00010;2\b\u0010I\u001a\u0004\u0018\u00010;8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR8\u0010P\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0004\u0012\u00020\u000f\u0018\u00010Nj\u0004\u0018\u0001`O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010^\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020(8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001c\u0010c\u001a\u00020(8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\ba\u0010`\"\u0004\bb\u0010+R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006h"}, d2 = {"Lcom/yandex/div/internal/view/DivImageView;", "Lcom/yandex/div/core/widget/LoadableImageView;", "Lmsk;", "Ln2k;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "", "adjustViewBounds", "setAdjustViewBounds", "(Z)V", "cropToPadding", "setCropToPadding", "widthMeasureSpec", "canResizeWidth", "(I)Z", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View$OnTouchListener;", "l", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "overrideOnTouchListener", "release", "releaseMedia", "Landroid/net/Uri;", "imageUrl", "Landroid/net/Uri;", "getImageUrl$div_release", "()Landroid/net/Uri;", "setImageUrl$div_release", "(Landroid/net/Uri;)V", "<set-?>", "baseTouchListener", "Landroid/view/View$OnTouchListener;", "getBaseTouchListener", "()Landroid/view/View$OnTouchListener;", "Lkotlin/Function1;", "Lcom/yandex/div/internal/view/OnTouchListenerChangeObserver;", "onTouchListenerChangeObserver", "Ltls;", "getOnTouchListenerChangeObserver", "()Ltls;", "setOnTouchListenerChangeObserver", "(Ltls;)V", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Ln2k;", "setDiv", "(Ln2k;)V", "div", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DivImageView extends LoadableImageView implements msk {
    private final /* synthetic */ nsk $$delegate_0;
    private View.OnTouchListener baseTouchListener;
    private Uri imageUrl;
    private tls onTouchListenerChangeObserver;

    public DivImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new nsk();
        super.setAdjustViewBounds(true);
        super.setCropToPadding(true);
    }

    @Override // defpackage.uvo
    public void addSubscription(f1k subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // com.yandex.div.internal.widget.AspectImageView
    public boolean canResizeWidth(int widthMeasureSpec) {
        return false;
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

    public final View.OnTouchListener getBaseTouchListener() {
        return this.baseTouchListener;
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    @Override // defpackage.msk
    public n2k getDiv() {
        return (n2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    /* renamed from: getImageUrl$div_release, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
    }

    public final tls getOnTouchListenerChangeObserver() {
        return this.onTouchListenerChangeObserver;
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

    @Override // com.yandex.div.internal.widget.AspectImageView, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    public final void overrideOnTouchListener(View.OnTouchListener l) {
        super.setOnTouchListener(l);
    }

    @Override // com.yandex.div.core.widget.LoadableImageView, defpackage.ssi0
    public void release() {
        super.release();
        releaseMedia();
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void releaseMedia() {
        super.release();
        this.imageUrl = null;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean adjustViewBounds) {
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // android.widget.ImageView
    public void setCropToPadding(boolean cropToPadding) {
    }

    public final void setImageUrl$div_release(Uri uri) {
        this.imageUrl = uri;
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener l) {
        this.baseTouchListener = l;
        tls tlsVar = this.onTouchListenerChangeObserver;
        if (tlsVar != null) {
            tlsVar.invoke(l);
        }
        super.setOnTouchListener(l);
    }

    public final void setOnTouchListenerChangeObserver(tls tlsVar) {
        this.onTouchListenerChangeObserver = tlsVar;
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
    public void setDiv(n2k n2kVar) {
        this.$$delegate_0.c = n2kVar;
    }

    public DivImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? fng0.divImageStyle : i);
    }

    public DivImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
