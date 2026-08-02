package com.yandex.go.user_profile.ui.am;

import defpackage.jst;
import defpackage.tt2;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zuj0;
import java.util.concurrent.CancellationException;
import kotlin.Result;

/* loaded from: classes14.dex */
public final class h {
    public final zuj0 a;
    public final wnt b;
    public final tt2 c;

    public h(tt2 tt2Var, wnt wntVar, zuj0 zuj0Var) {
        this.a = zuj0Var;
        this.b = wntVar;
        this.c = tt2Var;
    }

    public final g a(String str) {
        Object failure;
        try {
            failure = (g) ((xnt) this.b).c(str, g.Companion.serializer());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.k(a, "PROFILE:PARSE_ACTION");
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        g gVar = (g) failure;
        return gVar == null ? e.INSTANCE : gVar;
    }
}
