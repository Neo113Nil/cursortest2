package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.vk.core.compose.utils.swipable.DismissValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.acn;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: SwipeToDismiss.kt */
/* loaded from: classes17.dex */
public final class hmn0 {
    public static final float a = 125;

    /* compiled from: SwipeToDismiss.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DismissValue.values().length];
            try {
                iArr[DismissValue.DismissedToEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DismissValue.DismissedToStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DismissValue.DismissedToBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DismissValue.DismissedToTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DismissValue.Default.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final ccn ccnVar, final jai jaiVar, q630 q630Var, yzs yzsVar, final Set set, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final yzs yzsVar2;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(1181452815);
        int i2 = i | (M.J(ccnVar) ? 4 : 2) | 3456 | (M.y(set) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            jai jaiVar2 = pli.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1181452815, i2, -1, "com.vk.core.compose.utils.swipable.SwipeToDismiss (SwipeToDismiss.kt:236)");
            }
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (((acn) it.next()) instanceof acn.c) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            int i3 = i2 & 65534;
            q630.a aVar2 = q630.a.a;
            b(ccnVar, jaiVar, aVar2, jaiVar2, set, z, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yzsVar2 = jaiVar2;
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
            yzsVar2 = yzsVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(jaiVar, q630Var2, yzsVar2, set, i) { // from class: xsna.fmn0
                public final /* synthetic */ jai c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ yzs e;
                public final /* synthetic */ Set f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    hmn0.a(ccn.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [xsna.jai] */
    public static final void b(final ccn ccnVar, jai jaiVar, final q630 q630Var, final yzs yzsVar, final Set set, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        jai jaiVar2;
        ArrayList arrayList;
        androidx.compose.runtime.a M = aVar.M(-1556109706);
        int i2 = (i & 6) == 0 ? (M.J(ccnVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(yzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(set) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1556109706, i2, -1, "com.vk.core.compose.utils.swipable.SwipeToDismissInternal (SwipeToDismiss.kt:255)");
            }
            boolean z2 = M.r(uvi.n) == LayoutDirection.Rtl;
            int i3 = 458752 & i2;
            boolean J = M.J(set) | (i3 == 131072);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (J || x == c0012a) {
                Set set2 = set;
                if (z) {
                    arrayList = new ArrayList();
                    for (Object obj2 : set2) {
                        if (obj2 instanceof acn.c) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : set2) {
                        if (obj3 instanceof acn.f) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList = arrayList2;
                }
                M.R(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            ymn0<DismissValue> ymn0Var = ccnVar.a;
            Orientation orientation = z ? Orientation.Horizontal : Orientation.Vertical;
            DismissValue a2 = ccnVar.a();
            DismissValue dismissValue = DismissValue.Default;
            q630 a3 = fho.a(q630Var, ymn0Var.m, orientation, a2 == dismissValue, null, ((zak0) ymn0Var.l).getValue() != null, new umn0(ymn0Var, null), z2, 32);
            ymn0<DismissValue> ymn0Var2 = ccnVar.a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = rl3.y0(new DismissValue[]{dismissValue, DismissValue.DismissedToEnd, DismissValue.DismissedToStart, DismissValue.DismissedToBottom, DismissValue.DismissedToTop});
                M.R(x2);
            }
            Set set3 = (Set) x2;
            boolean y = M.y(list);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new com.vk.movika.tools.controls.seekbar.k(list, 11);
                M.R(x3);
            }
            q630 g = a3.g(new qln0(new yka0(ymn0Var2, 13), new dm(ymn0Var2, set3, (wzs) x3, 2), a5x.a));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 a4 = ra8Var.a(aVar3);
            int i4 = i2 & 7168;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            int i5 = i2;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, a4);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            Integer valueOf2 = Integer.valueOf(((i4 >> 6) & 112) | 6);
            tpg0 tpg0Var = tpg0.a;
            yzsVar.invoke(tpg0Var, M, valueOf2);
            M.G();
            boolean z3 = ((i5 & 14) == 4) | (i3 == 131072);
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new wnr(ccnVar, z);
                M.R(x4);
            }
            q630 k = kci.k(aVar3, (izs) x4);
            int i6 = (i5 << 6) & 7168;
            androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, k);
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
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            Integer valueOf3 = Integer.valueOf(((i6 >> 6) & 112) | 6);
            ?? r5 = jaiVar;
            r5.invoke(tpg0Var, M, valueOf3);
            M.G();
            M.G();
            jaiVar2 = r5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                jaiVar2 = r5;
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final jai jaiVar3 = jaiVar2;
            s.d = new wzs() { // from class: xsna.gmn0
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    hmn0.b(ccn.this, jaiVar3, q630Var, yzsVar, set, z, (androidx.compose.runtime.a) obj4, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
