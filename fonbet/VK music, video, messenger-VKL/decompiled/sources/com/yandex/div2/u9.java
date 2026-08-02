package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivShapeTemplate.kt */
/* loaded from: classes8.dex */
public abstract class u9 implements JSONSerializable, JsonTemplate<q9> {

    /* compiled from: DivShapeTemplate.kt */
    public static final class a extends u9 {
        public final k2 a;

        public a(k2 k2Var) {
            this.a = k2Var;
        }
    }

    /* compiled from: DivShapeTemplate.kt */
    public static final class b extends u9 {
        public final a9 a;

        public b(a9 a9Var) {
            this.a = a9Var;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((s9) BuiltInParserKt.getBuiltInParserComponent().T6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
