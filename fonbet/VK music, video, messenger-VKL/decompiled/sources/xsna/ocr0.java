package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: VKImageLoader.java */
/* loaded from: classes2.dex */
public final class ocr0 extends c76 {
    public final /* synthetic */ io.reactivex.rxjava3.core.y a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Uri c;

    public ocr0(io.reactivex.rxjava3.core.y yVar, boolean z, Uri uri) {
        this.a = yVar;
        this.b = z;
        this.c = uri;
    }

    @Override // xsna.ic6, xsna.vvk
    public final void b(zuk<uvf<svf>> zukVar) {
        zukVar.getProgress();
    }

    @Override // xsna.ic6
    public final void e(zuk<uvf<svf>> zukVar) {
        Throwable b = zukVar.b();
        if (b != null) {
            io.reactivex.rxjava3.core.y yVar = this.a;
            if (yVar.h()) {
                return;
            }
            yVar.onError(b);
        }
    }

    @Override // xsna.c76
    public final void g(@Nullable Bitmap bitmap) {
        io.reactivex.rxjava3.core.y yVar = this.a;
        if (bitmap == null) {
            if (yVar.h()) {
                return;
            }
            yVar.onError(new NullPointerException("result bitmap is null"));
            return;
        }
        try {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (!this.b) {
                mcr0.c.put(this.c.toString(), new nb7(copy.getAllocationByteCount(), copy));
            }
            if (yVar.h()) {
                return;
            }
            yVar.onSuccess(copy);
        } catch (Throwable th) {
            if (yVar.h()) {
                return;
            }
            yVar.onError(th);
        }
    }
}
