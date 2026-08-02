package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import xsna.xo3;

/* compiled from: ArticlePickerFeature.kt */
/* loaded from: classes18.dex */
public final class vo3 implements yf90 {
    public final /* synthetic */ wo3 a;

    public vo3(wo3 wo3Var) {
        this.a = wo3Var;
    }

    @Override // xsna.yf90
    public final io.reactivex.rxjava3.core.q<wia0<Article>> a(int i, int i2) {
        wo3 wo3Var = this.a;
        UserId userId = wo3Var.f;
        wo3Var.T(xo3.a.b.b);
        return new io.reactivex.rxjava3.internal.operators.single.o(wo3Var.g.a(i, userId, i2).l(new ox0(new uo3(i, wo3Var), 4)), new da(new r6(wo3Var, 5), 3)).h(new ea(new t6(wo3Var, 6), 4)).w();
    }
}
