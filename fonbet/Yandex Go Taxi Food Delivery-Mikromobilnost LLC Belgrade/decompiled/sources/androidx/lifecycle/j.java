package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import defpackage.g2m0;
import defpackage.v1m0;
import defpackage.yr31;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes10.dex */
public abstract class j {
    public static final void a(yr31 yr31Var, g2m0 g2m0Var, Lifecycle lifecycle) {
        f0 f0Var = (f0) yr31Var.U("androidx.lifecycle.savedstate.vm.tag");
        if (f0Var == null || f0Var.c) {
            return;
        }
        f0Var.a(g2m0Var, lifecycle);
        c(g2m0Var, lifecycle);
    }

    public static final f0 b(g2m0 g2m0Var, Lifecycle lifecycle, String str, Bundle bundle) {
        v1m0 v1m0Var;
        Bundle a = g2m0Var.a(str);
        if (a != null) {
            bundle = a;
        }
        if (bundle == null) {
            v1m0Var = new v1m0();
        } else {
            bundle.setClassLoader(v1m0.class.getClassLoader());
            MapBuilder mapBuilder = new MapBuilder(bundle.size());
            for (String str2 : bundle.keySet()) {
                mapBuilder.put(str2, bundle.get(str2));
            }
            v1m0Var = new v1m0(mapBuilder.j());
        }
        f0 f0Var = new f0(str, v1m0Var);
        f0Var.a(g2m0Var, lifecycle);
        c(g2m0Var, lifecycle);
        return f0Var;
    }

    public static void c(g2m0 g2m0Var, Lifecycle lifecycle) {
        Lifecycle.State b = lifecycle.b();
        if (b == Lifecycle.State.INITIALIZED || b.a(Lifecycle.State.STARTED)) {
            g2m0Var.d();
        } else {
            lifecycle.a(new i(g2m0Var, lifecycle));
        }
    }
}
