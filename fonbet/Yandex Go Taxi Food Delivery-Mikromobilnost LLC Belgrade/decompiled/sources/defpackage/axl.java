package defpackage;

import flex.parser.FlexParserException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class axl extends ia {
    public final SerialDescriptor a = c.Companion.serializer().getDescriptor();

    @Override // defpackage.ia
    public final Object b(Throwable th) {
        return new uwl(null, null, null, null, null, null);
    }

    @Override // defpackage.ia
    public final Object c(sbx sbxVar, b bVar) {
        if (!(bVar instanceof c)) {
            if (bVar instanceof JsonNull) {
                return new uwl(null, null, null, null, null, null);
            }
            throw new FlexParserException(new lyg("Unexpected document actions format: " + bVar, null, 56));
        }
        c cVar = (c) bVar;
        b bVar2 = (b) cVar.get("onAwake");
        kr krVar = bVar2 != null ? (kr) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(kr.class))), bVar2) : null;
        b bVar3 = (b) cVar.get("onApply");
        kr krVar2 = bVar3 != null ? (kr) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(kr.class))), bVar3) : null;
        b bVar4 = (b) cVar.get("onReload");
        kr krVar3 = bVar4 != null ? (kr) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(kr.class))), bVar4) : null;
        b bVar5 = (b) cVar.get("onFinish");
        kr krVar4 = bVar5 != null ? (kr) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(kr.class))), bVar5) : null;
        b bVar6 = (b) cVar.get("onReloadingFailed");
        kr krVar5 = bVar6 != null ? (kr) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(kr.class))), bVar6) : null;
        b bVar7 = (b) cVar.get("onError");
        return new uwl(krVar, krVar2, bVar7 != null ? (kr) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(kr.class))), bVar7) : null, krVar3, krVar4, krVar5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
