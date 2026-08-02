package com.yandex.messaging.ui.settings.inviteLinkInfo;

import defpackage.lww;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/messaging/ui/settings/inviteLinkInfo/InviteLinkType;", "linkType", "", "isLoading", "Llww;", "<anonymous>", "(Lcom/yandex/messaging/ui/settings/inviteLinkInfo/InviteLinkType;Z)Llww;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.inviteLinkInfo.TelemessengerInviteLinkInfoViewModel$uiState$1", f = "TelemessengerInviteLinkInfoViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TelemessengerInviteLinkInfoViewModel$uiState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TelemessengerInviteLinkInfoViewModel$uiState$1 telemessengerInviteLinkInfoViewModel$uiState$1 = new TelemessengerInviteLinkInfoViewModel$uiState$1(3, (Continuation) obj3);
        telemessengerInviteLinkInfoViewModel$uiState$1.L$0 = (InviteLinkType) obj;
        telemessengerInviteLinkInfoViewModel$uiState$1.Z$0 = booleanValue;
        return telemessengerInviteLinkInfoViewModel$uiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        InviteLinkType inviteLinkType = (InviteLinkType) this.L$0;
        return new lww(inviteLinkType, this.Z$0 && inviteLinkType == InviteLinkType.TEMPORARY);
    }
}
