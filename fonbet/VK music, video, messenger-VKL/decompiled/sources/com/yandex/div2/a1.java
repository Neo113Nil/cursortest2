package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivAnimatorTemplate.kt */
/* loaded from: classes8.dex */
public abstract class a1 implements JSONSerializable, JsonTemplate<w0> {

    /* compiled from: DivAnimatorTemplate.kt */
    public static final class a extends a1 {
        public final u2 a;

        public a(u2 u2Var) {
            this.a = u2Var;
        }
    }

    /* compiled from: DivAnimatorTemplate.kt */
    public static final class b extends a1 {
        public final b7 a;

        public b(b7 b7Var) {
            this.a = b7Var;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((y0) BuiltInParserKt.getBuiltInParserComponent().u1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
