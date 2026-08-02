package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.ke;
import com.yandex.div2.qd;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.axm;
import xsna.b18;
import xsna.cxm;
import xsna.dom0;
import xsna.eax;
import xsna.fom0;
import xsna.gax;
import xsna.nl3;
import xsna.pl3;
import xsna.rfq0;
import xsna.rn70;
import xsna.tfq0;
import xsna.tn70;
import xsna.v8g;
import xsna.x8g;
import xsna.z08;

/* compiled from: DivVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class od implements Serializer, Deserializer {
    public final fe a;

    public od(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, qd qdVar) throws ParsingException {
        boolean z = qdVar instanceof qd.h;
        fe feVar = this.a;
        if (z) {
            dom0 dom0Var = (dom0) feVar.ha.getValue();
            fom0 fom0Var = ((qd.h) qdVar).a;
            dom0Var.getClass();
            return dom0.b(parsingContext, fom0Var);
        }
        if (qdVar instanceof qd.f) {
            rn70 rn70Var = (rn70) feVar.S9.getValue();
            tn70 tn70Var = ((qd.f) qdVar).a;
            rn70Var.getClass();
            return rn70.b(parsingContext, tn70Var);
        }
        if (qdVar instanceof qd.e) {
            eax eaxVar = (eax) feVar.M9.getValue();
            gax gaxVar = ((qd.e) qdVar).a;
            eaxVar.getClass();
            return eax.b(parsingContext, gaxVar);
        }
        if (qdVar instanceof qd.b) {
            z08 z08Var = (z08) feVar.k.getValue();
            b18 b18Var = ((qd.b) qdVar).a;
            z08Var.getClass();
            return z08.b(parsingContext, b18Var);
        }
        if (qdVar instanceof qd.c) {
            v8g v8gVar = (v8g) feVar.q.getValue();
            x8g x8gVar = ((qd.c) qdVar).a;
            v8gVar.getClass();
            return v8g.b(parsingContext, x8gVar);
        }
        if (qdVar instanceof qd.i) {
            rfq0 rfq0Var = (rfq0) feVar.na.getValue();
            tfq0 tfq0Var = ((qd.i) qdVar).a;
            rfq0Var.getClass();
            return rfq0.b(parsingContext, tfq0Var);
        }
        if (qdVar instanceof qd.d) {
            axm axmVar = (axm) feVar.C.getValue();
            cxm cxmVar = ((qd.d) qdVar).a;
            axmVar.getClass();
            return axm.b(parsingContext, cxmVar);
        }
        if (!(qdVar instanceof qd.a)) {
            if (qdVar instanceof qd.g) {
                return ((ke.c) feVar.Y9.getValue()).serialize(parsingContext, ((qd.g) qdVar).a);
            }
            throw new NoWhenBranchMatchedException();
        }
        nl3 nl3Var = (nl3) feVar.e.getValue();
        pl3 pl3Var = ((qd.a) qdVar).a;
        nl3Var.getClass();
        return nl3.b(parsingContext, pl3Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object fVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        qd qdVar = entityTemplate instanceof qd ? (qd) entityTemplate : null;
        if (qdVar != null) {
            if (qdVar instanceof qd.h) {
                readString = "string";
            } else if (qdVar instanceof qd.f) {
                readString = "number";
            } else if (qdVar instanceof qd.e) {
                readString = "integer";
            } else if (qdVar instanceof qd.b) {
                readString = "boolean";
            } else if (qdVar instanceof qd.c) {
                readString = "color";
            } else if (qdVar instanceof qd.i) {
                readString = "url";
            } else if (qdVar instanceof qd.d) {
                readString = "dict";
            } else if (qdVar instanceof qd.a) {
                readString = "array";
            } else {
                if (!(qdVar instanceof qd.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "property";
            }
        }
        int hashCode = readString.hashCode();
        qd qdVar2 = qdVar;
        fe feVar = this.a;
        switch (hashCode) {
            case -1034364087:
                if (readString.equals("number")) {
                    rn70 rn70Var = (rn70) feVar.S9.getValue();
                    Object a = qdVar2 != null ? qdVar2.a() : null;
                    rn70Var.getClass();
                    fVar = new qd.f(rn70.a(parsingContext, (tn70) a, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case -993141291:
                if (readString.equals("property")) {
                    fVar = new qd.g(((ke.c) feVar.Y9.getValue()).deserialize(parsingContext, (le) (qdVar2 != null ? qdVar2.a() : null), jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case -891985903:
                if (readString.equals("string")) {
                    dom0 dom0Var = (dom0) feVar.ha.getValue();
                    Object a2 = qdVar2 != null ? qdVar2.a() : null;
                    dom0Var.getClass();
                    fVar = new qd.h(dom0.a(parsingContext, (fom0) a2, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 116079:
                if (readString.equals("url")) {
                    rfq0 rfq0Var = (rfq0) feVar.na.getValue();
                    Object a3 = qdVar2 != null ? qdVar2.a() : null;
                    rfq0Var.getClass();
                    fVar = new qd.i(rfq0.a(parsingContext, (tfq0) a3, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 3083190:
                if (readString.equals("dict")) {
                    axm axmVar = (axm) feVar.C.getValue();
                    Object a4 = qdVar2 != null ? qdVar2.a() : null;
                    axmVar.getClass();
                    fVar = new qd.d(axm.a(parsingContext, (cxm) a4, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 64711720:
                if (readString.equals("boolean")) {
                    z08 z08Var = (z08) feVar.k.getValue();
                    Object a5 = qdVar2 != null ? qdVar2.a() : null;
                    z08Var.getClass();
                    fVar = new qd.b(z08.a(parsingContext, (b18) a5, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 93090393:
                if (readString.equals("array")) {
                    nl3 nl3Var = (nl3) feVar.e.getValue();
                    Object a6 = qdVar2 != null ? qdVar2.a() : null;
                    nl3Var.getClass();
                    fVar = new qd.a(nl3.a(parsingContext, (pl3) a6, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 94842723:
                if (readString.equals("color")) {
                    v8g v8gVar = (v8g) feVar.q.getValue();
                    Object a7 = qdVar2 != null ? qdVar2.a() : null;
                    v8gVar.getClass();
                    fVar = new qd.c(v8g.a(parsingContext, (x8g) a7, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 1958052158:
                if (readString.equals("integer")) {
                    eax eaxVar = (eax) feVar.M9.getValue();
                    Object a8 = qdVar2 != null ? qdVar2.a() : null;
                    eaxVar.getClass();
                    fVar = new qd.e(eax.a(parsingContext, (gax) a8, jSONObject));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
    }
}
