package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class byj implements Iterator, xfx {
    public final Iterator a;
    public vxj b;
    public vxj c;
    public final /* synthetic */ dyj w;

    public byj(dyj dyjVar) {
        this.w = dyjVar;
        this.a = new ArrayList(dyjVar.B.values()).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        vxj a;
        if (this.b != null) {
            return true;
        }
        dyj dyjVar = this.w;
        synchronized (dyjVar) {
            if (dyjVar.G) {
                return false;
            }
            while (this.a.hasNext()) {
                rxj rxjVar = (rxj) this.a.next();
                if (rxjVar != null && (a = rxjVar.a()) != null) {
                    this.b = a;
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        vxj vxjVar = this.b;
        this.c = vxjVar;
        this.b = null;
        return vxjVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        vxj vxjVar = this.c;
        if (vxjVar == null) {
            ny61.r("remove() before next()");
            return;
        }
        try {
            this.w.D(vxjVar.a);
        } catch (IOException unused) {
        } finally {
            this.c = null;
        }
    }
}
