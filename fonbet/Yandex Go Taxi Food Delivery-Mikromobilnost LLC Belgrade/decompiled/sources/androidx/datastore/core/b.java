package androidx.datastore.core;

import defpackage.btq0;
import defpackage.bvf0;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.n1r;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.xc60;
import defpackage.zve;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class b {
    public static f a(n1r n1rVar, dxf0 dxf0Var, List list, tse tseVar) {
        zve zveVar = dxf0Var;
        if (dxf0Var == null) {
            zveVar = new xc60();
        }
        return new f(n1rVar, Collections.singletonList(new DataMigrationInitializer$Companion$getInitializer$1(list, null)), zveVar, tseVar);
    }

    public static f b(btq0 btq0Var, dxf0 dxf0Var, sls slsVar) {
        sjh sjhVar = uyj.a;
        return a(new n1r(btq0Var, slsVar), dxf0Var, EmptyList.a, bvf0.a(mdh.b.plus(jl40.a())));
    }
}
