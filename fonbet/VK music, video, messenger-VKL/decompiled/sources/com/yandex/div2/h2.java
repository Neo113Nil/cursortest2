package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionTemplate.kt */
/* loaded from: classes8.dex */
public abstract class h2 implements JSONSerializable, JsonTemplate<d2> {

    /* compiled from: DivChangeTransitionTemplate.kt */
    public static final class a extends h2 {
        public final z1 a;

        public a(z1 z1Var) {
            this.a = z1Var;
        }
    }

    /* compiled from: DivChangeTransitionTemplate.kt */
    public static final class b extends h2 {
        public final c2 a;

        public b(c2 c2Var) {
            this.a = c2Var;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((f2) BuiltInParserKt.getBuiltInParserComponent().V1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
