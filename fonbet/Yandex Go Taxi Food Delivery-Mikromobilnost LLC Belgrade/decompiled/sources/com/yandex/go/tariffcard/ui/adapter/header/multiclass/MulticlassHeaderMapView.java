package com.yandex.go.tariffcard.ui.adapter.header.multiclass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.lt00;
import defpackage.n;
import defpackage.njs0;
import defpackage.o68;
import defpackage.p68;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R*\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00105\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010:\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103¨\u0006;"}, d2 = {"Lcom/yandex/go/tariffcard/ui/adapter/header/multiclass/MulticlassHeaderMapView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/drawable/Drawable;", "value", "mapDrawable", "Landroid/graphics/drawable/Drawable;", "getMapDrawable", "()Landroid/graphics/drawable/Drawable;", "setMapDrawable", "(Landroid/graphics/drawable/Drawable;)V", "pin", "getPin", "setPin", "Llt00;", "uiState", "Llt00;", "getUiState", "()Llt00;", "setUiState", "(Llt00;)V", "Lnjs0;", "mapReferenceSizePx", "Lnjs0;", "getMapReferenceSizePx", "()Lnjs0;", "setMapReferenceSizePx", "(Lnjs0;)V", "Landroid/graphics/Rect;", "contentRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "mapRectF", "Landroid/graphics/RectF;", "", "scale", "F", "sx", "sy", "pinWidth", CA20Status.STATUS_USER_I, "pinHeight", "pinLeft", "pinTop", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MulticlassHeaderMapView extends View {
    private final Rect contentRect;
    private Drawable mapDrawable;
    private final RectF mapRectF;
    private njs0 mapReferenceSizePx;
    private Drawable pin;
    private int pinHeight;
    private float pinLeft;
    private float pinTop;
    private int pinWidth;
    private float scale;
    private float sx;
    private float sy;
    private lt00 uiState;

    public MulticlassHeaderMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.uiState = lt00.d;
        this.mapReferenceSizePx = new njs0();
        this.contentRect = new Rect();
        this.mapRectF = new RectF();
        this.scale = 1.0f;
        this.sx = 1.0f;
        this.sy = 1.0f;
    }

    public final Drawable getMapDrawable() {
        return this.mapDrawable;
    }

    public final njs0 getMapReferenceSizePx() {
        return this.mapReferenceSizePx;
    }

    public final Drawable getPin() {
        return this.pin;
    }

    public final lt00 getUiState() {
        return this.uiState;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.mapDrawable;
        if (drawable != null && this.contentRect.width() > 0 && this.contentRect.height() > 0 && this.mapRectF.width() > 0.0f && this.mapRectF.height() > 0.0f) {
            RectF rectF = this.mapRectF;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (Drawable drawable2 : this.uiState.b) {
                RectF rectF2 = this.mapRectF;
                drawable2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                drawable2.draw(canvas);
            }
            drawable.draw(canvas);
            for (Drawable drawable3 : this.uiState.a) {
                RectF rectF3 = this.mapRectF;
                drawable3.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                drawable3.draw(canvas);
            }
            Drawable drawable4 = this.pin;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, this.pinWidth, this.pinHeight);
            }
            float f = this.pinLeft;
            float f2 = this.pinTop;
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                Drawable drawable5 = this.pin;
                if (drawable5 != null) {
                    drawable5.draw(canvas);
                }
                canvas.restoreToCount(save);
                for (p68 p68Var : this.uiState.c) {
                    Drawable drawable6 = p68Var.a;
                    o68 o68Var = p68Var.b;
                    drawable6.setBounds(0, 0, 60, 120);
                    RectF rectF4 = this.mapRectF;
                    float f3 = ((o68Var.a * this.sx) + rectF4.left) - 30.0f;
                    float f4 = ((o68Var.b * this.sy) + rectF4.top) - 60.0f;
                    save = canvas.save();
                    canvas.translate(f3, f4);
                    try {
                        canvas.rotate(o68Var.c, 30.0f, 60.0f);
                        p68Var.a.draw(canvas);
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingLeft;
        int i;
        Drawable drawable = this.mapDrawable;
        if (drawable == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i2 = Integer.MAX_VALUE;
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
        } else {
            paddingLeft = Integer.MAX_VALUE;
        }
        if ((mode2 == Integer.MIN_VALUE || mode2 == 1073741824) && (i2 = (size2 - getPaddingTop()) - getPaddingBottom()) < 0) {
            i2 = 0;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        Integer valueOf = Integer.valueOf(intrinsicWidth);
        if (intrinsicWidth <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Integer valueOf2 = intrinsicHeight > 0 ? Integer.valueOf(intrinsicHeight) : null;
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
        if (intValue <= 0 || intValue2 <= 0) {
            i = 0;
        } else {
            float f = intValue;
            float f2 = intValue2;
            float min = Math.min(paddingLeft / f, i2 / f2);
            if (min > 1.0f) {
                min = 1.0f;
            }
            this.scale = min;
            int i3 = (int) (f * min);
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = (int) (f2 * min);
            i = i4 >= 0 ? i4 : 0;
            r6 = i3;
        }
        if (mode == Integer.MIN_VALUE) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + r6;
            if (paddingRight <= size) {
                size = paddingRight;
            }
        } else if (mode != 1073741824) {
            size = getPaddingLeft() + r6 + getPaddingRight();
        }
        if (mode2 == Integer.MIN_VALUE) {
            int paddingBottom = getPaddingBottom() + getPaddingTop() + i;
            if (paddingBottom <= size2) {
                size2 = paddingBottom;
            }
        } else if (mode2 != 1073741824) {
            size2 = getPaddingTop() + i + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
        this.contentRect.set(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
        float f3 = this.scale;
        float f4 = intValue * f3;
        float f5 = intValue2 * f3;
        Rect rect = this.contentRect;
        float a = n.a(rect.width(), f4, 2.0f, rect.left);
        Rect rect2 = this.contentRect;
        float a2 = n.a(rect2.height(), f5, 2.0f, rect2.top);
        this.mapRectF.set(a, a2, f4 + a, f5 + a2);
        this.mapReferenceSizePx.getClass();
        float width = this.mapRectF.width();
        this.mapReferenceSizePx.getClass();
        this.sx = width / 1152.0f;
        float height = this.mapRectF.height();
        this.mapReferenceSizePx.getClass();
        this.sy = height / 432.0f;
        Drawable drawable2 = this.pin;
        this.pinWidth = drawable2 != null ? drawable2.getIntrinsicWidth() : 150;
        Drawable drawable3 = this.pin;
        this.pinHeight = drawable3 != null ? drawable3.getIntrinsicHeight() : 150;
        this.pinLeft = (this.contentRect.width() / 2.0f) - (this.pinWidth / 2);
        this.pinTop = (350.0f * this.sy) - this.pinHeight;
    }

    public final void setMapDrawable(Drawable drawable) {
        this.mapDrawable = drawable;
        requestLayout();
        invalidate();
    }

    public final void setMapReferenceSizePx(njs0 njs0Var) {
        this.mapReferenceSizePx = njs0Var;
        requestLayout();
    }

    public final void setPin(Drawable drawable) {
        this.pin = drawable;
        requestLayout();
        invalidate();
    }

    public final void setUiState(lt00 lt00Var) {
        this.uiState = lt00Var;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MulticlassHeaderMapView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MulticlassHeaderMapView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
