package xsna;

import android.view.View;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vkontakte.android.R;

/* compiled from: ArticleAuthorPageAdapter.kt */
/* loaded from: classes15.dex */
public final class qm3 extends gf6<zif0> {
    public final ArticleAuthorPageFragment.c e;
    public final hg f;

    public qm3(ArticleAuthorPageFragment.c cVar, hg hgVar) {
        super(true);
        this.e = cVar;
        this.f = hgVar;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        hg hgVar = this.f;
        if (i == R.layout.article_author_page_item_small) {
            return new hn3(view, hgVar);
        }
        if (i == R.layout.article_author_page_item_big) {
            return new sm3(view, hgVar);
        }
        if (i == R.layout.article_list_sort_picker_item) {
            return new kn3(view, this.e);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported viewType = "));
    }
}
