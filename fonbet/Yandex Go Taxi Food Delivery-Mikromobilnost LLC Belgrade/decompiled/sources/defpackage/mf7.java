package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;

/* loaded from: classes11.dex */
public final class mf7 {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final b f;

    public mf7(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, b bVar, Rect rect) {
        d6z.r(rect.left);
        d6z.r(rect.top);
        d6z.r(rect.right);
        d6z.r(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = bVar;
    }

    public static mf7 a(int i, Context context) {
        d6z.m("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z2i0.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(z2i0.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(z2i0.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(z2i0.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(z2i0.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList o = jx81.o(context, obtainStyledAttributes, z2i0.MaterialCalendarItem_itemFillColor);
        ColorStateList o2 = jx81.o(context, obtainStyledAttributes, z2i0.MaterialCalendarItem_itemTextColor);
        ColorStateList o3 = jx81.o(context, obtainStyledAttributes, z2i0.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(z2i0.MaterialCalendarItem_itemStrokeWidth, 0);
        b a = b.g(context, obtainStyledAttributes.getResourceId(z2i0.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(z2i0.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        obtainStyledAttributes.recycle();
        return new mf7(o, o2, o3, dimensionPixelSize, a, rect);
    }

    public final void b(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        b bVar = this.f;
        materialShapeDrawable.setShapeAppearanceModel(bVar);
        materialShapeDrawable2.setShapeAppearanceModel(bVar);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.e, this.d);
        ColorStateList colorStateList3 = this.b;
        if (colorStateList2 == null) {
            colorStateList2 = colorStateList3;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
