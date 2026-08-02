package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.SECTION_VIEW_TYPE;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ieg implements b70 {
    public static final List a = scc.g("metaShortcuts", "viewType");

    public static heg c(xdx xdxVar, c cVar) {
        SECTION_VIEW_TYPE section_view_type;
        Object b;
        List list = null;
        SECTION_VIEW_TYPE section_view_type2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                jeg jegVar = jeg.a;
                foe foeVar = l80.a;
                lqy lqyVar = new lqy(new ep60(jegVar, true));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b;
            } else {
                if (h2 != 1) {
                    return new heg(list, section_view_type2);
                }
                String nextString = xdxVar.nextString();
                SECTION_VIEW_TYPE.Companion.getClass();
                SECTION_VIEW_TYPE[] values = SECTION_VIEW_TYPE.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        section_view_type = null;
                        break;
                    }
                    section_view_type = values[i];
                    if (jl40.l(section_view_type.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                section_view_type2 = section_view_type == null ? SECTION_VIEW_TYPE.UNKNOWN__ : section_view_type;
            }
        }
    }
}
