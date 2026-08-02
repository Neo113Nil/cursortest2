package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class o51 extends k51 {
    public final o51 a(Object obj) {
        obj.getClass();
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o51 a(List list) {
        if (list instanceof Collection) {
            a(list.size() + this.b);
            if (list instanceof m51) {
                this.b = ((m51) list).a(this.b, this.a);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final tn2 a() {
        this.c = true;
        return s51.b(this.b, this.a);
    }
}
