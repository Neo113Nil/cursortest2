package xsna;

import android.graphics.Bitmap;

/* compiled from: MlEnhanceToolDelegate.kt */
/* loaded from: classes15.dex */
public final class mt20 implements izs<Bitmap, s3q0> {
    public final /* synthetic */ gt20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gzg0 d;

    public mt20(gt20 gt20Var, String str, gzg0 gzg0Var) {
        this.b = gt20Var;
        this.c = str;
        this.d = gzg0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Bitmap bitmap) {
        this.b.i.remove(this.c);
        this.d.resumeWith(bitmap);
        return s3q0.a;
    }
}
