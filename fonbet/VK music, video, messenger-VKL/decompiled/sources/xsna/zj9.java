package xsna;

import android.graphics.Bitmap;

/* compiled from: CameraPlaylistSharingDelegate.kt */
/* loaded from: classes16.dex */
public final class zj9 extends c76 {
    public final /* synthetic */ ha a;
    public final /* synthetic */ ak9 b;

    public zj9(ha haVar, ak9 ak9Var) {
        this.a = haVar;
        this.b = ak9Var;
    }

    @Override // xsna.ic6
    public final void e(zuk<uvf<svf>> zukVar) {
        this.a.invoke(this.b.e.b());
    }

    @Override // xsna.c76
    public final void g(Bitmap bitmap) {
        ha haVar = this.a;
        if (bitmap != null) {
            haVar.invoke(bitmap);
        } else {
            haVar.invoke(this.b.e.b());
        }
    }
}
