package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class c2q0 {
    public final ArrayList a = new ArrayList();

    public static void a(c2q0 c2q0Var, String str, zh4 zh4Var, boolean z, qgg qggVar, wls wlsVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            zh4Var = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            qggVar = null;
        }
        c2q0Var.a.add(new myp0(str, zh4Var, z, qggVar, c530.a, wlsVar));
    }
}
