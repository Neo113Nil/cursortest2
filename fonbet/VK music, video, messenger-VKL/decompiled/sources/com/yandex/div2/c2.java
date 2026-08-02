package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.b2;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivChangeSetTransitionTemplate.kt */
/* loaded from: classes8.dex */
public final class c2 implements JSONSerializable, JsonTemplate<a2> {
    public final Field<List<h2>> a;

    public c2(Field<List<h2>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((b2.b) BuiltInParserKt.getBuiltInParserComponent().S1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
