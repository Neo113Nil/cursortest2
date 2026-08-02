package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5262w5 implements C9 {
    public final H9 a;
    public final List b;
    public final List c;
    public final AtomicBoolean d;

    public C5262w5(H9 h9, List<? extends R8> list, List<? extends R8> list2, C4747c5 c4747c5) {
        this.a = h9;
        this.b = list;
        this.c = list2;
        Objects.toString(c4747c5);
        this.d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((R8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((R8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.d.set(false);
    }

    public final void c() {
        this.d.set(true);
    }

    public final void d() {
        if (this.d.get()) {
            List list = this.c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((R8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C5255vn) this.a).c();
        }
    }

    public final void e() {
        if (this.d.get() && a()) {
            ((C5255vn) this.a).c();
        }
    }

    public final void f() {
        if (this.d.get() && a()) {
            ((C5255vn) this.a).b();
        }
    }
}
