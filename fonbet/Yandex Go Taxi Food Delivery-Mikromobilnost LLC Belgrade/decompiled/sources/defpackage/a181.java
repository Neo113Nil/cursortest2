package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import yads.n31;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class a181 extends oo71 {
    public final wk2 c() {
        this.c = true;
        return t31.p(this.b, this.a);
    }

    public final void d(Object obj) {
        obj.getClass();
        b(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(List list) {
        if (list instanceof Collection) {
            b(list.size() + this.b);
            if (list instanceof n31) {
                this.b = ((n31) list).a(this.b, this.a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }
}
