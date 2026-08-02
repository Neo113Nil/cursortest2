package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class oyj {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final ArrayDeque d = new ArrayDeque();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0009, B:8:0x000b, B:10:0x0011, B:12:0x0015, B:17:0x0020, B:20:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        ArrayDeque arrayDeque = this.d;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!arrayDeque.isEmpty()) {
                if (!this.b && this.a) {
                    z = false;
                    if (z) {
                        break;
                    }
                    Runnable runnable = (Runnable) arrayDeque.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                z = true;
                if (z) {
                }
            }
        } finally {
            this.c = false;
        }
    }
}
