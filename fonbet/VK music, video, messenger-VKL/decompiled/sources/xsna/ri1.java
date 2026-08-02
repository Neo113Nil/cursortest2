package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.articles.ArticleFragment;
import com.vk.dto.articles.Article;
import xsna.w3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ri1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ri1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xi1.d(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj4, (String) obj5, (q630) obj3);
                return s3q0.a;
            case 1:
                Article article = (Article) obj4;
                ArticleFragment articleFragment = (ArticleFragment) obj5;
                FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = ArticleFragment.E0;
                article.n = booleanValue;
                articleFragment.po(article);
                if (articleFragment.mo(article)) {
                    articleFragment.xo(fragmentActivity);
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((o7k) obj4).h((hzg) obj5, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                bxl.c((izs) obj4, (i5u0) obj5, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 4:
                r3m r3mVar = (r3m) obj4;
                y3m y3mVar = (y3m) obj5;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1137175596, intValue, -1, "com.vk.design.demo.presentation.DesignDemoMviView.ThemedContent.<anonymous> (DesignDemoMviView.kt:82)");
                    }
                    n0u0[] n0u0VarArr = {y3mVar.a};
                    w3m.a aVar2 = w3m.a.a;
                    w3m w3mVar = (w3m) r3mVar.d(aVar2, n0u0VarArr, aVar, 518).getValue();
                    if (epx.f(w3mVar, aVar2)) {
                        aVar.K(1904059937);
                        r3mVar.h(512, aVar, izsVar, null);
                        aVar.j();
                    } else {
                        if (!(w3mVar instanceof w3m.b)) {
                            throw alb0.c(1904057781, aVar);
                        }
                        aVar.K(1904061956);
                        r3mVar.i((w3m.b) w3mVar, izsVar, null, aVar, 4096);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.h) obj4).i((com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.i) obj5, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                t0s0.b((xow) obj5, (String) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ ri1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ri1(xow xowVar, String str, izs izsVar, int i) {
        this.b = 6;
        this.d = xowVar;
        this.c = str;
        this.e = izsVar;
    }
}
