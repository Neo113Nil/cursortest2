package com.yandex.div2;

import com.huawei.hms.framework.common.BundleUtil;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.m4;
import com.yandex.div2.n4;
import com.yandex.div2.o4;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMaskTemplate.kt */
/* loaded from: classes8.dex */
public final class p4 implements JSONSerializable, JsonTemplate<m4> {
    public final Field<Expression<Boolean>> a;
    public final Field<Expression<String>> b;
    public final Field<List<a>> c;
    public final Field<String> d;

    /* compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<m4.a> {
        public final Field<Expression<String>> a;
        public final Field<Expression<String>> b;
        public final Field<Expression<String>> c;

        static {
            Expression.Companion.constant$default(Expression.Companion, BundleUtil.UNDERLINE_TAG, null, 2, null);
        }

        public a(Field<Expression<String>> field, Field<Expression<String>> field2, Field<Expression<String>> field3) {
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            o4.b bVar = (o4.b) BuiltInParserKt.getBuiltInParserComponent().u3.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            bVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "key", this.a);
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "placeholder", this.b);
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "regex", this.c);
            return jSONObject;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    }

    public p4(Field<Expression<Boolean>> field, Field<Expression<String>> field2, Field<List<a>> field3, Field<String> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((n4.b) BuiltInParserKt.getBuiltInParserComponent().r3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
