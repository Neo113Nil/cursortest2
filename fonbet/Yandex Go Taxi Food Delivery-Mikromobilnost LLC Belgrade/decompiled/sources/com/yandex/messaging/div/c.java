package com.yandex.messaging.div;

import android.view.View;
import com.yandex.div.legacy.view.DivView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.DivMessageData;
import defpackage.bn2;
import defpackage.e2b;
import defpackage.k9b;
import defpackage.p4t;
import defpackage.pbj;
import defpackage.pmk;
import defpackage.szk;
import defpackage.tzk;
import defpackage.uds0;
import defpackage.w7b;
import defpackage.x22;
import defpackage.yab;
import defpackage.zmk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class c implements tzk {
    public final szk a;
    public final x22 b;
    public final pbj c;
    public final a d;
    public final e2b e;
    public ChatRequest f;

    public c(szk szkVar, x22 x22Var, pbj pbjVar, a aVar) {
        this.a = szkVar;
        this.b = x22Var;
        this.c = pbjVar;
        this.d = aVar;
        this.e = new e2b(new DivMessageViewControllerImpl$singleViewHandler$1(2, this, c.class, "handleUri", "handleUri(Landroid/net/Uri;Lcom/yandex/div/legacy/view/DivView;)Z", 0), szkVar.w);
    }

    @Override // defpackage.tzk
    public final void cleanup() {
        this.a.w.cleanup();
        this.f = null;
    }

    @Override // defpackage.tzk
    public final void d(yab yabVar) {
        DivView divView = this.a.w;
        this.d.e = yabVar.W();
        DivMessageData divMessageData = (DivMessageData) yabVar.R();
        try {
            divView.setDivData(new pmk(new JSONObject(divMessageData.card)), new zmk(yabVar.U() + "_" + divMessageData.lastEditTimestamp));
        } catch (JSONException e) {
            divView.cleanup();
            this.b.reportError("Wrong format of a div card", e);
        }
    }

    @Override // defpackage.tzk
    public final void e() {
        this.d.g.remove(this.e);
        pbj pbjVar = this.c;
        pbjVar.b = false;
        uds0 uds0Var = (uds0) pbjVar.a;
        if (uds0Var != null) {
            uds0Var.close();
            pbjVar.a = null;
        }
        bn2 bn2Var = (bn2) pbjVar.B;
        if (bn2Var != null) {
            bn2Var.cancel();
            pbjVar.B = null;
        }
    }

    @Override // defpackage.tzk
    public final void f() {
        ChatRequest chatRequest = this.f;
        if (chatRequest == null) {
            return;
        }
        pbj pbjVar = this.c;
        pbjVar.b = true;
        uds0 uds0Var = (uds0) pbjVar.a;
        if (uds0Var != null) {
            uds0Var.close();
            pbjVar.a = null;
        }
        pbjVar.a = ((p4t) pbjVar.y).c(chatRequest, new k9b(11, pbjVar));
        this.d.g.add(this.e);
    }

    @Override // defpackage.tzk
    public final void g(ChatRequest chatRequest, w7b w7bVar) {
        this.f = chatRequest;
        a aVar = this.d;
        aVar.d = chatRequest;
        aVar.c = w7bVar;
    }

    @Override // defpackage.tzk
    public final View getView() {
        return this.a.b;
    }
}
