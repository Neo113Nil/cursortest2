package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.e;
import org.json.JSONObject;

/* compiled from: DivAccessibilityTemplate.kt */
/* loaded from: classes8.dex */
public final class f implements JSONSerializable, JsonTemplate<DivAccessibility> {
    public final Field<Expression<String>> a;
    public final Field<Expression<String>> b;
    public final Field<Expression<Boolean>> c;
    public final Field<Expression<DivAccessibility.Mode>> d;
    public final Field<Expression<Boolean>> e;
    public final Field<Expression<String>> f;
    public final Field<DivAccessibility.Type> g;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, DivAccessibility.Mode.DEFAULT, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivAccessibility.Type.c cVar = DivAccessibility.Type.Converter;
    }

    public f(Field<Expression<String>> field, Field<Expression<String>> field2, Field<Expression<Boolean>> field3, Field<Expression<DivAccessibility.Mode>> field4, Field<Expression<Boolean>> field5, Field<Expression<String>> field6, Field<DivAccessibility.Type> field7) {
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
        e.c cVar = (e.c) BuiltInParserKt.getBuiltInParserComponent().I.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return e.c.a(builtInParsingContext, this);
    }
}
