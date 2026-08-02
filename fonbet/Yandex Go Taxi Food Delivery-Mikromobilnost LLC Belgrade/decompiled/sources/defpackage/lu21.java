package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.USER_SYNC_STATUS;
import java.util.Collections;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class lu21 implements b70 {
    public static final lu21 a = new lu21();
    public static final List b = Collections.singletonList(ACSPConstants.STATUS);

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1(ACSPConstants.STATUS);
        bfxVar.r0(((iu21) obj).a.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        USER_SYNC_STATUS user_sync_status;
        USER_SYNC_STATUS user_sync_status2 = null;
        while (xdxVar.h2(b) == 0) {
            String nextString = xdxVar.nextString();
            USER_SYNC_STATUS.Companion.getClass();
            USER_SYNC_STATUS[] values = USER_SYNC_STATUS.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    user_sync_status = null;
                    break;
                }
                user_sync_status = values[i];
                if (jl40.l(user_sync_status.getRawValue(), nextString)) {
                    break;
                }
                i++;
            }
            user_sync_status2 = user_sync_status == null ? USER_SYNC_STATUS.UNKNOWN__ : user_sync_status;
        }
        return new iu21(user_sync_status2);
    }
}
