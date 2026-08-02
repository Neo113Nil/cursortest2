package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import xsna.dbg0;
import xsna.hno0;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class p33 {

    @NonNull
    public final TextView a;
    public vyo0 b;
    public vyo0 c;
    public vyo0 d;
    public vyo0 e;
    public vyo0 f;
    public vyo0 g;
    public vyo0 h;

    @NonNull
    public final r33 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* compiled from: AppCompatTextHelper.java */
    public static class b {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    public static class c {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    public static class d {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public p33(@NonNull TextView textView) {
        this.a = textView;
        this.i = new r33(textView);
    }

    public static vyo0 c(Context context, d33 d33Var, int i) {
        ColorStateList f;
        synchronized (d33Var) {
            f = d33Var.a.f(i, context);
        }
        if (f == null) {
            return null;
        }
        vyo0 vyo0Var = new vyo0();
        vyo0Var.d = true;
        vyo0Var.a = f;
        return vyo0Var;
    }

    public final void a(Drawable drawable, vyo0 vyo0Var) {
        if (drawable == null || vyo0Var == null) {
            return;
        }
        d33.e(drawable, vyo0Var, this.a.getDrawableState());
    }

    public final void b() {
        vyo0 vyo0Var = this.b;
        TextView textView = this.a;
        if (vyo0Var != null || this.c != null || this.d != null || this.e != null) {
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

    @Nullable
    public final ColorStateList d() {
        vyo0 vyo0Var = this.h;
        if (vyo0Var != null) {
            return vyo0Var.a;
        }
        return null;
    }

    @Nullable
    public final PorterDuff.Mode e() {
        vyo0 vyo0Var = this.h;
        if (vyo0Var != null) {
            return vyo0Var.b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public final void f(@Nullable AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        d33 a2 = d33.a();
        int[] iArr = R$styleable.h;
        yyo0 e = yyo0.e(context, attributeSet, iArr, i, 0);
        iut0.p(textView, textView.getContext(), iArr, attributeSet, e.b, i);
        TypedArray typedArray = e.b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        e.f();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = R$styleable.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            yyo0 yyo0Var = new yyo0(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            j(context, yyo0Var);
            str2 = obtainStyledAttributes.hasValue(16) ? obtainStyledAttributes.getString(16) : null;
            str = obtainStyledAttributes.hasValue(13) ? obtainStyledAttributes.getString(13) : null;
            yyo0Var.f();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        yyo0 yyo0Var2 = new yyo0(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes2.hasValue(16)) {
            str2 = obtainStyledAttributes2.getString(16);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        j(context, yyo0Var2);
        yyo0Var2.f();
        if (!z3 && z) {
            textView.setAllCaps(z4);
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
            c.d(textView, str);
        }
        if (str2 != null) {
            b.b(textView, b.a(str2));
        }
        r33 r33Var = this.i;
        Context context2 = r33Var.h;
        int[] iArr3 = R$styleable.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = r33Var.g;
        iut0.p(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            r33Var.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!obtainStyledAttributes3.hasValue(3) || (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            i2 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr4[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                int[] a3 = r33.a(iArr4);
                r33Var.e = a3;
                boolean z5 = a3.length > 0;
                r33Var.f = z5;
                if (z5) {
                    r33Var.a = 1;
                    r33Var.c = a3[0];
                    r33Var.d = a3[r9 - 1];
                    r33Var.b = -1.0f;
                }
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!r33Var.b()) {
            r33Var.a = i2;
        } else if (r33Var.a == 1) {
            if (!r33Var.f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (f2 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                r33Var.a = 1;
                r33Var.c = dimension2;
                r33Var.d = f2;
                r33Var.b = dimension;
                r33Var.f = i2;
            }
            if (r33Var.b() && r33Var.a == 1 && (!r33Var.f || r33Var.e.length == 0)) {
                int floor = ((int) Math.floor((r33Var.d - r33Var.c) / r33Var.b)) + 1;
                int[] iArr5 = new int[floor];
                for (int i8 = 0; i8 < floor; i8++) {
                    iArr5[i8] = Math.round((i8 * r33Var.b) + r33Var.c);
                }
                r33Var.e = r33.a(iArr5);
            }
        }
        if (r33Var.a != 0) {
            int[] iArr6 = r33Var.e;
            if (iArr6.length > 0) {
                if (c.a(textView) != -1.0f) {
                    c.b(textView, Math.round(r33Var.c), Math.round(r33Var.d), Math.round(r33Var.b), 0);
                } else {
                    c.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b2 = resourceId4 != -1 ? a2.b(resourceId4, context) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b3 = resourceId5 != -1 ? a2.b(resourceId5, context) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b4 = resourceId6 != -1 ? a2.b(resourceId6, context) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b5 = resourceId7 != -1 ? a2.b(resourceId7, context) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b6 = resourceId8 != -1 ? a2.b(resourceId8, context) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b7 = resourceId9 != -1 ? a2.b(resourceId9, context) : null;
        if (b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b6 == null) {
                b6 = compoundDrawablesRelative[0];
            }
            if (b3 == null) {
                b3 = compoundDrawablesRelative[1];
            }
            if (b7 == null) {
                b7 = compoundDrawablesRelative[2];
            }
            if (b5 == null) {
                b5 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b6, b3, b7, b5);
        } else if (b2 != null || b3 != null || b4 != null || b5 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[2];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b5);
            } else {
                if (b3 == null) {
                    b3 = compoundDrawablesRelative2[1];
                }
                if (b5 == null) {
                    b5 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b3, compoundDrawablesRelative2[2], b5);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = anj.b(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            textView.setCompoundDrawableTintMode(rko.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i3);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i3);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i4 = -1;
                f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i5 = -1;
            } else {
                int i9 = peekValue.data;
                int i10 = i9 & 15;
                f = TypedValue.complexToFloat(i9);
                i5 = i10;
                i4 = -1;
            }
        } else {
            i4 = -1;
            i5 = -1;
            f = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i4) {
            obr.d(dimensionPixelSize);
            hno0.a.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i4) {
            obr.d(dimensionPixelSize2);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize2 > Math.abs(i11)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i11);
            }
        }
        if (f != -1.0f) {
            if (i5 == -1) {
                hno0.b(textView, (int) f);
            } else if (Build.VERSION.SDK_INT >= 34) {
                hno0.b.a(textView, i5, f);
            } else {
                hno0.b(textView, Math.round(TypedValue.applyDimension(i5, f, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(int i, Context context) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.w);
        yyo0 yyo0Var = new yyo0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        j(context, yyo0Var);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            c.d(textView, string);
        }
        yyo0Var.f();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(@Nullable ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new vyo0();
        }
        vyo0 vyo0Var = this.h;
        vyo0Var.a = colorStateList;
        vyo0Var.d = colorStateList != null;
        this.b = vyo0Var;
        this.c = vyo0Var;
        this.d = vyo0Var;
        this.e = vyo0Var;
        this.f = vyo0Var;
        this.g = vyo0Var;
    }

    public final void i(@Nullable PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new vyo0();
        }
        vyo0 vyo0Var = this.h;
        vyo0Var.b = mode;
        vyo0Var.c = mode != null;
        this.b = vyo0Var;
        this.c = vyo0Var;
        this.d = vyo0Var;
        this.e = vyo0Var;
        this.f = vyo0Var;
        this.g = vyo0Var;
    }

    public final void j(Context context, yyo0 yyo0Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = yyo0Var.b;
        this.j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.k = i2;
        if (i2 != -1) {
            this.j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface d2 = yyo0Var.d(i4, this.j, new a(i5, i6, new WeakReference(this.a)));
                if (d2 != null) {
                    if (this.k != -1) {
                        this.l = d.a(Typeface.create(d2, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = d2;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = d.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(string, this.j);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    public class a extends dbg0.c {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // xsna.dbg0.c
        public final void c(@NonNull Typeface typeface) {
            int i = this.a;
            if (i != -1) {
                typeface = d.a(typeface, i, (this.b & 2) != 0);
            }
            p33 p33Var = p33.this;
            if (p33Var.m) {
                p33Var.l = typeface;
                TextView textView = (TextView) this.c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new q33(textView, typeface, p33Var.j));
                    } else {
                        textView.setTypeface(typeface, p33Var.j);
                    }
                }
            }
        }

        @Override // xsna.dbg0.c
        public final void b(int i) {
        }
    }
}
