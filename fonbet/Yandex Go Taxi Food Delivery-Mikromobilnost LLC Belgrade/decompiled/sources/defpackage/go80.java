package defpackage;

import com.yandex.go.places.map.ui.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class go80 {
    public final yac0 a;
    public final r0 b = bvf0.c(new zr00(null, null));
    public final n0 c = ffx.c(0, 0, null, 7);
    public final r0 d = bvf0.c(null);
    public boolean e = true;

    public go80(yac0 yac0Var) {
        this.a = yac0Var;
    }

    public final void a() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            ((zr00) value).getClass();
        } while (!r0Var.k(value, new zr00(null, null)));
    }

    public final tpr b() {
        return e.t(b.a(new com.yandex.go.places.map.data.repositories.b(this.b), this.a.e));
    }

    public final void c(float f, uc4 uc4Var) {
        r0 r0Var;
        Object value;
        Float valueOf;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            valueOf = Float.valueOf(f);
            ((zr00) value).getClass();
        } while (!r0Var.k(value, new zr00(uc4Var, valueOf)));
    }
}
