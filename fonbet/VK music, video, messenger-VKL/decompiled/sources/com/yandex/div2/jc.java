package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.kc;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivTextRangeMaskBase.kt */
/* loaded from: classes8.dex */
public final class jc implements JSONSerializable, Hashable {
    public static final Expression<Boolean> c = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    public final Expression<Boolean> a;
    public Integer b;

    public jc(Expression<Boolean> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(jc.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        kc.a aVar = (kc.a) BuiltInParserKt.getBuiltInParserComponent().j8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "is_enabled", this.a);
        return jSONObject;
    }

    public jc() {
        this(c);
    }
}
