package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes11.dex */
public final class jj2 implements cp10 {
    public final pm2 a;
    public boolean b;

    /* compiled from: AnimatedVisibility.kt */
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
                aVar2.q(list.get(i), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            return s3q0.a;
        }
    }

    public jj2(pm2 pm2Var) {
        this.a = pm2Var;
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
        boolean z1 = ep10Var.z1();
        pm2 pm2Var = this.a;
        if (z1) {
            this.b = true;
            ((zak0) pm2Var.a).setValue(new q9x((4294967295L & i2) | (i << 32)));
        } else if (!this.b) {
            ((zak0) pm2Var.a).setValue(new q9x((4294967295L & i2) | (i << 32)));
        }
        return ep10Var.Q(i, i2, jgp.b, new a(arrayList));
    }

    @Override // xsna.cp10
    public final int c(apx apxVar, List<? extends zox> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int Z = list.get(0).Z(i);
        int h = e43.h(list);
        int i2 = 1;
        if (1 <= h) {
            while (true) {
                int Z2 = list.get(i2).Z(i);
                if (Z2 > Z) {
                    Z = Z2;
                }
                if (i2 == h) {
                    break;
                }
                i2++;
            }
        }
        return Z;
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int l0 = list.get(0).l0(i);
        int h = e43.h(list);
        int i2 = 1;
        if (1 <= h) {
            while (true) {
                int l02 = list.get(i2).l0(i);
                if (l02 > l0) {
                    l0 = l02;
                }
                if (i2 == h) {
                    break;
                }
                i2++;
            }
        }
        return l0;
    }

    @Override // xsna.cp10
    public final int f(apx apxVar, List<? extends zox> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int j0 = list.get(0).j0(i);
        int h = e43.h(list);
        int i2 = 1;
        if (1 <= h) {
            while (true) {
                int j02 = list.get(i2).j0(i);
                if (j02 > j0) {
                    j0 = j02;
                }
                if (i2 == h) {
                    break;
                }
                i2++;
            }
        }
        return j0;
    }

    @Override // xsna.cp10
    public final int g(apx apxVar, List<? extends zox> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int M = list.get(0).M(i);
        int h = e43.h(list);
        int i2 = 1;
        if (1 <= h) {
            while (true) {
                int M2 = list.get(i2).M(i);
                if (M2 > M) {
                    M = M2;
                }
                if (i2 == h) {
                    break;
                }
                i2++;
            }
        }
        return M;
    }
}
