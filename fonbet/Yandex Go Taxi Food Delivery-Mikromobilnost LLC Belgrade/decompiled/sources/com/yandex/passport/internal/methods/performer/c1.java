package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.f2;
import com.yandex.passport.internal.methods.x2;
import defpackage.zy11;
import java.util.List;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class c1 implements w0 {
    public final com.yandex.passport.internal.provider.communication.l a;

    public c1(com.yandex.passport.internal.provider.communication.l lVar) {
        this.a = lVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        f2 f2Var = (f2) x2Var;
        try {
            this.a.a = (List) f2Var.b.c;
            return zy11.a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
