package androidx.camera.core.internal.compat.quirk;

import defpackage.a73;
import defpackage.glg0;
import java.util.Iterator;

/* loaded from: classes10.dex */
public interface SurfaceProcessingQuirk extends glg0 {
    static boolean a(a73 a73Var) {
        Iterator it = a73Var.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    default boolean c() {
        return true;
    }
}
