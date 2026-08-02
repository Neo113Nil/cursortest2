package defpackage;

import flex.parser.FlexParserException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class odx {
    public final zcx a;
    public final KSerializer b;

    public odx(zcx zcxVar, KSerializer kSerializer) {
        this.a = zcxVar;
        this.b = kSerializer;
    }

    public final kg90 a(InputStream inputStream) {
        ig90 ig90Var;
        String str;
        zcx zcxVar = this.a;
        bvf0.A(zcxVar).e(new hns0());
        bvf0.A(zcxVar).a();
        e7j0 e7j0Var = (e7j0) bvf0.A(zcxVar).c(qoi0.a(e7j0.class));
        try {
            try {
                try {
                    jg90 jg90Var = new jg90(ffx.A(zcxVar, this.b, inputStream), e7j0Var != null ? e7j0Var.a : null, b());
                    bvf0.A(zcxVar).b();
                    return jg90Var;
                } catch (IllegalArgumentException e) {
                    str = (24 & 8) != 0 ? null : "section";
                    b.r(kotlin.sequences.b.i(j73.v(new Pair[]{null, str != null ? new Pair("elementType", str) : null})));
                    b();
                    ig90Var = new ig90(e);
                    bvf0.A(zcxVar).b();
                    return ig90Var;
                } catch (Throwable th) {
                    str = (24 & 8) != 0 ? null : "section";
                    b.r(kotlin.sequences.b.i(j73.v(new Pair[]{null, str != null ? new Pair("elementType", str) : null})));
                    b();
                    ig90Var = new ig90(th);
                    bvf0.A(zcxVar).b();
                    return ig90Var;
                }
            } catch (FlexParserException e2) {
                b();
                ig90Var = new ig90(e2);
                bvf0.A(zcxVar).b();
                return ig90Var;
            } catch (IOException e3) {
                str = (24 & 8) != 0 ? null : "section";
                b.r(kotlin.sequences.b.i(j73.v(new Pair[]{null, str != null ? new Pair("elementType", str) : null})));
                b();
                ig90Var = new ig90(e3);
                bvf0.A(zcxVar).b();
                return ig90Var;
            }
        } catch (Throwable th2) {
            bvf0.A(zcxVar).b();
            throw th2;
        }
    }

    public final List b() {
        ArrayList arrayList;
        hns0 hns0Var = (hns0) bvf0.A(this.a).c(qoi0.a(hns0.class));
        return (hns0Var == null || (arrayList = hns0Var.a) == null) ? EmptyList.a : arrayList;
    }
}
