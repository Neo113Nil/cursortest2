package xsna;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: AnimatedImageDecoder.java */
/* loaded from: classes12.dex */
public final class rk2 {
    public final ArrayList a;
    public final cl3 b;

    /* compiled from: AnimatedImageDecoder.java */
    public static final class a implements hag0<Drawable> {
        public final AnimatedImageDrawable b;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.b = animatedImageDrawable;
        }

        @Override // xsna.hag0
        public final void a() {
            AnimatedImageDrawable animatedImageDrawable = this.b;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        @Override // xsna.hag0
        @NonNull
        public final Class<Drawable> b() {
            return Drawable.class;
        }

        @Override // xsna.hag0
        @NonNull
        public final Drawable get() {
            return this.b;
        }

        @Override // xsna.hag0
        public final int getSize() {
            AnimatedImageDrawable animatedImageDrawable = this.b;
            return s2r0.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    public static final class b implements mag0<ByteBuffer, Drawable> {
        public final rk2 a;

        public b(rk2 rk2Var) {
            this.a = rk2Var;
        }

        @Override // xsna.mag0
        public final hag0<Drawable> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull au80 au80Var) throws IOException {
            return rk2.a(ImageDecoder.createSource(byteBuffer), i, i2, au80Var);
        }

        @Override // xsna.mag0
        public final boolean b(@NonNull ByteBuffer byteBuffer, @NonNull au80 au80Var) throws IOException {
            ImageHeaderParser.ImageType c = com.bumptech.glide.load.a.c(this.a.a, byteBuffer);
            if (c != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && c == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    public static final class c implements mag0<InputStream, Drawable> {
        public final rk2 a;

        public c(rk2 rk2Var) {
            this.a = rk2Var;
        }

        @Override // xsna.mag0
        public final hag0<Drawable> a(@NonNull InputStream inputStream, int i, int i2, @NonNull au80 au80Var) throws IOException {
            return rk2.a(ImageDecoder.createSource(du8.b(inputStream)), i, i2, au80Var);
        }

        @Override // xsna.mag0
        public final boolean b(@NonNull InputStream inputStream, @NonNull au80 au80Var) throws IOException {
            rk2 rk2Var = this.a;
            ImageHeaderParser.ImageType b = com.bumptech.glide.load.a.b(rk2Var.a, inputStream, rk2Var.b);
            if (b != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && b == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    public rk2(ArrayList arrayList, cl3 cl3Var) {
        this.a = arrayList;
        this.b = cl3Var;
    }

    public static a a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull au80 au80Var) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new tjl(i, i2, au80Var));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }
}
