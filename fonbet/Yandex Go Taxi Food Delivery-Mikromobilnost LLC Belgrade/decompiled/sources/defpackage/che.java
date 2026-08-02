package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class che {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public static void b(che cheVar, long j) {
        cheVar.a(Long.valueOf(j), "exo_len");
    }

    public final void a(Object obj, String str) {
        obj.getClass();
        this.a.put(str, obj);
        this.b.remove(str);
    }
}
