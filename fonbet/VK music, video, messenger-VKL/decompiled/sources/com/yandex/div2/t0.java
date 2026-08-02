package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionVideo;
import com.yandex.div2.s0;
import org.json.JSONObject;

/* compiled from: DivActionVideoTemplate.kt */
/* loaded from: classes8.dex */
public final class t0 implements JSONSerializable, JsonTemplate<DivActionVideo> {
    public final Field<Expression<DivActionVideo.Action>> a;
    public final Field<Expression<String>> b;

    public t0(Field<Expression<DivActionVideo.Action>> field, Field<Expression<String>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        s0.c cVar = (s0.c) BuiltInParserKt.getBuiltInParserComponent().i1.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return s0.c.b(builtInParsingContext, this);
    }
}
