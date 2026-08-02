package com.yandex.go.mainscreen.superapp.impl.header.domain;

import com.yandex.go.repositories.AvatarStatus;
import defpackage.egv;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkj;", "<unused var>", "Legv;", "imageUrl", "", "<anonymous>", "(Lkj;Legv;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.header.domain.MenuStateInteractorImpl$avatarImage$1", f = "MenuStateInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MenuStateInteractorImpl$avatarImage$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MenuStateInteractorImpl$avatarImage$1 menuStateInteractorImpl$avatarImage$1 = new MenuStateInteractorImpl$avatarImage$1(3, (Continuation) obj3);
        menuStateInteractorImpl$avatarImage$1.L$0 = (egv) obj2;
        return menuStateInteractorImpl$avatarImage$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String b;
        egv egvVar = (egv) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(egvVar.a(), AvatarStatus.NOT_FOUND_STATUS.getText()) || (b = egvVar.b()) == null || evu0.J(b)) {
            return null;
        }
        return egvVar.b();
    }
}
