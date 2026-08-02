package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskTemplate.kt */
/* loaded from: classes8.dex */
public abstract class vc implements JSONSerializable, JsonTemplate<ic> {

    /* compiled from: DivTextRangeMaskTemplate.kt */
    public static final class a extends vc {
        public final rc a;

        public a(rc rcVar) {
            this.a = rcVar;
        }
    }

    /* compiled from: DivTextRangeMaskTemplate.kt */
    public static final class b extends vc {
        public final uc a;

        public b(uc ucVar) {
            this.a = ucVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((nc) BuiltInParserKt.getBuiltInParserComponent().s8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
