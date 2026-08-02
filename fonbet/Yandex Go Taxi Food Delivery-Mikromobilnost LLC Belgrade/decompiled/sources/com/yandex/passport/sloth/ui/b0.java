package com.yandex.passport.sloth.ui;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ b0(d0 d0Var, int i) {
        this.a = i;
        this.b = d0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "SlothNetworkStatus " + cVar, 8);
                }
                if (jl40.l(cVar, c.a)) {
                    if (d0Var.p().getWebViewHasError()) {
                        d0Var.p().reload();
                        return zy11Var;
                    }
                    d0Var.F.b(s0.c);
                    return zy11Var;
                }
                if (jl40.l(cVar, c.b)) {
                    d0Var.F.c();
                    return zy11Var;
                }
                if (cVar == null) {
                    return zy11Var;
                }
                w511.b();
                return null;
            default:
                d0Var.p().load(((com.yandex.passport.common.url.b) obj).a, jl40.l((c) ((com.yandex.passport.internal.sloth.l) d0Var.N).a.a.getValue(), c.a));
                return zy11Var;
        }
    }
}
