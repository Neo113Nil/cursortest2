package com.yandex.plus.plaquesdk.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.plus.plaquesdk.theme.ThemeType;
import com.yandex.plus.plaquesdk.widget.RobotoTextView;
import defpackage.d9e;
import defpackage.hob1;
import defpackage.ig;
import defpackage.ny61;
import defpackage.s3i0;
import defpackage.tng0;
import defpackage.uid;
import defpackage.vng;
import defpackage.wuj0;
import defpackage.xqb1;
import defpackage.zt3;
import defpackage.zvk0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ)\u0010\"\u001a\u00020\u000e2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010\u0010J\u0019\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020%H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010\u0010J\u000f\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0004\b-\u0010\u0010J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0014¢\u0006\u0004\b/\u00100J/\u00105\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J#\u0010?\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u000e¢\u0006\u0004\bA\u0010\u0010J\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010P\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010O\u001a\u0004\bQ\u0010\u0014\"\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, d2 = {"Lcom/yandex/plus/plaquesdk/widget/RobotoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "calcMinWidth", "(I)I", "Lzy11;", "removeAutoSizeListener", "()V", "addAutoSizeListener", "", "autoSize", "()Z", "Landroid/content/res/TypedArray;", "attributes", "resolveThemebleAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "attrId", "setTextColorAttr", "(I)V", "color", "setTextColor", "", "minTextSize", "maxTextSize", "maxLines", "enableAutoSize", "(FFI)V", "disableAutoSize", "Landroid/graphics/drawable/Drawable;", "drawable", "setForeground", "(Landroid/graphics/drawable/Drawable;)V", "who", "verifyDrawable", "(Landroid/graphics/drawable/Drawable;)Z", "jumpDrawablesToCurrentState", "drawableStateChanged", "heightMeasureSpec", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "invalidateAutosize", "Lcom/yandex/plus/plaquesdk/theme/ThemeType;", "themeType", "applyTheme", "(Lcom/yandex/plus/plaquesdk/theme/ThemeType;)V", "textViewForeground", "Landroid/graphics/drawable/Drawable;", "Lzt3;", "autoSizeTextCalculator", "Lzt3;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "autoSizeEllipsizeListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "needAutoSize", "Z", "useMinimumWidth", "getUseMinimumWidth", "setUseMinimumWidth", "(Z)V", "backgroundRes", CA20Status.STATUS_USER_I, "fallbackColor", "textColor", "Ljava/lang/Integer;", "Companion", "zvk0", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public class RobotoTextView extends AppCompatTextView {
    private static final String ANDROID_TEXT_COLOR_ATTR = "android:textColor";
    private ViewTreeObserver.OnPreDrawListener autoSizeEllipsizeListener;
    private zt3 autoSizeTextCalculator;
    private final int backgroundRes;
    private final int fallbackColor;
    private boolean needAutoSize;
    private Integer textColor;
    private Drawable textViewForeground;
    private boolean useMinimumWidth;
    public static final zvk0 Companion = new zvk0();
    private static final int ANDROID_TEXT_COLOR_STYLE = s3i0.plaque_sdk_RobotoTextView_android_textColor;

    public RobotoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fallbackColor = xqb1.c(context, tng0.plaque_sdk_textMain);
        Companion.getClass();
        zvk0.a(this, context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s3i0.plaque_sdk_RobotoTextView, i, 0);
        try {
            this.useMinimumWidth = obtainStyledAttributes.getBoolean(s3i0.plaque_sdk_RobotoTextView_plaque_sdk_useMinimumWidth, false);
            this.backgroundRes = obtainStyledAttributes.getResourceId(s3i0.plaque_sdk_RobotoTextView_android_background, 0);
            resolveThemebleAttrs(attributeSet, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            b.p(this, ig.a);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void addAutoSizeListener() {
        if (this.autoSizeEllipsizeListener != null) {
            getViewTreeObserver().addOnPreDrawListener(this.autoSizeEllipsizeListener);
        }
    }

    private final boolean autoSize() {
        boolean z;
        float f;
        int[] iArr;
        CharSequence transformation;
        zt3 zt3Var = this.autoSizeTextCalculator;
        if (zt3Var != null) {
            RectF rectF = zt3Var.a;
            RobotoTextView robotoTextView = zt3Var.c;
            boolean z2 = true;
            if (robotoTextView.getMeasuredHeight() > 0 && robotoTextView.getMeasuredWidth() > 0) {
                int measuredWidth = (robotoTextView.getMeasuredWidth() - robotoTextView.getTotalPaddingLeft()) - robotoTextView.getTotalPaddingRight();
                int height = (robotoTextView.getHeight() - robotoTextView.getCompoundPaddingBottom()) - robotoTextView.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    int length = zt3Var.e.length;
                    if (length == 0) {
                        ny61.r("No available text sizes to choose from.");
                        return false;
                    }
                    int i = length - 1;
                    int i2 = 0;
                    int i3 = 1;
                    while (true) {
                        iArr = zt3Var.e;
                        if (i3 > i) {
                            break;
                        }
                        int i4 = (i3 + i) / 2;
                        int i5 = iArr[i4];
                        TextPaint textPaint = zt3Var.d;
                        CharSequence text = robotoTextView.getText();
                        TransformationMethod transformationMethod = robotoTextView.getTransformationMethod();
                        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, robotoTextView)) != null) {
                            text = transformation;
                        }
                        textPaint.reset();
                        textPaint.set(robotoTextView.getPaint());
                        textPaint.setTextSize(i5);
                        Layout.Alignment alignment = (Layout.Alignment) zt3Var.b(robotoTextView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                        int round = Math.round(rectF.right);
                        int maxLines = robotoTextView.getMaxLines();
                        boolean z3 = z2;
                        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) zt3Var.b(robotoTextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, round).setAlignment(alignment).setLineSpacing(robotoTextView.getLineSpacingExtra(), robotoTextView.getLineSpacingMultiplier()).setIncludePad(robotoTextView.getIncludeFontPadding()).setBreakStrategy(robotoTextView.getBreakStrategy()).setHyphenationFrequency(robotoTextView.getHyphenationFrequency());
                        if (maxLines == -1) {
                            maxLines = Integer.MAX_VALUE;
                        }
                        StaticLayout build = hyphenationFrequency.setMaxLines(maxLines).setTextDirection(textDirectionHeuristic).build();
                        if ((zt3Var.g == -1 || (build.getLineCount() <= zt3Var.g && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                            int i6 = i4 + 1;
                            i2 = i3;
                            i3 = i6;
                        } else {
                            i2 = i4 - 1;
                            i = i2;
                        }
                        z2 = z3;
                    }
                    z = z2;
                    f = iArr[i2];
                    if (f != 0.0f && getTextSize() != f) {
                        setTextSize(0, f);
                        return z;
                    }
                }
            }
            z = true;
            f = 0.0f;
            if (f != 0.0f) {
                setTextSize(0, f);
                return z;
            }
        }
        return false;
    }

    private final int calcMinWidth(int widthMeasureSpec) {
        if (!this.useMinimumWidth) {
            return Integer.MAX_VALUE;
        }
        Layout layout = getLayout();
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 || layout.getLineCount() <= 1) {
            return Integer.MAX_VALUE;
        }
        float minWidth = getMinWidth();
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            float lineMax = layout.getLineMax(i);
            if (lineMax > minWidth) {
                minWidth = lineMax;
            }
        }
        return getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(minWidth));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invalidateAutosize$lambda$4(RobotoTextView robotoTextView) {
        robotoTextView.removeAutoSizeListener();
        return !robotoTextView.autoSize();
    }

    private final void removeAutoSizeListener() {
        if (this.autoSizeEllipsizeListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.autoSizeEllipsizeListener);
        }
    }

    private final void resolveThemebleAttrs(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            setTextColorAttr(tng0.plaque_sdk_textMain);
            return;
        }
        int i = ANDROID_TEXT_COLOR_STYLE;
        int i2 = tng0.plaque_sdk_textMain;
        final int i3 = 0;
        d9e d9eVar = new d9e(this) { // from class: xvk0
            public final /* synthetic */ RobotoTextView b;

            {
                this.b = this;
            }

            @Override // defpackage.d9e
            public final void a(Integer num) {
                int i4 = i3;
                RobotoTextView robotoTextView = this.b;
                switch (i4) {
                    case 0:
                        RobotoTextView.resolveThemebleAttrs$lambda$6(robotoTextView, num);
                        break;
                    default:
                        RobotoTextView.resolveThemebleAttrs$lambda$7(robotoTextView, num);
                        break;
                }
            }
        };
        final int i4 = 1;
        hob1.d(attrs, attributes, ANDROID_TEXT_COLOR_ATTR, i, i2, d9eVar, new d9e(this) { // from class: xvk0
            public final /* synthetic */ RobotoTextView b;

            {
                this.b = this;
            }

            @Override // defpackage.d9e
            public final void a(Integer num) {
                int i42 = i4;
                RobotoTextView robotoTextView = this.b;
                switch (i42) {
                    case 0:
                        RobotoTextView.resolveThemebleAttrs$lambda$6(robotoTextView, num);
                        break;
                    default:
                        RobotoTextView.resolveThemebleAttrs$lambda$7(robotoTextView, num);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$6(RobotoTextView robotoTextView, Integer num) {
        robotoTextView.setTextColorAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$7(RobotoTextView robotoTextView, Integer num) {
        Context context = robotoTextView.getContext();
        ColorStateList a = wuj0.a(context.getResources(), num.intValue(), context.getTheme());
        robotoTextView.setTextColor(a != null ? a.getDefaultColor() : robotoTextView.fallbackColor);
    }

    public static final void setRobotoViewAttributes(TextView textView, Context context, AttributeSet attributeSet, int i) {
        Companion.getClass();
        zvk0.a(textView, context, attributeSet, i);
    }

    public void applyTheme(ThemeType themeType) {
        Integer num = this.textColor;
        setTextColor(num != null ? num.intValue() : this.fallbackColor);
        int i = this.backgroundRes;
        if (i != 0) {
            setBackground(vng.t(i, getContext()));
        }
    }

    public final void disableAutoSize() {
        setAutoSizeTextTypeWithDefaults(0);
        this.autoSizeTextCalculator = null;
        this.needAutoSize = false;
        invalidateAutosize();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.textViewForeground;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        Drawable drawable2 = this.textViewForeground;
        if (drawable2 == null || !drawable2.isStateful() || (drawable = this.textViewForeground) == null) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void enableAutoSize(float minTextSize, float maxTextSize, int maxLines) {
        zt3 zt3Var = new zt3(this, minTextSize, maxTextSize, maxLines);
        zt3Var.g = maxLines;
        this.autoSizeTextCalculator = zt3Var;
        this.needAutoSize = true;
        invalidateAutosize();
    }

    public final boolean getUseMinimumWidth() {
        return this.useMinimumWidth;
    }

    public final void invalidateAutosize() {
        removeAutoSizeListener();
        this.autoSizeEllipsizeListener = null;
        if (this.needAutoSize) {
            this.autoSizeEllipsizeListener = new uid(2, this);
            addAutoSizeListener();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.textViewForeground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int calcMinWidth = calcMinWidth(widthMeasureSpec);
        if (calcMinWidth < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(calcMinWidth, 1073741824), heightMeasureSpec);
        }
        Drawable drawable = this.textViewForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Drawable drawable = this.textViewForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, w, h);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        super.setText(text, type);
        invalidateAutosize();
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        this.textColor = Integer.valueOf(color);
        super.setTextColor(color);
    }

    public void setTextColorAttr(int attrId) {
        setTextColor(xqb1.c(getContext(), attrId));
    }

    public final void setUseMinimumWidth(boolean z) {
        this.useMinimumWidth = z;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who.equals(this.textViewForeground);
    }

    public RobotoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RobotoTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? tng0.plaque_sdk_robotoTextViewStyle : i);
    }

    public RobotoTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
