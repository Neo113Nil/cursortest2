package com.yandex.quark.webchat;

import android.os.SystemClock;
import defpackage.d790;
import defpackage.hg41;
import defpackage.o1b1;
import defpackage.se41;
import defpackage.wo41;
import defpackage.y3x0;

/* loaded from: classes8.dex */
public final class f {
    public long a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ se41 g;

    public f(se41 se41Var) {
        this.g = se41Var;
    }

    public final void a(hg41 hg41Var, String str) {
        this.f = false;
        this.a = SystemClock.uptimeMillis();
        this.e = false;
        boolean z = this.d;
        se41 se41Var = this.g;
        if (!z) {
            long j = this.b;
            if (j > 0) {
                this.d = true;
                o1b1.b(se41Var.p, "WebChat.PageStarted.FromLoadUrl", j);
            }
        }
        se41Var.c.e("WebChatViewController", "Page started: " + str);
        se41Var.n.c(new wo41(hg41Var));
        i iVar = se41Var.x;
        if (iVar == null) {
            iVar = null;
        }
        iVar.getClass();
        iVar.c = WebViewInsetsController$LastPageState.Started;
        iVar.a();
        se41Var.E.h(((y3x0) hg41Var).e.canGoBack());
        se41Var.d.b(new d790(str, 3));
    }
}
