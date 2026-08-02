package com.yandex.quark.webchat.navigation.internal;

import defpackage.a950;
import defpackage.anj;
import defpackage.b950;
import defpackage.bvf0;
import defpackage.d950;
import defpackage.dnj;
import defpackage.e950;
import defpackage.fxz0;
import defpackage.gci0;
import defpackage.gcx;
import defpackage.jqr;
import defpackage.jyj0;
import defpackage.lyj0;
import defpackage.mih;
import defpackage.nkc;
import defpackage.png;
import defpackage.sls;
import defpackage.smj;
import defpackage.syj0;
import defpackage.t830;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wmj;
import defpackage.yr1;
import defpackage.zwf0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final mih a;
    public final zwf0 b;
    public final gcx c;
    public final r0 d;
    public final gci0 e;

    public a(yr1 yr1Var, mih mihVar, zwf0 zwf0Var, t830 t830Var) {
        this.a = mihVar;
        this.b = zwf0Var;
        this.c = t830Var;
        r0 c = bvf0.c(fxz0.a);
        this.d = c;
        this.e = e.d(c);
        e.H(mihVar.a.a, new jqr(yr1Var.a, new WebChatNavigatorImpl$observeChatCapabilityState$1(this, null), 3));
    }

    public final e950 a(sls slsVar) {
        if (this.d.getValue() instanceof fxz0) {
            return b950.a;
        }
        syj0 syj0Var = (syj0) slsVar.invoke();
        boolean z = syj0Var instanceof lyj0;
        a950 a950Var = a950.a;
        zwf0 zwf0Var = this.b;
        if (!z) {
            if (!(syj0Var instanceof jyj0)) {
                w511.b();
                return null;
            }
            zwf0Var.f("WebChatNavigator", "Failed to create navigation directive', error='" + ((wmj) ((jyj0) syj0Var).a).a() + "'");
            return a950Var;
        }
        smj smjVar = (smj) ((lyj0) syj0Var).a;
        syj0 a = anj.a(smjVar, this.c, zwf0Var);
        if (a instanceof lyj0) {
            this.a.b(new nkc(smjVar.b(), (png) ((lyj0) a).a));
            return d950.a;
        }
        if (!(a instanceof jyj0)) {
            w511.b();
            return null;
        }
        zwf0Var.f("WebChatNavigator", unr0.p("Failed to serialize to json directive: directive='", dnj.a(smjVar.b()), "', error='", ((wmj) ((jyj0) a).a).a(), "'"));
        return a950Var;
    }
}
