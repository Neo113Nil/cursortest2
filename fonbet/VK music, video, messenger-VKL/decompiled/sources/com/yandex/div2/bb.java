package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;
import xsna.ppn;
import xsna.upn;

/* compiled from: DivStrokeStyleTemplate.kt */
/* loaded from: classes8.dex */
public abstract class bb implements JSONSerializable, JsonTemplate<xa> {

    /* compiled from: DivStrokeStyleTemplate.kt */
    public static final class a extends bb {
        public final ppn a;

        public a(ppn ppnVar) {
            this.a = ppnVar;
        }
    }

    /* compiled from: DivStrokeStyleTemplate.kt */
    public static final class b extends bb {
        public final upn a;

        public b(upn upnVar) {
            this.a = upnVar;
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((za) BuiltInParserKt.getBuiltInParserComponent().G7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
