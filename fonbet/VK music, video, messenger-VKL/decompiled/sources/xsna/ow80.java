package xsna;

import xsna.hu80;

/* compiled from: Pingable.kt */
/* loaded from: classes6.dex */
public abstract class ow80<T extends hu80> implements doa0<T> {
    public final Object a = new Object();
    public int b;
    public T c;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r4.b < 10) goto L16;
     */
    @Override // xsna.doa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            T t = this.c;
            z = true;
            if (t != null) {
                if (!t.isReady()) {
                }
                z = false;
            }
        }
        return z;
    }

    @Override // xsna.doa0
    public final hu80 b() {
        T t;
        synchronized (this.a) {
            t = this.c;
        }
        return t;
    }
}
