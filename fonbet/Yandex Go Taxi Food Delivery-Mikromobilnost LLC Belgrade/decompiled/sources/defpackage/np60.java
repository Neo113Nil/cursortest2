package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class np60 {
    public static final Object[] a = new Object[0];
    public static final xy40 b = new xy40(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            xva1.d("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            xva1.b("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            xva1.d("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        xva1.d("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
