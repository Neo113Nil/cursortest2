package com.yandex.go.mainscreen.superapp.impl.navigation;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.g;
import com.yandex.go.search.router.FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.navigation.SuperAppMainShortcutRouter$backToSuggest$1", f = "SuperAppMainShortcutRouter.kt", l = {332}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainShortcutRouter$backToSuggest$1 extends SuspendLambda implements wls {
    final /* synthetic */ AdditionalAction $additionalAction;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainShortcutRouter$backToSuggest$1(c cVar, AdditionalAction additionalAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$additionalAction = additionalAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainShortcutRouter$backToSuggest$1(this.this$0, this.$additionalAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainShortcutRouter$backToSuggest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.g;
            AdditionalAction additionalAction = this.$additionalAction;
            FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection = FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection.BACKWARD;
            this.label = 1;
            if (gVar.a(additionalAction, fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection, null, "", this) == coroutineSingletons) {
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
