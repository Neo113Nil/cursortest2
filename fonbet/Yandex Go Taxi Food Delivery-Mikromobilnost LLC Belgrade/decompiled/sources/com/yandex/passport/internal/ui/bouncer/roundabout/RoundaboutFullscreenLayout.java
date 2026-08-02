package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.lightside.animations.DslAnimator;
import com.lightside.animations.DslAnimatorBuilder;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.resources.DrawableResource;
import defpackage.ak2;
import defpackage.b64;
import defpackage.gum;
import defpackage.ium;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.spb1;
import defpackage.tls;
import defpackage.uc20;
import defpackage.vfc;
import defpackage.xvz;
import defpackage.zvi;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJG\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010!\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00104\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101R\u0014\u0010<\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/roundabout/RoundaboutFullscreenLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "from", "to", "left", "right", "Lzy11;", "animateClipPath", "(IIII)V", "", "top", "bottom", "rx", "ry", "", "nailed", "Landroid/graphics/Path;", "createClipPath", "(FFFFFFZ)Landroid/graphics/Path;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "clipRadius", CA20Status.STATUS_USER_I, "padding", "currentTop", "clipPath", "Landroid/graphics/Path;", "Lcom/lightside/animations/DslAnimator;", "lastAnimator", "Lcom/lightside/animations/DslAnimator;", "maxWidth", "getInsetTop", "()I", "insetTop", "getInsetBottom", "insetBottom", "Landroid/view/View;", "getInnerView", "()Landroid/view/View;", "innerView", "getFitsInside", "()Z", "fitsInside", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RoundaboutFullscreenLayout extends ViewGroup {
    private final BitmapDrawable backgroundDrawable;
    private Path clipPath;
    private final int clipRadius;
    private int currentTop;
    private DslAnimator lastAnimator;
    private final int maxWidth;
    private final int padding;
    private final Paint paint;
    private final Rect rect;

    public RoundaboutFullscreenLayout(Context context) {
        super(context);
        Drawable m270getDrawableimpl = DrawableResource.m270getDrawableimpl(DrawableResource.m265constructorimpl(R.drawable.passport_background_main));
        BitmapDrawable bitmapDrawable = m270getDrawableimpl instanceof BitmapDrawable ? (BitmapDrawable) m270getDrawableimpl : null;
        if (bitmapDrawable == null) {
            ny61.r("Not a bitmap drawable");
            throw null;
        }
        this.backgroundDrawable = bitmapDrawable;
        this.paint = new Paint(3);
        this.rect = new Rect();
        float f = uc20.a.density;
        this.clipRadius = (int) (32.0f * f);
        this.padding = (int) (8.0f * f);
        this.currentTop = -1;
        int i = v.O;
        this.maxWidth = v.O;
    }

    private final void animateClipPath(int from, int to, int left, int right) {
        DslAnimatorBuilder dslAnimatorBuilder = new DslAnimatorBuilder();
        animateClipPath$lambda$7(from, to, this, left, right, dslAnimatorBuilder);
        DslAnimator dslAnimator = this.lastAnimator;
        if (dslAnimator != null) {
            dslAnimator.cancel();
        }
        dslAnimatorBuilder.start();
        this.lastAnimator = dslAnimatorBuilder;
    }

    private static final zy11 animateClipPath$lambda$7(final int i, final int i2, final RoundaboutFullscreenLayout roundaboutFullscreenLayout, final int i3, final int i4, DslAnimatorBuilder dslAnimatorBuilder) {
        long g;
        dslAnimatorBuilder.targets(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.o
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 animateClipPath$lambda$7$lambda$6;
                animateClipPath$lambda$7$lambda$6 = RoundaboutFullscreenLayout.animateClipPath$lambda$7$lambda$6(i, i2, roundaboutFullscreenLayout, i3, i4, (ium) obj);
                return animateClipPath$lambda$7$lambda$6;
            }
        });
        g = spb1.g((r2 & 8) != 0 ? 0 : 1, (r2 & 16) == 0 ? 200 : 0);
        dslAnimatorBuilder.m128setDurationTimebAIjdkI(g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateClipPath$lambda$7$lambda$6(int i, int i2, RoundaboutFullscreenLayout roundaboutFullscreenLayout, int i3, int i4, ium iumVar) {
        p pVar = new p(roundaboutFullscreenLayout, i3, i4);
        tls tlsVar = iumVar.a;
        tlsVar.invoke(new ak2(new gum(i, i2, 0, pVar)));
        tlsVar.invoke(new ak2(new zvi(29, new View[]{roundaboutFullscreenLayout})));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateClipPath$lambda$7$lambda$6$lambda$5(RoundaboutFullscreenLayout roundaboutFullscreenLayout, int i, int i2, int i3) {
        roundaboutFullscreenLayout.currentTop = i3;
        int i4 = roundaboutFullscreenLayout.padding;
        float f = i + i4;
        float insetTop = i3 + i4 + (roundaboutFullscreenLayout.getFitsInside() ? 0 : roundaboutFullscreenLayout.getInsetTop());
        float f2 = i2 - roundaboutFullscreenLayout.padding;
        int i5 = roundaboutFullscreenLayout.clipRadius;
        roundaboutFullscreenLayout.clipPath = roundaboutFullscreenLayout.createClipPath(f, insetTop, f2, roundaboutFullscreenLayout.getBottom() - (roundaboutFullscreenLayout.getFitsInside() ? roundaboutFullscreenLayout.padding + roundaboutFullscreenLayout.getInsetBottom() : 0), i5, i5, !roundaboutFullscreenLayout.getFitsInside());
        return zy11.a;
    }

    private final Path createClipPath(float left, float top, float right, float bottom, float rx, float ry, boolean nailed) {
        Path path = new Path();
        if (rx < 0.0f) {
            rx = 0.0f;
        }
        if (ry < 0.0f) {
            ry = 0.0f;
        }
        float f = right - left;
        float f2 = bottom - top;
        float f3 = f / 2.0f;
        if (rx > f3) {
            rx = f3;
        }
        float f4 = f2 / 2.0f;
        if (ry > f4) {
            ry = f4;
        }
        float f5 = f - (2.0f * rx);
        float f6 = f2 - (2.0f * ry);
        path.moveTo(right, top + ry);
        float f7 = -ry;
        float f8 = -rx;
        path.rQuadTo(0.0f, f7, f8, f7);
        path.rLineTo(-f5, 0.0f);
        path.rQuadTo(f8, 0.0f, f8, ry);
        path.rLineTo(0.0f, f6);
        if (nailed) {
            path.rLineTo(0.0f, ry);
            path.rLineTo(f, 0.0f);
            path.rLineTo(0.0f, f7);
        } else {
            path.rQuadTo(0.0f, ry, rx, ry);
            path.rLineTo(f5, 0.0f);
            path.rQuadTo(rx, 0.0f, rx, f7);
        }
        path.rLineTo(0.0f, -f6);
        path.close();
        return path;
    }

    private final boolean getFitsInside() {
        return (getInnerView().getMeasuredHeight() + getInsetBottom()) + getInsetTop() <= getMeasuredHeight();
    }

    private final View getInnerView() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        ny61.r("roundabout innerView is missing");
        return null;
    }

    private final int getInsetBottom() {
        return getPaddingBottom();
    }

    private final int getInsetTop() {
        return getPaddingTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.drawBitmap(this.backgroundDrawable.getBitmap(), (Rect) null, this.rect, this.paint);
        canvas.save();
        Path path = this.clipPath;
        canvas.clipPath(path != null ? path : null);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel = LogLevel.DEBUG;
            StringBuilder p = xvz.p("onLayout(", l, Extension.FIX_SPACE, Extension.FIX_SPACE, changed);
            vfc.u(t, r, Extension.FIX_SPACE, Extension.FIX_SPACE, p);
            com.yandex.passport.common.logger.a.c(logLevel, null, oyr.s(p, b, ')'), 8);
        }
        Rect rect = this.rect;
        rect.left = l;
        rect.right = r;
        rect.top = t;
        rect.bottom = b;
        if (getFitsInside()) {
            t = (b - getInnerView().getMeasuredHeight()) - getInsetBottom();
        }
        int i = r - l;
        int i2 = this.maxWidth;
        if (i > i2) {
            int i3 = i / 2;
            int i4 = i2 / 2;
            l = i3 - i4;
            r = i4 + i3;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel2 = LogLevel.DEBUG;
            StringBuilder s = b64.s(l, t, "layout child(", Extension.FIX_SPACE, Extension.FIX_SPACE);
            s.append(r);
            s.append(Extension.FIX_SPACE);
            s.append(b);
            s.append(')');
            com.yandex.passport.common.logger.a.c(logLevel2, null, s.toString(), 8);
        }
        getInnerView().layout(l, t, r, b - getInsetBottom());
        int i5 = this.currentTop;
        if (i5 >= 0) {
            animateClipPath(i5, t, l, r);
            return;
        }
        float f = l + this.padding;
        float bottom = getBottom();
        float f2 = this.padding;
        float f3 = bottom + f2;
        float f4 = r - f2;
        float f5 = this.clipRadius;
        this.clipPath = createClipPath(f, f3, f4, getBottom() - (getFitsInside() ? this.padding + getInsetBottom() : 0), f5, f5, !getFitsInside());
        animateClipPath(getBottom(), t, l, r);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(getMeasuredWidth(), this.maxWidth), 1073741824);
        getInnerView().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "first measure step " + getInnerView().getMeasuredHeight(), 8);
        }
        if (getFitsInside()) {
            return;
        }
        getInnerView().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getInsetBottom()) - getInsetTop(), 1073741824));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "second measure step " + getInnerView().getMeasuredHeight(), 8);
        }
    }
}
