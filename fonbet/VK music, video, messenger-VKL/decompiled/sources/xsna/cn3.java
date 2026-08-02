package xsna;

import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.fave.api.FaveLoadState;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.fragments.FavesFragment;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class cn3 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cn3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        ExtendedCommunityProfile g;
        ArrayList<StoriesContainer> arrayList;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                gn3 gn3Var = (gn3) obj2;
                gmq gmqVar = ((FaveEntry) obj).i.f;
                if (i == 117 && (gmqVar instanceof ArticleAttachment)) {
                    ArticleAuthorPageFragment articleAuthorPageFragment = gn3Var.b;
                    Article article = ((ArticleAttachment) gmqVar).f;
                    qm3 qm3Var = articleAuthorPageFragment.b0;
                    if (qm3Var == null) {
                        qm3Var = null;
                    }
                    ArrayList arrayList2 = (ArrayList) qm3Var.y0();
                    Iterator it = arrayList2.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        int i5 = i4 + 1;
                        zif0 zif0Var = (zif0) it.next();
                        ym3 ym3Var = zif0Var instanceof ym3 ? (ym3) zif0Var : null;
                        if (epx.f(ym3Var != null ? ym3Var.a : null, article)) {
                            arrayList2.set(i4, new ym3(article, ((ym3) zif0Var).b));
                            qm3 qm3Var2 = articleAuthorPageFragment.b0;
                            (qm3Var2 != null ? qm3Var2 : null).notifyItemChanged(i4);
                            break;
                        } else {
                            i4 = i5;
                        }
                    }
                    break;
                }
                break;
            case 1:
                int i6 = FavesFragment.j0;
                ((FavesFragment) obj2).Im((FaveLoadState) obj);
                break;
            default:
                vzd0 vzd0Var = (vzd0) obj2;
                zjm0 zjm0Var = (zjm0) obj;
                boolean c = vzd0Var.c(zjm0Var);
                m3a m3aVar = vzd0Var.a;
                if (c && !fkq0.d(m3aVar.h()) && epx.f(zjm0Var.j.e, fkq0.e(m3aVar.h())) && (g = m3aVar.g()) != null && (arrayList = g.v1) != null) {
                    vzd0Var.b.a(arrayList);
                    break;
                }
                break;
        }
    }
}
