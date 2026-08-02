package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.Closeable;

/* loaded from: classes11.dex */
public final class mk20 implements Closeable {
    public final gr81 a;
    public final int b;
    public final int c;
    public int w;

    public mk20(gr81 gr81Var, Rect rect, int i, int i2) {
        this.a = gr81Var;
        new Rect().set(rect);
        this.b = i;
        this.c = i2;
        this.w = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            ((Bitmap) this.a.b).recycle();
        }
    }
}
