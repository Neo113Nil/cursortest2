package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers;

import defpackage.hn;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.y821;
import defpackage.zy11;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ hn a;
    public final /* synthetic */ PropertyReference0Impl b;
    public final /* synthetic */ ijd0 c;
    public final /* synthetic */ imd0 w;
    public final /* synthetic */ y821 x;

    public /* synthetic */ a(hn hnVar, PropertyReference0Impl propertyReference0Impl, ijd0 ijd0Var, imd0 imd0Var, y821 y821Var) {
        this.a = hnVar;
        this.b = propertyReference0Impl;
        this.c = ijd0Var;
        this.w = imd0Var;
        this.x = y821Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        tls tlsVar = (tls) obj;
        hn hnVar = this.a;
        pzt0 pzt0Var = hnVar.c;
        zy11 zy11Var = zy11.a;
        if (pzt0Var != null && pzt0Var.isActive()) {
            return zy11Var;
        }
        hnVar.c = tje.N((tse) this.b.get(), null, null, new AcquisitionSdkButtonSectionContainerViewControllerImpl$proxyController$2$1$1(tlsVar, hnVar, this.c, this.w, this.x, null), 3);
        return zy11Var;
    }
}
