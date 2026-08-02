package defpackage;

import com.yandex.go.zone.repository.k;
import ru.yandex.taxi.experiments.p;

/* loaded from: classes8.dex */
public final class hd61 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ hd61(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new k((rqo) this.b.get());
            case 1:
                return new jd61((p) this.b.get());
            case 2:
                return new kd61((r8h) this.b.get());
            default:
                return new hf61((ah00) this.b.get());
        }
    }
}
