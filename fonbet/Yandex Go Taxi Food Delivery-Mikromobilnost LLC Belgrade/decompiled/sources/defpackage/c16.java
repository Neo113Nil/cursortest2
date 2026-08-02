package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public class c16 implements b16 {
    @Override // defpackage.b16
    public final void a(int i) {
    }

    @Override // defpackage.b16
    public final void b(float f) {
    }

    @Override // defpackage.b16
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.b16
    public final Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.b16
    public final void e() {
    }

    @Override // defpackage.b16
    public final Bitmap f(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
