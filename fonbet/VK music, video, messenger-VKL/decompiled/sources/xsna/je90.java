package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;

/* compiled from: PaginationReviewsErrorViewHolder.kt */
/* loaded from: classes18.dex */
public final class je90 extends vfz<he90> {
    public final gzs<s3q0> l;
    public final View m;
    public final TextView n;
    public final VkSimpleButton o;

    public je90(ViewGroup viewGroup, int i, gzs<s3q0> gzsVar) {
        super(R.layout.reviews_pagination_error_view_holder_layout, viewGroup);
        this.l = gzsVar;
        View findViewById = this.itemView.findViewById(R.id.error_view_holder);
        this.m = findViewById;
        this.n = (TextView) this.itemView.findViewById(R.id.error_text);
        this.o = (VkSimpleButton) this.itemView.findViewById(R.id.error_button);
        float f = i;
        awt0.x(findViewById, iah0.a(f), 0, iah0.a(f), 0, 10);
    }

    @Override // xsna.vfz
    public final void W5(he90 he90Var) {
        Context context = this.itemView.getContext();
        he90Var.getClass();
        this.n.setText(context.getString(R.string.liblists_err_text));
        String string = this.itemView.getContext().getString(R.string.liblists_retry);
        VkSimpleButton vkSimpleButton = this.o;
        vkSimpleButton.setText(string);
        jjc.g(vkSimpleButton, new ie90(this, 0));
    }
}
