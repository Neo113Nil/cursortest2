package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;
import xsna.fpn;

/* compiled from: DivTextRangeBackgroundTemplate.kt */
/* loaded from: classes8.dex */
public abstract class dc implements JSONSerializable, JsonTemplate<zb> {

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class a extends dc {
        public final n2 a;

        public a(n2 n2Var) {
            this.a = n2Var;
        }
    }

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class b extends dc {
        public final fpn a;

        public b(fpn fpnVar) {
            this.a = fpnVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((bc) BuiltInParserKt.getBuiltInParserComponent().e8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
