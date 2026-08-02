package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import com.vk.attachpicker.widget.CustomSpinner;

/* compiled from: GalleryToolbarConfigurator.kt */
/* loaded from: classes15.dex */
public interface l5t {
    LinearLayout b(Context context, p3h p3hVar, nwk nwkVar, cws cwsVar);

    default CustomSpinner d(Context context, LinearLayout linearLayout) {
        CustomSpinner customSpinner = new CustomSpinner(context);
        h(customSpinner);
        customSpinner.setVisibility(4);
        linearLayout.addView(customSpinner, new LinearLayout.LayoutParams(-2, -1));
        return customSpinner;
    }

    void h(CustomSpinner customSpinner);

    default void c(LinearLayout linearLayout) {
    }
}
