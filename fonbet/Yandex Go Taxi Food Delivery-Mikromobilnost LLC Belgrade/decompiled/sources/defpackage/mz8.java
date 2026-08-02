package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.go.analytics.b;
import defpackage.ey8;
import defpackage.jl40;
import defpackage.mz8;
import defpackage.qke;
import defpackage.uhj0;
import defpackage.ux8;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.summary.requirements.list.carousel.recycler.a;
import ru.yandex.taxi.widget.recycler.PreCachingLayoutManager;

/* loaded from: classes6.dex */
public final class mz8 extends lys implements ig2 {
    public static final /* synthetic */ int V = 0;
    public final pm5 S;
    public uhj0 T;
    public final qw8 U;

    public mz8(knj0 knj0Var, final tls tlsVar, a aVar, pm5 pm5Var) {
        super(knj0Var);
        this.S = pm5Var;
        qw8 a = aVar.a(new tls() { // from class: ru.yandex.taxi.summary.requirements.list.recycler.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ux8 ux8Var = (ux8) obj;
                mz8 mz8Var = mz8.this;
                int i = 0;
                qke.E(mz8Var.a.getContext(), HapticController$Effect.TICK, false, 8);
                uhj0 uhj0Var = mz8Var.T;
                int i2 = -1;
                if (uhj0Var != null) {
                    Iterator it = uhj0Var.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (jl40.l(((ux8) it.next()).getId(), ux8Var.getId())) {
                            break;
                        }
                        i++;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (i == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i2 = valueOf.intValue();
                    }
                }
                ((RequirementItemsExternalDelegate$createItemTypes$2) tlsVar).invoke(new ey8(ux8Var, i2));
                return zy11.a;
            }
        });
        this.U = a;
        RecyclerView c0 = c0();
        PreCachingLayoutManager preCachingLayoutManager = new PreCachingLayoutManager(c0().getContext());
        preCachingLayoutManager.b0 = 1000;
        c0.setLayoutManager(preCachingLayoutManager);
        c0.setHasFixedSize(false);
        c0.setAdapter(a);
        c0.addItemDecoration(new bgh(0, tje.u(4, c0.getContext()), 0));
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
        this.U.submitList(list, new kz8(0, this, !jl40.l(uhj0Var2 != null ? uhj0Var2.a : null, uhj0Var.a), !(uhj0Var2 != null && uhj0Var2.c.size() == list.size())));
    }

    public final RecyclerView c0() {
        return ((knj0) ((zo31) this.R)).a;
    }

    @Override // defpackage.ig2
    public final void o() {
        c0().setItemAnimator(null);
    }
}
