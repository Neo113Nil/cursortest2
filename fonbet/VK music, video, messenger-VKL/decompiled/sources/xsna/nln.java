package xsna;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;
import xsna.jln;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class nln implements Serializer, Deserializer {
    public static JSONObject a(ParsingContext parsingContext, jln.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "down", aVar.a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, ToolBar.FORWARD, aVar.b);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.LEFT, aVar.c);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.RIGHT, aVar.d);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "up", aVar.e);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new jln.a(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "down", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ToolBar.FORWARD, typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.LEFT, typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.RIGHT, typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "up", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (jln.a) obj);
    }
}
