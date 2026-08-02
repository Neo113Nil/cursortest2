package com.yandex.go.explorer.impl.ui.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerOverlay", f = "ExplorerOverlay.kt", l = {439}, m = "moveCameraTo", v = 2)
/* loaded from: classes12.dex */
final class ExplorerOverlay$moveCameraTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerOverlay$moveCameraTo$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.Hg(this.this$0, null, this);
    }
}
