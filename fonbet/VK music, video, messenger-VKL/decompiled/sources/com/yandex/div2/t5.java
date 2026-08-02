package com.yandex.div2;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.n4;
import com.yandex.div2.s5;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.aon;
import xsna.kkn;
import xsna.lkn;
import xsna.znn;

/* compiled from: DivInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class t5 implements Serializer, Deserializer {
    public final fe a;

    public t5(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, s5 s5Var) throws ParsingException {
        boolean z = s5Var instanceof s5.b;
        fe feVar = this.a;
        if (z) {
            return ((n4.a) feVar.q3.getValue()).serialize(parsingContext, ((s5.b) s5Var).b);
        }
        if (s5Var instanceof s5.a) {
            lkn lknVar = (lkn) feVar.y2.getValue();
            kkn kknVar = ((s5.a) s5Var).b;
            lknVar.getClass();
            return lkn.b(parsingContext, kknVar);
        }
        if (!(s5Var instanceof s5.c)) {
            throw new NoWhenBranchMatchedException();
        }
        aon aonVar = (aon) feVar.K5.getValue();
        znn znnVar = ((s5.c) s5Var).b;
        aonVar.getClass();
        return aon.a(parsingContext, znnVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        if (hashCode != 106642798) {
            if (hashCode != 393594385) {
                if (hashCode == 575402001 && readString.equals(InAppPurchaseMetaData.KEY_CURRENCY)) {
                    ((lkn) feVar.y2.getValue()).getClass();
                    return new s5.a(lkn.a(parsingContext, jSONObject));
                }
            } else if (readString.equals("fixed_length")) {
                return new s5.b(((n4.a) feVar.q3.getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (readString.equals("phone")) {
            ((aon) feVar.K5.getValue()).getClass();
            return new s5.c(new znn((String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable")));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        w5 w5Var = orThrow instanceof w5 ? (w5) orThrow : null;
        if (w5Var != null) {
            return ((v5) feVar.u4.getValue()).resolve(parsingContext, w5Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
