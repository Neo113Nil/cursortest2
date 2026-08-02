package com.yandex.plus.home.ybsdk;

import com.yandex.plus.log.api.LogPriority;
import defpackage.ffx;
import defpackage.jqr;
import defpackage.jse;
import defpackage.kqd0;
import defpackage.mth;
import defpackage.rkd0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes2.dex */
public final class a implements kqd0 {
    public final kqd0 a;
    public final jse b;
    public final rkd0 c;
    public final n0 d;
    public final tpr e;

    public a(kqd0 kqd0Var, jse jseVar, rkd0 rkd0Var) {
        this.a = kqd0Var;
        this.b = jseVar;
        this.c = rkd0Var;
        n0 c = ffx.c(0, 0, null, 7);
        this.d = c;
        this.e = e.F(new jqr(new o(e.K(new mth(kqd0Var.c(), 4), c), new TreasuryAdapterProxy$eventsFlow$1(3, null)), new TreasuryAdapterProxy$eventsFlow$2(this, null), 3), jseVar);
    }

    @Override // defpackage.kqd0
    public final Object a(String str) {
        LogPriority logPriority = LogPriority.INFO;
        rkd0 rkd0Var = this.c;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "TreasuryAdapterProxy", unr0.l(')', "openByUri(uri=", str), null);
        }
        try {
            b.b(this.a.a(str));
            return zy11.a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    @Override // defpackage.kqd0
    public final Object b(String str, ContinuationImpl continuationImpl) {
        return tje.k0(this.b, new TreasuryAdapterProxy$getShortcut$2(this, str, null), continuationImpl);
    }

    @Override // defpackage.kqd0
    public final tpr c() {
        return this.e;
    }
}
