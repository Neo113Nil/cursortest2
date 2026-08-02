package com.yandex.messaging.ui.folders.selectDialog;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.folders.selectDialog.SelectFolderViewModel", f = "SelectFolderViewModel.kt", l = {102, 103, 104}, m = "handleFolderSelection")
/* loaded from: classes15.dex */
final class SelectFolderViewModel$handleFolderSelection$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFolderViewModel$handleFolderSelection$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.Y(this.this$0, null, this);
    }
}
