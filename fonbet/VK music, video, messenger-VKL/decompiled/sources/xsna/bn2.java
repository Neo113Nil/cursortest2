package xsna;

import android.graphics.Bitmap;
import java.io.Closeable;

/* compiled from: AnimationBitmapFrame.kt */
/* loaded from: classes12.dex */
public final class bn2 implements Closeable {
    public final int b;
    public final uvf<Bitmap> c;

    public bn2(int i, uvf<Bitmap> uvfVar) {
        this.b = i;
        this.c = uvfVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
