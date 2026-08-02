package defpackage;

import java.util.Map;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class bf11 extends fnr0 {
    public final String a;
    public final String b;

    public bf11() {
        super(0);
        this.a = "triggers.kg8poc7t";
        this.b = "TriggersSharedDataParser2";
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
        sbxVar.getClass();
        return new af11((Map) sbxVar.a(new k8u(auu0.a, le11.Companion.serializer(), 1), bVar));
    }
}
