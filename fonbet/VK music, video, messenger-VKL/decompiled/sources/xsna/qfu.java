package xsna;

import android.util.ArraySet;
import android.util.SparseArray;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.commands.messages.MsgHistoryCreator;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.Order;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hfr;

/* compiled from: GridHoldersEngineDependencies.kt */
/* loaded from: classes7.dex */
public final class qfu {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ qfu(zzz zzzVar, cfn cfnVar, yen yenVar, rct0 rct0Var, wly wlyVar, k490 k490Var) {
        this.a = zzzVar;
        this.b = cfnVar;
        this.c = yenVar;
        this.d = rct0Var;
        this.e = wlyVar;
        this.f = k490Var;
    }

    public gj30 a(final Peer peer, final de deVar, final int i, Order order) {
        int size;
        boolean z;
        ij30 ij30Var = (ij30) ((xgl0) this.c).c(new izs() { // from class: xsna.mvz
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                qj30 c;
                qfu qfuVar = qfu.this;
                mf20 mf20Var = (mf20) qfuVar.a;
                Peer peer2 = peer;
                yj30 q = mf20Var.q(peer2);
                de deVar2 = deVar;
                boolean z2 = deVar2 instanceof wj30;
                int i2 = i;
                if (z2) {
                    wj30 wj30Var = (wj30) deVar2;
                    c = qfuVar.c(peer2, wj30Var.b, wj30Var.c, i2);
                } else {
                    boolean z3 = deVar2 instanceof tj30;
                    if (z3) {
                        ((tj30) deVar2).getClass();
                        throw null;
                    }
                    if (z3) {
                        ((tj30) deVar2).getClass();
                        throw null;
                    }
                    if (z3) {
                        ((tj30) deVar2).getClass();
                        c = qfuVar.b(peer2, null, i2);
                    } else {
                        boolean z4 = deVar2 instanceof vj30;
                        gkx0 gkx0Var = gkx0.e;
                        if (z4) {
                            vj30 vj30Var = (vj30) deVar2;
                            if (vj30Var.b == MsgIdType.LOCAL_ID) {
                                int i3 = vj30Var.c;
                                Direction direction = vj30Var.d;
                                gkx0 J = mf20Var.J(i3);
                                if (J != null) {
                                    gkx0Var = J;
                                }
                                c = qfuVar.c(peer2, gkx0Var, direction, i2);
                            }
                        }
                        if (z4) {
                            vj30 vj30Var2 = (vj30) deVar2;
                            if (vj30Var2.b == MsgIdType.CNV_ID) {
                                int i4 = vj30Var2.c;
                                Direction direction2 = vj30Var2.d;
                                lj30 y = mf20Var.y(i4, peer2);
                                gkx0 b = n140.b(i4, 0, false);
                                if (y != null) {
                                    b = y.h;
                                }
                                c = qfuVar.c(peer2, b, direction2, i2);
                            }
                        }
                        if (z4) {
                            throw new ImEngineException("Unsupported id type " + ((vj30) deVar2).b);
                        }
                        boolean z5 = deVar2 instanceof rj30;
                        if (z5) {
                            rj30 rj30Var = (rj30) deVar2;
                            if (rj30Var.b == MsgIdType.LOCAL_ID) {
                                gkx0 J2 = mf20Var.J(rj30Var.c);
                                if (J2 != null) {
                                    gkx0Var = J2;
                                }
                                c = qfuVar.b(peer2, gkx0Var, i2);
                            }
                        }
                        if (z5) {
                            rj30 rj30Var2 = (rj30) deVar2;
                            if (rj30Var2.b == MsgIdType.CNV_ID && rj30Var2.c == Integer.MAX_VALUE) {
                                c = qfuVar.c(peer2, gkx0Var, Direction.BEFORE, i2);
                            }
                        }
                        if (z5) {
                            rj30 rj30Var3 = (rj30) deVar2;
                            if (rj30Var3.b == MsgIdType.CNV_ID && rj30Var3.c <= 0) {
                                c = qfuVar.c(peer2, gkx0.d, Direction.AFTER, i2);
                            }
                        }
                        if (z5) {
                            rj30 rj30Var4 = (rj30) deVar2;
                            if (rj30Var4.b == MsgIdType.CNV_ID) {
                                int i5 = rj30Var4.c;
                                lj30 y2 = mf20Var.y(i5, peer2);
                                gkx0 b2 = n140.b(i5, 0, false);
                                if (y2 != null) {
                                    b2 = y2.h;
                                }
                                c = qfuVar.b(peer2, b2, i2);
                            }
                        }
                        if (z5) {
                            throw new ImEngineException("Unsupported id type " + ((rj30) deVar2).b);
                        }
                        if (!(deVar2 instanceof sj30)) {
                            throw new ImEngineException("Not supported mode = " + deVar2);
                        }
                        f5q0 b3 = ((g5q0) qfuVar.b).b(peer2);
                        if (b3 == null) {
                            c = new qj30(EmptyList.b, gkx0Var);
                        } else if (b3.a > 0) {
                            int i6 = b3.b;
                            lj30 y3 = mf20Var.y(i6, peer2);
                            gkx0 b4 = n140.b(i6, 0, false);
                            if (y3 != null) {
                                b4 = y3.h;
                            }
                            c = qfuVar.b(peer2, b4, i2);
                        } else {
                            c = qfuVar.c(peer2, gkx0Var, Direction.BEFORE, i2);
                        }
                    }
                }
                List<lj30> list = c.a;
                gkx0 gkx0Var2 = c.b;
                lj30 lj30Var = list.isEmpty() ? null : (lj30) j5g.b0(1, qfuVar.c(peer2, ((lj30) j5g.Y(list)).h, Direction.BEFORE, 2).a);
                lj30 lj30Var2 = list.isEmpty() ? null : (lj30) j5g.b0(1, qfuVar.c(peer2, ((lj30) j5g.i0(list)).h, Direction.AFTER, 2).a);
                List<lj30> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((lj30) it.next()).c));
                }
                return new ij30(q, list, lj30Var, lj30Var2, gkx0Var2, mf20Var.C(arrayList), ((Number) ((gzs) qfuVar.e).invoke()).intValue());
            }
        });
        MsgHistoryCreator msgHistoryCreator = (MsgHistoryCreator) this.d;
        SparseArray<Msg> sparseArray = ij30Var.f;
        lj30 lj30Var = ij30Var.d;
        lj30 lj30Var2 = ij30Var.c;
        int i2 = ij30Var.g;
        List<lj30> list = ij30Var.b;
        boolean z2 = false;
        boolean z3 = true;
        if (list.isEmpty()) {
            yj30 yj30Var = ij30Var.a;
            boolean z4 = yj30Var != null && yj30Var.b && yj30Var.c == i2;
            gj30 gj30Var = new gj30(0);
            boolean z5 = !z4;
            gj30Var.c = z5;
            gj30Var.b = (z4 || lj30Var2 == null) ? false : true;
            gj30Var.e = z5;
            if (!z4 && lj30Var != null) {
                z2 = true;
            }
            gj30Var.d = z2;
            return gj30Var;
        }
        d9w d9wVar = msgHistoryCreator.a;
        gkx0 gkx0Var = ij30Var.e;
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                size = list.size() - 1;
                break;
            }
            if (list.get(i3).h.compareTo(gkx0Var) > 0) {
                size = Math.max(0, i3 - 1);
                break;
            }
            i3++;
        }
        int i4 = size;
        while (true) {
            if (-1 >= i4) {
                i4 = 0;
                break;
            }
            lj30 lj30Var3 = list.get(i4);
            if (!zik0.a(sparseArray, lj30Var3.c)) {
                d9wVar.c(new hvz(lj30Var3, 10));
            } else if (!MsgHistoryCreator.b(lj30Var3, i4, list, "Since")) {
                if (!lj30Var3.i) {
                    if ((i4 == size || !MsgHistoryCreator.a(lj30Var3, i4, list, "Since")) && lj30Var3.j && i4 != size) {
                        i4++;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                continue;
            }
            i4--;
        }
        int size3 = list.size() - 1;
        int size4 = list.size();
        int i5 = size;
        while (true) {
            if (i5 >= size4) {
                z = z3;
                break;
            }
            lj30 lj30Var4 = list.get(i5);
            z = z3;
            if (!zik0.a(sparseArray, lj30Var4.c)) {
                d9wVar.c(new fgm(lj30Var4, 28));
            } else if (!MsgHistoryCreator.a(lj30Var4, i5, list, "Till")) {
                if (!lj30Var4.j) {
                    if ((i5 == size || !MsgHistoryCreator.b(lj30Var4, i5, list, "Till")) && lj30Var4.i && i5 != size) {
                        size3 = i5 - 1;
                        break;
                    }
                } else {
                    size3 = i5;
                    break;
                }
            } else {
                continue;
            }
            i5++;
            z3 = z;
        }
        boolean z6 = i4 > 0 ? z : false;
        boolean z7 = size3 < e43.h(list) ? z : false;
        if (z6 || z7) {
            ArrayList arrayList = new ArrayList(list.subList(i4, size3 + 1));
            if (z6 && !arrayList.isEmpty()) {
                arrayList.set(0, lj30.a((lj30) arrayList.get(0), 8063));
            }
            if (z7 && !arrayList.isEmpty()) {
                arrayList.set(e43.h(arrayList), lj30.a((lj30) arrayList.get(e43.h(arrayList)), 7935));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            gj30 gj30Var2 = new gj30(0);
            boolean z8 = z;
            gj30Var2.c = z8;
            gj30Var2.b = false;
            gj30Var2.e = z8;
            gj30Var2.d = false;
            return gj30Var2;
        }
        boolean z9 = z;
        ArrayList arrayList2 = new ArrayList(list.size());
        ArraySet arraySet = new ArraySet();
        hfr.a aVar = new hfr.a(rli0.j(new i5g(list), new eqq(ij30Var, 20)));
        while (aVar.hasNext()) {
            lj30 lj30Var5 = (lj30) aVar.next();
            Msg msg = sparseArray.get(lj30Var5.c);
            arrayList2.add(msg);
            if (lj30Var5.l != i2 || msg.u != i2) {
                arraySet.add(Integer.valueOf(lj30Var5.c));
            }
        }
        if (order == Order.DESC) {
            Collections.reverse(arrayList2);
        }
        lj30 lj30Var6 = (lj30) j5g.Y(list);
        lj30 lj30Var7 = (lj30) j5g.i0(list);
        boolean z10 = lj30Var6.i;
        boolean z11 = (z10 || lj30Var2 == null || lj30Var2.j) ? false : z9;
        boolean z12 = (z11 || z10 || lj30Var6.l != i2 || lj30Var2 != null) ? z9 : false;
        boolean z13 = lj30Var7.j;
        boolean z14 = (z13 || lj30Var == null || lj30Var.i) ? false : z9;
        return new gj30(arrayList2, arraySet, z11, z12, z14, (z14 || z13 || lj30Var7.l != i2 || lj30Var != null) ? z9 : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.util.List<xsna.lj30>] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public qj30 b(Peer peer, gkx0 gkx0Var, int i) {
        if (i == 0) {
            return new qj30(new ArrayList(0), gkx0Var);
        }
        int max = Math.max(1, i / 2);
        Direction direction = Direction.BEFORE;
        Collection collection = c(peer, gkx0Var, direction, max).a;
        int size = i - collection.size();
        Direction direction2 = Direction.AFTER;
        List<lj30> list = c(peer, gkx0Var, direction2, size).a;
        Collection collection2 = (Collection) collection;
        if (!collection2.isEmpty() && !list.isEmpty() && ((lj30) j5g.i0(collection)).c == ((lj30) j5g.Y(list)).c) {
            list = list.subList(1, list.size());
        }
        int size2 = list.size() + collection.size();
        if (size2 < i) {
            int i2 = i - size2;
            lj30 lj30Var = (lj30) j5g.a0(collection);
            boolean z = (lj30Var == null || lj30Var.i) ? false : true;
            lj30 lj30Var2 = (lj30) j5g.k0(list);
            boolean z2 = (lj30Var2 == null || lj30Var2.j) ? false : true;
            if (z) {
                List<lj30> list2 = c(peer, ((lj30) j5g.Y(collection)).h, direction, i2).a;
                collection = new ArrayList();
                collection.addAll(list2.subList(0, list2.size() - 1));
                collection.addAll(collection2);
            } else if (z2) {
                List<lj30> list3 = c(peer, ((lj30) j5g.i0(list)).h, direction2, i2).a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.addAll(list3.subList(1, list3.size()));
                list = arrayList;
            }
        }
        Collection collection3 = collection;
        if (!collection3.isEmpty()) {
            List<lj30> list4 = list;
            if (!list4.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(list.size() + ((List) collection).size());
                arrayList2.addAll(collection3);
                arrayList2.addAll(list4);
                return new qj30(arrayList2, gkx0Var);
            }
        }
        return !collection3.isEmpty() ? new qj30((List) collection, gkx0Var) : !list.isEmpty() ? new qj30(list, gkx0Var) : new qj30(new ArrayList(0), gkx0Var);
    }

    public qj30 c(Peer peer, gkx0 gkx0Var, Direction direction, int i) {
        if (i == 0) {
            return new qj30(new ArrayList(0), gkx0Var);
        }
        ArrayList arrayList = new ArrayList(((mf20) this.a).n(peer, gkx0Var, direction, i));
        if (direction == Direction.BEFORE) {
            Collections.reverse(arrayList);
        }
        return new qj30(arrayList, gkx0Var);
    }

    public qfu(mf20 mf20Var, g5q0 g5q0Var, eyf eyfVar, xgl0 xgl0Var, MsgHistoryCreator msgHistoryCreator, gzs gzsVar, com.vk.im.engine.models.c cVar) {
        this.a = mf20Var;
        this.b = g5q0Var;
        this.c = xgl0Var;
        this.d = msgHistoryCreator;
        this.e = gzsVar;
        this.f = cVar;
    }
}
