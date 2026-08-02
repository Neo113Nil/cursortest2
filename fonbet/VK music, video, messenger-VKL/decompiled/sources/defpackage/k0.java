package defpackage;

import java.util.Set;
import xsna.b9i;
import xsna.g1u;
import xsna.iql;
import xsna.lcg0;
import xsna.s2z;
import xsna.toe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements b9i {
    public static String a(long j, String str) {
        return str + j;
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        Set g = lcg0Var.g(toe0.a(s2z.class));
        g1u g1uVar = g1u.b;
        if (g1uVar == null) {
            synchronized (g1u.class) {
                try {
                    g1uVar = g1u.b;
                    if (g1uVar == null) {
                        g1uVar = new g1u();
                        g1u.b = g1uVar;
                    }
                } finally {
                }
            }
        }
        return new iql(g, g1uVar);
    }
}
