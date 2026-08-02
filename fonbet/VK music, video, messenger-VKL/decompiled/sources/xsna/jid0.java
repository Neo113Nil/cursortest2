package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.holder.LoadingState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import xsna.jzo0;
import xsna.kjf0;

/* compiled from: ProductAdapter.kt */
/* loaded from: classes18.dex */
public final class jid0 extends kjf0 implements jjv0, g530 {
    public static final bpn0 i = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(29));
    public final a e;
    public final sdz f;
    public final frg g;
    public final bpn0 h;

    /* compiled from: ProductAdapter.kt */
    public static final class a {
        public final GoodFragment a;
        public final vig0 b;
        public final dg1 c;
        public final srf0 d;
        public final l7u e;
        public final i780 f;
        public final h780 g;
        public final m3a h;
        public final e4u i;
        public final w6e j;
        public final kdg0 k;
        public final jo3 l;
        public final sz00 m;
        public final a4u n;
        public final q530 o;
        public final g7s0 p;
        public final ImageViewer q;
        public final mzp0 r;
        public final yw90 s;
        public final a8u t;

        public a(GoodFragment goodFragment, vig0 vig0Var, dg1 dg1Var, srf0 srf0Var, l7u l7uVar, i780 i780Var, h780 h780Var, m3a m3aVar, e4u e4uVar, w6e w6eVar, kdg0 kdg0Var, jo3 jo3Var, sz00 sz00Var, a4u a4uVar, irc0 irc0Var, boolean z, q530 q530Var, g7s0 g7s0Var, ImageViewer imageViewer, mzp0 mzp0Var, yw90 yw90Var, a8u a8uVar) {
            this.a = goodFragment;
            this.b = vig0Var;
            this.c = dg1Var;
            this.d = srf0Var;
            this.e = l7uVar;
            this.f = i780Var;
            this.g = h780Var;
            this.h = m3aVar;
            this.i = e4uVar;
            this.j = w6eVar;
            this.k = kdg0Var;
            this.l = jo3Var;
            this.m = sz00Var;
            this.n = a4uVar;
            this.o = q530Var;
            this.p = g7s0Var;
            this.q = imageViewer;
            this.r = mzp0Var;
            this.s = yw90Var;
            this.t = a8uVar;
        }
    }

    public jid0() {
        throw null;
    }

    public jid0(a aVar, sdz sdzVar, frg frgVar) {
        this.e = aVar;
        this.f = sdzVar;
        this.g = frgVar;
        this.h = new bpn0(new i13(23));
        aVar.o.d(this);
    }

    public final void A0(kjf0.a aVar) {
        Iterator<kjf0.a> it = this.c.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().a == aVar.a) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            this.c.set(intValue, aVar);
            notifyItemChanged(intValue, aVar);
        }
    }

    @Override // xsna.g530
    public final void H2() {
        int i2 = 0;
        for (Object obj : this.c) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            int i4 = ((kjf0.a) obj).a;
            if (i4 == 24 || i4 == 15) {
                notifyItemChanged(i2);
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ce, code lost:
    
        if (r3 != 13) goto L93;
     */
    @Override // xsna.jjv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n1(int i2) {
        ListBuilder.a aVar;
        if (i2 >= 0 && i2 < this.c.size()) {
            int itemViewType = getItemViewType(i2);
            int itemViewType2 = i2 > 0 ? getItemViewType(i2 - 1) : -1;
            int itemViewType3 = this.c.size() - 1 > i2 ? getItemViewType(i2 + 1) : -1;
            bpn0 bpn0Var = a5u.d;
            int size = this.c.size();
            if (i2 >= 0 && i2 < size) {
                if (i2 == 0 || itemViewType == 0) {
                    return 5;
                }
                List<Integer> list = a5u.e;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).intValue() == itemViewType) {
                            return 3;
                        }
                    }
                }
                ListBuilder listBuilder = a5u.f;
                if (listBuilder == null || !listBuilder.isEmpty()) {
                    ListIterator listIterator = listBuilder.listIterator(0);
                    do {
                        aVar = (ListBuilder.a) listIterator;
                        if (aVar.hasNext()) {
                        }
                    } while (((Number) aVar.next()).intValue() != itemViewType);
                    return 2;
                }
                if (itemViewType2 != 16) {
                    List<Integer> list2 = a5u.g;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((Number) it2.next()).intValue() == itemViewType) {
                            }
                        }
                    }
                    List<Integer> list3 = a5u.g;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (((Number) it3.next()).intValue() == itemViewType) {
                                if (itemViewType2 == 13) {
                                    return 2;
                                }
                            }
                        }
                    }
                    bpn0 bpn0Var2 = i;
                    if (((Set) bpn0Var2.getValue()).contains(Integer.valueOf(itemViewType2)) || !((Set) bpn0Var2.getValue()).contains(Integer.valueOf(itemViewType))) {
                        if (!((Set) bpn0Var2.getValue()).contains(Integer.valueOf(itemViewType2)) || !((Set) bpn0Var2.getValue()).contains(Integer.valueOf(itemViewType))) {
                            if (itemViewType == 23) {
                                return 4;
                            }
                            if (itemViewType == 18) {
                                if (itemViewType2 != 23 || itemViewType3 > 0) {
                                    if (itemViewType2 != 15 && itemViewType2 != 29) {
                                        return 2;
                                    }
                                }
                            }
                        }
                    } else if (((Boolean) a5u.d.getValue()).booleanValue()) {
                    }
                } else if (!((Boolean) a5u.d.getValue()).booleanValue()) {
                    return 2;
                }
                return 1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        sdz sdzVar = this.f;
        frg frgVar = this.g;
        a aVar = this.e;
        switch (i2) {
            case 0:
                return new dld0(viewGroup, frgVar);
            case 1:
                return new old0(viewGroup, aVar.r, aVar.s, frgVar);
            case 2:
                return new i4u(viewGroup.getContext(), sdzVar);
            case 3:
                return new g4u(viewGroup.getContext(), sdzVar);
            case 4:
                return new tl3(viewGroup);
            case 5:
                return new gid0(viewGroup);
            case 6:
            case 8:
            case 19:
            case 31:
            case 32:
            default:
                throw new IllegalArgumentException(lhg.a(i2, "Unknown viewType="));
            case 7:
                int i3 = jzo0.o;
                return jzo0.a.a(viewGroup);
            case 9:
                return new kw5(viewGroup);
            case 10:
                return ((Boolean) this.h.getValue()).booleanValue() ? new rrd0(viewGroup, aVar.a) : new nrd0(viewGroup, aVar.a);
            case 11:
                return new mrd0(viewGroup, aVar.a);
            case 12:
                return new ord0(viewGroup, aVar.a);
            case 13:
                return new m8u(viewGroup);
            case 14:
                return new ljd0(viewGroup);
            case 15:
                return new c090(aVar.l, aVar.o, viewGroup, 0, aVar.m);
            case 16:
                return new xfl0(viewGroup);
            case 17:
                return new s3u(viewGroup, aVar.h);
            case 18:
                return new l8u(viewGroup);
            case 20:
                return new i5u(viewGroup, new q010(this, 19));
            case 21:
                return new q7u(viewGroup, aVar.d, sdzVar);
            case 22:
                return new bkd0(viewGroup, frgVar, aVar.e);
            case 23:
                return new jkd0(viewGroup, frgVar);
            case 24:
                return new c090(aVar.l, aVar.o, viewGroup, iah0.a(-1), aVar.m);
            case 25:
                return new g8u(viewGroup, aVar.f, aVar.g, aVar.t, new g880(this, 12), true);
            case 26:
                return new nww(viewGroup);
            case 27:
                return new v3u(viewGroup);
            case 28:
                return new n7u(viewGroup, aVar.e);
            case 29:
                return new z010(viewGroup, aVar.i, true, aVar.n);
            case 30:
                return new f8u(viewGroup, aVar.i, aVar.f, aVar.g, aVar.n, aVar.t, new cr20(this, 27));
            case 33:
                return new d4u(viewGroup);
            case 34:
                return new ic10(viewGroup, aVar.j, aVar.k, aVar.p);
            case 35:
                return new qrd0(viewGroup, aVar.a);
        }
    }

    @Override // xsna.jjv0
    public final int t(int i2) {
        return 0;
    }

    @Override // xsna.kjf0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: y0 */
    public final void onBindViewHolder(int i2, vif0 vif0Var) {
        if ((vif0Var instanceof v3u) && this.c.size() - 1 > i2 && getItemViewType(i2 + 1) != 27) {
            ((v3u) vif0Var).o = iah0.a(8);
        }
        super.onBindViewHolder(i2, vif0Var);
    }

    public final void z0(LoadingState loadingState) {
        Iterator<kjf0.a> it = this.c.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().a == 20) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            this.c.remove(i2);
            notifyItemRemoved(i2);
        }
        if (this.c.size() <= 0 || loadingState == LoadingState.IDLE) {
            return;
        }
        this.c.add(new kjf0.a(20, loadingState, 0));
        notifyItemInserted(this.c.size() - 1);
    }

    @Override // xsna.g530
    public final void g3() {
    }
}
