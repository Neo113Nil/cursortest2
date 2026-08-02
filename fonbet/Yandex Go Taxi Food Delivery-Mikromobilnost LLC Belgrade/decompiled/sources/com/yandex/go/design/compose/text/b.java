package com.yandex.go.design.compose.text;

import androidx.compose.foundation.gestures.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        return c.l(hwd0Var, new LineCompatKt$clickAdapter$1$1(this.a, null), continuation);
    }
}
