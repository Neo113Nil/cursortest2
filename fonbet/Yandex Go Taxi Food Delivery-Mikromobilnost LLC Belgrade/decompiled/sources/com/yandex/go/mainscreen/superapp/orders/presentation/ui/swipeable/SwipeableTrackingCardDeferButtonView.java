package com.yandex.go.mainscreen.superapp.orders.presentation.ui.swipeable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.iyw0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xth0;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.zih0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b$\u0010\u0011J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b1\u00100J\u0017\u00104\u001a\u00020\u000f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u00108\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010<\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0017\u0010=\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010:R\u0014\u0010?\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010@\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00107R\u0014\u0010A\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00107R\u0014\u0010B\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00107R\u0014\u0010C\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00107R$\u0010\f\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bE\u0010:R\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010Z\u001a\u00020U2\u0006\u0010D\u001a\u00020U8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lcom/yandex/go/mainscreen/superapp/orders/presentation/ui/swipeable/SwipeableTrackingCardDeferButtonView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "revealedWidth", "", "isRevealedSpring", "Lzy11;", "updateRevealProgress", "(FZ)V", "translation", "(F)F", "updateContent", "(Z)V", "targetRevealWidth", "targetIconCenter", "contentWidth", "currentIconCenter", "(FFFF)F", "revealWidth", "centeredContentIconCenter", "(FF)F", "textAlpha", "buttonWidth", "updateBackgroundRect", "(FF)V", "isRevealed", "(F)Z", "updateRevealProgressByTranslation", "resetReveal", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "onDraw", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "swipeDirection", "F", "buttonSpacing", "getButtonSpacing", "()F", "revealAnchorSize", "revealAnchorCenter", "revealAnchorOffset", "getRevealAnchorOffset", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "iconSize", "iconStartCenter", "iconBaseCenter", "textSpacing", "value", "getRevealedWidth", "Landroid/graphics/RectF;", "backgroundRect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Liyw0;", "binding", "Liyw0;", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "orders"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwipeableTrackingCardDeferButtonView extends GoFrameLayout {
    private final Paint backgroundPaint;
    private final RectF backgroundRect;
    private final iyw0 binding;
    private final float buttonSpacing;
    private final float cornerRadius;
    private final float iconBaseCenter;
    private final float iconSize;
    private final float iconStartCenter;
    private final ImageView iconView;
    private final float revealAnchorCenter;
    private final float revealAnchorOffset;
    private final float revealAnchorSize;
    private float revealedWidth;
    private final float swipeDirection;
    private final float textSpacing;
    private final RobotoTextView textView;

    public SwipeableTrackingCardDeferButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        float f = xw31.n(context) ? 1.0f : -1.0f;
        this.swipeDirection = f;
        float w = tje.w(4, getContext());
        this.buttonSpacing = w;
        float w2 = tje.w(64, getContext());
        this.revealAnchorSize = w2;
        float f2 = (f * w2) / 2.0f;
        this.revealAnchorCenter = f2;
        this.revealAnchorOffset = (w2 + w) * f;
        this.cornerRadius = tje.w(20, getContext());
        float w3 = tje.w(24, getContext());
        this.iconSize = w3;
        this.iconStartCenter = (f * w3) / 2.0f;
        this.iconBaseCenter = f2;
        this.textSpacing = tje.w(6, getContext());
        this.backgroundRect = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(qje.t(xng0.controlMinor, getContext()));
        this.backgroundPaint = paint;
        LayoutInflater.from(context).inflate(xth0.swipeable_tracking_card_defer_button, this);
        int i3 = zih0.icon;
        ImageView imageView = (ImageView) cma1.O(i3, this);
        if (imageView != null) {
            i3 = zih0.text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
            if (robotoTextView != null) {
                this.binding = new iyw0(this, imageView, robotoTextView);
                this.iconView = imageView;
                this.textView = robotoTextView;
                setWillNotDraw(false);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final float centeredContentIconCenter(float revealWidth, float contentWidth) {
        return (((revealWidth + contentWidth) * this.swipeDirection) / 2.0f) - this.iconStartCenter;
    }

    private final float currentIconCenter(float revealedWidth, float targetRevealWidth, float targetIconCenter, float contentWidth) {
        if (revealedWidth > targetRevealWidth) {
            return centeredContentIconCenter(revealedWidth, contentWidth);
        }
        Pair[] pairArr = {new Pair(Float.valueOf(this.iconSize), Float.valueOf(this.iconStartCenter)), new Pair(Float.valueOf(this.revealAnchorSize), Float.valueOf(this.revealAnchorCenter)), new Pair(Float.valueOf(targetRevealWidth), Float.valueOf(targetIconCenter))};
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            Pair pair = pairArr[i];
            int i3 = i2 + 1;
            float f2 = 1.0f;
            int i4 = 0;
            int i5 = 0;
            while (i4 < 3) {
                Pair pair2 = pairArr[i4];
                int i6 = i5 + 1;
                if (i2 != i5) {
                    float floatValue = ((Number) pair.c()).floatValue() - ((Number) pair2.c()).floatValue();
                    if (floatValue == 0.0f) {
                        return ((Number) pair.f()).floatValue();
                    }
                    f2 = ((revealedWidth - ((Number) pair2.c()).floatValue()) / floatValue) * f2;
                }
                i4++;
                i5 = i6;
            }
            f += ((Number) pair.f()).floatValue() * f2;
            i++;
            i2 = i3;
        }
        return f;
    }

    private final float revealedWidth(float translation) {
        float abs = Math.abs(translation) - this.buttonSpacing;
        if (abs < 0.0f) {
            return 0.0f;
        }
        return abs;
    }

    private final float textAlpha(float revealedWidth, float targetRevealWidth) {
        float f = this.revealAnchorSize;
        if (targetRevealWidth <= f) {
            return 1.0f;
        }
        return y6i0.c((revealedWidth - f) / (targetRevealWidth - f), 0.0f, 1.0f);
    }

    private final void updateBackgroundRect(float buttonWidth, float revealedWidth) {
        boolean n = xw31.n(getContext());
        RectF rectF = this.backgroundRect;
        if (n) {
            rectF.left = 0.0f;
            rectF.right = revealedWidth;
        } else {
            rectF.left = buttonWidth - revealedWidth;
            rectF.right = buttonWidth;
        }
    }

    private final void updateContent(boolean isRevealedSpring) {
        float f = this.revealedWidth;
        float measuredWidth = getMeasuredWidth();
        Integer valueOf = Integer.valueOf(this.textView.getMeasuredWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        float intValue = valueOf != null ? valueOf.intValue() : this.textView.getPaint().measureText(this.textView.getText().toString());
        float f2 = this.iconSize;
        float f3 = this.textSpacing;
        float f4 = f2 + f3 + intValue;
        float f5 = measuredWidth / 2.0f;
        float f6 = (((this.revealAnchorSize + intValue) - f2) * this.swipeDirection) / 2.0f;
        float f7 = ((f2 + intValue) / 2.0f) + f3;
        float currentIconCenter = currentIconCenter(f, f5, centeredContentIconCenter(f5, f4), f4);
        float f8 = currentIconCenter - (this.swipeDirection * f7);
        float f9 = 1.0f;
        setAlpha(y6i0.c(f / this.revealAnchorSize, 0.0f, 1.0f));
        updateBackgroundRect(measuredWidth, f);
        ImageView imageView = this.iconView;
        imageView.setTranslationX(currentIconCenter - this.iconBaseCenter);
        if (!isRevealedSpring) {
            float f10 = this.iconSize;
            f9 = y6i0.c((f - f10) / (this.revealAnchorSize - f10), 0.0f, 1.0f);
        }
        imageView.setAlpha(f9);
        RobotoTextView robotoTextView = this.textView;
        robotoTextView.setTranslationX(f8 - f6);
        robotoTextView.setAlpha(textAlpha(f, f5));
        invalidate();
    }

    private final void updateRevealProgress(float revealedWidth, boolean isRevealedSpring) {
        if (this.revealedWidth == revealedWidth) {
            return;
        }
        this.revealedWidth = revealedWidth;
        updateContent(isRevealedSpring);
    }

    public static /* synthetic */ void updateRevealProgress$default(SwipeableTrackingCardDeferButtonView swipeableTrackingCardDeferButtonView, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        swipeableTrackingCardDeferButtonView.updateRevealProgress(f, z);
    }

    public static /* synthetic */ void updateRevealProgressByTranslation$default(SwipeableTrackingCardDeferButtonView swipeableTrackingCardDeferButtonView, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        swipeableTrackingCardDeferButtonView.updateRevealProgressByTranslation(f, z);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.backgroundPaint.setColor(qje.t(xng0.controlMinor, getContext()));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.revealedWidth <= 0.0f) {
            return;
        }
        RectF rectF = this.backgroundRect;
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final float getButtonSpacing() {
        return this.buttonSpacing;
    }

    public final float getRevealAnchorOffset() {
        return this.revealAnchorOffset;
    }

    public final float getRevealedWidth() {
        return this.revealedWidth;
    }

    public final CharSequence getText() {
        return this.textView.getText();
    }

    public final boolean isRevealed(float translation) {
        return revealedWidth(translation) >= this.revealAnchorSize;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.revealedWidth <= 0.0f) {
            return;
        }
        RectF rectF = this.backgroundRect;
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.backgroundRect.bottom = h;
        updateBackgroundRect(w, this.revealedWidth);
    }

    public final void resetReveal() {
        updateRevealProgress$default(this, 0.0f, false, 2, null);
    }

    public final void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public final void updateRevealProgressByTranslation(float translation, boolean isRevealedSpring) {
        updateRevealProgress(revealedWidth(translation), isRevealedSpring);
    }

    public SwipeableTrackingCardDeferButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SwipeableTrackingCardDeferButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SwipeableTrackingCardDeferButtonView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SwipeableTrackingCardDeferButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
