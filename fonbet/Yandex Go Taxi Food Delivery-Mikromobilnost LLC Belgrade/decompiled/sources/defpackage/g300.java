package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.VOLUNTARY_AGREEMENT_TEXT_LOGIC;
import com.yandex.plus.core.graphql.type.VOLUNTARY_MAILING_AGREEMENT_STATUS;
import java.util.List;

/* loaded from: classes2.dex */
public final class g300 implements b70 {
    public static final g300 a = new g300();
    public static final List b = scc.g("agreementDefaultStatus", "logic", "text");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        z200 z200Var = (z200) obj;
        bfxVar.A1("agreementDefaultStatus");
        bfxVar.r0(z200Var.a.getRawValue());
        bfxVar.A1("logic");
        bfxVar.r0(z200Var.b.getRawValue());
        bfxVar.A1("text");
        l80.a(k300.a).a(bfxVar, cVar, z200Var.c);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        VOLUNTARY_AGREEMENT_TEXT_LOGIC voluntary_agreement_text_logic;
        VOLUNTARY_MAILING_AGREEMENT_STATUS voluntary_mailing_agreement_status;
        VOLUNTARY_MAILING_AGREEMENT_STATUS voluntary_mailing_agreement_status2 = null;
        VOLUNTARY_AGREEMENT_TEXT_LOGIC voluntary_agreement_text_logic2 = null;
        d300 d300Var = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            int i = 0;
            if (h2 == 0) {
                String nextString = xdxVar.nextString();
                VOLUNTARY_MAILING_AGREEMENT_STATUS.Companion.getClass();
                VOLUNTARY_MAILING_AGREEMENT_STATUS[] values = VOLUNTARY_MAILING_AGREEMENT_STATUS.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        voluntary_mailing_agreement_status = null;
                        break;
                    }
                    voluntary_mailing_agreement_status = values[i];
                    if (jl40.l(voluntary_mailing_agreement_status.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                voluntary_mailing_agreement_status2 = voluntary_mailing_agreement_status == null ? VOLUNTARY_MAILING_AGREEMENT_STATUS.UNKNOWN__ : voluntary_mailing_agreement_status;
            } else if (h2 == 1) {
                String nextString2 = xdxVar.nextString();
                VOLUNTARY_AGREEMENT_TEXT_LOGIC.Companion.getClass();
                VOLUNTARY_AGREEMENT_TEXT_LOGIC[] values2 = VOLUNTARY_AGREEMENT_TEXT_LOGIC.values();
                int length2 = values2.length;
                while (true) {
                    if (i >= length2) {
                        voluntary_agreement_text_logic = null;
                        break;
                    }
                    voluntary_agreement_text_logic = values2[i];
                    if (jl40.l(voluntary_agreement_text_logic.getRawValue(), nextString2)) {
                        break;
                    }
                    i++;
                }
                voluntary_agreement_text_logic2 = voluntary_agreement_text_logic == null ? VOLUNTARY_AGREEMENT_TEXT_LOGIC.UNKNOWN__ : voluntary_agreement_text_logic;
            } else {
                if (h2 != 2) {
                    return new z200(voluntary_mailing_agreement_status2, voluntary_agreement_text_logic2, d300Var);
                }
                d300Var = (d300) l80.a(k300.a).b(xdxVar, cVar);
            }
        }
    }
}
