package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Ah extends AbstractC4733bh {
    public Ah(C4927j5 c4927j5) {
        super(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        ((C5262w5) this.a.p).e();
        C4737bl c4737bl = this.a.j;
        synchronized (c4737bl) {
            try {
                Nk b = c4737bl.b(c4722b6);
                if (b.g) {
                    b.g = false;
                    C4814el c4814el = b.b;
                    c4814el.a(C4814el.i, Boolean.FALSE);
                    c4814el.b();
                }
                if (c4737bl.g != 1) {
                    c4737bl.b(c4737bl.f, c4722b6);
                }
                c4737bl.g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
