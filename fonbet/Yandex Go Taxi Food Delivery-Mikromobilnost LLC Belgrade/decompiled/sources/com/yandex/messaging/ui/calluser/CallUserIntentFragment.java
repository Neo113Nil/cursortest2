package com.yandex.messaging.ui.calluser;

import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.hs31;
import defpackage.ndb1;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tfx;
import defpackage.vk7;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/ui/calluser/CallUserIntentFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lvk7;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallUserIntentFragment extends ComposeBottomSheetDialogFragment<vk7> {
    public static final int $stable = 0;

    public CallUserIntentFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-625212529);
        btsVar.e0(1188628422);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            CallUserIntentFragment$DialogContent$1$1 callUserIntentFragment$DialogContent$1$1 = new CallUserIntentFragment$DialogContent$1$1(0, this, CallUserIntentFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(callUserIntentFragment$DialogContent$1$1);
            Q = callUserIntentFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        ndb1.a(i & 14, btsVar, (sls) ((tfx) Q), f530Var);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        CallUserIntentFragment$getViewModelFactory$1 callUserIntentFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof CallUserIntentFragment$getViewModelFactory$1) {
            callUserIntentFragment$getViewModelFactory$1 = (CallUserIntentFragment$getViewModelFactory$1) continuation;
            int i2 = callUserIntentFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callUserIntentFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callUserIntentFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callUserIntentFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh activityComponentAsync = getActivityComponentAsync();
                    callUserIntentFragment$getViewModelFactory$1.L$0 = this;
                    callUserIntentFragment$getViewModelFactory$1.label = 1;
                    obj = activityComponentAsync.k(callUserIntentFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                throw oyr.d(obj);
            }
        }
        callUserIntentFragment$getViewModelFactory$1 = new CallUserIntentFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = callUserIntentFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callUserIntentFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }
}
