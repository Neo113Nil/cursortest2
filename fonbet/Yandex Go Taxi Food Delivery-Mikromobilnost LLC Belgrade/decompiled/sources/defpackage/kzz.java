package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class kzz implements b16 {
    public static final Bitmap.Config g = Bitmap.Config.ARGB_8888;
    public final hjs0 a;
    public final Set b;
    public final long c;
    public final jzz d;
    public long e;
    public long f;

    public kzz(long j) {
        hjs0 hjs0Var = new hjs0();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.c = j;
        this.e = j;
        this.a = hjs0Var;
        this.b = unmodifiableSet;
        this.d = new jzz();
    }

    @Override // defpackage.b16
    public final void a(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            e();
        } else if (i >= 20 || i == 15) {
            h(this.e / 2);
        }
    }

    @Override // defpackage.b16
    public final synchronized void b(float f) {
        long round = Math.round(this.c * f);
        this.e = round;
        h(round);
    }

    @Override // defpackage.b16
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
                if (pw21.f(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int f = pw21.f(bitmap);
                    this.a.e(bitmap);
                    this.d.getClass();
                    this.f += f;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        hjs0.c(pw21.f(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.a);
                    }
                    h(this.e);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                hjs0.c(pw21.f(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.b16
    public final Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap g2 = g(i, i2, config);
        if (g2 != null) {
            return g2;
        }
        if (config == null) {
            config = g;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.b16
    public final void e() {
        Log.isLoggable("LruBitmapPool", 3);
        h(0L);
    }

    @Override // defpackage.b16
    public final Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap g2 = g(i, i2, config);
        if (g2 != null) {
            g2.eraseColor(0);
            return g2;
        }
        if (config == null) {
            config = g;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            b = this.a.b(i, i2, config != null ? config : g);
            if (b != null) {
                long j = this.f;
                this.a.getClass();
                this.f = j - pw21.f(b);
                this.d.getClass();
                b.setHasAlpha(true);
                b.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                hjs0.c(pw21.g(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                hjs0.c(pw21.g(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized void h(long j) {
        while (this.f > j) {
            hjs0 hjs0Var = this.a;
            Bitmap bitmap = (Bitmap) hjs0Var.b.o();
            if (bitmap != null) {
                hjs0Var.a(bitmap, Integer.valueOf(pw21.f(bitmap)));
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.a);
                }
                this.f = 0L;
                return;
            }
            this.d.getClass();
            long j2 = this.f;
            this.a.getClass();
            this.f = j2 - pw21.f(bitmap);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                hjs0.c(pw21.f(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
            bitmap.recycle();
        }
    }
}
