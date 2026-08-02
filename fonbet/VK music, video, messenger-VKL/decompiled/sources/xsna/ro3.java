package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.common.data.VKList;

/* compiled from: ArticleListContainer.kt */
/* loaded from: classes18.dex */
public final class ro3 {
    public final VKList<Article> a;
    public final pm3 b;

    public ro3(VKList<Article> vKList, pm3 pm3Var) {
        this.a = vKList;
        this.b = pm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro3)) {
            return false;
        }
        ro3 ro3Var = (ro3) obj;
        return epx.f(this.a, ro3Var.a) && epx.f(this.b, ro3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArticleListContainer(articles=" + this.a + ", articleAuthor=" + this.b + ')';
    }
}
