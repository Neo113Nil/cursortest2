package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.x6;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivMatchParentSize.kt */
/* loaded from: classes8.dex */
public final class w6 implements JSONSerializable, Hashable {
    public final aa a;
    public final aa b;
    public final Expression<Double> c;
    public Integer d;

    public w6() {
        this(null, null, null);
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(w6.class).hashCode();
        aa aaVar = this.a;
        int hash = hashCode + (aaVar != null ? aaVar.hash() : 0);
        aa aaVar2 = this.b;
        int hash2 = hash + (aaVar2 != null ? aaVar2.hash() : 0);
        Expression<Double> expression = this.c;
        int hashCode2 = hash2 + (expression != null ? expression.hashCode() : 0);
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((x6.a) BuiltInParserKt.getBuiltInParserComponent().V4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public w6(Expression expression, aa aaVar, aa aaVar2) {
        this.a = aaVar;
        this.b = aaVar2;
        this.c = expression;
    }
}
