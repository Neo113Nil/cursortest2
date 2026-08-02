package xsna;

import android.graphics.Bitmap;

/* compiled from: AvatarAreaSelectionScreen.java */
/* loaded from: classes15.dex */
public final class sp5 implements io.reactivex.rxjava3.functions.f<Bitmap> {
    public final /* synthetic */ rp5 b;

    public sp5(rp5 rp5Var) {
        this.b = rp5Var;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Bitmap bitmap) throws Throwable {
        rp5 rp5Var = this.b;
        rp5Var.h = bitmap;
        rp5Var.n = null;
        rp5Var.m();
    }
}
