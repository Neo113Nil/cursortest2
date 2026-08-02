package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class kfg implements b70 {
    public static final List a = Collections.singletonList("popups");

    public static ffg c(xdx xdxVar, c cVar) {
        ArrayList arrayList = null;
        while (xdxVar.h2(a) == 0) {
            ep60 a2 = l80.a(lfg.a);
            ArrayList z = oyr.z(xdxVar);
            while (xdxVar.hasNext()) {
                z.add(a2.b(xdxVar, cVar));
            }
            xdxVar.j();
            arrayList = z;
        }
        return new ffg(arrayList);
    }
}
