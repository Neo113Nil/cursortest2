package com.yandex.go.user_profile.main_menu.profile.domain;

import defpackage.avj0;
import defpackage.f1h0;
import defpackage.m600;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "it", "Lru/yandex/taxi/theme/ThemeType;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.domain.MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$placeholderFlow$1", f = "MainMenuUserProfileAvatarInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$placeholderFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ m600 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$placeholderFlow$1(m600 m600Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m600Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$placeholderFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainMenuUserProfileAvatarInteractor$getAvatarStateFlow$placeholderFlow$1) create((ThemeType) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return vng.t(f1h0.ic_user, ((avj0) this.this$0.f).a);
    }
}
