package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class ny extends fnr0 {
    public final String a;
    public final String b;

    public ny() {
        super(0);
        this.a = "actionTemplates";
        this.b = "ActionTemplatesSharedDataParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        Map map = qcx.m(bVar).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), qcx.m((b) entry.getValue()));
        }
        return new my(linkedHashMap);
    }
}
