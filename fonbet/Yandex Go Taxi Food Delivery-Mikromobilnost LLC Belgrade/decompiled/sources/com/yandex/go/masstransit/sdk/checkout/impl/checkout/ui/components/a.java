package com.yandex.go.masstransit.sdk.checkout.impl.checkout.ui.components;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.g;
import defpackage.hwd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class a implements PointerInputEventHandler {
    public static final a a = new a();

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object E0 = ((g) hwd0Var).E0(new BlockInteractionBoxKt$blockInteraction$1$1(2, null), continuation);
        return E0 == CoroutineSingletons.COROUTINE_SUSPENDED ? E0 : zy11.a;
    }
}
