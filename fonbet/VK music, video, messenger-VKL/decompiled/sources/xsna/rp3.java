package xsna;

import android.content.Intent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.articles.ArticleFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollInfo;
import com.vk.log.L;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: ArticlePresenter.kt */
/* loaded from: classes15.dex */
public final class rp3 implements rn3 {
    public final ArticleFragment b;
    public final sp3 c;
    public int d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public Article f;
    public Article g;

    public rp3(ArticleFragment articleFragment, sp3 sp3Var) {
        this.b = articleFragment;
        this.c = sp3Var;
    }

    @Override // xsna.rn3
    public final void S(int i, UserId userId) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.c.S(i, userId).a0(asu0.a.d());
        np3 np3Var = new np3(new sa(this, 5), 0);
        int i2 = kwg0.a;
        this.e.b(a0.subscribe(np3Var, new iwg0()));
    }

    @Override // xsna.rn3
    public final void S5(String str, e5 e5Var) {
        this.e.b(rsg0.y0(new hq3(str, 2), null, null, 3).subscribe(new tf1(new tm0(e5Var, 7), 1), new com.vk.im.ui.components.dialogs_list.b(new qp3(L.a, 0), 3)));
    }

    @Override // xsna.rn3
    public final void U1(Article article) {
        this.f = article;
        this.g = article;
    }

    @Override // xsna.rn3
    public final void U3(PollInfo pollInfo, boolean z, izs<? super PollAttachment, s3q0> izsVar) {
        io.reactivex.rxjava3.core.q y0 = rsg0.y0(new cub0(pollInfo), null, null, 3);
        if (z) {
            y0 = hg1.m(y0, this.b.getActivity(), 0L, false, 62);
        }
        this.e.b(y0.subscribe(new pp3(new op3(izsVar, 0), 0), new b60(new a60(3), 1)));
    }

    @Override // xsna.rn3
    public final void W1() {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.c.a().L(new q7(new sf1(this, 3), 4), false).a0(asu0.a.d());
        bn3 bn3Var = new bn3(new r7(this, 6), 1);
        int i = kwg0.a;
        this.e.b(a0.subscribe(bn3Var, new iwg0()));
    }

    @Override // xsna.rn3
    public final void Z3(Intent intent) {
        Article article;
        UserId userId;
        String action = intent.getAction();
        if (action != null && action.hashCode() == 3866578 && action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID") && (article = this.f) != null && (userId = (UserId) intent.getParcelableExtra("id")) != null && epx.f(article.c, userId) && article.d()) {
            Article a = Article.a(article, null, 1015807);
            ArticleFragment articleFragment = this.b;
            articleFragment.U = a;
            articleFragment.T = a;
            articleFragment.jo();
            f1o f1oVar = articleFragment.u0;
            if (f1oVar != null) {
                ViewParent parent = f1oVar.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(f1oVar);
                }
                articleFragment.u0 = null;
            }
            articleFragment.so();
        }
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void d() {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        p11 p11Var = new p11(24);
        fVar.getClass();
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, p11Var).U(new rf3(25)).U(new com.vk.movika.sdk.base.model.history.b(new db(6), 3)).subscribe(new tf(new ay0(this, 4), 3), new ji3(new qt0(4), 1)));
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        this.e.dispose();
    }

    @Override // xsna.rn3
    public final void y1(Article article) {
        this.g = article;
    }

    @Override // xsna.rn3
    public final void z2(PollInfo pollInfo) {
        U3(pollInfo, false, new mp3(0, this, pollInfo));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
