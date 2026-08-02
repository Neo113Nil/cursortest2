package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivPageTransformationTemplate.kt */
/* loaded from: classes8.dex */
public abstract class m7 implements JSONSerializable, JsonTemplate<c7> {

    /* compiled from: DivPageTransformationTemplate.kt */
    public static final class a extends m7 {
        public final i7 a;

        public a(i7 i7Var) {
            this.a = i7Var;
        }
    }

    /* compiled from: DivPageTransformationTemplate.kt */
    public static final class b extends m7 {
        public final l7 a;

        public b(l7 l7Var) {
            this.a = l7Var;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((e7) BuiltInParserKt.getBuiltInParserComponent().u5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
