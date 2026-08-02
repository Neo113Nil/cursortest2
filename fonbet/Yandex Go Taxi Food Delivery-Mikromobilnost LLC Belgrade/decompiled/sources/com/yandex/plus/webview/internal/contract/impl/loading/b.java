package com.yandex.plus.webview.internal.contract.impl.loading;

import android.view.View;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.core.WebViewMainFrameException;
import defpackage.h2t;
import defpackage.j0g;
import defpackage.jln;
import defpackage.r5u;
import defpackage.rs41;
import defpackage.swh;
import defpackage.u85;
import defpackage.v85;
import defpackage.w85;
import defpackage.x85;
import defpackage.y85;
import defpackage.z85;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class b {
    public final long a;
    public final jln b;
    public final h2t c;
    public z85 d = x85.a;

    public b(long j, jln jlnVar, h2t h2tVar) {
        this.a = j;
        this.b = jlnVar;
        this.c = h2tVar;
    }

    public final void a() {
        if (this.d instanceof u85) {
            return;
        }
        b();
        this.d = v85.a;
        r5u r5uVar = (r5u) this.b.b;
        j0g j0gVar = r5uVar.d;
        if (j0gVar != null) {
            r5u.u(r5uVar);
            r5uVar.t();
            if (r5uVar.t() != null) {
            }
            ((WebViewContainer) j0gVar.b).setVisibility(8);
            ((View) j0gVar.a).setVisibility(0);
        }
    }

    public final void b() {
        if (this.d.equals(x85.a)) {
            this.d = w85.a;
            r5u r5uVar = (r5u) this.b.b;
            j0g j0gVar = r5uVar.d;
            if (j0gVar != null) {
                r5u.u(r5uVar);
                r5uVar.t();
                ((WebViewContainer) j0gVar.b).setVisibility(8);
                ((View) j0gVar.a).setVisibility(0);
            }
        }
    }

    public final void c() {
        if (this.d instanceof u85) {
            return;
        }
        b();
        this.d = y85.a;
        r5u r5uVar = (r5u) this.b.b;
        j0g j0gVar = r5uVar.d;
        if (j0gVar != null) {
            r5u.u(r5uVar);
            r5uVar.t();
            ((View) j0gVar.a).setVisibility(8);
            ((WebViewContainer) j0gVar.b).setVisibility(0);
        }
    }

    public final void d(boolean z) {
        r5u r5uVar = (r5u) this.c.a;
        if (z) {
            Iterator it = r5uVar.f.iterator();
            while (it.hasNext()) {
                ((rs41) it.next()).b();
            }
            c();
            return;
        }
        Iterator it2 = r5uVar.f.iterator();
        while (it2.hasNext()) {
            ((rs41) it2.next()).n();
        }
        new ReadyTimeoutException();
        a();
    }

    public abstract void e(swh swhVar);

    public abstract void f();

    public abstract void g();

    public void h(WebViewMainFrameException webViewMainFrameException) {
        a();
    }

    public abstract void i(String str);

    public abstract void j(String str);
}
