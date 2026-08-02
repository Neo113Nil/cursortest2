package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class jfg implements b70 {
    public static final jfg a = new jfg();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        dfg dfgVar = (dfg) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(dfgVar.a);
        List list = eeg.a;
        eeg.d(bfxVar, cVar, dfgVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new dfg(str, eeg.c(xdxVar, cVar));
    }
}
