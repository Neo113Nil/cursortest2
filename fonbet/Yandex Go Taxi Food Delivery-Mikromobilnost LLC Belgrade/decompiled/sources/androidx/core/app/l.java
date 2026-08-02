package androidx.core.app;

import defpackage.b64;
import defpackage.xfo;

/* loaded from: classes.dex */
public abstract class l {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else {
            if (this.b == i) {
                return;
            }
            xfo.k(b64.t(i, "Given job ID ", " is different than previous "), this.b);
        }
    }
}
