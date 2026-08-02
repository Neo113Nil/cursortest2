package com.yandex.messaging.ui.main.telemessenger;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragment", f = "TeleMessengerMainFragment.kt", l = {HProv.PP_DHOID}, m = "getConnectionStatusViewModelFactory")
/* loaded from: classes15.dex */
public final class TeleMessengerMainFragment$getConnectionStatusViewModelFactory$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TeleMessengerMainFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeleMessengerMainFragment$getConnectionStatusViewModelFactory$1(TeleMessengerMainFragment teleMessengerMainFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = teleMessengerMainFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object connectionStatusViewModelFactory;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        connectionStatusViewModelFactory = this.this$0.getConnectionStatusViewModelFactory(this);
        return connectionStatusViewModelFactory;
    }
}
