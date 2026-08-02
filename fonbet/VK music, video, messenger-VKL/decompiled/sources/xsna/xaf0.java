package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dcl0;

/* compiled from: RecommendationBlockView.kt */
/* loaded from: classes6.dex */
public final class xaf0 implements c.m<StickerPackRecommendationBlock> {
    public final f9l0 b;
    public final rdf0 c;
    public final View d;
    public final ContextUser e;
    public final GiftData f;
    public final xbf0 g;
    public int h;
    public String i;
    public final a j;
    public final com.vk.lists.c k;
    public final io.reactivex.rxjava3.disposables.b l;
    public io.reactivex.rxjava3.disposables.c m;
    public final TextView n;
    public final View o;
    public final RecyclerPaginatedView p;
    public final dcl0<hfz> q;
    public final bpn0 r;

    /* compiled from: RecommendationBlockView.kt */
    public static final class a extends sxm implements vic {
        public final xbf0 i;

        public a(xbf0 xbf0Var) {
            this.i = xbf0Var;
            x0(qdf0.class, new waf0(this, 0));
        }

        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    /* compiled from: RecommendationBlockView.kt */
    public interface b {
        void a(StickerStockItem stickerStockItem);
    }

    public xaf0(f9l0 f9l0Var, rdf0 rdf0Var, View view, ContextUser contextUser, GiftData giftData, xbf0 xbf0Var, RecyclerView.u uVar) {
        this.b = f9l0Var;
        this.c = rdf0Var;
        this.d = view;
        this.e = contextUser;
        this.f = giftData;
        this.g = xbf0Var;
        a aVar = new a(xbf0Var);
        this.j = aVar;
        this.l = new io.reactivex.rxjava3.disposables.b();
        this.n = (TextView) view.findViewById(R.id.title);
        this.o = view.findViewById(R.id.show);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.paginated_view);
        this.p = recyclerPaginatedView;
        this.r = new bpn0(new c950(this, 24));
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
        dVar.f = 0;
        dVar.a();
        f4m.l(cn70.b(6), cn70.b(6), recyclerPaginatedView.getRecyclerView());
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
        recyclerPaginatedView.getRecyclerView().setRecycledViewPool(uVar);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setAdapter(aVar);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        dcl0<hfz> dcl0Var = new dcl0<>(recyclerView, on00.f(new Pair(pdf0.class, new dcl0.a(new iv8(recyclerView, this)))), aVar);
        recyclerView.addOnScrollListener(dcl0Var);
        this.q = dcl0Var;
        c.h hVar = new c.h(this);
        hVar.l = false;
        hVar.m = false;
        this.k = com.vk.lists.f.a(hVar, recyclerPaginatedView);
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<StickerPackRecommendationBlock> O9(String str, com.vk.lists.c cVar) {
        String str2 = this.i;
        if (str2 == null) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        if (str == null || str.equals("0")) {
            str = null;
        }
        return this.c.b(str2, str);
    }

    public final void a(cbf0 cbf0Var) {
        List<StickerStockItem> list = cbf0Var.c;
        boolean isEmpty = list.isEmpty();
        View view = this.d;
        a aVar = this.j;
        if (isEmpty) {
            aVar.clear();
            f4m.j(view);
            return;
        }
        this.n.setText(cbf0Var.b);
        List<StickerStockItem> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((StickerStockItem) it.next()).O = "pack_recommendations_".concat(cbf0Var.a);
        }
        int i = this.h;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new qdf0((StickerStockItem) it2.next(), i));
        }
        aVar.setItems(arrayList);
        view.setVisibility(0);
        this.p.f0();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickerPackRecommendationBlock> hj(com.vk.lists.c cVar, boolean z) {
        String str = this.i;
        if (str != null) {
            this.c.a.remove(str);
        }
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickerPackRecommendationBlock> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new jsv(new j20(22, this, cVar), 20), kwg0.b());
        hg1.b(this.d, subscribe);
        this.l.b(subscribe);
    }
}
