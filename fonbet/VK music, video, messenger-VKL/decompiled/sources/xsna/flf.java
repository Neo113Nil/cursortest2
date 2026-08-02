package xsna;

import android.graphics.Bitmap;

/* compiled from: ClipsUploadVideoAttachItem.kt */
/* loaded from: classes17.dex */
public final class flf implements ktc0 {
    @Override // xsna.ktc0
    public final ww8 a() {
        return new ppj0("ScalePostProcessor");
    }

    @Override // xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        if (bitmap != null) {
            int height = bitmap.getHeight() / 3;
            int i = height / 2;
            uvf<Bitmap> o = uvf.o(hta0Var != null ? hta0Var.a(Bitmap.createBitmap(bitmap, ((bitmap.getWidth() / 2) - (bitmap.getHeight() / 2)) + i, i, bitmap.getHeight() - height, bitmap.getHeight() - height)) : null);
            if (o != null) {
                return o;
            }
        }
        return uvf.o(hta0Var != null ? hta0Var.a(Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888)) : null);
    }

    @Override // xsna.ktc0
    public final String getName() {
        return "ScalePostProcessor";
    }
}
