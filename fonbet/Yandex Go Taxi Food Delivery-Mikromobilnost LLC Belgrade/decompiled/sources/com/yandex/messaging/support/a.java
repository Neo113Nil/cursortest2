package com.yandex.messaging.support;

import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.support.SupportBotPayload;
import defpackage.b6u;
import defpackage.cb6;
import defpackage.d82;
import defpackage.g220;
import defpackage.i720;
import defpackage.jl40;
import defpackage.kse;
import defpackage.o1b0;
import defpackage.qiw0;
import defpackage.t2r;
import defpackage.tje;
import defpackage.up60;
import defpackage.xdf0;
import java.util.Map;

/* loaded from: classes15.dex */
public final class a {
    public final i720 a;
    public final g220 b;
    public final b6u c;
    public final cb6 d;
    public final xdf0 e;

    public a(i720 i720Var, g220 g220Var, b6u b6uVar, up60 up60Var, cb6 cb6Var, t2r t2rVar, kse kseVar, xdf0 xdf0Var, o1b0 o1b0Var) {
        this.a = i720Var;
        this.b = g220Var;
        this.c = b6uVar;
        this.d = cb6Var;
        this.e = xdf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(BotRequest botRequest) {
        qiw0 qiw0Var;
        Object customPayload = botRequest.getCustomPayload();
        Map map = customPayload instanceof Map ? (Map) customPayload : null;
        if (map != null) {
            Object obj = map.get("id");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                Object obj2 = map.get("method");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null) {
                    Object obj3 = map.get("target");
                    qiw0Var = new qiw0(str, str2, obj3 instanceof String ? (String) obj3 : null);
                    if (qiw0Var != null) {
                        return;
                    }
                    String str3 = qiw0Var.a;
                    if (jl40.l(qiw0Var.c, this.a.b())) {
                        Boolean bool = (Boolean) this.c.a.putIfAbsent(str3, Boolean.FALSE);
                        if (bool != null ? bool.booleanValue() : true) {
                            String str4 = qiw0Var.b;
                            if (str4.equals("get_env")) {
                                this.b.getClass();
                                this.d.a(new SupportBotPayload.NotSupported(str3), null, new d82(1));
                                return;
                            } else {
                                if (str4.equals("get_log")) {
                                    tje.N(this.e, null, null, new SupportBotRequestsHandler$handleLogRequest$1(this, str3, null), 3);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        qiw0Var = null;
        if (qiw0Var != null) {
        }
    }
}
