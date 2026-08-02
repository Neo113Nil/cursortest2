package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionSubmit;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes8.dex */
public final class a0 implements Serializer, Deserializer {
    public final fe a;

    public a0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DivActionSubmit deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING);
        fe feVar = this.a;
        return new DivActionSubmit(readExpression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", feVar.k1), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", feVar.k1), (DivActionSubmit.Request) JsonPropertyParser.read(parsingContext, jSONObject, "request", feVar.S0));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, DivActionSubmit divActionSubmit) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "container_id", divActionSubmit.a);
        List<DivAction> list = divActionSubmit.b;
        fe feVar = this.a;
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", list, feVar.k1);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divActionSubmit.c, feVar.k1);
        JsonPropertyParser.write(parsingContext, jSONObject, "request", divActionSubmit.d, feVar.S0);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
        return jSONObject;
    }
}
