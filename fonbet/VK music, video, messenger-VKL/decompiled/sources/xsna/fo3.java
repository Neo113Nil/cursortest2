package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.articles.ArticleFragment;
import com.vk.dto.articles.Article;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class fo3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fo3(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Article article = (Article) obj5;
                ArticleFragment articleFragment = (ArticleFragment) obj4;
                FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = ArticleFragment.E0;
                article.n = booleanValue;
                articleFragment.po(article);
                if (articleFragment.mo(article)) {
                    articleFragment.xo(fragmentActivity);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(7);
                j2k.d(I, (androidx.compose.runtime.a) obj, (gzs) obj5, (gzs) obj4, (q630) obj3);
                break;
            case 2:
                ((Integer) obj2).getClass();
                zc70.d((dlv0) obj5, (xh70) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            default:
                ((Integer) obj2).getClass();
                n080.a((c280) obj5, (q630) obj4, (frv0) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fo3(Article article, ArticleFragment articleFragment, FragmentActivity fragmentActivity) {
        this.b = 0;
        this.c = article;
        this.d = articleFragment;
        this.e = fragmentActivity;
    }
}
