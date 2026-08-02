package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.im.engine.models.messages.Msg;
import com.vk.lists.DefaultErrorView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: ChannelMsgSearchVc.kt */
/* loaded from: classes16.dex */
public final class r5b {
    public final s5b a;
    public final Context b;
    public final LayoutInflater c;
    public final f5b d;
    public j5b e;
    public View f;
    public VkSearchView g;
    public RecyclerView h;
    public View i;
    public View j;
    public DefaultErrorView k;
    public final Handler l;
    public final Object m;
    public io.reactivex.rxjava3.disposables.c n;
    public boolean o;

    /* compiled from: ChannelMsgSearchVc.kt */
    public static final class a extends RecyclerView.t {
        public final s5b b;

        public a(s5b s5bVar) {
            this.b = s5bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && linearLayoutManager.getItemCount() - linearLayoutManager.x() < 5) {
                this.b.c();
            }
        }
    }

    public r5b(s5b s5bVar, Context context) {
        this.a = s5bVar;
        this.b = context;
        LayoutInflater from = LayoutInflater.from(context);
        this.c = from;
        this.d = new f5b(s5bVar, from);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new Object();
    }

    public final void a(p5b p5bVar) {
        this.l.removeCallbacksAndMessages(this.m);
        ArrayList<Msg> arrayList = p5bVar.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (Msg msg : arrayList) {
            CharSequence charSequence = (CharSequence) p5bVar.g.get(k9q0.n(msg));
            if (charSequence == null) {
                charSequence = "";
            }
            arrayList2.add(new n5b(msg, charSequence, p5bVar.f));
        }
        List<? extends hfz> singletonList = (arrayList2.isEmpty() && p5bVar.b.length() == 0 && !p5bVar.e) ? Collections.singletonList(k5b.b) : arrayList2;
        this.o = !arrayList2.isEmpty();
        this.d.setItems(singletonList);
        j5b j5bVar = this.e;
        if (j5bVar == null) {
            j5bVar = null;
        }
        Calendar calendar = j5bVar.m;
        ci30 ci30Var = j5bVar.n;
        SparseArray<CharSequence> sparseArray = new SparseArray<>();
        if (arrayList2.isEmpty()) {
            j5bVar.h = sparseArray;
        } else {
            sparseArray.put(0, ci30Var.a(((n5b) arrayList2.get(0)).b.g));
            int size = arrayList2.size() - 1;
            int i = 0;
            while (i < size) {
                Msg msg2 = ((n5b) arrayList2.get(i)).b;
                int i2 = i + 1;
                Msg msg3 = ((n5b) arrayList2.get(i2)).b;
                calendar.setTimeInMillis(msg2.g);
                Pair pair = new Pair(Integer.valueOf(calendar.get(6)), Integer.valueOf(calendar.get(1)));
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                calendar.setTimeInMillis(msg3.g);
                Pair pair2 = new Pair(Integer.valueOf(calendar.get(6)), Integer.valueOf(calendar.get(1)));
                int intValue3 = ((Number) pair2.d()).intValue();
                int intValue4 = ((Number) pair2.g()).intValue();
                if (intValue == intValue3 && intValue2 == intValue4) {
                    i = i2;
                } else {
                    i = i2;
                    sparseArray.put(i, ci30Var.a(msg3.g));
                }
            }
            j5bVar.h = sparseArray;
        }
        if (this.o) {
            b();
            return;
        }
        if (p5bVar.b.length() == 0) {
            b();
            return;
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(4);
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.stopScroll();
        View view = this.i;
        if (view == null) {
            view = null;
        }
        view.setVisibility(4);
        View view2 = this.j;
        if (view2 == null) {
            view2 = null;
        }
        if (f4m.g(view2)) {
            View view3 = this.j;
            d3m.c(view3 == null ? null : view3, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        View view4 = this.j;
        if (view4 == null) {
            view4 = null;
        }
        view4.setVisibility(0);
        DefaultErrorView defaultErrorView = this.k;
        (defaultErrorView == null ? null : defaultErrorView).setVisibility(4);
    }

    public final void b() {
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        View view = this.i;
        if (view == null) {
            view = null;
        }
        view.setVisibility(4);
        View view2 = this.j;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(4);
        DefaultErrorView defaultErrorView = this.k;
        (defaultErrorView != null ? defaultErrorView : null).setVisibility(4);
    }

    public final void c() {
        new ld(this, 17).invoke();
    }
}
