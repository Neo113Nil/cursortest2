package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4890hj extends AbstractC4733bh {
    public C4890hj(C4927j5 c4927j5) {
        super(c4927j5);
        c4927j5.b().a();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(C4722b6 c4722b6) {
        Object remove;
        for (Map.Entry entry : c4722b6.p.entrySet()) {
            Tk tk = this.a.u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                tk.getClass();
                if (bArr.length != 0) {
                    remove = tk.b.put(str, bArr);
                    Xk xk = tk.a;
                    xk.d.insert(xk.a, xk.c.toByteArray((Wk) xk.b.fromModel(tk.b)));
                }
            }
            remove = tk.b.remove(str);
            Xk xk2 = tk.a;
            xk2.d.insert(xk2.a, xk2.c.toByteArray((Wk) xk2.b.fromModel(tk.b)));
        }
        return true;
    }
}
