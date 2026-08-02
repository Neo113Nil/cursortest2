package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.LEGAL_ITEM_TYPE;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class bby implements b70 {
    public static final bby a = new bby();
    public static final List b = scc.g("type", "key", Constants.KEY_DATA);

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        xay xayVar = (xay) obj;
        bfxVar.A1("type");
        bfxVar.r0(xayVar.a.getRawValue());
        bfxVar.A1("key");
        foe foeVar = l80.a;
        bfxVar.r0(xayVar.b);
        bfxVar.A1(Constants.KEY_DATA);
        l80.a(aby.a).a(bfxVar, cVar, xayVar.c);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        LEGAL_ITEM_TYPE legal_item_type;
        LEGAL_ITEM_TYPE legal_item_type2 = null;
        String str = null;
        way wayVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                String nextString = xdxVar.nextString();
                LEGAL_ITEM_TYPE.Companion.getClass();
                LEGAL_ITEM_TYPE[] values = LEGAL_ITEM_TYPE.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        legal_item_type = null;
                        break;
                    }
                    legal_item_type = values[i];
                    if (jl40.l(legal_item_type.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                legal_item_type2 = legal_item_type == null ? LEGAL_ITEM_TYPE.UNKNOWN__ : legal_item_type;
            } else if (h2 == 1) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new xay(legal_item_type2, str, wayVar);
                }
                wayVar = (way) l80.a(aby.a).b(xdxVar, cVar);
            }
        }
    }
}
