package com.yandex.go.user_profile.main_menu.profile.domain;

import android.graphics.drawable.Drawable;
import defpackage.m600;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r600;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lr600;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.domain.MainMenuUserProfileAvatarInteractor$takeAvatarFallback$1", f = "MainMenuUserProfileAvatarInteractor.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MainMenuUserProfileAvatarInteractor$takeAvatarFallback$1 extends SuspendLambda implements wls {
    final /* synthetic */ Drawable $placeholder;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m600 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuUserProfileAvatarInteractor$takeAvatarFallback$1(m600 m600Var, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m600Var;
        this.$placeholder = drawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainMenuUserProfileAvatarInteractor$takeAvatarFallback$1 mainMenuUserProfileAvatarInteractor$takeAvatarFallback$1 = new MainMenuUserProfileAvatarInteractor$takeAvatarFallback$1(this.this$0, this.$placeholder, continuation);
        mainMenuUserProfileAvatarInteractor$takeAvatarFallback$1.L$0 = obj;
        return mainMenuUserProfileAvatarInteractor$takeAvatarFallback$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainMenuUserProfileAvatarInteractor$takeAvatarFallback$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r600 a = m600.a(this.this$0, false, this.$placeholder);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(a, this) == coroutineSingletons) {
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
