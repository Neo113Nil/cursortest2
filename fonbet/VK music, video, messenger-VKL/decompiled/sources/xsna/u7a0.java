package xsna;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vkontakte.android.R;

/* compiled from: PhotoFlowGalleryToolbarConfigurator.kt */
/* loaded from: classes15.dex */
public final class u7a0 implements l5t {
    @Override // xsna.l5t
    public final LinearLayout b(Context context, p3h p3hVar, nwk nwkVar, cws cwsVar) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        a.setPadding(cn70.b(14), 0, cn70.b(16), 0);
        abg0 abg0Var = dhr0.t;
        a.setBackgroundColor(abg0Var.c(R.attr.vk_ui_background_content));
        a.setMinimumHeight((int) a.getResources().getDimension(R.dimen.picker_toolbar_height));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(abg0Var.b(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed));
        imageView.setBackgroundResource(R.drawable.highlight_icon);
        bwt0.i0(imageView, new bk30(p3hVar, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        a.addView(imageView, layoutParams);
        return a;
    }

    @Override // xsna.l5t
    public final void h(CustomSpinner customSpinner) {
        customSpinner.setPopupBackgroundResource(R.drawable.gallery_toolbar_spinner_popup_background);
        customSpinner.setBackgroundDrawable(null);
        customSpinner.setDropDownVerticalOffset(cn70.b(56));
        customSpinner.setDropDownHorizontalOffset(cn70.b(48));
    }

    @Override // xsna.l5t
    public final void c(LinearLayout linearLayout) {
    }
}
