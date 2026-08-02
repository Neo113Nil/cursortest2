package xsna;

import androidx.compose.runtime.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SaveableStateHolder.kt */
/* loaded from: classes11.dex */
public final class l1h0 implements j1h0 {
    public static final fh9 f = new fh9(new b06(0, 5), new ev60(9));
    public final Map<Object, Map<String, List<Object>>> b;
    public final ph50<Object, m1h0> c;
    public m1h0 d;
    public final l850 e;

    public l1h0() {
        this(0);
    }

    @Override // xsna.j1h0
    public final void c(Object obj, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(533563200);
        if ((i & 6) == 0) {
            i2 = (M.y(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            M.g(obj);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                l850 l850Var = this.e;
                if (!((Boolean) l850Var.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(so.a(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map<String, List<Object>> map = this.b.get(obj);
                iyk0 iyk0Var = o1h0.a;
                p1h0 p1h0Var = new p1h0(new n1h0(map, l850Var));
                M.R(p1h0Var);
                x = p1h0Var;
            }
            p1h0 p1h0Var2 = (p1h0) x;
            rvi.b(new c9e0[]{o1h0.a.b(p1h0Var2), vvz.a.b(p1h0Var2)}, jaiVar, M, (i2 & 112) | 8);
            s3q0 s3q0Var = s3q0.a;
            boolean y = M.y(this) | M.y(obj) | M.y(p1h0Var2);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new eo3(this, obj, p1h0Var2, 12);
                M.R(x2);
            }
            bap.c(s3q0Var, (izs) x2, M, 6);
            M.w();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t050(i, 2, this, obj, jaiVar);
        }
    }

    public l1h0(Map<Object, Map<String, List<Object>>> map) {
        this.b = map;
        this.c = h5h0.b();
        this.e = new l850(this, 7);
    }

    public /* synthetic */ l1h0(int i) {
        this(new LinkedHashMap());
    }
}
