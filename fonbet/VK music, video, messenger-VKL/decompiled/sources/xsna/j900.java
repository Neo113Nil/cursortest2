package xsna;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes12.dex */
public final class j900 implements tc7 {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final qxj0 a;
    public final Set<Bitmap.Config> b;
    public final a c;
    public final long d;
    public long e;

    /* compiled from: LruBitmapPool.java */
    public static final class a {
    }

    public j900(long j) {
        qxj0 qxj0Var = new qxj0();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = qxj0Var;
        this.b = unmodifiableSet;
        this.c = new a();
    }

    @Override // xsna.tc7
    public final void a() {
        g(0L);
    }

    @Override // xsna.tc7
    @SuppressLint({"InlinedApi"})
    public final void b(int i) {
        if (i >= 40 || i >= 20) {
            a();
        } else if (i >= 20 || i == 15) {
            g(this.d / 2);
        }
    }

    @Override // xsna.tc7
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.a.getClass();
                if (s2r0.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int c = s2r0.c(bitmap);
                    this.a.e(bitmap);
                    this.c.getClass();
                    this.e += c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        qxj0.c(s2r0.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.a);
                    }
                    g(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                qxj0.c(s2r0.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.tc7
    @NonNull
    public final Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 != null) {
            return f2;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // xsna.tc7
    @NonNull
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 != null) {
            f2.eraseColor(0);
            return f2;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Nullable
    public final synchronized Bitmap f(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            b = this.a.b(i, i2, config != null ? config : f);
            if (b != null) {
                long j = this.e;
                this.a.getClass();
                this.e = j - s2r0.c(b);
                this.c.getClass();
                b.setHasAlpha(true);
                b.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                qxj0.c(s2r0.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                qxj0.c(s2r0.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized void g(long j) {
        while (this.e > j) {
            qxj0 qxj0Var = this.a;
            Bitmap c = qxj0Var.b.c();
            if (c != null) {
                qxj0Var.a(c, Integer.valueOf(s2r0.c(c)));
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.a);
                }
                this.e = 0L;
                return;
            }
            this.c.getClass();
            long j2 = this.e;
            this.a.getClass();
            this.e = j2 - s2r0.c(c);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                qxj0.c(s2r0.c(c), c.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
            c.recycle();
        }
    }
}
