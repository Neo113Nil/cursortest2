package xsna;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes12.dex */
public final class t3q0 implements mag0<Bitmap, Bitmap> {
    @Override // xsna.mag0
    public final hag0<Bitmap> a(@NonNull Bitmap bitmap, int i, int i2, @NonNull au80 au80Var) throws IOException {
        return new a(bitmap);
    }

    @Override // xsna.mag0
    public final /* bridge */ /* synthetic */ boolean b(@NonNull Bitmap bitmap, @NonNull au80 au80Var) throws IOException {
        return true;
    }

    /* compiled from: UnitBitmapDecoder.java */
    public static final class a implements hag0<Bitmap> {
        public final Bitmap b;

        public a(@NonNull Bitmap bitmap) {
            this.b = bitmap;
        }

        @Override // xsna.hag0
        @NonNull
        public final Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // xsna.hag0
        @NonNull
        public final Bitmap get() {
            return this.b;
        }

        @Override // xsna.hag0
        public final int getSize() {
            return s2r0.c(this.b);
        }

        @Override // xsna.hag0
        public final void a() {
        }
    }
}
