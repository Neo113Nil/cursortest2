package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ae;
import org.json.JSONObject;
import xsna.tkn;

/* compiled from: DivVisibilityActionTemplate.kt */
/* loaded from: classes8.dex */
public final class be implements JSONSerializable, JsonTemplate<zd> {
    public final Field<tkn> a;
    public final Field<Expression<Boolean>> b;
    public final Field<Expression<String>> c;
    public final Field<Expression<Long>> d;
    public final Field<JSONObject> e;
    public final Field<Expression<Uri>> f;
    public final Field<String> g;
    public final Field<o0> h;
    public final Field<Expression<Uri>> i;
    public final Field<Expression<Long>> j;
    public final Field<Expression<Long>> k;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
        Expression.Companion.constant$default(companion, 800L, null, 2, null);
        Expression.Companion.constant$default(companion, 50L, null, 2, null);
    }

    public be(Field<tkn> field, Field<Expression<Boolean>> field2, Field<Expression<String>> field3, Field<Expression<Long>> field4, Field<JSONObject> field5, Field<Expression<Uri>> field6, Field<String> field7, Field<o0> field8, Field<Expression<Uri>> field9, Field<Expression<Long>> field10, Field<Expression<Long>> field11) {
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
        return ((ae.b) BuiltInParserKt.getBuiltInParserComponent().u9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
