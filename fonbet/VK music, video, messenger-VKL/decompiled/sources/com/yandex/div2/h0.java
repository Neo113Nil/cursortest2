package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAction;
import com.yandex.div2.j;
import java.util.List;
import org.json.JSONObject;
import xsna.tkn;

/* compiled from: DivActionTemplate.kt */
/* loaded from: classes8.dex */
public final class h0 implements JSONSerializable, JsonTemplate<DivAction> {
    public final Field<tkn> a;
    public final Field<Expression<Boolean>> b;
    public final Field<Expression<String>> c;
    public final Field<Expression<Uri>> d;
    public final Field<List<a>> e;
    public final Field<JSONObject> f;
    public final Field<Expression<Uri>> g;
    public final Field<String> h;
    public final Field<Expression<DivAction.Target>> i;
    public final Field<o0> j;
    public final Field<Expression<Uri>> k;

    /* compiled from: DivActionTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivAction.a> {
        public final Field<h0> a;
        public final Field<List<h0>> b;
        public final Field<Expression<String>> c;

        public a(Field<h0> field, Field<List<h0>> field2, Field<Expression<String>> field3) {
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((l) BuiltInParserKt.getBuiltInParserComponent().o1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public h0(Field<tkn> field, Field<Expression<Boolean>> field2, Field<Expression<String>> field3, Field<Expression<Uri>> field4, Field<List<a>> field5, Field<JSONObject> field6, Field<Expression<Uri>> field7, Field<String> field8, Field<Expression<DivAction.Target>> field9, Field<o0> field10, Field<Expression<Uri>> field11) {
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
        return ((j.c) BuiltInParserKt.getBuiltInParserComponent().l1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
