package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class h8 implements Iterator, xfx {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public h8(j4o j4oVar) {
        this.a = 2;
        this.c = j4oVar;
        this.b = j4oVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b < ((k8) obj).size()) {
                    break;
                }
                break;
            case 1:
                if (this.b < ((Object[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.b > 0) {
                    break;
                }
                break;
            default:
                if (this.b < ((ViewGroup) obj).getChildCount()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    ny61.p();
                    return null;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                return ((k8) obj).get(i2);
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    w511.i(e.getMessage());
                    return null;
                }
            case 2:
                j4o j4oVar = (j4o) obj;
                int i4 = j4oVar.c;
                int i5 = this.b;
                this.b = i5 - 1;
                return j4oVar.e[i4 - i5];
            default:
                int i6 = this.b;
                this.b = i6 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i6);
                if (childAt != null) {
                    return childAt;
                }
                ny61.s();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ h8(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }
}
