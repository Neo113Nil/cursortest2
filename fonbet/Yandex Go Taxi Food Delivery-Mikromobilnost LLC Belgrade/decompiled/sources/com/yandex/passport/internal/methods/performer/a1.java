package com.yandex.passport.internal.methods.performer;

import android.os.Bundle;
import com.yandex.passport.internal.methods.c2;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.w9;
import com.yandex.passport.internal.report.yd;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class a1 implements w0 {
    public final com.yandex.passport.internal.push.h a;
    public final com.yandex.passport.internal.report.reporters.s0 b;

    public a1(com.yandex.passport.internal.push.h hVar, com.yandex.passport.internal.report.reporters.s0 s0Var) {
        this.a = hVar;
        this.b = s0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        String str;
        String str2;
        String str3;
        String str4;
        c2 c2Var = (c2) x2Var;
        com.yandex.passport.internal.methods.b bVar = c2Var.b;
        Object g = com.yandex.passport.common.util.a.g(new OnPushMessageReceivedPerformer$performMethod$1(this, c2Var, null));
        Throwable a = Result.a(g);
        if (a != null) {
            try {
                str = ((Bundle) bVar.c).getString("push_id");
            } catch (Exception unused) {
                str = null;
            }
            try {
                str2 = ((Bundle) bVar.c).getString("event_name");
            } catch (Exception unused2) {
                str2 = null;
            }
            try {
                str3 = ((Bundle) bVar.c).getString("push_service");
            } catch (Exception unused3) {
                str3 = null;
            }
            try {
                str4 = ((Bundle) bVar.c).getString("is_silent");
            } catch (Exception unused4) {
                str4 = null;
            }
            Boolean valueOf = str4 != null ? Boolean.valueOf(Boolean.parseBoolean(str4)) : null;
            com.yandex.passport.internal.report.reporters.s0 s0Var = this.b;
            s0Var.getClass();
            s0Var.f(w9.w, new yd(a), new md(str, 7), new md(str3, 10), new com.yandex.passport.internal.report.i(str2, 1), new com.yandex.passport.internal.report.i(valueOf));
        }
        return g;
    }
}
