package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class btb implements r2f0 {
    public static final btb a = new btb();

    @Override // defpackage.r2f0
    public final Class a() {
        return zsb.class;
    }

    @Override // defpackage.r2f0
    public final Class b() {
        return zsb.class;
    }

    @Override // defpackage.r2f0
    public final Object c(jb7 jb7Var) {
        if (((p2f0) jb7Var.c) == null) {
            kbs.v("no primary in primitive set");
            return null;
        }
        Iterator it = ((ConcurrentMap) jb7Var.b).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new atb();
    }
}
