package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.ActionType;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class gfg implements b70 {
    public static final gfg a = new gfg();
    public static final List b = Collections.singletonList("actionType");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("actionType");
        bfxVar.r0(((afg) obj).a.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        ActionType actionType;
        ActionType actionType2 = null;
        while (xdxVar.h2(b) == 0) {
            String nextString = xdxVar.nextString();
            ActionType.Companion.getClass();
            ActionType[] values = ActionType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    actionType = null;
                    break;
                }
                actionType = values[i];
                if (jl40.l(actionType.getRawValue(), nextString)) {
                    break;
                }
                i++;
            }
            actionType2 = actionType == null ? ActionType.UNKNOWN__ : actionType;
        }
        return new afg(actionType2);
    }
}
