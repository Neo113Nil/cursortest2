package com.apollographql.apollo3.api;

import defpackage.b70;
import defpackage.gly0;
import defpackage.j70;
import defpackage.l80;
import defpackage.ovn;
import defpackage.rk90;
import defpackage.rko;
import defpackage.scc;
import defpackage.sko;
import defpackage.tko;
import defpackage.vkf;
import defpackage.wkf;
import defpackage.wls;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements rko {
    public static final gly0 d = new gly0();
    public static final c e = new vkf().a();
    public final j70 a;
    public final boolean b;
    public final Map c;

    static {
        vkf vkfVar = new vkf();
        vkfVar.c = true;
        vkfVar.a();
    }

    public c(LinkedHashMap linkedHashMap, j70 j70Var, boolean z) {
        this.a = j70Var;
        this.b = z;
        this.c = linkedHashMap;
    }

    @Override // defpackage.tko
    public final tko a(sko skoVar) {
        return d != skoVar ? this : ovn.a;
    }

    @Override // defpackage.tko
    public final tko b(tko tkoVar) {
        return d.a(this, tkoVar);
    }

    @Override // defpackage.tko
    public final rko c(sko skoVar) {
        if (d != skoVar) {
            return null;
        }
        return this;
    }

    public final b70 d(wkf wkfVar) {
        String str = wkfVar.b;
        String str2 = wkfVar.a;
        Map map = this.c;
        if (map.get(str2) != null) {
            return (b70) map.get(str2);
        }
        if (str.equals("com.apollographql.apollo3.api.Upload")) {
            return l80.h;
        }
        if (scc.g("kotlin.String", "java.lang.String").contains(str)) {
            return l80.a;
        }
        if (scc.g("kotlin.Boolean", "java.lang.Boolean").contains(str)) {
            return l80.f;
        }
        if (scc.g("kotlin.Int", "java.lang.Int").contains(str)) {
            return l80.b;
        }
        if (scc.g("kotlin.Double", "java.lang.Double").contains(str)) {
            return l80.c;
        }
        if (scc.g("kotlin.Long", "java.lang.Long").contains(str)) {
            return l80.e;
        }
        if (scc.g("kotlin.Float", "java.lang.Float").contains(str)) {
            return l80.d;
        }
        if (scc.g("kotlin.Any", "java.lang.Object").contains(str)) {
            return l80.g;
        }
        if (this.b) {
            return new rk90();
        }
        throw new IllegalStateException(("Can't map GraphQL type: `" + str2 + "` to: `" + str + "`. Did you forget to add a CustomScalarAdapter?").toString());
    }

    @Override // defpackage.tko
    public final Object fold(Object obj, wls wlsVar) {
        return ExecutionContext$plus$1.w.invoke(obj, this);
    }

    @Override // defpackage.rko
    public final sko getKey() {
        return d;
    }
}
