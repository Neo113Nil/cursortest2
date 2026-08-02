package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.w3;
import org.json.JSONObject;
import xsna.tkn;

/* compiled from: DivDisappearActionTemplate.kt */
/* loaded from: classes8.dex */
public final class x3 implements JSONSerializable, JsonTemplate<v3> {
    public final Field<Expression<Long>> a;
    public final Field<tkn> b;
    public final Field<Expression<Boolean>> c;
    public final Field<Expression<String>> d;
    public final Field<Expression<Long>> e;
    public final Field<JSONObject> f;
    public final Field<Expression<Uri>> g;
    public final Field<String> h;
    public final Field<o0> i;
    public final Field<Expression<Uri>> j;
    public final Field<Expression<Long>> k;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 800L, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public x3(Field<Expression<Long>> field, Field<tkn> field2, Field<Expression<Boolean>> field3, Field<Expression<String>> field4, Field<Expression<Long>> field5, Field<JSONObject> field6, Field<Expression<Uri>> field7, Field<String> field8, Field<o0> field9, Field<Expression<Uri>> field10, Field<Expression<Long>> field11) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
        this.h = field8;
        this.i = field9;
        this.j = field10;
        this.k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((w3.b) BuiltInParserKt.getBuiltInParserComponent().Q2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
