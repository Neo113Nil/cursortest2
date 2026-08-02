package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivText;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class ob implements Serializer, Deserializer {
    public final fe a;

    public ob(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, DivText.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        List<DivAction> list = aVar.a;
        fe feVar = this.a;
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", list, feVar.k1);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "images", aVar.b, feVar.A8);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", aVar.c, feVar.x8);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", aVar.d);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        fe feVar = this.a;
        return new DivText.a(JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", feVar.k1), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", feVar.A8), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", feVar.x8));
    }
}
