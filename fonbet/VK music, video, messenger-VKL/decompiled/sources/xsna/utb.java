package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogsIdList;
import com.vk.im.engine.models.messages.Msg;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.q630;
import xsna.yye0;

/* compiled from: ChatMessagesDeleteMergeTaskRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class utb implements ae20, yye0.a {
    public final Object b;
    public Object c;

    public /* synthetic */ utb(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void q(LayoutNode layoutNode) {
        if (layoutNode.Q > 0) {
            if (layoutNode.H.d == LayoutNode.LayoutState.Idle && !layoutNode.D() && !layoutNode.E() && !layoutNode.R && layoutNode.g()) {
                q630.c cVar = layoutNode.G.f;
                if ((cVar.e & 256) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 256) != 0) {
                            ytl ytlVar = cVar;
                            ?? r5 = 0;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof o1u) {
                                    o1u o1uVar = (o1u) ytlVar;
                                    o1uVar.T1(itl.d(o1uVar, 256));
                                } else if ((ytlVar.d & 256) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar2 = ytlVar.q;
                                    int i = 0;
                                    ytlVar = ytlVar;
                                    r5 = r5;
                                    while (cVar2 != null) {
                                        if ((cVar2.d & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                ytlVar = cVar2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r5.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r5.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.g;
                                        ytlVar = ytlVar;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ytlVar = itl.b(r5);
                            }
                        }
                        if ((cVar.e & 256) == 0) {
                            break;
                        } else {
                            cVar = cVar.g;
                        }
                    }
                }
            }
            layoutNode.P = false;
            ci50<LayoutNode> L = layoutNode.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i2 = L.d;
            for (int i3 = 0; i3 < i2; i3++) {
                q(layoutNodeArr[i3]);
            }
        }
    }

    @Override // xsna.ae20
    public Collection a(Object obj, gkx0 gkx0Var, gkx0 gkx0Var2) {
        return ((xgl0) this.b).o().f0(((gv30) obj).a, gkx0Var, gkx0Var2, Integer.MAX_VALUE);
    }

    @Override // xsna.yye0.a
    public void b() {
        CoroutineExtensionsKt.safeResume((lq9) this.b, ((o1i0) this.c).c.getrustorev2("com.vk.push.authsdk"));
    }

    @Override // xsna.ae20
    public void c(int i, boolean z) {
        ((xgl0) this.b).o().X(i, z);
    }

    @Override // xsna.yye0.a
    public void d(Throwable th) {
        CoroutineExtensionsKt.safeResumeWithException((lq9) this.b, new IllegalStateException("Library loading was failed", th));
    }

    @Override // xsna.ae20
    public lj30 e(Object obj, gkx0 gkx0Var) {
        return ((xgl0) this.b).o().A(((gv30) obj).b, gkx0Var);
    }

    @Override // xsna.ae20
    public void f(int i, gkx0 gkx0Var) {
        ((xgl0) this.b).o().E0(i, gkx0Var);
    }

    @Override // xsna.ae20
    public void g(Object obj, boolean z) {
        ((xgl0) this.b).o().j0(((gv30) obj).b, z);
    }

    @Override // xsna.ae20
    public void h(Object obj, gkx0 gkx0Var, gkx0 gkx0Var2, boolean z) {
        gv30 gv30Var = (gv30) obj;
        d040 o = ((xgl0) this.b).o();
        if (z) {
            o.j(gv30Var.a, gkx0Var, gkx0Var2);
        } else {
            o.H(gv30Var.a, gkx0Var, gkx0Var2, MsgSyncState.SENDING);
        }
    }

    @Override // xsna.ae20
    public ikx0 i(Object obj) {
        return ((xgl0) this.b).o().t((gv30) obj);
    }

    @Override // xsna.ae20
    public void j(Object obj, gkx0 gkx0Var, gkx0 gkx0Var2) {
        ((xgl0) this.b).o().p0(((gv30) obj).a, gkx0Var, gkx0Var2);
    }

    @Override // xsna.ae20
    public yj30 k(Object obj) {
        return ((xgl0) this.b).o().q(((gv30) obj).b);
    }

    @Override // xsna.ae20
    public void l(Object obj, Collection collection, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        vjm vjmVar;
        int i10;
        gkx0 gkx0Var;
        int i11;
        gv30 gv30Var = (gv30) obj;
        com.vk.im.engine.models.c cVar = (com.vk.im.engine.models.c) this.c;
        xgl0 xgl0Var = (xgl0) this.b;
        hpm e = xgl0Var.b().e();
        d040 o = xgl0Var.o();
        long j = gv30Var.a;
        com.vk.im.engine.models.dialogs.b c = e.c(j);
        if (c == null) {
            return;
        }
        int i12 = c.j;
        int i13 = c.g;
        yj30 q = o.q(gv30Var.b);
        lj30 G0 = o.G0(j);
        ChatSettings chatSettings = c.z;
        boolean z2 = chatSettings != null && chatSettings.g;
        boolean z3 = !cVar.p() || z;
        int i14 = c.i;
        int i15 = c.h;
        int i16 = c.k;
        int i17 = c.l;
        vjm vjmVar2 = c.d;
        Collection<Msg> collection2 = collection;
        Object obj2 = null;
        if (collection2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Msg msg : collection2) {
                com.vk.im.engine.models.c cVar2 = cVar;
                long j2 = j;
                if (msg.i && msg.d > i13 && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
                cVar = cVar2;
                j = j2;
            }
        }
        com.vk.im.engine.models.c cVar3 = cVar;
        long j3 = j;
        if (i > 0) {
            i12 -= i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (q == null || !q.b) {
            if (G0 != null) {
                long j4 = G0.n;
                if (!G0.j) {
                    i14 = G0.d;
                    if (z2) {
                        i3 = 1;
                        i4 = 0;
                    } else {
                        List D0 = j5g.D0(new fa80(1), xgl0Var.o().i().values());
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : D0) {
                            long j5 = j4;
                            if (((lj30) obj3).b != j3) {
                                arrayList.add(obj3);
                            }
                            j4 = j5;
                        }
                        long j6 = j4;
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (it.hasNext()) {
                                long abs = Math.abs(j6 - ((lj30) obj2).n);
                                while (true) {
                                    Object next = it.next();
                                    Iterator it2 = it;
                                    long abs2 = Math.abs(j6 - ((lj30) next).n);
                                    if (abs > abs2) {
                                        obj2 = next;
                                        abs = abs2;
                                    }
                                    if (!it2.hasNext()) {
                                        break;
                                    } else {
                                        it = it2;
                                    }
                                }
                            }
                        }
                        lj30 lj30Var = (lj30) obj2;
                        if (lj30Var != null) {
                            com.vk.im.engine.models.dialogs.b c2 = xgl0Var.b().e().c(lj30Var.b);
                            if (c2 != null && (gkx0Var = c2.f) != null) {
                                Pair<Integer, Integer> pair = lmm.a;
                                i3 = 1;
                                i10 = ((int) xo9.j(gkx0Var.b, lmm.c)) + 1;
                                i4 = 0;
                                vjmVar2 = vjm.e(vjmVar2, 0, i10, i3);
                            }
                        }
                        i3 = 1;
                        i10 = 0;
                        i4 = 0;
                        vjmVar2 = vjm.e(vjmVar2, 0, i10, i3);
                    }
                    i2 = i3;
                    i5 = i17;
                    i6 = i16;
                    i7 = i15;
                    i8 = i12;
                    i9 = i13;
                    vjmVar = vjmVar2;
                }
            }
            i3 = 1;
            i4 = 0;
            i5 = i17;
            i6 = i16;
            i7 = i15;
            i8 = i12;
            i9 = i13;
            vjmVar = vjmVar2;
        } else {
            if (!z2 && z3) {
                vjmVar2 = vjm.e(vjmVar2, 0, 0, 1);
            }
            vjmVar = vjmVar2;
            i2 = 1;
            i3 = 1;
            i4 = 0;
            i9 = 0;
            i7 = 0;
            i14 = 0;
            i8 = 0;
            i6 = 0;
            i5 = 0;
        }
        if (i2 == i3) {
            i11 = i4;
            e.Z(com.vk.im.engine.models.dialogs.b.a(c, vjmVar, null, null, i9, i7, i14, i8, i6, i5, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -2021, 2097151));
        } else {
            i11 = i4;
        }
        if (z3) {
            czh0 v = xgl0Var.v();
            List<Long> list = v.q().b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list) {
                if (((Number) obj4).longValue() != j3) {
                    arrayList2.add(obj4);
                }
            }
            v.c(new DialogsIdList(arrayList2));
            v.n(Collections.singletonList(Long.valueOf(j3)));
        }
    }

    @Override // xsna.ae20
    public void m(int i, boolean z) {
        ((xgl0) this.b).o().x(i, z);
    }

    @Override // xsna.ae20
    public void n(int i, gkx0 gkx0Var) {
        ((xgl0) this.b).o().F0(i, gkx0Var);
    }

    @Override // xsna.ae20
    public uz50 o(Object obj, gkx0 gkx0Var) {
        return ((xgl0) this.b).o().r0(((gv30) obj).b, gkx0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p() {
        Object[] objArr;
        ci50 ci50Var = (ci50) this.b;
        Arrays.sort(ci50Var.b, 0, ci50Var.d, fa80.c);
        int i = ci50Var.d;
        LayoutNode[] layoutNodeArr = (LayoutNode[]) this.c;
        if (layoutNodeArr != null) {
            int length = layoutNodeArr.length;
            objArr = layoutNodeArr;
        }
        objArr = new LayoutNode[Math.max(16, i)];
        this.c = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = ci50Var.b[i2];
        }
        ci50Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.c = objArr;
                return;
            }
            LayoutNode layoutNode = objArr[i];
            if (layoutNode.P) {
                q(layoutNode);
            }
            objArr[i] = 0;
        }
    }

    public utb() {
        this.b = new ci50(new LayoutNode[16]);
    }
}
