package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.jsm;
import xsna.o5w;
import xsna.qgh0;

/* compiled from: ImItemListViewController.kt */
/* loaded from: classes2.dex */
public final class p7w {
    public final ImItemListFragment a;
    public final r5w b;
    public final jsm.a c;
    public final ImItemListFragment.f d;
    public final Context e;
    public final bpn0 f = new bpn0(new p5h(this, 27));
    public final View g;
    public final a h;
    public final xmm i;
    public final com.vk.im.engine.models.c j;
    public final ImConfigurationComponent k;
    public final o5w l;
    public final m7w m;
    public final oub n;
    public final Object o;
    public final Object p;
    public final j7w q;

    /* compiled from: ImItemListViewController.kt */
    public static final class a {
        public final RecyclerView a;

        public a(View view) {
            this.a = (RecyclerView) view.findViewById(R.id.im_item_list);
        }
    }

    public p7w(ImItemListFragment imItemListFragment, r5w r5wVar, jsm.a aVar, ImItemListFragment.f fVar) {
        this.a = imItemListFragment;
        this.b = r5wVar;
        this.c = aVar;
        this.d = fVar;
        this.e = imItemListFragment.requireContext();
        View requireView = imItemListFragment.requireView();
        this.g = requireView;
        a aVar2 = new a(requireView);
        this.h = aVar2;
        xmm xmmVar = new xmm(fVar);
        this.i = xmmVar;
        com.vk.im.engine.models.c experiments = ((ImExperimentsComponent) m7m.d(imItemListFragment).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
        this.j = experiments;
        this.k = (ImConfigurationComponent) m7m.d(imItemListFragment).a(fpf0.a(ImConfigurationComponent.class));
        int i = 28;
        q5f q5fVar = new q5f(this, i);
        heb hebVar = new heb(fVar);
        o5w o5wVar = new o5w(new o5w.a());
        o5wVar.x0(s990.class, new z13(24));
        o5wVar.y0(new k0b(hebVar));
        o5wVar.y0(new cgm(xmmVar));
        o5wVar.x0(em20.class, new z8f(xmmVar, 20));
        o5wVar.x0(kvw.class, new f1j(xmmVar, 19));
        int i2 = 15;
        o5wVar.x0(xls.class, new g1j(xmmVar, i2));
        o5wVar.y0(new xrn());
        this.l = o5wVar;
        this.n = new oub(imItemListFragment, experiments, q5fVar, new y5(this, 4));
        t2l t2lVar = new t2l(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, t2lVar);
        this.p = msy.a(lazyThreadSafetyMode, new yce(this, 26));
        j7w j7wVar = new j7w();
        this.q = j7wVar;
        qgh0.a aVar3 = new qgh0.a();
        RecyclerView recyclerView = aVar2.a;
        qj0.a(o5wVar, recyclerView, aVar3);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(o5wVar);
        recyclerView.addOnScrollListener(new upz(r5wVar.b, new n7w(this, 0)));
        recyclerView.setHasFixedSize(true);
        recyclerView.setOverScrollMode(2);
        ow90 ow90Var = ow90.a;
        ow90.c(ScrollScreenType.DIALOGS, recyclerView);
        this.m = new m7w(recyclerView, new jpf(this, 29));
        f5z viewLifecycleOwner = imItemListFragment.getViewLifecycleOwner();
        recyclerView.addOnScrollListener(new i7w(j7wVar, recyclerView, (o5w) recyclerView.getAdapter()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0.a.getClass();
        int i3 = 23;
        hg1.a(new io.reactivex.rxjava3.internal.operators.observable.i0(j7wVar.a.d(2000L, timeUnit, asu0.i(), Integer.MAX_VALUE, new h7w()), new pj4(new rd1(25), 25)).subscribe(new qz(new sop(fVar, i2), i3), new bf2(new af2(i), i3)), viewLifecycleOwner);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final bzb0 a() {
        return (bzb0) this.p.getValue();
    }

    public final void b() {
        r5w r5wVar = this.b;
        if (r5wVar.c.g()) {
            a aVar = this.h;
            RecyclerView.o layoutManager = aVar.a.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int v = linearLayoutManager.v();
            int x = linearLayoutManager.x();
            if (v == -1 && x == -1) {
                aVar.a.post(new po4(this, 2));
            } else {
                o5w o5wVar = this.l;
                r5wVar.c.d((j5g.b0(v, o5wVar.h.f) instanceof s990) || (j5g.b0(x, o5wVar.h.f) instanceof s990));
            }
        }
    }
}
