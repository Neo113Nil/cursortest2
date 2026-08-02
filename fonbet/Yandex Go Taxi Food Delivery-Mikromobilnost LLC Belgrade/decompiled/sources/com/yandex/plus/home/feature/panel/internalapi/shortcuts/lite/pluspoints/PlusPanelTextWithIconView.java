package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.b;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.bb1;
import defpackage.f2d0;
import defpackage.ffx;
import defpackage.g2d0;
import defpackage.h2d0;
import defpackage.o7d0;
import defpackage.p3i0;
import defpackage.p7d0;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.ww90;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001HB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010$R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0018\u00106\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0018\u00107\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0018\u00108\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0018\u00109\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010/R\u0018\u0010:\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0018\u0010;\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010/R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010@\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelTextWithIconView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "text", "setText", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "setBrandType", "(Lcom/yandex/plus/core/strings/PlusSdkBrandType;)V", "Lh2d0;", "textDrawableHolder", "iconDrawableHolder", "setTextAndIconDrawableHolder", "(Lh2d0;Lh2d0;)V", "drawableHolder", "(Lh2d0;)V", "Ljava/lang/String;", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "Landroid/graphics/PorterDuffXfermode;", "xfermodeSrcIn", "Landroid/graphics/PorterDuffXfermode;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Bitmap;", "proxyBitmap", "Landroid/graphics/Bitmap;", "proxyCanvas", "Landroid/graphics/Canvas;", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "iconBitmap", "textAndIconBackgroundDrawable", "textAndIconBackgroundBitmap", "textBackgroundDrawable", "textBackgroundBitmap", "iconBackgroundDrawable", "iconBackgroundBitmap", "", "textDrawingXPos", "F", "textDrawingYPos", "iconDrawingXPos", "iconDrawingYPos", "paddingBetweenTextAndIcon", CA20Status.STATUS_USER_I, "", "isSeparateTextAndIconColor", "Z", "Companion", "o7d0", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelTextWithIconView extends View {
    public static final o7d0 Companion = new o7d0();
    private static final int DEFAULT_PADDING_BETWEEN_TEXT_AND_ICON_DP = 8;
    private static final int DEFAULT_TEXT_SIZE_SP = 32;
    private PlusSdkBrandType brandType;
    private Bitmap iconBackgroundBitmap;
    private Drawable iconBackgroundDrawable;
    private Bitmap iconBitmap;
    private Drawable iconDrawable;
    private float iconDrawingXPos;
    private final float iconDrawingYPos;
    private boolean isSeparateTextAndIconColor;
    private final int paddingBetweenTextAndIcon;
    private final Paint paint;
    private Bitmap proxyBitmap;
    private Canvas proxyCanvas;
    private String text;
    private Bitmap textAndIconBackgroundBitmap;
    private Drawable textAndIconBackgroundDrawable;
    private Bitmap textBackgroundBitmap;
    private Drawable textBackgroundDrawable;
    private float textDrawingXPos;
    private float textDrawingYPos;
    private final PorterDuffXfermode xfermodeSrcIn;

    public PlusPanelTextWithIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.text = "";
        this.brandType = PlusSdkBrandType.YANDEX;
        this.xfermodeSrcIn = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.paint = new Paint();
        this.paddingBetweenTextAndIcon = (int) (8.0f * context.getResources().getDisplayMetrics().density);
        WeakHashMap weakHashMap = b.a;
        setImportantForAccessibility(1);
        bb1.T(this, attributeSet, p3i0.PlusPanelTextWithIconView, new ww90(29, this, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(PlusPanelTextWithIconView plusPanelTextWithIconView, Context context, TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(p3i0.PlusPanelTextWithIconView_plus_sdk_fontFamily, 0);
        if (resourceId > 0) {
            plusPanelTextWithIconView.paint.setTypeface(wuj0.b(resourceId, context));
        }
        plusPanelTextWithIconView.paint.setTextSize(typedArray.getDimension(p3i0.PlusPanelTextWithIconView_plus_sdk_fontSize, (int) (32.0f * context.getResources().getDisplayMetrics().scaledDensity)));
        Drawable drawable = typedArray.getDrawable(p3i0.PlusPanelTextWithIconView_plus_sdk_iconDrawable);
        plusPanelTextWithIconView.iconDrawable = drawable;
        if (drawable == null) {
            return null;
        }
        float f = plusPanelTextWithIconView.paint.getFontMetrics().descent - plusPanelTextWithIconView.paint.getFontMetrics().ascent;
        drawable.setBounds(0, 0, (int) ((f / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth()), (int) f);
        return zy11.a;
    }

    public final String getText() {
        return this.text;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Bitmap bitmap = this.proxyBitmap;
        if (bitmap == null || (canvas2 = this.proxyCanvas) == null) {
            return;
        }
        bitmap.eraseColor(0);
        this.paint.setXfermode(null);
        canvas2.drawText(this.text, this.textDrawingXPos, this.textDrawingYPos, this.paint);
        Bitmap bitmap2 = this.iconBitmap;
        if (bitmap2 != null) {
            canvas2.drawBitmap(bitmap2, this.iconDrawingXPos, this.iconDrawingYPos, this.paint);
        }
        this.paint.setXfermode(this.xfermodeSrcIn);
        if (this.isSeparateTextAndIconColor) {
            Bitmap bitmap3 = this.textBackgroundBitmap;
            if (bitmap3 != null) {
                canvas2.drawBitmap(bitmap3, this.textDrawingXPos, 0.0f, this.paint);
            }
            Bitmap bitmap4 = this.iconBackgroundBitmap;
            if (bitmap4 != null) {
                canvas2.drawBitmap(bitmap4, this.iconDrawingXPos, 0.0f, this.paint);
            }
        } else {
            Bitmap bitmap5 = this.textAndIconBackgroundBitmap;
            if (bitmap5 != null) {
                canvas2.drawBitmap(bitmap5, 0.0f, 0.0f, this.paint);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Rect bounds;
        Rect bounds2;
        int measureText = (int) this.paint.measureText(this.text);
        int i = (int) (this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top);
        Drawable drawable = this.iconDrawable;
        int i2 = 0;
        int width = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? 0 : bounds2.width();
        Drawable drawable2 = this.iconDrawable;
        int height = (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? 0 : bounds.height();
        int paddingEnd = getPaddingEnd() + getPaddingStart() + this.paddingBetweenTextAndIcon + measureText + width;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(i, height);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = (mode == Integer.MIN_VALUE || mode == 0) ? paddingEnd : mode != 1073741824 ? 0 : View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            i2 = paddingBottom;
        } else if (mode2 == 1073741824) {
            i2 = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        if (size > 0 && i2 > 0) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            this.proxyBitmap = Bitmap.createBitmap(size, i2, config);
            this.proxyCanvas = new Canvas(this.proxyBitmap);
            if (paddingEnd > 0 && paddingBottom > 0) {
                Drawable drawable3 = this.textAndIconBackgroundDrawable;
                this.textAndIconBackgroundBitmap = drawable3 != null ? ffx.c0(drawable3, paddingEnd, paddingBottom, config) : null;
            }
            if (measureText > 0 && i > 0) {
                Drawable drawable4 = this.textBackgroundDrawable;
                this.textBackgroundBitmap = drawable4 != null ? ffx.c0(drawable4, measureText, i, config) : null;
            }
            if (width > 0 && height > 0) {
                Drawable drawable5 = this.iconBackgroundDrawable;
                this.iconBackgroundBitmap = drawable5 != null ? ffx.c0(drawable5, width, height, config) : null;
                Drawable drawable6 = this.iconDrawable;
                this.iconBitmap = drawable6 != null ? ffx.c0(drawable6, width, height, config) : null;
            }
            int i3 = p7d0.a[this.brandType.ordinal()];
            if (i3 == 1) {
                this.textDrawingXPos = 0.0f;
                this.iconDrawingXPos = measureText + this.paddingBetweenTextAndIcon;
            } else if (i3 != 2) {
                w511.b();
                return;
            } else {
                this.textDrawingXPos = width + this.paddingBetweenTextAndIcon;
                this.iconDrawingXPos = 0.0f;
            }
            this.textDrawingYPos = (getMeasuredHeight() / 2.0f) - ((this.paint.getFontMetrics().ascent + this.paint.getFontMetrics().descent) / 2.0f);
        }
        setMeasuredDimension(size, i2);
    }

    public final void setBrandType(PlusSdkBrandType brandType) {
        this.brandType = brandType;
        invalidate();
        requestLayout();
    }

    public final void setText(String text) {
        this.text = text;
        setContentDescription(text);
        invalidate();
        requestLayout();
    }

    public final void setTextAndIconDrawableHolder(h2d0 textDrawableHolder, h2d0 iconDrawableHolder) {
        Drawable drawable;
        this.isSeparateTextAndIconColor = true;
        Drawable drawable2 = null;
        if (textDrawableHolder instanceof f2d0) {
            drawable = new ColorDrawable(((f2d0) textDrawableHolder).a);
        } else if (textDrawableHolder instanceof g2d0) {
            drawable = ((g2d0) textDrawableHolder).a;
        } else {
            if (textDrawableHolder != null) {
                w511.b();
                return;
            }
            drawable = null;
        }
        this.textBackgroundDrawable = drawable;
        if (iconDrawableHolder instanceof f2d0) {
            drawable2 = new ColorDrawable(((f2d0) iconDrawableHolder).a);
        } else if (iconDrawableHolder instanceof g2d0) {
            drawable2 = ((g2d0) iconDrawableHolder).a;
        } else if (iconDrawableHolder != null) {
            w511.b();
            return;
        }
        this.iconBackgroundDrawable = drawable2;
        invalidate();
        requestLayout();
    }

    public PlusPanelTextWithIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PlusPanelTextWithIconView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ PlusPanelTextWithIconView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public PlusPanelTextWithIconView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public final void setTextAndIconDrawableHolder(h2d0 drawableHolder) {
        Drawable drawable;
        this.isSeparateTextAndIconColor = false;
        if (drawableHolder instanceof f2d0) {
            drawable = new ColorDrawable(((f2d0) drawableHolder).a);
        } else if (drawableHolder instanceof g2d0) {
            drawable = ((g2d0) drawableHolder).a;
        } else {
            if (drawableHolder != null) {
                w511.b();
                return;
            }
            drawable = null;
        }
        this.textAndIconBackgroundDrawable = drawable;
        invalidate();
        requestLayout();
    }
}
