package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import xsna.m1h0;

/* compiled from: LazySaveableStateHolder.kt */
/* loaded from: classes11.dex */
public final class jwy implements m1h0, j1h0 {
    public final n1h0 b;
    public final l1h0 c;
    public final qh50<Object> d;

    public jwy(m1h0 m1h0Var, Map map, l1h0 l1h0Var) {
        pwk pwkVar = new pwk(m1h0Var, 26);
        iyk0 iyk0Var = o1h0.a;
        this.b = new n1h0(map, pwkVar);
        this.c = l1h0Var;
        this.d = k5h0.a();
    }

    @Override // xsna.m1h0
    public final boolean a(Object obj) {
        return this.b.a(obj);
    }

    @Override // xsna.m1h0
    public final m1h0.a b(String str, gzs<? extends Object> gzsVar) {
        return this.b.b(str, gzsVar);
    }

    @Override // xsna.j1h0
    public final void c(Object obj, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-858296452);
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
                androidx.compose.runtime.b.f(-858296452, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i3 = i2 & 14;
            this.c.c(obj, jaiVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            boolean y = M.y(this) | M.y(obj);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new defpackage.o(23, this, obj);
                M.R(x);
            }
            bap.c(obj, (izs) x, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lys(i, 3, this, obj, jaiVar);
        }
    }

    @Override // xsna.m1h0
    public final Map<String, List<Object>> d() {
        qh50<Object> qh50Var = this.d;
        Object[] objArr = qh50Var.b;
        long[] jArr = qh50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            l1h0 l1h0Var = this.c;
                            if (l1h0Var.c.n(obj) == null) {
                                l1h0Var.b.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.b.d();
    }

    @Override // xsna.m1h0
    public final Object e(String str) {
        return this.b.e(str);
    }
}
