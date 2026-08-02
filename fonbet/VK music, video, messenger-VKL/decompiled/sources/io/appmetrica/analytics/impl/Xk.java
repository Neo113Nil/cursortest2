package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Xk {
    public final String a;
    public final Sk b;
    public final Wk c;
    public final IBinaryDataHelper d;

    public Xk(Context context, C4747c5 c4747c5) {
        c4747c5.a();
        this.a = "session_extras";
        this.b = new Sk();
        this.c = new Wk();
        this.d = C5342za.k().B().a(context, c4747c5);
    }

    public final Map a() {
        try {
            byte[] bArr = this.d.get(this.a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.b.toModel(this.c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Sk sk = this.b;
        this.c.getClass();
        return sk.toModel(new Uk());
    }
}
