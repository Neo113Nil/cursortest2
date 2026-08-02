package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.qor;

/* compiled from: PostingAttachmentsAdapter.kt */
/* loaded from: classes4.dex */
public final class pcc0 extends zoj0<u1c0, RecyclerView.e0> {
    public final x64 e;
    public final gzs<mdc0> f;
    public final gzs<s3q0> g;
    public final ihk h;
    public final g6b i;
    public final izs<PostingAction, s3q0> j;
    public final pq10 k;
    public final cpc0 l;
    public final a2o m;
    public final val n;
    public Attachment o;
    public a1u0 p;
    public final jg8 q;
    public int r;
    public final ArrayList s;
    public final mcc0 t;
    public final y1c0 u;

    /* compiled from: PostingAttachmentsAdapter.kt */
    public static final class a implements qor.d {
        public a() {
        }

        @Override // xsna.qor.d
        public final void a(int i, int i2) {
            val valVar = pcc0.this.n;
            ArrayList arrayList = valVar.f;
            a4d0 a4d0Var = valVar.g;
            int q = a4d0Var != null ? a4d0Var.G.q() : 0;
            if (i >= q || i2 >= q) {
                return;
            }
            valVar.b.d(i, i2);
            Attachment attachment = (Attachment) j5g.b0(i, arrayList);
            if (attachment != null) {
                arrayList.remove(attachment);
                arrayList.add(i2, attachment);
            }
        }
    }

    public pcc0(x64 x64Var, gzs gzsVar, ybc0 ybc0Var, k7y k7yVar, ihk ihkVar, g6b g6bVar, izs izsVar, pq10 pq10Var, cpc0 cpc0Var, a2o a2oVar, a1u0 a1u0Var, int i) {
        k7yVar = (i & 8) != 0 ? null : k7yVar;
        pq10Var = (i & 128) != 0 ? new pq10(0) : pq10Var;
        cpc0Var = (i & 256) != 0 ? new cpc0() : cpc0Var;
        this.e = x64Var;
        this.f = gzsVar;
        this.g = k7yVar;
        this.h = ihkVar;
        this.i = g6bVar;
        this.j = izsVar;
        this.k = pq10Var;
        this.l = cpc0Var;
        this.m = a2oVar;
        this.n = new val(this, x64Var, ybc0Var, a2oVar);
        this.p = a1u0Var;
        this.q = new jg8(new hpt0());
        this.r = iah0.a(248);
        this.s = new ArrayList();
        this.t = new mcc0(this);
        this.u = new y1c0(cpc0Var, null, null, 6);
    }

    public final void K0(List<? extends Attachment> list) {
        val valVar = this.n;
        ybc0 ybc0Var = valVar.c;
        ArrayList arrayList = valVar.f;
        List<x04> c = ybc0Var.c(arrayList);
        List<x04> c2 = ybc0Var.c(j5g.u0(list, arrayList));
        valVar.i = c2;
        valVar.a(c2, c);
    }

    public final int L0() {
        ArrayList arrayList = this.n.f;
        int i = 0;
        if (arrayList != null && arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.i.f((Attachment) it.next()) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    public final void N0(Attachment attachment) {
        val valVar = this.n;
        ybc0 ybc0Var = valVar.c;
        ArrayList arrayList = valVar.f;
        a4d0 a4d0Var = valVar.g;
        if (a4d0Var != null) {
            a4d0Var.R6(attachment);
        }
        List<x04> c = ybc0Var.c(arrayList);
        arrayList.remove(attachment);
        valVar.a(ybc0Var.c(arrayList), c);
    }

    public final void O0(Attachment attachment, boolean z) {
        a4d0 a4d0Var;
        val valVar = this.n;
        int indexOf = valVar.f.indexOf(attachment);
        if (indexOf < 0 || (a4d0Var = valVar.g) == null) {
            this.o = attachment;
            return;
        }
        if (z) {
            if (a4d0Var != null) {
                a4d0Var.J.addOnLayoutChangeListener(new c4d0(a4d0Var, indexOf));
            }
        } else if (a4d0Var != null) {
            a4d0Var.T6(indexOf);
        }
    }

    public final void P0(vdc0 vdc0Var) {
        PostingPreviewRatio postingPreviewRatio = vdc0Var.a;
        jg8 jg8Var = this.q;
        jg8Var.getClass();
        float f = postingPreviewRatio.b / postingPreviewRatio.c;
        jg8Var.c = new CarouselRatio(f, f);
        a4d0 a4d0Var = this.n.g;
        if (a4d0Var != null) {
            a4d0Var.Q = vdc0Var;
        }
    }

    public final void Q0(int i) {
        this.r = i;
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            co10 co10Var = (co10) ((WeakReference) arrayList.get(size)).get();
            if (co10Var == null) {
                arrayList.remove(size);
            } else {
                co10Var.j3(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((u1c0) this.c.c(i)).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        List list;
        if (e0Var instanceof qi6) {
            u1c0 u1c0Var = (u1c0) this.c.c(i);
            qi6 qi6Var = (qi6) e0Var;
            qi6Var.a6(u1c0Var);
            if (qi6Var instanceof pyt) {
                ((pyt) e0Var).D1(false);
                return;
            }
            if (qi6Var instanceof blc0) {
                blc0 blc0Var = (blc0) e0Var;
                pq10 pq10Var = this.k;
                blc0Var.D1(pq10Var.a);
                blc0Var.p5();
                if (pq10Var.a) {
                    r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
                    Attachment attachment = r74Var != null ? r74Var.q : null;
                    if (attachment != null) {
                        list = Collections.singletonList(attachment);
                    } else {
                        w84 w84Var = u1c0Var instanceof w84 ? (w84) u1c0Var : null;
                        if (w84Var == null || (list = w84Var.q) == null) {
                            list = EmptyList.b;
                        }
                    }
                    Attachment attachment2 = (Attachment) j5g.a0(list);
                    if (attachment2 != null) {
                        blc0Var.j1(new xnb(1, this, attachment2));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.qi6] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        pyt pytVar;
        this.i.getClass();
        boolean contains = rl3.y0(new Integer[]{5, 50, 51, 59, 353, 11, Integer.valueOf(PsExtractor.PRIVATE_STREAM_1)}).contains(Integer.valueOf(i));
        ArrayList arrayList = this.s;
        if (contains) {
            val valVar = this.n;
            a4d0 a4d0Var = valVar.g;
            if (a4d0Var != null) {
                return a4d0Var;
            }
            a4d0 a4d0Var2 = new a4d0(viewGroup, this.e, new a(), valVar.f, this.f.invoke(), this.g, this.q, this.h, this.i, this.k, this.j, this.l, this.p);
            a4d0Var2.j3(this.r);
            arrayList.add(new WeakReference(a4d0Var2));
            valVar.g = a4d0Var2;
            return a4d0Var2;
        }
        if (i == 7) {
            pytVar = new pyt(viewGroup);
        } else {
            ?? a2 = this.u.a(i, viewGroup);
            boolean z = a2 instanceof co10;
            pytVar = a2;
            if (z) {
                arrayList.add(new WeakReference(a2));
                ((co10) a2).j3(this.r);
                pytVar = a2;
            }
        }
        if (pytVar instanceof blc0) {
            pyt pytVar2 = pytVar;
            pytVar2.Z1(this.e);
            pytVar2.p5();
        }
        if (pytVar instanceof v9d0) {
            v9d0 v9d0Var = (v9d0) pytVar;
            mcc0 mcc0Var = this.t;
            v9d0Var.y = mcc0Var;
            v9d0Var.D = mcc0Var;
        }
        return pytVar;
    }
}
