package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.domik.DomikExternalAuthRequest;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.rol0;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class f0 implements com.yandex.passport.common.mvi.a {
    public static final Map d = kotlin.collections.b.i(new Pair("mr", PassportSocialConfiguration.SOCIAL_MAILRU), new Pair(WriteBlocks.OK, PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI), new Pair("vk", PassportSocialConfiguration.SOCIAL_VKONTAKTE), new Pair("gg", PassportSocialConfiguration.SOCIAL_GOOGLE), new Pair("tw", PassportSocialConfiguration.SOCIAL_TWITTER), new Pair("fb", PassportSocialConfiguration.SOCIAL_FACEBOOK), new Pair("esia", PassportSocialConfiguration.SOCIAL_ESIA), new Pair("tv1001", PassportSocialConfiguration.SOCIAL_TV_1001));
    public final com.yandex.passport.internal.report.reporters.m a;
    public final com.yandex.passport.internal.usecase.ui.c0 b;
    public final com.yandex.passport.internal.report.reporters.v0 c;

    public f0(com.yandex.passport.internal.report.reporters.m mVar, com.yandex.passport.internal.usecase.ui.c0 c0Var, com.yandex.passport.internal.report.reporters.v0 v0Var) {
        this.a = mVar;
        this.b = c0Var;
        this.c = v0Var;
    }

    public static com.yandex.passport.internal.ui.bouncer.model.n0 b(f0 f0Var, s1 s1Var, DomikExternalAuthRequest domikExternalAuthRequest) {
        f0Var.getClass();
        com.yandex.passport.internal.ui.bouncer.model.g1 g1Var = s1Var.d;
        return g1Var != null ? new com.yandex.passport.internal.ui.bouncer.model.p(new w1(g1Var.a, false, null, g1Var.d, g1Var.f, domikExternalAuthRequest, 4)) : new com.yandex.passport.internal.ui.bouncer.model.o("ProcessEventActor", "No bouncer parameters in current state", null);
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 10), r0Var, new ProcessEventActor$act$1(this, null));
    }
}
