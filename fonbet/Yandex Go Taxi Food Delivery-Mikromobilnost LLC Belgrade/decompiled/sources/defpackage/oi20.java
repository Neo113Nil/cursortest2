package defpackage;

import androidx.compose.material3.h;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class oi20 extends e530 implements fud, v0y {
    public LinkedHashMap a;

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        float f = ((y7m) npb1.c(this, h.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        o l0 = x910Var.l0(j);
        boolean z = isAttached() && !Float.isNaN(f) && y7m.a(f, 0.0f) > 0;
        int f0 = !Float.isNaN(f) ? kVar.f0(f) : 0;
        int i = l0.a;
        if (z) {
            i = Math.max(i, f0);
        }
        int i2 = l0.b;
        if (z) {
            i2 = Math.max(i2, f0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.a = linkedHashMap;
            }
            sa31 sa31Var = h.b;
            int round = Math.round((f0 - l0.a) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(sa31Var, Integer.valueOf(round));
            bqu bquVar = h.a;
            int round2 = Math.round((f0 - l0.b) / 2.0f);
            linkedHashMap.put(bquVar, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.a;
        if (map == null) {
            map = b.f();
        }
        return kVar.w(i, i2, map, new h2w(i, l0, i2, 1));
    }
}
