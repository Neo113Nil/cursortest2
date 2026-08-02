package defpackage;

import java.util.HashMap;

/* loaded from: classes7.dex */
public final class br81 {
    public static final Object b = new Object();
    public static volatile br81 c;
    public final HashMap a = new HashMap();

    public final lk81 a(long j) {
        lk81 lk81Var;
        synchronized (b) {
            lk81Var = (lk81) this.a.remove(Long.valueOf(j));
        }
        return lk81Var;
    }
}
