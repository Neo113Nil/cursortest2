package defpackage;

import com.yandex.xplat.common.NetworkMethod;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class f7j0 implements vv50 {
    @Override // defpackage.vv50
    public final md51 d(hz50 hz50Var) {
        if (hz50Var.d().b.get("X-Request-ID") != null) {
            return zmx.d(hz50Var);
        }
        NetworkMethod method = hz50Var.method();
        String c = hz50Var.c();
        wj00 a = hz50Var.a();
        wj00 b = hz50Var.b();
        wj00 d = hz50Var.d();
        d.k("X-Request-ID", UUID.randomUUID().toString());
        return zmx.d(new tsp0(method, c, a, b, d, hz50Var.encoding()));
    }
}
