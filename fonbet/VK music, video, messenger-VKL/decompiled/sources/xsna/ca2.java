package xsna;

import android.media.Image;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import xsna.alw;

/* compiled from: AndroidImageProxy.java */
/* loaded from: classes11.dex */
public final class ca2 implements alw {
    public final Image b;
    public final a[] c;
    public final nm5 d;

    /* compiled from: AndroidImageProxy.java */
    public static final class a implements alw.a {
        public final Image.Plane a;

        public a(Image.Plane plane) {
            this.a = plane;
        }

        @NonNull
        public final synchronized ByteBuffer a() {
            return this.a.getBuffer();
        }

        public final synchronized int b() {
            return this.a.getRowStride();
        }
    }

    public ca2(Image image) {
        this.b = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.c = new a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.c[i] = new a(planes[i]);
            }
        } else {
            this.c = new a[0];
        }
        this.d = new nm5(d0o0.b, image.getTimestamp(), 0);
    }

    @Override // xsna.alw
    @NonNull
    public final ojw B() {
        return this.d;
    }

    @Override // xsna.alw
    @NonNull
    public final synchronized alw.a[] M2() {
        return this.c;
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.close();
    }

    @Override // xsna.alw
    public final synchronized int getFormat() {
        return this.b.getFormat();
    }

    @Override // xsna.alw
    public final synchronized int getHeight() {
        return this.b.getHeight();
    }

    @Override // xsna.alw
    public final synchronized Image getImage() {
        return this.b;
    }

    @Override // xsna.alw
    public final synchronized int getWidth() {
        return this.b.getWidth();
    }
}
