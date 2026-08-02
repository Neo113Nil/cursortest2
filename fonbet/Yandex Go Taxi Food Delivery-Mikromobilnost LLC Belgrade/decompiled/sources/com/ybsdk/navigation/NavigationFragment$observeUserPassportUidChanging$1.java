package com.ybsdk.navigation;

import com.ybsdk.api.YBSdk;
import com.ybsdk.common.repositiories.auth.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w750;
import defpackage.wls;
import defpackage.x8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.navigation.NavigationFragment$observeUserPassportUidChanging$1", f = "NavigationFragment.kt", l = {839}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavigationFragment$observeUserPassportUidChanging$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ NavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationFragment$observeUserPassportUidChanging$1(NavigationFragment navigationFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = navigationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationFragment$observeUserPassportUidChanging$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationFragment$observeUserPassportUidChanging$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = ((f) ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).G.get()).b;
            w750 w750Var = new w750(this.this$0, i2);
            this.label = 1;
            if (tprVar.collect(w750Var, this) == coroutineSingletons) {
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
