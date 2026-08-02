package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Map;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes.dex */
public final class oci {
    public final ici a;
    public final lci b;
    public final wiq0 c;
    public final n0 d;
    public final eci0 e;
    public boolean f;

    public oci(ici iciVar, lci lciVar, wiq0 wiq0Var) {
        this.a = iciVar;
        this.b = lciVar;
        this.c = wiq0Var;
        n0 b = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
        b.g(zy11.a);
        this.d = b;
        this.e = e.c(b);
    }

    public final boolean a() {
        nu1 c;
        if (!this.a.a()) {
            return false;
        }
        if (this.f) {
            return true;
        }
        pex0 m = ((k) this.c).m();
        if (m == null || (c = b.c(m)) == null || !c.h) {
            return false;
        }
        return jl40.l(c.b, (String) ((Map) this.b.a.getValue()).get(c.a.b));
    }
}
