package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.FastScroller;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import ru.ok.proto.PublisherConfiguration;
import xsna.saj;

/* compiled from: ContactsVc.kt */
/* loaded from: classes2.dex */
public class wej {
    public final a a;
    public final b25 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Object g = new Object();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final saj i;
    public final RecyclerView.n j;
    public RecyclerView k;
    public FastScroller l;
    public TextView m;
    public View n;

    /* compiled from: ContactsVc.kt */
    public final class b extends GridLayoutManager.c {
        public final int d;
        public List<Integer> e = EmptyList.b;

        public b(int i) {
            this.d = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            Integer num;
            int i2 = this.d;
            if (i2 == 1) {
                return 1;
            }
            if (this.e.isEmpty()) {
                return i2;
            }
            wej wejVar = wej.this;
            wejVar.i.d.get(i);
            if (i == wejVar.i.getItemCount() - 1) {
                return 1;
            }
            int i3 = i + 1;
            if (!this.e.contains(Integer.valueOf(i3))) {
                return 1;
            }
            List<Integer> list = this.e;
            ListIterator<Integer> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    num = null;
                    break;
                }
                num = listIterator.previous();
                if (num.intValue() < i3) {
                    break;
                }
            }
            Integer num2 = num;
            return i2 - ((i - (num2 != null ? num2.intValue() : 0)) % i2);
        }
    }

    /* compiled from: ContactsVc.kt */
    public final class c extends RecyclerView.t {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            wej wejVar = wej.this;
            a aVar = wejVar.a;
            RecyclerView recyclerView2 = wejVar.k;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            aVar.a(!recyclerView2.canScrollVertically(-1));
        }
    }

    /* compiled from: ContactsVc.kt */
    public final class d extends vc80 {
        public d() {
        }

        @Override // xsna.vc80
        public final void l(int i, int i2, int i3) {
            wej wejVar = wej.this;
            a aVar = wejVar.a;
            List<? extends hfz> list = wejVar.i.d;
            aVar.p(list.subList(i, Math.min(i2 + 1, list.size())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [xsna.kku, xsna.vd] */
    public wej(LayoutInflater layoutInflater, a aVar, b25 b25Var, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        wd wdVar;
        this.a = aVar;
        this.b = b25Var;
        this.c = z;
        this.d = z4;
        this.e = z5;
        this.f = z7;
        saj sajVar = new saj(layoutInflater, new RecyclerView.u(), aVar, z5, z6);
        sajVar.setHasStableIds(true);
        this.i = sajVar;
        if (z3 && (o25.b(b25Var) || o25.b(b25Var))) {
            wd y5pVar = new y5p(layoutInflater.getContext(), false, 0, new com.vk.movika.sdk.android.defaultplayer.layout.a(layoutInflater.getContext()));
            y5pVar.p = str;
            wdVar = y5pVar;
        } else {
            ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                Context context = layoutInflater.getContext();
                com.vk.movika.sdk.android.defaultplayer.layout.a aVar2 = new com.vk.movika.sdk.android.defaultplayer.layout.a(layoutInflater.getContext());
                ?? bbjVar = new bbj(context);
                bbjVar.h = aVar2;
                bbjVar.i = EmptyList.b;
                bbjVar.j = SortOrder.BY_ONLINE;
                bbjVar.k = str;
                wdVar = bbjVar;
            } else {
                Context context2 = layoutInflater.getContext();
                wd kbjVar = new kbj(context2, z2, e3m.a(R.dimen.toolbar_separator_height, context2), new com.vk.movika.sdk.android.defaultplayer.layout.a(layoutInflater.getContext()));
                kbjVar.p = str;
                wdVar = kbjVar;
            }
        }
        this.j = wdVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.recyclerview.widget.RecyclerView$n, xsna.vaj] */
    public final GridLayoutManager a(Context context) {
        int i = iah0.z(context) > iah0.a((float) PublisherConfiguration.DEFAULT_MAX_RES) ? 2 : 1;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
        b bVar = new b(i);
        bVar.e = j5g.C0(zik0.d(this.j.b()));
        gridLayoutManager.x = bVar;
        return gridLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.recyclerview.widget.RecyclerView$n, xsna.vaj] */
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_contacts, viewGroup, false);
        this.n = inflate.findViewById(R.id.progress);
        this.k = (RecyclerView) inflate.findViewById(R.id.vkim_recycler_view);
        this.l = (FastScroller) inflate.findViewById(R.id.vkim_fast_scroller);
        this.m = (TextView) inflate.findViewById(R.id.vkim_fast_scroll_preview);
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(this.i);
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(a(inflate.getContext()));
        RecyclerView recyclerView3 = this.k;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator(null);
        if (this.c && !this.d) {
            RecyclerView recyclerView4 = this.k;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            recyclerView4.addItemDecoration(this.j.a());
        }
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        if (!com.vk.toggle.b.A.a(imFeatures)) {
            RecyclerView recyclerView5 = this.k;
            if (recyclerView5 == null) {
                recyclerView5 = null;
            }
            float f = 8;
            recyclerView5.addItemDecoration(new ujq(iah0.a(f), iah0.a(f), 5));
        }
        if (this.f) {
            RecyclerView recyclerView6 = this.k;
            if (recyclerView6 == null) {
                recyclerView6 = null;
            }
            recyclerView6.addItemDecoration(new ujq(iah0.a(16), 0, 13));
        }
        RecyclerView recyclerView7 = this.k;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        recyclerView7.addOnScrollListener(new d());
        if (this.e) {
            RecyclerView recyclerView8 = this.k;
            if (recyclerView8 == null) {
                recyclerView8 = null;
            }
            recyclerView8.addOnScrollListener(new c());
        }
        FastScroller fastScroller = this.l;
        if (fastScroller == null) {
            fastScroller = null;
        }
        RecyclerView recyclerView9 = this.k;
        if (recyclerView9 == null) {
            recyclerView9 = null;
        }
        TextView textView = this.m;
        TextView textView2 = textView != null ? textView : null;
        fastScroller.g = recyclerView9;
        fastScroller.h = textView2;
        textView2.setVisibility(8);
        recyclerView9.addOnScrollListener(fastScroller.k);
        e(inflate.getContext().getResources().getConfiguration());
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.recyclerview.widget.RecyclerView$n, xsna.vaj] */
    public void c(List<? extends hfz> list, SortOrder sortOrder, m.d dVar) {
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        saj sajVar = this.i;
        sajVar.setItems(list);
        ?? r4 = this.j;
        r4.i(list, sortOrder);
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        RecyclerView.o layoutManager2 = recyclerView2.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
        GridLayoutManager.c cVar = gridLayoutManager != null ? gridLayoutManager.x : null;
        b bVar = cVar instanceof b ? (b) cVar : null;
        if (bVar != null) {
            bVar.e = j5g.C0(zik0.d(r4.b()));
        }
        if (dVar != null) {
            dVar.b(sajVar);
        } else {
            RecyclerView recyclerView3 = this.k;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            wjf0.d(recyclerView3);
        }
        RecyclerView.o layoutManager3 = recyclerView.getLayoutManager();
        if (layoutManager3 != null) {
            layoutManager3.onRestoreInstanceState(onSaveInstanceState);
        }
        this.h.removeCallbacksAndMessages(this.g);
        FastScroller fastScroller = this.l;
        FastScroller fastScroller2 = fastScroller != null ? fastScroller : null;
        if (fastScroller == null) {
            fastScroller = null;
        }
        fastScroller.getContext();
        bwt0.p0(fastScroller2, (sortOrder == SortOrder.BY_NAME || sortOrder == SortOrder.BY_CONTACT_NAME) && list.size() > 20);
        RecyclerView recyclerView4 = this.k;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        FastScroller fastScroller3 = this.l;
        if (fastScroller3 == null) {
            fastScroller3 = null;
        }
        f4m.w(bwt0.K(fastScroller3) ? iah0.a(8) : 0, recyclerView4);
        View view = this.n;
        if (view == null) {
            view = null;
        }
        d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        View view2 = this.n;
        f4m.j(view2 != null ? view2 : null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void d() {
        View view = this.n;
        if (view == null) {
            view = null;
        }
        if (bwt0.K(view)) {
            return;
        }
        EmptyList emptyList = EmptyList.b;
        saj sajVar = this.i;
        sajVar.setItems(emptyList);
        sajVar.notifyDataSetChanged();
        Handler handler = this.h;
        Object obj = this.g;
        handler.removeCallbacksAndMessages(obj);
        handler.postAtTime(new o63(this, 3), obj, 300L);
    }

    public final void e(Configuration configuration) {
        int a2 = iah0.a(Math.max((configuration.screenWidthDp - 720) / 2, 0));
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        f4m.r(a2, recyclerView);
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        f4m.s(a2, recyclerView2);
        RecyclerView recyclerView3 = this.k;
        (recyclerView3 != null ? recyclerView3 : null).invalidateItemDecorations();
    }

    /* compiled from: ContactsVc.kt */
    public interface a extends saj.a {
        default void a(boolean z) {
        }

        default void p(List<? extends hfz> list) {
        }
    }
}
