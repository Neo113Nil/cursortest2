package com.yandex.go.user_profile.main_menu.profile.domain;

import defpackage.g92;
import defpackage.m600;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p600;
import defpackage.t600;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.y600;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.domain.MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1", f = "MainMenuUserProfileInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1(Continuation continuation, c cVar) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1 mainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1 = new MainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        mainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mainMenuUserProfileInteractorImpl$userProfileUiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr m;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p600 p600Var = (p600) obj2;
            if (!p600Var.a) {
                m = new g92(2, y600.a);
            } else if (p600Var.b) {
                c cVar = this.this$0;
                m600 m600Var = cVar.c;
                g X = e.X(new m0(e.I(m600Var.c.a(), new MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$placeholderFlow$1(m600Var, null)), e.t(com.yandex.go.coroutines.b.d(new b(m600Var.b.f), new MainMenuUserProfileAvatarInteractor$avatarUrlFlow$$inlined$start$1(m600Var, null))), new MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1(3, null)), new MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$$inlined$flatMapLatest$1(m600Var, null));
                g a = cVar.e.a();
                com.yandex.go.user_profile.main_menu.profile.repository.d dVar = cVar.d;
                m = e.m(X, a, dVar.c(), dVar.b(), new MainMenuUserProfileInteractorImpl$getUserProfileUiStateFlowInternal$1(5, null));
            } else {
                m = new g92(2, t600.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(m, vprVar, this) == coroutineSingletons) {
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
