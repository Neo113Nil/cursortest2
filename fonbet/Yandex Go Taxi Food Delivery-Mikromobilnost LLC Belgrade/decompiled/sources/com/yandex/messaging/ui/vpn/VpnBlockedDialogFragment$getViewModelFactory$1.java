package com.yandex.messaging.ui.vpn;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.vpn.VpnBlockedDialogFragment", f = "VpnBlockedDialogFragment.kt", l = {30}, m = "getViewModelFactory")
/* loaded from: classes15.dex */
public final class VpnBlockedDialogFragment$getViewModelFactory$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VpnBlockedDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnBlockedDialogFragment$getViewModelFactory$1(VpnBlockedDialogFragment vpnBlockedDialogFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = vpnBlockedDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getViewModelFactory(this);
    }
}
