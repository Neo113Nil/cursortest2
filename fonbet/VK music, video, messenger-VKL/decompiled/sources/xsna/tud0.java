package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.klh;
import xsna.sud0;

/* compiled from: ProfileContentArticlesViewHolder.kt */
/* loaded from: classes5.dex */
public final class tud0 extends wjh<fq3> {
    public static final /* synthetic */ int G = 0;
    public final zih E;
    public final sud0 F;

    /* compiled from: ProfileContentArticlesViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Article, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Article article) {
            Article article2 = article;
            tud0 tud0Var = (tud0) this.receiver;
            int i = tud0.G;
            fq3 fq3Var = (fq3) tud0Var.t;
            if (fq3Var != null) {
                zih.a(tud0Var.E, fq3Var, new nn3(article2, fq3Var), null, 12);
            }
            return s3q0.a;
        }
    }

    public tud0(View view, UserId userId, FragmentImpl fragmentImpl, zih zihVar, izs<? super Integer, s3q0> izsVar, izs<? super CommunityProfileContentItem, s3q0> izsVar2, izs<? super CommunityProfileContentItem, s3q0> izsVar3, izs<? super CommunityProfileContentItem, s3q0> izsVar4, izs<? super CommunityProfileContentItem, s3q0> izsVar5) {
        super(view, userId, fragmentImpl, izsVar, izsVar2, izsVar3, izsVar4, izsVar5, null);
        this.E = zihVar;
        sud0 sud0Var = new sud0(new a(1, this, tud0.class, "onItemClick", "onItemClick(Lcom/vk/dto/articles/Article;)V", 0));
        this.F = sud0Var;
        RecyclerView recyclerView = this.w.getRecyclerView();
        recyclerView.setItemAnimator(null);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        awt0.x(recyclerView, 0, iah0.a(1), 0, 0, 13);
        recyclerView.setClipToPadding(false);
        this.w.setAdapter(sud0Var);
    }

    @Override // xsna.wjh
    public final void V5(fq3 fq3Var) {
        fq3 fq3Var2 = fq3Var;
        super.V5(fq3Var2);
        Collection collection = fq3Var2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.F.setItems(collection);
        CommunityProfileContentItem.State state = fq3Var2.p;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (state == state2) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(fq3 fq3Var) {
        fq3 fq3Var2 = fq3Var;
        return fq3Var2 != null && fq3Var2.k && fq3Var2.p.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof sud0.b)) {
            return null;
        }
        return new klh.b(((Article) r8.m).b, CommonCommunitiesStat$TypeTabContentType.ARTICLES, ((sud0.b) e0Var).getAbsoluteAdapterPosition(), null);
    }

    @Override // xsna.wjh
    public final void m6(fq3 fq3Var) {
        this.x.setContent(xji.c);
    }
}
