package com.yandex.messaging.miniapps.js.listeners;

import com.yandex.messaging.ChatRequest;
import defpackage.tje;
import defpackage.tse;
import defpackage.x22;
import org.json.JSONObject;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes15.dex */
public final class b {
    public final ChatRequest a;
    public final com.yandex.messaging.domain.botrequest.e b;
    public final x22 c;

    public b(ChatRequest chatRequest, com.yandex.messaging.domain.botrequest.e eVar, x22 x22Var) {
        this.a = chatRequest;
        this.b = eVar;
        this.c = x22Var;
    }

    public final void a(String str, tse tseVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "miniapp_hidden");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("miniappUrl", str);
        jSONObject.put("params", jSONObject2);
        tje.N(tseVar, null, null, new MiniAppHiddenListener$handle$1(this, jSONObject, null), 3);
    }
}
