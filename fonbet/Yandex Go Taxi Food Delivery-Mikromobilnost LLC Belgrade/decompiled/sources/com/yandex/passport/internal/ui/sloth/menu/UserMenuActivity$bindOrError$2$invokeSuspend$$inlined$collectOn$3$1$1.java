package com.yandex.passport.internal.ui.sloth.menu;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1", f = "UserMenuActivity.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "emit")
/* loaded from: classes2.dex */
public final class UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
