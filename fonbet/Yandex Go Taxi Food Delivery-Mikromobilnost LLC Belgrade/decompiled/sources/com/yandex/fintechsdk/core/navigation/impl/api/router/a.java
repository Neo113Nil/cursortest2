package com.yandex.fintechsdk.core.navigation.impl.api.router;

import android.os.Handler;
import android.os.Looper;
import androidx.view.b;
import androidx.view.d;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.gbr;
import defpackage.ht10;
import defpackage.ike;
import defpackage.j550;
import defpackage.jl40;
import defpackage.k550;
import defpackage.o400;
import defpackage.qhw0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vfl0;
import defpackage.w511;
import defpackage.wfl0;
import defpackage.x43;
import defpackage.xfl0;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes12.dex */
public final class a {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ike b;
    public ht10 c;
    public final ArrayDeque d;

    public a() {
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.b = bvf0.a(cvw.U(a, o400.a));
        this.d = new ArrayDeque();
    }

    public static void c(xfl0 xfl0Var, ht10 ht10Var) {
        k550 k550Var;
        int i = 0;
        if (jl40.l(xfl0Var, vfl0.a)) {
            d dVar = (d) ht10Var.b;
            x43 x43Var = dVar.g;
            if (!x43Var.isEmpty()) {
                b bVar = (b) x43Var.h();
                if (dVar.m((bVar != null ? bVar.b : null).A, true, false) && dVar.b()) {
                    return;
                }
            }
            ((sls) ht10Var.c).invoke();
            return;
        }
        if (!(xfl0Var instanceof wfl0)) {
            w511.b();
            return;
        }
        wfl0 wfl0Var = (wfl0) xfl0Var;
        String str = wfl0Var.a;
        Map map = wfl0Var.b;
        gbr gbrVar = wfl0Var.c;
        if (gbrVar != null) {
            j550 j550Var = new j550();
            j550Var.a = false;
            j550Var.b = false;
            String str2 = gbrVar.a;
            boolean z = gbrVar.b;
            j550Var.d = str2;
            j550Var.c = -1;
            j550Var.e = z;
            j550Var.f = false;
            Integer num = gbrVar.c;
            if (num != null) {
                j550Var.g = num.intValue();
            }
            Integer num2 = gbrVar.d;
            if (num2 != null) {
                j550Var.h = num2.intValue();
            }
            Integer num3 = gbrVar.e;
            if (num3 != null) {
                j550Var.i = num3.intValue();
            }
            Integer num4 = gbrVar.f;
            if (num4 != null) {
                j550Var.j = num4.intValue();
            }
            k550Var = j550Var.a();
        } else {
            k550Var = null;
        }
        d dVar2 = (d) ht10Var.b;
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder(str);
            for (Object obj : map.entrySet()) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                Map.Entry entry = (Map.Entry) obj;
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                sb.append(i == 0 ? '?' : '&');
                sb.append(str3 + "=" + str4);
                i = i2;
            }
            str = sb.toString();
        }
        d.l(dVar2, str, k550Var);
    }

    public final void a() {
        b(vfl0.a);
    }

    public final void b(xfl0 xfl0Var) {
        tje.N(this.b, null, null, new RouterImpl$enqueueNavigationCommand$1(this, xfl0Var, null), 3);
    }
}
