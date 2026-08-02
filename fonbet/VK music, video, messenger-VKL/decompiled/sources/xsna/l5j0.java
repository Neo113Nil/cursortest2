package xsna;

import android.content.Context;
import com.vk.log.L;
import xsna.h5j0;

/* compiled from: ShakeSource.kt */
/* loaded from: classes18.dex */
public final class l5j0 implements c6x {
    public static final l5j0 a = new l5j0();

    @Override // xsna.c6x
    public final void a(p3h p3hVar) {
        jyo0 jyo0Var = g5j0.b;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        io.reactivex.rxjava3.core.g<s3q0> a2 = g5j0.b.a(context, new h5j0.b(10.0f, 300L));
        asu0 asu0Var = asu0.a;
        a2.j(asu0Var.c()).j(asu0Var.d()).subscribe(new k5j0(new lxz(p3hVar, 27), 0), new t520(new whe(L.a, 11), 18));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l5j0);
    }

    public final int hashCode() {
        return 1253137961;
    }

    public final String toString() {
        return "ShakeSource";
    }
}
