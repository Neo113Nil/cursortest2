package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class qgk0 implements Iterator<Object>, gcy {
    public final v2k0 b;
    public final int c;
    public final wgt d;
    public final wn4 e;
    public final int f;
    public int g;

    public qgk0(v2k0 v2k0Var, int i, wgt wgtVar, wn4 wn4Var) {
        this.b = v2k0Var;
        this.c = i;
        this.d = wgtVar;
        this.e = wn4Var;
        this.f = v2k0Var.i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.d.a;
        return arrayList != null && this.g < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.d.a;
        if (arrayList != null) {
            int i = this.g;
            this.g = i + 1;
            obj = arrayList.get(i);
        } else {
            obj = null;
        }
        boolean z = obj instanceof rgt;
        v2k0 v2k0Var = this.b;
        if (z) {
            return new w2k0(v2k0Var, ((rgt) obj).a, this.f);
        }
        if (!(obj instanceof wgt)) {
            throw at.b("Unexpected group information structure");
        }
        return new rgk0(v2k0Var, this.c, (wgt) obj, new ysf0(this.e, this.g - 1));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
