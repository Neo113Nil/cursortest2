package com.yandex.messaging.ui.urlpreview.joinchat;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.urlpreview.joinchat.JoinWallFragment", f = "JoinWallFragment.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "getViewModelFactory")
/* loaded from: classes15.dex */
public final class JoinWallFragment$getViewModelFactory$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JoinWallFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinWallFragment$getViewModelFactory$1(JoinWallFragment joinWallFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = joinWallFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object viewModelFactory;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        viewModelFactory = this.this$0.getViewModelFactory(this);
        return viewModelFactory;
    }
}
