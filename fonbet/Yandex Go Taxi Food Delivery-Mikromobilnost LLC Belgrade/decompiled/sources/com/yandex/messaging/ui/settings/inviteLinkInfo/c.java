package com.yandex.messaging.ui.settings.inviteLinkInfo;

import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.v;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.gci0;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.lww;
import defpackage.o430;
import defpackage.p220;
import defpackage.q220;
import defpackage.r1s;
import defpackage.reu;
import defpackage.sc5;
import defpackage.tje;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class c extends sc5 {
    public final r0 A;
    public final r0 B;
    public String C;
    public final gci0 D;
    public final com.yandex.messaging.domain.inviteLink.a w;
    public final reu x;
    public final r1s y;
    public final gci0 z;

    public c(v vVar, com.yandex.messaging.domain.inviteLink.a aVar, reu reuVar, r1s r1sVar) {
        this.w = aVar;
        this.x = reuVar;
        this.y = r1sVar;
        tpr a = vVar.a(zy11.a);
        k5c a2 = ds31.a(this);
        xsr0.a.getClass();
        this.z = e.R(a, a2, wsr0.b, null);
        r0 c = bvf0.c(InviteLinkType.TEMPORARY);
        this.A = c;
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.B = c2;
        m0 m0Var = new m0(c, c2, new TelemessengerInviteLinkInfoViewModel$uiState$1(3, null));
        k5c a3 = ds31.a(this);
        o430 o430Var = e3n.b;
        this.D = e.R(m0Var, a3, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), new lww(0));
    }

    public final void Y(String str) {
        String format;
        r1s r1sVar = this.y;
        String a = ((p220) r1sVar.b).a((MessengerEnvironment) r1sVar.w);
        if (a == null) {
            format = null;
        } else {
            ((q220) r1sVar.c).getClass();
            format = String.format("https://%s/link#%s", Arrays.copyOf(new Object[]{a, str}, 2));
        }
        if (format != null) {
            tje.N(ds31.a(this), null, null, new TelemessengerInviteLinkInfoViewModel$sendCopyLinkEvent$1(this, format, null), 3);
        }
    }
}
