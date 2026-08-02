package androidx.camera.extensions.internal.sessionprocessor;

import defpackage.hdv;
import defpackage.o0r0;
import defpackage.rdv;

/* loaded from: classes10.dex */
public final class c implements hdv {
    public final /* synthetic */ h a;

    public c(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.hdv
    public final void onNextImageAvailable(int i, long j, rdv rdvVar, String str) {
        if (this.a.m != null) {
            this.a.m.notifyImage(rdvVar);
        } else {
            ((o0r0) rdvVar).a();
        }
    }
}
