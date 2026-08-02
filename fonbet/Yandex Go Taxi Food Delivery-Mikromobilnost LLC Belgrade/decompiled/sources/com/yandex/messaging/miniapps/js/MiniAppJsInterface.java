package com.yandex.messaging.miniapps.js;

import android.webkit.JavascriptInterface;
import com.yandex.messaging.miniapps.js.messages.MiniAppMessageError;
import defpackage.dqv;
import defpackage.gbb1;
import defpackage.ike;
import defpackage.jl40;
import defpackage.rh20;
import defpackage.tje;
import defpackage.vse;
import defpackage.x22;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class MiniAppJsInterface {
    public final x22 a;
    public final ike b;
    public final ArrayList c = new ArrayList();

    public MiniAppJsInterface(x22 x22Var, vse vseVar) {
        this.a = x22Var;
        this.b = vseVar.c(true);
    }

    public final void a(rh20 rh20Var) {
        tje.N(this.b, null, null, new MiniAppJsInterface$addListener$1(this, rh20Var, null), 3);
    }

    public final void b() {
        tje.N(this.b, null, null, new MiniAppJsInterface$clearListeners$1(this, null), 3);
    }

    @JavascriptInterface
    public final void receiveMessage(String str) {
        dqv dqvVar = new dqv(new JSONObject(str));
        MiniAppMessageError miniAppMessageError = dqvVar.b;
        if (miniAppMessageError != null) {
            this.a.c("csat_error_js_message", "error", miniAppMessageError.getMessage());
            return;
        }
        boolean l = jl40.l(dqvVar.f, ChannelMessageType.Response.getValue());
        ike ikeVar = this.b;
        if (l) {
            tje.N(ikeVar, null, null, new MiniAppJsInterface$receiveMessage$1(dqvVar, this, null), 3);
        }
        JSONObject jSONObject = dqvVar.c;
        String a = jSONObject != null ? gbb1.a("type", jSONObject) : null;
        if (a != null) {
            tje.N(ikeVar, null, null, new MiniAppJsInterface$receiveMessage$2(this, a, dqvVar, null), 3);
        }
    }
}
