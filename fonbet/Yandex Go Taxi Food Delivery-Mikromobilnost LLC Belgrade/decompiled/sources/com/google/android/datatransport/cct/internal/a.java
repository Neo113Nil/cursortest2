package com.google.android.datatransport.cct.internal;

import defpackage.ip60;
import defpackage.jp60;
import defpackage.lxq;

/* loaded from: classes.dex */
public final class a implements ip60 {
    public static final a a = new a();
    public static final lxq b = lxq.c("clientType");
    public static final lxq c = lxq.c("androidClientInfo");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ClientInfo clientInfo = (ClientInfo) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, clientInfo.b());
        jp60Var.f(c, clientInfo.a());
    }
}
