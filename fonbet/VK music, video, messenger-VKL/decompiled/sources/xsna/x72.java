package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes11.dex */
public final class x72 implements cp10 {
    public static final x72 a = new x72();

    /* compiled from: AndroidDialog.android.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ List<tra0> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.$placeables = arrayList;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a aVar2 = aVar;
            List<tra0> list = this.$placeables;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                tra0.a.x(aVar2, list.get(i), 0, 0);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            tra0 N = list.get(i3).N(j);
            i = Math.max(i, N.b);
            i2 = Math.max(i2, N.c);
            arrayList.add(N);
        }
        if (list.isEmpty()) {
            i = o6j.k(j);
            i2 = o6j.j(j);
        }
        return ep10Var.Q(i, i2, jgp.b, new a(arrayList));
    }
}
