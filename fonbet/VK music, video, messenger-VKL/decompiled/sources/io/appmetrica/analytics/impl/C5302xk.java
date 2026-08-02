package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5302xk extends Vc {
    public final Go a;

    public C5302xk() {
        this(C5342za.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Vc
    public final void a(int i) {
        Go go = this.a;
        synchronized (go) {
            Io io2 = go.a;
            io2.a(io2.a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.Vc
    public final int b() {
        int optInt;
        Go go = this.a;
        synchronized (go) {
            optInt = go.a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Vc
    public final SparseArray<Uc> c() {
        SparseArray<Uc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C5327yk(this.a));
        sparseArray.put(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, new C5352zk());
        sparseArray.put(116, new Ck());
        return sparseArray;
    }

    public C5302xk(Go go) {
        this.a = go;
    }
}
