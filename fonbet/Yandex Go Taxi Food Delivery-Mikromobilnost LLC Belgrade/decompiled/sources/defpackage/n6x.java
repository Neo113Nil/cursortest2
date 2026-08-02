package defpackage;

import java.util.Map;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class n6x extends fnr0 {
    public final String a;
    public final String b;

    public n6x() {
        super(0);
        this.a = "jasonStatham";
        this.b = "JasonStathamSharedDataParser";
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
        auu0 auu0Var = auu0.a;
        return new m6x((Map) sbxVar.a(new k8u(auu0Var, auu0Var, 1), bVar));
    }
}
