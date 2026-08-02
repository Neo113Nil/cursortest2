package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.utils.b;

/* loaded from: classes13.dex */
public final class jer0 {
    public final x2r0 a;
    public final r0 b;
    public final r0 c;
    public final r0 d;
    public final r0 e;

    public jer0(b bVar, as21 as21Var, x2r0 x2r0Var) {
        this.a = x2r0Var;
        r0 c = bvf0.c(Boolean.valueOf(bVar.e()));
        this.b = c;
        r0 c2 = bvf0.c(Boolean.valueOf(as21Var.a("FIELD_INAPP_ONLY_CALLS", false)));
        this.c = c2;
        this.d = c;
        this.e = c2;
    }

    public final void a(boolean z) {
        this.a.update(z);
        qv10.B(z, this.c, null);
    }

    public final void b(boolean z) {
        qv10.B(z, this.c, null);
    }

    public final void c(boolean z) {
        qv10.B(z, this.b, null);
    }
}
