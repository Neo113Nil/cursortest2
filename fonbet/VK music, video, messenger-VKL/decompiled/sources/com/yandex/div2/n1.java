package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.g5;
import com.yandex.div2.m1;
import com.yandex.div2.p8;
import com.yandex.div2.u6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bpn;
import xsna.cpn;
import xsna.gnn;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class n1 implements Serializer, Deserializer {
    public final fe a;

    public n1(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, m1 m1Var) throws ParsingException {
        boolean z = m1Var instanceof m1.b;
        fe feVar = this.a;
        if (z) {
            return ((u6.a) feVar.P4.getValue()).serialize(parsingContext, ((m1.b) m1Var).b);
        }
        if (m1Var instanceof m1.d) {
            return ((p8.a) feVar.o6.getValue()).serialize(parsingContext, ((m1.d) m1Var).b);
        }
        if (m1Var instanceof m1.a) {
            return ((g5.d) feVar.U3.getValue()).serialize(parsingContext, ((m1.a) m1Var).b);
        }
        if (!(m1Var instanceof m1.e)) {
            if (m1Var instanceof m1.c) {
                return ((gnn) feVar.b5.getValue()).serialize(parsingContext, ((m1.c) m1Var).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        cpn cpnVar = (cpn) feVar.n7.getValue();
        bpn bpnVar = ((m1.e) m1Var).b;
        cpnVar.getClass();
        return cpn.b(parsingContext, bpnVar);
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
            case -30518633:
                if (readString.equals("nine_patch_image")) {
                    return new m1.c(((gnn) feVar.b5.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 89650992:
                if (readString.equals("gradient")) {
                    return new m1.b(((u6.a) feVar.P4.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new m1.a(((g5.d) feVar.U3.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109618859:
                if (readString.equals("solid")) {
                    ((cpn) feVar.n7.getValue()).getClass();
                    return new m1.e(cpn.a(parsingContext, jSONObject));
                }
                break;
            case 1881846096:
                if (readString.equals("radial_gradient")) {
                    return new m1.d(((p8.a) feVar.o6.getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        q1 q1Var = orThrow instanceof q1 ? (q1) orThrow : null;
        if (q1Var != null) {
            return ((p1) feVar.H1.getValue()).resolve(parsingContext, q1Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
