package com.yandex.div2;

import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.td;
import com.yandex.div2.xd;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes8.dex */
public final class vd implements TemplateResolver<JSONObject, xd, td> {
    public final fe a;

    public vd(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final td resolve(ParsingContext parsingContext, xd xdVar, JSONObject jSONObject) {
        xd xdVar2 = xdVar;
        JSONObject jSONObject2 = jSONObject;
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, xdVar2.a, jSONObject2, BadConnectionSignaling.KEY_BAD_NET_BITRATE, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, xdVar2.b, jSONObject2, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING);
        Field<xd.a> field = xdVar2.c;
        fe feVar = this.a;
        return new td(resolveOptionalExpression, resolveExpression, (td.a) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, CommonCode.MapKey.HAS_RESOLUTION, feVar.p9, feVar.n9), JsonFieldResolver.resolveExpression(parsingContext, xdVar2.d, jSONObject2, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
