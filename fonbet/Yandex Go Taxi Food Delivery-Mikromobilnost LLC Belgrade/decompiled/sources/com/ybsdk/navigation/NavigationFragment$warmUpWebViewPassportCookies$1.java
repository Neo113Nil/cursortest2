package com.ybsdk.navigation;

import defpackage.h9g;
import defpackage.mvg;
import defpackage.np41;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.navigation.NavigationFragment$warmUpWebViewPassportCookies$1", f = "NavigationFragment.kt", l = {1050}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavigationFragment$warmUpWebViewPassportCookies$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ NavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationFragment$warmUpWebViewPassportCookies$1(NavigationFragment navigationFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = navigationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationFragment$warmUpWebViewPassportCookies$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationFragment$warmUpWebViewPassportCookies$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            np41 np41Var = (np41) ((h9g) this.this$0.getSdkViewComponent()).M.get();
            this.label = 1;
            if (((com.ybsdk.feature.webview.internal.a) np41Var).d(this) == coroutineSingletons) {
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
