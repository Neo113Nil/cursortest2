package com.yandex.messaging.telemost;

import com.yandex.messaging.MessengerEnvironment;
import defpackage.a9g;
import defpackage.clb1;
import defpackage.lqo;
import defpackage.m320;
import defpackage.ney0;
import defpackage.tz10;
import defpackage.z83;

/* loaded from: classes15.dex */
public abstract class a {
    public static ney0 a(lqo lqoVar, a9g a9gVar, MessengerEnvironment messengerEnvironment) {
        z83.i();
        if (!lqoVar.a(tz10.p) || clb1.d(messengerEnvironment)) {
            return ney0.a;
        }
        ney0 ney0Var = (ney0) m320.a.c(new TelemostController$DepsModule$provideController$instance$1(0, a9gVar, a9g.class, "build", "build()Lcom/yandex/messaging/telemost/TelemostPluginDependencies;", 0));
        return ney0Var == null ? ney0.a : ney0Var;
    }
}
