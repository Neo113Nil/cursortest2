package com.yandex.messaging.ui.settings.folder.addChat;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements PointerInputEventHandler {
    public final /* synthetic */ sls a;

    public f(sls slsVar) {
        this.a = slsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object l = androidx.compose.foundation.gestures.c.l(hwd0Var, new AddChatsFolderContentKt$consumingClickable$1$1(this.a, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }
}
