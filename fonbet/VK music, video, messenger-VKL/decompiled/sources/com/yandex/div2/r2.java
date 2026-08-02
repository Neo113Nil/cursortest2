package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.o2;
import com.yandex.div2.p2;
import com.yandex.div2.q2;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivCollectionItemBuilderTemplate.kt */
/* loaded from: classes8.dex */
public final class r2 implements JSONSerializable, JsonTemplate<o2> {
    public final Field<Expression<JSONArray>> a;
    public final Field<String> b;
    public final Field<List<a>> c;

    /* compiled from: DivCollectionItemBuilderTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<o2.a> {
        public final Field<nb> a;
        public final Field<Expression<String>> b;
        public final Field<Expression<Boolean>> c;

        static {
            Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
        }

        public a(Field<nb> field, Field<Expression<String>> field2, Field<Expression<Boolean>> field3) {
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((q2.b) BuiltInParserKt.getBuiltInParserComponent().h2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public r2(Field<Expression<JSONArray>> field, Field<String> field2, Field<List<a>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((p2.b) BuiltInParserKt.getBuiltInParserComponent().e2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
