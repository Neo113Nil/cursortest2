package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes13.dex */
public final class tz8 {

    @NonNull
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final com.google.android.material.shape.a f;

    public tz8(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, com.google.android.material.shape.a aVar, @NonNull Rect rect) {
        obr.d(rect.left);
        obr.d(rect.top);
        obr.d(rect.right);
        obr.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = aVar;
    }

    @NonNull
    public static tz8 a(int i, @NonNull Context context) {
        obr.a("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = qm10.a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = qm10.a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = qm10.a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        com.google.android.material.shape.a a4 = com.google.android.material.shape.a.a(obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), context).a();
        obtainStyledAttributes.recycle();
        return new tz8(a, a2, a3, dimensionPixelSize, a4, rect);
    }

    public final void b(@NonNull TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        com.google.android.material.shape.a aVar = this.f;
        materialShapeDrawable.setShapeAppearanceModel(aVar);
        materialShapeDrawable2.setShapeAppearanceModel(aVar);
        materialShapeDrawable.setFillColor(this.c);
        materialShapeDrawable.setStroke(this.e, this.d);
        ColorStateList colorStateList = this.b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        textView.setBackground(insetDrawable);
    }
}
