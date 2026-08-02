package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.utils.swipable.DismissValue;
import com.vk.core.snackbar.HideReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSnackbarHost.kt */
/* loaded from: classes17.dex */
public final class zkv0 {
    public static final void a(final l7k0 l7k0Var, final bi50 bi50Var, final ccn ccnVar, final if2 if2Var, final wzs wzsVar, q630 q630Var, final boolean z, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        wzs wzsVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-48756749);
        if ((i2 & 6) == 0) {
            i3 = (M.J(l7k0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? M.J(bi50Var) : M.y(bi50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? M.J(ccnVar) : M.y(ccnVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? M.J(if2Var) : M.y(if2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            wzsVar2 = wzsVar;
            i3 |= M.y(wzsVar2) ? 16384 : 8192;
        } else {
            wzsVar2 = wzsVar;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            i4 |= M.l(z) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= M.o(i) ? 8388608 : 4194304;
        }
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-48756749, i4, -1, "com.vk.core.compose.snackbar.AnimatedContent (VkSnackbarHost.kt:299)");
            }
            int i5 = l7k0Var.e ? -1 : 1;
            int i6 = z ? 250 : 200;
            nkk nkkVar = luo.c;
            dtp0 dtp0Var = new dtp0(i6, i, nkkVar);
            dtp0 dtp0Var2 = new dtp0(i6, i, nkkVar);
            bi50Var.w0(Boolean.valueOf(z));
            boolean z2 = ((3670016 & i4) == 1048576) | ((i4 & 14) == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new meh(z, l7k0Var, 3);
                M.R(x);
            }
            q630Var2 = q630.a.a;
            q630 b = egi0.b(q630Var2, false, (izs) x);
            boolean o = M.o(i5);
            Object x2 = M.x();
            if (o || x2 == c0012a) {
                x2 = new c6m0(i5, 1);
                M.R(x2);
            }
            rpp b2 = anp.l(dtp0Var, (izs) x2).b(anp.e(dtp0Var2, 2));
            boolean o2 = M.o(i5);
            Object x3 = M.x();
            if (o2 || x3 == c0012a) {
                x3 = new gh30(i5, 1);
                M.R(x3);
            }
            final wzs wzsVar3 = wzsVar2;
            mm2.c(bi50Var, b, b2, anp.o(dtp0Var, (izs) x3).b(anp.f(dtp0Var2, 2)), null, kai.c(-1262435125, new yzs() { // from class: xsna.rkv0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1262435125, intValue, -1, "com.vk.core.compose.snackbar.AnimatedContent.<anonymous> (VkSnackbarHost.kt:323)");
                    }
                    ccn ccnVar2 = ccn.this;
                    DismissValue a = ccnVar2.a();
                    DismissValue dismissValue = DismissValue.Default;
                    bi50 bi50Var2 = bi50Var;
                    final l7k0 l7k0Var2 = l7k0Var;
                    if (a != dismissValue) {
                        bi50Var2.w0(Boolean.FALSE);
                        HideReason hideReason = HideReason.Swipe;
                        if (l7k0Var2.h.isActive()) {
                            Object obj4 = flv0.a;
                            flv0.b(l7k0Var2.b, hideReason);
                        }
                    }
                    boolean J = aVar2.J(l7k0Var2);
                    Object x4 = aVar2.x();
                    Object obj5 = a.C0011a.a;
                    if (J || x4 == obj5) {
                        x4 = new k7l0(l7k0Var2, 24);
                        aVar2.R(x4);
                    }
                    bap.c(bi50Var2, (izs) x4, aVar2, 0);
                    boolean J2 = aVar2.J(l7k0Var2);
                    Object x5 = aVar2.x();
                    if (J2 || x5 == obj5) {
                        x5 = Collections.singleton(l7k0Var2.c);
                        aVar2.R(x5);
                    }
                    Set set = (Set) x5;
                    final if2 if2Var2 = if2Var;
                    final wzs wzsVar4 = wzsVar3;
                    hmn0.a(ccnVar2, kai.c(-1404753482, new yzs() { // from class: xsna.tkv0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj7;
                            int intValue2 = ((Integer) obj8).intValue();
                            if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1404753482, intValue2, -1, "com.vk.core.compose.snackbar.AnimatedContent.<anonymous>.<anonymous> (VkSnackbarHost.kt:339)");
                                }
                                if2 if2Var3 = if2.this;
                                boolean y = aVar3.y(if2Var3);
                                Object x6 = aVar3.x();
                                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                if (y || x6 == c0012a2) {
                                    x6 = new ukv0(if2Var3, 0);
                                    aVar3.R(x6);
                                }
                                q630 a2 = rdu.a(q630.a.a, (izs) x6);
                                l7k0 l7k0Var3 = l7k0Var2;
                                boolean J3 = aVar3.J(l7k0Var3);
                                Object x7 = aVar3.x();
                                if (J3 || x7 == c0012a2) {
                                    x7 = new f6m0(l7k0Var3, 20);
                                    aVar3.R(x7);
                                }
                                izs izsVar = (izs) x7;
                                q630 b3 = skn0.b(a2, izsVar, new gmb0(izsVar));
                                dt1.a.getClass();
                                cp10 d = ja8.d(dt1.a.b, false);
                                int hashCode = Long.hashCode(n34.n(aVar3));
                                sy90 D = aVar3.D();
                                q630 c = qri.c(aVar3, b3);
                                cri.h7.getClass();
                                LayoutNode.a aVar4 = cri.a.b;
                                if (aVar3.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar3.H();
                                if (aVar3.L()) {
                                    aVar3.I(aVar4);
                                } else {
                                    aVar3.f();
                                }
                                k9q0.w(aVar3, d, cri.a.f);
                                k9q0.w(aVar3, D, cri.a.e);
                                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar3, cri.a.h);
                                k9q0.w(aVar3, c, cri.a.d);
                                wzsVar4.invoke(aVar3, 0);
                                aVar3.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar2), null, null, set, aVar2, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 196608, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs() { // from class: xsna.skv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zkv0.a(l7k0.this, bi50Var, ccnVar, if2Var, wzsVar, q630Var3, z, i, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(l7k0 l7k0Var, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(183961503);
        int i2 = (i & 6) == 0 ? (M.J(l7k0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(183961503, i2, -1, "com.vk.core.compose.snackbar.FadeInFadeOutWithScale (VkSnackbarHost.kt:213)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new riq();
                M.R(x);
            }
            riq riqVar = (riq) x;
            Object obj = riqVar.a;
            ArrayList arrayList = riqVar.b;
            if (epx.f(l7k0Var, obj)) {
                M.K(11655331);
            } else {
                M.K(693357743);
                riqVar.a = l7k0Var;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((l7k0) ((piq) it.next()).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(l7k0Var)) {
                    arrayList3.add(l7k0Var);
                }
                arrayList.clear();
                for (l7k0 l7k0Var2 : j5g.V(arrayList3)) {
                    arrayList.add(new piq(l7k0Var2, kai.c(-1904020055, new okl0(l7k0Var2, l7k0Var, riqVar, arrayList3, 2), M)));
                }
            }
            M.j();
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            riqVar.c = n34.o(M);
            M.K(-323205311);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                piq piqVar = (piq) it2.next();
                l7k0 l7k0Var3 = (l7k0) piqVar.a;
                jai jaiVar2 = piqVar.b;
                M.W(-742773773, l7k0Var3);
                jaiVar2.invoke(kai.c(1807980412, new ed4(11, jaiVar, l7k0Var3), M), M, 6);
                M.a0();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q37(i, 3, l7k0Var, q630Var, jaiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final dlv0 dlv0Var, final wl20 wl20Var, q630 q630Var, e7k0 e7k0Var, g7k0 g7k0Var, rv5 rv5Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        e7k0 e7k0Var2;
        int i5;
        g7k0 g7k0Var2;
        int i6;
        rv5 rv5Var2;
        int i7;
        final q630 q630Var3;
        final e7k0 e7k0Var3;
        final g7k0 g7k0Var3;
        final rv5 rv5Var3;
        androidx.compose.runtime.f s;
        int i8;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-890077433);
        if ((i & 6) == 0) {
            i3 = (M.J(dlv0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(wl20Var) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                e7k0Var2 = e7k0Var;
                i3 |= M.J(e7k0Var2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    g7k0Var2 = g7k0Var;
                    i3 |= M.J(g7k0Var2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        rv5Var2 = rv5Var;
                        i3 |= M.J(rv5Var2) ? 131072 : 65536;
                        i7 = i3 | 1572864;
                        if (M.t(i7 & 1, (599187 & i7) != 599186)) {
                            if (i9 != 0) {
                                q630Var4 = q630.a.a;
                                i8 = i5;
                            } else {
                                i8 = i5;
                                q630Var4 = q630Var2;
                            }
                            if (i4 != 0) {
                                e7k0Var2 = null;
                            }
                            g7k0 g7k0Var4 = i8 != 0 ? null : g7k0Var2;
                            rv5 rv5Var4 = i6 == 0 ? rv5Var2 : null;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-890077433, i7, -1, "com.vk.core.compose.snackbar.VkSnackbarHost (VkSnackbarHost.kt:170)");
                            }
                            d(dlv0Var, q630Var4, kai.c(-1384566939, new o6t(wl20Var, e7k0Var2, g7k0Var4, rv5Var4), M), M, (i7 & 14) | 384 | ((i7 >> 3) & 112), 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            e7k0 e7k0Var4 = e7k0Var2;
                            rv5Var3 = rv5Var4;
                            e7k0Var3 = e7k0Var4;
                            g7k0Var3 = g7k0Var4;
                            q630Var3 = q630Var4;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            e7k0Var3 = e7k0Var2;
                            g7k0Var3 = g7k0Var2;
                            rv5Var3 = rv5Var2;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.qkv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    zkv0.c(dlv0.this, wl20Var, q630Var3, e7k0Var3, g7k0Var3, rv5Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    rv5Var2 = rv5Var;
                    i7 = i3 | 1572864;
                    if (M.t(i7 & 1, (599187 & i7) != 599186)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                g7k0Var2 = g7k0Var;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                rv5Var2 = rv5Var;
                i7 = i3 | 1572864;
                if (M.t(i7 & 1, (599187 & i7) != 599186)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            e7k0Var2 = e7k0Var;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            g7k0Var2 = g7k0Var;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            rv5Var2 = rv5Var;
            i7 = i3 | 1572864;
            if (M.t(i7 & 1, (599187 & i7) != 599186)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        e7k0Var2 = e7k0Var;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        g7k0Var2 = g7k0Var;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        rv5Var2 = rv5Var;
        i7 = i3 | 1572864;
        if (M.t(i7 & 1, (599187 & i7) != 599186)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void d(final dlv0 dlv0Var, q630 q630Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-982047840);
        if ((i & 6) == 0) {
            i3 = (M.J(dlv0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-982047840, i3, -1, "com.vk.core.compose.snackbar.VkSnackbarHost (VkSnackbarHost.kt:147)");
            }
            b(dlv0Var.b(), q630Var, jaiVar, M, i3 & 1008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vkv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zkv0.d(dlv0.this, q630Var2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
