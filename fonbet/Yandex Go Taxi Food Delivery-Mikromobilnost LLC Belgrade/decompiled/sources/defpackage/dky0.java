package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes.dex */
public final class dky0 {
    public final ColorStateList a;
    public final String b;
    public String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public ColorStateList k;
    public float l;
    public final int m;
    public boolean n = false;
    public boolean o = false;
    public Typeface p;

    public dky0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, n4i0.TextAppearance);
        this.l = obtainStyledAttributes.getDimension(n4i0.TextAppearance_android_textSize, 0.0f);
        this.k = jx81.o(context, obtainStyledAttributes, n4i0.TextAppearance_android_textColor);
        jx81.o(context, obtainStyledAttributes, n4i0.TextAppearance_android_textColorHint);
        jx81.o(context, obtainStyledAttributes, n4i0.TextAppearance_android_textColorLink);
        this.d = obtainStyledAttributes.getInt(n4i0.TextAppearance_android_textStyle, 0);
        this.e = obtainStyledAttributes.getInt(n4i0.TextAppearance_android_typeface, 1);
        int i2 = n4i0.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : n4i0.TextAppearance_android_fontFamily;
        this.m = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(n4i0.TextAppearance_textAllCaps, false);
        this.a = jx81.o(context, obtainStyledAttributes, n4i0.TextAppearance_android_shadowColor);
        this.f = obtainStyledAttributes.getFloat(n4i0.TextAppearance_android_shadowDx, 0.0f);
        this.g = obtainStyledAttributes.getFloat(n4i0.TextAppearance_android_shadowDy, 0.0f);
        this.h = obtainStyledAttributes.getFloat(n4i0.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, z2i0.MaterialTextAppearance);
        this.i = obtainStyledAttributes2.hasValue(z2i0.MaterialTextAppearance_android_letterSpacing);
        this.j = obtainStyledAttributes2.getFloat(z2i0.MaterialTextAppearance_android_letterSpacing, 0.0f);
        int i3 = z2i0.MaterialTextAppearance_fontVariationSettings;
        this.c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(i3) ? i3 : z2i0.MaterialTextAppearance_android_fontVariationSettings);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.p;
        int i = this.d;
        if (typeface == null && (str = this.b) != null) {
            this.p = Typeface.create(str, i);
        }
        if (this.p == null) {
            int i2 = this.e;
            if (i2 == 1) {
                this.p = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.p = Typeface.SERIF;
            } else if (i2 != 3) {
                this.p = Typeface.DEFAULT;
            } else {
                this.p = Typeface.MONOSPACE;
            }
            this.p = Typeface.create(this.p, i);
        }
    }

    public final void b(Context context, eky0 eky0Var) {
        if (!c(context)) {
            a();
        }
        int i = this.m;
        if (i == 0) {
            this.n = true;
        }
        if (this.n) {
            eky0Var.b(this.p, true);
            return;
        }
        try {
            bky0 bky0Var = new bky0(this, eky0Var);
            ThreadLocal threadLocal = wuj0.a;
            if (context.isRestricted()) {
                bky0Var.a(-4);
            } else {
                wuj0.c(context, i, new TypedValue(), 0, bky0Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            eky0Var.a(1);
        } catch (Exception unused2) {
            this.n = true;
            eky0Var.a(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface c;
        String str;
        Typeface create;
        if (this.n) {
            return true;
        }
        int i = this.m;
        if (i != 0) {
            ThreadLocal threadLocal = wuj0.a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                c = null;
            } else {
                context2 = context;
                c = wuj0.c(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (c != null) {
                this.p = c;
                this.n = true;
                return true;
            }
            if (!this.o) {
                this.o = true;
                Resources resources = context2.getResources();
                int i2 = this.m;
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), j4i0.FontFamily);
                                str = obtainAttributes.getString(j4i0.FontFamily_fontProviderSystemFontFamily);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface != null) {
                this.p = typeface;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, eky0 eky0Var) {
        e(context, textPaint, eky0Var);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ModalContentViewContainer.BASE_SHADOW_COLOR);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.h, this.f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, eky0 eky0Var) {
        Typeface typeface;
        if (c(context) && this.n && (typeface = this.p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.p);
        b(context, new cky0(this, context, textPaint, eky0Var));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface E = jx81.E(context.getResources().getConfiguration(), typeface);
        if (E != null) {
            typeface = E;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
