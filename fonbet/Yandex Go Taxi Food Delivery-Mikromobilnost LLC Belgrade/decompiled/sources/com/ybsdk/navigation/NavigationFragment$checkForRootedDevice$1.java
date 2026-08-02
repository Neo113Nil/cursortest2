package com.ybsdk.navigation;

import android.content.Context;
import com.ybsdk.api.YBSdk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.navigation.NavigationFragment$checkForRootedDevice$1", f = "NavigationFragment.kt", l = {1044}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavigationFragment$checkForRootedDevice$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ NavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationFragment$checkForRootedDevice$1(NavigationFragment navigationFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = navigationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationFragment$checkForRootedDevice$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationFragment$checkForRootedDevice$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.utils.a aVar = (com.ybsdk.utils.a) ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).z1.get();
            Context requireContext = this.this$0.requireContext();
            this.label = 1;
            if (aVar.a(requireContext, this) == coroutineSingletons) {
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
