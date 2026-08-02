package defpackage;

import androidx.view.f;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class e550 implements Iterator, xfx {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ f550 c;

    public e550(f550 f550Var) {
        this.c = f550Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.c.E.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        this.b = true;
        pnt0 pnt0Var = this.c.E;
        int i = this.a + 1;
        this.a = i;
        return (f) pnt0Var.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            ny61.r("You must call next() before you can remove an element");
            return;
        }
        pnt0 pnt0Var = this.c.E;
        ((f) pnt0Var.f(this.a)).b = null;
        int i = this.a;
        Object[] objArr = pnt0Var.c;
        Object obj = objArr[i];
        Object obj2 = kp50.b;
        if (obj != obj2) {
            objArr[i] = obj2;
            pnt0Var.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
