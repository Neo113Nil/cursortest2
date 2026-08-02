package androidx.transition;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
class ViewUtils {
    public static final Property a = new Property<View, Float>(Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
        @Override // android.util.Property
        public Float get(View view) {
            Property property = ViewUtils.a;
            return Float.valueOf(view.getTransitionAlpha());
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            float floatValue = f.floatValue();
            Property property = ViewUtils.a;
            view.setTransitionAlpha(floatValue);
        }
    };
    public static final Property b = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
        @Override // android.util.Property
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    };
}
