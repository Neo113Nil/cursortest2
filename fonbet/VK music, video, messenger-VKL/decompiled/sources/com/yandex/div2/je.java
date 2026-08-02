package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ke;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: PropertyVariable.kt */
/* loaded from: classes8.dex */
public final class je implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public final String b;
    public final String c;
    public final List<DivAction> d;
    public final Expression<DivEvaluableType> e;
    public Integer f;

    public je(Expression<String> expression, String str, String str2, List<DivAction> list, Expression<DivEvaluableType> expression2) {
        this.a = expression;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(je.class).hashCode();
        int i = 0;
        List<DivAction> list = this.d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        }
        int hashCode2 = this.e.hashCode() + hashCode + i;
        this.f = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ke.b) BuiltInParserKt.getBuiltInParserComponent().X9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
