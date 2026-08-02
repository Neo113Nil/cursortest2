package com.yandex.messaging.ui.main.telemessenger;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vcy0;
import defpackage.wcy0;
import defpackage.ycy0;
import defpackage.zcy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/yandex/messaging/ui/main/telemessenger/TeleMessengerMainFragmentTabs;", "currentTab", "Lycy0;", "callsTabItem", "chatsTabItem", "Lzcy0;", "profileTabItem", "Lvcy0;", "<anonymous>", "(Lcom/yandex/messaging/ui/main/telemessenger/TeleMessengerMainFragmentTabs;Lycy0;Lycy0;Lzcy0;)Lvcy0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.main.telemessenger.TeleMessengerNavBarViewModel$createFullUiStateFlow$1", f = "TeleMessengerNavBarViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TeleMessengerNavBarViewModel$createFullUiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TeleMessengerNavBarViewModel$createFullUiStateFlow$1 teleMessengerNavBarViewModel$createFullUiStateFlow$1 = new TeleMessengerNavBarViewModel$createFullUiStateFlow$1(5, (Continuation) obj5);
        teleMessengerNavBarViewModel$createFullUiStateFlow$1.L$0 = (TeleMessengerMainFragmentTabs) obj;
        teleMessengerNavBarViewModel$createFullUiStateFlow$1.L$1 = (ycy0) obj2;
        teleMessengerNavBarViewModel$createFullUiStateFlow$1.L$2 = (ycy0) obj3;
        teleMessengerNavBarViewModel$createFullUiStateFlow$1.L$3 = (zcy0) obj4;
        return teleMessengerNavBarViewModel$createFullUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new vcy0((TeleMessengerMainFragmentTabs) this.L$0, kotlin.collections.a.x0(scc.g((ycy0) this.L$1, (ycy0) this.L$2, (zcy0) this.L$3), new wcy0()));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
