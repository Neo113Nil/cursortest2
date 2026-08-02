package com.yandex.messaging.miniapps.js.listeners;

import com.yandex.messaging.miniapps.js.ChannelEventType;
import defpackage.dqv;
import defpackage.edb1;
import defpackage.jjs0;
import defpackage.n5b1;
import defpackage.oh20;
import defpackage.rh20;
import defpackage.sh20;
import defpackage.th20;
import defpackage.tje;
import defpackage.tls;
import defpackage.x22;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class e extends rh20 {
    public final oh20 e;
    public final th20 f;
    public final sh20 g;
    public final x22 h;
    public tls i;

    public e(oh20 oh20Var, th20 th20Var, sh20 sh20Var, x22 x22Var) {
        super(ChannelEventType.SetSize);
        this.e = oh20Var;
        this.f = th20Var;
        this.g = sh20Var;
        this.h = x22Var;
    }

    @Override // defpackage.rh20
    public final void a(dqv dqvVar) {
        kotlinx.serialization.json.c e;
        kotlinx.serialization.json.b bVar;
        JSONObject jSONObject = dqvVar.c;
        jjs0 c = (jSONObject == null || (e = n5b1.e(jSONObject)) == null || (bVar = (kotlinx.serialization.json.b) e.get(Constants.KEY_DATA)) == null) ? null : edb1.c(bVar);
        this.h.f("csat_setSize_received", "messageId", dqvVar.d, "hasSize", Boolean.valueOf(c != null));
        tje.N(this.e, null, null, new SetSizeListener$handle$1(c, this, dqvVar, null), 3);
    }
}
