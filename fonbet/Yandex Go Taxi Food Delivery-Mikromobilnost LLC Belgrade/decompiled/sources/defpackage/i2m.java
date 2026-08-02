package defpackage;

import java.util.Arrays;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class i2m extends y8 {
    public final uyg a;
    public final SerialDescriptor b;

    public i2m(uyg uygVar) {
        this.a = uygVar;
        this.b = c.Companion.serializer().getDescriptor();
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        String str;
        uyg uygVar;
        u1m u1mVar;
        sf90 A = bvf0.A(sbxVar);
        kf5 kf5Var = sbxVar.b;
        w1m w1mVar = (w1m) A.c(qoi0.a(w1m.class));
        if (w1mVar == null || (u1mVar = w1mVar.a) == null || (str = u1mVar.a) == null) {
            str = "api/screen/unknown";
        }
        lg90 lg90Var = (lg90) bvf0.A(sbxVar).c(qoi0.a(lg90.class));
        xez0 xez0Var = lg90Var != null ? lg90Var.a : null;
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        String str2 = e7j0Var != null ? e7j0Var.a : null;
        if (xez0Var != null && (uygVar = this.a) != null) {
            uygVar.logJsonCreationTimings(String.format("FlexDocumentResponseJsonCreation.%s", Arrays.copyOf(new Object[]{str}, 1)), str, xez0Var, kotlin.collections.b.i(new Pair("reqId", str2), new Pair("jsonType", "DocumentResponse")));
        }
        ywl ywlVar = (ywl) sbxVar.a(gtq0.B(kf5Var, qoi0.a(ywl.class)), bVar);
        b bVar2 = (b) qcx.m(bVar).get("query");
        c m = bVar2 != null ? qcx.m(bVar2) : null;
        return new h2m(ywlVar, m != null ? (u1m) sbxVar.a(qke.n(gtq0.B(kf5Var, qoi0.a(u1m.class))), m) : null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public i2m() {
        this(null);
    }
}
