package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.c1;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivAppearanceSetTransitionTemplate.kt */
/* loaded from: classes8.dex */
public final class d1 implements JSONSerializable, JsonTemplate<b1> {
    public final Field<List<i1>> a;

    public d1(Field<List<i1>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((c1.b) BuiltInParserKt.getBuiltInParserComponent().x1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
