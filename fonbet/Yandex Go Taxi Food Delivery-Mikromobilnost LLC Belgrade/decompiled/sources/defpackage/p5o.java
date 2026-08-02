package defpackage;

import kotlin.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class p5o extends y8 {
    public final vit a;
    public final sul b;
    public final zjr c = new zjr(xfz.b(p5o.class.getSimpleName()));
    public final o5o d = new o5o(0, this);
    public final SerialDescriptor e = c.Companion.serializer().getDescriptor();

    public p5o(vit vitVar, sul sulVar) {
        this.a = vitVar;
        this.b = sulVar;
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        u2l u2lVar;
        String str;
        xtl xtlVar = (xtl) bvf0.A(sbxVar).c(qoi0.a(xtl.class));
        nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
        if (nezVar != null && (str = nezVar.a) != null) {
            this.c.f(str);
        }
        if (xtlVar == null || (u2lVar = xtlVar.a) == null) {
            sul sulVar = this.b;
            o5o o5oVar = this.d;
            if (sulVar != null) {
                e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
                u2lVar = new u2l(new qul(0, a.a(new in2(3, sulVar, new zr50[]{new zr50(e7j0Var != null ? e7j0Var.a : null)}, o5oVar))));
            } else {
                u2lVar = new u2l(o5oVar);
            }
        }
        c cVar = (c) bVar;
        vit vitVar = this.a;
        vitVar.getClass();
        JSONObject E = gwk0.E(cVar);
        ((hah) ((v2l) vitVar.b)).getClass();
        kvo kvoVar = omk.i;
        return new n5o(gtq0.n(u2lVar, E), cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.e;
    }
}
