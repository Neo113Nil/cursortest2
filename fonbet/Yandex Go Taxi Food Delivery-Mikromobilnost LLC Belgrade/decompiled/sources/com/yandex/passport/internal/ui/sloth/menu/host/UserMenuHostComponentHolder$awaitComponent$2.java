package com.yandex.passport.internal.ui.sloth.menu.host;

import defpackage.fyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/ui/sloth/menu/host/a;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/ui/sloth/menu/host/a;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.menu.host.UserMenuHostComponentHolder$awaitComponent$2", f = "UserMenuHostComponentHolder.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UserMenuHostComponentHolder$awaitComponent$2 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserMenuHostComponentHolder$awaitComponent$2(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserMenuHostComponentHolder$awaitComponent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fyc fycVar = f.a;
        this.label = 1;
        Object s = fycVar.s(this);
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
