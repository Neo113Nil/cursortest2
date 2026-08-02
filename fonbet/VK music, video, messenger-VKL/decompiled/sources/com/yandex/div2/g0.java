package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.f0;
import java.util.List;
import org.json.JSONObject;
import xsna.gkn;

/* compiled from: DivActionSubmitTemplate.kt */
/* loaded from: classes8.dex */
public final class g0 implements JSONSerializable, JsonTemplate<DivActionSubmit> {
    public final Field<Expression<String>> a;
    public final Field<List<h0>> b;
    public final Field<List<h0>> c;
    public final Field<a> d;

    /* compiled from: DivActionSubmitTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivActionSubmit.Request> {
        public final Field<List<C2113a>> a;
        public final Field<Expression<DivActionSubmit.Request.Method>> b;
        public final Field<Expression<Uri>> c;

        /* compiled from: DivActionSubmitTemplate.kt */
        /* renamed from: com.yandex.div2.g0$a$a, reason: collision with other inner class name */
        public static final class C2113a implements JSONSerializable, JsonTemplate<DivActionSubmit.Request.a> {
            public final Field<Expression<String>> a;
            public final Field<Expression<String>> b;

            public C2113a(Field<Expression<String>> field, Field<Expression<String>> field2) {
                this.a = field;
                this.b = field2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public final JSONObject writeToJSON() {
                d0 d0Var = (d0) BuiltInParserKt.getBuiltInParserComponent().W0.getValue();
                ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
                d0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "name", this.a);
                JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "value", this.b);
                return jSONObject;
            }
        }

        static {
            Expression.Companion.constant$default(Expression.Companion, DivActionSubmit.Request.Method.POST, null, 2, null);
        }

        public a(Field<List<C2113a>> field, Field<Expression<DivActionSubmit.Request.Method>> field2, Field<Expression<Uri>> field3) {
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((f0.c) BuiltInParserKt.getBuiltInParserComponent().T0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public g0(Field<Expression<String>> field, Field<List<h0>> field2, Field<List<h0>> field3, Field<a> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((gkn) BuiltInParserKt.getBuiltInParserComponent().Q0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
