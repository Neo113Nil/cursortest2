package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportInvalidHostException;
import com.yandex.passport.api.exception.PassportNoCookieForUidException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.report.d5;
import com.yandex.passport.internal.report.jd;
import defpackage.evu0;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class s implements w0 {
    public final com.yandex.passport.internal.database.auth_cookie.a a;
    public final com.yandex.passport.internal.methods.performer.error.a b;
    public final com.yandex.passport.internal.report.reporters.r c;

    public s(com.yandex.passport.internal.database.auth_cookie.a aVar, com.yandex.passport.internal.methods.performer.error.a aVar2, com.yandex.passport.internal.report.reporters.r rVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:6:0x001d, B:8:0x0021, B:11:0x002f, B:16:0x0041, B:19:0x0050, B:23:0x005f, B:25:0x0065, B:26:0x0069, B:27:0x00a7, B:30:0x004a, B:32:0x0028), top: B:5:0x001d }] */
    @Override // com.yandex.passport.internal.methods.performer.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(x2 x2Var) {
        String str;
        com.yandex.passport.internal.methods.w0 w0Var = (com.yandex.passport.internal.methods.w0) x2Var;
        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) w0Var.b.c);
        Object g = com.yandex.passport.common.util.a.g(new GetAuthCookiePerformer$performMethod$1(w0Var, this, B, null));
        Throwable a = Result.a(g);
        if (a == null) {
            return g;
        }
        try {
            String message = !(a instanceof PassportInvalidHostException) ? a instanceof PassportNoCookieForUidException ? "PassportNoCookieForUidException" : a.getMessage() : "PassportInvalidHostException";
            com.yandex.passport.internal.report.reporters.r rVar = this.c;
            String str2 = (String) w0Var.c.c;
            if (evu0.J(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                if (!evu0.y(str2, "://", false)) {
                    str2 = "https://".concat(str2);
                }
                com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str2);
                if (!com.yandex.passport.common.url.b.m(str2)) {
                    bVar = null;
                }
                if (bVar != null) {
                    str = bVar.a;
                    String d = str != null ? com.yandex.passport.common.url.b.d(str) : null;
                    rVar.getClass();
                    rVar.f(d5.w, new jd(Long.valueOf(B.getValue())), new com.yandex.passport.internal.report.i(d, 7), new com.yandex.passport.internal.report.a(String.valueOf(message), 26, false));
                    throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
                }
            }
            str = null;
            if (str != null) {
            }
            rVar.getClass();
            rVar.f(d5.w, new jd(Long.valueOf(B.getValue())), new com.yandex.passport.internal.report.i(d, 7), new com.yandex.passport.internal.report.a(String.valueOf(message), 26, false));
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
