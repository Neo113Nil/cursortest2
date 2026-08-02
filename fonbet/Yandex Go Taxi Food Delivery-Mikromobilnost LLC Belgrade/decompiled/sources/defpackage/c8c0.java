package defpackage;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.c8c0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public class c8c0 {
    public final boolean a;

    public c8c0(boolean z) {
        this.a = z;
    }

    public static void b(View view, View view2) {
        int dimensionPixelSize;
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (rect.bottom <= 0) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = (view.getHeight() + iArr[1]) - rect.bottom;
        if (height < 0) {
            height = 0;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || marginLayoutParams.bottomMargin == (dimensionPixelSize = view.getResources().getDimensionPixelSize(bug0.places_flex_container_error_button_bottom_margin) + height)) {
            return;
        }
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        view2.setLayoutParams(marginLayoutParams);
    }

    public View a(ViewGroup viewGroup, z7c0 z7c0Var, z7c0 z7c0Var2) {
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(suh0.places_flex_container_default_error_view, viewGroup, false);
        ((ButtonComponent) inflate.findViewById(m6h0.placesFlexContainerErrorActionButton)).setDebounceClickListener(new b8c0(z7c0Var, 0));
        View findViewById = inflate.findViewById(m6h0.placesFlexContainerErrorBackButton);
        findViewById.setVisibility(this.a ? 0 : 8);
        c.z(z7c0Var2, findViewById);
        final View findViewById2 = inflate.findViewById(m6h0.placesFlexContainerErrorActionButton);
        final phd phdVar = new phd(this, inflate, findViewById2);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(phdVar);
        inflate.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.places.flex.container.api.PlacesFlexContainerErrorViewProvider$bindReloadButtonBottomOffset$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                c8c0 c8c0Var = c8c0.this;
                View view = inflate;
                View view2 = findViewById2;
                c8c0Var.getClass();
                c8c0.b(view, view2);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                if (inflate.getViewTreeObserver().isAlive()) {
                    inflate.getViewTreeObserver().removeOnGlobalLayoutListener(phdVar);
                }
                inflate.removeOnAttachStateChangeListener(this);
            }
        });
        inflate.post(new yo90(this, inflate, findViewById2));
        return inflate;
    }

    public c8c0() {
        this(false);
    }
}
