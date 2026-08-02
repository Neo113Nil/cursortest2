package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ReviewsSortMenuItemHolder.kt */
/* loaded from: classes18.dex */
public final class ejg0 extends vfz<efk0> {
    public final eig0<bhg0> l;
    public final TextView m;
    public efk0 n;

    public ejg0(ViewGroup viewGroup, eig0<bhg0> eig0Var) {
        super(R.layout.reviews_sort_popup_menu_item_view_holder, viewGroup);
        this.l = eig0Var;
        TextView textView = (TextView) this.itemView;
        this.m = textView;
        bwt0.i0(textView, new ut30(this, 15));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(efk0 efk0Var) {
        efk0 efk0Var2 = efk0Var;
        this.n = efk0Var2;
        String string = this.itemView.getContext().getString(efk0Var2.c);
        TextView textView = this.m;
        textView.setText(string);
        if (efk0Var2.d) {
            textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_accent, this.itemView.getContext()));
        } else {
            textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, this.itemView.getContext()));
        }
    }
}
