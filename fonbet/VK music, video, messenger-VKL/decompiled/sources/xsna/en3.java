package xsna;

import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class en3 implements izs {
    public final /* synthetic */ pm3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gn3 e;

    public /* synthetic */ en3(pm3 pm3Var, boolean z, boolean z2, gn3 gn3Var) {
        this.b = pm3Var;
        this.c = z;
        this.d = z2;
        this.e = gn3Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArticleAuthorPageFragment articleAuthorPageFragment = this.e.b;
        Throwable th = (Throwable) obj;
        pm3 pm3Var = this.b;
        if (!pm3Var.f || pm3Var.a()) {
            pm3Var.a.g(4, this.d);
        } else {
            pm3Var.h = this.c;
        }
        articleAuthorPageFragment.po(pm3Var);
        articleAuthorPageFragment.lo(th);
        L.i(th);
        return s3q0.a;
    }
}
