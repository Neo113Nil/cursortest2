package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusTemplate.kt */
/* loaded from: classes8.dex */
public abstract class u8 implements JSONSerializable, JsonTemplate<q8> {

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class a extends u8 {
        public final s4 a;

        public a(s4 s4Var) {
            this.a = s4Var;
        }
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class b extends u8 {
        public final w8 a;

        public b(w8 w8Var) {
            this.a = w8Var;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((s8) BuiltInParserKt.getBuiltInParserComponent().g6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
