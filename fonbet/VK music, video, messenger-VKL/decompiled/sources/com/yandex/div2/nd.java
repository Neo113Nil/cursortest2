package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.ke;
import com.yandex.div2.md;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bom0;
import xsna.cax;
import xsna.com0;
import xsna.dax;
import xsna.ll3;
import xsna.ml3;
import xsna.pfq0;
import xsna.pn70;
import xsna.qfq0;
import xsna.qn70;
import xsna.t8g;
import xsna.u8g;
import xsna.x08;
import xsna.y08;
import xsna.ywm;
import xsna.zwm;

/* compiled from: DivVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class nd implements Serializer, Deserializer {
    public final fe a;

    public nd(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, md mdVar) throws ParsingException {
        boolean z = mdVar instanceof md.h;
        fe feVar = this.a;
        if (z) {
            com0 com0Var = (com0) feVar.ga.getValue();
            bom0 bom0Var = ((md.h) mdVar).b;
            com0Var.getClass();
            return com0.b(parsingContext, bom0Var);
        }
        if (mdVar instanceof md.f) {
            qn70 qn70Var = (qn70) feVar.R9.getValue();
            pn70 pn70Var = ((md.f) mdVar).b;
            qn70Var.getClass();
            return qn70.b(parsingContext, pn70Var);
        }
        if (mdVar instanceof md.e) {
            dax daxVar = (dax) feVar.L9.getValue();
            cax caxVar = ((md.e) mdVar).b;
            daxVar.getClass();
            return dax.b(parsingContext, caxVar);
        }
        if (mdVar instanceof md.b) {
            y08 y08Var = (y08) feVar.j.getValue();
            x08 x08Var = ((md.b) mdVar).b;
            y08Var.getClass();
            return y08.b(parsingContext, x08Var);
        }
        if (mdVar instanceof md.c) {
            u8g u8gVar = (u8g) feVar.p.getValue();
            t8g t8gVar = ((md.c) mdVar).b;
            u8gVar.getClass();
            return u8g.b(parsingContext, t8gVar);
        }
        if (mdVar instanceof md.i) {
            qfq0 qfq0Var = (qfq0) feVar.ma.getValue();
            pfq0 pfq0Var = ((md.i) mdVar).b;
            qfq0Var.getClass();
            return qfq0.b(parsingContext, pfq0Var);
        }
        if (mdVar instanceof md.d) {
            zwm zwmVar = (zwm) feVar.B.getValue();
            ywm ywmVar = ((md.d) mdVar).b;
            zwmVar.getClass();
            return zwm.b(parsingContext, ywmVar);
        }
        if (!(mdVar instanceof md.a)) {
            if (mdVar instanceof md.g) {
                return ((ke.b) feVar.X9.getValue()).serialize(parsingContext, ((md.g) mdVar).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        ml3 ml3Var = (ml3) feVar.d.getValue();
        ll3 ll3Var = ((md.a) mdVar).b;
        ml3Var.getClass();
        return ml3.b(parsingContext, ll3Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        switch (hashCode) {
            case -1034364087:
                if (readString.equals("number")) {
                    ((qn70) feVar.R9.getValue()).getClass();
                    return new md.f(qn70.a(parsingContext, jSONObject));
                }
                break;
            case -993141291:
                if (readString.equals("property")) {
                    return new md.g(((ke.b) feVar.X9.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    ((com0) feVar.ga.getValue()).getClass();
                    return new md.h(com0.a(parsingContext, jSONObject));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    ((qfq0) feVar.ma.getValue()).getClass();
                    return new md.i(qfq0.a(parsingContext, jSONObject));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    ((zwm) feVar.B.getValue()).getClass();
                    return new md.d(zwm.a(parsingContext, jSONObject));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    ((y08) feVar.j.getValue()).getClass();
                    return new md.b(y08.a(parsingContext, jSONObject));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    ((ml3) feVar.d.getValue()).getClass();
                    return new md.a(ml3.a(parsingContext, jSONObject));
                }
                break;
            case 94842723:
                if (readString.equals("color")) {
                    ((u8g) feVar.p.getValue()).getClass();
                    return new md.c(u8g.a(parsingContext, jSONObject));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    ((dax) feVar.L9.getValue()).getClass();
                    return new md.e(dax.a(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        qd qdVar = orThrow instanceof qd ? (qd) orThrow : null;
        if (qdVar != null) {
            return ((pd) feVar.j9.getValue()).resolve(parsingContext, qdVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
