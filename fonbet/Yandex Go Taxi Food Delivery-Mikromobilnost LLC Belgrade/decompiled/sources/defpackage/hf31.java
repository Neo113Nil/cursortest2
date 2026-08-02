package defpackage;

import com.yandex.go.taxi.experiments.q;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class hf31 implements jh20 {
    public final q a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public hf31(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.jh20
    public final k2x b(gr80 gr80Var) {
        return (k2x) this.b.get(gr80Var);
    }
}
