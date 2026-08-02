package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.yc;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivTimer.kt */
/* loaded from: classes8.dex */
public final class xc implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final List<DivAction> b;
    public final String c;
    public final List<DivAction> d;
    public final Expression<Long> e;
    public final String f;
    public Integer g;

    static {
        Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);
    }

    public xc(Expression<Long> expression, List<DivAction> list, String str, List<DivAction> list2, Expression<Long> expression2, String str2) {
        this.a = expression;
        this.b = list;
        this.c = str;
        this.d = list2;
        this.e = expression2;
        this.f = str2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        int i2;
        Integer num = this.g;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(xc.class).hashCode();
        List<DivAction> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = this.c.hashCode() + hashCode + i;
        List<DivAction> list2 = this.d;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i3 = hashCode2 + i2;
        Expression<Long> expression = this.e;
        int hashCode3 = i3 + (expression != null ? expression.hashCode() : 0);
        String str = this.f;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.g = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((yc.a) BuiltInParserKt.getBuiltInParserComponent().J8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
