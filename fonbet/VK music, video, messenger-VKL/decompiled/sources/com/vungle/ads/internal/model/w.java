package com.vungle.ads.internal.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import xsna.c9y;
import xsna.epx;
import xsna.jdz;
import xsna.oqm0;
import xsna.qzw;
import xsna.yk3;
import xsna.zay;

/* loaded from: classes7.dex */
public final class w extends zay {
    public static final w a = new w();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w() {
        super(new jdz(r0, new yk3(r0)));
        oqm0 oqm0Var = oqm0.a;
    }

    @Override // xsna.zay
    public final JsonElement transformDeserialize(JsonElement jsonElement) {
        qzw qzwVar = c9y.a;
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject == null) {
            c9y.c("JsonObject", jsonElement);
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.b.entrySet()) {
            if (!epx.f(entry.getKey(), "moat")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new JsonObject(linkedHashMap);
    }
}
