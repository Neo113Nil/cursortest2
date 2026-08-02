package yads;

import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class uv1 {
    public static final void a(boolean z) {
        dd1.a = z;
        oc1.c = z;
        if (z) {
            return;
        }
        bw1.a().a();
        jv1.a().a();
    }

    public static final void b(boolean z) {
        hx2 a = gx2.a();
        synchronized (hx2.j) {
            a.c = Boolean.valueOf(z);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
