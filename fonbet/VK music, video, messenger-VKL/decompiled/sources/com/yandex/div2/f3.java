package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;
import xsna.amn;

/* compiled from: DivCountTemplate.kt */
/* loaded from: classes8.dex */
public abstract class f3 implements JSONSerializable, JsonTemplate<b3> {

    /* compiled from: DivCountTemplate.kt */
    public static final class a extends f3 {
        public final l4 a;

        public a(l4 l4Var) {
            this.a = l4Var;
        }
    }

    /* compiled from: DivCountTemplate.kt */
    public static final class b extends f3 {
        public final amn a;

        public b(amn amnVar) {
            this.a = amnVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((d3) BuiltInParserKt.getBuiltInParserComponent().w2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
