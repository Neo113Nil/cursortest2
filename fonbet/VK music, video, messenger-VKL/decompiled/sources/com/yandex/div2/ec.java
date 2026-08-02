package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.fc;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivTextRangeBorder.kt */
/* loaded from: classes8.dex */
public final class ec implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final va b;
    public Integer c;

    public ec() {
        this(null, null);
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(ec.class).hashCode();
        Expression<Long> expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        va vaVar = this.b;
        int hash = hashCode2 + (vaVar != null ? vaVar.hash() : 0);
        this.c = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        fc.a aVar = (fc.a) BuiltInParserKt.getBuiltInParserComponent().g8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "corner_radius", this.a);
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "stroke", this.b, aVar.a.I7);
        return jSONObject;
    }

    public ec(Expression<Long> expression, va vaVar) {
        this.a = expression;
        this.b = vaVar;
    }
}
