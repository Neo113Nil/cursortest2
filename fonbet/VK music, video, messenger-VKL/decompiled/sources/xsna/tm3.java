package xsna;

import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.dto.newsfeed.Owner;
import com.vk.log.L;

/* compiled from: ArticleAuthorPageContract.kt */
/* loaded from: classes15.dex */
public interface tm3 extends gm6 {
    static void y3(gn3 gn3Var) {
        ArticleAuthorPageFragment articleAuthorPageFragment = gn3Var.b;
        pm3 pm3Var = gn3Var.e;
        if (pm3Var == null) {
            L.l("Author shouldn't be null!");
            return;
        }
        Owner owner = pm3Var.a;
        boolean a = pm3Var.a();
        boolean z = pm3Var.h;
        if (!pm3Var.f || pm3Var.a()) {
            owner.g(4, !a);
            if (!pm3Var.a()) {
                pm3Var.h = false;
            }
        } else {
            pm3Var.h = !z;
        }
        articleAuthorPageFragment.po(pm3Var);
        gn3Var.h.b(hg1.m(xwk.e().T().a(owner.b, a || z, null, true, null).a0(io.reactivex.rxjava3.android.schedulers.a.b()), articleAuthorPageFragment.getActivity(), 0L, false, 62).subscribe(new com.vk.im.ui.components.dialogs_list.b(new dn3(pm3Var, z, a, gn3Var), 2), new eu0(new en3(pm3Var, z, a, gn3Var), 1)));
    }
}
