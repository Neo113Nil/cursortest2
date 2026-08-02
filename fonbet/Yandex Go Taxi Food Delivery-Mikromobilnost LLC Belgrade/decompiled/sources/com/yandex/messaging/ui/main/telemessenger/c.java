package com.yandex.messaging.ui.main.telemessenger;

import com.yandex.messaging.internal.v;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.g92;
import defpackage.ha2;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.o430;
import defpackage.rcc;
import defpackage.sc5;
import defpackage.scy0;
import defpackage.u5t;
import defpackage.ucy0;
import defpackage.vcy0;
import defpackage.wsr0;
import defpackage.xcy0;
import defpackage.xsr0;
import defpackage.ycy0;
import defpackage.zcy0;
import defpackage.zy11;
import kotlin.collections.builders.ListBuilder;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class c extends sc5 {
    public final r0 w;

    public c(u5t u5tVar, scy0 scy0Var, v vVar, com.yandex.messaging.domain.statuses.c cVar, xcy0 xcy0Var) {
        r0 c = bvf0.c(scy0Var.c);
        this.w = c;
        TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs = TeleMessengerMainFragmentTabs.CALLS;
        g92 g92Var = new g92(2, new ycy0(teleMessengerMainFragmentTabs, 0));
        TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs2 = TeleMessengerMainFragmentTabs.CHATS;
        ycy0 ycy0Var = new ycy0(teleMessengerMainFragmentTabs2, 0);
        n nVar = new n(new m0(u5t.d(u5tVar), c, new TeleMessengerNavBarViewModel$createChatsTabFlow$1(ycy0Var, this, null)), new TeleMessengerNavBarViewModel$createChatsTabFlow$2(ycy0Var, null));
        TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs3 = TeleMessengerMainFragmentTabs.PROFILE;
        zcy0 zcy0Var = new zcy0(teleMessengerMainFragmentTabs3, "", null);
        zy11 zy11Var = zy11.a;
        ha2 m = e.m(c, g92Var, nVar, new n(new m0(vVar.a(zy11Var), cVar.a(zy11Var), new TeleMessengerNavBarViewModel$createProfileTabFlow$1(zcy0Var, null)), new TeleMessengerNavBarViewModel$createProfileTabFlow$2(zcy0Var, null)), new TeleMessengerNavBarViewModel$createFullUiStateFlow$1(5, null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        q0 a2 = jx81.a(2, kp50.U(5, DurationUnit.SECONDS));
        TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs4 = (TeleMessengerMainFragmentTabs) c.getValue();
        ListBuilder a3 = rcc.a();
        a3.add(new ycy0(teleMessengerMainFragmentTabs, 0));
        a3.add(new ycy0(teleMessengerMainFragmentTabs2, 0));
        a3.add(new ycy0(teleMessengerMainFragmentTabs3, 0));
        e.R(m, a, a2, new vcy0(teleMessengerMainFragmentTabs4, kotlin.collections.a.x0(a3.j(), new ucy0())));
    }
}
