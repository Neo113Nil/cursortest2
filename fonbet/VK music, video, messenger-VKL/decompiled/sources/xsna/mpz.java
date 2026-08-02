package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import xsna.zjw;

/* compiled from: LoadImageController.kt */
/* loaded from: classes8.dex */
public final class mpz {
    public gq9 a;

    /* compiled from: LoadImageController.kt */
    public static final class a implements zjw.a {
        public final /* synthetic */ ImageView a;

        public a(ImageView imageView) {
            this.a = imageView;
        }

        @Override // xsna.zjw.a
        public final void a(Bitmap bitmap) {
            this.a.setImageBitmap(bitmap);
        }

        @Override // xsna.zjw.a
        public final void onError() {
            this.a.setImageBitmap(null);
        }
    }

    public final void a(ImageView imageView, zjw zjwVar, String str) {
        gq9 gq9Var = this.a;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        if (str == null || drm0.N(str) || zjwVar == null) {
            imageView.setImageBitmap(null);
        } else {
            this.a = zjwVar.a(Uri.parse(str), new a(imageView), new ih7[0]);
        }
    }
}
