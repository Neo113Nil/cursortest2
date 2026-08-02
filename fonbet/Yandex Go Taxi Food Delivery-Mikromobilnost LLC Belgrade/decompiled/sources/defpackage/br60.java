package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class br60 implements Iterable {
    public final ArrayList a = new ArrayList();
    public int b;
    public int c;
    public boolean w;

    public final boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        ArrayList arrayList = this.a;
        if (arrayList.contains(obj)) {
            return false;
        }
        arrayList.add(obj);
        this.c++;
        return true;
    }

    public final boolean b(Object obj) {
        ArrayList arrayList;
        int indexOf;
        if (obj == null || (indexOf = (arrayList = this.a).indexOf(obj)) == -1) {
            return false;
        }
        if (this.b == 0) {
            arrayList.remove(indexOf);
        } else {
            this.w = true;
            arrayList.set(indexOf, null);
        }
        this.c--;
        return true;
    }

    public final void clear() {
        this.c = 0;
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i == 0) {
            arrayList.clear();
            return;
        }
        int size = arrayList.size();
        this.w |= size != 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, null);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tq60(this);
    }
}
