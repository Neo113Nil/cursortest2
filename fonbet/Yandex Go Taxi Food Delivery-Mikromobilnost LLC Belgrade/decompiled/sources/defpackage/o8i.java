package defpackage;

import android.app.Application;

/* loaded from: classes5.dex */
public final class o8i implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        g3i g3iVar;
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            if (y8gVar == null) {
                y8gVar = null;
            }
            gjz gjzVar = y8gVar.a;
            Application application = (Application) gjzVar.b.c;
            q5z.h(application);
            g3iVar = new g3i(new qcp0(), new ss4(application, gjzVar.c(), 1));
        }
        return g3iVar;
    }
}
