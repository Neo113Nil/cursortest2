package defpackage;

import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.e1;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a7b1 {
    public static final a7b1 c = new a7b1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final c4b1 a = new c4b1();

    public final n7b1 a(Class cls) {
        n7b1 i;
        Charset charset = f1b1.a;
        if (cls == null) {
            ny61.t("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        n7b1 n7b1Var = (n7b1) concurrentHashMap.get(cls);
        if (n7b1Var != null) {
            return n7b1Var;
        }
        c4b1 c4b1Var = this.a;
        c4b1Var.getClass();
        dq91 dq91Var = e1.a;
        a1.class.isAssignableFrom(cls);
        i7b1 c2 = c4b1Var.a.c(cls);
        if ((c2.d & 2) == 2) {
            dq91 dq91Var2 = e1.a;
            iq91 iq91Var = rwa1.a;
            i = d1.i(dq91Var2, c2.a);
        } else {
            int i2 = o6b1.a;
            int i3 = z2b1.a;
            dq91 dq91Var3 = e1.a;
            iq91 iq91Var2 = c2.a() + (-1) != 1 ? rwa1.a : null;
            int i4 = w4b1.a;
            i = c1.u(c2, dq91Var3, iq91Var2);
        }
        n7b1 n7b1Var2 = (n7b1) concurrentHashMap.putIfAbsent(cls, i);
        return n7b1Var2 != null ? n7b1Var2 : i;
    }
}
