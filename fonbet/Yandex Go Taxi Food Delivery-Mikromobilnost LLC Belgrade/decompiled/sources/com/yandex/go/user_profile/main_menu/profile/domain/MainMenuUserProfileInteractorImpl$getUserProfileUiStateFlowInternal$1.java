package com.yandex.go.user_profile.main_menu.profile.domain;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r600;
import defpackage.s600;
import defpackage.x600;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr600;", "avatarState", "", "userName", "statusName", "Lx600;", "statusPlateBackgroundState", "Ls600;", "<anonymous>", "(Lr600;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lx600;)Ls600;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.domain.MainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1", f = "MainMenuUserProfileInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1 mainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1 = new MainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1(5, (Continuation) obj5);
        mainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1.L$0 = (r600) obj;
        mainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1.L$1 = (CharSequence) obj2;
        mainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1.L$2 = (CharSequence) obj3;
        mainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1.L$3 = (x600) obj4;
        return mainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r600 r600Var = (r600) this.L$0;
        CharSequence charSequence = (CharSequence) this.L$1;
        CharSequence charSequence2 = (CharSequence) this.L$2;
        x600 x600Var = (x600) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new s600(charSequence, r600Var, charSequence2, x600Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
