package com.yandex.go.scooters.misc.error_dialog;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogModalView", f = "ScootersErrorDialogModalView.kt", l = {191, 192, 201, 207, 219}, m = "renderDoubleButtonErrorDialog", v = 2)
/* loaded from: classes13.dex */
public final class ScootersErrorDialogModalView$renderDoubleButtonErrorDialog$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScootersErrorDialogModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersErrorDialogModalView$renderDoubleButtonErrorDialog$1(ScootersErrorDialogModalView scootersErrorDialogModalView, Continuation continuation) {
        super(continuation);
        this.this$0 = scootersErrorDialogModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object renderDoubleButtonErrorDialog;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        renderDoubleButtonErrorDialog = this.this$0.renderDoubleButtonErrorDialog(null, this);
        return renderDoubleButtonErrorDialog;
    }
}
