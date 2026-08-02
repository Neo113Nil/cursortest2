package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5183t2 extends AbstractC4733bh {
    public final Ho b;
    public final C4891hk c;

    public C5183t2(@NonNull C4927j5 c4927j5) {
        this(c4927j5, c4927j5.u(), C4891hk.c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        C4927j5 c4927j5 = this.a;
        if (!this.b.c() && !this.b.d()) {
            if (((C5224uh) c4927j5.k.a()).e) {
                this.c.b();
            }
            Y8 y8 = this.a.l;
            if (y8.c == null) {
                y8.a();
            }
            C4699a9 c4699a9 = y8.c;
            c4699a9.getClass();
            c4699a9.b = new HashSet();
            c4699a9.d = 0;
            C4699a9 c4699a92 = y8.c;
            c4699a92.a = true;
            C4777d9 c4777d9 = y8.b;
            IBinaryDataHelper iBinaryDataHelper = c4777d9.c;
            C4751c9 c4751c9 = c4777d9.b;
            c4777d9.a.getClass();
            iBinaryDataHelper.insert("event_hashes", c4751c9.toByteArray((C4751c9) C4725b9.a(c4699a92)));
        }
        return false;
    }

    public C5183t2(C4927j5 c4927j5, Ho ho, C4891hk c4891hk) {
        super(c4927j5);
        this.b = ho;
        this.c = c4891hk;
    }
}
