package defpackage;

import android.media.Image;

/* loaded from: classes10.dex */
public final class o0r0 implements rdv {
    public final Image b;
    public final Object c = new Object();
    public int a = 1;

    public o0r0(Image image) {
        this.b = image;
    }

    public final boolean a() {
        synchronized (this.c) {
            try {
                int i = this.a;
                if (i <= 0) {
                    return false;
                }
                int i2 = i - 1;
                this.a = i2;
                if (i2 <= 0) {
                    this.b.close();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
