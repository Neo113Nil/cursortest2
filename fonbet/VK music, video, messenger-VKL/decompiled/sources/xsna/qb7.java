package xsna;

import android.graphics.Bitmap;

/* compiled from: BitmapCounter.java */
/* loaded from: classes12.dex */
public final class qb7 {
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final a e;

    /* compiled from: BitmapCounter.java */
    public class a implements zag0<Bitmap> {
        public a() {
        }

        @Override // xsna.zag0
        public final void a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            try {
                qb7.this.a(bitmap2);
            } finally {
                bitmap2.recycle();
            }
        }
    }

    public qb7(int i, int i2) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
        this.e = new a();
    }

    public final synchronized void a(Bitmap bitmap) {
        int d = id7.d(bitmap);
        sex0.b("No bitmaps registered.", this.a > 0);
        long j = d;
        sex0.c(j <= this.b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(d), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public final synchronized int b() {
        return this.a;
    }

    public final synchronized int c() {
        return this.c;
    }

    public final synchronized int d() {
        return this.d;
    }

    public final a e() {
        return this.e;
    }

    public final synchronized long f() {
        return this.b;
    }

    public final synchronized boolean g(Bitmap bitmap) {
        int d = id7.d(bitmap);
        int i = this.a;
        if (i < this.c) {
            long j = this.b + d;
            if (j <= this.d) {
                this.a = i + 1;
                this.b = j;
                return true;
            }
        }
        return false;
    }
}
