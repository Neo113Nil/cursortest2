package xsna;

import android.view.View;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickersRecommendationBlock;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stickers.ContextUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.kcl0;

/* compiled from: SuggestedStickersView.kt */
/* loaded from: classes6.dex */
public final class q5n0 implements c.m<StickersRecommendationBlock> {
    public final kcl0 b;
    public final View c;
    public final RecyclerPaginatedView d;
    public final kcl0.b e;
    public final a f;
    public final com.vk.lists.c g;
    public Integer h;
    public ContextUser i;
    public View j;
    public final io.reactivex.rxjava3.disposables.b k;

    /* compiled from: SuggestedStickersView.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public q5n0(kcl0 kcl0Var, View view, RecyclerPaginatedView recyclerPaginatedView, View view2) {
        this.b = kcl0Var;
        this.c = view;
        this.d = recyclerPaginatedView;
        this.e = kcl0Var.D0();
        a aVar = new a();
        aVar.x0(n5n0.class, new awm0(2));
        this.f = aVar;
        this.k = new io.reactivex.rxjava3.disposables.b();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
        dVar.f = 0;
        dVar.a();
        f4m.l(cn70.b(13), cn70.b(13), recyclerPaginatedView.getRecyclerView());
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setAdapter(aVar);
        view2.setOnClickListener(new yg1(this, 9));
        c.h hVar = new c.h(this);
        hVar.l = false;
        hVar.m = false;
        com.vk.lists.c a2 = com.vk.lists.f.a(hVar, recyclerPaginatedView);
        this.g = a2;
        a2.n(false);
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<StickersRecommendationBlock> O9(String str, com.vk.lists.c cVar) {
        Integer num = this.h;
        if (num == null) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        int intValue = num.intValue();
        if (str == null || str.equals("0")) {
            str = null;
        }
        return this.e.b(intValue, str);
    }

    public final void a(List<StickerStockItemWithStickerId> list) {
        boolean isEmpty = list.isEmpty();
        View view = this.c;
        if (isEmpty) {
            view.setVisibility(4);
            return;
        }
        this.d.f0();
        ContextUser contextUser = this.i;
        a aVar = this.f;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new n5n0((StickerStockItemWithStickerId) it.next(), contextUser));
        }
        aVar.setItems(arrayList);
        view.setVisibility(0);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickersRecommendationBlock> hj(com.vk.lists.c cVar, boolean z) {
        Integer num = this.h;
        if (num != null) {
            this.e.d(num.intValue());
        }
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickersRecommendationBlock> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new j720(new n7b0(cVar, 12), 10), new y730(new alj0(this, 9), 15), new cm4(this, 7));
        hg1.b(this.c, subscribe);
        this.k.b(subscribe);
    }
}
