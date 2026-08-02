package com.google.android.datatransport.cct.internal;

import defpackage.ip60;
import defpackage.jp60;
import defpackage.lxq;

/* loaded from: classes.dex */
public final class b implements ip60 {
    public static final b a = new b();
    public static final lxq b = lxq.c("privacyContext");
    public static final lxq c = lxq.c("productIdOrigin");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ComplianceData complianceData = (ComplianceData) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, complianceData.a());
        jp60Var.f(c, complianceData.b());
    }
}
