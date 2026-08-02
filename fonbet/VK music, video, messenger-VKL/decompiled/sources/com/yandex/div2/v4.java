package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.u4;
import java.util.List;
import org.json.JSONObject;
import xsna.vln;

/* compiled from: DivFunctionTemplate.kt */
/* loaded from: classes8.dex */
public final class v4 implements JSONSerializable, JsonTemplate<t4> {
    public final Field<List<vln>> a;
    public final Field<String> b;
    public final Field<String> c;
    public final Field<DivEvaluableType> d;

    public v4(Field<List<vln>> field, Field<String> field2, Field<String> field3, Field<DivEvaluableType> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((u4.b) BuiltInParserKt.getBuiltInParserComponent().J3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
