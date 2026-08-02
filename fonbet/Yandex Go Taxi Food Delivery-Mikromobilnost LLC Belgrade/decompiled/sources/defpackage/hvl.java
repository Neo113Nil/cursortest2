package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class hvl extends y8 {
    public final SerialDescriptor a = b.Companion.serializer().getDescriptor();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        b bVar2 = (b) qcx.m(bVar).get("id");
        String a = bVar2 != null ? qcx.n(bVar2).a() : null;
        if (a != null) {
            bvf0.A(sbxVar).e(new nhf(a));
        }
        sbxVar.getClass();
        eyk eykVar = (eyk) sbxVar.a(eyk.Companion.serializer(), bVar);
        return new cvl(eykVar.a, eykVar.b, eykVar.c, eykVar.d, eykVar.g, eykVar.e, eykVar.f, eykVar.h, eykVar.i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
