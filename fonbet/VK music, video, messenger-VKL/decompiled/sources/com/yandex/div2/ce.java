package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.de;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: IndexDestination.kt */
/* loaded from: classes8.dex */
public final class ce implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public Integer b;

    public ce(Expression<Long> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(ce.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        de.a aVar = (de.a) BuiltInParserKt.getBuiltInParserComponent().F9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        return de.a.b(builtInParsingContext, this);
    }
}
