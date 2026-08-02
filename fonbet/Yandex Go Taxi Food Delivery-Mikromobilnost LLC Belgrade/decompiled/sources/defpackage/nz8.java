package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.go.analytics.b;
import java.util.List;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.summary.requirements.list.carousel.recycler.a;
import ru.yandex.taxi.widget.recycler.PreCachingLayoutManager;

/* loaded from: classes6.dex */
public final class nz8 extends lys implements ig2 {
    public static final /* synthetic */ int V = 0;
    public final pm5 S;
    public uhj0 T;
    public final qw8 U;

    public nz8(knj0 knj0Var, tls tlsVar, a aVar, pm5 pm5Var) {
        super(knj0Var);
        this.S = pm5Var;
        qw8 a = aVar.a(new cs8(4, this, tlsVar));
        this.U = a;
        RecyclerView c0 = c0();
        PreCachingLayoutManager preCachingLayoutManager = new PreCachingLayoutManager(c0().getContext());
        preCachingLayoutManager.b0 = 1000;
        c0.setLayoutManager(preCachingLayoutManager);
        c0.setHasFixedSize(false);
        c0.setAdapter(a);
        c0.addItemDecoration(new bgh(0, c.h(4, this.a), 0));
    }

    @Override // defpackage.wys
    public final void Y() {
        this.U.submitList(null, null);
        super.Y();
    }

    @Override // defpackage.ig2
    public final void a() {
        c0().setItemAnimator(new h());
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        uhj0 uhj0Var = (uhj0) obj;
        uhj0 uhj0Var2 = this.T;
        this.T = uhj0Var;
        List list = uhj0Var.c;
        int size = list.size();
        b bVar = (b) this.S.b;
        bVar.getClass();
        vug vugVar = new vug(bVar, "Requirements.Carousel.onItemsBind");
        vugVar.b(size, "itemsCount");
        vugVar.m();
        int i = 1;
        boolean z = !jl40.l(uhj0Var2 != null ? uhj0Var2.a : null, uhj0Var.a);
        boolean z2 = false;
        if (uhj0Var2 != null && uhj0Var2.c.size() == list.size()) {
            z2 = true;
        }
        this.U.submitList(list, new kz8(i, this, z, !z2));
    }

    public final RecyclerView c0() {
        return ((knj0) ((zo31) this.R)).a;
    }

    @Override // defpackage.ig2
    public final void o() {
        c0().setItemAnimator(null);
    }
}
