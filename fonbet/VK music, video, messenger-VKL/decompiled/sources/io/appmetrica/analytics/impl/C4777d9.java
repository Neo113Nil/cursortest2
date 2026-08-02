package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4777d9 {
    public final C4725b9 a;
    public final C4751c9 b;
    public final IBinaryDataHelper c;

    public C4777d9(Context context, C4747c5 c4747c5) {
        this(new C4751c9(), new C4725b9(), C5342za.k().B().a(context, c4747c5));
    }

    public C4777d9(C4751c9 c4751c9, C4725b9 c4725b9, IBinaryDataHelper iBinaryDataHelper) {
        this.b = c4751c9;
        this.a = c4725b9;
        this.c = iBinaryDataHelper;
    }
}
