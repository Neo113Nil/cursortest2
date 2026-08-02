package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.PLAQUE_CLICKED_STATUS;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d3j0 implements b70 {
    public static final d3j0 a = new d3j0();
    public static final List b = Collections.singletonList("plaqueClicked");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("plaqueClicked");
        g97 g97Var = g97.n;
        foe foeVar = l80.a;
        PLAQUE_CLICKED_STATUS plaque_clicked_status = ((b3j0) obj).a;
        if (plaque_clicked_status == null) {
            bfxVar.k2();
        } else {
            g97Var.a(bfxVar, cVar, plaque_clicked_status);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        PLAQUE_CLICKED_STATUS plaque_clicked_status = null;
        while (xdxVar.h2(b) == 0) {
            g97 g97Var = g97.n;
            foe foeVar = l80.a;
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b2 = null;
            } else {
                b2 = g97Var.b(xdxVar, cVar);
            }
            plaque_clicked_status = (PLAQUE_CLICKED_STATUS) b2;
        }
        return new b3j0(plaque_clicked_status);
    }
}
