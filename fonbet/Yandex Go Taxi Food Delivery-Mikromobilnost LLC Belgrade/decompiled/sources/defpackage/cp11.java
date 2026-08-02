package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cp11 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static yo11 c(xdx xdxVar, c cVar) {
        xo11 xo11Var;
        wo11 wo11Var;
        j70 j70Var = cVar.a;
        vo11 vo11Var = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("RowCrossWidgetGroupProperties"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            xo11Var = bp11.c(xdxVar);
        } else {
            xo11Var = null;
        }
        if (a.a(a.b("ColumnCrossWidgetGroupProperties"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            wo11Var = ap11.c(xdxVar);
        } else {
            wo11Var = null;
        }
        if (a.a(a.b("BoxCrossWidgetGroupProperties"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            vo11Var = zo11.c(xdxVar);
        }
        return new yo11(str, xo11Var, wo11Var, vo11Var);
    }
}
