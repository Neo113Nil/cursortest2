package defpackage;

import java.util.Iterator;
import yads.nx;

/* loaded from: classes7.dex */
public final class d871 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ nx w;
    public final /* synthetic */ int x;
    public final /* synthetic */ nx y;

    public d871(nx nxVar, int i) {
        this.x = i;
        this.y = nxVar;
        this.w = nxVar;
        this.a = nxVar.x;
        this.b = nxVar.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c;
        nx nxVar = this.w;
        if (nxVar.x != this.a) {
            ny61.y();
            return null;
        }
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        int i = this.b;
        this.c = i;
        int i2 = this.x;
        nx nxVar2 = this.y;
        switch (i2) {
            case 0:
                c = nxVar2.c(i);
                break;
            case 1:
                c = new ar71(nxVar2, i);
                break;
            default:
                c = nxVar2.h(i);
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= nxVar.y) {
            i3 = -1;
        }
        this.b = i3;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        nx nxVar = this.w;
        int i = nxVar.x;
        int i2 = this.a;
        if (i != i2) {
            ny61.y();
            return;
        }
        int i3 = this.c;
        if (!(i3 >= 0)) {
            ny61.r("no calls to next() since the last call to remove()");
            return;
        }
        this.a = i2 + 32;
        nxVar.remove(nxVar.c(i3));
        this.b--;
        this.c = -1;
    }
}
