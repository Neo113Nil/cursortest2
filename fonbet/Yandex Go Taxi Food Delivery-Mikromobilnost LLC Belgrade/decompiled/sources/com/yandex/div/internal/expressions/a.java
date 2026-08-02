package com.yandex.div.internal.expressions;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEvaluableType;
import defpackage.abl0;
import defpackage.eg90;
import defpackage.evu0;
import defpackage.fg90;
import defpackage.lvo;
import defpackage.omy0;
import defpackage.q5z;
import defpackage.tls;
import defpackage.vm11;
import defpackage.w511;
import defpackage.wm11;
import defpackage.zch;
import defpackage.zok;
import defpackage.zoy0;

/* loaded from: classes11.dex */
public abstract class a {
    public static final zoy0 a = new zoy0();
    public static final omy0 b = new omy0();
    public static final zch c = new zch();
    public static final tls d = DivExpressionParser$ANY_TO_URL$1.w;
    public static final tls e = DivExpressionParser$ANY_TO_COLOR$1.w;

    public static Expression a(String str, vm11 vm11Var, tls tlsVar, eg90 eg90Var) {
        if (evu0.y(str, "@{", false)) {
            return new com.yandex.div.json.expressions.a("get", str, tlsVar, q5z.b, eg90Var, vm11Var, null);
        }
        if (vm11Var.t(str)) {
            return new lvo(eg90Var, str);
        }
        throw fg90.k("get", str, str, null);
    }

    public static Expression b(String str, DivEvaluableType divEvaluableType, eg90 eg90Var) {
        abl0 abl0Var = q5z.c;
        switch (zok.a[divEvaluableType.ordinal()]) {
            case 1:
                return a(str, wm11.c, abl0Var, eg90Var);
            case 2:
                return a(str, wm11.b, b.h, eg90Var);
            case 3:
                return a(str, wm11.d, b.g, eg90Var);
            case 4:
                return a(str, wm11.a, b.f, eg90Var);
            case 5:
                return a(str, a, d, eg90Var);
            case 6:
                return a(str, b, e, eg90Var);
            case 7:
                return a(str, wm11.h, abl0Var, eg90Var);
            case 8:
                return a(str, wm11.g, abl0Var, eg90Var);
            case 9:
                return a(str, c, abl0Var, eg90Var);
            default:
                w511.b();
                return null;
        }
    }
}
