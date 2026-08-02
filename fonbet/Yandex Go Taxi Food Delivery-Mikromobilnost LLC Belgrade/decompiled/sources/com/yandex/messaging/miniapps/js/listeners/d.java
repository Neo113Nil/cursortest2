package com.yandex.messaging.miniapps.js.listeners;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.miniapps.js.ChannelEventType;
import defpackage.dqv;
import defpackage.n5b1;
import defpackage.oh20;
import defpackage.qcx;
import defpackage.rh20;
import defpackage.sh20;
import defpackage.th20;
import defpackage.tje;
import defpackage.tls;
import defpackage.x22;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class d extends rh20 {
    public final ChatRequest e;
    public final oh20 f;
    public final th20 g;
    public final sh20 h;
    public final x22 i;
    public tls j;

    public d(ChatRequest chatRequest, oh20 oh20Var, th20 th20Var, sh20 sh20Var, x22 x22Var) {
        super(ChannelEventType.SetHeight);
        this.e = chatRequest;
        this.f = oh20Var;
        this.g = th20Var;
        this.h = sh20Var;
        this.i = x22Var;
    }

    @Override // defpackage.rh20
    public final void a(dqv dqvVar) {
        kotlinx.serialization.json.c e;
        kotlinx.serialization.json.b bVar;
        JSONObject jSONObject = dqvVar.c;
        Integer k = (jSONObject == null || (e = n5b1.e(jSONObject)) == null || (bVar = (kotlinx.serialization.json.b) e.get(Constants.KEY_DATA)) == null) ? null : qcx.k(qcx.n(bVar));
        this.i.f("csat_setHeight_received", "messageId", dqvVar.d, "height", k);
        tje.N(this.f, null, null, new SetHeightListener$handle$1(k, this, dqvVar, null), 3);
    }
}
