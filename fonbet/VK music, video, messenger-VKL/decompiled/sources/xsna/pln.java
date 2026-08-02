package xsna;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import xsna.jln;
import xsna.qln;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class pln implements TemplateResolver<JSONObject, qln.a, jln.a> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final jln.a resolve(ParsingContext parsingContext, qln.a aVar, JSONObject jSONObject) {
        qln.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<Expression<String>> field = aVar2.a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new jln.a(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "down", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.b, jSONObject2, ToolBar.FORWARD, typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.c, jSONObject2, TtmlNode.LEFT, typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.d, jSONObject2, TtmlNode.RIGHT, typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.e, jSONObject2, "up", typeHelper));
    }
}
