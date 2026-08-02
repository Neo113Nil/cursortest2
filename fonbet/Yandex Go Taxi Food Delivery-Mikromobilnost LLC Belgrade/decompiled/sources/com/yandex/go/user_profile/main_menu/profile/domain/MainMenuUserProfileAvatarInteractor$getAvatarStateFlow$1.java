package com.yandex.go.user_profile.main_menu.profile.domain;

import android.graphics.drawable.Drawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "", "placeholder", "url"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.domain.MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1", f = "MainMenuUserProfileAvatarInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1 mainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1 = new MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1(3, (Continuation) obj3);
        mainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1.L$0 = (Drawable) obj;
        mainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1.L$1 = (String) obj2;
        return mainMenuUserProfileAvatarInteractor$getAvatarStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Drawable drawable = (Drawable) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(drawable, str);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
