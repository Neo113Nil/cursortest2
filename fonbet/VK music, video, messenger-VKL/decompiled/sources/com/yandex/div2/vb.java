package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivTextGradientTemplate.kt */
/* loaded from: classes8.dex */
public abstract class vb implements JSONSerializable, JsonTemplate<rb> {

    /* compiled from: DivTextGradientTemplate.kt */
    public static final class a extends vb {
        public final v6 a;

        public a(v6 v6Var) {
            this.a = v6Var;
        }
    }

    /* compiled from: DivTextGradientTemplate.kt */
    public static final class b extends vb {
        public final x8 a;

        public b(x8 x8Var) {
            this.a = x8Var;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((tb) BuiltInParserKt.getBuiltInParserComponent().b8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
