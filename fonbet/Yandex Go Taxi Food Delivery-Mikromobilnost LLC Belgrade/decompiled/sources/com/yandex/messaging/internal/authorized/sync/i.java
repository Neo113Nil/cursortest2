package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.ChatRequest;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.kse;
import defpackage.tje;
import defpackage.xdf0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import kotlinx.coroutines.flow.t0;

/* loaded from: classes15.dex */
public final class i {
    public final h3y a;
    public final xdf0 b;
    public final kse c;
    public final com.yandex.messaging.internal.authorized.chat.b d;
    public final r0 e = bvf0.c(Boolean.FALSE);

    public i(h3y h3yVar, xdf0 xdf0Var, kse kseVar, com.yandex.messaging.internal.authorized.chat.b bVar) {
        this.a = h3yVar;
        this.b = xdf0Var;
        this.c = kseVar;
        this.d = bVar;
        tje.N(xdf0Var, null, null, new SyncManager$1(this, null), 3);
    }

    public static t0 a(i iVar, m0 m0Var, SyncSource syncSource, ChatRequest chatRequest) {
        iVar.getClass();
        return new t0(ffx.c(0, 0, null, 7), new SyncManager$requestSyncWhenSubscribed$1(iVar, m0Var, chatRequest, false, syncSource, null));
    }
}
