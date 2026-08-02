package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.dialogs.DialogSkeletonView;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import xsna.ofe0;
import xsna.qgh0;
import xsna.vtm;
import xsna.vtm.b;
import xsna.vtm.c;
import xsna.vtm.e;
import xsna.vtm.f;
import xsna.vtm.g;

/* compiled from: BaseViewController.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class ur6 {
    public boolean a;
    public boolean b;
    public boolean c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be called from a UI-thread");
        }
    }

    public final void b() {
        if (this.b) {
            throw new IllegalStateException("ViewController is destroyed");
        }
    }

    @NonNull
    public final void c(@NonNull ViewStub viewStub) {
        Iterable<pfe0> iterable;
        RecyclerView.e0 childViewHolder;
        a();
        b();
        if (this.a) {
            throw new IllegalStateException("ViewController is already initialized/created");
        }
        vtm vtmVar = (vtm) this;
        vtmVar.d = viewStub.getContext();
        vtmVar.e = vtmVar.new g();
        vtmVar.G = new bzb0(vtmVar.d);
        viewStub.setLayoutResource(R.layout.vkim_dialogs_list);
        View inflate = viewStub.inflate();
        vtmVar.m = inflate;
        vtmVar.l = (DialogSkeletonView) inflate.findViewById(R.id.dialog_skeleton_view);
        RecyclerView recyclerView = (RecyclerView) vtmVar.m.findViewById(R.id.dialogs_list);
        vtmVar.n = recyclerView;
        vtmVar.M = new wtm(recyclerView, vtmVar.k);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        vtmVar.q = linearLayoutManager;
        linearLayoutManager.l = true;
        bsm bsmVar = new bsm(vtmVar.p, vtmVar.H);
        vtmVar.r = bsmVar;
        bsmVar.submitList(vtmVar.D.a);
        bsm bsmVar2 = vtmVar.r;
        bsmVar2.p = new lj0(vtmVar);
        qj0.a(bsmVar2, vtmVar.n, new qgh0.a());
        vtmVar.s = vtmVar.new f(vtmVar.r);
        vtmVar.t = vtmVar.new e(ViewConfiguration.get(vtmVar.d).getScaledTouchSlop());
        vtmVar.J = new jim(vtmVar.d, vtmVar.n, vtmVar.new c());
        vtmVar.n.setLayoutManager(vtmVar.q);
        vtmVar.n.setHasFixedSize(true);
        vtmVar.n.setRecycledViewPool(vtmVar.o);
        if (vtmVar.E) {
            vtmVar.n.addItemDecoration(new loa0(vtmVar.r));
        }
        trn trnVar = new trn();
        float f = 16;
        float f2 = 8;
        vtmVar.n.addItemDecoration(new ddv(R.attr.vk_legacy_separator_common, Math.max(iah0.a(0.5f), 1), iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2), new avx(vtmVar.r), trnVar));
        RecyclerView recyclerView2 = vtmVar.n;
        recyclerView2.addOnItemTouchListener(vtmVar.new b(recyclerView2));
        vtmVar.n.setItemAnimator(null);
        vtmVar.n.setAdapter(vtmVar.r);
        ow90 ow90Var = ow90.a;
        ow90.c(ScrollScreenType.DIALOGS, vtmVar.n);
        WeakHashMap weakHashMap = new WeakHashMap();
        RecyclerView recyclerView3 = vtmVar.n;
        ofe0 ofe0Var = vtmVar.u;
        ofe0Var.g = recyclerView3;
        ofe0Var.h = (LinearLayoutManager) recyclerView3.getLayoutManager();
        RecyclerView.Adapter<?> adapter = recyclerView3.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver((ofe0.c) ofe0Var.d.getValue());
        } else {
            adapter = null;
        }
        ofe0Var.i = adapter;
        recyclerView3.addOnChildAttachStateChangeListener((ofe0.a) ofe0Var.c.getValue());
        recyclerView3.addOnItemTouchListener((ofe0.f) ofe0Var.b.getValue());
        LinearLayoutManager linearLayoutManager2 = ofe0Var.h;
        if (linearLayoutManager2 == null) {
            iterable = EmptyList.b;
        } else {
            RecyclerView recyclerView4 = ofe0Var.g;
            if (recyclerView4 == null) {
                iterable = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
                int childCount = linearLayoutManager2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View findViewByPosition = linearLayoutManager2.findViewByPosition(i);
                    if (findViewByPosition != null && (childViewHolder = recyclerView4.getChildViewHolder(findViewByPosition)) != null && (childViewHolder instanceof pfe0)) {
                        arrayList.add(childViewHolder);
                    }
                }
                iterable = arrayList;
            }
        }
        for (pfe0 pfe0Var : iterable) {
            ofe0Var.n.put(pfe0Var, pfe0Var.u());
        }
        ofe0Var.d();
        vtm.d dVar = new vtm.d();
        dVar.b = null;
        dVar.c = null;
        ofe0Var.f = new ttm(vtmVar, weakHashMap, trnVar, dVar);
        View view = vtmVar.m;
        vtm.h hVar = vtmVar.v;
        vtmVar.w = new igp(view, hVar);
        vtmVar.x = new hgp(view, hVar);
        View view2 = vtmVar.m;
        vtmVar.y = new bhp(R.id.dialogs_empty_requests, view2);
        vtmVar.z = new ffp(view2, hVar);
        vtmVar.A = new pep(R.id.dialogs_empty_archive, view2);
        vtmVar.B = new hhp(view2, hVar);
        vtmVar.D = qsm.i;
        vtmVar.C = 1;
        vtmVar.h("Show progress");
        Context context = vtmVar.d;
        vtm.g gVar = vtmVar.e;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        context.registerReceiver(gVar, intentFilter);
        vtmVar.i(new ao(13), new i22(vtmVar, 18));
        vtmVar.i(new sr(10), new f40(vtmVar, 17));
        vtmVar.m.setOnTouchListener(new tr6());
        this.a = true;
    }

    public final void d() {
        a();
        b();
        if (!this.a) {
            throw new IllegalStateException("ViewController is not initialized/created");
        }
        e();
        this.a = false;
        this.b = true;
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
