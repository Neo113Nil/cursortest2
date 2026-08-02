package xsna;

import android.content.Context;
import com.vk.dto.articles.Article;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: ArticleAuthorPageItem.kt */
/* loaded from: classes15.dex */
public final class ym3 extends zif0 {
    public final Article a;
    public final boolean b;
    public final String c;

    public ym3(Article article, boolean z) {
        String i;
        this.a = article;
        this.b = z;
        StringBuilder sb = new StringBuilder();
        sb.append(pvo0.i(true, (int) article.e, false, false));
        sb.append(" · ");
        int i2 = article.m;
        if (i2 == 0) {
            Context context = e43.a;
            i = (context == null ? null : context).getResources().getString(R.string.no_views).toLowerCase(Locale.ROOT);
        } else {
            i = uqm0.i(i2, R.plurals.article_view_count, R.string.article_view_count_formatted, true);
        }
        sb.append(i);
        this.c = sb.toString();
    }

    @Override // xsna.zif0
    public final long a() {
        return this.a.b;
    }

    @Override // xsna.zif0
    public final int b() {
        return this.b ? R.layout.article_author_page_item_big : R.layout.article_author_page_item_small;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym3)) {
            return false;
        }
        ym3 ym3Var = (ym3) obj;
        return epx.f(this.a, ym3Var.a) && this.b == ym3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleAuthorPageItem(article=");
        sb.append(this.a);
        sb.append(", isBigStyle=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
