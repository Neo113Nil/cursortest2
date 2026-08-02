package com.yandex.messaging.ui.main.telemessenger;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ycy0;
import defpackage.yd80;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyd80;", "info", "Lcom/yandex/messaging/ui/main/telemessenger/TeleMessengerMainFragmentTabs;", "currentTab", "Lycy0;", "<anonymous>", "(Lyd80;Lcom/yandex/messaging/ui/main/telemessenger/TeleMessengerMainFragmentTabs;)Lycy0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.main.telemessenger.TeleMessengerNavBarViewModel$createChatsTabFlow$1", f = "TeleMessengerNavBarViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TeleMessengerNavBarViewModel$createChatsTabFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ ycy0 $defaultTab;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeleMessengerNavBarViewModel$createChatsTabFlow$1(ycy0 ycy0Var, c cVar, Continuation continuation) {
        super(3, continuation);
        this.$defaultTab = ycy0Var;
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TeleMessengerNavBarViewModel$createChatsTabFlow$1 teleMessengerNavBarViewModel$createChatsTabFlow$1 = new TeleMessengerNavBarViewModel$createChatsTabFlow$1(this.$defaultTab, this.this$0, (Continuation) obj3);
        teleMessengerNavBarViewModel$createChatsTabFlow$1.L$0 = (yd80) obj;
        teleMessengerNavBarViewModel$createChatsTabFlow$1.L$1 = (TeleMessengerMainFragmentTabs) obj2;
        return teleMessengerNavBarViewModel$createChatsTabFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        yd80 yd80Var = (yd80) this.L$0;
        if (((TeleMessengerMainFragmentTabs) this.L$1) == this.$defaultTab.a) {
            i = 0;
        } else {
            this.this$0.getClass();
            i = (yd80Var.a + yd80Var.c) - yd80Var.b;
        }
        ycy0 ycy0Var = this.$defaultTab;
        TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs = ycy0Var.a;
        ycy0Var.getClass();
        return new ycy0(teleMessengerMainFragmentTabs, i);
    }
}
