package com.yandex.passport.internal.ui.util;

import android.os.Build;
import android.view.View;
import android.view.Window;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.o751;
import defpackage.p751;
import defpackage.q751;
import defpackage.va90;

/* loaded from: classes2.dex */
public class b extends f {
    public void a(m mVar, m mVar2, Window window, View view, boolean z, boolean z2) {
        jl40.L(window, false);
        window.setStatusBarColor(z ? mVar.b : mVar.a);
        window.setNavigationBarColor(z2 ? mVar2.b : mVar2.a);
        va90 va90Var = new va90(view);
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        q751Var.U(!z);
        q751Var.T(!z2);
    }
}
