package com.yandex.div2;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.n4;
import com.yandex.div2.w5;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bon;
import xsna.don;
import xsna.mkn;
import xsna.okn;

/* compiled from: DivInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class u5 implements Serializer, Deserializer {
    public final fe a;

    public u5(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, w5 w5Var) throws ParsingException {
        boolean z = w5Var instanceof w5.b;
        fe feVar = this.a;
        if (z) {
            return ((n4.b) feVar.r3.getValue()).serialize(parsingContext, ((w5.b) w5Var).a);
        }
        if (w5Var instanceof w5.a) {
            mkn mknVar = (mkn) feVar.z2.getValue();
            okn oknVar = ((w5.a) w5Var).a;
            mknVar.getClass();
            return mkn.b(parsingContext, oknVar);
        }
        if (!(w5Var instanceof w5.c)) {
            throw new NoWhenBranchMatchedException();
        }
        bon bonVar = (bon) feVar.L5.getValue();
        don donVar = ((w5.c) w5Var).a;
        bonVar.getClass();
        return bon.a(parsingContext, donVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object cVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        w5 w5Var = entityTemplate instanceof w5 ? (w5) entityTemplate : null;
        if (w5Var != null) {
            if (w5Var instanceof w5.b) {
                readString = "fixed_length";
            } else if (w5Var instanceof w5.a) {
                readString = InAppPurchaseMetaData.KEY_CURRENCY;
            } else {
                if (!(w5Var instanceof w5.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "phone";
            }
        }
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        if (hashCode == 106642798) {
            if (readString.equals("phone")) {
                bon bonVar = (bon) feVar.L5.getValue();
                don donVar = (don) (w5Var != null ? w5Var.a() : null);
                bonVar.getClass();
                cVar = new w5.c(new don(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "raw_text_variable", parsingContext.getAllowPropertyOverride(), donVar != null ? donVar.a : null)));
                return cVar;
            }
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        if (hashCode == 393594385) {
            if (readString.equals("fixed_length")) {
                cVar = new w5.b(((n4.b) feVar.r3.getValue()).deserialize(parsingContext, (p4) (w5Var != null ? w5Var.a() : null), jSONObject));
                return cVar;
            }
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        if (hashCode == 575402001 && readString.equals(InAppPurchaseMetaData.KEY_CURRENCY)) {
            mkn mknVar = (mkn) feVar.z2.getValue();
            Object a = w5Var != null ? w5Var.a() : null;
            mknVar.getClass();
            cVar = new w5.a(mkn.a(parsingContext, (okn) a, jSONObject));
            return cVar;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
