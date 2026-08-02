package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivInputValidatorTemplate.kt */
/* loaded from: classes8.dex */
public abstract class o6 implements JSONSerializable, JsonTemplate<b6> {

    /* compiled from: DivInputValidatorTemplate.kt */
    public static final class a extends o6 {
        public final h6 a;

        public a(h6 h6Var) {
            this.a = h6Var;
        }
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    public static final class b extends o6 {
        public final n6 a;

        public b(n6 n6Var) {
            this.a = n6Var;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((j6) BuiltInParserKt.getBuiltInParserComponent().E4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
