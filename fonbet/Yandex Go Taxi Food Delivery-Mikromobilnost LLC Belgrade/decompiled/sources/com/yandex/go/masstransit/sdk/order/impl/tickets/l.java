package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.b7z0;
import defpackage.tpr;
import defpackage.yt11;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class l implements yt11 {
    public final i a;
    public final m b;
    public final b7z0 c;
    public final LinkedHashMap d = new LinkedHashMap();

    public l(i iVar, m mVar, b7z0 b7z0Var) {
        this.a = iVar;
        this.b = mVar;
        this.c = b7z0Var;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        i iVar = this.a;
        r0 r0Var = iVar.d;
        return kotlinx.coroutines.flow.e.m(new m0(kotlinx.coroutines.flow.e.d(r0Var), iVar.a.m, new MtTicketsUiStateInteractor$uiStateFlow$baseStateFlow$1(3, this.b, m.class, "mapUiState", "mapUiState(Lcom/yandex/go/masstransit/sdk/order/impl/tickets/MasstransitOrderResult;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new k(kotlinx.coroutines.flow.e.d(r0Var), this)), new MtTicketsUiStateInteractor$special$$inlined$flatMapLatest$1(this, null)), kotlinx.coroutines.flow.e.d(iVar.e), kotlinx.coroutines.flow.e.d(iVar.f), new MtTicketsUiStateInteractor$uiStateFlow$1(this, null));
    }
}
