package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;
import xsna.ion;

/* compiled from: DivPivotTemplate.kt */
/* loaded from: classes8.dex */
public abstract class e8 implements JSONSerializable, JsonTemplate<x7> {

    /* compiled from: DivPivotTemplate.kt */
    public static final class a extends e8 {
        public final a8 a;

        public a(a8 a8Var) {
            this.a = a8Var;
        }
    }

    /* compiled from: DivPivotTemplate.kt */
    public static final class b extends e8 {
        public final ion a;

        public b(ion ionVar) {
            this.a = ionVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((c8) BuiltInParserKt.getBuiltInParserComponent().U5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
