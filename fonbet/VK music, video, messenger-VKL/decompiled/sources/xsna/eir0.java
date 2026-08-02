package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.imageloader.view.VKImageView;

/* compiled from: VKZoomableImageView.java */
/* loaded from: classes2.dex */
public final class eir0 implements b780 {
    public final /* synthetic */ fir0 b;

    public eir0(fir0 fir0Var) {
        this.b = fir0Var;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, @NonNull String str) {
        h64 h64Var = this.b.m;
        h64Var.q = i;
        h64Var.p = i2;
        if (i == -1 && i2 == -1) {
            return;
        }
        h64Var.o.reset();
        h64Var.c();
        VKImageView g = h64Var.g();
        if (g != null) {
            g.invalidate();
        }
    }

    @Override // xsna.b780
    public final void g(@NonNull String str) {
    }

    @Override // xsna.b780
    public final void onCancel(@NonNull String str) {
    }

    @Override // xsna.b780
    public final void b(@NonNull String str, @Nullable Throwable th) {
    }
}
