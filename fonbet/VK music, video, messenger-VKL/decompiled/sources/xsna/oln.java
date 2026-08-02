package xsna;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;
import xsna.qln;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class oln implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, qln.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "down", aVar.a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ToolBar.FORWARD, aVar.b);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.LEFT, aVar.c);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.RIGHT, aVar.d);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "up", aVar.e);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        qln.a aVar = (qln.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new qln.a(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "down", typeHelper, allowPropertyOverride, aVar != null ? aVar.a : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ToolBar.FORWARD, typeHelper, allowPropertyOverride, aVar != null ? aVar.b : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.LEFT, typeHelper, allowPropertyOverride, aVar != null ? aVar.c : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.RIGHT, typeHelper, allowPropertyOverride, aVar != null ? aVar.d : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "up", typeHelper, allowPropertyOverride, aVar != null ? aVar.e : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (qln.a) obj);
    }
}
