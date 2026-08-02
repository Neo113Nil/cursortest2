package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: CommonQuestionItemViewHolder.kt */
/* loaded from: classes16.dex */
public abstract class bmg<T> extends vfz<T> {
    public final izs<wpe0, s3q0> l;
    public final VkText m;
    public final ImageView n;

    public bmg(ViewGroup viewGroup, izs izsVar) {
        super(R.layout.internal_nps_catalog_question_item, viewGroup);
        this.l = izsVar;
        this.m = (VkText) this.itemView.findViewById(R.id.internal_nps_question_item_text);
        this.n = (ImageView) this.itemView.findViewById(R.id.internal_nps_question_item_icon);
    }

    public final void h6(wpe0 wpe0Var) {
        this.itemView.setOnClickListener(new amg(0, this, wpe0Var));
        this.m.setText(wpe0Var.b);
        this.n.setImageDrawable(wpe0Var.c ? j6() : i6());
    }

    public abstract Drawable i6();

    public abstract Drawable j6();
}
