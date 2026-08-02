package xsna;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.formitem.VkFormField;
import java.util.List;

/* compiled from: VkHorizontalFormFieldGroup.kt */
/* loaded from: classes17.dex */
public final class tyu0 extends LinearLayout {
    private final int getHorizontalPadding() {
        getContext();
        return 0;
    }

    private final int getItemSpacing() {
        float f = vev0.a;
        return (int) vev0.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPadding(getHorizontalPadding(), 0, getHorizontalPadding(), 0);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        List A = rli0.A(rli0.j(new jxt0(this), syu0.b));
        int size = A.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                VkFormField vkFormField = (VkFormField) A.get(i);
                ViewGroup.LayoutParams layoutParams = ((VkFormField) A.get(i)).getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(getItemSpacing());
                } else {
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.setMarginStart(getItemSpacing());
                }
                vkFormField.setLayoutParams(marginLayoutParams);
            }
        }
        setPadding(getHorizontalPadding(), 0, getHorizontalPadding(), 0);
    }
}
