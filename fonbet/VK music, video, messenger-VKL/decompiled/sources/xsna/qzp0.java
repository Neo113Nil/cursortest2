package xsna;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.builders.ListBuilder;

/* compiled from: UiMeasuringSessionImpl.kt */
/* loaded from: classes17.dex */
public final class qzp0 implements mzp0 {
    public final UUID a;
    public final List<mzp0> b;

    public qzp0(UUID uuid, ListBuilder listBuilder) {
        this.a = uuid;
        this.b = listBuilder;
    }

    @Override // xsna.mzp0
    public final UUID Y0() {
        return this.a;
    }

    @Override // xsna.mzp0
    public final void a() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).a();
        }
    }

    @Override // xsna.mzp0
    public final void b() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).b();
        }
    }

    @Override // xsna.mzp0
    public final void c(boolean z) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).c(z);
        }
    }

    @Override // xsna.mzp0
    public final void d(View view) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).d(view);
        }
    }

    @Override // xsna.mzp0
    public final void e(View view) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).e(view);
        }
    }

    @Override // xsna.mzp0
    public final void f() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).f();
        }
    }

    @Override // xsna.mzp0
    public final void g() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).g();
        }
    }

    @Override // xsna.mzp0
    public final void h() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).h();
        }
    }

    @Override // xsna.mzp0
    public final void i() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).i();
        }
    }

    @Override // xsna.mzp0
    public final void init() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).init();
        }
    }

    @Override // xsna.mzp0
    public final void j() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).j();
        }
    }

    @Override // xsna.mzp0
    public final void k(String str) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).k(str);
        }
    }

    @Override // xsna.mzp0
    public final void start() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((mzp0) it.next()).start();
        }
    }
}
