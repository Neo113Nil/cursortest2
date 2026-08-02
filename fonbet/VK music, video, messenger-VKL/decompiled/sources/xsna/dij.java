package xsna;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: ContentMetadataMutations.java */
/* loaded from: classes12.dex */
public final class dij {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public static void d(dij dijVar, long j) {
        dijVar.a(Long.valueOf(j), "exo_len");
    }

    public final void a(Object obj, String str) {
        obj.getClass();
        this.a.put(str, obj);
        this.b.remove(str);
    }

    public final void b(long j) {
        a(Long.valueOf(j), "exo_len");
    }

    public final void c(String str) {
        a(str, "exo_redir");
    }
}
