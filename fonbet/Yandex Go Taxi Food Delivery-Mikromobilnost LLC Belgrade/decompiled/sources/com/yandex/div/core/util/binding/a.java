package com.yandex.div.core.util.binding;

import com.yandex.div.core.view2.Div2View;
import defpackage.bw5;
import defpackage.cw5;
import defpackage.dx5;
import defpackage.jl40;
import defpackage.ngd0;
import defpackage.sls;
import defpackage.zy11;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {
    public final Div2View a;
    public final cw5 b;
    public final dx5 c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public a(Div2View div2View, cw5 cw5Var, dx5 dx5Var) {
        this.a = div2View;
        this.b = cw5Var;
        this.c = dx5Var;
    }

    public static final void a(a aVar) {
        aVar.a.logError(new RuntimeException("Trying to run UI thread binding operation while background one in progress. Such actions may cause deadlocks, so your call is terminated. Fix this call ASAP. Looks like asserts are turned off, so your call received default return value."));
    }

    public final boolean b() {
        boolean l;
        boolean l2;
        Thread thread = this.c.a.a;
        if (thread == null || !thread.isAlive()) {
            thread = null;
        }
        if (thread == null) {
            return false;
        }
        cw5 cw5Var = this.b;
        synchronized (cw5Var.e) {
            l = jl40.l(cw5Var.b, thread);
        }
        if (l) {
            return true;
        }
        cw5 cw5Var2 = this.b;
        synchronized (cw5Var2.e) {
            l2 = jl40.l(cw5Var2.a, thread);
        }
        return l2;
    }

    public final void c(final sls slsVar) {
        if (this.d) {
            this.e.add(slsVar);
            return;
        }
        final bw5 a = this.b.a();
        try {
            ngd0.G.t(new sls() { // from class: com.yandex.div.core.util.binding.BindingDispatcher$postToMainThread$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a.this.b.d();
                    try {
                        slsVar.invoke();
                        cw5 cw5Var = a.this.b;
                        cw5.b(a);
                        return zy11.a;
                    } catch (Throwable th) {
                        cw5 cw5Var2 = a.this.b;
                        cw5.b(a);
                        throw th;
                    }
                }
            });
        } catch (Throwable th) {
            cw5.b(a);
            throw th;
        }
    }
}
