package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;
import xsna.dqn;
import xsna.iqn;

/* compiled from: DivTooltipModeTemplate.kt */
/* loaded from: classes8.dex */
public abstract class fd implements JSONSerializable, JsonTemplate<bd> {

    /* compiled from: DivTooltipModeTemplate.kt */
    public static final class a extends fd {
        public final dqn a;

        public a(dqn dqnVar) {
            this.a = dqnVar;
        }
    }

    /* compiled from: DivTooltipModeTemplate.kt */
    public static final class b extends fd {
        public final iqn a;

        public b(iqn iqnVar) {
            this.a = iqnVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((dd) BuiltInParserKt.getBuiltInParserComponent().T8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
