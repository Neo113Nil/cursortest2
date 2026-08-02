package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import defpackage.dyk0;
import defpackage.eja1;
import defpackage.fhr0;
import defpackage.lnf;
import defpackage.osi0;
import defpackage.s6;
import defpackage.tkn;
import defpackage.xre;
import defpackage.z2i0;
import defpackage.zre;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class b implements fhr0 {
    public static final osi0 m = new osi0(0.5f);
    public zre a = new dyk0();
    public zre b = new dyk0();
    public zre c = new dyk0();
    public zre d = new dyk0();
    public xre e = new s6(0.0f);
    public xre f = new s6(0.0f);
    public xre g = new s6(0.0f);
    public xre h = new s6(0.0f);
    public tkn i = new tkn();
    public tkn j = new tkn();
    public tkn k = new tkn();
    public tkn l = new tkn();

    public static final class a {
        public zre a = new dyk0();
        public zre b = new dyk0();
        public zre c = new dyk0();
        public zre d = new dyk0();
        public xre e = new s6(0.0f);
        public xre f = new s6(0.0f);
        public xre g = new s6(0.0f);
        public xre h = new s6(0.0f);
        public tkn i = new tkn();
        public tkn j = new tkn();
        public tkn k = new tkn();
        public tkn l = new tkn();

        public static float b(zre zreVar) {
            if (zreVar instanceof dyk0) {
                return ((dyk0) zreVar).a;
            }
            if (zreVar instanceof lnf) {
                return ((lnf) zreVar).a;
            }
            return -1.0f;
        }

        public final b a() {
            b bVar = new b();
            bVar.a = this.a;
            bVar.b = this.b;
            bVar.c = this.c;
            bVar.d = this.d;
            bVar.e = this.e;
            bVar.f = this.f;
            bVar.g = this.g;
            bVar.h = this.h;
            bVar.i = this.i;
            bVar.j = this.j;
            bVar.k = this.k;
            bVar.l = this.l;
            return bVar;
        }

        public final void c(float f) {
            j(f);
            l(f);
            h(f);
            f(f);
        }

        public final void d(float f) {
            zre m = eja1.m(0);
            i(m);
            k(m);
            g(m);
            e(m);
            c(f);
        }

        public final void e(zre zreVar) {
            this.d = zreVar;
            float b = b(zreVar);
            if (b != -1.0f) {
                f(b);
            }
        }

        public final void f(float f) {
            this.h = new s6(f);
        }

        public final void g(zre zreVar) {
            this.c = zreVar;
            float b = b(zreVar);
            if (b != -1.0f) {
                h(b);
            }
        }

        public final void h(float f) {
            this.g = new s6(f);
        }

        public final void i(zre zreVar) {
            this.a = zreVar;
            float b = b(zreVar);
            if (b != -1.0f) {
                j(b);
            }
        }

        public final void j(float f) {
            this.e = new s6(f);
        }

        public final void k(zre zreVar) {
            this.b = zreVar;
            float b = b(zreVar);
            if (b != -1.0f) {
                l(b);
            }
        }

        public final void l(float f) {
            this.f = new s6(f);
        }
    }

    public static a g(Context context, int i, int i2) {
        s6 s6Var = new s6(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(z2i0.ShapeAppearance), s6Var);
    }

    public static a h(Context context, AttributeSet attributeSet, int i, int i2, xre xreVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(z2i0.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(z2i0.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(z2i0.ShapeAppearance), xreVar);
    }

    public static a i(TypedArray typedArray, xre xreVar) {
        try {
            int i = typedArray.getInt(z2i0.ShapeAppearance_cornerFamily, 0);
            int i2 = typedArray.getInt(z2i0.ShapeAppearance_cornerFamilyTopLeft, i);
            int i3 = typedArray.getInt(z2i0.ShapeAppearance_cornerFamilyTopRight, i);
            int i4 = typedArray.getInt(z2i0.ShapeAppearance_cornerFamilyBottomRight, i);
            int i5 = typedArray.getInt(z2i0.ShapeAppearance_cornerFamilyBottomLeft, i);
            xre k = k(typedArray, z2i0.ShapeAppearance_cornerSize, xreVar);
            xre k2 = k(typedArray, z2i0.ShapeAppearance_cornerSizeTopLeft, k);
            xre k3 = k(typedArray, z2i0.ShapeAppearance_cornerSizeTopRight, k);
            xre k4 = k(typedArray, z2i0.ShapeAppearance_cornerSizeBottomRight, k);
            xre k5 = k(typedArray, z2i0.ShapeAppearance_cornerSizeBottomLeft, k);
            a aVar = new a();
            aVar.i(eja1.m(i2));
            aVar.e = k2;
            aVar.k(eja1.m(i3));
            aVar.f = k3;
            aVar.g(eja1.m(i4));
            aVar.g = k4;
            aVar.e(eja1.m(i5));
            aVar.h = k5;
            return aVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static a j(Context context, AttributeSet attributeSet, int i, int i2) {
        return h(context, attributeSet, i, i2, new s6(0.0f));
    }

    public static xre k(TypedArray typedArray, int i, xre xreVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new s6(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new osi0(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return xreVar;
    }

    @Override // defpackage.fhr0
    public final b a(float f) {
        a m2 = m();
        m2.c(f);
        return m2.a();
    }

    @Override // defpackage.fhr0
    public final b b(int[] iArr) {
        return this;
    }

    @Override // defpackage.fhr0
    public final b c() {
        return this;
    }

    @Override // defpackage.fhr0
    public final b[] d() {
        return new b[]{this};
    }

    @Override // defpackage.fhr0
    public final b e(xre xreVar) {
        a m2 = m();
        m2.e = xreVar;
        m2.f = xreVar;
        m2.g = xreVar;
        m2.h = xreVar;
        return m2.a();
    }

    @Override // defpackage.fhr0
    public final boolean f() {
        return false;
    }

    public final boolean l(RectF rectF) {
        boolean z = this.l.getClass().equals(tkn.class) && this.j.getClass().equals(tkn.class) && this.i.getClass().equals(tkn.class) && this.k.getClass().equals(tkn.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && (this.b instanceof dyk0) && (this.a instanceof dyk0) && (this.c instanceof dyk0) && (this.d instanceof dyk0);
    }

    public final a m() {
        a aVar = new a();
        aVar.a = new dyk0();
        aVar.b = new dyk0();
        aVar.c = new dyk0();
        aVar.d = new dyk0();
        aVar.e = new s6(0.0f);
        aVar.f = new s6(0.0f);
        aVar.g = new s6(0.0f);
        aVar.h = new s6(0.0f);
        aVar.i = new tkn();
        aVar.j = new tkn();
        aVar.k = new tkn();
        new tkn();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        return aVar;
    }

    public final String toString() {
        return "[" + this.e + Extension.FIX_SPACE + this.f + Extension.FIX_SPACE + this.g + Extension.FIX_SPACE + this.h + "]";
    }
}
