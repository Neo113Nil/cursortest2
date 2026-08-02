package com.yandex.go.mainscreen.superapp.impl.navigation;

import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.g;
import com.yandex.go.search.router.FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w7w0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.navigation.SuperAppMainShortcutRouter$showWhereToModalView$1", f = "SuperAppMainShortcutRouter.kt", l = {214}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainShortcutRouter$showWhereToModalView$1 extends SuspendLambda implements wls {
    final /* synthetic */ Action$RouteInput $action;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainShortcutRouter$showWhereToModalView$1(c cVar, Action$RouteInput action$RouteInput, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = action$RouteInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainShortcutRouter$showWhereToModalView$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainShortcutRouter$showWhereToModalView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.g;
            Action$RouteInput action$RouteInput = this.$action;
            FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection = FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection.FORWARD;
            String str = action$RouteInput.d;
            this.label = 1;
            gVar.getClass();
            Action$RouteInput.AdditionalAction additionalAction = action$RouteInput.c;
            AdditionalAction additionalAction2 = AdditionalAction.NONE;
            int i2 = w7w0.a[additionalAction.a.ordinal()];
            if (i2 == 1) {
                additionalAction2 = AdditionalAction.PREORDER;
            } else if (i2 == 2) {
                additionalAction2 = AdditionalAction.ORDER_TO_ANOTHER;
            }
            if (gVar.a(additionalAction2, fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection, str, action$RouteInput.b, this) == coroutineSingletons) {
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
