package defpackage;

import java.util.Map;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class pbs0 extends fnr0 {
    public final String a;
    public final String b;

    public pbs0() {
        super(0);
        this.a = "signals";
        this.b = "SignalsSharedDataParser";
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
        return new obs0((Map) sbxVar.a(new k8u(auu0.a, gtq0.B(sbxVar.b, qoi0.a(kr.class)), 1), bVar));
    }
}
