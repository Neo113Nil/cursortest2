package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.stat.recycler.Measurement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import xsna.qi6;

/* compiled from: PostDisplayItemsAdapter.kt */
/* loaded from: classes4.dex */
public class b2c0 extends zoj0<u1c0, RecyclerView.e0> implements mf7, c.i {
    public final oet0 e;
    public gzs<jhv> f;
    public gzs<w5r0> g;
    public g530 h;
    public q530 i;
    public com.vk.stat.recycler.d j;
    public final Object k;
    public qi6.b l;
    public s980 m;
    public eg00 n;
    public final Runnable o;
    public final y1c0 p;
    public String q;

    public b2c0(Lazy<? extends g3f0> lazy, h170 h170Var) {
        this.e = fxc0.B().N();
        this.h = new vm9(this, 3);
        hv1 hv1Var = new hv1(this, 13);
        this.o = hv1Var;
        this.k = lazy;
        this.p = new y1c0(h170Var, lazy, hv1Var);
    }

    public static boolean K0(int i) {
        return i == 95 || i == 46 || i == 238 || i == 373 || i == 396;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public qi6 onCreateViewHolder(int i, ViewGroup viewGroup) {
        com.vk.stat.recycler.d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        qi6 a = this.p.a(i, viewGroup);
        eg00 eg00Var = this.n;
        if (eg00Var != null) {
            eg00Var.e(a);
        }
        com.vk.stat.recycler.d dVar2 = this.j;
        if (dVar2 != null) {
            dVar2.b(i, Measurement.Type.Create, (String) j4c0.a().get(Integer.valueOf(i)));
        }
        return a;
    }

    public final void N0(q530 q530Var) {
        g530 g530Var;
        if (q530Var != null && (g530Var = this.h) != null) {
            q530Var.d(g530Var);
        }
        this.i = q530Var;
        this.p.M = q530Var;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        if (i > 0 && i < getItemCount() - 1) {
            return 1;
        }
        u1c0 u1c0Var = (u1c0) this.c.c(i);
        if (u1c0Var != null) {
            return u1c0Var.d;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        u1c0 u1c0Var = (u1c0) this.c.c(i);
        if (u1c0Var != null) {
            return u1c0Var.c;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        u1c0 u1c0Var = (u1c0) ((ArrayList) y0()).get(i);
        int itemViewType = getItemViewType(i);
        if (e0Var instanceof qi6) {
            com.vk.stat.recycler.d dVar = this.j;
            if (dVar != null) {
                dVar.a();
            }
            qi6 qi6Var = (qi6) e0Var;
            qi6Var.O6(this.m);
            s980 s980Var = this.m;
            if (s980Var != null) {
                qi6Var.M6(s980Var);
            }
            qi6Var.A = this.l;
            p580 p580Var = ((e2c0) this.p.F.getValue()).a;
            qi6.b bVar = this.l;
            p580Var.b = bVar;
            boolean z = qi6Var instanceof g0o0;
            Runnable runnable = this.o;
            if (z) {
                ((g0o0) e0Var).G = runnable;
            } else if (qi6Var instanceof u5n0) {
                ((u5n0) e0Var).F = runnable;
            } else if (qi6Var instanceof wts) {
                ((wts) e0Var).C = runnable;
            } else if (qi6Var instanceof sdv) {
                sdv sdvVar = (sdv) e0Var;
                s980 s980Var2 = this.m;
                if (s980Var2 != null) {
                    sdvVar.N.l = s980Var2;
                } else {
                    sdvVar.getClass();
                }
            } else if (qi6Var instanceof tdv) {
                ((tdv) e0Var).F.setAttachmentClickListener(this.m);
            } else if (qi6Var instanceof uj) {
                ((uj) e0Var).E(this.q);
            } else if (qi6Var instanceof cui) {
                ((cui) e0Var).q5(this.m, bVar);
            } else if (qi6Var instanceof f8q) {
                ((f8q) e0Var).K0(new com.vk.movika.sdk.base.flow.binding.j(21, this, (qi6) e0Var));
            }
            eg00 eg00Var = this.n;
            if (eg00Var != null) {
                eg00Var.d(e0Var, u1c0Var);
            }
            qi6Var.a6(u1c0Var);
            com.vk.stat.recycler.d dVar2 = this.j;
            if (dVar2 != null) {
                dVar2.b(itemViewType, Measurement.Type.Bind, (String) j4c0.a().get(Integer.valueOf(itemViewType)));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        this.e.getClass();
        fxc0.B().N().getClass();
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        if (e0Var instanceof vif0) {
            ((vif0) e0Var).l6();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        if (e0Var instanceof vif0) {
            ((vif0) e0Var).m6();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        super.onViewRecycled(e0Var);
        eg00 eg00Var = this.n;
        if (eg00Var != null) {
            eg00Var.b(e0Var);
        }
    }

    public b2c0(ListDataSet<u1c0> listDataSet, Lazy<? extends g3f0> lazy) {
        super(listDataSet);
        this.e = fxc0.B().N();
        this.h = new vm9(this, 3);
        hv1 hv1Var = new hv1(this, 13);
        this.o = hv1Var;
        h170 h170Var = new h170();
        this.k = lazy;
        this.p = new y1c0(h170Var, lazy, hv1Var);
    }

    public /* synthetic */ b2c0() {
        this(new kll());
    }

    public b2c0(h3f0 h3f0Var) {
        this.e = fxc0.B().N();
        this.h = new vm9(this, 3);
        hv1 hv1Var = new hv1(this, 13);
        this.o = hv1Var;
        h170 h170Var = new h170();
        bpn0 bpn0Var = new bpn0(new n7w(h3f0Var, 23));
        this.k = bpn0Var;
        this.p = new y1c0(h170Var, bpn0Var, hv1Var);
    }

    public b2c0(ListDataSet<u1c0> listDataSet, g3f0 g3f0Var) {
        super(listDataSet);
        this.e = fxc0.B().N();
        this.h = new vm9(this, 3);
        hv1 hv1Var = new hv1(this, 13);
        this.o = hv1Var;
        h170 h170Var = new h170();
        bpn0 bpn0Var = new bpn0(new ye80(g3f0Var, 5));
        this.k = bpn0Var;
        this.p = new y1c0(h170Var, bpn0Var, hv1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<? extends Object> list) {
        if (!(e0Var instanceof s2n) && !(e0Var instanceof com.vk.newsfeed.common.recycler.holders.a) && !(e0Var instanceof f6s) && !(e0Var instanceof cui)) {
            onBindViewHolder(e0Var, i);
            return;
        }
        if (e0Var instanceof qi6) {
            com.vk.stat.recycler.d dVar = this.j;
            if (dVar != null) {
                dVar.a();
            }
            qi6 qi6Var = (qi6) e0Var;
            qi6Var.O6(this.m);
            s980 s980Var = this.m;
            if (s980Var != null) {
                qi6Var.M6(s980Var);
            }
            qi6Var.A = this.l;
            u1c0 u1c0Var = (u1c0) ((ArrayList) y0()).get(i);
            if (e0Var instanceof cui) {
                ((cui) e0Var).q5(this.m, this.l);
            }
            eg00 eg00Var = this.n;
            if (eg00Var != null) {
                eg00Var.d(e0Var, u1c0Var);
            }
            qi6Var.b6(u1c0Var, list);
            com.vk.stat.recycler.d dVar2 = this.j;
            if (dVar2 != null) {
                dVar2.b(qi6Var.getItemViewType(), Measurement.Type.Bind, (String) j4c0.a().get(Integer.valueOf(qi6Var.getItemViewType())));
            }
        }
    }
}
