package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.dto.hints.HintId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: OnScrollStoppedHintRenderer.kt */
/* loaded from: classes16.dex */
public final class ib80 extends RecyclerView.t {
    public final b7a b;
    public final q3a c;
    public final nvs d;
    public final b4a e;
    public RecyclerView f;
    public dcn g;
    public final Rect h;
    public final Rect i;
    public final Handler j;
    public final sk3<a7a> k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public io.reactivex.rxjava3.disposables.c p;
    public final Set<String> q;
    public final wc2 r;

    /* compiled from: OnScrollStoppedHintRenderer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogHintType.values().length];
            try {
                iArr[CatalogHintType.HIGHLIGHT_KIDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogHintType.HIGHLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogHintType.HIGHLIGHT_TABS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogHintType.TOOLTIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogHintType.COACHMARK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ib80(b7a b7aVar, q3a q3aVar, nvs nvsVar) {
        b4a b4aVar = new b4a();
        this.b = b7aVar;
        this.c = q3aVar;
        this.d = nvsVar;
        this.e = b4aVar;
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Handler(Looper.getMainLooper());
        this.k = new sk3<>();
        this.q = rl3.y0(new String[]{HintId.ANIMATE_HEADLINE_MOVIES.getId(), HintId.SELECT_HEADLINE_MOVIES.getId(), HintId.ANIMATE_HEADLINE_SERIALS.getId(), HintId.SELECT_HEADLINE_SERIALS.getId(), HintId.ANIMATE_HEADLINE_CHILD.getId(), HintId.SELECT_HEADLINE_CHILD.getId(), HintId.ANIMATE_HEADLINE_SPORT.getId(), HintId.SELECT_HEADLINE_SPORT.getId()});
        this.r = new wc2(this, 10);
    }

    public final Rect l(UIBlockHint uIBlockHint, List<? extends View> list) {
        Rect rect = this.h;
        rect.setEmpty();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            View view = (View) obj;
            Rect rect2 = this.i;
            rect2.setEmpty();
            RecyclerView recyclerView = this.f;
            RecyclerView.e0 findContainingViewHolder = recyclerView != null ? recyclerView.findContainingViewHolder(view) : null;
            tca tcaVar = findContainingViewHolder instanceof tca ? (tca) findContainingViewHolder : null;
            CatalogViewHolder catalogViewHolder = tcaVar != null ? tcaVar.l : null;
            int i3 = a.$EnumSwitchMapping$0[uIBlockHint.B.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                view.getGlobalVisibleRect(rect2);
            } else {
                if (i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (catalogViewHolder == null || !catalogViewHolder.ze(rect2)) {
                    view.getGlobalVisibleRect(rect2);
                }
            }
            if (i == 0) {
                rect.set(rect2);
            }
            rect.set(rect.left, rect.top, rect2.right, rect2.bottom);
            i = i2;
        }
        return rect;
    }

    public final List<d7a> m() {
        RecyclerView.Adapter adapter;
        UIBlock uIBlock;
        UIBlockHint uIBlockHint;
        View findViewByPosition;
        RecyclerView recyclerView = this.f;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return EmptyList.b;
        }
        RecyclerView recyclerView2 = this.f;
        if (recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null) {
            return EmptyList.b;
        }
        this.e.getClass();
        lca a2 = b4a.a(adapter);
        if (a2 == null) {
            return EmptyList.b;
        }
        int s = linearLayoutManager.s();
        int w = linearLayoutManager.w();
        ArrayList arrayList = new ArrayList();
        if (s <= w) {
            while (true) {
                if (s != -1 && s < ((ArrayList) a2.y0()).size() && (uIBlock = (UIBlock) ((ArrayList) a2.y0()).get(s)) != null && (uIBlockHint = uIBlock.j) != null && (findViewByPosition = linearLayoutManager.findViewByPosition(s)) != null) {
                    arrayList.add(new d7a(uIBlockHint, findViewByPosition));
                }
                if (s == w) {
                    break;
                }
                s++;
            }
        }
        return arrayList;
    }

    public final void n() {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.p = null;
        this.k.clear();
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = false;
        this.j.removeCallbacks(this.r);
        dcn dcnVar = this.g;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
    }

    public final void o() {
        RecyclerView.o layoutManager;
        boolean z = false;
        this.m = false;
        this.l = false;
        if (this.n) {
            return;
        }
        sk3<a7a> sk3Var = this.k;
        if (sk3Var.isEmpty()) {
            q();
            return;
        }
        RecyclerView recyclerView = this.f;
        if (recyclerView != null && recyclerView.getScrollState() == 0) {
            z = true;
        }
        if (this.g != null || !z) {
            this.m = true;
            return;
        }
        this.c.b(o4v.a, true);
        a7a first = sk3Var.first();
        RecyclerView recyclerView2 = this.f;
        if (recyclerView2 == null || recyclerView2.computeVerticalScrollOffset() >= recyclerView2.computeVerticalScrollRange() - recyclerView2.getHeight()) {
            p();
            return;
        }
        int i = first.b;
        RecyclerView recyclerView3 = this.f;
        if (recyclerView3 == null || (layoutManager = recyclerView3.getLayoutManager()) == null) {
            return;
        }
        this.l = true;
        bak0 bak0Var = new bak0(recyclerView3.getContext());
        bak0Var.setTargetPosition(i);
        layoutManager.startSmoothScroll(bak0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (this.l) {
                return;
            }
            n();
            return;
        }
        this.n = false;
        boolean z = this.l;
        Handler handler = this.j;
        if (z) {
            handler.postDelayed(new o63(this, 10), 300L);
        } else if (this.m) {
            handler.postDelayed(new ds4(this, 5), 300L);
        } else {
            q();
        }
    }

    public final void p() {
        RecyclerView recyclerView;
        Context context;
        if (this.n) {
            return;
        }
        sk3<a7a> sk3Var = this.k;
        if (sk3Var.isEmpty() || (recyclerView = this.f) == null || (context = recyclerView.getContext()) == null) {
            return;
        }
        UIBlockHint uIBlockHint = sk3Var.remove(0).a;
        List<d7a> m = m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            if (epx.f(((d7a) obj).a.y, uIBlockHint.y) && this.b.a(uIBlockHint.y)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((d7a) it.next()).b);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.g = b7a.c(this.b, context, l(uIBlockHint, arrayList2), uIBlockHint, new p6y(this, 16), null, 16);
    }

    public final void q() {
        this.p = this.d.a().subscribe(new bqs(new af50(this, 6), 14));
    }
}
