package xsna;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vkontakte.android.R;

/* compiled from: ClipsTemplatesEditorToolbarConfigurator.kt */
/* loaded from: classes15.dex */
public final class b9f implements l5t {
    @Override // xsna.l5t
    public final LinearLayout b(Context context, p3h p3hVar, nwk nwkVar, cws cwsVar) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        a.setPadding(cn70.b(14), 0, cn70.b(16), 0);
        a.setBackgroundColor(a.getResources().getColor(R.color.vk_gray_900));
        a.setMinimumHeight((int) a.getResources().getDimension(R.dimen.picker_toolbar_height));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(uko.d(R.drawable.vk_icon_cancel_outline_28, R.color.vk_white, imageView.getContext()));
        imageView.setBackgroundResource(R.drawable.highlight_icon);
        bwt0.i0(imageView, new r9(p3hVar, 23));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        a.addView(imageView, layoutParams);
        return a;
    }

    @Override // xsna.l5t
    public final CustomSpinner d(Context context, LinearLayout linearLayout) {
        CustomSpinner customSpinner = new CustomSpinner(context);
        h(customSpinner);
        customSpinner.setVisibility(4);
        linearLayout.addView(customSpinner, new LinearLayout.LayoutParams(-2, -1));
        return customSpinner;
    }

    @Override // xsna.l5t
    public final void h(CustomSpinner customSpinner) {
        customSpinner.setPopupBackgroundResource(R.drawable.story_picker_toolbar_spinner_popup_background);
        customSpinner.setBackgroundDrawable(null);
        bwt0.S(customSpinner, new iie(customSpinner, 1));
    }

    @Override // xsna.l5t
    public final void c(LinearLayout linearLayout) {
    }
}
