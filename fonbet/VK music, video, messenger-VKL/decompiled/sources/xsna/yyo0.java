package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import xsna.p33;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public final class yyo0 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public yyo0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static yyo0 e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new yyo0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList b;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = anj.b(resourceId, this.a)) == null) ? typedArray.getColorStateList(i) : b;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : m33.a(resourceId, this.a);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable d;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        d33 a = d33.a();
        Context context = this.a;
        synchronized (a) {
            d = a.a.d(resourceId, context, true);
        }
        return d;
    }

    @Nullable
    public final Typeface d(int i, int i2, @Nullable p33.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return dbg0.b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    public final void f() {
        this.b.recycle();
    }
}
