package androidx.compose.animation;

import androidx.compose.ui.layout.o;
import defpackage.aa10;
import defpackage.k6w;
import defpackage.ng2;
import defpackage.scc;
import defpackage.tls;
import defpackage.x910;
import defpackage.yuw;
import defpackage.z910;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class f implements z910 {
    public final ng2 a;
    public boolean b;

    public f(ng2 ng2Var) {
        this.a = ng2Var;
    }

    @Override // defpackage.z910
    public final aa10 b(androidx.compose.ui.layout.k kVar, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            o l0 = ((x910) list.get(i3)).l0(j);
            i = Math.max(i, l0.a);
            i2 = Math.max(i2, l0.b);
            arrayList.add(l0);
        }
        boolean d0 = kVar.d0();
        ng2 ng2Var = this.a;
        if (d0) {
            this.b = true;
            ng2Var.b.setValue(new k6w((i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32)));
        } else if (!this.b) {
            ng2Var.b.setValue(new k6w((i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32)));
        }
        return kVar.w(i, i2, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a aVar = (o.a) obj;
                List<o> list2 = arrayList;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    aVar.g(list2.get(i4), 0, 0, 0.0f);
                }
                return zy11.a;
            }
        });
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int k0 = ((x910) list.get(0)).k0(i);
        int f = scc.f(list);
        int i2 = 1;
        if (1 <= f) {
            while (true) {
                int k02 = ((x910) list.get(i2)).k0(i);
                if (k02 > k0) {
                    k0 = k02;
                }
                if (i2 == f) {
                    break;
                }
                i2++;
            }
        }
        return k0;
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int e0 = ((x910) list.get(0)).e0(i);
        int f = scc.f(list);
        int i2 = 1;
        if (1 <= f) {
            while (true) {
                int e02 = ((x910) list.get(i2)).e0(i);
                if (e02 > e0) {
                    e0 = e02;
                }
                if (i2 == f) {
                    break;
                }
                i2++;
            }
        }
        return e0;
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int y = ((x910) list.get(0)).y(i);
        int f = scc.f(list);
        int i2 = 1;
        if (1 <= f) {
            while (true) {
                int y2 = ((x910) list.get(i2)).y(i);
                if (y2 > y) {
                    y = y2;
                }
                if (i2 == f) {
                    break;
                }
                i2++;
            }
        }
        return y;
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int V = ((x910) list.get(0)).V(i);
        int f = scc.f(list);
        int i2 = 1;
        if (1 <= f) {
            while (true) {
                int V2 = ((x910) list.get(i2)).V(i);
                if (V2 > V) {
                    V = V2;
                }
                if (i2 == f) {
                    break;
                }
                i2++;
            }
        }
        return V;
    }
}
