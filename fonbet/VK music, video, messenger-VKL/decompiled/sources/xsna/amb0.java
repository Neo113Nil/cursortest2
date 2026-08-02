package xsna;

import androidx.compose.ui.node.LayoutNode;

/* compiled from: PointerInputEventProcessor.kt */
/* loaded from: classes11.dex */
public final class amb0 {
    public final LayoutNode a;
    public final y8v b;
    public final ylb0 c = new ylb0();
    public final z8v d = new z8v();
    public boolean e;

    public amb0(LayoutNode layoutNode) {
        this.a = layoutNode;
        this.b = new y8v(layoutNode.G.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(q5o q5oVar, p52 p52Var, boolean z) {
        Object[] objArr;
        y8v y8vVar;
        int i;
        int i2;
        z8v z8vVar = this.d;
        if (this.e) {
            return 0;
        }
        try {
            this.e = true;
            rkx a = this.c.a(q5oVar, p52Var);
            x500<xlb0> x500Var = a.a;
            int size = x500Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                xlb0 valueAt = x500Var.valueAt(i3);
                if (!valueAt.d && !valueAt.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int size2 = x500Var.size();
            int i4 = 0;
            while (true) {
                y8vVar = this.b;
                if (i4 >= size2) {
                    break;
                }
                xlb0 valueAt2 = x500Var.valueAt(i4);
                if (objArr != false || fdi.m(valueAt2)) {
                    LayoutNode layoutNode = this.a;
                    long j = valueAt2.c;
                    z8v z8vVar2 = this.d;
                    int i5 = valueAt2.i;
                    LayoutNode.c cVar = LayoutNode.S;
                    layoutNode.M(j, z8vVar2, i5, true);
                    if (!z8vVar.b.f()) {
                        y8vVar.a(fdi.m(valueAt2), valueAt2.a, z8vVar);
                        z8vVar.clear();
                    }
                }
                i4++;
            }
            boolean b = y8vVar.b(a, z);
            if (!a.c) {
                int size3 = x500Var.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    xlb0 valueAt3 = x500Var.valueAt(i6);
                    if (!ov70.c(fdi.E(valueAt3, true), 0L) && valueAt3.c()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int size4 = x500Var.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size4) {
                    i2 = 0;
                    break;
                }
                if (x500Var.valueAt(i7).c()) {
                    i2 = 1;
                    break;
                }
                i7++;
            }
            int i8 = (b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.e = false;
            return i8;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }
}
