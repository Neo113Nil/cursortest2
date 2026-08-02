package xsna;

import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.h4n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class og5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ og5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.e = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                List list = (List) this.e;
                q630 q630Var = (q630) this.d;
                izs izsVar = (izs) this.c;
                ((Integer) obj2).getClass();
                tg5.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar, q630Var);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ho7.a((mtk0) this.e, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                e64 e64Var = (e64) this.e;
                e64 e64Var2 = (e64) this.d;
                e64 e64Var3 = (e64) this.c;
                em50 em50Var = (em50) obj;
                h4n h4nVar = (h4n) obj2;
                if (h4nVar instanceof i4n) {
                    return em50Var.a(e64Var, h4nVar);
                }
                if (h4nVar instanceof h4n.b) {
                    return em50Var.a(e64Var2, h4nVar);
                }
                if (h4nVar instanceof h4n.a) {
                    return em50Var.a(e64Var3, h4nVar);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                PostFragment postFragment = (PostFragment) this.e;
                NewsComment newsComment = (NewsComment) this.d;
                aa aaVar = (aa) this.c;
                e520 e520Var = (e520) obj2;
                lfg lfgVar = postFragment.J0;
                if (lfgVar == null) {
                    lfgVar = null;
                }
                lfgVar.f8(e520Var.a, newsComment, aaVar);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((koh0) this.e).q((loh0) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
        }
    }

    public /* synthetic */ og5(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.d = obj2;
        this.c = izsVar;
    }

    public /* synthetic */ og5(mtk0 mtk0Var, izs izsVar, q630 q630Var, int i) {
        this.b = 1;
        this.e = mtk0Var;
        this.c = izsVar;
        this.d = q630Var;
    }
}
