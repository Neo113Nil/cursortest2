package com.yandex.passport.common.network;

import android.net.Uri;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.cvu0;
import defpackage.d5j0;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.t4j0;
import java.util.Map;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes8.dex */
public class o {
    public final t4j0 a;
    public final jwu b;

    public o(String str) {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.c.g(ExtFunctionsKt.HEADER_USER_AGENT, com.yandex.passport.common.util.c.a);
        this.a = t4j0Var;
        jwu jwuVar = new jwu();
        jwuVar.h(com.yandex.passport.common.url.b.g(str));
        String e = com.yandex.passport.common.url.b.e(str);
        int c = com.yandex.passport.common.url.b.c(e);
        int i = -1;
        if (c != -1) {
            String decode = Uri.decode(e.substring(c + 1));
            try {
                i = Integer.parseInt(decode);
            } catch (NumberFormatException e2) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Error parsing port string: ".concat(decode), e2);
                }
            }
        }
        Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            jwuVar.j(valueOf.intValue());
        }
        jwuVar.o(com.yandex.passport.common.url.b.j(str));
        this.b = jwuVar;
    }

    public d5j0 a() {
        kwu e = this.b.e();
        t4j0 t4j0Var = this.a;
        t4j0Var.a = e;
        t4j0Var.getClass();
        return new d5j0(t4j0Var);
    }

    public final void b(String str, String str2) {
        if (str2 != null) {
            this.a.d(str, str2);
        }
    }

    public final void c(String str) {
        if (cvu0.x(str, "/", false)) {
            str = str.substring(1);
        }
        this.b.c(str, false);
    }

    public final void d(String str, String str2) {
        if (str2 != null) {
            this.b.d(str, str2);
        }
    }

    public final void e(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            d((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
