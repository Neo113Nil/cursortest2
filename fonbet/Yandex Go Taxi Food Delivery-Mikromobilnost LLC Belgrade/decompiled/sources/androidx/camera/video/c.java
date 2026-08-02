package androidx.camera.video;

import androidx.camera.video.internal.encoder.EncodeException;
import defpackage.e9e;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements e9e {
    public final /* synthetic */ g a;
    public final /* synthetic */ androidx.concurrent.futures.b b;

    public /* synthetic */ c(g gVar, androidx.concurrent.futures.b bVar) {
        this.a = gVar;
        this.b = bVar;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        g gVar = this.a;
        if (gVar.Z == null) {
            if (th instanceof EncodeException) {
                gVar.z(Recorder$AudioState.ERROR_ENCODER);
            } else {
                gVar.z(Recorder$AudioState.ERROR_SOURCE);
            }
            gVar.Z = th;
            gVar.J(true);
            this.b.b(null);
        }
    }
}
