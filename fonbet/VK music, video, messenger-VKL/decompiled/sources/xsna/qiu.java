package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: GroupCallTopIndentHelper.kt */
/* loaded from: classes7.dex */
public final class qiu {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    /* compiled from: GroupCallTopIndentHelper.kt */
    public interface a {
        void c();
    }

    public final int a() {
        return this.b + this.c + this.e + this.d + this.f;
    }

    public final void b() {
        Iterator it = j5g.O0(this.a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
    }
}
