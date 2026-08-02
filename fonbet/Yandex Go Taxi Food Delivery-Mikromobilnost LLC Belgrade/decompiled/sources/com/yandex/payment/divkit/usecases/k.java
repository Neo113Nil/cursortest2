package com.yandex.payment.divkit.usecases;

import defpackage.abe;
import defpackage.m93;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.u2l;
import defpackage.uyj;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k {
    public final m93 a;
    public final abe b;
    public final com.yandex.payment.divkit.common.a c;

    public k(m93 m93Var, abe abeVar, com.yandex.payment.divkit.common.a aVar) {
        this.a = m93Var;
        this.b = abeVar;
        this.c = aVar;
    }

    public final Object a(List list, boolean z, u2l u2lVar, Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new FetchSbpScreenUseCaseImpl$fetchJson$2(u2lVar, this, list, null, z), continuation);
    }
}
