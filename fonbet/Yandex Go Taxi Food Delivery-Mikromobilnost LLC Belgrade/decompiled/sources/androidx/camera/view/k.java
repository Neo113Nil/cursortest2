package androidx.camera.view;

import android.graphics.SurfaceTexture;
import defpackage.d6z;
import defpackage.iqs;
import defpackage.sgb1;
import defpackage.v84;
import defpackage.wnw0;

/* loaded from: classes10.dex */
public final class k implements iqs {
    public final /* synthetic */ SurfaceTexture a;
    public final /* synthetic */ TextureViewImplementation$1 b;

    public k(TextureViewImplementation$1 textureViewImplementation$1, SurfaceTexture surfaceTexture) {
        this.b = textureViewImplementation$1;
        this.a = surfaceTexture;
    }

    @Override // defpackage.iqs
    public final void onFailure(Throwable th) {
        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
    }

    @Override // defpackage.iqs
    public final void onSuccess(Object obj) {
        d6z.y("Unexpected result from SurfaceRequest. Surface was provided twice.", ((v84) ((wnw0) obj)).a != 3);
        sgb1.g(3, "TextureViewImpl");
        this.a.release();
        l lVar = this.b.this$0;
        if (lVar.j != null) {
            lVar.j = null;
        }
    }
}
