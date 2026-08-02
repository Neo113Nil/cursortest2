package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class R2 {
    public final Pf a;
    public final Qa b;

    public R2(Pf pf, Qa qa) {
        this.a = pf;
        this.b = qa;
    }

    public final boolean a(@NonNull C4722b6 c4722b6, @NonNull Q2 q2) {
        Iterator it = ((C4880h9) this.a.a(c4722b6.d)).a.iterator();
        while (it.hasNext()) {
            if (q2.a(it.next(), c4722b6)) {
                return true;
            }
        }
        return false;
    }

    public final Pf b() {
        return this.a;
    }

    public final Qa a() {
        return this.b;
    }
}
