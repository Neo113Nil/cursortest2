package com.yandex.go.explorer.impl.ui.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerUiStateProvider", f = "ExplorerUiStateProvider.kt", l = {14, 15}, m = "getExplorerButtonUiState", v = 2)
/* loaded from: classes12.dex */
final class ExplorerUiStateProvider$getExplorerButtonUiState$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerUiStateProvider$getExplorerButtonUiState$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(false, this);
    }
}
