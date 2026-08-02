package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.PLAQUE_SEEN_STATUS;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class g3j0 implements b70 {
    public static final g3j0 a = new g3j0();
    public static final List b = Collections.singletonList("plaqueSeen");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("plaqueSeen");
        bfxVar.r0(((e3j0) obj).a.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        PLAQUE_SEEN_STATUS plaque_seen_status;
        PLAQUE_SEEN_STATUS plaque_seen_status2 = null;
        while (xdxVar.h2(b) == 0) {
            String nextString = xdxVar.nextString();
            PLAQUE_SEEN_STATUS.Companion.getClass();
            PLAQUE_SEEN_STATUS[] values = PLAQUE_SEEN_STATUS.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    plaque_seen_status = null;
                    break;
                }
                plaque_seen_status = values[i];
                if (jl40.l(plaque_seen_status.getRawValue(), nextString)) {
                    break;
                }
                i++;
            }
            plaque_seen_status2 = plaque_seen_status == null ? PLAQUE_SEEN_STATUS.UNKNOWN__ : plaque_seen_status;
        }
        return new e3j0(plaque_seen_status2);
    }
}
