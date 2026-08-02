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
public class d extends c {
    @Override // com.yandex.passport.internal.ui.util.b
    public void a(m mVar, m mVar2, Window window, View view, boolean z, boolean z2) {
        jl40.L(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        va90 va90Var = new va90(view);
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        q751Var.U(!z);
        q751Var.T(true ^ z2);
    }
}
