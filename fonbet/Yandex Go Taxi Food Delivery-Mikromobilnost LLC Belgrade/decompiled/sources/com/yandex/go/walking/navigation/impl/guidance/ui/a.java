package com.yandex.go.walking.navigation.impl.guidance.ui;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import defpackage.sls;
import defpackage.tse;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ tse a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ sls c;

    public a(tse tseVar, sls slsVar, sls slsVar2) {
        this.a = tseVar;
        this.b = slsVar;
        this.c = slsVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        return z.f(hwd0Var, null, new ZoomButtonsKt$ZoomButton$1$1$1(this.a, this.b, this.c, null), null, continuation, 11);
    }
}
