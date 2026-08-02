package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes8.dex */
public final class Y8 {
    public final int a;
    public final C4777d9 b;
    public C4699a9 c;

    public Y8(C4777d9 c4777d9, int i) {
        this.a = i;
        this.b = c4777d9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C4699a9 c4699a9;
        int i;
        int i2;
        byte[] bArr;
        C4777d9 c4777d9 = this.b;
        c4777d9.getClass();
        try {
            bArr = c4777d9.c.get("event_hashes");
        } catch (Throwable unused) {
            C4725b9 c4725b9 = c4777d9.a;
            c4777d9.b.getClass();
            G9 g9 = new G9();
            c4725b9.getClass();
            c4699a9 = new C4699a9(g9.a, g9.b, g9.c, CollectionUtils.hashSetFromIntArray(g9.d));
        }
        if (bArr != null && bArr.length != 0) {
            C4725b9 c4725b92 = c4777d9.a;
            G9 state = c4777d9.b.toState(bArr);
            c4725b92.getClass();
            c4699a9 = new C4699a9(state.a, state.b, state.c, CollectionUtils.hashSetFromIntArray(state.d));
            this.c = c4699a9;
            i = c4699a9.c;
            i2 = this.a;
            if (i == i2) {
                c4699a9.c = i2;
                c4699a9.d = 0;
                C4777d9 c4777d92 = this.b;
                IBinaryDataHelper iBinaryDataHelper = c4777d92.c;
                C4751c9 c4751c9 = c4777d92.b;
                c4777d92.a.getClass();
                iBinaryDataHelper.insert("event_hashes", c4751c9.toByteArray((C4751c9) C4725b9.a(c4699a9)));
                return;
            }
            return;
        }
        C4725b9 c4725b93 = c4777d9.a;
        c4777d9.b.getClass();
        G9 g92 = new G9();
        c4725b93.getClass();
        c4699a9 = new C4699a9(g92.a, g92.b, g92.c, CollectionUtils.hashSetFromIntArray(g92.d));
        this.c = c4699a9;
        i = c4699a9.c;
        i2 = this.a;
        if (i == i2) {
        }
    }
}
