package androidx.collection;

import defpackage.cy40;
import defpackage.ny61;
import defpackage.rrq0;
import defpackage.tz40;
import defpackage.vrq0;
import defpackage.xfx;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class d implements Iterator, xfx {
    public final rrq0 b;
    public final /* synthetic */ Object w;
    public final /* synthetic */ int a = 0;
    public int c = -1;

    public d(cy40 cy40Var) {
        this.w = cy40Var;
        this.b = vrq0.a(new MutableKeys$iterator$1$iterator$1(cy40Var, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.w;
        rrq0 rrq0Var = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) rrq0Var.next()).intValue();
                this.c = intValue;
                return ((cy40) obj).a.b[intValue];
            default:
                int intValue2 = ((Number) rrq0Var.next()).intValue();
                this.c = intValue2;
                return ((tz40) obj).a.c[intValue2];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 == -1) {
                    ny61.r("Call next() before removing element from the iterator.");
                    break;
                } else {
                    ((cy40) obj).a.n(i2);
                    this.c = -1;
                    break;
                }
            default:
                int i3 = this.c;
                if (i3 == -1) {
                    ny61.r("Call next() before removing element from the iterator.");
                    break;
                } else {
                    ((tz40) obj).a.n(i3);
                    this.c = -1;
                    break;
                }
        }
    }

    public d(tz40 tz40Var) {
        this.w = tz40Var;
        this.b = vrq0.a(new MutableValues$iterator$1$iterator$1(tz40Var, null));
    }
}
