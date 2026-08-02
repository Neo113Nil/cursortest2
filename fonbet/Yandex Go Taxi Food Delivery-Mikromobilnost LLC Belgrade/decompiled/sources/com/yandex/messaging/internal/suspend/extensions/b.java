package com.yandex.messaging.internal.suspend.extensions;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import defpackage.g6u;
import defpackage.jse;
import defpackage.n420;
import defpackage.n5t0;
import defpackage.tje;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public abstract class b {
    public static final Object a(HistoryRequest historyRequest, n420 n420Var, jse jseVar, Continuation continuation) {
        return tje.k0(jseVar, new HistoryRequestExecutorKt$execute$2(n420Var, historyRequest, jseVar, null), continuation);
    }

    public static final Object b(HistoryRequest historyRequest, n5t0 n5t0Var, g6u g6uVar, Continuation continuation) {
        return tje.k0(g6uVar, new HistoryRequestExecutorKt$executeReduced$2(n5t0Var, historyRequest, g6uVar, null), continuation);
    }
}
