package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.bottomsheets.settings.presentation.RoundedShadowView;
import com.vkontakte.android.R;

/* compiled from: SettingsItemVh.kt */
/* loaded from: classes3.dex */
public final class s2j0 extends RecyclerView.e0 {
    public final View l;
    public final n8 m;
    public final TextView n;
    public final FrameLayout o;
    public final RoundedShadowView p;
    public final RoundedShadowView q;
    public boolean r;

    public s2j0(View view, n8 n8Var) {
        super(view);
        this.l = view;
        this.m = n8Var;
        TextView textView = (TextView) view.findViewById(R.id.button_settings);
        this.n = textView;
        this.o = (FrameLayout) view.findViewById(R.id.root);
        this.p = (RoundedShadowView) view.findViewById(R.id.shadow1);
        this.q = (RoundedShadowView) view.findViewById(R.id.shadow2);
        textView.addOnLayoutChangeListener(new uvh(this, 1));
        this.itemView.setOnClickListener(new tg(this, 5));
    }

    public final void V5(boolean z) {
        TextView textView = this.n;
        textView.setSelected(z);
        if (z) {
            abg0 abg0Var = dhr0.t;
            textView.setBackgroundTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_background_modal_inverse)));
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast_themed));
        } else {
            abg0 abg0Var2 = dhr0.t;
            textView.setBackgroundTintList(ColorStateList.valueOf(abg0Var2.c(R.attr.vk_ui_background_modal)));
            textView.setTextColor(abg0Var2.c(R.attr.vk_ui_text_primary));
        }
    }
}
