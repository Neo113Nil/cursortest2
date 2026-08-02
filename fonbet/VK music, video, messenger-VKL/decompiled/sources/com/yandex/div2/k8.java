package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;
import xsna.ton;

/* compiled from: DivRadialGradientCenterTemplate.kt */
/* loaded from: classes8.dex */
public abstract class k8 implements JSONSerializable, JsonTemplate<g8> {

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class a extends k8 {
        public final o8 a;

        public a(o8 o8Var) {
            this.a = o8Var;
        }
    }

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class b extends k8 {
        public final ton a;

        public b(ton tonVar) {
            this.a = tonVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((i8) BuiltInParserKt.getBuiltInParserComponent().a6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
