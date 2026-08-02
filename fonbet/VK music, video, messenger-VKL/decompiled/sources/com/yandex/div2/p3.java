package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.q3;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivDefaultIndicatorItemPlacement.kt */
/* loaded from: classes8.dex */
public final class p3 implements JSONSerializable, Hashable {
    public static final q4 c = new q4(Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null));
    public final q4 a;
    public Integer b;

    public p3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.a.hash() + fpf0.a(p3.class).hashCode();
        this.b = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((q3.a) BuiltInParserKt.getBuiltInParserComponent().J2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public p3() {
        this(c);
    }
}
