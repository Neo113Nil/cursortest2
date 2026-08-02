package com.yandex.go.summary.ui.compose.common.animation;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import defpackage.oz40;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class b implements PointerInputEventHandler {
    public final /* synthetic */ oz40 a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ oz40 c;

    public b(oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3) {
        this.a = oz40Var;
        this.b = oz40Var2;
        this.c = oz40Var3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        return androidx.compose.foundation.gestures.c.l(hwd0Var, new ClickableKt$ignoreScrollClickable$1$1$1$1(this.a, this.b, this.c, null), continuation);
    }
}
