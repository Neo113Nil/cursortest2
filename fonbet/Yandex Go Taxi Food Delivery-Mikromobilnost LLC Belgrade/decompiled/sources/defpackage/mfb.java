package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes9.dex */
public final class mfb {
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public mfb(Context context, AttributeSet attributeSet, int i) {
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.ListCheckBoxComponent, i, 0);
        this.b = obtainStyledAttributes.getResourceId(c4i0.ListCheckBoxComponent_component_single_checked_drawable, dzg0.component_list_item_check_checked_single);
        this.c = obtainStyledAttributes.getResourceId(c4i0.ListCheckBoxComponent_component_multiple_checked_drawable, dzg0.component_list_item_check_checked_multiple);
        this.d = obtainStyledAttributes.getResourceId(c4i0.ListCheckBoxComponent_component_rectangle_checked_drawable, dzg0.component_list_item_check_checked_rectangle);
        this.e = obtainStyledAttributes.getResourceId(c4i0.ListCheckBoxComponent_component_rectangle_disabled_checked_drawable, dzg0.component_list_item_check_checked_rectangle_unavailable);
        this.f = obtainStyledAttributes.getResourceId(c4i0.ListCheckBoxComponent_component_single_unchecked_drawable, dzg0.component_list_item_check_unchecked_single);
        this.g = obtainStyledAttributes.getResourceId(c4i0.ListCheckBoxComponent_component_multiple_unchecked_drawable, dzg0.component_list_item_check_unchecked_multiple);
        this.h = obtainStyledAttributes.getResourceId(c4i0.ListCheckBoxComponent_component_rectangle_unchecked_drawable, dzg0.component_list_item_check_disabled_rectangle);
        obtainStyledAttributes.recycle();
    }

    public final Drawable a() {
        return vng.t(this.b, this.a);
    }

    public final Drawable b() {
        return vng.t(this.f, this.a);
    }
}
