package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: PartMediaPermissionWarningViewHolder.kt */
/* loaded from: classes15.dex */
public final class gk90 extends RecyclerView.e0 {
    public final hk90 l;

    public gk90(ViewGroup viewGroup, hk90 hk90Var) {
        super(bwt0.I(R.layout.holder_part_media_permission_warning, viewGroup, false));
        this.l = hk90Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.part_media_permission_warning_title);
        abg0 abg0Var = dhr0.t;
        textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.part_media_permission_warning_button);
        textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_accent_themed));
        textView2.setBackground(abg0Var.a(R.drawable.ripple));
        bwt0.i0(textView2, new o010(this, 24));
    }
}
