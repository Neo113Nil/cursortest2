package xsna;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompositeMeasuringSessionWrapper.kt */
/* loaded from: classes6.dex */
public final class pti implements ahn0 {
    public final ArrayList a;

    public pti(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.ahn0
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).a();
        }
    }

    @Override // xsna.ahn0
    public final void c(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).c(z);
        }
    }

    @Override // xsna.ahn0
    public final void d(View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).d(view);
        }
    }

    @Override // xsna.ahn0
    public final void e(View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).e(view);
        }
    }

    @Override // xsna.ahn0
    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).f();
        }
    }

    @Override // xsna.ahn0
    public final void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).g();
        }
    }

    @Override // xsna.ahn0
    public final void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).h();
        }
    }

    @Override // xsna.ahn0
    public final void init() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).init();
        }
    }

    @Override // xsna.ahn0
    public final void start() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahn0) it.next()).start();
        }
    }
}
