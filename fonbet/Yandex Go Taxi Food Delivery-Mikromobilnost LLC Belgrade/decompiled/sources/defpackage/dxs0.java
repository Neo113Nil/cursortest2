package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class dxs0 implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public Iterator c;
    public final /* synthetic */ AbstractMap w;

    public dxs0(cxs0 cxs0Var) {
        this.w = cxs0Var;
        this.b = cxs0Var.a.size();
    }

    public final Iterator a() {
        int i = this.a;
        AbstractMap abstractMap = this.w;
        switch (i) {
            case 0:
                if (this.c == null) {
                    this.c = ((axs0) abstractMap).y.entrySet().iterator();
                }
                break;
            case 1:
                if (this.c == null) {
                    this.c = ((bxs0) abstractMap).y.entrySet().iterator();
                }
                break;
            default:
                if (this.c == null) {
                    this.c = ((cxs0) abstractMap).x.entrySet().iterator();
                }
                break;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.w;
        switch (i) {
            case 0:
                int i2 = this.b;
                if ((i2 > 0 && i2 <= ((axs0) abstractMap).b.size()) || a().hasNext()) {
                    break;
                }
                break;
            case 1:
                int i3 = this.b;
                if ((i3 > 0 && i3 <= ((bxs0) abstractMap).b) || a().hasNext()) {
                    break;
                }
                break;
            default:
                int i4 = this.b;
                if ((i4 > 0 && i4 <= ((cxs0) abstractMap).a.size()) || a().hasNext()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.w;
        switch (i) {
            case 0:
                if (a().hasNext()) {
                    return (Map.Entry) a().next();
                }
                List list = ((axs0) abstractMap).b;
                int i2 = this.b - 1;
                this.b = i2;
                return (Map.Entry) list.get(i2);
            case 1:
                if (a().hasNext()) {
                    return (Map.Entry) a().next();
                }
                Object[] objArr = ((bxs0) abstractMap).a;
                int i3 = this.b - 1;
                this.b = i3;
                return (kxs0) objArr[i3];
            default:
                if (a().hasNext()) {
                    return (Map.Entry) a().next();
                }
                List list2 = ((cxs0) abstractMap).a;
                int i4 = this.b - 1;
                this.b = i4;
                return (Map.Entry) list2.get(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public dxs0(bxs0 bxs0Var) {
        this.w = bxs0Var;
        this.b = bxs0Var.b;
    }

    public dxs0(axs0 axs0Var) {
        this.w = axs0Var;
        this.b = axs0Var.b.size();
    }
}
