package com.yandex.go.payments.shared;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dms;
import defpackage.kf4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.fragment.BaseFragment;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ClidProvider.STATE, "Landroidx/lifecycle/Lifecycle$State;", "fragment", "Lru/yandex/taxi/fragment/BaseFragment;", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/navigation/screen/api/Screen;", "isShown"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1", f = "SharedPaymentInvitationControllerStateUpdater.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1(w wVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = wVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        SharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1 sharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1 = new SharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1(this.this$0, (Continuation) obj5);
        sharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1.L$0 = (Lifecycle.State) obj;
        sharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1.L$1 = (BaseFragment) obj2;
        sharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1.L$2 = (Screen) obj3;
        sharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1.Z$0 = booleanValue;
        return sharedPaymentInvitationControllerStateUpdater$canShowNotificationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Lifecycle.State state = (Lifecycle.State) this.L$0;
        BaseFragment baseFragment = (BaseFragment) this.L$1;
        Screen screen = (Screen) this.L$2;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!z && state == Lifecycle.State.RESUMED && screen == Screen.MAIN && baseFragment.modalViewCoordinator().isEmpty() && !((Boolean) ((kf4) this.this$0.b.get()).b.getValue()).booleanValue());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
