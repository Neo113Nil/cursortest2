package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: BaseViewHolder.kt */
/* loaded from: classes15.dex */
public abstract class as6 extends RecyclerView.e0 {
    public final AppCompatImageView l;
    public final TextView m;
    public final AppCompatImageView n;
    public final TextView o;
    public final int p;
    public final int q;

    public as6(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.vk_qr_info_item, viewGroup, false));
        this.l = (AppCompatImageView) this.itemView.findViewById(R.id.vk_qr_item_icon);
        this.m = (TextView) this.itemView.findViewById(R.id.vk_scope_item_title);
        this.n = (AppCompatImageView) this.itemView.findViewById(R.id.vk_qr_end_chevron);
        this.o = (TextView) this.itemView.findViewById(R.id.vk_scope_item_description);
        this.p = 2;
        this.q = 1;
    }

    public final void V5(gv20 gv20Var, boolean z) {
        this.l.setImageResource(gv20Var.b);
        this.m.setText(gv20Var.a);
        gzs<s3q0> gzsVar = gv20Var.c;
        AppCompatImageView appCompatImageView = this.n;
        if (gzsVar != null) {
            appCompatImageView.setVisibility(0);
            this.itemView.setOnClickListener(new ci0(gv20Var, 1));
            this.itemView.setClickable(true);
        } else {
            appCompatImageView.setVisibility(4);
            this.itemView.setOnClickListener(null);
            this.itemView.setClickable(false);
        }
        if (z) {
            awt0.u(appCompatImageView, gzsVar != null);
            appCompatImageView.setAlpha(0.66f);
            this.itemView.setClickable(false);
        } else {
            if (gzsVar != null) {
                appCompatImageView.setVisibility(0);
                appCompatImageView.setAlpha(1.0f);
                this.itemView.setOnClickListener(new vr6(gv20Var, 0));
                this.itemView.setClickable(true);
                return;
            }
            appCompatImageView.setVisibility(4);
            appCompatImageView.setAlpha(1.0f);
            this.itemView.setOnClickListener(null);
            this.itemView.setClickable(false);
        }
    }
}
