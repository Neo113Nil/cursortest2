package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tya0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment$requestContactsPermission$1", f = "MobilePaymentSelectContactFragment.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MobilePaymentSelectContactFragment$requestContactsPermission$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $byUser;
    int label;
    final /* synthetic */ MobilePaymentSelectContactFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilePaymentSelectContactFragment$requestContactsPermission$1(MobilePaymentSelectContactFragment mobilePaymentSelectContactFragment, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mobilePaymentSelectContactFragment;
        this.$byUser = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobilePaymentSelectContactFragment$requestContactsPermission$1(this.this$0, this.$byUser, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobilePaymentSelectContactFragment$requestContactsPermission$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tya0 permissionManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            permissionManager = this.this$0.getPermissionManager();
            boolean z = this.$byUser;
            this.label = 1;
            if (((com.ybsdk.core.permissions.a) permissionManager).c(z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
