package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;
import xsna.iln;

/* compiled from: DivFilterTemplate.kt */
/* loaded from: classes8.dex */
public abstract class i4 implements JSONSerializable, JsonTemplate<e4> {

    /* compiled from: DivFilterTemplate.kt */
    public static final class a extends i4 {
        public final t1 a;

        public a(t1 t1Var) {
            this.a = t1Var;
        }
    }

    /* compiled from: DivFilterTemplate.kt */
    public static final class b extends i4 {
        public final iln a;

        public b(iln ilnVar) {
            this.a = ilnVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((g4) BuiltInParserKt.getBuiltInParserComponent().l3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
