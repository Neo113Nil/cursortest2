package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class dnm implements Iterator, xfx {
    public final Iterator b;
    public Object w;
    public final /* synthetic */ qrq0 x;
    public final /* synthetic */ int a = 0;
    public int c = -1;

    public dnm(enm enmVar) {
        this.x = enmVar;
        this.b = ((Iterable) ((h73) enmVar.b).b).iterator();
    }

    public void a() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((tls) ((enm) this.x).c).invoke(next)).booleanValue()) {
                this.c = 1;
                this.w = next;
                return;
            }
        }
        this.c = 0;
    }

    public void b() {
        Object next;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((ft20) ((enm) this.x).c).invoke(next)).booleanValue());
        this.w = next;
        this.c = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 1 || this.b.hasNext()) {
                }
                break;
            default:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    b();
                }
                if (this.c != 1) {
                    return this.b.next();
                }
                Object obj = this.w;
                this.w = null;
                this.c = 0;
                return obj;
            default:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    ny61.p();
                    return null;
                }
                Object obj2 = this.w;
                this.w = null;
                this.c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dnm(enm enmVar, byte b) {
        this.x = enmVar;
        this.b = enmVar.b.iterator();
    }
}
