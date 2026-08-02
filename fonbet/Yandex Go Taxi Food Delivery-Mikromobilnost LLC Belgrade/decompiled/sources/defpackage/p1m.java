package defpackage;

import flex.parser.FlexParserException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class p1m extends y8 {
    public final SerialDescriptor a = c.Companion.serializer().getDescriptor();

    public static uwl b(sbx sbxVar, c cVar) {
        b bVar = (b) cVar.get("actions");
        if (bVar instanceof c) {
            return (uwl) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(uwl.class))), bVar);
        }
        if ((bVar instanceof JsonNull) || bVar == null) {
            return null;
        }
        throw new FlexParserException(new lyg("Actions should be json object but actual value: " + bVar, null, 56));
    }

    public static see c(sbx sbxVar, c cVar) {
        b bVar = (b) cVar.get("ui");
        if (bVar instanceof c) {
            return (see) sbxVar.a(gtq0.B(sbxVar.b, qoi0.a(see.class)), (c) bVar);
        }
        if (bVar != null) {
            throw new FlexParserException(new lyg("Content should be json object but actual value: " + bVar, null, 56));
        }
        throw new FlexParserException(new lyg("Missing mandatory field 'ui' (existing keys: " + cVar.a.keySet() + Extension.C_BRAKE, null, 56));
    }

    public static q370 d(sbx sbxVar, c cVar) {
        b bVar = (b) cVar.get("context");
        if (bVar instanceof c) {
            return (q370) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(q370.class))), bVar);
        }
        if ((bVar instanceof JsonNull) || bVar == null) {
            return null;
        }
        throw new FlexParserException(new lyg("Context should be json object but actual value: " + bVar, null, 56));
    }

    public static mjm0 e(sbx sbxVar, c cVar) {
        b bVar = (b) cVar.get("scaffold");
        if (bVar instanceof c) {
            return (mjm0) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(mjm0.class))), bVar);
        }
        if ((bVar instanceof JsonNull) || bVar == null) {
            return null;
        }
        throw new FlexParserException(new lyg("Scaffold should be json object but actual value: " + bVar, null, 56));
    }

    public static cnr0 f(sbx sbxVar, c cVar) {
        b bVar = (b) cVar.get("shared");
        if (bVar instanceof c) {
            return (cnr0) sbxVar.a(gtq0.B(sbxVar.b, qoi0.a(cnr0.class)), bVar);
        }
        if ((bVar instanceof JsonNull) || bVar == null) {
            return cnr0.b;
        }
        throw new FlexParserException(new lyg("Shared should be json object but actual value: " + bVar, null, 56));
    }

    public static wwl g(sbx sbxVar, c cVar) {
        b bVar = (b) cVar.get("transitionSettings");
        if (bVar instanceof c) {
            return (wwl) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(wwl.class))), bVar);
        }
        if ((bVar instanceof JsonNull) || bVar == null) {
            return null;
        }
        throw new FlexParserException(new lyg("TransitionSettings should be json object but actual value: " + bVar, null, 56));
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        bvf0.A(sbxVar).a();
        try {
            c m = qcx.m(bVar);
            return new ywl(c(sbxVar, m), e(sbxVar, m), f(sbxVar, m), b(sbxVar, m), d(sbxVar, m), g(sbxVar, m));
        } finally {
            bvf0.A(sbxVar).b();
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
