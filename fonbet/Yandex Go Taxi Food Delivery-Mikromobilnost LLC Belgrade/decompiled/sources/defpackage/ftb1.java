package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ftb1 {
    public static r6f a(i6f i6fVar) {
        if (i6fVar instanceof h6f) {
            h6f h6fVar = (h6f) i6fVar;
            return new r6f(h6fVar.a.a, null, null, h6fVar.b, 30);
        }
        if (i6fVar instanceof g6f) {
            return new r6f(null, null, null, null, 111);
        }
        if (i6fVar instanceof f6f) {
            f6f f6fVar = (f6f) i6fVar;
            return new r6f(null, f6fVar.b, f6fVar.a, f6fVar.c, 49);
        }
        w511.b();
        return null;
    }

    public static final void b() {
        throw new UnsupportedOperationException("Property does not have a getter");
    }

    public static final ArrayList c(List list, int i, tls tlsVar) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i, tlsVar.invoke(arrayList.get(i)));
        return arrayList;
    }
}
