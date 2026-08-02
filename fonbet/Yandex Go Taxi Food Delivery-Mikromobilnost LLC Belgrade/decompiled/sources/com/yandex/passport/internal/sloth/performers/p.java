package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.reporters.j1;
import com.yandex.passport.internal.report.vc;
import com.yandex.passport.internal.report.wc;
import com.yandex.passport.internal.report.xc;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class p implements s {
    public final com.yandex.passport.internal.sloth.webauthn.c a;
    public final com.yandex.passport.internal.properties.p b;
    public final j1 c;

    public p(com.yandex.passport.internal.sloth.webauthn.c cVar, com.yandex.passport.internal.properties.p pVar, j1 j1Var) {
        this.a = cVar;
        this.b = pVar;
        this.c = j1Var;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        com.yandex.passport.internal.properties.p pVar = this.b;
        boolean z = pVar.v;
        j1 j1Var = this.c;
        j1Var.getClass();
        j1Var.f(wc.w, new yd(z, 7));
        if (!pVar.v) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webAuthNAvailable", false);
            return new iqn(new com.yandex.passport.sloth.command.b(jSONObject));
        }
        Object b = this.a.b();
        Throwable a = Result.a(b);
        if (a != null) {
            j1Var.f(vc.w, new yd(a), new ld(a));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("webAuthNAvailable", false);
            return new iqn(new com.yandex.passport.sloth.command.b(jSONObject2));
        }
        boolean booleanValue = ((Boolean) b).booleanValue();
        j1Var.f(xc.w, new com.yandex.passport.internal.report.i(booleanValue, 20));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("webAuthNAvailable", booleanValue);
        return new iqn(new com.yandex.passport.sloth.command.b(jSONObject3));
    }
}
