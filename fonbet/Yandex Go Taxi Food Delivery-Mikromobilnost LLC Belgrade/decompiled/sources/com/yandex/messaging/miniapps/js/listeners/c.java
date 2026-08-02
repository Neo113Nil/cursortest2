package com.yandex.messaging.miniapps.js.listeners;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.miniapps.js.ChannelEventType;
import defpackage.dqv;
import defpackage.oh20;
import defpackage.rh20;
import defpackage.sh20;
import defpackage.th20;
import defpackage.tje;
import defpackage.x22;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes15.dex */
public final class c extends rh20 {
    public final ChatRequest e;
    public final com.yandex.messaging.domain.botrequest.e f;
    public final oh20 g;
    public final th20 h;
    public final sh20 i;
    public final x22 j;

    public c(ChatRequest chatRequest, com.yandex.messaging.domain.botrequest.e eVar, oh20 oh20Var, th20 th20Var, sh20 sh20Var, x22 x22Var) {
        super(ChannelEventType.Notify);
        this.e = chatRequest;
        this.f = eVar;
        this.g = oh20Var;
        this.h = th20Var;
        this.i = sh20Var;
        this.j = x22Var;
    }

    @Override // defpackage.rh20
    public final void a(dqv dqvVar) {
        this.j.c("csat_notify_received", "messageId", dqvVar.d);
        JSONObject jSONObject = dqvVar.c;
        Object obj = jSONObject != null ? jSONObject.get(Constants.KEY_DATA) : null;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "miniapp_notify");
        jSONObject2.put("params", obj);
        tje.N(this.g, null, null, new NotifyListener$handle$1(this, jSONObject2, dqvVar, null), 3);
    }
}
