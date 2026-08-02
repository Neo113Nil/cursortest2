package com.apollographql.apollo3.api;

import defpackage.j70;
import defpackage.j73;
import defpackage.o96;
import defpackage.p96;
import defpackage.tls;
import defpackage.w511;
import defpackage.xd4;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class a {
    public static final boolean a(o96 o96Var, final Set set, final String str, final j70 j70Var) {
        final List list = null;
        tls tlsVar = new tls() { // from class: com.apollographql.apollo3.api.BooleanExpressions$evaluate$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                xd4 xd4Var = (xd4) obj;
                if (xd4Var instanceof xd4) {
                    return Boolean.valueOf(kotlin.collections.a.G(xd4Var.a, str));
                }
                w511.b();
                return null;
            }
        };
        if (o96Var.equals(p96.b)) {
            return true;
        }
        if (o96Var.equals(p96.a)) {
            return false;
        }
        return ((Boolean) tlsVar.invoke(o96Var.a)).booleanValue();
    }

    public static final o96 b(String... strArr) {
        return new o96(new xd4(j73.f0(strArr)));
    }
}
