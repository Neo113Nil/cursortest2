package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.ad;
import com.yandex.div2.bd;
import java.util.List;
import org.json.JSONObject;
import xsna.non;
import xsna.zpn;

/* compiled from: DivTooltipTemplate.kt */
/* loaded from: classes8.dex */
public final class gd implements JSONSerializable, JsonTemplate<DivTooltip> {
    public final Field<v0> a;
    public final Field<v0> b;
    public final Field<Expression<String>> c;
    public final Field<Expression<Boolean>> d;
    public final Field<nb> e;
    public final Field<Expression<Long>> f;
    public final Field<String> g;
    public final Field<fd> h;
    public final Field<non> i;
    public final Field<Expression<DivTooltip.Position>> j;
    public final Field<List<h0>> k;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        new bd.a(new zpn());
    }

    public gd(Field<v0> field, Field<v0> field2, Field<Expression<String>> field3, Field<Expression<Boolean>> field4, Field<nb> field5, Field<Expression<Long>> field6, Field<String> field7, Field<fd> field8, Field<non> field9, Field<Expression<DivTooltip.Position>> field10, Field<List<h0>> field11) {
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
        return ((ad.c) BuiltInParserKt.getBuiltInParserComponent().W8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
