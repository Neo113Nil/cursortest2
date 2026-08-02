package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.CHANGE_VOLUNTARY_AGREEMENT_STATUS;
import java.util.Collections;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class fb9 implements b70 {
    public static final fb9 a = new fb9();
    public static final List b = Collections.singletonList(ACSPConstants.STATUS);

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1(ACSPConstants.STATUS);
        bfxVar.r0(((cb9) obj).a.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        CHANGE_VOLUNTARY_AGREEMENT_STATUS change_voluntary_agreement_status;
        CHANGE_VOLUNTARY_AGREEMENT_STATUS change_voluntary_agreement_status2 = null;
        while (xdxVar.h2(b) == 0) {
            String nextString = xdxVar.nextString();
            CHANGE_VOLUNTARY_AGREEMENT_STATUS.Companion.getClass();
            CHANGE_VOLUNTARY_AGREEMENT_STATUS[] values = CHANGE_VOLUNTARY_AGREEMENT_STATUS.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    change_voluntary_agreement_status = null;
                    break;
                }
                change_voluntary_agreement_status = values[i];
                if (jl40.l(change_voluntary_agreement_status.getRawValue(), nextString)) {
                    break;
                }
                i++;
            }
            change_voluntary_agreement_status2 = change_voluntary_agreement_status == null ? CHANGE_VOLUNTARY_AGREEMENT_STATUS.UNKNOWN__ : change_voluntary_agreement_status;
        }
        return new cb9(change_voluntary_agreement_status2);
    }
}
