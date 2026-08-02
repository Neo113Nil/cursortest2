package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.g5;
import com.yandex.div2.p8;
import com.yandex.div2.q1;
import com.yandex.div2.u6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.dpn;
import xsna.fpn;
import xsna.hnn;
import xsna.jnn;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class o1 implements Serializer, Deserializer {
    public final fe a;

    public o1(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, q1 q1Var) throws ParsingException {
        boolean z = q1Var instanceof q1.b;
        fe feVar = this.a;
        if (z) {
            return ((u6.b) feVar.Q4.getValue()).serialize(parsingContext, ((q1.b) q1Var).a);
        }
        if (q1Var instanceof q1.d) {
            return ((p8.b) feVar.p6.getValue()).serialize(parsingContext, ((q1.d) q1Var).a);
        }
        if (q1Var instanceof q1.a) {
            return ((g5.e) feVar.V3.getValue()).serialize(parsingContext, ((q1.a) q1Var).a);
        }
        if (!(q1Var instanceof q1.e)) {
            if (q1Var instanceof q1.c) {
                return ((hnn) feVar.c5.getValue()).serialize(parsingContext, ((q1.c) q1Var).a);
            }
            throw new NoWhenBranchMatchedException();
        }
        dpn dpnVar = (dpn) feVar.o7.getValue();
        fpn fpnVar = ((q1.e) q1Var).a;
        dpnVar.getClass();
        return dpn.b(parsingContext, fpnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object cVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        q1 q1Var = entityTemplate instanceof q1 ? (q1) entityTemplate : null;
        if (q1Var != null) {
            if (q1Var instanceof q1.b) {
                readString = "gradient";
            } else if (q1Var instanceof q1.d) {
                readString = "radial_gradient";
            } else if (q1Var instanceof q1.a) {
                readString = "image";
            } else if (q1Var instanceof q1.e) {
                readString = "solid";
            } else {
                if (!(q1Var instanceof q1.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "nine_patch_image";
            }
        }
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        switch (hashCode) {
            case -30518633:
                if (readString.equals("nine_patch_image")) {
                    cVar = new q1.c(((hnn) feVar.c5.getValue()).deserialize(parsingContext, (jnn) (q1Var != null ? q1Var.a() : null), jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 89650992:
                if (readString.equals("gradient")) {
                    cVar = new q1.b(((u6.b) feVar.Q4.getValue()).deserialize(parsingContext, (v6) (q1Var != null ? q1Var.a() : null), jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 100313435:
                if (readString.equals("image")) {
                    cVar = new q1.a(((g5.e) feVar.V3.getValue()).deserialize(parsingContext, (h5) (q1Var != null ? q1Var.a() : null), jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 109618859:
                if (readString.equals("solid")) {
                    dpn dpnVar = (dpn) feVar.o7.getValue();
                    Object a = q1Var != null ? q1Var.a() : null;
                    dpnVar.getClass();
                    cVar = new q1.e(dpn.a(parsingContext, (fpn) a, jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 1881846096:
                if (readString.equals("radial_gradient")) {
                    cVar = new q1.d(((p8.b) feVar.p6.getValue()).deserialize(parsingContext, (x8) (q1Var != null ? q1Var.a() : null), jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
    }
}
