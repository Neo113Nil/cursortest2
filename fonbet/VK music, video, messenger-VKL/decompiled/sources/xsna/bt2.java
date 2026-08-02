package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.q630;
import xsna.us2;

/* compiled from: AnnotatedStringResolveInlineContent.kt */
/* loaded from: classes11.dex */
public final class bt2 {
    public static final Pair<List<us2.d<esa0>>, List<us2.d<yzs<String, androidx.compose.runtime.a, Integer, s3q0>>>> a;

    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    public static final class a implements cp10 {
        public static final a a = new a();

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i = 0;
            while (i < size) {
                i = rf3.a(list.get(i), j, arrayList, i, 1);
            }
            return ep10Var.Q(o6j.i(j), o6j.h(j), jgp.b, new mz(arrayList, 2));
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        a = new Pair<>(emptyList, emptyList);
    }

    public static final void a(us2 us2Var, List<us2.d<yzs<String, androidx.compose.runtime.a, Integer, s3q0>>> list, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1794596951);
        int i2 = (i & 6) == 0 ? (M.J(us2Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.y(list) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1794596951, i2, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                us2.d<yzs<String, androidx.compose.runtime.a, Integer, s3q0>> dVar = list.get(i3);
                yzs<String, androidx.compose.runtime.a, Integer, s3q0> yzsVar = dVar.a;
                int i4 = dVar.b;
                int i5 = dVar.c;
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = a.a;
                    M.R(x);
                }
                cp10 cp10Var = (cp10) x;
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630.a.a);
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
                k9q0.w(M, cp10Var, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                yzsVar.invoke(us2Var.subSequence(i4, i5).c, M, 0);
                M.G();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new at2(us2Var, list, i, 0);
        }
    }
}
