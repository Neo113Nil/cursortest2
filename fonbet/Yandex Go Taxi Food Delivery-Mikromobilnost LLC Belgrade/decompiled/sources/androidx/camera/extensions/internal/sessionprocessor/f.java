package androidx.camera.extensions.internal.sessionprocessor;

import defpackage.hdv;
import defpackage.o0r0;
import defpackage.o3;
import defpackage.rdv;
import defpackage.sgb1;

/* loaded from: classes10.dex */
public final class f implements hdv {
    public boolean a = true;
    public final /* synthetic */ h b;

    public f(h hVar, o3 o3Var, int i) {
        this.b = hVar;
    }

    @Override // defpackage.hdv
    public final void onNextImageAvailable(int i, long j, rdv rdvVar, String str) {
        sgb1.g(3, "BasicSessionProcessor");
        if (this.b.l != null) {
            this.b.l.notifyImage(rdvVar);
        } else {
            ((o0r0) rdvVar).a();
        }
        if (this.a) {
            this.a = false;
        }
    }
}
