package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPatch;
import com.yandex.div2.s7;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivPatchTemplate.kt */
/* loaded from: classes8.dex */
public final class t7 implements JSONSerializable, JsonTemplate<DivPatch> {
    public final Field<List<a>> a;
    public final Field<Expression<DivPatch.Mode>> b;
    public final Field<List<h0>> c;
    public final Field<List<h0>> d;

    /* compiled from: DivPatchTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivPatch.a> {
        public final Field<String> a;
        public final Field<List<nb>> b;

        public a(Field<String> field, Field<List<nb>> field2) {
            this.a = field;
            this.b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            q7 q7Var = (q7) BuiltInParserKt.getBuiltInParserComponent().F5.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            q7Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(builtInParsingContext, jSONObject, "id", this.a);
            JsonFieldParser.writeListField(builtInParsingContext, jSONObject, "items", this.b, q7Var.a.A9);
            return jSONObject;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, DivPatch.Mode.PARTIAL, null, 2, null);
    }

    public t7(Field<List<a>> field, Field<Expression<DivPatch.Mode>> field2, Field<List<h0>> field3, Field<List<h0>> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((s7.c) BuiltInParserKt.getBuiltInParserComponent().D5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
