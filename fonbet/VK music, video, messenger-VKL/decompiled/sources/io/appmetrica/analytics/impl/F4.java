package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* loaded from: classes8.dex */
public abstract class F4 extends Ld {
    public final Object f;

    public F4(int i, String str, Object obj, Co co, V2 v2) {
        super(i, str, co, v2);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ld, io.appmetrica.analytics.impl.InterfaceC5076oo
    public final void a(@NonNull C5050no c5050no) {
        if (f()) {
            V2 v2 = this.d;
            int i = this.b;
            C5102po a = v2.a(c5050no, (C5102po) ((HashMap) c5050no.a.get(i)).get(this.a), this);
            if (a != null) {
                a(a);
            }
        }
    }

    public abstract void a(@NonNull C5102po c5102po);

    @NonNull
    public final Object g() {
        return this.f;
    }
}
