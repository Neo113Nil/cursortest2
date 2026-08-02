package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes9.dex */
public final class oci0 {
    public final int a;
    public final c5e b;
    public final htx0 d;
    public final long c = 300000000000L;
    public final xxj e = new xxj(oyr.t(new StringBuilder(), bg61.b, " ConnectionPool connection closer"), 1, this);
    public final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();

    public oci0(mtx0 mtx0Var, int i, c5e c5eVar) {
        this.a = i;
        this.b = c5eVar;
        this.d = mtx0Var.d();
    }

    public final int a(RealConnection realConnection, long j) {
        TimeZone timeZone = bg61.a;
        ArrayList arrayList = realConnection.q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.c.a.h + " was leaked. Did you forget to close a response body?";
                d72 d72Var = dvc0.a;
                dvc0.a.d(((lci0) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    realConnection.r = j - this.c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
