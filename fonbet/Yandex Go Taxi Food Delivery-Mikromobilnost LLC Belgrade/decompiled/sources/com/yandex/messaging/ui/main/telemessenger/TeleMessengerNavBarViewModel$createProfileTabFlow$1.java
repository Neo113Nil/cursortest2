package com.yandex.messaging.ui.main.telemessenger;

import defpackage.gu21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x4b0;
import defpackage.zcy0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx4b0;", "personalInfo", "Lgu21;", "userStatus", "Lzcy0;", "<anonymous>", "(Lx4b0;Lgu21;)Lzcy0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.main.telemessenger.TeleMessengerNavBarViewModel$createProfileTabFlow$1", f = "TeleMessengerNavBarViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TeleMessengerNavBarViewModel$createProfileTabFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ zcy0 $defaultTab;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeleMessengerNavBarViewModel$createProfileTabFlow$1(zcy0 zcy0Var, Continuation continuation) {
        super(3, continuation);
        this.$defaultTab = zcy0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TeleMessengerNavBarViewModel$createProfileTabFlow$1 teleMessengerNavBarViewModel$createProfileTabFlow$1 = new TeleMessengerNavBarViewModel$createProfileTabFlow$1(this.$defaultTab, (Continuation) obj3);
        teleMessengerNavBarViewModel$createProfileTabFlow$1.L$0 = (x4b0) obj;
        teleMessengerNavBarViewModel$createProfileTabFlow$1.L$1 = (gu21) obj2;
        return teleMessengerNavBarViewModel$createProfileTabFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        x4b0 x4b0Var = (x4b0) this.L$0;
        gu21 gu21Var = (gu21) this.L$1;
        zcy0 zcy0Var = this.$defaultTab;
        String str = x4b0Var.c;
        if (str == null) {
            str = "";
        }
        TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs = zcy0Var.a;
        zcy0Var.getClass();
        return new zcy0(teleMessengerMainFragmentTabs, str, gu21Var);
    }
}
