package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import xsna.hfz;

/* compiled from: ClipsRecyclerViewFocusedItemViewHelper.kt */
/* loaded from: classes17.dex */
public final class m0f<Item extends hfz> extends RecyclerView.t {
    public final ixc b;
    public final mb c;
    public final com.vk.movika.sdk.base.observable.m d;
    public final iz e;
    public boolean f;
    public int g;
    public a<Item> h;

    /* compiled from: ClipsRecyclerViewFocusedItemViewHelper.kt */
    public static final class a<Item> {
        public final Item a;
        public final String b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, String str, Object obj) {
            this.a = obj;
            this.b = str;
            this.c = i;
        }

        public final Item a() {
            return this.a;
        }

        public final int b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            Item item = this.a;
            return Integer.hashCode(this.c) + urd0.a((item == null ? 0 : item.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FocusedItemViewData(item=");
            sb.append(this.a);
            sb.append(", key=");
            sb.append(this.b);
            sb.append(", position=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public m0f(ixc ixcVar, mb mbVar, com.vk.movika.sdk.base.observable.m mVar, iz izVar, boolean z) {
        this.b = ixcVar;
        this.c = mbVar;
        this.d = mVar;
        this.e = izVar;
        this.f = z;
    }

    public final void l(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int s = linearLayoutManager.s();
        Pair pair = (Pair) this.c.invoke(Integer.valueOf(s));
        m(pair != null ? new a<>(s, (String) pair.j(), pair.i()) : null, recyclerView);
    }

    public final void m(a<Item> aVar, RecyclerView recyclerView) {
        a<Item> aVar2 = this.h;
        if (epx.f(aVar2 != null ? aVar2.b : null, aVar != null ? aVar.b : null)) {
            return;
        }
        a<Item> aVar3 = this.h;
        if (aVar3 != null) {
            this.e.invoke(aVar3);
            this.h = null;
        }
        boolean z = recyclerView.hasPendingAdapterUpdates();
        if (aVar == null || z) {
            return;
        }
        this.h = aVar;
        this.d.invoke(aVar);
    }

    public final void n() {
        if (this.f) {
            return;
        }
        this.f = true;
        a<Item> aVar = this.h;
        if (aVar == null) {
            return;
        }
        this.e.invoke(aVar);
        this.h = null;
    }

    public final void o() {
        if (this.f) {
            this.f = false;
            RecyclerView recyclerView = (RecyclerView) this.b.invoke();
            if (recyclerView != null) {
                l(recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = recyclerView.getScrollState() == 0;
        boolean z2 = this.g == 1;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int s = linearLayoutManager.s();
        if (z && z2) {
            return;
        }
        if (z && s == -1 && linearLayoutManager.getChildCount() > 0) {
            return;
        }
        if (!z) {
            this.g = recyclerView.getScrollState();
            return;
        }
        this.g = recyclerView.getScrollState();
        if (this.f) {
            return;
        }
        l(recyclerView);
    }
}
