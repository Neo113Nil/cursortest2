package com.yandex.go.multimodal_route.ui.transport_route_part;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.f811;
import defpackage.hwd0;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class j implements PointerInputEventHandler {
    public final /* synthetic */ f811 a;
    public final /* synthetic */ androidx.compose.foundation.lazy.b b;

    public j(f811 f811Var, androidx.compose.foundation.lazy.b bVar) {
        this.a = f811Var;
        this.b = bVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        return androidx.compose.foundation.gestures.c.l(hwd0Var, new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1(this.a, this.b, null), continuation);
    }
}
