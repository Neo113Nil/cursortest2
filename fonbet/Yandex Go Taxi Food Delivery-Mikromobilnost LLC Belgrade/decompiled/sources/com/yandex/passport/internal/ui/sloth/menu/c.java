package com.yandex.passport.internal.ui.sloth.menu;

import android.os.Message;
import com.yandex.passport.api.h3;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.vpr;
import defpackage.wwg;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c implements vpr {
    public final /* synthetic */ UserMenuActivity a;

    public c(UserMenuActivity userMenuActivity) {
        this.a = userMenuActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1 userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1;
        int i;
        com.yandex.passport.internal.sloth.performers.usermenu.g gVar;
        if (continuation instanceof UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1) {
            userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1 = (UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1) continuation;
            int i2 = userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.sloth.performers.usermenu.g gVar2 = (com.yandex.passport.internal.sloth.performers.usermenu.g) obj;
                    boolean z = gVar2 instanceof com.yandex.passport.internal.sloth.performers.usermenu.f;
                    UserMenuActivity userMenuActivity = this.a;
                    if (z) {
                        com.yandex.passport.internal.sloth.performers.usermenu.f fVar = (com.yandex.passport.internal.sloth.performers.usermenu.f) gVar2;
                        com.yandex.passport.internal.ui.c.k(userMenuActivity, com.yandex.passport.internal.ui.c.D(new h3(fVar.a, fVar.b)));
                    } else if (gVar2 instanceof com.yandex.passport.internal.sloth.performers.usermenu.e) {
                        e eVar = userMenuActivity.component;
                        if (eVar == null) {
                            eVar = null;
                        }
                        l userMenuRequestsProcessor = eVar.getUserMenuRequestsProcessor();
                        Message obtain = Message.obtain(null, 10, wwg.g(new Pair("ID_COMMAND", ((com.yandex.passport.internal.sloth.performers.usermenu.e) gVar2).a)));
                        userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.L$0 = gVar2;
                        userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.label = 1;
                        userMenuRequestsProcessor.getClass();
                        obj2 = com.yandex.passport.internal.provider.communication.a.b(userMenuRequestsProcessor, obtain, userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        gVar = gVar2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = (com.yandex.passport.internal.sloth.performers.usermenu.g) userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.L$0;
                kotlin.b.b(obj2);
                String str = (String) obj2;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    uw51.w("callback ", str, LogLevel.DEBUG, null, 8);
                }
                ((com.yandex.passport.internal.sloth.performers.usermenu.e) gVar).b.invoke(str);
                return zy11.a;
            }
        }
        userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1 = new UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1(this, continuation);
        Object obj22 = userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3$1$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj22;
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        ((com.yandex.passport.internal.sloth.performers.usermenu.e) gVar).b.invoke(str2);
        return zy11.a;
    }
}
