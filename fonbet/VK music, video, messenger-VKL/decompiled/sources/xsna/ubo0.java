package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import xsna.dbg0;

/* compiled from: TextAppearance.java */
/* loaded from: classes13.dex */
public final class ubo0 {

    @Nullable
    public final ColorStateList a;

    @Nullable
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;

    @Nullable
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    /* compiled from: TextAppearance.java */
    public class a extends dbg0.c {
        public final /* synthetic */ de a;

        public a(de deVar) {
            this.a = deVar;
        }

        @Override // xsna.dbg0.c
        public final void b(int i) {
            ubo0.this.m = true;
            this.a.m0(i);
        }

        @Override // xsna.dbg0.c
        public final void c(@NonNull Typeface typeface) {
            ubo0 ubo0Var = ubo0.this;
            ubo0Var.n = Typeface.create(typeface, ubo0Var.c);
            ubo0Var.m = true;
            this.a.n0(ubo0Var.n, false);
        }
    }

    public ubo0(@NonNull Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        this.k = obtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.j = qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
        qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
        qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int i2 = R$styleable.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : R$styleable.TextAppearance_android_fontFamily;
        this.l = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.a = qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
        this.e = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
        this.h = obtainStyledAttributes2.hasValue(R$styleable.MaterialTextAppearance_android_letterSpacing);
        this.i = obtainStyledAttributes2.getFloat(R$styleable.MaterialTextAppearance_android_letterSpacing, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    @NonNull
    public final Typeface b(@NonNull Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = dbg0.a(this.l, context);
                this.n = a2;
                if (a2 != null) {
                    this.n = Typeface.create(a2, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(@NonNull Context context, @NonNull de deVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            deVar.n0(this.n, true);
            return;
        }
        try {
            a aVar = new a(deVar);
            ThreadLocal<TypedValue> threadLocal = dbg0.a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                dbg0.b(context, i, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            deVar.m0(1);
        } catch (Exception unused2) {
            this.m = true;
            deVar.m0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = dbg0.a;
            if (!context.isRestricted()) {
                typeface = dbg0.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull de deVar) {
        f(context, textPaint, deVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull de deVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new vbo0(this, context, textPaint, deVar));
    }

    public final void g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface a2 = tup0.a(context.getResources().getConfiguration(), typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
