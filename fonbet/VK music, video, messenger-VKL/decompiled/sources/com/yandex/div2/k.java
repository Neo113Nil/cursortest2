package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAction;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes8.dex */
public final class k implements Serializer, Deserializer {
    public final fe a;

    public k(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, DivAction.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        DivAction divAction = aVar.a;
        fe feVar = this.a;
        JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, feVar.k1);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", aVar.b, feVar.k1);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", aVar.c);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        fe feVar = this.a;
        return new DivAction.a((DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", feVar.k1), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", feVar.k1), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
