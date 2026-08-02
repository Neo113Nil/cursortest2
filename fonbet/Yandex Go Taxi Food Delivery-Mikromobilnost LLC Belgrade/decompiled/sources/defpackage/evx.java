package defpackage;

import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.token.a;

/* loaded from: classes9.dex */
public final class evx {
    public final g a;
    public final a b;

    public evx(g gVar, a aVar) {
        this.a = gVar;
        this.b = aVar;
    }

    public final dvx a(String str) {
        g gVar = this.a;
        boolean Kg = gVar.a.Kg();
        a aVar = this.b;
        boolean g = aVar.g();
        boolean Ng = gVar.a.Ng();
        gVar.a.Mg();
        return new dvx(str, aVar.c(), Kg, g, Ng);
    }
}
