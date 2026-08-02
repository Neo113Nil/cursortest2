package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.experiments.superapp.k;

/* loaded from: classes.dex */
public final class bo11 extends ao11 {
    public final wnt a;
    public final qc20 b;
    public final k c;
    public final blh d;
    public final String e = "typed_experiments";
    public final String f = "TypedExperimentsParserImpl";

    public bo11(wnt wntVar, qc20 qc20Var, k kVar, blh blhVar) {
        this.a = wntVar;
        this.b = qc20Var;
        this.c = kVar;
        this.d = blhVar;
    }

    public final ves0 a(b bVar) {
        return new ves0((zn11) ((xnt) this.a).d(bVar, zn11.Companion.serializer()));
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.e;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.f;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        ves0 a;
        blh blhVar = this.d;
        if (bVar instanceof c) {
            try {
                hd7 b = blhVar.b(ExperimentSource.PRODUCTS, false);
                try {
                    xa7 xa7Var = (xa7) ((xnt) this.a).d(bVar, xa7.Companion.serializer());
                    udq0.P(xa7Var, blhVar, b);
                    a = new ves0(xa7Var.c);
                } catch (Throwable th) {
                    xby.t(jst.e, "TypedExperimentsParser", th, null, 10);
                    a = a(bVar);
                }
            } catch (Throwable th2) {
                xby.t(jst.e, "TypedExperimentsParser", th2, null, 10);
                a = a(bVar);
            }
        } else {
            a = a(bVar);
        }
        if (((k5w0) this.c.a.c()).d) {
            return new co11(a.a);
        }
        ((m8f0) this.b.a).l(a);
        return new co11(null);
    }
}
