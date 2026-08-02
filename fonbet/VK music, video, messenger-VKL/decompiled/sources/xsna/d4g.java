package xsna;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import xsna.jq9;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes13.dex */
public final class d4g {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public jq9 D;
    public jq9 E;

    @Nullable
    public CharSequence G;

    @Nullable
    public CharSequence H;
    public boolean I;

    @Nullable
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;

    @NonNull
    public final TextPaint T;

    @NonNull
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;
    public final ViewGroup a;
    public ColorStateList a0;
    public float b;
    public float b0;
    public boolean c;
    public float c0;
    public float d;
    public float d0;
    public float e;
    public ColorStateList e0;
    public int f;
    public float f0;

    @NonNull
    public final Rect g;
    public float g0;

    @NonNull
    public final Rect h;
    public float h0;

    @NonNull
    public final RectF i;
    public StaticLayout i0;
    public float j0;
    public float k0;
    public float l0;
    public CharSequence m0;
    public ColorStateList n;
    public ColorStateList o;
    public int p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    public int j = 16;
    public int k = 16;
    public float l = 15.0f;
    public float m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;
    public int n0 = 1;
    public float o0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float p0 = 1.0f;
    public int q0 = 1;

    /* compiled from: CollapsingTextHelper.java */
    public class a implements jq9.a {
        public a() {
        }

        @Override // xsna.jq9.a
        public final void a(Typeface typeface) {
            d4g d4gVar = d4g.this;
            if (d4gVar.m(typeface)) {
                d4gVar.i(false);
            }
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    public class b implements jq9.a {
        public b() {
        }

        @Override // xsna.jq9.a
        public final void a(Typeface typeface) {
            d4g d4gVar = d4g.this;
            if (d4gVar.o(typeface)) {
                d4gVar.i(false);
            }
        }
    }

    public d4g(ViewGroup viewGroup) {
        this.a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        float f = this.d;
        this.e = u11.b(1.0f, f, 0.5f, f);
        h(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float g(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return rq2.a(f, f2, f3);
    }

    public final boolean b(@NonNull CharSequence charSequence) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z = this.a.getLayoutDirection() == 1;
        if (this.J) {
            return (z ? vdo0.d : vdo0.c).b(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.G == null) {
            return;
        }
        float width = this.h.width();
        float width2 = this.g.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.m;
            f3 = this.f0;
            this.L = 1.0f;
            typeface = this.w;
        } else {
            float f4 = this.l;
            float f5 = this.g0;
            Typeface typeface2 = this.z;
            if (Math.abs(f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 1.0E-5f) {
                this.L = 1.0f;
            } else {
                this.L = g(this.l, this.m, f, this.W) / this.l;
            }
            float f6 = this.m / this.l;
            width = (z || this.c || width2 * f6 <= width) ? width2 : Math.min(width / f6, width2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            boolean z3 = this.M != f2;
            boolean z4 = this.h0 != f3;
            boolean z5 = this.C != typeface;
            StaticLayout staticLayout = this.i0;
            boolean z6 = z3 || z4 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.S;
            this.M = f2;
            this.h0 = f3;
            this.C = typeface;
            this.S = false;
            textPaint.setLinearText(this.L != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.H == null || z2) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.C);
            textPaint.setLetterSpacing(this.h0);
            boolean b2 = b(this.G);
            this.I = b2;
            int i = this.n0;
            if (i <= 1 || (b2 && !this.c)) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.j, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            yxk0 yxk0Var = new yxk0((int) width, textPaint, this.G);
            yxk0Var.l = this.F;
            yxk0Var.k = b2;
            yxk0Var.e = alignment;
            yxk0Var.j = false;
            yxk0Var.f = i;
            float f7 = this.o0;
            float f8 = this.p0;
            yxk0Var.g = f7;
            yxk0Var.h = f8;
            yxk0Var.i = this.q0;
            StaticLayout a2 = yxk0Var.a();
            a2.getClass();
            this.i0 = a2;
            this.H = a2.getText();
        }
    }

    public final void d(@NonNull Canvas canvas) {
        int save = canvas.save();
        if (this.H != null) {
            RectF rectF = this.i;
            if (rectF.width() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectF.height() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            float f = this.M;
            TextPaint textPaint = this.T;
            textPaint.setTextSize(f);
            float f2 = this.u;
            float f3 = this.v;
            float f4 = this.L;
            if (f4 != 1.0f && !this.c) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (this.n0 <= 1 || ((this.I && !this.c) || (this.c && this.b <= this.e))) {
                canvas.translate(f2, f3);
                this.i0.draw(canvas);
            } else {
                float lineStart = this.u - this.i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f3);
                if (!this.c) {
                    textPaint.setAlpha((int) (this.l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, dm10.a(this.Q, textPaint.getAlpha()));
                    }
                    this.i0.draw(canvas);
                }
                if (!this.c) {
                    textPaint.setAlpha((int) (this.k0 * alpha));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, dm10.a(this.Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.i0.getLineBaseline(0);
                CharSequence charSequence = this.m0;
                float f5 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.c) {
                    String trim = this.m0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = qoy.c(1, 0, trim);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.i0.getLineEnd(0), str.length()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, (Paint) textPaint);
                }
                canvas = canvas;
            }
            canvas.restoreToCount(save);
        }
    }

    public final float e() {
        float f = this.m;
        TextPaint textPaint = this.U;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.w);
        textPaint.setLetterSpacing(this.f0);
        return -textPaint.ascent();
    }

    public final int f(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void h(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.y;
            if (typeface != null) {
                this.x = tup0.a(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = tup0.a(configuration, typeface2);
            }
            Typeface typeface3 = this.x;
            if (typeface3 == null) {
                typeface3 = this.y;
            }
            this.w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z) {
        float measureText;
        float f;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z) {
            return;
        }
        c(1.0f, z);
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.T;
        if (charSequence != null && (staticLayout = this.i0) != null) {
            this.m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.m0;
        if (charSequence2 != null) {
            this.j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.j0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.k, this.I ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.h;
        if (i == 48) {
            this.r = rect.top;
        } else if (i != 80) {
            this.r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.r = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.t = rect.centerX() - (this.j0 / 2.0f);
        } else if (i2 != 5) {
            this.t = rect.left;
        } else {
            this.t = rect.right - this.j0;
        }
        c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z);
        float height = this.i0 != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.i0;
        if (staticLayout2 == null || this.n0 <= 1) {
            CharSequence charSequence3 = this.H;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.i0;
        this.p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.j, this.I ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.g;
        if (i3 == 48) {
            this.q = rect2.top;
        } else if (i3 != 80) {
            this.q = rect2.centerY() - (height / 2.0f);
        } else {
            this.q = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.s = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.s = rect2.left;
        } else {
            this.s = rect2.right - measureText;
        }
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            bitmap.recycle();
            this.K = null;
        }
        q(this.b);
        float f2 = this.b;
        boolean z2 = this.c;
        RectF rectF = this.i;
        if (z2) {
            if (f2 < this.e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f2, this.V);
            rectF.top = g(this.q, this.r, f2, this.V);
            rectF.right = g(rect2.right, rect.right, f2, this.V);
            rectF.bottom = g(rect2.bottom, rect.bottom, f2, this.V);
        }
        if (!this.c) {
            this.u = g(this.s, this.t, f2, this.V);
            this.v = g(this.q, this.r, f2, this.V);
            q(f2);
            f = f2;
        } else if (f2 < this.e) {
            this.u = this.s;
            this.v = this.q;
            q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f = 0.0f;
        } else {
            this.u = this.t;
            this.v = this.r - Math.max(0, this.f);
            q(1.0f);
            f = 1.0f;
        }
        ilq ilqVar = rq2.b;
        this.k0 = 1.0f - g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f - f2, ilqVar);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        viewGroup.postInvalidateOnAnimation();
        this.l0 = g(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, ilqVar);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.o;
        ColorStateList colorStateList2 = this.n;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, f(colorStateList2), f(this.o)));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        int i5 = Build.VERSION.SDK_INT;
        float f3 = this.f0;
        float f4 = this.g0;
        if (f3 != f4) {
            textPaint.setLetterSpacing(g(f4, f3, f2, ilqVar));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.N = rq2.a(this.b0, this.X, f2);
        this.O = rq2.a(this.c0, this.Y, f2);
        this.P = rq2.a(this.d0, this.Z, f2);
        int a2 = a(f2, f(this.e0), f(this.a0));
        this.Q = a2;
        textPaint.setShadowLayer(this.N, this.O, this.P, a2);
        if (this.c) {
            int alpha = textPaint.getAlpha();
            float f5 = this.e;
            textPaint.setAlpha((int) ((f2 <= f5 ? rq2.b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.d, f5, f2) : rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f5, 1.0f, f2)) * alpha));
            if (i5 >= 31) {
                textPaint.setShadowLayer(this.N, this.O, this.P, dm10.a(this.Q, textPaint.getAlpha()));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final void j(@Nullable ColorStateList colorStateList) {
        if (this.o == colorStateList && this.n == colorStateList) {
            return;
        }
        this.o = colorStateList;
        this.n = colorStateList;
        i(false);
    }

    public final void k(int i) {
        ViewGroup viewGroup = this.a;
        ubo0 ubo0Var = new ubo0(viewGroup.getContext(), i);
        ColorStateList colorStateList = ubo0Var.j;
        if (colorStateList != null) {
            this.o = colorStateList;
        }
        float f = ubo0Var.k;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.m = f;
        }
        ColorStateList colorStateList2 = ubo0Var.a;
        if (colorStateList2 != null) {
            this.a0 = colorStateList2;
        }
        this.Y = ubo0Var.e;
        this.Z = ubo0Var.f;
        this.X = ubo0Var.g;
        this.f0 = ubo0Var.i;
        jq9 jq9Var = this.E;
        if (jq9Var != null) {
            jq9Var.d = true;
        }
        a aVar = new a();
        ubo0Var.a();
        this.E = new jq9(aVar, ubo0Var.n);
        ubo0Var.c(viewGroup.getContext(), this.E);
        i(false);
    }

    public final void l(int i) {
        if (this.k != i) {
            this.k = i;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        jq9 jq9Var = this.E;
        if (jq9Var != null) {
            jq9Var.d = true;
        }
        if (this.y == typeface) {
            return false;
        }
        this.y = typeface;
        Typeface a2 = tup0.a(this.a.getContext().getResources().getConfiguration(), typeface);
        this.x = a2;
        if (a2 == null) {
            a2 = this.y;
        }
        this.w = a2;
        return true;
    }

    public final void n(int i) {
        ViewGroup viewGroup = this.a;
        ubo0 ubo0Var = new ubo0(viewGroup.getContext(), i);
        ColorStateList colorStateList = ubo0Var.j;
        if (colorStateList != null) {
            this.n = colorStateList;
        }
        float f = ubo0Var.k;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.l = f;
        }
        ColorStateList colorStateList2 = ubo0Var.a;
        if (colorStateList2 != null) {
            this.e0 = colorStateList2;
        }
        this.c0 = ubo0Var.e;
        this.d0 = ubo0Var.f;
        this.b0 = ubo0Var.g;
        this.g0 = ubo0Var.i;
        jq9 jq9Var = this.D;
        if (jq9Var != null) {
            jq9Var.d = true;
        }
        b bVar = new b();
        ubo0Var.a();
        this.D = new jq9(bVar, ubo0Var.n);
        ubo0Var.c(viewGroup.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        jq9 jq9Var = this.D;
        if (jq9Var != null) {
            jq9Var.d = true;
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface a2 = tup0.a(this.a.getContext().getResources().getConfiguration(), typeface);
        this.A = a2;
        if (a2 == null) {
            a2 = this.B;
        }
        this.z = a2;
        return true;
    }

    public final void p(float f) {
        float f2;
        float a2 = xwk.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (a2 != this.b) {
            this.b = a2;
            boolean z = this.c;
            Rect rect = this.h;
            Rect rect2 = this.g;
            RectF rectF = this.i;
            if (z) {
                if (a2 < this.e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, a2, this.V);
                rectF.top = g(this.q, this.r, a2, this.V);
                rectF.right = g(rect2.right, rect.right, a2, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, a2, this.V);
            }
            if (!this.c) {
                this.u = g(this.s, this.t, a2, this.V);
                this.v = g(this.q, this.r, a2, this.V);
                q(a2);
                f2 = a2;
            } else if (a2 < this.e) {
                this.u = this.s;
                this.v = this.q;
                q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                f2 = 0.0f;
            } else {
                this.u = this.t;
                this.v = this.r - Math.max(0, this.f);
                q(1.0f);
                f2 = 1.0f;
            }
            ilq ilqVar = rq2.b;
            this.k0 = 1.0f - g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f - a2, ilqVar);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            ViewGroup viewGroup = this.a;
            viewGroup.postInvalidateOnAnimation();
            this.l0 = g(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a2, ilqVar);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.o;
            ColorStateList colorStateList2 = this.n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f2, f(colorStateList2), f(this.o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i = Build.VERSION.SDK_INT;
            float f3 = this.f0;
            float f4 = this.g0;
            if (f3 != f4) {
                textPaint.setLetterSpacing(g(f4, f3, a2, ilqVar));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.N = rq2.a(this.b0, this.X, a2);
            this.O = rq2.a(this.c0, this.Y, a2);
            this.P = rq2.a(this.d0, this.Z, a2);
            int a3 = a(a2, f(this.e0), f(this.a0));
            this.Q = a3;
            textPaint.setShadowLayer(this.N, this.O, this.P, a3);
            if (this.c) {
                int alpha = textPaint.getAlpha();
                float f5 = this.e;
                textPaint.setAlpha((int) ((a2 <= f5 ? rq2.b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.d, f5, a2) : rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f5, 1.0f, a2)) * alpha));
                if (i >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, dm10.a(this.Q, textPaint.getAlpha()));
                }
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void q(float f) {
        c(f, false);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        this.a.postInvalidateOnAnimation();
    }
}
