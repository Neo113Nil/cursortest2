package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class gsd0 {
    public final r0 a;
    public final r0 b;
    public final r0 c;
    public final r0 d;
    public boolean e;
    public final CopyOnWriteArrayList f;

    public gsd0() {
        Boolean bool = Boolean.FALSE;
        r0 c = bvf0.c(bool);
        this.a = c;
        this.b = c;
        r0 c2 = bvf0.c(bool);
        this.c = c2;
        this.d = c2;
        this.f = new CopyOnWriteArrayList();
    }

    public final void a() {
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ny61.u();
            } else {
                if (((Boolean) this.a.getValue()).booleanValue()) {
                    boolean z = this.e;
                }
                throw null;
            }
        }
    }

    public final void b() {
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, bool);
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    public final void c() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, bool);
        a();
    }

    public final void d() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, bool);
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    public final void e() {
        if (((Boolean) this.a.getValue()).booleanValue()) {
            return;
        }
        c();
    }
}
