package xsna;

import xsna.ajf0;

/* compiled from: ConfigureSessionRoomsListItemDecorator.kt */
/* loaded from: classes7.dex */
public final class f2j extends ajf0 {
    @Override // xsna.ajf0
    public final boolean l(int i) {
        if (i != 0) {
            return n(i);
        }
        hfz c = this.b.c(i);
        return (c instanceof g2j) || (c instanceof h2j);
    }

    @Override // xsna.ajf0
    public final boolean m(int i) {
        if (i == 0) {
            return false;
        }
        ajf0.a aVar = this.b;
        return (aVar.c(i) instanceof g2j) && (aVar.c(i - 1) instanceof i2j);
    }

    @Override // xsna.ajf0
    public final boolean n(int i) {
        if (i <= 0) {
            return false;
        }
        ajf0.a aVar = this.b;
        return (aVar.c(i) instanceof g2j) && !(aVar.c(i - 1) instanceof g2j);
    }
}
