package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementTemplate.kt */
/* loaded from: classes8.dex */
public abstract class o5 implements JSONSerializable, JsonTemplate<k5> {

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class a extends o5 {
        public final r3 a;

        public a(r3 r3Var) {
            this.a = r3Var;
        }
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class b extends o5 {
        public final ua a;

        public b(ua uaVar) {
            this.a = uaVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((m5) BuiltInParserKt.getBuiltInParserComponent().b4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
