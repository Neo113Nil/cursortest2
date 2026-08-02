package com.yandex.go.design;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.f1h0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.oyr;
import defpackage.qje;
import defpackage.sf5;
import defpackage.tf5;
import defpackage.tje;
import defpackage.u8b1;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 G2\u00020\u0001:\u0002H\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u000e2\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0014¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\u0006H\u0014¢\u0006\u0004\b-\u0010\u0012J/\u00102\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b6\u00107R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00108R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00108R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00109R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010>R\u0016\u0010D\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u00108R\u0016\u0010E\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/yandex/go/design/BatteryChargeViewV2;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maskResId", "Landroid/graphics/Bitmap;", "getMaskFromDrawable", "(I)Landroid/graphics/Bitmap;", "Lzy11;", "updateView", "()V", "getChargeColor", "()I", "resolveBackgroundColor", "", "minTextSize", "maxTextSize", "updateTextSize", "(FF)V", "setMask", "(I)V", "lowChargePercent", "mediumChargePercent", "setLowAndMediumChargePercents", "(II)V", "Lsf5;", "appearanceOption", "setAppearanceOption", "(Lsf5;)V", "chargeLevel", "", "formattedText", "setChargeLevel", "(ILjava/lang/CharSequence;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "getSuggestedMinimumWidth", "getSuggestedMinimumHeight", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", CA20Status.STATUS_USER_I, "Lsf5;", "maskBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "maskPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "maskRect", "Landroid/graphics/Rect;", "backgroundRectPaint", "chargeRectPaint", "currentChargePercent", "currentFormattedText", "Ljava/lang/CharSequence;", "Companion", "tf5", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BatteryChargeViewV2 extends RobotoTextView {
    public static final int $stable = 8;
    public static final tf5 Companion = new tf5();
    private static final int MAX_CHARGE_PERCENT = 100;
    private static final int MIN_CHARGE_PERCENT = 0;
    private sf5 appearanceOption;
    private final Paint backgroundRectPaint;
    private final Paint chargeRectPaint;
    private int currentChargePercent;
    private CharSequence currentFormattedText;
    private int lowChargePercent;
    private Bitmap maskBitmap;
    private final Paint maskPaint;
    private final Rect maskRect;
    private int mediumChargePercent;

    public BatteryChargeViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lowChargePercent = 5;
        this.mediumChargePercent = 30;
        this.appearanceOption = new sf5(true, true, true);
        this.maskBitmap = getMaskFromDrawable(f1h0.ic_battery_v2_mask);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.maskPaint = paint;
        this.maskRect = new Rect();
        setLayerType(2, null);
        setGravity(17);
        setPadding(tje.u(4, getContext()), 0, tje.u(6, getContext()), 0);
        setTextColorAttr(xng0.textMain);
        setMaxLines(1);
        updateTextSize(tje.r(mrg0.component_text_size_caption_secondary, getContext()), tje.r(mrg0.component_text_size_body, getContext()));
        Paint paint2 = new Paint();
        paint2.setColor(resolveBackgroundColor());
        paint2.setAntiAlias(true);
        this.backgroundRectPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(getContext().getColor(mqg0.component_green_normal));
        paint3.setAntiAlias(true);
        this.chargeRectPaint = paint3;
        this.currentChargePercent = 100;
        this.currentFormattedText = "";
    }

    private final int getChargeColor() {
        if (!this.appearanceOption.b) {
            return getContext().getColor(mqg0.component_green_normal);
        }
        int i = this.currentChargePercent;
        if (i <= this.lowChargePercent) {
            return getContext().getColor(mqg0.component_red_toxic);
        }
        if (i <= this.mediumChargePercent) {
            return getContext().getColor(mqg0.component_orange_toxic);
        }
        return getContext().getColor(mqg0.component_green_normal);
    }

    private final Bitmap getMaskFromDrawable(int maskResId) {
        return u8b1.h(maskResId, getContext()).extractAlpha();
    }

    private final int resolveBackgroundColor() {
        return qje.t(xng0.controlMinor, getContext());
    }

    public static /* synthetic */ void setChargeLevel$default(BatteryChargeViewV2 batteryChargeViewV2, int i, CharSequence charSequence, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charSequence = "";
        }
        batteryChargeViewV2.setChargeLevel(i, charSequence);
    }

    private final void updateView() {
        this.chargeRectPaint.setColor(getChargeColor());
        invalidate();
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.backgroundRectPaint.setColor(resolveBackgroundColor());
        updateView();
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return getMinHeight() <= 0 ? this.maskBitmap.getHeight() : getMinHeight();
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return getMinWidth() <= 0 ? this.maskBitmap.getWidth() : getMinWidth();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.appearanceOption.c ? this.chargeRectPaint : this.backgroundRectPaint);
        if (!this.appearanceOption.c) {
            canvas.drawRect(0.0f, 0.0f, (this.currentChargePercent / 100.0f) * getWidth(), getHeight(), this.chargeRectPaint);
        }
        super.onDraw(canvas);
        canvas.drawBitmap(this.maskBitmap, (Rect) null, this.maskRect, this.maskPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.maskRect.set(0, 0, w, h);
    }

    public final void setAppearanceOption(sf5 appearanceOption) {
        this.appearanceOption = appearanceOption;
        setChargeLevel(this.currentChargePercent, this.currentFormattedText);
        updateView();
    }

    public final void setChargeLevel(int chargeLevel, CharSequence formattedText) {
        if (chargeLevel < 0 || chargeLevel >= 101) {
            w511.f(oyr.j(chargeLevel, "Value ", " must be between 0 and 100"));
            return;
        }
        this.currentChargePercent = chargeLevel;
        this.currentFormattedText = formattedText;
        if (!this.appearanceOption.a) {
            formattedText = "";
        }
        setText(formattedText);
        updateView();
    }

    public final void setLowAndMediumChargePercents(int lowChargePercent, int mediumChargePercent) {
        if (lowChargePercent < 0 || lowChargePercent >= 101) {
            w511.f(oyr.j(lowChargePercent, "lowChargePercent ", " must be between 0 and 100"));
            return;
        }
        if (mediumChargePercent < 0 || mediumChargePercent >= 101) {
            w511.f(oyr.j(mediumChargePercent, "mediumChargePercent ", " must be between 0 and 100"));
        } else {
            if (mediumChargePercent <= lowChargePercent) {
                w511.f(oyr.h(lowChargePercent, mediumChargePercent, "lowChargePercent ", " must be less than mediumChargePercent "));
                return;
            }
            this.lowChargePercent = lowChargePercent;
            this.mediumChargePercent = mediumChargePercent;
            updateView();
        }
    }

    public final void setMask(int maskResId) {
        this.maskBitmap = getMaskFromDrawable(maskResId);
        requestLayout();
    }

    public final void updateTextSize(float minTextSize, float maxTextSize) {
        setTextSize(0, maxTextSize);
        enableAutoSize(minTextSize, maxTextSize, 1);
    }

    public BatteryChargeViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BatteryChargeViewV2(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BatteryChargeViewV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
