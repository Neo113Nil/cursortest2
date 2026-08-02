package xsna;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes12.dex */
public class uc7 implements tc7 {
    @Override // xsna.tc7
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // xsna.tc7
    @NonNull
    public final Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // xsna.tc7
    @NonNull
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // xsna.tc7
    public final void a() {
    }

    @Override // xsna.tc7
    public final void b(int i) {
    }
}
