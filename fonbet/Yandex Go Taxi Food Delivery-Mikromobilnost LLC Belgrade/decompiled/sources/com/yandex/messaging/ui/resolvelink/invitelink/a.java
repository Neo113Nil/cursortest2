package com.yandex.messaging.ui.resolvelink.invitelink;

import com.yandex.messaging.domain.inviteLink.b;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.jsj0;
import defpackage.nsj0;
import defpackage.sc5;
import defpackage.tje;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends sc5 {
    public final jsj0 w;
    public final b x;
    public final r0 y;
    public final gci0 z;

    public a(jsj0 jsj0Var, b bVar) {
        this.w = jsj0Var;
        this.x = bVar;
        r0 c = bvf0.c(nsj0.a);
        this.y = c;
        this.z = e.d(c);
        tje.N(ds31.a(this), null, null, new ResolveInviteLinkViewModel$resolveInviteLink$1(this, null), 3);
    }
}
