package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: RootMeasurePolicy.kt */
/* loaded from: classes11.dex */
public final class kmg0 extends LayoutNode.d {
    public static final kmg0 b = new kmg0("Undefined intrinsics block and it is required");

    /* compiled from: RootMeasurePolicy.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(tra0.a aVar) {
            return s3q0.a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    public static final class b extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tra0 tra0Var) {
            super(1);
            this.$placeable = tra0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a.z(aVar, this.$placeable, 0, 0);
            return s3q0.a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    public static final class c extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ List<tra0> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.$placeables = arrayList;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a aVar2 = aVar;
            List<tra0> list = this.$placeables;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                tra0.a.z(aVar2, list.get(i), 0, 0);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        int size = list.size();
        jgp jgpVar = jgp.b;
        if (size == 0) {
            return ep10Var.Q(o6j.k(j), o6j.j(j), jgpVar, a.i);
        }
        if (size == 1) {
            tra0 N = list.get(0).N(j);
            return ep10Var.Q(s6j.g(N.b, j), s6j.f(N.c, j), jgpVar, new b(N));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            tra0 N2 = list.get(i3).N(j);
            i = Math.max(N2.b, i);
            i2 = Math.max(N2.c, i2);
            arrayList.add(N2);
        }
        return ep10Var.Q(s6j.g(i, j), s6j.f(i2, j), jgpVar, new c(arrayList));
    }
}
