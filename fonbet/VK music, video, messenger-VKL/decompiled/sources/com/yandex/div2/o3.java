package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.j3;
import com.yandex.div2.k3;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivDataTemplate.kt */
/* loaded from: classes8.dex */
public final class o3 implements JSONSerializable, JsonTemplate<j3> {
    public final Field<List<v4>> a;
    public final Field<String> b;
    public final Field<List<a>> c;
    public final Field<List<zc>> d;
    public final Field<Expression<DivTransitionSelector>> e;
    public final Field<List<ld>> f;
    public final Field<List<qd>> g;

    /* compiled from: DivDataTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<j3.b> {
        public final Field<nb> a;
        public final Field<Long> b;

        public a(Field<nb> field, Field<Long> field2) {
            this.a = field;
            this.b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            m3 m3Var = (m3) BuiltInParserKt.getBuiltInParserComponent().H2.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            m3Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(builtInParsingContext, jSONObject, TtmlNode.TAG_DIV, this.a, m3Var.a.A9);
            JsonFieldParser.writeField(builtInParsingContext, jSONObject, "state_id", this.b);
            return jSONObject;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, DivTransitionSelector.NONE, null, 2, null);
    }

    public o3(Field<List<v4>> field, Field<String> field2, Field<List<a>> field3, Field<List<zc>> field4, Field<Expression<DivTransitionSelector>> field5, Field<List<ld>> field6, Field<List<qd>> field7) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((k3.c) BuiltInParserKt.getBuiltInParserComponent().F2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
