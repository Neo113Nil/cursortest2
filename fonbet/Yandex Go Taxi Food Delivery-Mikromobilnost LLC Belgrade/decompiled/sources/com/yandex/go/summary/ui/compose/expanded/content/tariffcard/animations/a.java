package com.yandex.go.summary.ui.compose.expanded.content.tariffcard.animations;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.g;
import defpackage.hwd0;
import defpackage.m3u0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ m3u0 a;

    public a(m3u0 m3u0Var) {
        this.a = m3u0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object E0 = ((g) hwd0Var).E0(new RedirectAnimationsKt$blockClicksOnHidePhase$1$1$1(this.a, null), continuation);
        return E0 == CoroutineSingletons.COROUTINE_SUSPENDED ? E0 : zy11.a;
    }
}
