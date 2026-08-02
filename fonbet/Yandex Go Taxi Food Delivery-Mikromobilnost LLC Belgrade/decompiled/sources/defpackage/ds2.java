package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ds2 {
    public final TextView a;
    public cfz0 b;
    public cfz0 c;
    public cfz0 d;
    public cfz0 e;
    public cfz0 f;
    public cfz0 g;
    public cfz0 h;
    public final js2 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public ds2(TextView textView) {
        this.a = textView;
        this.i = new js2(textView);
    }

    public static cfz0 c(Context context, or2 or2Var, int i) {
        ColorStateList g;
        synchronized (or2Var) {
            g = or2Var.a.g(i, context);
        }
        if (g == null) {
            return null;
        }
        cfz0 cfz0Var = new cfz0();
        cfz0Var.d = true;
        cfz0Var.a = g;
        return cfz0Var;
    }

    public final void a(Drawable drawable, cfz0 cfz0Var) {
        if (drawable == null || cfz0Var == null) {
            return;
        }
        or2.e(drawable, cfz0Var, this.a.getDrawableState());
    }

    public final void b() {
        cfz0 cfz0Var = this.b;
        TextView textView = this.a;
        if (cfz0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        cfz0 cfz0Var = this.h;
        if (cfz0Var != null) {
            return cfz0Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        cfz0 cfz0Var = this.h;
        if (cfz0Var != null) {
            return cfz0Var.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        float f2;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        or2 a = or2.a();
        dfz0 e = dfz0.e(i, 0, context, attributeSet, n4i0.AppCompatTextHelper);
        Context context2 = textView.getContext();
        int[] iArr = n4i0.AppCompatTextHelper;
        TypedArray typedArray = e.b;
        WeakHashMap weakHashMap = b.a;
        sp31.b(textView, context2, iArr, attributeSet, typedArray, i, 0);
        int i3 = n4i0.AppCompatTextHelper_android_textAppearance;
        TypedArray typedArray2 = e.b;
        int resourceId3 = typedArray2.getResourceId(i3, -1);
        if (typedArray2.hasValue(n4i0.AppCompatTextHelper_android_drawableLeft)) {
            this.b = c(context, a, typedArray2.getResourceId(n4i0.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (typedArray2.hasValue(n4i0.AppCompatTextHelper_android_drawableTop)) {
            this.c = c(context, a, typedArray2.getResourceId(n4i0.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (typedArray2.hasValue(n4i0.AppCompatTextHelper_android_drawableRight)) {
            this.d = c(context, a, typedArray2.getResourceId(n4i0.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (typedArray2.hasValue(n4i0.AppCompatTextHelper_android_drawableBottom)) {
            this.e = c(context, a, typedArray2.getResourceId(n4i0.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (typedArray2.hasValue(n4i0.AppCompatTextHelper_android_drawableStart)) {
            this.f = c(context, a, typedArray2.getResourceId(n4i0.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (typedArray2.hasValue(n4i0.AppCompatTextHelper_android_drawableEnd)) {
            this.g = c(context, a, typedArray2.getResourceId(n4i0.AppCompatTextHelper_android_drawableEnd, 0));
        }
        e.g();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, n4i0.TextAppearance);
            dfz0 dfz0Var = new dfz0(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(n4i0.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = obtainStyledAttributes.getBoolean(n4i0.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            j(context, dfz0Var);
            str2 = obtainStyledAttributes.hasValue(n4i0.TextAppearance_textLocale) ? obtainStyledAttributes.getString(n4i0.TextAppearance_textLocale) : null;
            str = obtainStyledAttributes.hasValue(n4i0.TextAppearance_fontVariationSettings) ? obtainStyledAttributes.getString(n4i0.TextAppearance_fontVariationSettings) : null;
            dfz0Var.g();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, n4i0.TextAppearance, i, 0);
        dfz0 dfz0Var2 = new dfz0(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(n4i0.TextAppearance_textAllCaps)) {
            z = obtainStyledAttributes2.getBoolean(n4i0.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (obtainStyledAttributes2.hasValue(n4i0.TextAppearance_textLocale)) {
            str2 = obtainStyledAttributes2.getString(n4i0.TextAppearance_textLocale);
        }
        if (obtainStyledAttributes2.hasValue(n4i0.TextAppearance_fontVariationSettings)) {
            str = obtainStyledAttributes2.getString(n4i0.TextAppearance_fontVariationSettings);
        }
        if (obtainStyledAttributes2.hasValue(n4i0.TextAppearance_android_textSize) && obtainStyledAttributes2.getDimensionPixelSize(n4i0.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, dfz0Var2);
        dfz0Var2.g();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            bs2.d(textView, str);
        }
        if (str2 != null) {
            as2.b(textView, as2.a(str2));
        }
        js2 js2Var = this.i;
        Context context3 = js2Var.h;
        TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, n4i0.AppCompatTextView, i, 0);
        TextView textView2 = js2Var.g;
        sp31.b(textView2, textView2.getContext(), n4i0.AppCompatTextView, attributeSet, obtainStyledAttributes3, i, 0);
        if (obtainStyledAttributes3.hasValue(n4i0.AppCompatTextView_autoSizeTextType)) {
            js2Var.a = obtainStyledAttributes3.getInt(n4i0.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(n4i0.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes3.getDimension(n4i0.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(n4i0.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes3.getDimension(n4i0.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(n4i0.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes3.getDimension(n4i0.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (!obtainStyledAttributes3.hasValue(n4i0.AppCompatTextView_autoSizePresetSizes) || (resourceId2 = obtainStyledAttributes3.getResourceId(n4i0.AppCompatTextView_autoSizePresetSizes, 0)) <= 0) {
            f = 0.0f;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                f = 0.0f;
                for (int i4 = 0; i4 < length; i4++) {
                    iArr2[i4] = obtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                int[] a2 = js2.a(iArr2);
                js2Var.e = a2;
                boolean z4 = a2.length > 0;
                js2Var.f = z4;
                if (z4) {
                    js2Var.a = 1;
                    js2Var.c = a2[0];
                    js2Var.d = a2[r14 - 1];
                    js2Var.b = -1.0f;
                }
            } else {
                f = 0.0f;
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!js2Var.b()) {
            js2Var.a = 0;
        } else if (js2Var.a == 1) {
            if (!js2Var.f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= f) {
                    ny61.g(x4e.f("Minimum auto-size text size (", "px) is less or equal to (0px)", dimension2));
                    return;
                }
                if (dimension3 <= dimension2) {
                    ny61.g(x4e.e("Maximum auto-size text size (", dimension3, "px) is less or equal to minimum auto-size text size (", dimension2, "px)"));
                    return;
                }
                if (dimension <= f) {
                    ny61.g(x4e.f("The auto-size step granularity (", "px) is less or equal to (0px)", dimension));
                    return;
                }
                js2Var.a = 1;
                js2Var.c = dimension2;
                js2Var.d = dimension3;
                js2Var.b = dimension;
                js2Var.f = false;
            }
            if (js2Var.b() && js2Var.a == 1 && (!js2Var.f || js2Var.e.length == 0)) {
                int floor = ((int) Math.floor((js2Var.d - js2Var.c) / js2Var.b)) + 1;
                int[] iArr3 = new int[floor];
                for (int i5 = 0; i5 < floor; i5++) {
                    iArr3[i5] = Math.round((i5 * js2Var.b) + js2Var.c);
                }
                js2Var.e = js2.a(iArr3);
            }
        }
        if (js2Var.a != 0) {
            int[] iArr4 = js2Var.e;
            if (iArr4.length > 0) {
                if (bs2.a(textView) != -1.0f) {
                    bs2.b(textView, Math.round(js2Var.c), Math.round(js2Var.d), Math.round(js2Var.b), 0);
                } else {
                    bs2.c(textView, iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, n4i0.AppCompatTextView);
        int resourceId4 = obtainStyledAttributes4.getResourceId(n4i0.AppCompatTextView_drawableLeftCompat, -1);
        Drawable b = resourceId4 != -1 ? a.b(resourceId4, context) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(n4i0.AppCompatTextView_drawableTopCompat, -1);
        Drawable b2 = resourceId5 != -1 ? a.b(resourceId5, context) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(n4i0.AppCompatTextView_drawableRightCompat, -1);
        Drawable b3 = resourceId6 != -1 ? a.b(resourceId6, context) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(n4i0.AppCompatTextView_drawableBottomCompat, -1);
        Drawable b4 = resourceId7 != -1 ? a.b(resourceId7, context) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(n4i0.AppCompatTextView_drawableStartCompat, -1);
        Drawable b5 = resourceId8 != -1 ? a.b(resourceId8, context) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(n4i0.AppCompatTextView_drawableEndCompat, -1);
        Drawable b6 = resourceId9 != -1 ? a.b(resourceId9, context) : null;
        if (b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b5 == null) {
                b5 = compoundDrawablesRelative[0];
            }
            if (b2 == null) {
                b2 = compoundDrawablesRelative[1];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[2];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
        } else if (b != null || b2 != null || b3 != null || b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                if (b2 == null) {
                    b2 = compoundDrawablesRelative2[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b2, compoundDrawablesRelative2[2], b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(n4i0.AppCompatTextView_drawableTint)) {
            int i6 = n4i0.AppCompatTextView_drawableTint;
            if (!obtainStyledAttributes4.hasValue(i6) || (resourceId = obtainStyledAttributes4.getResourceId(i6, 0)) == 0 || (colorStateList = wuj0.a(context.getResources(), resourceId, context.getTheme())) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(i6);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(n4i0.AppCompatTextView_drawableTintMode)) {
            textView.setCompoundDrawableTintMode(vbm.c(obtainStyledAttributes4.getInt(n4i0.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(n4i0.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(n4i0.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (obtainStyledAttributes4.hasValue(n4i0.AppCompatTextView_lineHeight)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(n4i0.AppCompatTextView_lineHeight);
            if (peekValue != null && peekValue.type == 5) {
                int i7 = peekValue.data;
                i2 = i7 & 15;
                f2 = TypedValue.complexToFloat(i7);
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != -1) {
                    d6z.r(dimensionPixelSize);
                    znb1.c(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    d6z.r(dimensionPixelSize2);
                    Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
                    int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
                    if (dimensionPixelSize2 > Math.abs(i8)) {
                        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i8);
                    }
                }
                if (f2 == -1.0f) {
                    if (i2 == -1) {
                        androidx.core.widget.b.b(textView, (int) f2);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        sg.i(textView, i2, f2);
                        return;
                    } else {
                        androidx.core.widget.b.b(textView, Math.round(TypedValue.applyDimension(i2, f2, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            f2 = obtainStyledAttributes4.getDimensionPixelSize(n4i0.AppCompatTextView_lineHeight, -1);
        } else {
            f2 = -1.0f;
        }
        i2 = -1;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (f2 == -1.0f) {
        }
    }

    public final void g(int i, Context context) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, n4i0.TextAppearance);
        dfz0 dfz0Var = new dfz0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(n4i0.TextAppearance_textAllCaps);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(n4i0.TextAppearance_textAllCaps, false));
        }
        if (obtainStyledAttributes.hasValue(n4i0.TextAppearance_android_textSize) && obtainStyledAttributes.getDimensionPixelSize(n4i0.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, dfz0Var);
        if (obtainStyledAttributes.hasValue(n4i0.TextAppearance_fontVariationSettings) && (string = obtainStyledAttributes.getString(n4i0.TextAppearance_fontVariationSettings)) != null) {
            bs2.d(textView, string);
        }
        dfz0Var.g();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new cfz0();
        }
        cfz0 cfz0Var = this.h;
        cfz0Var.a = colorStateList;
        cfz0Var.d = colorStateList != null;
        this.b = cfz0Var;
        this.c = cfz0Var;
        this.d = cfz0Var;
        this.e = cfz0Var;
        this.f = cfz0Var;
        this.g = cfz0Var;
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new cfz0();
        }
        cfz0 cfz0Var = this.h;
        cfz0Var.b = mode;
        cfz0Var.c = mode != null;
        this.b = cfz0Var;
        this.c = cfz0Var;
        this.d = cfz0Var;
        this.e = cfz0Var;
        this.f = cfz0Var;
        this.g = cfz0Var;
    }

    public final void j(Context context, dfz0 dfz0Var) {
        String string;
        int i = n4i0.TextAppearance_android_textStyle;
        int i2 = this.j;
        TypedArray typedArray = dfz0Var.b;
        this.j = typedArray.getInt(i, i2);
        int i3 = typedArray.getInt(n4i0.TextAppearance_android_textFontWeight, -1);
        this.k = i3;
        if (i3 != -1) {
            this.j &= 2;
        }
        if (!typedArray.hasValue(n4i0.TextAppearance_android_fontFamily) && !typedArray.hasValue(n4i0.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(n4i0.TextAppearance_android_typeface)) {
                this.m = false;
                int i4 = typedArray.getInt(n4i0.TextAppearance_android_typeface, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(n4i0.TextAppearance_fontFamily) ? n4i0.TextAppearance_fontFamily : n4i0.TextAppearance_android_fontFamily;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface d = dfz0Var.d(i5, this.j, new zr2(this, i6, i7, new WeakReference(this.a)));
                if (d != null) {
                    if (this.k != -1) {
                        this.l = cs2.a(Typeface.create(d, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = d;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = cs2.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(string, this.j);
        }
    }
}
