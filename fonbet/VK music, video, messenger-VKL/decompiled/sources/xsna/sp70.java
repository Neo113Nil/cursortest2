package xsna;

import java.util.List;

/* compiled from: ObjectList.kt */
/* loaded from: classes11.dex */
public final class sp70 {
    public static final Object[] a = new Object[0];
    public static final fh50 b = new fh50(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            alk.D("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            alk.B("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            alk.D("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        alk.D("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
