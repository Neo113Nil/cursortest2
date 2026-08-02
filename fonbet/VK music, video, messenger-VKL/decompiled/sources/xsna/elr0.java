package xsna;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import xsna.rq90;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class elr0 extends dlr0 {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public g c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static class a extends e {
        public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                TypedArray j = ytp0.j(resources, theme, attributeSet, bc2.d);
                String string = j.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = j.getString(1);
                if (string2 != null) {
                    this.a = rq90.c(string2);
                }
                this.c = ytp0.i(xmlPullParser, "fillType") ? j.getInt(2, 0) : 0;
                j.recycle();
            }
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static class b extends e {
        public h8i d;
        public h8i f;
        public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float g = 1.0f;
        public float h = 1.0f;
        public float i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float j = 1.0f;
        public float k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public Paint.Cap l = Paint.Cap.BUTT;
        public Paint.Join m = Paint.Join.MITER;
        public float n = 4.0f;

        @Override // xsna.elr0.d
        public final boolean a() {
            return this.f.b() || this.d.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // xsna.elr0.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(int[] iArr) {
            boolean z;
            h8i h8iVar;
            h8i h8iVar2 = this.f;
            boolean z2 = true;
            if (h8iVar2.b()) {
                ColorStateList colorStateList = h8iVar2.b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != h8iVar2.c) {
                    h8iVar2.c = colorForState;
                    z = true;
                    h8iVar = this.d;
                    if (h8iVar.b()) {
                        ColorStateList colorStateList2 = h8iVar.b;
                        int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                        if (colorForState2 != h8iVar.c) {
                            h8iVar.c = colorForState2;
                            return z | z2;
                        }
                    }
                    z2 = false;
                    return z | z2;
                }
            }
            z = false;
            h8iVar = this.d;
            if (h8iVar.b()) {
            }
            z2 = false;
            return z | z2;
        }

        public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray j = ytp0.j(resources, theme, attributeSet, bc2.c);
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string = j.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = j.getString(2);
                if (string2 != null) {
                    this.a = rq90.c(string2);
                }
                this.f = ytp0.d(j, xmlPullParser, theme, "fillColor", 1);
                float f = this.h;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                    f = j.getFloat(12, f);
                }
                this.h = f;
                int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? j.getInt(8, -1) : -1;
                Paint.Cap cap = this.l;
                if (i == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i == 2) {
                    cap = Paint.Cap.SQUARE;
                }
                this.l = cap;
                int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? j.getInt(9, -1) : -1;
                Paint.Join join = this.m;
                if (i2 == 0) {
                    join = Paint.Join.MITER;
                } else if (i2 == 1) {
                    join = Paint.Join.ROUND;
                } else if (i2 == 2) {
                    join = Paint.Join.BEVEL;
                }
                this.m = join;
                float f2 = this.n;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                    f2 = j.getFloat(10, f2);
                }
                this.n = f2;
                this.d = ytp0.d(j, xmlPullParser, theme, "strokeColor", 3);
                float f3 = this.g;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                    f3 = j.getFloat(11, f3);
                }
                this.g = f3;
                float f4 = this.e;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                    f4 = j.getFloat(4, f4);
                }
                this.e = f4;
                float f5 = this.j;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                    f5 = j.getFloat(6, f5);
                }
                this.j = f5;
                float f6 = this.k;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                    f6 = j.getFloat(7, f6);
                }
                this.k = f6;
                float f7 = this.i;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                    f7 = j.getFloat(5, f7);
                }
                this.i = f7;
                int i3 = this.c;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                    i3 = j.getInt(13, i3);
                }
                this.c = i3;
            }
            j.recycle();
        }

        public float getFillAlpha() {
            return this.h;
        }

        public int getFillColor() {
            return this.f.c;
        }

        public float getStrokeAlpha() {
            return this.g;
        }

        public int getStrokeColor() {
            return this.d.c;
        }

        public float getStrokeWidth() {
            return this.e;
        }

        public float getTrimPathEnd() {
            return this.j;
        }

        public float getTrimPathOffset() {
            return this.k;
        }

        public float getTrimPathStart() {
            return this.i;
        }

        public void setFillAlpha(float f) {
            this.h = f;
        }

        public void setFillColor(int i) {
            this.f.c = i;
        }

        public void setStrokeAlpha(float f) {
            this.g = f;
        }

        public void setStrokeColor(int i) {
            this.d.c = i;
        }

        public void setStrokeWidth(float f) {
            this.e = f;
        }

        public void setTrimPathEnd(float f) {
            this.j = f;
        }

        public void setTrimPathOffset(float f) {
            this.k = f;
        }

        public void setTrimPathStart(float f) {
            this.i = f;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static class g extends Drawable.ConstantState {
        public int a;
        public f b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public g(g gVar) {
            this.c = null;
            this.d = elr0.k;
            if (gVar != null) {
                this.a = gVar.a;
                f fVar = new f(gVar.b);
                this.b = fVar;
                if (gVar.b.e != null) {
                    fVar.e = new Paint(gVar.b.e);
                }
                if (gVar.b.d != null) {
                    this.b.d = new Paint(gVar.b.d);
                }
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        public final boolean a() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public final void b(int i, int i2) {
            Bitmap bitmap = this.f;
            if (bitmap != null && i == bitmap.getWidth() && i2 == this.f.getHeight()) {
                return;
            }
            this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.k = true;
        }

        public final void c(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            Paint paint;
            if (this.b.getRootAlpha() >= 255 && colorFilter == null) {
                paint = null;
            } else {
                if (this.l == null) {
                    Paint paint2 = new Paint();
                    this.l = paint2;
                    paint2.setFilterBitmap(true);
                }
                this.l.setAlpha(this.b.getRootAlpha());
                this.l.setColorFilter(colorFilter);
                paint = this.l;
            }
            canvas.drawBitmap(this.f, (Rect) null, rect, paint);
        }

        public final boolean d() {
            f fVar = this.b;
            if (fVar.n == null) {
                fVar.n = Boolean.valueOf(fVar.g.a());
            }
            return fVar.n.booleanValue();
        }

        public final boolean e(int[] iArr) {
            boolean b = this.b.g.b(iArr);
            this.k |= b;
            return b;
        }

        public final void f() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public final void g(int i, int i2) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            f fVar = this.b;
            fVar.a(fVar.g, f.p, canvas, i, i2);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new elr0(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new elr0(this);
        }

        public g() {
            this.c = null;
            this.d = elr0.k;
            this.b = new f();
        }
    }

    public elr0() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new g();
    }

    @Nullable
    public static elr0 a(int i, @Nullable Resources.Theme theme, @NonNull Resources resources) {
        elr0 elr0Var = new elr0();
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        elr0Var.b = resources.getDrawable(i, theme);
        new h(elr0Var.b.getConstantState());
        return elr0Var;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || abs4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.c.b(min, min2);
        if (!this.g) {
            this.c.g(min, min2);
        } else if (!this.c.a()) {
            this.c.g(min, min2);
            this.c.f();
        }
        this.c.c(canvas, colorFilter, rect);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getAlpha() : this.c.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getColorFilter() : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.b != null) {
            return new h(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.c.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.c.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.b;
        return drawable != null ? drawable.isAutoMirrored() : this.c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        g gVar = this.c;
        if (gVar == null) {
            return false;
        }
        if (gVar.d()) {
            return true;
        }
        ColorStateList colorStateList = this.c.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new g(this.c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.c;
        ColorStateList colorStateList = gVar.c;
        if (colorStateList == null || (mode = gVar.d) == null) {
            z = false;
        } else {
            this.d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!gVar.d() || !gVar.e(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.c.b.getRootAlpha() != i) {
            this.c.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        g gVar = this.c;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.d = b(colorStateList, gVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        g gVar = this.c;
        if (gVar.d != mode) {
            gVar.d = mode;
            this.d = b(gVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static class h extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public h(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            elr0 elr0Var = new elr0();
            elr0Var.b = (VectorDrawable) this.a.newDrawable();
            return elr0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            elr0 elr0Var = new elr0();
            elr0Var.b = (VectorDrawable) this.a.newDrawable(resources);
            return elr0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            elr0 elr0Var = new elr0();
            elr0Var.b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return elr0Var;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static abstract class e extends d {
        public rq90.a[] a;
        public String b;
        public int c;

        public e() {
            this.a = null;
            this.c = 0;
        }

        public rq90.a[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(rq90.a[] aVarArr) {
            if (!rq90.a(this.a, aVarArr)) {
                this.a = rq90.e(aVarArr);
                return;
            }
            rq90.a[] aVarArr2 = this.a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].a = aVarArr[i].a;
                int i2 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].b;
                    if (i2 < fArr.length) {
                        aVarArr2[i].b[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.a = null;
            this.c = 0;
            this.b = eVar.b;
            this.a = rq90.e(eVar.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.c;
        gVar.b = new f();
        TypedArray j = ytp0.j(resources, theme, attributeSet, bc2.a);
        g gVar2 = this.c;
        f fVar = gVar2.b;
        int f2 = ytp0.f(j, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (f2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (f2 != 5) {
            if (f2 != 9) {
                switch (f2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.d = mode;
        ColorStateList c2 = ytp0.c(j, xmlPullParser, theme);
        if (c2 != null) {
            gVar2.c = c2;
        }
        gVar2.e = ytp0.b(j, xmlPullParser, "autoMirrored", 5, gVar2.e);
        fVar.j = ytp0.e(j, xmlPullParser, "viewportWidth", 7, fVar.j);
        float e2 = ytp0.e(j, xmlPullParser, "viewportHeight", 8, fVar.k);
        fVar.k = e2;
        if (fVar.j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (e2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fVar.h = j.getDimension(3, fVar.h);
            int i = 2;
            float dimension = j.getDimension(2, fVar.i);
            fVar.i = dimension;
            if (fVar.h <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fVar.setAlpha(ytp0.e(j, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = j.getString(0);
                if (string != null) {
                    fVar.m = string;
                    fVar.o.put(string, fVar);
                }
                j.recycle();
                gVar.a = getChangingConfigurations();
                int i2 = 1;
                gVar.k = true;
                g gVar3 = this.c;
                f fVar2 = gVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                c cVar = fVar2.g;
                zk3<String, Object> zk3Var = fVar2.o;
                arrayDeque.push(cVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z = true;
                while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == i) {
                        String name = xmlPullParser.getName();
                        c cVar2 = (c) arrayDeque.peek();
                        if ("path".equals(name)) {
                            b bVar = new b();
                            bVar.c(resources, xmlPullParser, attributeSet, theme);
                            cVar2.b.add(bVar);
                            if (bVar.getPathName() != null) {
                                zk3Var.put(bVar.getPathName(), bVar);
                            }
                            gVar3.a = gVar3.a;
                            z = false;
                        } else if ("clip-path".equals(name)) {
                            a aVar = new a();
                            aVar.c(resources, xmlPullParser, attributeSet, theme);
                            cVar2.b.add(aVar);
                            if (aVar.getPathName() != null) {
                                zk3Var.put(aVar.getPathName(), aVar);
                            }
                            gVar3.a = gVar3.a;
                        } else if ("group".equals(name)) {
                            c cVar3 = new c();
                            cVar3.c(resources, xmlPullParser, attributeSet, theme);
                            cVar2.b.add(cVar3);
                            arrayDeque.push(cVar3);
                            if (cVar3.getGroupName() != null) {
                                zk3Var.put(cVar3.getGroupName(), cVar3);
                            }
                            gVar3.a = gVar3.a;
                        }
                    } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser.next();
                    i2 = 1;
                    i = 2;
                }
                if (!z) {
                    this.d = b(gVar.c, gVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(j.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public elr0(@NonNull g gVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = gVar;
        this.d = b(gVar.c, gVar.d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static class c extends d {
        public final Matrix a;
        public final ArrayList<d> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public String k;

        public c() {
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.j = new Matrix();
            this.k = null;
        }

        @Override // xsna.elr0.d
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList<d> arrayList = this.b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // xsna.elr0.d
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean z = false;
            while (true) {
                ArrayList<d> arrayList = this.b;
                if (i >= arrayList.size()) {
                    return z;
                }
                z |= arrayList.get(i).b(iArr);
                i++;
            }
        }

        public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray j = ytp0.j(resources, theme, attributeSet, bc2.b);
            float f = this.c;
            if (ytp0.i(xmlPullParser, "rotation")) {
                f = j.getFloat(5, f);
            }
            this.c = f;
            this.d = j.getFloat(1, this.d);
            this.e = j.getFloat(2, this.e);
            float f2 = this.f;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                f2 = j.getFloat(3, f2);
            }
            this.f = f2;
            float f3 = this.g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                f3 = j.getFloat(4, f3);
            }
            this.g = f3;
            float f4 = this.h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                f4 = j.getFloat(6, f4);
            }
            this.h = f4;
            float f5 = this.i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                f5 = j.getFloat(7, f5);
            }
            this.i = f5;
            String string = j.getString(0);
            if (string != null) {
                this.k = string;
            }
            d();
            j.recycle();
        }

        public final void d() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.e);
            matrix.postScale(this.f, this.g);
            matrix.postRotate(this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            matrix.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.k;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(c cVar, zk3<String, Object> zk3Var) {
            a aVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.k = null;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            String str = cVar.k;
            this.k = str;
            if (str != null) {
                zk3Var.put(str, this);
            }
            matrix.set(cVar.j);
            ArrayList<d> arrayList = cVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.b.add(new c((c) dVar, zk3Var));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        bVar2.g = 1.0f;
                        bVar2.h = 1.0f;
                        bVar2.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        bVar2.j = 1.0f;
                        bVar2.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        bVar2.l = Paint.Cap.BUTT;
                        bVar2.m = Paint.Join.MITER;
                        bVar2.n = 4.0f;
                        bVar2.d = bVar.d;
                        bVar2.e = bVar.e;
                        bVar2.g = bVar.g;
                        bVar2.f = bVar.f;
                        bVar2.c = bVar.c;
                        bVar2.h = bVar.h;
                        bVar2.i = bVar.i;
                        bVar2.j = bVar.j;
                        bVar2.k = bVar.k;
                        bVar2.l = bVar.l;
                        bVar2.m = bVar.m;
                        bVar2.n = bVar.n;
                        aVar = bVar2;
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(aVar);
                    String str2 = aVar.b;
                    if (str2 != null) {
                        zk3Var.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes12.dex */
    public static class f {
        public static final Matrix p = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final zk3<String, Object> o;

        public f() {
            this.c = new Matrix();
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = new zk3<>();
            this.g = new c();
            this.a = new Path();
            this.b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            int i4;
            float f2;
            Matrix matrix2 = cVar.a;
            ArrayList<d> arrayList = cVar.b;
            matrix2.set(matrix);
            Matrix matrix3 = cVar.a;
            matrix3.preConcat(cVar.j);
            canvas.save();
            char c = 0;
            int i5 = 0;
            while (i5 < arrayList.size()) {
                d dVar = arrayList.get(i5);
                if (dVar instanceof c) {
                    a((c) dVar, matrix3, canvas, i, i2);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f3 = i / this.j;
                    float f4 = i2 / this.k;
                    float min = Math.min(f3, f4);
                    Matrix matrix4 = this.c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f3, f4);
                    float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                    matrix3.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.abs(f5) / max : 0.0f;
                    if (abs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        eVar.getClass();
                        Path path = this.a;
                        path.reset();
                        rq90.a[] aVarArr = eVar.a;
                        if (aVarArr != null) {
                            rq90.a.b(aVarArr, path);
                        }
                        Path path2 = this.b;
                        path2.reset();
                        if (eVar instanceof a) {
                            path2.setFillType(eVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            b bVar = (b) eVar;
                            float f6 = bVar.i;
                            if (f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || bVar.j != 1.0f) {
                                float f7 = bVar.k;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (bVar.j + f7) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(path, z);
                                float length = this.f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f.getSegment(f10, length, path, true);
                                    PathMeasure pathMeasure = this.f;
                                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    pathMeasure.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, path, true);
                                } else {
                                    f = 0.0f;
                                    this.f.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            h8i h8iVar = bVar.f;
                            if (h8iVar.a == null && h8iVar.c == 0) {
                                f2 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.e;
                                Shader shader = h8iVar.a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.h * 255.0f));
                                    f2 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = h8iVar.c;
                                    float f12 = bVar.h;
                                    PorterDuff.Mode mode = elr0.k;
                                    f2 = 255.0f;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(bVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            h8i h8iVar2 = bVar.d;
                            if (h8iVar2.a != null || h8iVar2.c != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = bVar.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.n);
                                Shader shader2 = h8iVar2.a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.g * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = h8iVar2.c;
                                    float f13 = bVar.g;
                                    PorterDuff.Mode mode2 = elr0.k;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.e * min * abs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i5 = i3 + 1;
                    c = 0;
                }
                i3 = i5;
                i5 = i3 + 1;
                c = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.l = i;
        }

        public f(f fVar) {
            this.c = new Matrix();
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.l = 255;
            this.m = null;
            this.n = null;
            zk3<String, Object> zk3Var = new zk3<>();
            this.o = zk3Var;
            this.g = new c(fVar.g, zk3Var);
            this.a = new Path(fVar.a);
            this.b = new Path(fVar.b);
            this.h = fVar.h;
            this.i = fVar.i;
            this.j = fVar.j;
            this.k = fVar.k;
            this.l = fVar.l;
            this.m = fVar.m;
            String str = fVar.m;
            if (str != null) {
                zk3Var.put(str, this);
            }
            this.n = fVar.n;
        }
    }
}
