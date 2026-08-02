package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickersRecommendationBlock;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stickers.ContextUser;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.kcl0;

/* compiled from: SuggestedStickersWindow.kt */
/* loaded from: classes6.dex */
public final class s5n0 implements n0q0, c.m<StickersRecommendationBlock> {
    public final kcl0 b;
    public final kcl0.b c;
    public final int d;
    public final ContextUser e;
    public final View f;
    public final u390 g;
    public final a h;
    public final com.vk.lists.c i;
    public final io.reactivex.rxjava3.disposables.b j;

    /* compiled from: SuggestedStickersWindow.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public s5n0(Context context, kcl0 kcl0Var, kcl0.b bVar, int i, ContextUser contextUser, View view) {
        this.b = kcl0Var;
        this.c = bVar;
        this.d = i;
        this.e = contextUser;
        this.f = view;
        a aVar = new a();
        aVar.x0(n5n0.class, new gz30(23));
        this.h = aVar;
        this.j = new io.reactivex.rxjava3.disposables.b();
        View inflate = LayoutInflater.from(context).inflate(R.layout.suggested_stickers, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.shadow_view);
        View findViewById2 = inflate.findViewById(R.id.background);
        jjc.g(inflate.findViewById(R.id.close), new vlc0(this, 17));
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.list);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.f = 1;
        dVar.d(new vvi0(this, 5));
        dVar.a();
        f4m.l(cn70.b(12), cn70.b(12), recyclerPaginatedView.getRecyclerView());
        recyclerPaginatedView.getRecyclerView().setScrollBarStyle(33554432);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.getRecyclerView().addOnScrollListener(new z2p0(findViewById2, findViewById, null));
        recyclerPaginatedView.setAdapter(aVar);
        c.h hVar = new c.h(this);
        hVar.i = 20;
        hVar.l = false;
        hVar.m = false;
        this.i = com.vk.lists.f.a(hVar, recyclerPaginatedView);
        u390 u390Var = new u390(inflate, this);
        this.g = u390Var;
        u390Var.d = new PopupWindow.OnDismissListener() { // from class: xsna.r5n0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                s5n0.this.j.e();
            }
        };
        hg1.b(inflate, y9l0.a.subscribe(new fs00(new gda0(this, 22), 29)));
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<StickersRecommendationBlock> O9(String str, com.vk.lists.c cVar) {
        if (str == null || str.equals("0")) {
            str = null;
        }
        return this.c.b(this.d, str);
    }

    public final void a(List<StickerStockItemWithStickerId> list) {
        boolean isEmpty = list.isEmpty();
        a aVar = this.h;
        if (isEmpty) {
            aVar.clear();
            this.g.dismiss();
            return;
        }
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new n5n0((StickerStockItemWithStickerId) it.next(), this.e));
        }
        aVar.setItems(arrayList);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickersRecommendationBlock> hj(com.vk.lists.c cVar, boolean z) {
        this.c.d(this.d);
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickersRecommendationBlock> qVar, boolean z, com.vk.lists.c cVar) {
        this.j.b(qVar.subscribe(new n3t(new b3m0(cVar, 3), 24), kwg0.b(), new zm80(this, 2)));
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
