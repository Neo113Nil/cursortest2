package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vk.dto.newsfeed.entries.DzenArticlesBlock;
import com.vkontakte.android.R;
import xsna.bwy;

/* compiled from: DzenArticlesCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class lto extends rp6<ero, DzenArticlesBlock> {
    public static final m900<String, Boolean> H = new m900<>(15);
    public final dto E;
    public final RecyclerView F;
    public final ito G;

    public lto(ViewGroup viewGroup, dto dtoVar) {
        super(R.layout.dzen_articles_card_block, viewGroup);
        this.E = dtoVar;
        getContext();
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.dzen_articles_card_block_recycler_view);
        this.F = recyclerView;
        ito itoVar = new ito(new wmg(this, 2), new wa5(this, 6));
        this.G = itoVar;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        float f = 8;
        recyclerView.setPadding(iah0.a(16), iah0.a(4), iah0.a(f), iah0.a(f));
        recyclerView.addItemDecoration(new ehk0(iah0.a(12)));
        recyclerView.setAdapter(itoVar);
        recyclerView.addOnScrollListener(new jto(this));
        itoVar.registerAdapterDataObserver(new kto(this));
    }

    public static final void b7(lto ltoVar) {
        DzenArticleBlockItem dzenArticleBlockItem;
        RecyclerView.o layoutManager = ltoVar.F.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        if (v == -1 || x == -1 || v > x) {
            return;
        }
        while (true) {
            View findViewByPosition = linearLayoutManager.findViewByPosition(v);
            if (findViewByPosition != null) {
                findViewByPosition.getLocalVisibleRect(new Rect());
                if ((r4.height() * r4.width()) / (findViewByPosition.getMeasuredWidth() * findViewByPosition.getMeasuredHeight()) >= 0.8f && (dzenArticleBlockItem = (DzenArticleBlockItem) j5g.b0(v, ltoVar.G.getCurrentList())) != null) {
                    String str = dzenArticleBlockItem.b;
                    m900<String, Boolean> m900Var = H;
                    if (m900Var.get(str) == null) {
                        ltoVar.E.a(str, dzenArticleBlockItem.d, v, dzenArticleBlockItem.g);
                        m900Var.put(str, Boolean.TRUE);
                    }
                }
            }
            if (v == x) {
                return;
            } else {
                v++;
            }
        }
    }

    @Override // xsna.rp6
    public final void R6(ero eroVar) {
        ero eroVar2 = eroVar;
        boolean z = eroVar2.i && !epx.f(eroVar2.j, bwy.b.a);
        ito itoVar = this.G;
        if (itoVar.e != z) {
            itoVar.e = z;
            itoVar.notifyDataSetChanged();
        }
        itoVar.submitList(eroVar2.h);
    }
}
