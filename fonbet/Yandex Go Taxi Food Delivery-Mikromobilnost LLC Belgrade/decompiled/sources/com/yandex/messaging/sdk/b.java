package com.yandex.messaging.sdk;

import android.content.Context;
import defpackage.g420;
import defpackage.onp0;
import defpackage.sls;
import defpackage.tje;
import defpackage.vse;
import defpackage.xdp0;
import defpackage.z8g;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        Context context = onp0.a;
        if (context == null) {
            context = null;
        }
        a aVar = new a(context);
        g420 g420Var = aVar.e;
        g420Var.getClass();
        g420 g420Var2 = aVar.e;
        g420Var2.getClass();
        z8g z8gVar = new z8g(g420Var, new xdp0(), g420Var2, aVar);
        tje.N(((vse) z8gVar.g.get()).c(false), null, null, new SdkComponentHolder$init$1$1(z8gVar, null), 3);
        return z8gVar;
    }
}
