package com.yandex.messaging.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.b64;
import defpackage.fxa1;
import defpackage.gvg0;
import defpackage.jng0;
import defpackage.kjs0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000234B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u000fR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010$R$\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/yandex/messaging/views/BadgedFloatingActionButton;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "Landroidx/coordinatorlayout/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawBorder", "(Landroid/graphics/Canvas;)V", "drawBadge", "", "getUnreadCount", "()Ljava/lang/String;", "count", "setUnreadCount", "(I)V", "height", "notifyInputHeightChanged", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "onDraw", "", "badgeRadius", "F", "unreadCount", "Ljava/lang/String;", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "badgePaint", "Landroid/graphics/RectF;", "badgeBounds", "Landroid/graphics/RectF;", "Landroid/graphics/Rect;", "textBounds", "Landroid/graphics/Rect;", "viewClipBounds", "borderPaint", "value", "offset", CA20Status.STATUS_USER_I, "getOffset", "()I", "OffsetBehavior", "InsetOvalOutlineProvider", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BadgedFloatingActionButton extends FloatingActionButton {
    public static final int $stable = 8;
    private final RectF badgeBounds;
    private final Paint badgePaint;
    private float badgeRadius;
    private final Paint borderPaint;
    private int offset;
    private final Rect textBounds;
    private final Paint textPaint;
    private String unreadCount;
    private final Rect viewClipBounds;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/views/BadgedFloatingActionButton$InsetOvalOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "", "inset", "<init>", "(I)V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", CA20Status.STATUS_USER_I, "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetOvalOutlineProvider extends ViewOutlineProvider {
        private final int inset;

        public InsetOvalOutlineProvider(int i) {
            this.inset = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i = this.inset;
            outline.setOval(i, i, view.getWidth() - this.inset, view.getHeight() - this.inset);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/views/BadgedFloatingActionButton$OffsetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "<init>", "()V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OffsetBehavior extends CoordinatorLayout.a {
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            floatingActionButton.setTranslationY(((BadgedFloatingActionButton) floatingActionButton).getOffset());
            return true;
        }
    }

    public BadgedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.unreadCount = "";
        Paint paint = new Paint(1);
        this.textPaint = paint;
        Paint paint2 = new Paint(1);
        this.badgePaint = paint2;
        this.badgeBounds = new RectF();
        this.textBounds = new Rect();
        this.viewClipBounds = new Rect();
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(kjs0.d(1));
        this.borderPaint = paint3;
        paint.setColor(fxa1.c(jng0.messagingCommonAccentFgColor, context).data);
        paint.setTextSize(context.getResources().getDimensionPixelSize(gvg0.fab_badge_text_size));
        paint.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(fxa1.c(jng0.messagingCommonCounterColor, context).data);
        this.badgeRadius = context.getResources().getDimensionPixelSize(gvg0.fab_badge_radius);
        paint3.setColor(fxa1.c(jng0.messagingCommonIconsSecondaryColor, context).data);
        paint3.setAlpha(30);
        setOutlineProvider(new InsetOvalOutlineProvider((int) this.badgeRadius));
    }

    private final void drawBadge(Canvas canvas) {
        canvas.getClipBounds(this.viewClipBounds);
        float f = this.badgeRadius * 2.0f;
        float width = this.textBounds.width();
        float f2 = this.badgeRadius;
        float f3 = width + f2;
        if (f < f3) {
            f = f3;
        }
        Rect rect = this.viewClipBounds;
        int i = (((int) f) / 2) + (rect.right / 2);
        int i2 = rect.top;
        this.badgeBounds.set(i - r0, i2, i, (f2 * 2.0f) + i2);
        RectF rectF = this.badgeBounds;
        float f4 = this.badgeRadius;
        canvas.drawRoundRect(rectF, f4, f4, this.badgePaint);
        canvas.drawText(this.unreadCount, this.badgeBounds.centerX(), this.badgeBounds.centerY() + (this.textBounds.height() / 2), this.textPaint);
    }

    private final void drawBorder(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        float f = this.badgeRadius;
        rectF.inset(f, f);
        float f2 = (rectF.left + rectF.right) / 2.0f;
        canvas.drawCircle(f2, f2, rectF.width() / 2.0f, this.borderPaint);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new OffsetBehavior();
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getUnreadCount() {
        return this.unreadCount;
    }

    public final void notifyInputHeightChanged(int height) {
        int i = -height;
        this.offset = i;
        setTranslationY(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        super.onDraw(canvas);
        drawBorder(canvas);
        if (this.unreadCount.length() > 0) {
            drawBadge(canvas);
        }
    }

    public final void setUnreadCount(int count) {
        String e = count > 999 ? b64.e(count / 1000, " k+") : count == 0 ? "" : String.valueOf(count);
        this.unreadCount = e;
        this.textPaint.getTextBounds(e, 0, e.length(), this.textBounds);
        postInvalidate();
    }

    public BadgedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BadgedFloatingActionButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BadgedFloatingActionButton(Context context) {
        this(context, null, 0, 6, null);
    }
}
