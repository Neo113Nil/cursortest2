package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class c5u0 implements Iterator, xfx {
    public final l3t0 a;
    public final Iterator b;
    public int c;
    public Map.Entry w;
    public Map.Entry x;
    public final /* synthetic */ int y;

    public c5u0(l3t0 l3t0Var, Iterator it, int i) {
        this.y = i;
        this.a = l3t0Var;
        this.b = it;
        this.c = l3t0Var.b().d;
        a();
    }

    public final void a() {
        this.w = this.x;
        Iterator it = this.b;
        this.x = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.x != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.y) {
            case 0:
                a();
                if (this.w == null) {
                    ny61.k();
                    break;
                } else {
                    break;
                }
            case 1:
                Map.Entry entry = this.x;
                if (entry == null) {
                    ny61.k();
                    break;
                } else {
                    a();
                    break;
                }
            default:
                Map.Entry entry2 = this.x;
                if (entry2 == null) {
                    ny61.k();
                    break;
                } else {
                    a();
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        l3t0 l3t0Var = this.a;
        if (l3t0Var.b().d != this.c) {
            ny61.y();
            return;
        }
        Map.Entry entry = this.w;
        if (entry == null) {
            ny61.k();
            return;
        }
        l3t0Var.remove(entry.getKey());
        this.w = null;
        this.c = l3t0Var.b().d;
    }
}
