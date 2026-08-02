package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ClipsRecyclerViewFocusedItemViewHelper.kt */
/* loaded from: classes17.dex */
public final class n0f<Item> extends RecyclerView.t {
    public final com.vk.movika.sdk.base.logic.processor.actions.g b;
    public final dux<Item> c;
    public final com.vk.im.engine.internal.api_commands.messages.a d;
    public final sf1 e;
    public final o1e f;
    public boolean g;
    public int h;
    public qxr<Item> i;

    public n0f(com.vk.movika.sdk.base.logic.processor.actions.g gVar, dux duxVar, com.vk.im.engine.internal.api_commands.messages.a aVar, sf1 sf1Var, o1e o1eVar, boolean z) {
        this.b = gVar;
        this.c = duxVar;
        this.d = aVar;
        this.e = sf1Var;
        this.f = o1eVar;
        this.g = z;
    }

    public final void l(RecyclerView recyclerView) {
        int s;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (s = linearLayoutManager.s()) == -1) {
            return;
        }
        this.f.invoke(Integer.valueOf(s));
    }

    public final void m(RecyclerView recyclerView) {
        rvx<Item> a;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        qxr<Item> qxrVar = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int s = linearLayoutManager.s();
        dux<Item> duxVar = this.c;
        if (duxVar != null && (a = duxVar.a(s)) != null) {
            qxrVar = new qxr<>(a.a, a.b, s);
        }
        n(qxrVar, recyclerView);
    }

    public final void n(qxr<Item> qxrVar, RecyclerView recyclerView) {
        qxr<Item> qxrVar2 = this.i;
        if (epx.f(qxrVar2 != null ? qxrVar2.b : null, qxrVar != null ? qxrVar.b : null)) {
            return;
        }
        qxr<Item> qxrVar3 = this.i;
        if (qxrVar3 != null) {
            this.e.invoke(qxrVar3);
            this.i = null;
        }
        boolean z = recyclerView.hasPendingAdapterUpdates();
        if (qxrVar == null || z) {
            return;
        }
        this.i = qxrVar;
        this.d.invoke(qxrVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = recyclerView.getScrollState() == 0;
        boolean z2 = this.h == 1;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int s = linearLayoutManager.s();
        if (z) {
            l(recyclerView);
        }
        if (z && z2) {
            return;
        }
        if (z && s == -1 && linearLayoutManager.getChildCount() > 0) {
            return;
        }
        if (!z) {
            this.h = recyclerView.getScrollState();
            return;
        }
        this.h = recyclerView.getScrollState();
        if (this.g) {
            return;
        }
        m(recyclerView);
    }
}
