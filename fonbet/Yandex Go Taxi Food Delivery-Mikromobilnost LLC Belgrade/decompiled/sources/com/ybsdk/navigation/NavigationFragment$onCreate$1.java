package com.ybsdk.navigation;

import com.ybsdk.api.YBSdk;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q860;
import defpackage.wls;
import defpackage.x8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "it", "Lzy11;", "<anonymous>", "(Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.navigation.NavigationFragment$onCreate$1", f = "NavigationFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavigationFragment$onCreate$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavigationFragment$onCreate$1 navigationFragment$onCreate$1 = new NavigationFragment$onCreate$1(2, continuation);
        navigationFragment$onCreate$1.L$0 = obj;
        return navigationFragment$onCreate$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NavigationFragment$onCreate$1 navigationFragment$onCreate$1 = (NavigationFragment$onCreate$1) create((NfcInfoDto) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        navigationFragment$onCreate$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((q860) ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).A0.get()).a = (NfcInfoDto) this.L$0;
        return zy11.a;
    }
}
