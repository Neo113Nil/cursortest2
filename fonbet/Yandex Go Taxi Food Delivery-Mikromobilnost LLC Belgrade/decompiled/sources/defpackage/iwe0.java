package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.repository.SelectedMultiTariffsRepositoryImpl$selectOnly$$inlined$performOperation$2;
import com.yandex.go.taxi.tariffs.repository.g;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class iwe0 {
    public final wiq0 a;
    public final c8r b;
    public final g c;

    public iwe0(wiq0 wiq0Var, c8r c8rVar, g gVar) {
        this.a = wiq0Var;
        this.b = c8rVar;
        this.c = gVar;
    }

    public final mi31 a(String str) {
        String h = ((k) this.a).h();
        c8r c8rVar = this.b;
        mi31 b = c8r.b(c8rVar, str, h, null, 4);
        if (b != null) {
            if (!jl40.l(b.f, str)) {
                b = null;
            }
            if (b != null) {
                return b;
            }
        }
        mi31 b2 = c8r.b(c8rVar, str, null, null, 6);
        if (b2 == null || !jl40.l(b2.f, str)) {
            return null;
        }
        return b2;
    }

    public final void b(String str, String str2) {
        mi31 a;
        Set set;
        mi31 a2 = a(str2);
        if (a2 == null) {
            return;
        }
        pex0 pex0Var = a2.a;
        if (pex0Var.K0 && (a = a(str)) != null) {
            boolean z = a.a.K0;
            g gVar = this.c;
            Set b = z ? gVar.b() : Collections.singleton(a.f);
            jn40 jn40Var = pex0Var.V;
            if (jn40Var == null || (set = jn40Var.e) == null) {
                return;
            }
            tje.N(gVar.c, null, null, new SelectedMultiTariffsRepositoryImpl$selectOnly$$inlined$performOperation$2(gVar, a2.b, null, a.U(b, set)), 3);
        }
    }
}
