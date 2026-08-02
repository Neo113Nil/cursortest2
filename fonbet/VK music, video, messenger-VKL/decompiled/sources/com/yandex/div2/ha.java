package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.fa;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.izs;
import xsna.ukn;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes8.dex */
public final class ha implements Serializer, Deserializer {
    public final fe a;

    public ha(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, fa.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.END, aVar.a);
        y3 y3Var = aVar.b;
        fe feVar = this.a;
        JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, feVar.Y2);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", aVar.c);
        ukn uknVar = aVar.d;
        bpn0 bpn0Var = feVar.V2;
        JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", uknVar, bpn0Var);
        JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", aVar.e, bpn0Var);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.END, typeHelper, izsVar);
        fe feVar = this.a;
        y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", feVar.Y2);
        Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, izsVar);
        bpn0 bpn0Var = feVar.V2;
        return new fa.a(readOptionalExpression, y3Var, readOptionalExpression2, (ukn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_active_style", bpn0Var), (ukn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_inactive_style", bpn0Var));
    }
}
