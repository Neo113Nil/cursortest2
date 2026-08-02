package com.yandex.quark.js.implementation.webView.internal;

import android.os.SystemClock;
import android.webkit.WebView;
import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.serializer.JsDataSerializationStrategy;
import com.yandex.quark.utils.Disposable;
import defpackage.big0;
import defpackage.bp41;
import defpackage.bvf0;
import defpackage.clc;
import defpackage.cvw;
import defpackage.ep41;
import defpackage.eq60;
import defpackage.f8h;
import defpackage.h38;
import defpackage.hg41;
import defpackage.id41;
import defpackage.ifo;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mfo;
import defpackage.mlc;
import defpackage.nea1;
import defpackage.o400;
import defpackage.om41;
import defpackage.ph41;
import defpackage.pzt0;
import defpackage.qq31;
import defpackage.qs41;
import defpackage.sbx;
import defpackage.sgh;
import defpackage.shg0;
import defpackage.sjh;
import defpackage.srd;
import defpackage.syj0;
import defpackage.t2n;
import defpackage.tje;
import defpackage.ui3;
import defpackage.uo41;
import defpackage.uyj;
import defpackage.vo41;
import defpackage.w511;
import defpackage.wly0;
import defpackage.wo41;
import defpackage.x3x0;
import defpackage.xo41;
import defpackage.y3x0;
import defpackage.yo41;
import defpackage.yq6;
import defpackage.z83;
import defpackage.zcx;
import defpackage.zhg0;
import defpackage.zo41;
import defpackage.zq6;
import defpackage.zwf0;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class c implements shg0, bp41, mfo, eq60, mlc {
    public final sgh A;
    public final zq6 B;
    public final yq6 C;
    public final ike a;
    public final srd b;
    public final a c;
    public final ui3 w;
    public final om41 x;
    public final com.yandex.quark.js.implementation.common.a y;
    public final ep41 z;

    public c(zwf0 zwf0Var, com.yandex.quark.utils.assets.internal.a aVar, wly0 wly0Var, ep41 ep41Var, sgh sghVar, zq6 zq6Var, id41 id41Var, yq6 yq6Var, JsDataSerializationStrategy jsDataSerializationStrategy, boolean z) {
        h38 f8hVar;
        ike a = bvf0.a(cvw.U(jl40.a(), uyj.a));
        int i = qs41.a[jsDataSerializationStrategy.ordinal()];
        int i2 = 2;
        if (i == 1) {
            f8hVar = new f8h(Collections.singleton("LegacyDirectiveHandlerCapability"));
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            f8hVar = new t2n();
        }
        zcx a2 = tje.a(sbx.d, new ph41(i2, jsDataSerializationStrategy));
        a aVar2 = new a(zwf0Var, a, f8hVar, a2);
        om41 om41Var = new om41(zwf0Var, a, wly0Var, zq6Var, f8hVar, a2);
        ui3 ui3Var = new ui3(zwf0Var, id41Var);
        srd srdVar = new srd();
        com.yandex.quark.js.implementation.common.a aVar3 = new com.yandex.quark.js.implementation.common.a(a, aVar, z);
        this.a = a;
        this.b = srdVar;
        this.c = aVar2;
        this.w = ui3Var;
        this.x = om41Var;
        this.y = aVar3;
        this.z = ep41Var;
        this.A = sghVar;
        this.B = zq6Var;
        this.C = yq6Var;
        srdVar.e(aVar2);
        srdVar.e(om41Var);
        zq6Var.b(big0.d);
        tje.N(a, null, null, new WebViewQuarkJsImpl$waitScriptLoading$1(this, SystemClock.uptimeMillis(), null), 3);
        ep41Var.e(this);
    }

    @Override // defpackage.mfo
    public final Disposable a(ifo ifoVar) {
        return this.c.a(ifoVar);
    }

    @Override // defpackage.mlc
    public final syj0 b(clc clcVar) {
        return this.x.b(clcVar);
    }

    @Override // defpackage.bp41
    public final void c(zo41 zo41Var) {
        boolean equals = zo41Var.equals(uo41.a);
        srd srdVar = this.b;
        om41 om41Var = this.x;
        if (equals) {
            bvf0.j(this.a, null);
            pzt0 pzt0Var = om41Var.A;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            om41Var.A = null;
            this.z.f(this);
            srdVar.d(QuarkJsState.DESTROYED);
            return;
        }
        if (zo41Var instanceof vo41) {
            WebView webView = ((vo41) zo41Var).a.e;
            webView.addJavascriptInterface(this.c, "__quarkEventHandler");
            ui3 ui3Var = this.w;
            if (ui3Var != null) {
                webView.addJavascriptInterface(ui3Var, "__authEventHandler");
                return;
            }
            return;
        }
        if (zo41Var instanceof wo41) {
            hg41 a = ((wo41) zo41Var).a();
            srdVar.d(QuarkJsState.NOT_CONNECTED);
            String c = nea1.c(this.y);
            if (c == null) {
                z83.i();
                return;
            }
            srdVar.d(QuarkJsState.CONNECTING);
            ((y3x0) a).e.evaluateJavascript(c, new x3x0(0, new qq31(14, this)));
            return;
        }
        if (zo41Var.equals(xo41.a)) {
            pzt0 pzt0Var2 = om41Var.A;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            om41Var.A = null;
            return;
        }
        if (!(zo41Var instanceof yo41)) {
            w511.b();
            return;
        }
        hg41 hg41Var = ((yo41) zo41Var).a;
        if (om41Var.A != null) {
            return;
        }
        ike ikeVar = om41Var.b;
        sjh sjhVar = uyj.a;
        om41Var.A = tje.N(ikeVar, o400.a.x, null, new WebViewCommandExecutor$onWebViewResumed$1(om41Var, hg41Var, null), 2);
    }

    @Override // defpackage.eq60
    public final void e(Object obj) {
        this.b.e((zhg0) obj);
    }

    @Override // defpackage.eq60
    public final void f(Object obj) {
        zhg0 zhg0Var = (zhg0) obj;
        srd srdVar = this.b;
        synchronized (srdVar) {
            srdVar.a.remove(zhg0Var);
        }
    }
}
