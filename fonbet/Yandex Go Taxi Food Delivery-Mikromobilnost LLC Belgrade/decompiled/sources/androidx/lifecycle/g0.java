package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import defpackage.a2m0;
import defpackage.b2m0;
import defpackage.c2m0;
import defpackage.d2m0;
import defpackage.f2m0;
import defpackage.j2m0;
import defpackage.ls31;
import defpackage.ny61;
import defpackage.pxa1;
import defpackage.qoi0;
import defpackage.rms;
import defpackage.rs31;
import defpackage.v1m0;
import defpackage.wwg;
import defpackage.y1m0;
import defpackage.y8f;
import defpackage.z1m0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class g0 {
    public static final z1m0 a = new z1m0();
    public static final a2m0 b = new a2m0();
    public static final b2m0 c = new b2m0();

    public static final v1m0 a(y8f y8fVar) {
        j2m0 j2m0Var = (j2m0) y8fVar.a(a);
        Bundle bundle = null;
        if (j2m0Var == null) {
            ny61.g("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        rs31 rs31Var = (rs31) y8fVar.a(b);
        if (rs31Var == null) {
            ny61.g("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) y8fVar.a(c);
        String str = (String) y8fVar.a(ls31.b);
        if (str == null) {
            ny61.g("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        f2m0 b2 = j2m0Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        c2m0 c2m0Var = b2 instanceof c2m0 ? (c2m0) b2 : null;
        if (c2m0Var == null) {
            ny61.r("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = ((d2m0) rms.j(rs31Var, new y1m0(), 4).a.B(qoi0.a(d2m0.class), "androidx.lifecycle.internal.SavedStateHandlesVM")).b;
        v1m0 v1m0Var = (v1m0) linkedHashMap.get(str);
        if (v1m0Var != null) {
            return v1m0Var;
        }
        c2m0Var.b();
        Bundle bundle3 = c2m0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = wwg.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c2m0Var.c = null;
            }
            bundle = bundle4;
        }
        v1m0 a2 = pxa1.a(bundle, bundle2);
        linkedHashMap.put(str, a2);
        return a2;
    }

    public static final void b(j2m0 j2m0Var) {
        Lifecycle.State b2 = j2m0Var.getLifecycle().b();
        if (b2 != Lifecycle.State.INITIALIZED && b2 != Lifecycle.State.CREATED) {
            ny61.g("Failed requirement.");
        } else if (j2m0Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            c2m0 c2m0Var = new c2m0(j2m0Var.getSavedStateRegistry(), (rs31) j2m0Var);
            j2m0Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", c2m0Var);
            j2m0Var.getLifecycle().a(new e0(c2m0Var));
        }
    }
}
