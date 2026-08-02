package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class inn implements TemplateResolver<JSONObject, jnn, fnn> {
    public final com.yandex.div2.fe a;

    public inn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fnn resolve(ParsingContext parsingContext, jnn jnnVar, JSONObject jSONObject) throws ParsingException {
        Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, jnnVar.a, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Field<com.yandex.div2.d> field = jnnVar.b;
        com.yandex.div2.fe feVar = this.a;
        return new fnn(resolveExpression, (com.yandex.div2.b) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "insets", feVar.G, feVar.E));
    }
}
