package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.ELEMENT_LEVEL_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class mnc0 implements b70 {
    public static final List a = scc.g("widgetId", "widgetGroupId", "type");

    public static lnc0 c(xdx xdxVar, c cVar) {
        ELEMENT_LEVEL_TYPE element_level_type;
        String str = null;
        String str2 = null;
        ELEMENT_LEVEL_TYPE element_level_type2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new lnc0(str, str2, element_level_type2);
                }
                String nextString = xdxVar.nextString();
                ELEMENT_LEVEL_TYPE.Companion.getClass();
                ELEMENT_LEVEL_TYPE[] values = ELEMENT_LEVEL_TYPE.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        element_level_type = null;
                        break;
                    }
                    element_level_type = values[i];
                    if (jl40.l(element_level_type.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                element_level_type2 = element_level_type == null ? ELEMENT_LEVEL_TYPE.UNKNOWN__ : element_level_type;
            }
        }
    }
}
