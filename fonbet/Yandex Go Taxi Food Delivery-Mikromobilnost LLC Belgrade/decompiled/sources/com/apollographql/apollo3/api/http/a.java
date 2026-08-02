package com.apollographql.apollo3.api.http;

import defpackage.ek00;
import defpackage.f2r;
import defpackage.fc70;
import defpackage.ny61;
import defpackage.to2;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class a {
    public static Map a(to2 to2Var) {
        fc70 fc70Var = to2Var.a;
        Boolean bool = to2Var.f;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = to2Var.g;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        com.apollographql.apollo3.api.c cVar = (com.apollographql.apollo3.api.c) to2Var.c.c(com.apollographql.apollo3.api.c.d);
        if (cVar == null) {
            ny61.r("Cannot find a ResponseAdapterCache");
            return null;
        }
        String b = booleanValue2 ? fc70Var.b() : null;
        ek00 ek00Var = new ek00();
        DefaultHttpRequestComposer$Companion$apqExtensionsWriter$1 defaultHttpRequestComposer$Companion$apqExtensionsWriter$1 = new DefaultHttpRequestComposer$Companion$apqExtensionsWriter$1(booleanValue, fc70Var.id());
        ek00Var.u();
        ek00Var.A1("operationName");
        ek00Var.d(fc70Var.name());
        ek00Var.A1("variables");
        f2r f2rVar = new f2r(ek00Var);
        f2rVar.u();
        fc70Var.a(f2rVar, cVar);
        f2rVar.y();
        if (b != null) {
            ek00Var.A1("query");
            ek00Var.d(b);
        }
        defaultHttpRequestComposer$Companion$apqExtensionsWriter$1.invoke(ek00Var);
        ek00Var.y();
        return (Map) ek00Var.c();
    }
}
