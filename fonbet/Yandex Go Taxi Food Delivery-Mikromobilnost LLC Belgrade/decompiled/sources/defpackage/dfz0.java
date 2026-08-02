package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class dfz0 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public dfz0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static dfz0 e(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new dfz0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static dfz0 f(Context context, AttributeSet attributeSet, int[] iArr) {
        return new dfz0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList m;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m = qke.m(resourceId, this.a)) == null) ? typedArray.getColorStateList(i) : m;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : vng.t(resourceId, this.a);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable e;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        or2 a = or2.a();
        Context context = this.a;
        synchronized (a) {
            e = a.a.e(context, resourceId, true);
        }
        return e;
    }

    public final Typeface d(int i, int i2, zr2 zr2Var) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal threadLocal = wuj0.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return wuj0.c(context, resourceId, typedValue, i2, zr2Var, true, false);
    }

    public final void g() {
        this.b.recycle();
    }
}
