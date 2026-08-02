package xsna;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import xsna.eo5;

/* compiled from: TransportContext.java */
/* loaded from: classes.dex */
public abstract class sop0 {

    /* compiled from: TransportContext.java */
    public static abstract class a {
    }

    public static eo5.a a() {
        eo5.a aVar = new eo5.a();
        Priority priority = Priority.DEFAULT;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        aVar.c = priority;
        return aVar;
    }

    public abstract String b();

    @Nullable
    public abstract byte[] c();

    public abstract Priority d();

    public final eo5 e(Priority priority) {
        eo5.a a2 = a();
        a2.b(b());
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        a2.c = priority;
        a2.b = c();
        return a2.a();
    }

    public final String toString() {
        String b = b();
        Priority d = d();
        String encodeToString = c() == null ? "" : Base64.encodeToString(c(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(b);
        sb.append(", ");
        sb.append(d);
        sb.append(", ");
        return i5s.a(sb, encodeToString, ")");
    }
}
