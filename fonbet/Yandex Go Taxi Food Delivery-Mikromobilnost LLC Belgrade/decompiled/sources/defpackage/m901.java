package defpackage;

import com.yandex.go.navigator.analitycs.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.p;

/* loaded from: classes12.dex */
public final class m901 {
    public final p a;
    public final a b;
    public final r0 c = bvf0.c(n901.a);
    public final j901 d = new j901(1, this);

    public m901(p pVar, a aVar) {
        this.a = pVar;
        this.b = aVar;
    }

    public final void a() {
        boolean l = jl40.l(this.c.getValue(), n901.a);
        p pVar = this.a;
        if (l) {
            pVar.getValue().provideTrafficLayer(new l901(this, 1));
        } else {
            pVar.getValue().provideTrafficLayer(new l901(this, 2));
        }
        pVar.getValue().provideTrafficLayer(new l901(this, 0));
    }
}
