package defpackage;

import java.util.Map;
import kotlin.collections.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes.dex */
public final class d52 extends fnr0 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(q1q0 q1q0Var) {
        super(0);
        this.a = 1;
        this.d = q1q0Var;
        this.b = "sectionLabels";
        this.c = "SectionLabelsSharedDataParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        Boolean f;
        boolean z = false;
        switch (this.a) {
            case 0:
                sbxVar.getClass();
                auu0 auu0Var = auu0.a;
                c52 c52Var = new c52((Map) sbxVar.a(new k8u(auu0Var, new k8u(auu0Var, b.Companion.serializer(), 1), 1), bVar));
                c42 c42Var = (c42) this.d;
                synchronized (c42Var) {
                    c52 c52Var2 = c42Var.a;
                    c42Var.a = c52Var2 == null ? c52Var : (c52) c52Var2.a(c52Var);
                }
                return c52Var;
            case 1:
                sbxVar.getClass();
                auu0 auu0Var2 = auu0.a;
                Map map = (Map) sbxVar.a(new k8u(auu0Var2, new p53(auu0Var2, 0), 1), bVar);
                q1q0 q1q0Var = (q1q0) this.d;
                q1q0Var.getClass();
                q1q0Var.a = a.N0(tcc.o(map.values()));
                return wwg.k(map);
            default:
                if (bVar instanceof c) {
                    b bVar2 = (b) ((c) bVar).get("isEnabled");
                    d dVar = bVar2 instanceof d ? (d) bVar2 : null;
                    if (dVar != null && (f = qcx.f(dVar)) != null) {
                        z = f.booleanValue();
                    }
                    ((j9w0) ((h3y) this.d).get()).b(z);
                }
                return null;
        }
    }

    public d52(c42 c42Var) {
        this.a = 0;
        this.d = c42Var;
        this.b = "analytics";
        this.c = "AnalyticsSharedDataParser";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(h3y h3yVar) {
        super(0);
        this.a = 2;
        this.d = h3yVar;
        this.b = "cartConfiguration";
        this.c = "SuperappSuggestDataParser";
    }
}
