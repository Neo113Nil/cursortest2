package defpackage;

import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class niv {
    public Object[] a;
    public int b;
    public boolean c;

    public niv(int i) {
        y5e.i(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public static int f(int i, int i2) {
        if (i2 < 0) {
            ny61.g("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        uh6.i(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public abstract niv c(Object obj);

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof ImmutableCollection) {
                this.b = ((ImmutableCollection) collection).b(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int f = f(objArr.length, this.b + i);
        if (f > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, f);
            this.c = false;
        }
    }
}
