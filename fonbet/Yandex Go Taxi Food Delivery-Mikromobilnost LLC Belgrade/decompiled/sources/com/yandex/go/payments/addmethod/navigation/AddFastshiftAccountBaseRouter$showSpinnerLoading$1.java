package com.yandex.go.payments.addmethod.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddFastshiftAccountBaseRouter", f = "AddFastshiftAccountBaseRouter.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "showSpinnerLoading", v = 2)
/* loaded from: classes13.dex */
final class AddFastshiftAccountBaseRouter$showSpinnerLoading$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFastshiftAccountBaseRouter$showSpinnerLoading$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.R(this.this$0, null, this);
    }
}
