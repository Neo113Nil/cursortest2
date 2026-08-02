package com.google.android.datatransport.cct.internal;

import defpackage.ip60;
import defpackage.jp60;
import defpackage.lxq;

/* loaded from: classes.dex */
public final class c implements ip60 {
    public static final c a = new c();
    public static final lxq b = lxq.c("networkType");
    public static final lxq c = lxq.c("mobileSubtype");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, networkConnectionInfo.b());
        jp60Var.f(c, networkConnectionInfo.a());
    }
}
