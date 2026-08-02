package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.internal.properties.UserMenuProperties;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$onCreate$3", f = "UserMenuActivity.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserMenuActivity$onCreate$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ UserMenuActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMenuActivity$onCreate$3(UserMenuActivity userMenuActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userMenuActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserMenuActivity$onCreate$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserMenuActivity$onCreate$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bindOrError;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.component;
            if (eVar == null) {
                eVar = null;
            }
            eVar.getUserMenuRequestsProcessor().a();
            UserMenuActivity userMenuActivity = this.this$0;
            e eVar2 = userMenuActivity.component;
            UserMenuProperties userMenuProperties = (eVar2 != null ? eVar2 : null).getUserMenuProperties();
            this.label = 1;
            bindOrError = userMenuActivity.bindOrError(userMenuProperties, this);
            if (bindOrError == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
