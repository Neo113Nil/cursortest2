package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vkontakte.android.R;

/* compiled from: PostingSettingsCommunityViewHolder.kt */
/* loaded from: classes4.dex */
public abstract class slc0<T extends PostingSettingsCommunityItem> extends vif0<T> {
    public final View n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final TextView s;

    public slc0(View view, izs<? super PostingSettingsCommunityItem, s3q0> izsVar) {
        super(view);
        this.n = view;
        abg0 abg0Var = dhr0.t;
        this.o = abg0Var.c(R.attr.vk_ui_text_secondary);
        this.p = abg0Var.c(R.attr.vk_ui_separator_primary);
        this.q = abg0Var.c(R.attr.vk_ui_text_accent);
        this.r = this.itemView.getContext().getColor(R.color.vk_orange);
        this.s = (TextView) this.itemView.findViewById(R.id.tv_item);
        jjc.g(this.itemView, new v74(26, izsVar, this));
        bwt0.s0(this.itemView, 0.96f);
    }

    public abstract int q6(T t);

    @Override // xsna.vif0
    /* renamed from: s6, reason: merged with bridge method [inline-methods] */
    public void i6(T t) {
        f370.H(this.n, g6(q6(t)));
    }

    public final void t6(int i) {
        TextView textView = this.s;
        textView.setTextColor(i);
        hno0.a(textView, ColorStateList.valueOf(i));
    }
}
