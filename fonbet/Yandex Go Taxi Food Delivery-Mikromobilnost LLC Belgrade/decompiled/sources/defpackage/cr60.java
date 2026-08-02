package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class cr60 implements Iterable {
    public final ArrayList a = new ArrayList();
    public int b;
    public boolean c;

    public static void a(cr60 cr60Var) {
        int i = cr60Var.b - 1;
        cr60Var.b = i;
        if (i <= 0 && cr60Var.c) {
            cr60Var.c = false;
            ArrayList arrayList = cr60Var.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }

    public final void b(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.a;
            if (arrayList.contains(obj)) {
                return;
            }
            arrayList.add(obj);
        }
    }

    public final void d(Object obj) {
        ArrayList arrayList;
        int indexOf;
        if (obj == null || (indexOf = (arrayList = this.a).indexOf(obj)) == -1) {
            return;
        }
        if (this.b == 0) {
            arrayList.remove(indexOf);
        } else {
            this.c = true;
            arrayList.set(indexOf, null);
        }
    }

    public final wq60 e() {
        return new wq60(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new uq60(this);
    }
}
