package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vkontakte.android.R;
import xsna.av20;

/* compiled from: ArticleAuthorPageSortHolder.kt */
/* loaded from: classes15.dex */
public final class kn3 extends hf6<ln3> {
    public final izs<ArticleAuthorPageSortType, s3q0> m;
    public final TextView n;
    public VkContextMenu o;
    public final av20<ArticleAuthorPageSortType> p;

    public kn3(View view, ArticleAuthorPageFragment.c cVar) {
        super(view);
        this.m = cVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.sort_type_text);
        this.n = textView;
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_single_choice_simple, LayoutInflater.from(this.itemView.getContext()));
        aVar.d = new in3(this, 0);
        aVar.e = new jn3(this);
        av20<ArticleAuthorPageSortType> b = aVar.b();
        this.p = b;
        b.setItems(rl3.u0(ArticleAuthorPageSortType.values()));
        bwt0.i0(textView, new hb(this, 4));
    }

    @Override // xsna.hf6
    public final void W5(ln3 ln3Var) {
        this.n.setText(ln3Var.a.h());
    }
}
