package defpackage;

import coil3.disk.a;

/* loaded from: classes.dex */
public final class pci0 {
    public final lxj a;

    public pci0(lxj lxjVar) {
        this.a = lxjVar;
    }

    public final qci0 a() {
        txj d;
        lxj lxjVar = this.a;
        a aVar = (a) lxjVar.d;
        synchronized (aVar.A) {
            lxjVar.c(true);
            d = aVar.d(((oxj) lxjVar.c).a);
        }
        if (d != null) {
            return new qci0(d);
        }
        return null;
    }
}
